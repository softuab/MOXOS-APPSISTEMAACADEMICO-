package org.fautapo.web.administrarKardex.administrarMisPendientesKardex;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.fautapo.domain.Clientes;
import org.fautapo.domain.Actividades;
import org.fautapo.domain.Personas;
import org.fautapo.domain.Tramites;
import org.fautapo.domain.EnviarCorreo;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-03-23
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-03-23
*/

public class ListarMisPendientesKardex implements Controller {

  private MiFacade mi;
  public void setMi(MiFacade mi) { this.mi = mi; }

  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    Map modelo = new HashMap();
    Tramites datosFrLog = new Tramites(); Tramites datosTramite = new Tramites(); Character caracter;

    //Sacamos los datos de la session
    Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");

    String sId_proceso = request.getParameter("id_proceso");
    
    String sBanderaKardex = request.getParameter("banderakardex");
    modelo.put("banderakardex", sBanderaKardex);
    String sId_tramite = request.getParameter("id_tramite");
    String sId_form = request.getParameter("id_form");
    String sId_actividad = request.getParameter("id_actividad");
    String sAccion = request.getParameter("accion");
    String sId_tipo_proceso = request.getParameter("id_tipo_proceso");
    String sId_tipo_actuacion = request.getParameter("id_tipo_actuacion");
    String sPara = request.getParameter("para");
    String sNro_pagina = request.getParameter("nro_pagina");
    if ((sNro_pagina == null) || ("".equals(sNro_pagina))) {
      sNro_pagina = "0";
    }
    int iNro_pagina_siguiente = Integer.parseInt(sNro_pagina) + 1;
    int iNro_pagina_anterior = Integer.parseInt(sNro_pagina) - 1;
    modelo.put("nro_pagina", sNro_pagina);
    modelo.put("nro_pagina_siguiente", Integer.toString(iNro_pagina_siguiente));
    modelo.put("nro_pagina_anterior", Integer.toString(iNro_pagina_anterior));
    modelo.put("id_tipo_proceso", sId_tipo_proceso);
   
    //Lista Tipos procesos 
    List lTiposProcesos = this.mi.getListarTiposProcesos();  //NO SE ESTA USANDO
    modelo.put("lTiposProcesos", lTiposProcesos);

    //Para registrar como recibido
    if ("Recibir".equals(sAccion)) {
      datosTramite.setId_tramite(Integer.parseInt(sId_tramite));
      datosTramite.setUlt_usuario(cliente.getId_usuario());
      int iResultado = this.mi.setRecibirTramite(datosTramite);
      if (iResultado == 0) {
        return new ModelAndView("Error", "mensaje", "No se pudo recibir el proceso");
      }
    }

