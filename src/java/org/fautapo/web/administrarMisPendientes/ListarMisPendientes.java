package org.fautapo.web.administrarMisPendientes;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.support.PagedListHolder;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Informes;
import org.fautapo.domain.Actividades;
import org.fautapo.domain.Personas;
import org.fautapo.domain.Tramites;
import org.fautapo.domain.EnviarCorreo;
import org.fautapo.domain.Abm;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-03-23
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-03-23
 */
public class ListarMisPendientes implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> modelo = new HashMap<>();
        Tramites datosFrLog = null;
        Tramites datosTramite = new Tramites(); 
        List<Tramites> lTramites;

        //Sacamos los datos de la session
        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");

        String sIdProceso = request.getParameter("id_proceso");
        String sIdTramite = request.getParameter("id_tramite");
        String sIdForm = request.getParameter("id_form");
        String sIdActividad = request.getParameter("id_actividad");
        String sAccion = request.getParameter("accion");
        String sIdTipoProceso = request.getParameter("id_tipo_proceso");
        String sIdTipoActuacion = request.getParameter("id_tipo_actuacion");
        String sPara = request.getParameter("para");
        String sBotoncillo = request.getParameter("_botoncillo");
        String sNroFiltro = request.getParameter("nro_filtro");
        String sNroPagina = request.getParameter("nro_pagina");

        if ((sNroPagina == null) || ("".equals(sNroPagina))) {
            sNroPagina = "1";
        }
 
        modelo.put("totalRegistros", 100);
        modelo.put("totalPaginas", 1);
        modelo.put("paginacion", 2);
        modelo.put("nro_pagina", sNroPagina);
        modelo.put("id_tipo_proceso", sIdTipoProceso);
 

        //Para registrar como recibido
        if ("Recibir".equals(sAccion)) {
            datosTramite.setId_tramite(Integer.parseInt(sIdTramite));
            datosTramite.setUlt_usuario(cliente.getId_usuario());
            int iResultado = this.mi.setRecibirTramite(datosTramite);
            if (iResultado == 0) {
                return new ModelAndView("Error", "mensaje", "No se pudo recibir el proceso");
            }
        }

        //Para avanzar el tramite
        if ("Avanzar".equals(sAccion)) {
            datosFrLog = new Tramites();
            datosFrLog.setId_tramite(Integer.parseInt(sIdTramite));
            datosFrLog.setId_proceso(Integer.parseInt(sIdProceso));
            datosFrLog.setId_form(Integer.parseInt(sIdForm));
            datosFrLog.setId_actividad(Integer.parseInt(sIdActividad));
            datosFrLog.setUlt_usuario(cliente.getId_usuario());
            datosFrLog = this.mi.getBuscarFrLog(datosFrLog);
            if (datosFrLog != null) {
                datosTramite.setId_tramite(Integer.parseInt(sIdTramite));
                datosTramite.setId_tipo_proveido(1); //Formulario
                if ((request.getParameter("actuacion") != null) && (!"".equals(request.getParameter("actuacion")))) {
                    datosTramite.setId_tipo_actuacion(Integer.parseInt(sIdTipoActuacion));
                    datosTramite.setOrden(Integer.parseInt(request.getParameter("actuacion")));
                } else {
                    datosTramite.setId_tipo_actuacion(1);
                    datosTramite.setOrden(0);
                }
                //Sacamos los datos de la actividad
                Actividades datosActividad = new Actividades();
                datosActividad.setId_actividad(Integer.parseInt(sIdActividad));
                datosActividad = this.mi.getBuscarActividad(datosActividad);

                //Si la actividad es fin de flujo entonces concluimos el tramite
                if (datosActividad.getFin_flujo()) {
                    Tramites datosConcluir = new Tramites();
                    datosConcluir.setId_tramite(Integer.parseInt(sIdTramite));
                    datosConcluir.setUlt_usuario(cliente.getId_usuario());
                    int iResultado = this.mi.setConcluirTramite(datosConcluir);
                    if (iResultado == 0) {
                        return new ModelAndView("Error", "mensaje", "El tramite no se pudo concluir");
                    }
                } else {
                    if (sPara != null) {
                        datosTramite.setPara(Integer.parseInt(sPara));
                        int iResultado = this.mi.setAvanzarTramite(datosTramite);
                        if (iResultado != 0) {
                            //AQUI ENVIAMOS ALERTAS
                            //Sacamos los datos del tramite
                            datosTramite = new Tramites();
                            datosTramite.setId_tramite(Integer.parseInt(sIdTramite));
                            datosTramite = this.mi.getBuscarTramite(datosTramite); //Sacamos datos del tramite actual
                            //Sacamos los datos de la actividad actual
                            if (datosActividad.getAlerta()) {
                                Personas datosPersona = new Personas();
                                datosPersona.setUlt_usuario(datosTramite.getPara());
                                datosPersona = this.mi.getBuscarPersonaUsuario(datosPersona);
                                // LISTA TIPOS ALERTAS
                                List<Actividades> lAlertas = this.mi.getListarTiposAlertasAct(datosActividad);
                                for (int i = 0; i < lAlertas.size(); i++) {
                                    Actividades alertas = (Actividades) lAlertas.get(i);
                                    //Enviamos alerta al correo
                                    if ((alertas.getId_tipo_alerta() == 1) && (alertas.getId_actividad() != 0) && (!"".equals(datosPersona.getCorreo()))) {
                                        try {
                                            EnviarCorreo correo = new EnviarCorreo();
                                            correo.setTo(datosPersona.getCorreo());
                                            correo.setSubject("WAYKA - " + datosTramite.getId_tramite());
                                            correo.setBody(datosTramite.getProceso() + " - " + datosTramite.getActividad());
                                            correo.setEnviarCorreo();
                                        } catch (Exception e) {
                                            
                                        }
                                    }
                                    //Enviamos alerta al celular
                                    if ((alertas.getId_tipo_alerta() == 2) && (alertas.getId_actividad() != 0) && (!"0".equals(datosPersona.getCelular()))) {
                                        try {
                                            EnviarCorreo correo = new EnviarCorreo();
                                            if ((datosPersona.getId_tipo_empresa_telefonica()) == 2) {
                                                correo.setTo("591" + datosPersona.getCelular() + "@" + datosPersona.getDireccion());
                                            } else {
                                                correo.setTo(datosPersona.getCelular() + "@" + datosPersona.getDireccion());
                                            }
                                            correo.setSubject("WAYKA - " + datosTramite.getId_tramite());
                                            correo.setBody(datosTramite.getProceso() + " - " + datosTramite.getActividad());
                                            correo.setEnviarCorreo();
                                        } catch (Exception e) {
                                            
                                        }
                                    }
                                }
                            }
                            //FIN DEL ENVIO DE ALERTAS
                        }
                    } else {
                        return new ModelAndView("Error", "mensaje", "El proceso no se pudo avanzar");
                    }
                }
            } else {
                return new ModelAndView("Aviso", "mensaje", "Debe revisar el formulario");
            }
            //Modificar de estado el tramite en la tabla tr_fr_log
            datosFrLog = new Tramites();
            datosFrLog.setId_tramite(Integer.parseInt(sIdTramite));
            datosFrLog.setUlt_usuario(cliente.getId_usuario());
            this.mi.setEliminarFrLog(datosFrLog);
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
                modelo.put("id_tramite", sIdTramite);
                modelo.put("id_actividad", sIdActividad);
                modelo.put("para", sPara);
                //Sacamos los datos del tramite
                datosTramite = new Tramites();
                datosTramite.setId_tramite(Integer.parseInt(sIdTramite));
                datosTramite = this.mi.getBuscarTramite(datosTramite);
                modelo.put("datosTramite", datosTramite);
                return new ModelAndView("administrarMisPendientes/RetrocederTramite", modelo);
            } else {
                return new ModelAndView("Aviso", "mensaje", "Debe revisar el formulario");
            }
        }

        //Listamos los tramites pendientes
        datosTramite.setPara(cliente.getId_usuario());
        datosTramite.setPagina(Integer.parseInt(sNroPagina));
        if ("filtro".equals(sBotoncillo)) {
            try {
                datosTramite.setCorrelativo2("%" + sNroFiltro + "%");
            } catch (Exception e) {
                datosTramite.setCorrelativo2("%%");
            }
            lTramites = this.mi.getListarTramitesMiosFiltrado(datosTramite);
            modelo.put("nro_filtro", sNroFiltro);
            modelo.put("_botoncillo", sBotoncillo);
        } else {
            lTramites = this.mi.getListarTramitesMios(datosTramite);
        }
        for (int i = 0; i < lTramites.size(); i++) {
            Tramites auxiliar = (Tramites) lTramites.get(i);
            if (auxiliar.getId_tipo_actuacion() == 2) {
                auxiliar.setOrden(Integer.parseInt(auxiliar.getActuacion()));
            } else {
                auxiliar.setOrden(0);
            }
            auxiliar.setUsuarios(this.mi.getListarUsuariosActividadSiguiente(auxiliar));
            auxiliar.setFilas(auxiliar.getUsuarios().size());
            auxiliar.setLista(this.mi.getListarCamposReferencia(auxiliar));
            lTramites.set(i, auxiliar);
        }
        modelo.put("lMisPendientes", lTramites);

        //Colocamos el nombre de FAUTAPO
        modelo.put("institucion", "TRAMITES");
        //FIN Colocamos el nombre de FAUTAPO

        return new ModelAndView("administrarMisPendientes/ListarMisPendientes", modelo);
    }
}
