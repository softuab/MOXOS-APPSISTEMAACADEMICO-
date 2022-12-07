package org.fautapo.web.administrarCertificados.eliminarCertificados;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Estudiantes;

import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-03-30
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-03-30
*/

public class BorrarCertificadoEliminar implements Controller {

  private MiFacade mi;
  public void setMi(MiFacade mi) { this.mi = mi; }

  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    Map modelo = new HashMap();
    Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
    if (cliente == null) { return new ModelAndView("Error", "mensaje", "Tu sesi�n termino. Por favor, ingresa nuevamente."); }

    String iId_certificados_generados = request.getParameter("id_certificados_generados");
	String sObs = request.getParameter("obs");
	String sTipo_cert = cliente.getString(request, "tipo_cert");
	
    Estudiantes certificado = new Estudiantes();
	certificado.setid_certificados_generados(Integer.parseInt(iId_certificados_generados));
	certificado.setobs(sObs);
	certificado.setUlt_usuario(cliente.getId_usuario());
	this.mi.setEliminarCertificadoNotas(certificado);
	////////////////

    modelo.put("mensaje", "Se anulo el Certificado de notas");
    
    return new ModelAndView("administrarCertificados/eliminarCertificados/Aviso", modelo);
  }
}