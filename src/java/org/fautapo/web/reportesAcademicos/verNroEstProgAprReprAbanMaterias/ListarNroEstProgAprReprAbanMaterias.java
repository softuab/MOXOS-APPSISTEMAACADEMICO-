package org.fautapo.web.reportesAcademicos.verNroEstProgAprReprAbanMaterias;

import java.util.HashMap;
import java.util.Map;
import java.lang.String;
import java.util.List;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Abm;
import org.fautapo.domain.Clientes;
import org.fautapo.domain.Programas;  
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

public class ListarNroEstProgAprReprAbanMaterias implements Controller {

  private MiFacade mi;
  public void setMi(MiFacade mi) {
    this.mi = mi;
  }

  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    Map modelo = new HashMap();
    
    Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
    if(cliente==null) return new ModelAndView("Aviso", "mensaje", "Su sesion ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");    
    int id_programa = cliente.getId_programa();

    String sGestion = request.getParameter("gestion"); 
    String sPeriodo = request.getParameter("periodo"); 
    String sPlan = request.getParameter("plan");
    String sDatos[] = sPlan.split("/");
    String splan = sDatos[0];
    String sid_tipo_grado = sDatos[1];
    
    //Convertimos a entero los datos necesarios
    int plan = Integer.parseInt(splan);
    int iGestion = Integer.parseInt(sGestion);
    int iPeriodo = Integer.parseInt(sPeriodo);
    int id_tipo_grado = Integer.parseInt(sid_tipo_grado);

    //Sacando la lista de estudiantes matriculados
    Estudiantes datosEst = new Estudiantes();
    datosEst.setPlan(plan);
    datosEst.setId_tipo_grado(id_tipo_grado);
    datosEst.setId_programa(id_programa);
    datosEst.setGestion(iGestion);
    datosEst.setPeriodo(iPeriodo);
    List lEstudiantes = this.mi.getListarNroEstProgAprReprAbaMaterias(datosEst);
    modelo.put("listaEstudiantes", lEstudiantes);
    
    modelo.put("gestion", sGestion);
    modelo.put("periodo", sPeriodo);
    
    //sacamos el programa
    Programas programa = new Programas();
    programa.setId_programa(id_programa); 
    programa = this.mi.getPrgBuscarPrograma(programa);
    modelo.put("programa", programa.getPrograma());
    
    //Sacamos los datos de la institucion
    Instituciones datosInstitucion = new Instituciones();
    datosInstitucion.setId_institucion(1); //--------------------------ESTATICO
    datosInstitucion = this.mi.getBuscarInstitucion(datosInstitucion);
    if (datosInstitucion !=null) {
      modelo.put("datosInstitucion", datosInstitucion);
    }
    
    //Sacamos el formato de la fecha
    Abm formatoFecha = new Abm();
    formatoFecha.setCampo("formato_fecha");
    formatoFecha.setCodigo("dibrap");
    modelo.put("formatoFecha", this.mi.getDibBuscarParametro(formatoFecha));

    return new ModelAndView("reportesAcademicos/verNroEstProgAprReprAbanMaterias/ListarNroEstProgAprReprAbanMaterias", modelo);
  }
}