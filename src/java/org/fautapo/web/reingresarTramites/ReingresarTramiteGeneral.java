package org.fautapo.web.reingresarTramites;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Tramites;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-04-01
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-04-01
*/

public class ReingresarTramiteGeneral implements Controller {

  private MiFacade mi;
  public void setMi(MiFacade mi) { this.mi = mi;}
  
  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    Map modelo = new HashMap();

    String sSw="0";

    //Sacamos los datos de la session
    Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
    int iId_usuario = cliente.getId_usuario();

    //Sacamos valores del jsp
    String sBoton = request.getParameter("boton");
    String sBoton1 =request.getParameter("boton1");
    String sId_tramite = request.getParameter("id_tramite");
    String sId_tramite_dato = request.getParameter("id_tramite_dato");
    int iContador=0;
    
    if (("Buscar".equals(sBoton)) && (!"".equals(sId_tramite)) && (sId_tramite !=null)) {
      try {
        //Aseguramos de que se haya introducido un id_tramite entero
        int iId_tramite = Integer.parseInt(request.getParameter("id_tramite"));
      }
      catch(Exception e) { 
        return new ModelAndView("reingresarTramites/ReingresarTramiteGeneral", modelo);
      }
    
      //Sacamos los datos del tramite
      Tramites datosTramite = new Tramites();
      datosTramite.setId_tramite(Integer.parseInt(sId_tramite));
      datosTramite = this.mi.getBuscarTramite2(datosTramite); //Sacamos datos del tramite actual
      if (datosTramite != null) {
        if (datosTramite.getId_tipo_actuacion()==2) {
          datosTramite.setOrden(Integer.parseInt(datosTramite.getActuacion()));
        }
        else {
          datosTramite.setOrden(0);
        }
        datosTramite.setUsuarios(this.mi.getListarUsuariosActividadSiguiente(datosTramite));
        datosTramite.setFilas(datosTramite.getUsuarios().size());
        datosTramite.setLista(this.mi.getListarCamposReferencia(datosTramite));
      }
      modelo.put("datosTramite", datosTramite);
      sSw="1";
    }
    if (("Reingresar").equals(sBoton1) &&(!"".equals(sId_tramite_dato))) {
      //Reingresando el tramite
      Tramites reingresar = new Tramites();
      reingresar.setId_tramite(Integer.parseInt(request.getParameter("id_tramite_dato")));    
      int iResultado = this.mi.setReingresarTramite(reingresar);
      if (iResultado == 1) {
        sSw ="0";
      }
    }
    
    modelo.put("id_tramite",sId_tramite);  
    modelo.put("sw", sSw);
    
    return new ModelAndView("reingresarTramites/ReingresarTramiteGeneral", modelo);
  }
}