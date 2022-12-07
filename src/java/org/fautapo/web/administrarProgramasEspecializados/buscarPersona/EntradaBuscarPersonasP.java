package org.fautapo.web.administrarProgramasEspecializados.buscarPersona;

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
 * @fec_registro 2006-01-13
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-07-17
 */

public class EntradaBuscarPersonasP implements Controller {

  private MiFacade mi;

  public void setMi(MiFacade mi) {
    this.mi = mi;
  }

  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    Map modelo = new HashMap();
    
    Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
    if(cliente==null) return new ModelAndView("Aviso", "mensaje", "Su sesi�n ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");
    
    //Para Wayka
    String sId_tramite = request.getParameter("id_tramite");
    String sId_proceso = cliente.getString(request, "id_proceso");
    if((sId_proceso != null) && (!"".equals(sId_proceso))){
      Actividades datosProceso = new Actividades();
      datosProceso.setId_proceso(Integer.parseInt(sId_proceso));
      datosProceso = this.mi.getBuscarProceso(datosProceso);
      modelo.put("datosProceso", datosProceso);
      
    }  
    modelo.put("id_proceso", sId_proceso);
    modelo.put("id_tramite", sId_tramite);

    return new ModelAndView("administrarProgramasEspecializados/buscarPersona/EntradaBuscarPersonas", modelo);
  }
}