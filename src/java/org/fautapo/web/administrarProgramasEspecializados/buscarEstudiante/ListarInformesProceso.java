package org.fautapo.web.administrarProgramasEspecializados.buscarEstudiante;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Tramites;
import org.fautapo.domain.Estudiantes;
import org.fautapo.domain.Informes;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-03-23
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-03-23
 */
public class ListarInformesProceso implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> modelo = new HashMap<>();

        Integer iIdTramite;
        String sCadena = "";
        Tramites datosTramite = new Tramites();
        //Sacamos los datos de la session
        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");

        String sIdProceso = request.getParameter("id_proceso");
        String sIdEstudiante = request.getParameter("id_estudiante");
        String sIdTramite = request.getParameter("id_tramite");
        String sDescuento = request.getParameter("descuento");
        String sIdTipoDescuento = request.getParameter("id_tipo_descuento");

        if ((sIdTramite == null) || ("".equals(sIdTramite))) {
            //Crear un tramite
            Tramites tramite = new Tramites();
            tramite.setId_proceso(Integer.parseInt(sIdProceso));
            tramite.setPara(cliente.getId_usuario());
            iIdTramite = this.mi.setInsertarTramiteLimbo(tramite); //CREA UN TRAMITE
            if (iIdTramite == 0) {
                return new ModelAndView("Error", "mensaje", "El tramite no se creo");
            }
        } else {
            iIdTramite = Integer.parseInt(sIdTramite);
        }

        //Sacamos los datos del Estudiante
        Estudiantes datosEstudiante = new Estudiantes();
        datosEstudiante.setId_estudiante(Integer.parseInt(sIdEstudiante));
        datosEstudiante = this.mi.getEstBuscarEstudianteNombres(datosEstudiante);
        modelo.put("datosEstudiante", datosEstudiante);

        String sNombreCompleto = datosEstudiante.getNombres() + " " + datosEstudiante.getPaterno() + " " + datosEstudiante.getMaterno();
        //Registramos los valores en wayka
        try {
            //Datos del Nombre
            datosTramite = new Tramites();
            datosTramite.setId_tramite(iIdTramite);
            datosTramite.setEtiqueta("nombre_completo");
            datosTramite.setValor(sNombreCompleto);
            datosTramite.setUlt_usuario(cliente.getId_usuario());
            this.mi.setRegistrarValorLimbo2(datosTramite);
        } catch (Exception e) {
        }

        try {
            //Datos de los Nombres
            datosTramite = new Tramites();
            datosTramite.setId_tramite(iIdTramite);
            datosTramite.setEtiqueta("nombres");
            datosTramite.setValor(datosEstudiante.getPaterno());
            datosTramite.setUlt_usuario(cliente.getId_usuario());
            this.mi.setRegistrarValorLimbo2(datosTramite);
        } catch (Exception e) {
        }

        try {
            //Datos del Paterno
            datosTramite = new Tramites();
            datosTramite.setId_tramite(iIdTramite);
            datosTramite.setEtiqueta("paterno");
            datosTramite.setValor(datosEstudiante.getPaterno());
            datosTramite.setUlt_usuario(cliente.getId_usuario());
            this.mi.setRegistrarValorLimbo2(datosTramite);
        } catch (Exception e) {
        }

        try {
            //Datos del Materno
            datosTramite = new Tramites();
            datosTramite.setId_tramite(iIdTramite);
            datosTramite.setEtiqueta("materno");
            datosTramite.setValor(datosEstudiante.getMaterno());
            datosTramite.setUlt_usuario(cliente.getId_usuario());
            this.mi.setRegistrarValorLimbo2(datosTramite);
        } catch (Exception e) {
        }

        try {
            //Datos del Materno
            datosTramite = new Tramites();
            datosTramite.setId_tramite(iIdTramite);
            datosTramite.setEtiqueta("dip");
            datosTramite.setValor(datosEstudiante.getDip());
            datosTramite.setUlt_usuario(cliente.getId_usuario());
            this.mi.setRegistrarValorLimbo2(datosTramite);
        } catch (Exception e) {
        }

        try {
            //Datos del Identificador Id_etudiante
            datosTramite = new Tramites();
            datosTramite.setId_tramite(iIdTramite);
            datosTramite.setEtiqueta("id_estudiante");
            datosTramite.setValor(sIdEstudiante);
            datosTramite.setUlt_usuario(cliente.getId_usuario());
            this.mi.setRegistrarValorLimbo2(datosTramite);
        } catch (Exception e) {
        }

        try {
            //Datos del Programa
            datosTramite = new Tramites();
            datosTramite.setId_tramite(iIdTramite);
            datosTramite.setEtiqueta("programa");
            datosTramite.setValor(datosEstudiante.getPrograma());
            datosTramite.setUlt_usuario(cliente.getId_usuario());
            this.mi.setRegistrarValorLimbo2(datosTramite);
        } catch (Exception e) {
        }

        try {
            //Datos de la Facultad
            datosTramite = new Tramites();
            datosTramite.setId_tramite(iIdTramite);
            datosTramite.setEtiqueta("facultad");
            datosTramite.setValor(datosEstudiante.getFacultad());
            datosTramite.setUlt_usuario(cliente.getId_usuario());
            this.mi.setRegistrarValorLimbo2(datosTramite);
        } catch (Exception e) {
        }

        try {
            //Datos del Programa
            datosTramite = new Tramites();
            datosTramite.setId_tramite(iIdTramite);
            datosTramite.setEtiqueta("direccion");
            datosTramite.setValor(datosEstudiante.getDireccion());
            datosTramite.setUlt_usuario(cliente.getId_usuario());
            this.mi.setRegistrarValorLimbo2(datosTramite);
        } catch (Exception e) {
        }

        try {
            //Datos del Programa
            datosTramite = new Tramites();
            datosTramite.setId_tramite(iIdTramite);
            datosTramite.setEtiqueta("nacionalidad");
            datosTramite.setValor(datosEstudiante.getNacionalidad());
            datosTramite.setUlt_usuario(cliente.getId_usuario());
            this.mi.setRegistrarValorLimbo2(datosTramite);
        } catch (Exception e) {
        }

        try {
            //Registramos los requisitos
            String sRequisitos[] = request.getParameterValues("id_tupla");
            for (int k = 0; k < sRequisitos.length; k++) {
                if (sRequisitos[k] != null) {
                    sCadena = sCadena + "id_codigo:" + sRequisitos[k] + "###";
                }
            }
            datosTramite = new Tramites();
            datosTramite.setId_tramite(iIdTramite);
            datosTramite.setEtiqueta("requisitos");
            datosTramite.setValor(sCadena);
            datosTramite.setUlt_usuario(cliente.getId_usuario());
            this.mi.setRegistrarValorLimbo2(datosTramite);
        } catch (Exception e) {
        }

        try {
            //Registramos el descuento
            datosTramite = new Tramites();
            datosTramite.setId_tramite(iIdTramite);
            datosTramite.setEtiqueta("descuento");
            datosTramite.setValor(sDescuento);
            datosTramite.setUlt_usuario(cliente.getId_usuario());
            this.mi.setRegistrarValorLimbo2(datosTramite);
        } catch (Exception e) {
        }

        try {
            //Registramos el descuento
            datosTramite = new Tramites();
            datosTramite.setId_tramite(iIdTramite);
            datosTramite.setEtiqueta("id_tipo_descuento");
            datosTramite.setValor(sIdTipoDescuento);
            datosTramite.setUlt_usuario(cliente.getId_usuario());
            this.mi.setRegistrarValorLimbo2(datosTramite);
        } catch (Exception e) {
        }

        //Registramos en tr_pr_fr_log
        this.mi.setRegistrarTrPrFrLogLimbo(datosTramite);

        //Sacamos los datos del tramite
        datosTramite = new Tramites();
        datosTramite.setId_tramite(iIdTramite);
        datosTramite = this.mi.getBuscarTramite(datosTramite);
        modelo.put("datosTramite", datosTramite);

        //Sacamos la lista de informes de esta actividad
        List<Informes> lInformes = this.mi.getListarInformesActividad(datosTramite);
        modelo.put("lInformes", lInformes);

        int iCantInformes = lInformes.size();
        modelo.put("cantInformes", Integer.toString(iCantInformes));

        String sNombreInforme = Integer.toString(iIdTramite) + "_" + cliente.getId_usuario();
        modelo.put("nombre_informe", sNombreInforme);

        return new ModelAndView("administrarProgramasEspecializados/buscarEstudiante/ListarInformesProceso", modelo);
    }
}
