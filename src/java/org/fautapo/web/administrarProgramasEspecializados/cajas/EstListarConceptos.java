package org.fautapo.web.administrarProgramasEspecializados.cajas;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Tramites;
import org.fautapo.domain.Perfiles;
import org.fautapo.domain.Estudiantes;
import org.fautapo.domain.Actividades;
import org.fautapo.domain.Abm;
import org.fautapo.domain.Literales;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-03-30
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-03-30
 */
public class EstListarConceptos implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        double iDescuento = 0;
        int iIdEstudiante = 0;
        String sIdPerfilProceso;
        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
        if (cliente == null) {
            return new ModelAndView("Error", "mensaje", "Tu sesion termino. Por favor, ingresa nuevamente.");
        }
        Map<String, Object> modelo = new HashMap<>();

        int iGestion = 0;
        int iPeriodo = 0;
        int iIdTramite = cliente.getInt(request, "id_tramite");
        int iIdProceso = cliente.getInt(request, "id_proceso");
        modelo.put("id_tramite", Integer.toString(iIdTramite));
        modelo.put("id_proceso", Integer.toString(iIdProceso));

        //Buscamos los datos del proceso
        Actividades datosProceso = new Actividades();
        datosProceso.setId_proceso(iIdProceso);
        modelo.put("datosProceso", this.mi.getBuscarProceso(datosProceso));

        Tramites tramite = new Tramites();
        tramite.setId_tramite(iIdTramite);
        tramite.setEtiqueta("id_estudiante");
        tramite = (Tramites) this.mi.getBuscarCampoGw(tramite);
        iIdEstudiante = Integer.parseInt(tramite.getValores());

        //Sacamos la gestion y periodo
        try {
            tramite = new Tramites();
            tramite.setId_tramite(iIdTramite);
            tramite.setEtiqueta("gestion_matricula");
            tramite = (Tramites) this.mi.getBuscarCampoGw(tramite);
            iGestion = Integer.parseInt(tramite.getValores());

            tramite = new Tramites();
            tramite.setId_tramite(iIdTramite);
            tramite.setEtiqueta("periodo_matricula");
            tramite = (Tramites) this.mi.getBuscarCampoGw(tramite);
            iPeriodo = Integer.parseInt(tramite.getValores());
        } catch (Exception e) {
        }

        if (iGestion == 0 || iPeriodo == 0) {
            iGestion = cliente.getGestion();
            iPeriodo = cliente.getPeriodo();
        }
        modelo.put("gestion", Integer.toString(iGestion));
        modelo.put("periodo", Integer.toString(iPeriodo));

        Perfiles perfil = new Perfiles();
        perfil.setId_proceso(iIdProceso);
        List<Perfiles> listaPerfiles = this.mi.getTrnMiListarPerfilesProceso(perfil);
        if (listaPerfiles.size() == 1) {
            perfil = (Perfiles) listaPerfiles.get(0);
            sIdPerfilProceso = perfil.getId_perfil_proceso();
            //Buscamos en wayka si hay un campo cantidad
            try {
                tramite = new Tramites();
                tramite.setId_tramite(iIdTramite);
                tramite.setEtiqueta("cantidad");
                tramite = (Tramites) this.mi.getBuscarCampoGw(tramite);
                int iCantidad = Integer.parseInt(tramite.getValores());
                sIdPerfilProceso = sIdPerfilProceso + "~" + iCantidad;
            } catch (Exception e) {
            };
        } else {
            tramite = new Tramites();
            tramite.setId_tramite(iIdTramite);
            tramite.setEtiqueta("id_perfil_proceso");
            tramite = (Tramites) this.mi.getBuscarCampoGw(tramite);
            sIdPerfilProceso = tramite.getValores();
        }

        //Sacamos los datos del estudiante
        Estudiantes estudiante = new Estudiantes();
        estudiante.setId_estudiante(iIdEstudiante);
        modelo.put("estudiante", this.mi.getEstBuscarEstudianteNombres(estudiante));

        if ("B".equals(estudiante.getId_estado())) {
            return new ModelAndView("Aviso", "mensaje", "El estudiante con R.U. = " + Integer.toString(iIdEstudiante) + ". Esta Bloqueado");
        }

        perfil.setId_perfil_proceso(sIdPerfilProceso);
        List<Perfiles> lPerfiles = this.mi.getTrnPrcListarPerfiles(perfil);
        modelo.put("lPerfiles", lPerfiles);

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
            //Averiguamos el nombre del tipo de descuento
            Perfiles descuento = new Perfiles();
            descuento.setId_tipo_descuento(Integer.parseInt(tramite.getValores()));
            modelo.put("descuento", this.mi.getTrnBuscarTipoDescuento(descuento));
        } catch (Exception e) {
        };

        perfil.setId_estudiante(iIdEstudiante);
        perfil.setId_perfil_proceso(sIdPerfilProceso);
        perfil.setDescuento(iDescuento);
        List<Perfiles> listaConceptos = this.mi.getEstListarConceptos(perfil);
        modelo.put("listaConceptos", listaConceptos);
        double total = 0;
        for (int i = 0; i < listaConceptos.size(); i++) {
            Perfiles cajita = listaConceptos.get(i);
            total += cajita.getPagado();
        }
        modelo.put("total", String.valueOf(total));
        Literales literal = new Literales();
        modelo.put("literal", literal.convert(total));

        //Sacamos el formato de la fecha
        Abm formatoFecha = new Abm();
        formatoFecha.setCampo("formato_fecha");
        formatoFecha.setCodigo("dibrap");
        modelo.put("formatoFecha", this.mi.getDibBuscarParametro(formatoFecha));

        return new ModelAndView("administrarProgramasEspecializados/cajas/EstListarConceptos", modelo);
    }
}
