package org.fautapo.web.administrarRegularizacionesBloqueos;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Usuarios;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


/**
 * @autor FAUTAPO
 * @fec_registro 2006-04-05
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-04-05
 */


public class ComprobarEntradaregulBlo implements Controller {

  private MiFacade mi;
  public void setMi(MiFacade mi) { this.mi = mi; }

  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    Map modelo = new HashMap();
     
    //Sacamos los datos de la session
    Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
    if(cliente==null) return new ModelAndView("Aviso", "mensaje", "Su sesion ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");
    String sId_estudiante = request.getParameter("id_estudiante");
    
    if("".equals(sId_estudiante)) {
      // Comprobamos si es quien debe ingresar al modulo, de acuerdo a su clave
      Usuarios usuario = new Usuarios();
      usuario.setId_usuario(cliente.getId_usuario());
      usuario.setClave(request.getParameter("clave" + request.getParameter("hora")));
      if (null == this.mi.getComprobarUsuario(usuario)) {
        modelo.put("mensaje", "Clave incorrecta, por favor intente nuevamente");
        return new ModelAndView("administrarRegularizacionesBloqueos/Error", modelo);
      }
    }  
    return new ModelAndView("administrarRegularizacionesBloqueos/BuscarEstudiantes", modelo);
  }
}
