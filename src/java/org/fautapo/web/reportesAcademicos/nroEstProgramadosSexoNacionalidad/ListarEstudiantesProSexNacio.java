package org.fautapo.web.reportesAcademicos.nroEstProgramadosSexoNacionalidad;

import java.util.HashMap;
import java.util.Map;
import java.lang.String;
import java.util.List;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Abm;
import org.fautapo.domain.Clientes;
import org.fautapo.domain.Planes;
import org.fautapo.domain.Instituciones;
import org.fautapo.domain.Estudiantes;

import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-04-08
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-04-08
 */

public class ListarEstudiantesProSexNacio implements Controller {

  private MiFacade mi;
  public void setMi(MiFacade mi) {
    this.mi = mi;
  }

  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    Map modelo = new HashMap();
    
    Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
    if(cliente==null) return new ModelAndView("Aviso", "mensaje", "Su sesion ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");    

    int iId_programa = cliente.getInt(request, "id_programa");
    int iId_prg_plan = cliente.getInt(request, "id_prg_plan");
    int iId_tipo_evaluacion = cliente.getInt(request, "id_tipo_evaluacion");
    int iGestion = cliente.getInt(request, "gestion");
    int iPeriodo = cliente.getInt(request, "periodo");
    modelo.put("gestion", Integer.toString(iGestion));
    modelo.put("periodo", Integer.toString(iPeriodo));

    //Buscamos los datos de prg_planes
    Planes datosPrgPlan = new Planes();
    datosPrgPlan.setId_prg_plan(iId_prg_plan);
    datosPrgPlan = this.mi.getBuscarPrgPlan2(datosPrgPlan);
    modelo.put("datosPrgPlan", datosPrgPlan);

    //Sacando la lista de estudiantes matriculados
    Estudiantes datosEstudiante = new Estudiantes();
    datosEstudiante.setId_programa(iId_programa);
    datosEstudiante.setId_plan(datosPrgPlan.getId_plan());
    datosEstudiante.setId_tipo_evaluacion(iId_tipo_evaluacion);
    datosEstudiante.setGestion(iGestion);
    datosEstudiante.setPeriodo(iPeriodo);
    List lEstudiantes = this.mi.getListarNroEstProgramadosSexosNacionalidades(datosEstudiante);
    modelo.put("lEstudiantes", lEstudiantes);
    
    List lPaises = this.mi.getListarPaises();
    modelo.put("lPaises", lPaises);

    List lTiposSexos = this.mi.getListarTiposSexos();
    modelo.put("tTipoSexo", Integer.toString(lTiposSexos.size()));
    modelo.put("lTiposSexos", lTiposSexos);
    
    //Sacamos el listado del plan
    Planes datosPlan = new Planes();
    datosPlan.setId_programa(iId_programa);
    datosPlan.setId_plan(datosPrgPlan.getId_plan());
    datosPlan.setId_tipo_grado(datosPrgPlan.getId_tipo_grado());
    datosPlan.setId_tipo_evaluacion(iId_tipo_evaluacion);
    datosPlan.setGestion(iGestion);
    datosPlan.setPeriodo(iPeriodo);
    List lMateriasPlanGrupo = this.mi.getListarMateriasPlanGrupo(datosPlan);
    modelo.put("lMateriasPlanGrupo", lMateriasPlanGrupo);

    //Sacamos los datos de la institucion
    Instituciones datosInstitucion = new Instituciones();
    datosInstitucion.setId_institucion(1); //--------------------------ESTATICO
    datosInstitucion = this.mi.getBuscarInstitucion(datosInstitucion);
    if (datosInstitucion !=null) {
      modelo.put("datosInstitucion", datosInstitucion);
    }
    
    Instituciones datosInstitucionSede = new Instituciones();
    datosInstitucionSede.setId_institucion(cliente.getId_almacen()); //--------------------------ESTATICO
    datosInstitucionSede = this.mi.getBuscarInstitucionSede(datosInstitucionSede);
    if (datosInstitucionSede !=null) {
      modelo.put("datosInstitucionsede", datosInstitucionSede);
    }
    
	//Sacamos el formato de la fecha
    Abm formatoFecha = new Abm();
    formatoFecha.setCampo("formato_fecha");
    formatoFecha.setCodigo("dibrap");
    modelo.put("formatoFecha", this.mi.getDibBuscarParametro(formatoFecha));

    return new ModelAndView("reportesAcademicos/nroEstProgramadosSexoNacionalidad/ListarEstudiantes", modelo);
  }
}