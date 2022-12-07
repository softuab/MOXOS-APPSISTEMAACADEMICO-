/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fautapo.web.reportesAcademicos.solicitudesadmision;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.io.ByteArrayOutputStream;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.fautapo.domain.Abm;
import org.fautapo.domain.Clientes;
import org.fautapo.domain.Facultades;
import org.fautapo.domain.Instituciones;
import org.fautapo.domain.Planes;
import org.fautapo.domain.Postulantes;
import org.fautapo.domain.Programas;
import org.fautapo.domain.Universidades;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author FNZABALETAA
 */
public class ListarAdmisionEspecialPostulantespos implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> modelo = new HashMap<>();

        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
        if (cliente == null) {
            return new ModelAndView("Aviso", "mensaje", "Su sesi�n ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");
        }

        Postulantes datosPostulante;
        //Recuperando variables del jsp
        String sIdPostulante = request.getParameter("id_postulante");
        String sNombres = request.getParameter("nombres");
        String sDip = request.getParameter("dip");
        String sGestion = request.getParameter("gestion");
        String sPeriodo = request.getParameter("periodo");
        String sFormuario = request.getParameter("formulario");

        if ("".equals(sIdPostulante) && ("".equals(sNombres)) && ("".equals(sDip))) {
            modelo.put("gestion", sGestion);
            modelo.put("periodo", sPeriodo);
            return new ModelAndView("reportesAcademicos/impresionSolicitudAdmisionPostulantes/EntradaBuscarPostulantes", modelo);
        }

        if (!"".equals(sIdPostulante)) {
            //Sacando los datos del postulante    
            datosPostulante = new Postulantes();
            try {
                datosPostulante.setId_postulante(Integer.parseInt(sIdPostulante));
            } catch (Exception e) {
                return new ModelAndView("Error", "mensaje", "Para el R.P. inserte un dato de tipo entero ");
            }
            datosPostulante = this.mi.getPstBuscarPostulanteNombres(datosPostulante);
            modelo.put("datosPostulante", datosPostulante);
            if (datosPostulante == null) {
                return new ModelAndView("Aviso", "mensaje", "No existe el  R.P.  " + sIdPostulante);
            }

            //Sacamos el listado del plan por id_tipo_grado
            Planes datosPlan = new Planes();
            datosPlan.setId_programa(datosPostulante.getId_programa());
            datosPlan.setId_plan(datosPostulante.getId_plan());
            datosPlan.setId_tipo_grado(datosPostulante.getId_tipo_grado());
            List<Planes> lMateriasPlanTipoGrado = this.mi.getListarMateriasPlanTipoGrado(datosPlan);
            modelo.put("lMateriasPlanTipoGrado", lMateriasPlanTipoGrado);

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

            QRCodeWriter barcodeWriter = new QRCodeWriter();
            BitMatrix bitMatrix = barcodeWriter.encode(sIdPostulante + "|" + datosPostulante.getId_tipo_admision() + "|", BarcodeFormat.QR_CODE, 200, 200);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            MatrixToImageWriter.writeToStream(bitMatrix, "png", bos);
            String image = Base64.getEncoder().encodeToString(bos.toByteArray());
            modelo.put("qr", image);
            modelo.put("usuario", cliente.getNombres());

            String nombreformuario = "";
            if (sFormuario.equals("1")) {
                nombreformuario = "Formulario1";
            }
            if (sFormuario.equals("2")) {
                nombreformuario = "Formulario2";
            }
            if (sFormuario.equals("3")) {
                nombreformuario = "Formulario1";
            }
            if (sFormuario.equals("4")) {
                nombreformuario = "Formulario4";
            }
            return new ModelAndView("reportesAcademicos/impresionSolicitudAdmisionPostulantes/" + nombreformuario, modelo);
        }

        //Si la busqueda es por CI
        if (!"".equals(sDip)) {
            datosPostulante = new Postulantes();
            datosPostulante.setDip(sDip);
            List<Postulantes> lPostulantes = this.mi.getMiListarPostulantesDip(datosPostulante);
            modelo.put("lPostulantes", lPostulantes.stream().filter(p -> p.getTipo_admision().toUpperCase().contains("ESPECIAL")).collect(Collectors.toList()));
        }
        //Si la busqueda es por nombre
        if (!"".equals(sNombres)) {
            datosPostulante = new Postulantes();
            datosPostulante.setNombres(sNombres);
            List<Postulantes> lPostulantes = this.mi.getMiListarPostulantesNombre(datosPostulante);
            modelo.put("lPostulantes", lPostulantes.stream().filter(p -> p.getTipo_admision().toUpperCase().contains("ESPECIAL")).collect(Collectors.toList()));
        }
        modelo.put("gestion", sGestion);
        modelo.put("periodo", sPeriodo);
        return new ModelAndView("reportesAcademicos/impresionSolicitudAdmisionPostulantes/ListarDatosPostulantes", modelo);
    }
}
