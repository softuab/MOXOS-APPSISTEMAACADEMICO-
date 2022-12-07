/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fautapo.web.reportesAcademicos.certificaciones.afp;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.io.ByteArrayOutputStream;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.fautapo.domain.Abm;
import org.fautapo.domain.Calendarios;
import org.fautapo.domain.Clientes;
import org.fautapo.domain.Estudiantes;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.fautapo.util.Util;

/**
 *
 * @author FNZABALETAA
 */
public class ImprimirCertificadoAFP implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> modelo = new HashMap<>();
        String mensajeModel = "mensaje";
        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
        if (cliente == null) {
            return new ModelAndView("Aviso", mensajeModel, "Su sesion ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");
        }
        Integer idEstudiante = cliente.getInt(request, "id_estudiante");
        Integer gestion = cliente.getInt(request, "gestion");
        Integer periodo = cliente.getInt(request, "periodo");

        Estudiantes estudiante = mi.getDatosImpresionAfp(idEstudiante);
        if (estudiante == null) {
            return new ModelAndView("CertificacionesEstudiantes/Error", mensajeModel, "No esta definido algunos parametros en el estudiante");
        }
        Integer idItpoMateria = estudiante.getId_tipo_materia();
        Calendarios calendario = new Calendarios();
        calendario.setGestion(gestion);
        calendario.setPeriodo(periodo);
        calendario.setId_control_calendario_actividad(idItpoMateria == 1 ? 10 : 9);
        calendario = mi.getDetalleCalendarioAcademico(calendario);
        if (calendario == null) {
            return new ModelAndView("CertificacionesEstudiantes/Error", mensajeModel, "No esta definido el calendario academico o no selecciono el periodo correcto");
        }
        QRCodeWriter barcodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = barcodeWriter.encode(idEstudiante + "|" + estudiante.getDip() + "|" + estudiante.getId_programa(), BarcodeFormat.QR_CODE, 200, 200);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        MatrixToImageWriter.writeToStream(bitMatrix, "png", bos);
        String image = Base64.getEncoder().encodeToString(bos.toByteArray());
        //Sacamos el formato de la fecha
        Abm formatoFecha = new Abm();
        formatoFecha.setCampo("formato_fecha");
        formatoFecha.setCodigo("dibrap");

        modelo.put("qr", image);
        modelo.put("formatoFecha", this.mi.getDibBuscarParametro(formatoFecha));
        modelo.put("estudiante", estudiante);
        modelo.put("calendario", calendario);
        modelo.put("inicio", Util.fechaLiteral(calendario.getFec_inicio_calendario()));
        modelo.put("fin", Util.fechaLiteral(calendario.getFec_final()));
        modelo.put("gestion", gestion);
        modelo.put("periodo", periodo);
        return new ModelAndView("CertificacionesEstudiantes/CertificadoAFP/Formulario", modelo);
    }

}
