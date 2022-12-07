package org.fautapo.web.administrarRecibos.reimprimirRecibos;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.io.ByteArrayOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Literales;
import org.fautapo.domain.Abm;
import org.fautapo.domain.Instituciones;
import org.fautapo.domain.Perfiles;
import org.fautapo.domain.Postulantes;
import org.fautapo.domain.Estudiantes;
import org.fautapo.domain.Personas;
import org.fautapo.domain.Usuarios;

import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-03-30
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-03-30
 */
public class ListarConceptosImpresion implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
        if (cliente == null) {
            return new ModelAndView("Error", "mensaje", "Tu sesion termino. Por favor, ingresa nuevamente.");
        }
        Map modelo = new HashMap();
        modelo.put("cliente", cliente);

        // Comprobamos si es quien debe ingresar al m�dulo, de acuerdo a su clave
        Usuarios usuario = new Usuarios();
        usuario.setId_usuario(cliente.getId_usuario());
        usuario.setClave(request.getParameter("clave" + request.getParameter("hora")));

        if (null == this.mi.getComprobarUsuario(usuario)) {
            return new ModelAndView("administrarRecibos/reimprimirRecibos/Error", "mensaje", "Clave incorrecta, por favor, vuelva a intentarlo");
        }

        String sNro_recibo = cliente.getString(request, "nro_recibo");

        //Sacamos los datos para la impresion del RECIBO
        Perfiles datosTransaccion = new Perfiles();

        datosTransaccion.setNro_recibo(sNro_recibo);
        datosTransaccion.setIns_sede(cliente.getId_almacen());
        //Sacamos los datos de la transaccion
        List<Perfiles> datosTransacciones = this.mi.getTrnBuscarTransaccionReciboSedePerfiles(datosTransaccion);
        // datosTransaccion = this.mi.getTrnBuscarTransaccionRecibo(datosTransaccion);

        if (datosTransacciones.isEmpty()) {
            return new ModelAndView("administrarRecibos/reimprimirRecibos/Aviso", "mensaje", "No existe una transaccion con Nro. de Recibo en esta sede" + sNro_recibo);
        }

        Literales literal = new Literales();
        modelo.put("literal", literal.convert(datosTransacciones.stream().mapToDouble(p -> p.getPagado()).sum()));
        List<Perfiles> lDetalles = new ArrayList<>();
        Perfiles perfil = datosTransacciones.stream().findFirst().get();
        perfil.setIns_sede(cliente.getId_almacen());
        List<Perfiles> lDetallestransaccion = this.mi.getTrnListarTransaccionesReciboSede(perfil);
        lDetalles.addAll(lDetallestransaccion);
        //Sacamos el listado de trn_detalles

        // Datos de la Persona
        if (datosTransacciones.stream().findFirst().get().getId_persona() > 0) {
            if (datosTransacciones.stream().findFirst().get().getId_programa() > 0) {
                Estudiantes estudiante = new Estudiantes();
                estudiante.setId_persona(datosTransacciones.stream().findFirst().get().getId_persona());
                estudiante.setId_programa(datosTransacciones.stream().findFirst().get().getId_programa());
                estudiante = this.mi.getMiPrsBuscarEstudiante(estudiante);
                estudiante = this.mi.getEstBuscarEstudianteNombres(estudiante);
                modelo.put("estudiante", estudiante);
            } else {
                Personas persona = new Personas();
                persona.setId_persona(datosTransacciones.stream().findFirst().get().getId_persona());
                persona = this.mi.getPrsBuscarPersona(persona);
                modelo.put("estudiante", persona);
            }
        } else if (datosTransacciones.stream().findFirst().get().getId_persona_pst() > 0) {
            Postulantes postulante = new Postulantes();
            postulante.setId_persona(datosTransacciones.stream().findFirst().get().getId_persona_pst());
            if (datosTransacciones.stream().findFirst().get().getId_programa() > 0) {
                postulante.setId_programa(datosTransacciones.stream().findFirst().get().getId_programa());
                postulante = this.mi.getMiPrsBuscarPostulante(postulante);
                postulante = this.mi.getPstBuscarPostulanteNombres(postulante);
            } else {
                postulante = this.mi.getPstBuscarPersona(postulante);
            }
            modelo.put("estudiante", postulante);
        }
        // fin - Datos de la Persona

        //Sacamos el formato de la fecha
        Abm formatoFecha = new Abm();
        formatoFecha.setCampo("formato_fecha");
        formatoFecha.setCodigo("dibrap");
        modelo.put("formatoFecha", this.mi.getDibBuscarParametro(formatoFecha));

        //Sacamos el formato de la hora
        formatoFecha.setCampo("formato_hora");
        formatoFecha.setCodigo("dibrap");
        modelo.put("formatoHora", this.mi.getDibBuscarParametro(formatoFecha));

        //Sacamos los datos de la institucion
        Instituciones datosInstitucion = new Instituciones();
        datosInstitucion.setId_institucion(1); //--------------------------ESTATICO
        datosInstitucion = this.mi.getBuscarInstitucion(datosInstitucion);
        modelo.put("datosInstitucion", datosInstitucion);
        modelo.put("datosTransaccion", datosTransacciones.stream().findFirst().get());
        Instituciones datosInstitucionSede = new Instituciones();
        datosInstitucionSede.setId_institucion(cliente.getId_almacen()); //--------------------------ESTATICO
        datosInstitucionSede = this.mi.getBuscarInstitucionSede(datosInstitucionSede);
        if (datosInstitucionSede != null) {
            modelo.put("datosInstitucionsede", datosInstitucionSede);
        }
        if (datosTransacciones.stream().anyMatch(p -> p.getId_perfil() == 4)) {
            List<Perfiles> detalletesoro = lDetalles.stream().filter(p -> p.getId_concepto() == 1).collect(Collectors.toList());
            List<Perfiles> detalleotrosaportes = lDetalles.stream().filter(p -> p.getId_perfil() != 4).collect(Collectors.toList());
            detalletesoro.addAll(detalleotrosaportes);
            double sumtesoro = detalletesoro.stream().mapToDouble(p -> p.getPagado()).sum();
            List<Perfiles> detalleteaportes = lDetalles.stream().filter(p -> p.getId_concepto() != 1 && p.getId_perfil() == 4).collect(Collectors.toList());
            double sumaportes = detalleteaportes.stream().mapToDouble(p -> p.getPagado()).sum();
            QRCodeWriter barcodeWriter = new QRCodeWriter();
            SimpleDateFormat fecha = new SimpleDateFormat("ddMMyyyy");
            BitMatrix bitMatrix = barcodeWriter.encode(datosTransacciones.stream().findFirst().get().getId_transaccion() + "|" + fecha.format(datosTransacciones.stream().findFirst().get().getFec_pago()) + "|" + sumtesoro, BarcodeFormat.QR_CODE, 200, 200);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            MatrixToImageWriter.writeToStream(bitMatrix, "png", bos);
            String image = Base64.getEncoder().encodeToString(bos.toByteArray());
            modelo.put("qr", "data:image/png;base64," + image);
            bitMatrix = barcodeWriter.encode(datosTransacciones.stream().findFirst().get().getId_transaccion() + "|" + fecha.format(datosTransacciones.stream().findFirst().get().getFec_pago()) + "|" + sumaportes, BarcodeFormat.QR_CODE, 200, 200);
            bos = new ByteArrayOutputStream();
            MatrixToImageWriter.writeToStream(bitMatrix, "png", bos);
            image = Base64.getEncoder().encodeToString(bos.toByteArray());
            modelo.put("qr1", "data:image/png;base64," + image);

            modelo.put("literaltaportes", literal.convert(sumaportes));
            modelo.put("literaltesoro", literal.convert(sumtesoro));
            modelo.put("lDetallestesoro", detalletesoro);
            modelo.put("lDetallesaportes", detalleteaportes);
            modelo.put("totaltesoro", sumtesoro);
            modelo.put("totalaportes", sumaportes);
            return new ModelAndView("administrarRecibos/reimprimirRecibos/ListarMatriculasAntiguo", modelo);
        } else {
            QRCodeWriter barcodeWriter = new QRCodeWriter();
            SimpleDateFormat fecha = new SimpleDateFormat("ddMMyyyy");
            BitMatrix bitMatrix = barcodeWriter.encode(datosTransacciones.stream().findFirst().get().getId_transaccion() + "|" + fecha.format(datosTransacciones.stream().findFirst().get().getFec_pago()) + "|" + datosTransacciones.stream().findFirst().get().getPagado(), BarcodeFormat.QR_CODE, 200, 200);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            MatrixToImageWriter.writeToStream(bitMatrix, "png", bos);
            String image = Base64.getEncoder().encodeToString(bos.toByteArray());
            modelo.put("qr", "data:image/png;base64," + image);
            modelo.put("lDetalles", lDetalles);
            return new ModelAndView("administrarRecibos/reimprimirRecibos/ListarConceptosImpresion", modelo);
        }

    }

}
