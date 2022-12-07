package org.fautapo.web.reportesAcademicos.nroEstMatriculadosTipoEstudiante;

import java.util.HashMap;
import java.util.Map;
import java.lang.String;
import java.util.List;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Abm;
import org.fautapo.domain.Clientes;
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

public class ListarMatriculadosTipoEstudiante implements Controller {

  private MiFacade mi;
  public void setMi(MiFacade mi) {
    this.mi = mi;
  }

  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    Map modelo = new HashMap();
    
    Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
    if(cliente==null) return new ModelAndView("Aviso", "mensaje", "Su sesion ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");    
    int iId_universidad = cliente.getId_universidad();
 
    int iGestion = cliente.getInt(request, "gestion");
    int iPeriodo = cliente.getInt(request, "periodo");
    modelo.put("gestion", Integer.toString(iGestion));
    modelo.put("periodo", Integer.toString(iPeriodo));
    
    //Sacando la lista de estudiantes matriculados
    Estudiantes datosEstudiante = new Estudiantes();
    datosEstudiante.setGestion(iGestion);
    datosEstudiante.setPeriodo(iPeriodo);
    List lEstudiantes = this.mi.getListarNroEstMatriculadosTipoEstudiante(datosEstudiante);	
    modelo.put("lEstudiantes", lEstudiantes);
	    
    //Listamos los programas
 //   Programas datosPrograma = new Programas();
 //   datosPrograma.setId_universidad(iId_universidad);
 //   List lProgramas = this.mi.getUnvListarProgramas(datosPrograma);
 //   modelo.put("lProgramas", lProgramas);

    //Listamos los tipo estudiantes
 //   List lTiposEstudiantes = this.mi.getListarTiposEstudiantes();
 //   modelo.put("lTiposEstudiantes", lTiposEstudiantes);
    
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

    return new ModelAndView("reportesAcademicos/nroEstMatriculadosTipoEstudiante/ListarMatriculados", modelo);
  }
}