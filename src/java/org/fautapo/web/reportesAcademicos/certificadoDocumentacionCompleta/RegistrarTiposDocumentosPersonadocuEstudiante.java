package org.fautapo.web.reportesAcademicos.certificadoDocumentacionCompleta;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.io.ByteArrayOutputStream;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Personas;
import org.fautapo.domain.Estudiantes;
import org.fautapo.domain.Libretas;
import org.fautapo.domain.Instituciones;
import org.fautapo.domain.Abm;

import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-04-05
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-04-05
 */
public class RegistrarTiposDocumentosPersonadocuEstudiante implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> modelo = new HashMap<>();

        //Sacamos los datos de la session
        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
        if (cliente == null) {
            return new ModelAndView("Aviso", "mensaje", "Su sesion ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");
        }
        String sNombres = cliente.getNombres();
        modelo.put("usuario", sNombres);

        String sGestion = request.getParameter("gestion");
        String sPeriodo = request.getParameter("periodo");
        String sProrroga = request.getParameter("prorroga");
        String sId_persona = request.getParameter("id_persona");
        String sId_estudiante = request.getParameter("id_estudiante");
        String sId_tipo_documento_p[] = request.getParameterValues("id_tipo_documento_p");
        String sId_tipo_compromiso_p[] = request.getParameterValues("id_tipo_compromiso_p");
        int iResultadoDoc = 0;
        int iResultadoCom = 0;
        int iBand = 0;

        if (Integer.parseInt(sId_estudiante) > 0) {
            //Busco datos del Estudiante
            Estudiantes datosEst = new Estudiantes();
            datosEst.setId_estudiante(Integer.parseInt(sId_estudiante));
            datosEst.setIns_sede(cliente.getId_almacen());
            datosEst = this.mi.getEstBuscarEstudianteNombresSede(datosEst);

            if (datosEst == null) {
                return new ModelAndView("Aviso", "mensaje", "El estudiante no esta registrado en su Area y/o Sede, no puede realizar modificaciones");
            }
            modelo.put("datosEst", datosEst);

            //Buscar Tipo clasificacion persona
            Estudiantes datosClas = new Estudiantes();
            datosClas.setId_estudiante(Integer.parseInt(sId_estudiante));
            datosClas = this.mi.getBuscarTipoClasificacionEstudiante(datosClas);
            modelo.put("datosClas", datosClas);

            //Verificar Si Presento Todos Sus Documentos     
            int presento;
            //Desde aqui
            Estudiantes datosClas1 = new Estudiantes();
            datosClas1.setId_persona(datosEst.getId_persona());
            datosClas1.setId_tipo_clasificacion(datosClas.getId_tipo_clasificacion());
            presento = this.mi.getBuscarPrsDocumentacionCompletaDoc(datosClas1);

            if (presento == 0) {
                return new ModelAndView("Aviso", "mensaje", "El estudiante no tiene su documentacion Completa");
            }

            //BUSCAR GRADO ACADEMICO
            Libretas datosGrados = new Libretas();
            datosGrados.setId_programa(datosEst.getId_programa());
            datosGrados.setId_plan(datosEst.getId_plan());
            datosGrados = this.mi.getBuscarGradoAcademicoPrograma(datosGrados);
            modelo.put("datosGrados", datosGrados);

            Personas datosP = new Personas();
            datosP.setId_persona(datosEst.getId_persona());
            datosP.setUlt_usuario(cliente.getId_usuario());
            datosP.setId_tipo_clasificacion(datosClas.getId_tipo_clasificacion());
            //Listamos los prs_documentos clasificacion
            List lPrsDocumentosClasificacion = this.mi.getListarPrsDocumentosClasificacion(datosP);
            modelo.put("lPrsDocumentosClasificacion", lPrsDocumentosClasificacion);

            //Listar PrsDocumentos y Prs_compromisos
            Personas documento = new Personas();
            documento.setId_persona(datosEst.getId_persona());
            List lPrsCompromisosTodo = this.mi.getListarPrsCompromisosPersona(documento);
            modelo.put("lPrsCompromisosTodo", lPrsCompromisosTodo);

            //Aqui
            //Desde aqui
            Estudiantes datosClas3 = new Estudiantes();
            datosClas3.setId_estudiante(Integer.parseInt(sId_estudiante));
            datosClas3 = this.mi.getBuscarTipoClasificacionEstudiante(datosClas3);
            if (datosClas == null) {
                return new ModelAndView("Aviso", "mensaje", "El estudiante con R.U.: " + sId_estudiante + " no tiene registrado el tipo de clasificaci�n por lo que no ver su documentaci�n. actualice sus datos como estudiante.");
            }

            datosClas3.setId_persona(datosEst.getId_persona());

            List lPrsDocumentosTodo = this.mi.getListarPrsDocumentosClasificacion(datosClas3);
            modelo.put("lPrsDocumentosTodo", lPrsDocumentosTodo);

            //Listar el ultimo est_regularizacion
            Estudiantes lUltimoEstRegularizacion = this.mi.getMiBuscarUltimoEstRegularizacion(datosEst);
            modelo.put("lUltimoEstRegularizacion", lUltimoEstRegularizacion);

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

            QRCodeWriter barcodeWriter = new QRCodeWriter();
            BitMatrix bitMatrix = barcodeWriter.encode(datosEst.getId_estudiante() + "|" + datosEst.getDip() + "|" + datosEst.getId_programa(), BarcodeFormat.QR_CODE, 200, 200);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            MatrixToImageWriter.writeToStream(bitMatrix, "png", bos);
            String image = Base64.getEncoder().encodeToString(bos.toByteArray());
            modelo.put("qr", image);

            return new ModelAndView("reportesAcademicos/certificadoDocumentacionCompleta/SalidaImpresionEstudiante", modelo);
        } else {
            return new ModelAndView("Aviso", "mensaje", "No ingreso el R.U. del estudiante");
        }

    }
}
