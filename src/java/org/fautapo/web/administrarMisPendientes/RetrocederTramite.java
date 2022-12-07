package org.fautapo.web.administrarMisPendientes;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Tramites;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-03-24
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-03-24
*/

public class RetrocederTramite implements Controller {

  private MiFacade mi;
  public void setMi(MiFacade mi) { this.mi = mi; }

  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    Map modelo = new HashMap();

    //Sacamos los datos de la session
    Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
 
    //RECUPERANDO EL ESTADO Y FECHAS 
    String sFecha_ini = request.getParameter("fechainicio"); //AQUI 4
    String sFecha_fin = request.getParameter("fechafin");
    String sFechadellunes = request.getParameter("fechadellunes");
    String sId_estado = request.getParameter("id_estado");
    String sProveido = request.getParameter("proveido");
    String sId_tramite = request.getParameter("id_tramite");
    String sId_actividad = request.getParameter("id_actividad");
    String sNro_pagina = request.getParameter("nro_pagina");

    modelo.put("nro_pagina", sNro_pagina);
    modelo.put("fechainicio", sFecha_ini);
    modelo.put("fechafin", sFecha_fin);
    modelo.put("fechadellunes", sFechadellunes);
    modelo.put("id_estado", sId_estado);
    //FIN RECUPERA

    if ("".equals(sProveido)) {
      modelo.put("id_tramite", sId_tramite);
      modelo.put("id_actividad", sId_actividad);
      return new ModelAndView("administrarMisPendientes/RetrocederTramite", modelo);
    }
    
    //Retrocedemos el tramite
    Tramites datosTramite = new Tramites();
    datosTramite.setId_tramite(Integer.parseInt(sId_tramite));
    datosTramite.setProveido(sProveido);
    datosTramite.setId_tipo_proveido(2); // Tipo de proveido que identifica un retroceso
    datosTramite.setUlt_usuario(cliente.getId_usuario());
    int iResultado = this.mi.setRetrocederTramite(datosTramite);
    if (iResultado == 0) {
      return new ModelAndView("Error", "mensaje", "El tr�mite no se pudo retroceder");
    }

    //Para listar mis pendientes
    if ((sId_estado ==null) || ("".equals(sId_estado))) {
      datosTramite.setPara(cliente.getId_usuario());
      List lTramites = this.mi.getListarTramitesMios(datosTramite);
      for (int i = 0; i < lTramites.size(); i++) {
        Tramites auxiliar = (Tramites) lTramites.get(i);
        if (auxiliar.getId_tipo_actuacion() == 2) {
          auxiliar.setOrden(Integer.parseInt(auxiliar.getActuacion()));
        }
        else {
          auxiliar.setOrden(0);
        }
        auxiliar.setUsuarios(this.mi.getListarUsuariosActividadSiguiente(auxiliar));
        auxiliar.setFilas(auxiliar.getUsuarios().size());
        auxiliar.setLista(this.mi.getListarCamposReferencia(auxiliar));
        lTramites.set(i, auxiliar);
      }
      modelo.put("lMisPendientes", lTramites);
      return new ModelAndView("administrarMisPendientes/ListarMisPendientes", modelo);
    }
    else{
      //Para listar mis pendientes agrupados
      datosTramite.setPara(cliente.getId_usuario());
      datosTramite.setId_estado(sId_estado);
      if (((!"".equals(sFecha_ini)) && (!"".equals(sFecha_fin))) && ((sFecha_ini != null) &&(sFecha_fin != null))) {
        String sFechainicio[] = sFecha_ini.split("/");
        int iAnio1 = Integer.parseInt(sFechainicio[2]) - 1900;
        int iMes1 = Integer.parseInt(sFechainicio[1]) -1;
        int iDia1 = Integer.parseInt(sFechainicio[0]);
        String sFechafin[] = sFecha_fin.split("/");
        int iAnio2 = Integer.parseInt(sFechafin[2]) -1900;
        int iMes2 = Integer.parseInt(sFechafin[1]) -1;
        int iDia2 = Integer.parseInt(sFechafin[0]);
    		    
        Date dFechainicio1 = new Date(iAnio1, iMes1, iDia1);
        Date dFechafin1 = new Date(iAnio2, iMes2, iDia2);
        Date dFechainicio2 = new Date(sFecha_ini);
        Date dFechafin2 = new Date(sFecha_ini);
      
        datosTramite.setFechaini(dFechainicio1);
        datosTramite.setFechafin(dFechafin1);
        List lTramites = this.mi.getListarTramitesMiosAgrupados(datosTramite);  // CAMBIAR AQUI ***********************
	modelo.put("fechainicio", sFecha_ini);
        modelo.put("fechafin", sFecha_fin);
	
	for (int i = 0; i < lTramites.size(); i++) {
          Tramites auxiliar = (Tramites) lTramites.get(i);
          if (auxiliar.getId_tipo_actuacion() == 2) {
            auxiliar.setOrden(Integer.parseInt(auxiliar.getActuacion()));
          }
          else {
            auxiliar.setOrden(0);
          }
          auxiliar.setUsuarios(this.mi.getListarUsuariosActividadSiguiente(auxiliar));
          auxiliar.setFilas(auxiliar.getUsuarios().size());
          auxiliar.setLista(this.mi.getListarCamposReferencia(auxiliar));
          lTramites.set(i, auxiliar);
        }
        modelo.put("lMisPendientes", lTramites);
      }
      else {
        String sFecha_lunes[] = sFechadellunes.split("/");
        int iAnio1 = Integer.parseInt(sFecha_lunes[2]) - 1900;
        int iMes1 = Integer.parseInt(sFecha_lunes[1]) -1;
        int iDia1 = Integer.parseInt(sFecha_lunes[0]);      
        Date dFecha_lunes_fin = new Date(iAnio1, iMes1, iDia1);
	
        //Date fechaentrada = new Date(fechadellunes);
        datosTramite.setFechafin(dFecha_lunes_fin);
	
	List lTramites = this.mi.getListarTramitesMiosAgrupados(datosTramite);
	modelo.put("fechadellunes", sFechadellunes);
	for (int i = 0; i < lTramites.size(); i++) {
          Tramites auxiliar = (Tramites) lTramites.get(i);
          if (auxiliar.getId_tipo_actuacion() == 2) {
            auxiliar.setOrden(Integer.parseInt(auxiliar.getActuacion()));
          }
          else {
            auxiliar.setOrden(0);
          }
          auxiliar.setUsuarios(this.mi.getListarUsuariosActividadSiguiente(auxiliar));
          auxiliar.setFilas(auxiliar.getUsuarios().size());
          auxiliar.setLista(this.mi.getListarCamposReferencia(auxiliar));
          lTramites.set(i, auxiliar);
        }
	modelo.put("lMisPendientes", lTramites);
      }
      return new ModelAndView("administrarMisPendientesAgrupados/MostrarTramitesMiosAgrupadosEstadoSalida", modelo);
    }//FIN ENTRANDO AGRUPADOS
  }
}