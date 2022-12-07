package org.fautapo.web.waykaDibRep;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Abm;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2005-11-01
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2005-11-01
*/

public class RegistrarBorrado implements Controller {

  private MiFacade mi;
  public void setMi(MiFacade mi) { this.mi = mi; }

  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    Map modelo = new HashMap();

    Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");

    String sConsulta = request.getParameter("c");


    Abm consulta = new Abm();
    consulta.setId_consulta(Integer.parseInt(sConsulta));
    
    int iResultado = this.mi.setBorrarConsulta(consulta);

    if (iResultado == 0) {
      return new ModelAndView("Error", "mensaje", "No se puede eliminar este registro");
    } else { 
      modelo.put("mensaje", "La transaccion se registro correctamente");
      return new ModelAndView("dibRep/Aviso", modelo);
    }
  }
}