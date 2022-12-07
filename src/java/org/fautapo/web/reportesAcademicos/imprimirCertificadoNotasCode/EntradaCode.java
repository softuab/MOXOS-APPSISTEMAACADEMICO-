package org.fautapo.web.reportesAcademicos.imprimirCertificadoNotasCode;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import org.fautapo.domain.Usuarios;
import org.fautapo.domain.Perfiles;
import org.fautapo.domain.Literales;
import org.fautapo.domain.Postulantes;
import org.fautapo.domain.Estudiantes;
import org.fautapo.domain.Personas;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-04-05
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-04-05
 */


public class EntradaCode implements Controller {

  private MiFacade mi;
  public void setMi(MiFacade mi) { this.mi = mi; }

  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    Map modelo = new HashMap();
	//Sacamos los datos de la session
    Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
    if(cliente==null) return new ModelAndView("Aviso", "mensaje", "Su sesion ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");
 
	String sNro_recibo = cliente.getString(request, "nrocertificado");
	String sClave = cliente.getString(request, "clave"+ request.getParameter("hora"));
	 
	if (sNro_recibo != "" && sClave!= "") {
	modelo.put("nrocertificado",sNro_recibo);
    //contraseña
    if("".equals(sClave)) return new ModelAndView("reportesAcademicos/imprimirCertificadoNotasCode/Entrada", null);
    //Comprobamos la clave del usuario
    Usuarios usuario = new Usuarios();
    usuario.setId_usuario(cliente.getId_usuario());
    usuario.setClave(sClave);
    if (this.mi.getVerificarUsuario(usuario) == 0) 
      return new ModelAndView("reportesAcademicos/imprimirCertificadoNotasCode/Error", "mensaje", "Clave incorrecta, vuelva a intentar.");
    //fin contraseña

	//Sacamos los datos para la impresion del RECIBO
    Perfiles datosTransaccion = new Perfiles();
    datosTransaccion.setNro_recibo(sNro_recibo);
	datosTransaccion.setIns_sede(cliente.getId_almacen());
	
	//CONTROL DE NRO TRANSACCION
	int control_nro;
	Estudiantes nro = new Estudiantes();
    nro.setnro_transaccion(sNro_recibo);
	 control_nro = this.mi.getbuscarnrotransacciones(nro);
	 if (control_nro== 1) {
        return new ModelAndView("reportesAcademicos/imprimirCertificadoNotasCode/Aviso","mensaje","El numero de Recibo  "+ sNro_recibo + " ya se ultilizo. Verifique el dato.");
     }
	//
 
    //Sacamos los datos de la transaccion
	    datosTransaccion=this.mi.getTrnBuscarTransaccionReciboSede(datosTransaccion);
    //Control Nro Recibo No existe
	 if (datosTransaccion == null) {
        return new ModelAndView("reportesAcademicos/imprimirCertificadoNotasCode/Aviso","mensaje","No existe el Recibo  "+ sNro_recibo + ". Verifique el dato.");
      }
	  
    //fin control
	
    Literales literal = new Literales();
    modelo.put("literal", literal.convert(datosTransaccion.getPagado()));
    datosTransaccion.setIns_sede(cliente.getId_almacen());
    //Sacamos el listado de trn_detalles
		
    List lDetalles = this.mi.getTrnListarTransaccionesReciboSede(datosTransaccion);
	
	// 	Control Solo valorado de certificado de notas
		Perfiles datosPerfiles = new Perfiles();
	  
	    for (int i=0; i<lDetalles.size();i++) {
        datosPerfiles = (Perfiles) lDetalles.get(i);
        }
		
    if (datosPerfiles.getId_concepto()!= 27 && 
        datosPerfiles.getId_concepto()!= 31 && 
        datosPerfiles.getId_concepto()!= 42) 
		return new ModelAndView("Aviso", "mensaje", "El nro de recibo no es valido para emitir un certificado.");
	
	 	System.out.println("objeto datosPerfiles CONCEPTO --> "+ datosPerfiles.getId_concepto());
 	// Fin control
	
	    String x=Integer.toString(datosPerfiles.getId_concepto());
		System.out.println("CONCEPTO --> "+ x);
			modelo.put("x", x);
	        modelo.put("lDetalles", lDetalles);
    // System.out.println("objeto datosPerfiles --> "+ lDetalles.getId_concepto());
    // Datos de la Persona
    if (datosTransaccion.getId_persona() > 0) {
      if (datosTransaccion.getId_programa() > 0)
	
	  {
        Estudiantes estudiante = new Estudiantes();
        estudiante.setId_persona(datosTransaccion.getId_persona());
        estudiante.setId_programa(datosTransaccion.getId_programa());
	      estudiante = this.mi.getMiPrsBuscarEstudiante(estudiante);
	      estudiante = this.mi.getEstBuscarEstudianteNombres(estudiante);
        modelo.put("estudiante", estudiante);
      } else {
        Personas persona = new Personas();
        persona.setId_persona(datosTransaccion.getId_persona());
        persona = this.mi.getPrsBuscarPersona(persona);
        modelo.put("estudiante", persona);
      }
    } else if (datosTransaccion.getId_persona_pst() > 0) {
      Postulantes postulante = new Postulantes();
      postulante.setId_persona(datosTransaccion.getId_persona_pst());
      if (datosTransaccion.getId_programa() > 0) {
        postulante.setId_programa(datosTransaccion.getId_programa());
	      postulante = this.mi.getMiPrsBuscarPostulante(postulante);
        postulante = this.mi.getPstBuscarPostulanteNombres(postulante);
      } else
        postulante = this.mi.getPstBuscarPersona(postulante);
      modelo.put("estudiante", postulante);
    }
	
	
	////////////////////////////////////
	//CONTROL DEL AÑO
	
	//Sacamos la gestion del recibo
	String aux_gestion =" ";
	String sControl_numero[] = sNro_recibo.split("/");// Separador de campos
        for (int i = 0; i < sControl_numero.length; i++) {
	        System.out.println("la gestion --> "+ sControl_numero[i]);
		    aux_gestion =sControl_numero[i];
	    }
	 System.out.println("aqui la variable aux_gestion "+ aux_gestion);
	//fin
	
	int gestion_actualR = cliente.getGestion();// variable para control recibo
	
	
	//Control emitir certificado solo de recibo de un anio anterior
	if ((Integer.parseInt(aux_gestion))>= ((gestion_actualR) -1)){
		
		return new ModelAndView("reportesAcademicos/imprimirCertificadoNotasCode/ListarProgramasPlanes", modelo);
	}else{
		return new ModelAndView("Aviso", "mensaje", "Su numero de recibo ya caduco para emitir un certificado. La validez del valorado es de un anio");
		 }
	
	//FIN CONTROL DEL AÑO
	////////////////////////////////////
	
	//return new ModelAndView("reportesAcademicos/imprimirCertificadoNotasCode/ListarProgramasPlanes", modelo);		
	}
   modelo.put("usuario", cliente.getNombres());
   
   return new ModelAndView("reportesAcademicos/imprimirCertificadoNotasCode/Entrada", modelo);
  }
}
