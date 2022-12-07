package org.fautapo.web.administrarProgramasEspecializados.matriculacionEstudiantesNuevos;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.io.ByteArrayOutputStream;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Tramites;
import org.fautapo.domain.Personas;
import org.fautapo.domain.Estudiantes;
import org.fautapo.domain.Instituciones;
import org.fautapo.domain.Abm;
import org.fautapo.domain.Perfiles;
import org.fautapo.domain.Programas;

import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-04-05
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-04-05
 */
public class RegistrarTiposDocumentosPersona implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> modelo = new HashMap<>();
        String viewError = "Error";
        String modelName = "mensaje";
        String parameterProrroga = "prorroga";

        //Sacamos los datos de la session
        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
        if (cliente == null) {
            return new ModelAndView("Aviso", modelName, "Su sesion ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");
        }
        String sNombres = cliente.getNombres();
        modelo.put("usuario", sNombres);
        String sGestion = request.getParameter("gestion");
        String sPeriodo = request.getParameter("periodo");
        Tramites datosTramite = null;
        //Para wayka
        String sIdProceso = request.getParameter("id_proceso");
        String sTitulo = request.getParameter("titulo");
        String sIdTramite = cliente.getString(request, "id_tramite");
        modelo.put("id_tramite", sIdTramite);
        modelo.put("titulo", sTitulo);
        modelo.put("id_proceso", sIdProceso);
        modelo.put("gestion", sGestion);
        modelo.put("periodo", sPeriodo);

        boolean bProrroga = false;
        String sIdEstudiante = request.getParameter("id_estudiante");
        String[] sIdPerfilProcesoP = request.getParameterValues("id_perfil_proceso_p");
        String sIdPerfilProceso = "";
        int iResultadoCom = 0;

        //Sacamos el identificador de la prorroga de parametros
        Abm prorroga = new Abm();
        prorroga.setCampo("id_perfil_prorroga");
        prorroga.setCodigo("mi");
        String sIdProrroga = this.mi.getDibBuscarParametro(prorroga);
        if (("".equals(sIdProrroga)) || (sIdProrroga == null)) {
            return new ModelAndView(viewError, modelName, "El id_perfil_prorroga no existe registrado en _parametros");
        }

        //Recuperando los datos de id_perfil_proceso
        if ((sIdTramite == null) || ("".equals(sIdTramite))) {
            return new ModelAndView(viewError, modelName, "El tramite no ha pasado");
        }

        if (Integer.parseInt(sIdEstudiante) > 0) {
            //Busco datos del Estudiante
            Estudiantes datosEst = new Estudiantes();
            datosEst.setId_estudiante(Integer.parseInt(sIdEstudiante));
            datosEst = this.mi.getEstBuscarEstudiantePrs(datosEst);
            modelo.put("datosEst", datosEst);
            //Buscar Tipo clasificacion estudiante
            Estudiantes datosClas = new Estudiantes();
            datosClas.setId_estudiante(datosEst.getId_estudiante());
            datosClas = this.mi.getBuscarTipoClasificacionEstudiante(datosClas);
            modelo.put("datosClas", datosClas);

            Personas datosP = new Personas();
            datosP.setId_persona(datosEst.getId_persona());
            datosP.setUlt_usuario(cliente.getId_usuario());
            datosP.setId_tipo_clasificacion(datosClas.getId_tipo_clasificacion());
            //Listamos los prs_documentos clasificacion
            List<Personas> lPrsDocumentosClasificacion = this.mi.getListarPrsDocumentosClasificacion(datosP);
            modelo.put("lPrsDocumentosClasificacion", lPrsDocumentosClasificacion);

            //Registramos los tipos documentos
            int iContador = 0;
            for (int j = 0; j < lPrsDocumentosClasificacion.size(); j++) {
                Personas documento = (Personas) lPrsDocumentosClasificacion.get(j);
                String sIdTipoDocumentoSac = Integer.toString(documento.getId_tipo_documento());
                datosP.setId_tipo_documento(Integer.parseInt(sIdTipoDocumentoSac));
                String sPresento = request.getParameter("presento" + sIdTipoDocumentoSac);
                if("true".equals(sPresento)) {
                    datosP.setPresento(true);
                } else {
                    datosP.setPresento(false);
                }
                datosP.setNumero(request.getParameter("numero" + sIdTipoDocumentoSac));
                datosP.setObservacion(request.getParameter("observacion" + sIdTipoDocumentoSac));
                this.mi.setRegistrarPrsDocumentos(datosP);
                //Registramos compromisos 
                String sProrrogaSac = request.getParameter(parameterProrroga + sIdTipoDocumentoSac);
                if (("true".equals(sProrrogaSac)) && (sProrrogaSac != null)) {
                    String sIdTipoCompromisoSac = request.getParameter("id_tipo_compromiso_" + sIdTipoDocumentoSac);
                    if ("".equals(sIdTipoCompromisoSac)) {
                        return new ModelAndView(viewError, modelName, "No selecciono el tipo de prorroga.");
                    }
                    datosP.setId_tipo_compromiso(Integer.parseInt(sIdTipoCompromisoSac));
                    datosP.setGestion(Integer.parseInt(sGestion));
                    datosP.setPeriodo(Integer.parseInt(sPeriodo));
                    datosP.setObservacion(request.getParameter("observacionCompromiso" + sIdTipoDocumentoSac));
                    datosP.setFec_vencimiento(request.getParameter("fec_vencimiento" + sIdTipoDocumentoSac));
                    iResultadoCom = this.mi.setRegistrarPrsCompromisos(datosP);
                    if (iResultadoCom == 1) {
                        bProrroga = true;
                        iContador = iContador + 1;
                    }
                }
            }

            if (sIdPerfilProcesoP != null) {
                //RECUPERAMOS id_proceso_perfil
                for (int i = 0; i < sIdPerfilProcesoP.length; i++) {
                    int iCantidad = 1;
                    //Buscar id_perfil en perfil_procesos
                    Perfiles datosPerfilProceso = new Perfiles();
                    datosPerfilProceso.setId_perfil_proceso(sIdPerfilProcesoP[i]);
                    datosPerfilProceso = this.mi.getTrnBuscarPerfilProceso(datosPerfilProceso);
                    if (datosPerfilProceso.getId_perfil() == Integer.parseInt(sIdProrroga)) {
                        iCantidad = iContador;
                    }
                    if (i == 0) {
                        sIdPerfilProceso += sIdPerfilProcesoP[i] + "~" + iCantidad;
                    } else {
                        sIdPerfilProceso += ":" + sIdPerfilProcesoP[i] + "~" + iCantidad;
                    }
                }
                //Registramos los valores en wayka
                //Datos del id_perfil_proceso
                datosTramite = new Tramites();
                datosTramite.setId_tramite(Integer.parseInt(sIdTramite));
                datosTramite.setEtiqueta("id_perfil_proceso");
                datosTramite.setValor(sIdPerfilProceso);
                datosTramite.setUlt_usuario(cliente.getId_usuario());
                this.mi.setRegistrarValorLimbo2(datosTramite);
            } else {
                return new ModelAndView(viewError, modelName, "Seleccione datos para realizar el cobro respectivo en cajas");
            }
            //Fin Recupera

            //Sacamos los datos del tramite
            datosTramite = new Tramites();
            datosTramite.setId_tramite(Integer.parseInt(sIdTramite));
            datosTramite.setUlt_usuario(cliente.getId_usuario());
            this.mi.setRegistrarTrPrFrLogLimbo(datosTramite);

            //Sacamos los datos de la institucion
            Instituciones datosInstitucion = new Instituciones();
            datosInstitucion.setId_institucion(1); //--------------------------ESTATICO
            datosInstitucion = this.mi.getBuscarInstitucion(datosInstitucion);
            if (datosInstitucion != null) {
                modelo.put("datosInstitucion", datosInstitucion);
            }

            //Sacamos el formato de la fecha
            Abm formatoFecha = new Abm();
            formatoFecha.setCampo("formato_fecha");
            formatoFecha.setCodigo("dibrap");
            modelo.put("formatoFecha", this.mi.getDibBuscarParametro(formatoFecha));
            //Sacamos el formato de la hora
            formatoFecha.setCampo("formato_hora");
            formatoFecha.setCodigo("dibrap");
            modelo.put("formatoHora", this.mi.getDibBuscarParametro(formatoFecha));

            Tramites tramite = new Tramites();
            tramite.setId_tramite(Integer.parseInt(sIdTramite));
            //Sacando la gestion de wayka
            tramite.setEtiqueta("gestion_matricula");
            tramite = (Tramites) this.mi.getBuscarCampoGw(tramite);
            int iGestion = Integer.parseInt(tramite.getValores());
            //Sacando el periodo de wayka  
            tramite.setEtiqueta("periodo_matricula");
            tramite = (Tramites) this.mi.getBuscarCampoGw(tramite);
            int iPeriodo = Integer.parseInt(tramite.getValores());
            String sMensaje = "Se realizo el registro";
            modelo.put(modelName, sMensaje);
            modelo.put(parameterProrroga, Boolean.toString(bProrroga));
            modelo.put("contador", Integer.toString(iContador));
            modelo.put("gestion_matricula", Integer.toString(iGestion));
            modelo.put("periodo_matricula", Integer.toString(iPeriodo));

            //Listamos los tipos de Admision que existen
            List<Programas> lTiposAdmisiones = this.mi.getListarTiposAdmisiones();
            modelo.put("lTiposAdmisiones", lTiposAdmisiones);
            
            QRCodeWriter barcodeWriter = new QRCodeWriter();
            SimpleDateFormat fecha = new SimpleDateFormat("ddMMyyyy");
            BitMatrix bitMatrix = barcodeWriter.encode(datosEst.getId_estudiante()+ "|" + fecha.format(datosEst.getFec_inscripcion()) + "|" + datosEst.getSede_desconcentrada(), BarcodeFormat.QR_CODE, 200, 200);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            MatrixToImageWriter.writeToStream(bitMatrix, "png", bos);
            String image = Base64.getEncoder().encodeToString(bos.toByteArray());
            modelo.put("qr", image);
            
            return new ModelAndView("administrarProgramasEspecializados/matriculacionEstudiantesNuevos/SalidaImpresionEstudiante", modelo);
        }

        return new ModelAndView("administrarProgramasEspecializados/matriculacionEstudiantesNuevos/EntradaBuscarPostulantes", modelo);

    }
}
