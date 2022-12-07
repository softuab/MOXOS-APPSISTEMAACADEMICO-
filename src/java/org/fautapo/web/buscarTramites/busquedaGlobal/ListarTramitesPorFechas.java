package org.fautapo.web.buscarTramites.busquedaGlobal;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Tramites;
import org.fautapo.domain.Abm;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-03-30
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-03-30
*/

public class ListarTramitesPorFechas implements Controller {

  private MiFacade mi;
  public void setMi(MiFacade mi) { this.mi = mi; }
 
  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    Map modelo = new HashMap();
    
    Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
    String sAccion = request.getParameter("boton");
    String sEstado = request.getParameter("estado");
    String sId_proceso = request.getParameter("id_proceso");
    String sId_ubicacion_organica = request.getParameter("id_ubicacion_organica");
    String sFecha_ini = request.getParameter("fecha_ini");
    String sFecha_fin = request.getParameter("fecha_fin");

    Tramites datosTramite = new Tramites();
    datosTramite.setFecha_ini(sFecha_ini);
    datosTramite.setFecha_fin(sFecha_fin);
    datosTramite.setId_ubicacion_organica(Integer.parseInt(sId_ubicacion_organica));
    datosTramite.setId_proceso(Integer.parseInt(sId_proceso));
    if ("Iniciados".equals(request.getParameter("estado"))) {
      List lTramites = this.mi.getListarTramitesIniciadosDetalle(datosTramite);
      for (int i = 0; i < lTramites.size(); i++) {
        Tramites auxiliar = (Tramites) lTramites.get(i);
        auxiliar.setLista(this.mi.getListarCamposReferencia(auxiliar));
        lTramites.set(i, auxiliar);
      }
      modelo.put("lTramites", lTramites);
    }
    if ("Movidos".equals(request.getParameter("estado"))) {
      List lTramites = this.mi.getListarTramitesMovidosDetalle(datosTramite);
      for (int i = 0; i < lTramites.size(); i++) {
        Tramites auxiliar = (Tramites) lTramites.get(i);
        auxiliar.setLista(this.mi.getListarCamposReferencia(auxiliar));
        lTramites.set(i, auxiliar);
      }
      modelo.put("lTramites", lTramites);
    }
    if ("Concluidos".equals(request.getParameter("estado"))) {
      List lTramites = this.mi.getListarTramitesConcluidosDetalle(datosTramite);
      for (int i = 0; i < lTramites.size(); i++) {
        Tramites auxiliar = (Tramites) lTramites.get(i);
        auxiliar.setLista(this.mi.getListarCamposReferencia(auxiliar));
        lTramites.set(i, auxiliar);
      }
      modelo.put("lTramites", lTramites);
    }
    modelo.put("fecha_ini", sFecha_ini);
    modelo.put("fecha_fin", sFecha_fin);

    //Sacamos el formato de la fecha definida en parametros
    Abm formatoFecha = new Abm();
    formatoFecha.setCampo("formato_fecha");
    formatoFecha.setCodigo("dibrap");
    modelo.put("formatoFecha", this.mi.getDibBuscarParametro(formatoFecha));
    //FIN - Sacamos el formato de la fecha definida en parametros

    //Sacamos el formato de la hora definida en parametros
    Abm formatoHora = new Abm();
    formatoHora.setCampo("formato_hora");
    formatoHora.setCodigo("dibrap");
    modelo.put("formatoHora", this.mi.getDibBuscarParametro(formatoHora));
    //FIN - Sacamos el formato de la hora definida en parametros

    return new ModelAndView("buscarTramites/busquedaGlobal/ListarTramitesPorFechas", modelo);
  }
}