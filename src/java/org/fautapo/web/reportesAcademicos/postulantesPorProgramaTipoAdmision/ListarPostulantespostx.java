package org.fautapo.web.reportesAcademicos.postulantesPorProgramaTipoAdmision;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Facultades;
import org.fautapo.domain.Programas;
import org.fautapo.domain.Estudiantes;
import org.fautapo.domain.Postulantes;
import org.fautapo.domain.Instituciones;
import org.fautapo.domain.Abm;

import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2005-11-01
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-07-17
 */
public class ListarPostulantespostx implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> modelo = new HashMap<>();

        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
        if (cliente == null) {
            return new ModelAndView("Aviso", "mensaje", "Su sesi�n ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");
        }

        //Sacamos el formato de la fecha
        Abm formatoFecha = new Abm();
        formatoFecha.setCampo("formato_fecha");
        formatoFecha.setCodigo("dibrap");
        modelo.put("formatoFecha", this.mi.getDibBuscarParametro(formatoFecha));

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

        //Recuperamos las variables del jsp
        int iIdPrograma = cliente.getInt(request, "id_programa");
        int iId_tipo_admision = cliente.getInt(request, "id_tipo_admision");
        int iGestion = cliente.getInt(request, "gestion");
        int iPeriodo = cliente.getInt(request, "periodo");
        modelo.put("gestion", Integer.toString(iGestion));
        modelo.put("periodo", Integer.toString(iPeriodo));

        //Sacamos los datos del Programa
        Programas datosPrograma = new Programas();
        datosPrograma.setId_programa(iIdPrograma);
        datosPrograma = this.mi.getPrgBuscarPrograma(datosPrograma);
        modelo.put("datosPrograma", datosPrograma);

        //Sacamos los datos de la Facultad
        Facultades datosFacultad = new Facultades();
        datosFacultad.setId_facultad(datosPrograma.getId_facultad());
        datosFacultad = this.mi.getFclBuscarFacultad(datosFacultad);
        modelo.put("datosFacultad", datosFacultad);

        //Sacamos los tipos admision
        Estudiantes datosTipoAdmision = new Estudiantes();
        datosTipoAdmision.setId_tipo_admision(iId_tipo_admision);
        datosTipoAdmision = this.mi.getBuscarTipoAdmision(datosTipoAdmision);
        modelo.put("datosTipoAdmision", datosTipoAdmision);

        //Sacamos el listado de los Postulantes
        Postulantes datosPostulantes = new Postulantes();
        datosPostulantes.setId_programa(iIdPrograma);
        datosPostulantes.setId_tipo_admision(iId_tipo_admision);
        datosPostulantes.setGestion(iGestion);
        datosPostulantes.setPeriodo(iPeriodo);

        if (request.getParameter("boton").equals("Reprobados")) {
            List<Postulantes> lPostulantes = this.mi.getPstListarReprobadosPorProgramaTipoAdmision(datosPostulantes);
            modelo.put("lPostulantes", lPostulantes);
            return new ModelAndView("reportesAcademicos/postulantesPorProgramaTipoAdmision/ListarPostulantes", modelo);
        } else if (request.getParameter("boton").equals("Aprobados")) {
            List<Postulantes> lPostulantes = this.mi.getPstListarAprobadosPorProgramaTipoAdmision(datosPostulantes);
            modelo.put("lPostulantes", lPostulantes);
            return new ModelAndView("reportesAcademicos/postulantesPorProgramaTipoAdmision/ListarPostulantes", modelo);
        } else {
            List<Postulantes> lPostulantes = this.mi.getPstListarInscritosPorProgramaTipoAdmision(datosPostulantes);
            modelo.put("lPostulantes", lPostulantes);
            return new ModelAndView("reportesAcademicos/postulantesPorProgramaTipoAdmision/ListarPostulantes", modelo);
        }
    }
}
