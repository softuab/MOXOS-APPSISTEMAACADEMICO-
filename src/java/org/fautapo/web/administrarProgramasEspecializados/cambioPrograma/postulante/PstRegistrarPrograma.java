package org.fautapo.web.administrarProgramasEspecializados.cambioPrograma.postulante;

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

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Tramites;
import org.fautapo.domain.Programas;
import org.fautapo.domain.Instituciones;
import org.fautapo.domain.Abm;
import org.fautapo.domain.Postulantes;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-03-30
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-03-30
 */
public class PstRegistrarPrograma implements Controller {

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

        int iIdTramite = cliente.getInt(request, "id_tramite");
        int iIdPrograma = cliente.getInt(request, "id_programa");
        int idProceso = cliente.getInt(request, "id_proceso");
        String sNombres = cliente.getNombres();
        String sIdPlan = cliente.getString(request, "id_plan");
        modelo.put("programa", cliente.getString(request, "programa"));
        modelo.put("plan", cliente.getString(request, "plan"));
        modelo.put("usuario", sNombres);

        Tramites tramite = new Tramites();
        tramite.setId_tramite(iIdTramite);
        tramite.setEtiqueta("id_postulante");
        tramite = (Tramites) this.mi.getBuscarCampoGw(tramite);
        int iId_postulante = Integer.parseInt(tramite.getValores());

        Postulantes postulante = new Postulantes();
        postulante.setId_postulante(iId_postulante);
        postulante = this.mi.getPstBuscarPostulanteNombres(postulante);
        modelo.put("postulante", postulante);

        Programas programa = new Programas();
        programa.setId_programa(postulante.getId_programa());
        programa = this.mi.getPrgBuscarPrograma(programa);
        modelo.put("programa_ant", programa);
        postulante.setId_programa(iIdPrograma);
        postulante.setId_plan(sIdPlan);
        postulante.setId_estado("B");
        postulante.setId_rol(cliente.getId_rol());
        postulante.setUlt_usuario(cliente.getId_usuario());

        //desde aqui se agrega
        this.mi.setPstRegistrarPrograma(postulante);

        this.mi.setMiRegistrarPostulanteC(postulante);

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

        tramite.setUlt_usuario(cliente.getId_usuario());
        this.mi.setRegistrarTrPrFrLogLimbo(tramite);

        QRCodeWriter barcodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = barcodeWriter.encode(postulante.getId_postulante() + "|" + iIdTramite + "|" + idProceso, BarcodeFormat.QR_CODE, 200, 200);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        MatrixToImageWriter.writeToStream(bitMatrix, "png", bos);
        String image = Base64.getEncoder().encodeToString(bos.toByteArray());
        modelo.put("qr", image);

        return new ModelAndView("administrarProgramasEspecializados/cambioPrograma/postulante/PstImpresionRecibo", modelo);
    }
}
