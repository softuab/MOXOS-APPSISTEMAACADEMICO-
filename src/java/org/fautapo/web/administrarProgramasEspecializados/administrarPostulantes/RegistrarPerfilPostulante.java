package org.fautapo.web.administrarProgramasEspecializados.administrarPostulantes;

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
import org.fautapo.domain.Abm;
import org.fautapo.domain.Instituciones;
import org.fautapo.domain.Postulantes;
import org.fautapo.domain.Tramites;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-04-05
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-04-05
 */
public class RegistrarPerfilPostulante implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map modelo = new HashMap();

        //Sacamos los datos de la session
        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
        if (cliente == null) {
            return new ModelAndView("Aviso", "mensaje", "Su sesion ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");
        }

        //Para wayka
        Tramites datosTramite = new Tramites();
        String sIdProceso = request.getParameter("id_proceso");
        String sTitulo = request.getParameter("titulo");
        modelo.put("titulo", sTitulo);
        modelo.put("id_proceso", sIdProceso);
        String sIdTramite = request.getParameter("id_tramite");
        String sIdPostulante = request.getParameter("id_postulante");
        String sId_perfil_proceso_p[] = request.getParameterValues("id_perfil_proceso_p");
        String sId_perfil_proceso = "";

        if (sId_perfil_proceso_p != null) {
            if (Integer.parseInt(sIdTramite) == 0) {
                return new ModelAndView("Error", "mensaje", "El tramite no ha pasado");
            }
            //RECUPERAMOS id_proceso_perfil 
            for (int i = 0; i < sId_perfil_proceso_p.length; i++) {
                if (i == 0) {
                    sId_perfil_proceso += sId_perfil_proceso_p[i];
                } else {
                    sId_perfil_proceso += ":" + sId_perfil_proceso_p[i];
                }
            }
            //Registramos los valores de id_perfil en wayka
            datosTramite.setId_tramite(Integer.parseInt(sIdTramite));
            datosTramite.setEtiqueta("id_perfil_proceso");
            datosTramite.setValor(sId_perfil_proceso);
            datosTramite.setUlt_usuario(cliente.getId_usuario());
            this.mi.setRegistrarValorLimbo2(datosTramite);
        }

        //Sacamos los datos del tramite
        datosTramite = new Tramites();
        datosTramite.setId_tramite(Integer.parseInt(sIdTramite));
        datosTramite.setUlt_usuario(cliente.getId_usuario());
        this.mi.setRegistrarTrPrFrLogLimbo(datosTramite);

        //Buscamos los datos del postulante
        Postulantes datosPst = new Postulantes();
        datosPst.setId_postulante(Integer.parseInt(sIdPostulante));
        datosPst = this.mi.getPstBuscarPostulanteNombres(datosPst);
        modelo.put("datosPst", datosPst);
        Postulantes datosColegio = new Postulantes();
        datosColegio.setId_persona(datosPst.getId_persona());
        datosColegio = this.mi.getBuscarPstPersonaColegio(datosColegio);
        modelo.put("datosColegio", datosColegio);

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
        QRCodeWriter barcodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = barcodeWriter.encode(sIdPostulante + "|" + datosPst.getId_tipo_admision() + "|", BarcodeFormat.QR_CODE, 200, 200);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        MatrixToImageWriter.writeToStream(bitMatrix, "png", bos);
        String image = Base64.getEncoder().encodeToString(bos.toByteArray());
        modelo.put("qr", image);
        return new ModelAndView("administrarProgramasEspecializados/administrarPostulantes/ImprimirDatosPostulante", modelo);

    }
}
