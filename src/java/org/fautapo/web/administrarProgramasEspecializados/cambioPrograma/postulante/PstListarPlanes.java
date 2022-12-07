package org.fautapo.web.administrarProgramasEspecializados.cambioPrograma.postulante;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.fautapo.Model.ItemViewModel;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Tramites;
import org.fautapo.domain.Postulantes;
import org.fautapo.domain.Programas;
import org.fautapo.domain.Facultades;
import org.fautapo.domain.Universidades;
import org.fautapo.domain.Planes;
import org.fautapo.domain.Actividades;
import org.fautapo.domain.Abm;
import org.fautapo.domain.logic.MiFacade;
import org.json.JSONArray;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-03-30
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-03-30
 */
public class PstListarPlanes implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
        if (cliente == null) {
            return new ModelAndView("Error", "mensaje", "Tu sesi�n termino. Por favor, ingresa nuevamente.");
        }
        Map<String, Object> modelo = new HashMap<>();

        List<ItemViewModel> litemFacultades = new ArrayList<>();
        List<ItemViewModel> litemProgramas = new ArrayList<>();
        List<ItemViewModel> litemPlanes = new ArrayList<>();

        int iIdTramite = cliente.getInt(request, "id_tramite");
        int iIdProceso = cliente.getInt(request, "id_proceso");

        //Buscamos los datos del proceso
        Actividades proceso = new Actividades();
        proceso.setId_proceso(iIdProceso);
        modelo.put("proceso", this.mi.getBuscarProceso(proceso));
        modelo.put("id_tramite", Integer.toString(iIdTramite));
        modelo.put("gestion", Integer.toString(cliente.getGestion()));
        modelo.put("periodo", Integer.toString(cliente.getPeriodo()));

        Tramites tramite = new Tramites();
        tramite.setId_tramite(iIdTramite);
        tramite.setEtiqueta("id_postulante");
        tramite = (Tramites) this.mi.getBuscarCampoGw(tramite);
        int iIdPostulante = Integer.parseInt(tramite.getValores());
        //Sacamos los datos del postulante
        Postulantes postulante = new Postulantes();
        postulante.setId_postulante(iIdPostulante);
        postulante = this.mi.getPstBuscarPostulanteNombres(postulante);
        modelo.put("postulante", postulante);
        //Lista de Programas (carreras)
        Programas programa = new Programas();
        programa.setId_programa(postulante.getId_programa());
        programa = this.mi.getPrgBuscarPrograma(programa);
        Facultades facultad = new Facultades();
        facultad.setId_facultad(programa.getId_facultad());
        facultad = this.mi.getFclBuscarFacultad(facultad);
        Universidades universidad = new Universidades();
        universidad.setId_universidad(facultad.getId_universidad());

        List<Facultades> lFacultades = this.mi.getUnvListarFacultades(universidad);
        for (Facultades item : lFacultades) {
            litemFacultades.add(new ItemViewModel(item.getId_facultad(), -1, item.getFacultad()));
        }
        modelo.put("id_facultad", programa.getId_facultad());
        modelo.put("lFacultades", litemFacultades);
        List<Programas> lProgramas = this.mi.getUnvListarProgramas(universidad);
        for (Programas item : lProgramas) {
            litemProgramas.add(new ItemViewModel(item.getId_programa(), item.getId_facultad(), item.getPrograma()));
        }
        modelo.put("id_programa", programa.getId_programa());
        modelo.put("lProgramas", new JSONArray(litemProgramas));
        Planes plan = new Planes();
        plan.setId_universidad(universidad.getId_universidad());
        plan.setId_tipo_grado(postulante.getId_tipo_grado());
        List<Planes> lPlanesActual = this.mi.getUnvGrdListarPlanes(plan);
        for (Planes item : lPlanesActual) {
            litemPlanes.add(new ItemViewModel(item.getId_prg_plan(), item.getId_programa(), item.getId_plan() + " - " + item.getTipo_grado()));
        }
        modelo.put("id_plan", new JSONArray(litemPlanes));
        modelo.put("lPlanes", new JSONArray(litemPlanes));
        //Sacamos el formato de la fecha
        Abm formatoFecha = new Abm();
        formatoFecha.setCampo("formato_fecha");
        formatoFecha.setCodigo("dibrap");
        modelo.put("formatoFecha", this.mi.getDibBuscarParametro(formatoFecha));

        return new ModelAndView("administrarProgramasEspecializados/cambioPrograma/postulante/PstListarConceptos", modelo);
    }
}
