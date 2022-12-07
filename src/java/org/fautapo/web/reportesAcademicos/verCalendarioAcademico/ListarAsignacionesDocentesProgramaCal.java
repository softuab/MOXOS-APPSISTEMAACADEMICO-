package org.fautapo.web.reportesAcademicos.verCalendarioAcademico;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Programas;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.fautapo.domain.Libretas; 
/**
 * @autor FAUTAPO
 * @fec_registro 2006-04-08
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-04-08
 */

public class ListarAsignacionesDocentesProgramaCal implements Controller {
  private MiFacade mi;
  public void setMi(MiFacade mi) {
    this.mi = mi;
  }

  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    Map modelo = new HashMap();
    
    Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
    if(cliente==null) return new ModelAndView("Aviso", "mensaje", "Su sesion ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");
    String _nombres = cliente.getNombres();
    int _id_docente = cliente.getId_usuario();
    int _id_rol = cliente.getId_rol();    

    String sGestion = request.getParameter("gestion");
    String sPeriodo = request.getParameter("periodo");
    String sId_programa = request.getParameter("id_programa");
   // String sId_plan = request.getParameter("id_plan");
    
    int iGestion = Integer.parseInt(sGestion);
    int iPeriodo = Integer.parseInt(sPeriodo);
    
    modelo.put("gestion", sGestion);    
    modelo.put("periodo", sPeriodo);
    modelo.put("id_programa", sId_programa);    
    //modelo.put("id_plan", sId_plan);    
    modelo.put("periodo", sPeriodo);
    
    if ((!"".equals(sId_programa))) {
      //Lista de Programas (carreras)
      Programas programa = new Programas();
      programa.setId_programa(Integer.parseInt(sId_programa));
      programa = this.mi.getPrgBuscarPrograma(programa);
      modelo.put("datosPrograma", programa);
	  
	  Libretas datosCA = new Libretas();
	  datosCA.setGestion(iGestion);
      datosCA.setPeriodo(iPeriodo);
      datosCA.setId_programa(Integer.parseInt(sId_programa));
	  List lcalificacionCalendario = this.mi.getListarCalificacionCalendario(datosCA);
	  
      ////Sacamos lista de docente con sus asignaciones a las materias
      //Asignaciones datosAsignacion = new Asignaciones();
      //datosAsignacion.setGestion(iGestion);
      //datosAsignacion.setPeriodo(iPeriodo);
      //datosAsignacion.setId_programa(Integer.parseInt(sId_programa));
      //datosAsignacion.setId_plan(sId_plan);
      //List lAsignacionDocentesProgramaPlan = this.mi.getDctListarAsignacionDocenteProgramaPlan(datosAsignacion);
      //modelo.put("lAsignacionDocentesProgramaPlan", lAsignacionDocentesProgramaPlan);
	  
      modelo.put("lcalificacionCalendario", lcalificacionCalendario);
	  
      modelo.put("id_rol",Integer.toString(_id_rol));     
    }
    else{
      return new ModelAndView("Error", "mensaje","Faltan datos");
    }      
      return new ModelAndView("reportesAcademicos/verCalendarioAcademico/ListarAsignacionesDocentesPrograma", modelo);
  }
}