package org.fautapo.web.imprimirProrrogas;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.io.ByteArrayOutputStream;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import org.fautapo.domain.Abm;
import org.fautapo.domain.Instituciones;
import org.fautapo.domain.Estudiantes;
import org.fautapo.domain.Personas;
import org.fautapo.domain.Clientes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2005-11-01
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2005-11-01
 */
public class ImprimirCompromiso implements Controller {

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
        modelo.put("cliente", cliente);

        int iIdEstudiante = cliente.getInt(request, "id_estudiante");
        int iIdCompromiso = cliente.getInt(request, "id_compromiso");

        Estudiantes estudiante = new Estudiantes();
        estudiante.setId_estudiante(iIdEstudiante);
        estudiante = this.mi.getEstBuscarEstudianteNombres(estudiante);
        modelo.put("estudiante", estudiante);
        Personas persona = new Personas();
        persona.setId_compromiso(iIdCompromiso);
        persona = this.mi.getMiBuscarCompromiso(persona);
        modelo.put("compromiso", persona);
        String nro_compromiso = Integer.toString(this.mi.getMiPrsNroCompromisos(persona));
        modelo.put("nro_compromiso", nro_compromiso);

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
        BitMatrix bitMatrix = barcodeWriter.encode(estudiante.getId_estudiante() + "|" + persona.getTipo_compromiso() + "|" + nro_compromiso, BarcodeFormat.QR_CODE, 200, 200);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        MatrixToImageWriter.writeToStream(bitMatrix, "png", bos);
        String image = Base64.getEncoder().encodeToString(bos.toByteArray());
        modelo.put("qr", "data:image/png;base64," + image);

        return new ModelAndView("imprimirProrrogas/ImprimirCompromiso", modelo);
    }
}
