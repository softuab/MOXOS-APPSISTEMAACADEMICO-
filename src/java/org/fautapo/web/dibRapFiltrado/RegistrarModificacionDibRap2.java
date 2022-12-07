package org.fautapo.web.dibRapFiltrado;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Abm;
import org.fautapo.domain.Enlaces;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2005-11-01
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2005-11-01
*/

public class RegistrarModificacionDibRap2 implements Controller {

  private MiFacade mi;
  public void setMi(MiFacade mi) { this.mi = mi; }

  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    Map modelo = new HashMap();

    Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
    String sId_enlace = request.getParameter("e");
    String sPermiso = request.getParameter("p");
    modelo.put("id_enlace", sId_enlace);
    modelo.put("permiso", sPermiso);
    String sFiltro = request.getParameter("f"); // Condicion (filtro)
    modelo.put("condicion", sFiltro);
    int iId_tabla = Integer.parseInt(request.getParameter("t"));
    String sValoresPrimarios = request.getParameter("c");

    Abm tabla = new Abm();
    tabla.setId_tabla(iId_tabla);
    tabla = this.mi.getBuscarTabla(tabla);
    modelo.put("tabla", tabla);

    List listaCampos;
    tabla.setPermiso("m");
    String sId_actividad = request.getParameter("a");
    if (!"".equals(sId_actividad)) {  // Variable viene desde huaica
      tabla.setColumnas(Integer.parseInt(sId_actividad));  // columnas <- id_actividad
      listaCampos = this.mi.getListarCamposTablaActividad(tabla);
      modelo.put("id_actividad", sId_actividad);
    } else {  // dibRap cl�sico
      // Inicio Combustible
      //buscar enlace en "_dib_enl_campos"
      Enlaces enlace = new Enlaces();
      enlace.setId_enlace(Integer.parseInt(sId_enlace));
      enlace = this.mi.getEnlBuscarEnlace(enlace);
      if (enlace != null) {
        tabla.setColumnas(Integer.parseInt(sId_enlace));  // columnas <- id_enlace
        listaCampos = this.mi.getEnlListarCamposTabla(tabla);
      }
      // Fin Combustible
      else {
        listaCampos = this.mi.getListarCamposTabla(tabla);
      }
    }

    modelo.put("listaCampos", listaCampos);
    String sql = "UPDATE " + tabla.getTabla() +" SET ";
    for (int i = 0; i < listaCampos.size(); i++) {
      Abm campo = (Abm) listaCampos.get(i);
      sql = sql + campo.getCampo() + " = '" + request.getParameter(campo.getCampo()) + "'::" + campo.getTipo_dato() + ", ";
    }
    sql = sql + "ult_usuario = " + cliente.getId_usuario() + " WHERE id_estado = 'A' ";
    tabla.setPermiso("p");
    List listaLlavesPrimarias = this.mi.getListarCamposTabla(tabla);
    //modelo.put("listaLlavesPrimarias", listaLlavesPrimarias);
    String vValoresPrimarios[] = sValoresPrimarios.split("#~~#");
    for (int i = 0; i < listaLlavesPrimarias.size(); i++) {
      Abm campo = (Abm) listaLlavesPrimarias.get(i);
      sql = sql + " AND " + campo.getCampo() + " = '" + vValoresPrimarios[i] + "'::" + campo.getTipo_dato();
    }
    tabla.setSql(sql);
    
    try {
      this.mi.setEjecutarConsulta(tabla);
      modelo.put("mensaje", "Los datos se registraron correctamente");
    } catch (Exception e) {
      System.out.println("dibRap - ERROR: " + e.getMessage());
      return new ModelAndView("Error", "mensaje", "Hubo un error al realizar la transacci�n en la relaci�n '" + tabla.getTabla() + "'<br>Mensaje :: " + e.getMessage() + "<br>SQL='" + sql + "'");
    }
    return new ModelAndView("dibRapFiltrado/Aviso", modelo);
  }
}