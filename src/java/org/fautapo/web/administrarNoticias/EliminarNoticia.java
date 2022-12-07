package org.fautapo.web.administrarNoticias;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Tableros;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-04_03
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-04-03
*/

public class EliminarNoticia implements Controller {

  private MiFacade mi;
  public void setMi(MiFacade mi) { this.mi = mi; }

  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    Map modelo = new HashMap();
    
    Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");

    String sId_tablero = request.getParameter("id_tablero");
    String sBoton = request.getParameter("boton");
    
    //Sacamos los datos del tablero
    Tableros datosTablero = new Tableros();
    datosTablero.setId_tablero(Integer.parseInt(sId_tablero));
    datosTablero = this.mi.getBuscarTablero(datosTablero);
    modelo.put("datosTablero", datosTablero);
    
    if ("Aceptar".equals(sBoton)) {
      int iResultado = this.mi.setEliminarTablero(datosTablero);
      if (iResultado == 0) {
        return new ModelAndView("Error", "mensaje", "La noticia no se elimin�");
      }
      else {
        return new ModelAndView("Aviso", "mensaje", "La noticia se elimin� correctamente");
      }
    }

    return new ModelAndView("administrarNoticias/EliminarNoticia", modelo);
  }
}