
package org.fautapo.web.administrarCertificados.reporteAnulados;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Abm;
import org.fautapo.domain.Clientes;
import org.fautapo.domain.Accesos;
import org.fautapo.domain.Funciones;
import org.fautapo.domain.Perfiles;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ListarCondicionesRepAnul implements Controller {
  private MiFacade mi;
  public void setMi(MiFacade mi) { this.mi = mi; }
  
  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    Map modelo = new HashMap();
	
	Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
    if (cliente==null) return new ModelAndView("Aviso", "mensaje", "Su sesion termino, debe volver a la pagina inicial e ingresar de nuevo.");
    Funciones f = new Funciones(request, modelo, mi);
    Abm formatoFecha = new Abm();
    formatoFecha.setCampo("formato_fecha");
    formatoFecha.setCodigo("dibrap");
    modelo.put("formatoFecha", this.mi.getDibBuscarParametro(formatoFecha));
	//control por sede
	System.out.println("rolcito en certificadoCODE-"+cliente.getRol());	
	String idSede = Integer.toString(cliente.getId_almacen());
	System.out.println("Sede-"+idSede);
	
    modelo.put("idSede", idSede);
	modelo.put("usuario", cliente.getNombres());
	modelo.put("Rol", cliente.getRol());
	//
    Perfiles perfil = new Perfiles();
    perfil.setGestion(cliente.getGestion());
    perfil.setPeriodo(cliente.getPeriodo());
    //modelo.put("lCajeros", this.mi.getTrnListarCajeros(perfil));
	modelo.put("cliente", cliente);
    modelo.put("acceso", (Accesos) request.getSession().getAttribute("__sess_acceso"));
	
    return new ModelAndView("administrarCertificados/reporteAnulados/ListarCondiciones", modelo);
  }
}