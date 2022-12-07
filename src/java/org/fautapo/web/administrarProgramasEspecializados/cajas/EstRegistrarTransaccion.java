package org.fautapo.web.administrarProgramasEspecializados.cajas;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.io.ByteArrayOutputStream;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import java.util.ArrayList;
import java.util.Base64;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Estudiantes;
import org.fautapo.domain.Tramites;
import org.fautapo.domain.Perfiles;
import org.fautapo.domain.Abm;
import org.fautapo.domain.Literales;
import org.fautapo.domain.Instituciones;

import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-03-30
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-03-30
 */
public class EstRegistrarTransaccion implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
        if (cliente == null) {
            return new ModelAndView("Error", "mensaje", "Tu sesi�n termino. Por favor, ingresa nuevamente.");
        }
        Map<String, Object> modelo = new HashMap<>();

        int iResultado = 0;
        double iDescuento = 0;
        int iIdTipoDescuento = 0;
        int iGestion = 0;
        int iPeriodo = 0;
        int iCantidad = 0;
        int iIdTipoClasificacion = 0;
        String sIdPerfilProcesox = "";
        int iNroRecibo = 0;

        int iIdTramite = cliente.getInt(request, "id_tramite");
        int iIdProceso = cliente.getInt(request, "id_proceso");
        modelo.put("id_tramite", Integer.toString(iIdTramite));

        //INICIO - Verificamos que el tramite no haya sido atendido
        Tramites datosTramite = new Tramites();
        datosTramite.setId_tramite(iIdTramite);
        datosTramite = this.mi.getBuscarTramite(datosTramite);

        //Aqui es para sacar el Tramite	
        if (iIdProceso == 27) {
            modelo.put("datosTramite", datosTramite);
        }
        if ("L".equals(datosTramite.getId_estado())) {
            modelo.put("mensaje", "El tramite ya fue atendido");
            return new ModelAndView("administrarProgramasEspecializados/cajas/Error", modelo);
        }
        //FIN -Verificamos que el tramite no haya sido atendido

        //Sacamos el id_estudiante de los datos de wayka
        Tramites tramite = new Tramites();
        tramite.setId_tramite(iIdTramite);
        tramite.setEtiqueta("id_estudiante");
        tramite = this.mi.getBuscarCampoGw(tramite);
        int iIdEstudiante = Integer.parseInt(tramite.getValores());

        String sIdPerfilProceso = "";
        Perfiles perfil = new Perfiles();
        perfil.setId_proceso(iIdProceso);
        List<Perfiles> listaPerfiles = this.mi.getTrnMiListarPerfilesProceso(perfil);
        if (listaPerfiles.size() == 1) {
            perfil = listaPerfiles.get(0);
            sIdPerfilProceso = perfil.getId_perfil_proceso();
            //Buscamos en wayka si hay un campo cantidad
            try {
                tramite = new Tramites();
                tramite.setId_tramite(iIdTramite);
                tramite.setEtiqueta("cantidad");
                tramite = (Tramites) this.mi.getBuscarCampoGw(tramite);
                int iCantidadx = Integer.parseInt(tramite.getValores());
                sIdPerfilProceso = sIdPerfilProceso + "~" + iCantidadx;
            } catch (Exception e) {
            };
        } else {
            tramite = new Tramites();
            tramite.setId_tramite(iIdTramite);
            tramite.setEtiqueta("id_perfil_proceso");
            tramite = (Tramites) this.mi.getBuscarCampoGw(tramite);
            sIdPerfilProceso = tramite.getValores();
        }

        String[] sPerfilesProcesos = sIdPerfilProceso.split(":");
        try {
            tramite = new Tramites();
            tramite.setId_tramite(iIdTramite);
            tramite.setEtiqueta("descuento");
            tramite = (Tramites) this.mi.getBuscarCampoGw(tramite);
            iDescuento = Double.valueOf(tramite.getValores()).doubleValue();

            tramite = new Tramites();
            tramite.setId_tramite(iIdTramite);
            tramite.setEtiqueta("id_tipo_descuento");
            tramite = (Tramites) this.mi.getBuscarCampoGw(tramite);
            iIdTipoDescuento = Integer.parseInt(tramite.getValores());
            //Averiguamos el nombre del tipo de descuento
            Perfiles descuento = new Perfiles();
            descuento.setId_tipo_descuento(iIdTipoDescuento);
            modelo.put("descuento", this.mi.getTrnBuscarTipoDescuento(descuento));
        } catch (Exception e) {
            tramite = new Tramites();
            tramite.setId_tramite(iIdTramite);
        }
        //Sacamos los datos del estudiante
        Estudiantes estudiante = new Estudiantes();
        estudiante.setId_estudiante(iIdEstudiante);
        estudiante = this.mi.getEstBuscarEstudianteNombres(estudiante);
        modelo.put("estudiante", estudiante);

        //Sacamos la gestion y periodo
        try {
            Tramites tramite1 = new Tramites();
            tramite1.setId_tramite(iIdTramite);
            tramite1.setEtiqueta("gestion_matricula");
            tramite1 = (Tramites) this.mi.getBuscarCampoGw(tramite1);
            iGestion = Integer.parseInt(tramite1.getValores());

            tramite1 = new Tramites();
            tramite1.setId_tramite(iIdTramite);
            tramite1.setEtiqueta("periodo_matricula");
            tramite1 = (Tramites) this.mi.getBuscarCampoGw(tramite1);
            iPeriodo = Integer.parseInt(tramite1.getValores());
        } catch (Exception e) {
        }
        if (iGestion == 0 || iPeriodo == 0) {
            iGestion = cliente.getGestion();
            iPeriodo = cliente.getPeriodo();
        }
        modelo.put("gestion", Integer.toString(iGestion));
        modelo.put("periodo", Integer.toString(iPeriodo));

        tramite = (Tramites) this.mi.getBuscarTramite(tramite);

        Perfiles transaccion = new Perfiles();
        Perfiles trnDetalle = new Perfiles();
        String sTransacciones = "";
        for (int i = 0; i < sPerfilesProcesos.length; i++) {
            String sDatosPerfilProceso[] = sPerfilesProcesos[i].split("~");
            if (sDatosPerfilProceso.length == 1) {
                sIdPerfilProcesox = sPerfilesProcesos[i];
                iCantidad = 1;
            } else {
                sIdPerfilProcesox = sDatosPerfilProceso[0];
                iCantidad = Integer.parseInt(sDatosPerfilProceso[1]);
            }
            // tabla: transacciones
            transaccion.setId_perfil_proceso(sIdPerfilProcesox);
            transaccion = this.mi.getPrcBuscarPerfil(transaccion);
            transaccion.setId_estudiante(iIdEstudiante);
            transaccion.setId_persona(estudiante.getId_persona());
            transaccion.setId_programa(estudiante.getId_programa());
            transaccion.setId_tipo_descuento(iIdTipoDescuento);
            transaccion.setId_sede(cliente.getId_almacen());
            transaccion.setRemitente(tramite.getDe());
            transaccion.setCantidad(iCantidad);
            transaccion.setDeposito(0);
            transaccion.setGestion(iGestion);
            transaccion.setPeriodo(iPeriodo);
            transaccion.setUlt_usuario(cliente.getId_usuario());
            iResultado = this.mi.setPrsRegistrarTransaccion(transaccion);
            sTransacciones += ":" + iResultado;

            //tabla: trn_detalles
            transaccion.setDescuento(iDescuento);
            transaccion.setId_perfil_proceso(sPerfilesProcesos[i]);
            List<Perfiles> listaConceptos = this.mi.getEstListarConceptos(transaccion);
            if (iResultado > 0) {
                for (int j = 0; j < listaConceptos.size(); j++) {
                    Perfiles cajita = listaConceptos.get(j);
                    trnDetalle.setId_transaccion(iResultado);
                    trnDetalle.setId_perfil(transaccion.getId_perfil());
                    trnDetalle.setId_concepto(cajita.getId_concepto());
                    trnDetalle.setId_tipo_perfil(transaccion.getId_tipo_perfil());
                    trnDetalle.setId_tipo_clasificacion(cajita.getId_tipo_clasificacion());
                    iIdTipoClasificacion = cajita.getId_tipo_clasificacion();
                    trnDetalle.setCosto(cajita.getCosto());
                    trnDetalle.setCantidad(cajita.getCantidad());
                    trnDetalle.setDescuento(cajita.getDescuento());
                    trnDetalle.setUlt_usuario(cliente.getId_usuario());
                    int iDetalle = this.mi.setRegistrarTrnDetalle(trnDetalle);
                }
            }
        }

        transaccion.setProceso(sTransacciones.substring(1));
        List<Perfiles> lTransacciones = this.mi.getTrnListarTransacciones(transaccion);
        if (lTransacciones.size() > 0) {
            //Sacamos el numero de recibo
            Perfiles datosRecibo = new Perfiles();
            datosRecibo.setId_sede(cliente.getId_almacen());
            datosRecibo.setGestion(cliente.getGestion());
            iNroRecibo = this.mi.getTrnBuscarSiguienteNroRecibo(datosRecibo);
        }
        List<Perfiles> lTransacciones2 = new ArrayList<>();
        for (int i = 0; i < lTransacciones.size(); i++) {
            Perfiles auxiliar = (Perfiles) lTransacciones.get(i);
            auxiliar.setNro_recibo(iNroRecibo + "/" + cliente.getGestion());
            this.mi.setTrnActualizarNroRecibo(auxiliar);
            lTransacciones2.add(auxiliar);
        }
        modelo.put("lTransacciones", lTransacciones2);

        double total = 0;
        for (int i = 0; i < lTransacciones.size(); i++) {
            transaccion = (Perfiles) lTransacciones.get(i);
            total += transaccion.getPagado();
        }
        Literales literal = new Literales();
        modelo.put("literal", literal.convert(total));
        modelo.put("total", String.valueOf(total));

        transaccion.setId_perfil_proceso(sIdPerfilProceso);
        List<Perfiles> lPerfiles = this.mi.getTrnPrcListarPerfiles(transaccion);
        modelo.put("lPerfiles", lPerfiles);

        //Sacamos el listado de trn_detalles
        transaccion.setProceso(sTransacciones.substring(1));
        List<Perfiles> lDetalles = this.mi.getTrnListarTrnDetalles2(transaccion);
        modelo.put("lDetalles", lDetalles);

        //Sacamos el formato de la fecha
        Abm formatoFecha = new Abm();
        formatoFecha.setCampo("formato_fecha");
        formatoFecha.setCodigo("dibrap");
        modelo.put("formatoFecha", this.mi.getDibBuscarParametro(formatoFecha));

        //Sacamos el formato de la hora
        Abm formatoHora = new Abm();
        formatoHora.setCampo("formato_hora");
        formatoHora.setCodigo("dibrap");
        modelo.put("formatoHora", this.mi.getDibBuscarParametro(formatoHora));

        //Sacamos los datos de la institucion
        Instituciones datosInstitucion = new Instituciones();
        datosInstitucion.setId_institucion(1); //--------------------------ESTATICO
        datosInstitucion = this.mi.getBuscarInstitucion(datosInstitucion);
        if (datosInstitucion != null) {
            modelo.put("datosInstitucion", datosInstitucion);
        }

        Instituciones datosInstitucionSede = new Instituciones();
        datosInstitucionSede.setId_institucion(cliente.getId_almacen()); //--------------------------ESTATICO
        datosInstitucionSede = this.mi.getBuscarInstitucionSede(datosInstitucionSede);
        if (datosInstitucionSede != null) {
            modelo.put("datosInstitucionsede", datosInstitucionSede);
        }

        //---Guarda las Matriculas
        if (iIdEstudiante > 0) {
            if ((iIdProceso == 4) || (iIdProceso == 3) || (iIdProceso == 25)) {

                Estudiantes datoEst = new Estudiantes();
                datoEst.setId_estudiante(iIdEstudiante);
                datoEst.setGestion(iGestion);
                datoEst.setPeriodo(iPeriodo);

                datoEst.setUlt_usuario(cliente.getId_usuario());
                datoEst.setId_tipo_descuento(iIdTipoDescuento);
                datoEst.setTransaccion(iNroRecibo + "/" + cliente.getGestion());
                datoEst.setId_tipo_clasificacion(iIdTipoClasificacion);

                datoEst.setId_rol(cliente.getId_rol());
                int iIdMatriculaResultado = this.mi.setRegistrarMatriculaEstudiante(datoEst);

                if (iIdMatriculaResultado > 0) {
                    //Buscamos la matricula
                    datoEst.setId_matricula(iIdMatriculaResultado);
                    datoEst = this.mi.getBuscarMatriculaEstPrs(datoEst);
                    modelo.put("datoEst", datoEst);
                    modelo.put("id_matricula", Integer.toString(iIdMatriculaResultado));
                    modelo.put("clave", "123456"); //Por defecto
                    //Registramos los accesos del estudiante
                    Estudiantes datoAcceso = new Estudiantes();
                    datoAcceso.setId_matricula(iIdMatriculaResultado);
                    datoAcceso.setApodo(Integer.toString(iIdEstudiante));
                    //datoAcceso.setClave("123456"); //Por defecto
                    datoAcceso.setClave(datoEst.getDip()); //Por defecto
                    datoAcceso.setId_rol(cliente.getId_rol());
                    datoAcceso.setUlt_usuario(cliente.getId_usuario());
                    this.mi.setRegistrarApodoClaveMatricula(datoAcceso);
                } else {
                    //Buscamos si ya eata registrado
                    tramite = new Tramites();
                    tramite.setId_tramite(iIdTramite);
                    tramite.setEtiqueta("id_matricula");
                    tramite = (Tramites) this.mi.getBuscarCampoGw(tramite);
                    int iId_matricula = Integer.parseInt(tramite.getValores());
                    //Buscamos la matricula
                    datoEst.setId_matricula(iId_matricula);
                    datoEst = this.mi.getBuscarMatriculaEstPrs(datoEst);
                    modelo.put("datoEst", datoEst);
                    modelo.put("id_matricula", Integer.toString(iIdMatriculaResultado));

                    return new ModelAndView("Error", "mensaje", "El estudiante ya esta matriculado para la gestion" + Integer.toString(cliente.getGestion()) + " y el periodo " + Integer.toString(cliente.getPeriodo()));
                }
            }
        }

        //---Finde las grabar Matriculas
        modelo.put("iId_matricula_resultado", Integer.toString(trnDetalle.getId_transaccion()));

        tramite.setUlt_usuario(cliente.getId_usuario());
        this.mi.setRegistrarTrPrFrLogLimbo(tramite);

        Perfiles dataperfil = null;
        if (!lTransacciones.isEmpty()) {
            dataperfil = lTransacciones.get(0);
        }

        if (dataperfil.getId_perfil() == 4) {

            List<Perfiles> detalletesoro = lDetalles.stream().filter(p -> p.getId_concepto() == 1).collect(Collectors.toList());
            List<Perfiles> detalleotrosaportes = lDetalles.stream().filter(p -> p.getId_perfil() != 4).collect(Collectors.toList());
            detalletesoro.addAll(detalleotrosaportes);
            double sumtesoro = detalletesoro.stream().mapToDouble(p -> p.getPagado()).sum();
            List<Perfiles> detalleteaportes = lDetalles.stream().filter(p -> p.getId_concepto() != 1 && p.getId_perfil() == 4).collect(Collectors.toList());
            double sumaportes = detalleteaportes.stream().mapToDouble(p -> p.getPagado()).sum();

            QRCodeWriter barcodeWriter = new QRCodeWriter();
            SimpleDateFormat fecha = new SimpleDateFormat("ddMMyyyy");
            BitMatrix bitMatrix = barcodeWriter.encode(dataperfil.getId_transaccion() + "|" + fecha.format(dataperfil.getFec_pago()) + "|" + sumtesoro, BarcodeFormat.QR_CODE, 200, 200);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            MatrixToImageWriter.writeToStream(bitMatrix, "png", bos);
            String image = Base64.getEncoder().encodeToString(bos.toByteArray());
            modelo.put("qr", "data:image/png;base64," + image);
            bitMatrix = barcodeWriter.encode(dataperfil.getId_transaccion() + "|" + fecha.format(dataperfil.getFec_pago()) + "|" + sumaportes, BarcodeFormat.QR_CODE, 200, 200);
            bos = new ByteArrayOutputStream();
            MatrixToImageWriter.writeToStream(bitMatrix, "png", bos);
            image = Base64.getEncoder().encodeToString(bos.toByteArray());
            modelo.put("qr1", "data:image/png;base64," + image);

            modelo.put("datosTransaccion", dataperfil);
            modelo.put("literaltaportes", literal.convert(sumaportes));
            modelo.put("literaltesoro", literal.convert(sumtesoro));
            modelo.put("lDetallestesoro", detalletesoro);
            modelo.put("lDetallesaportes", detalleteaportes);
            modelo.put("totaltesoro", sumtesoro);
            modelo.put("totalaportes", sumaportes);
            return new ModelAndView("administrarProgramasEspecializados/cajas/ListarMatriculasAntiguo", modelo);
        } else {
            QRCodeWriter barcodeWriter = new QRCodeWriter();
            SimpleDateFormat fecha = new SimpleDateFormat("ddMMyyyy");
            BitMatrix bitMatrix = barcodeWriter.encode(dataperfil.getId_transaccion() + "|" + fecha.format(dataperfil.getFec_pago()) + "|" + dataperfil.getPagado(), BarcodeFormat.QR_CODE, 200, 200);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            MatrixToImageWriter.writeToStream(bitMatrix, "png", bos);
            String image = Base64.getEncoder().encodeToString(bos.toByteArray());

            modelo.put("datosTransaccion", dataperfil);
            modelo.put("qr", "data:image/png;base64," + image);
            return new ModelAndView("administrarProgramasEspecializados/cajas/EstListarConceptosImpresion", modelo);
        }
    }
}