    //Para avanzar el tramite
    if ("Avanzar".equals(sAccion)) {
      datosFrLog = new Tramites();
      datosFrLog.setId_tramite(Integer.parseInt(sId_tramite));
      datosFrLog.setId_proceso(Integer.parseInt(sId_proceso));
      datosFrLog.setId_form(Integer.parseInt(sId_form));
      datosFrLog.setId_actividad(Integer.parseInt(sId_actividad));
      datosFrLog.setUlt_usuario(cliente.getId_usuario());
      datosFrLog = this.mi.getBuscarFrLog(datosFrLog);
      if (datosFrLog != null) {
        datosTramite.setId_tramite(Integer.parseInt(sId_tramite));
        datosTramite.setId_tipo_proveido(1); //Formulario
        if ((request.getParameter("actuacion") != null) && (!"".equals(request.getParameter("actuacion")))) {
          datosTramite.setId_tipo_actuacion(Integer.parseInt(sId_tipo_actuacion));
          datosTramite.setOrden(Integer.parseInt(request.getParameter("actuacion")));
        }
        else {
          datosTramite.setId_tipo_actuacion(1);
          datosTramite.setOrden(0);
        }
        if (sPara != null) {
          datosTramite.setPara(Integer.parseInt(sPara));
          int iResultado = this.mi.setAvanzarTramite(datosTramite);
          if (iResultado != 0) {
  	    //AQUI ENVIAMOS ALERTAS
	    //Sacamos los datos del tramite
	    datosTramite = new Tramites();
	    datosTramite.setId_tramite(Integer.parseInt(sId_tramite));
            datosTramite = this.mi.getBuscarTramite(datosTramite); //Sacamos datos del tramite actual
            //Sacamos los datos de la actividad actual
	    Actividades datosActividad = new Actividades();
	    datosActividad.setId_actividad(datosTramite.getId_actividad_actual());
            datosActividad = this.mi.getBuscarActividad(datosActividad);
	    if (datosActividad.getAlerta() == true) {
	      Personas datosPersona = new Personas();
	      datosPersona.setUlt_usuario(datosTramite.getPara());
              datosPersona = this.mi.getBuscarPersonaUsuario(datosPersona);
              // LISTA TIPOS ALERTAS
              List lAlertas = this.mi.getListarTiposAlertasAct(datosActividad);
	      for (int i=0; i < lAlertas.size(); i++) {
	        Actividades alertas = (Actividades) lAlertas.get(i);
                //Enviamos alerta al correo
    	        if ((alertas.getId_tipo_alerta() == 1) && (alertas.getId_actividad() != 0) && (!"".equals(datosPersona.getCorreo()))) {
	          try {
        	    EnviarCorreo correo = new EnviarCorreo();
	            correo.setTo(datosPersona.getCorreo());
	            correo.setSubject("WAYKA - "+ datosTramite.getId_tramite());
	            correo.setBody(datosTramite.getProceso()+" - "+datosTramite.getActividad());
	            correo.setEnviarCorreo();
		  } catch (Exception e) {
		    System.out.println("no se pudo enviar el correo al usuario"+datosPersona.getUlt_usuario());
		  }
	        }
	        //Enviamos alerta al celular
    	        if ((alertas.getId_tipo_alerta() == 2) && (alertas.getId_actividad() != 0) && (!"0".equals(datosPersona.getCelular()))) {
	          try {
        	    EnviarCorreo correo = new EnviarCorreo();
                    if ((datosPersona.getId_tipo_empresa_telefonica()) == 2) {
	              correo.setTo("591"+datosPersona.getCelular()+"@"+datosPersona.getDireccion());
		    }
		    else {
		      correo.setTo(datosPersona.getCelular()+"@"+datosPersona.getDireccion());
		    }
	            correo.setSubject("WAYKA - "+ datosTramite.getId_tramite());
	            correo.setBody(datosTramite.getProceso()+" - "+datosTramite.getActividad());
	            correo.setEnviarCorreo();
		  } catch (Exception e) {
		    System.out.println("no se pudo enviar el SMS al celular del usuario"+datosPersona.getUlt_usuario());
	  	  }
	        }
	      }
	    }
	    //FIN DEL ENVIO DE ALERTAS
	  }
        }
        else {
          datosTramite = new Tramites();
	  datosTramite.setId_tramite(Integer.parseInt(sId_tramite));
	  this.mi.setConcluirTramite(datosTramite);
        }
      }
      else{
        return new ModelAndView("Aviso", "mensaje", "Revise el formulario por favor");
      }
      //Modificar de estado el tramite en la tabla tr_fr_log
      datosFrLog = new Tramites();
      datosFrLog.setId_tramite(Integer.parseInt(sId_tramite));
      datosFrLog.setUlt_usuario(cliente.getId_usuario());
      int iResultado = this.mi.setEliminarFrLog(datosFrLog);
    }

    //Para retroceder el tramite
    if ("Retroceder".equals(sAccion)) {
      datosFrLog = new Tramites();
      datosFrLog.setId_tramite(Integer.parseInt(request.getParameter("id_tramite")));
      datosFrLog.setId_proceso(Integer.parseInt(request.getParameter("id_proceso")));
      datosFrLog.setId_form(Integer.parseInt(request.getParameter("id_form")));
      datosFrLog.setId_actividad(Integer.parseInt(request.getParameter("id_actividad")));    
      datosFrLog.setUlt_usuario(cliente.getId_usuario());
      datosFrLog = this.mi.getBuscarFrLog(datosFrLog);
      if (datosFrLog != null) {
        modelo.put("id_tramite", sId_tramite); 
        modelo.put("id_actividad", sId_actividad);
        modelo.put("para", sPara);
        return new ModelAndView("administrarMisPendientes/RetrocederTramite", modelo);
      }
      else {
        return new ModelAndView("Aviso", "mensaje", "Revise el formulario por favor");
      }
    }

    datosTramite.setPara(cliente.getId_usuario());
    System.out.println(datosTramite.getPara());
    datosTramite.setPagina(Integer.parseInt(sNro_pagina));
    System.out.println(datosTramite.getPagina());
    datosTramite.setId_proceso(Integer.parseInt(sId_proceso));
    List lTramites = this.mi.getListarTramitesMiosKardexPorProceso(datosTramite); //Kardex
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
    modelo.put("id_proceso", sId_proceso);
    //Colocamos el nombre de FAUTAPO
    String sInstitucion = (caracter = new Character((char)70)).toString()+(caracter = new Character((char)65)).toString()+(caracter = new Character((char)85)).toString();
    sInstitucion = sInstitucion+(caracter = new Character((char)84)).toString()+(caracter = new Character((char)65)).toString()+(caracter = new Character((char)80)).toString()+(caracter = new Character((char)79)).toString();
    modelo.put("institucion", sInstitucion);
    //FIN Colocamos el nombre de FAUTAPO
    
    //Buscamos el proceso 
    if(!"".equals(sId_proceso) && (sId_proceso != null)){      
      //Buscamos los datos del proceso
      Actividades datosProceso = new Actividades();
      datosProceso.setId_proceso(Integer.parseInt(sId_proceso));
      datosProceso = this.mi.getBuscarProceso(datosProceso);
      modelo.put("datosProceso", datosProceso);
      modelo.put("proceso", datosProceso.getProceso());
    }
    
    return new ModelAndView("administrarKardex/administrarMisPendientesKardex/ListarMisPendientesKardex", modelo);
  }
}