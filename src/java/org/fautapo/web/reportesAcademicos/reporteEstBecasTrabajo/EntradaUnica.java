package org.fautapo.web.reportesAcademicos.reporteEstBecasTrabajo;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Actividades;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-04-08
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-04-08
 */

public class EntradaUnica implements Controller {

  private MiFacade mi;

  public void setMi(MiFacade mi) {
    this.mi = mi;
  }

  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    Map modelo = new HashMap();
    
    Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
    if(cliente==null) return new ModelAndView("Aviso", "mensaje", "Su sesion ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");
    modelo.put("cliente",cliente);
    //buscamos la ubicacion organica
    Actividades actividad = new Actividades();
    actividad.setId_ubicacion_organica(cliente.getId_ubicacion_organica());    
    actividad=this.mi.getBuscarUbicacionOrganica(actividad); 
    modelo.put("ubicacion_organica",actividad);    
    
    return new ModelAndView("reportesAcademicos/reporteEstBecasTrabajo/EntradaUnica", modelo);
  }
}

