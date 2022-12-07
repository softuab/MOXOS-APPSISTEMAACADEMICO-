package org.fautapo.web.imprimirInformes;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.fautapo.domain.Actividades;
import org.fautapo.domain.Clientes;
import org.fautapo.domain.Dominios;
import org.fautapo.domain.Informes;
import org.fautapo.domain.Personas;
import org.fautapo.domain.Proveidos;
import org.fautapo.domain.Tramites;
import org.fautapo.domain.Usuarios;

import org.fautapo.domain.logic.MiFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-03-23
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-03-23
 */
public class ListarInformesActividad1 implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map modelo = new HashMap();

        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
        String sId_proceso = request.getParameter("id_proceso");
        String sId_actividad = request.getParameter("id_actividad");
        String sId_tramite = request.getParameter("id_tramite");
        String sId_informe = request.getParameter("id_informe");
        String sCantInformes = request.getParameter("cantInformes");
        String sAplicacion = request.getParameter("aplicacion");
        String sNro_pagina = request.getParameter("nro_pagina");
        modelo.put("nro_pagina", sNro_pagina);
        modelo.put("aplicacion", sAplicacion);

        //RECUPERANDO EL ESTADO Y FECHAS 
        String sFecha_ini = request.getParameter("fechainicio"); //AQUI 4
        String sFecha_fin = request.getParameter("fechafin");
        String sFechadellunes = request.getParameter("fechadellunes");
        String sId_estado = request.getParameter("id_estado");
        String sNombreInforme = request.getParameter("nombre_informe");
        String sNro_filtro = request.getParameter("nro_filtro");
        String sBotoncillo = request.getParameter("_botoncillo");
        modelo.put("nro_filtro", sNro_filtro);
        modelo.put("_botoncillo", sBotoncillo);
        modelo.put("nombre_informe", sNombreInforme);
        modelo.put("fechainicio", sFecha_ini);
        modelo.put("fechafin", sFecha_fin);
        modelo.put("fechadellunes", sFechadellunes);
        modelo.put("id_estado", sId_estado);
        //FIN RECUPERA

        String sId_tipo_proceso = request.getParameter("id_tipo_proceso");
        modelo.put("id_tipo_proceso", sId_tipo_proceso);

        String sBanderaKardex = request.getParameter("banderakardex");
        modelo.put("banderakardex", sBanderaKardex);
        modelo.put("id_tramite", sId_tramite);

        modelo.put("id_proceso", sId_proceso);
        modelo.put("id_actividad", sId_actividad);
        modelo.put("id_informe", sId_informe);
        modelo.put("cantInformes", sCantInformes);
        String contenido = EstructuraImpesion(sId_informe, sId_proceso, sId_tramite, sId_tipo_proceso, sNombreInforme, sAplicacion, cliente);
        modelo.put("contenido", contenido);

        return new ModelAndView("imprimirInformes/ListarInformesActividad1", modelo);
    }

    public String EstructuraImpesion(String id_informe, String id_proceso, String id_tramite, String id_tipo_proceso, String nombre_informe, String aplicacion, Clientes cliente) throws Exception {
        String sContenido = "";
        String sDatox[];
        String sDatoy[];
        String sValor = "";

        //Sacamos los datos de la session 
        String sId_informe = id_informe;
        String sId_proceso = id_proceso;
        String sId_tramite = id_tramite;

        String sId_tipo_proceso = id_tipo_proceso;

        String sNombreInforme = nombre_informe;

        String sAplicacion = aplicacion;

        Informes datosInforme = new Informes();
        datosInforme.setId_informe(Integer.parseInt(sId_informe));
        datosInforme = this.mi.getBuscarInforme(datosInforme);
        String sCadena[] = (datosInforme.getContenido()).split("##");
        for (int i = 0; i < sCadena.length; i++) {
            Informes datosInforme2 = new Informes();
            datosInforme2.setId_proceso(Integer.parseInt(sId_proceso));
            datosInforme2.setId_tramite(Integer.parseInt(sId_tramite));
            try {
                datosInforme2.setId_campo(Integer.parseInt(sCadena[i]));
            } catch (Exception e) {
                datosInforme2.setId_campo(0);
            }
            datosInforme2 = (Informes) this.mi.getBuscarInforme2(datosInforme2);
            if (datosInforme2 != null) {
                sValor = datosInforme2.getValor();
                if (sValor.indexOf("###") > 0) {
                    try {
                        String sDatoz[] = sValor.split("###");
                        String sValorcito = "";
                        for (int c = 0; c < sDatoz.length; c++) {
                            sDatoy = (sDatoz[c]).split(":");
                            if ("id_codigo".equals(sDatoy[0])) {
                                Dominios datosTupla = new Dominios();
                                datosTupla.setId_tupla(Integer.parseInt(sDatoy[1]));
                                datosTupla.setId_tipo_dominio(datosInforme2.getId_tipo_dominio());
                                datosTupla.setId_campo(datosInforme2.getId_campo());
                                datosTupla = (Informes) this.mi.getBuscarTupla2(datosTupla);
                                sValorcito = datosTupla.getTupla() + ", " + sValorcito;
                            }
                        }
                        sValor = sValorcito;
                    } catch (Exception e) {
                    }
                    //Fin de los checks	
                } else {
                    //Para los combos
                    sValor = datosInforme2.getValor();
                    try {
                        sDatox = sValor.split(":");
                        if ("id_codigo".equals(sDatox[0]) && (sDatox[1] != null)) {
                            if (Integer.parseInt(sDatox[1]) == 0) {
                                sValor = "";
                            } else {
                                Dominios datosTupla = new Dominios();
                                datosTupla.setId_tupla(Integer.parseInt(sDatox[1]));
                                datosTupla.setId_tipo_dominio(datosInforme2.getId_tipo_dominio());
                                datosTupla.setId_campo(datosInforme2.getId_campo());
                                datosTupla = (Informes) this.mi.getBuscarTupla2(datosTupla);
                                sValor = datosTupla.getTupla();
                            }
                        }
                    } catch (Exception e) {
                    }
                    //Fin de los combos
                }
                try {
                    String sValor1[] = sValor.split("##~##");
                    if (sValor1.length > 1) {
                        sValor = sValor1[1];
                    }
                } catch (Exception e) {
                }
                sContenido = sContenido + sValor;
            } else {
                Tramites datosTramite = new Tramites();
                datosTramite.setId_tramite(Integer.parseInt(sId_tramite));
                datosTramite = (Tramites) this.mi.getBuscarTramite(datosTramite);
                if ("nro_tramite".equals(sCadena[i])) {
                    sCadena[i] = sId_tramite;
                }
                if ("fecha_inicio".equals(sCadena[i])) {
                    Date dFecha_registro = datosTramite.getFec_registro();
                    sCadena[i] = generarFecha(dFecha_registro);
                }
                if ("correlativo".equals(sCadena[i])) {
                    sCadena[i] = datosTramite.getCorrelativo2();
                }
                if ("fecha_actual".equals(sCadena[i])) {
                    Date dFecha_actual = new Date();
                    sCadena[i] = generarFecha(dFecha_actual);
                }
                if ("dia".equals(sCadena[i])) {
                    Date dFecha_actual = new Date();
                    sCadena[i] = generarFecha(dFecha_actual);
                    String[] sDia = sCadena[i].split(" de  ");
                    sCadena[i] = sDia[0];
                }
                if ("mes".equals(sCadena[i])) {
                    Date dFecha_actual = new Date();
                    sCadena[i] = generarFecha(dFecha_actual);
                    String[] sMes = sCadena[i].split(" de  ");
                    sCadena[i] = sMes[1];
                }
                if ("anio".equals(sCadena[i])) {
                    Date dFecha_actual = new Date();
                    sCadena[i] = generarFecha(dFecha_actual);
                    String[] sAnio = sCadena[i].split(" de  ");
                    sCadena[i] = sAnio[2];
                }
                if ("nombre_usuario".equals(sCadena[i])) {
                    sCadena[i] = cliente.getNombres();
                }
                if ("gestion".equals(sCadena[i])) {
                    sCadena[i] = Integer.toString(cliente.getGestion());
                }
                if ("periodo".equals(sCadena[i])) {
                    sCadena[i] = Integer.toString(cliente.getPeriodo());
                }
                if ("unidad".equals(sCadena[i])) {
                    Actividades ubicacionOrganica = new Actividades();
                    ubicacionOrganica.setId_ubicacion_organica(cliente.getId_ubicacion_organica());
                    ubicacionOrganica = this.mi.getBuscarUbicacionOrganica(ubicacionOrganica);
                    sCadena[i] = ubicacionOrganica.getUbicacion_organica();
                }
                if ("proveido".equals(sCadena[i])) {
                    Proveidos datosProveido = new Proveidos();
                    datosProveido.setId_tramite(Integer.parseInt(sId_tramite));
                    datosProveido.setId_actividad(datosTramite.getId_actividad_actual());
                    datosProveido.setId_usuario(cliente.getId_usuario());
                    datosProveido.setId_tipo_proveido(1); //Formulario
                    sCadena[i] = this.mi.getBuscarUltimoProveido2(datosProveido);
                }
                if ("hora_actual".equals(sCadena[i])) {
                    Date dFechita_actual = new Date();
                    SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");
                    sCadena[i] = formato.format(dFechita_actual);
                }
                if ("tipo_proceso".equals(sCadena[i])) {
                    Actividades datosProceso = new Actividades();
                    datosProceso.setId_proceso(datosTramite.getId_proceso());
                    datosProceso = this.mi.getBuscarProceso(datosProceso);
                    sCadena[i] = datosProceso.getProceso();
                }
                if ("codigo_proceso".equals(sCadena[i])) {
                    Actividades datosProceso = new Actividades();
                    datosProceso.setId_proceso(datosTramite.getId_proceso());
                    datosProceso = this.mi.getBuscarProceso(datosProceso);
                    sCadena[i] = datosProceso.getCodigo_proceso();
                }
                if ("destinatario".equals(sCadena[i])) {
                    Usuarios datosDestinatario = new Usuarios();
                    datosDestinatario.setId_usuario(datosTramite.getPara());
                    datosDestinatario = this.mi.getBuscarUsuario(datosDestinatario);
                    sCadena[i] = datosDestinatario.getNombres();
                }

                if ("ubicacion_organica_para".equals(sCadena[i])) {
                    Personas ubicacionOrganicaP = new Personas();
                    ubicacionOrganicaP.setUlt_usuario(datosTramite.getPara());
                    ubicacionOrganicaP = this.mi.getBuscarItemsUsuario(ubicacionOrganicaP);
                    sCadena[i] = ubicacionOrganicaP.getUbicacion_organica();
                }

                if ("ubicacion_organica_de".equals(sCadena[i])) {
                    Personas ubicacionOrganicaD = new Personas();
                    ubicacionOrganicaD.setUlt_usuario(datosTramite.getDe());
                    ubicacionOrganicaD = this.mi.getBuscarItemsUsuario(ubicacionOrganicaD);
                    sCadena[i] = ubicacionOrganicaD.getUbicacion_organica();
                }

                sContenido = sContenido + sCadena[i];
            }
        }
        datosInforme.setContenido(sContenido);

        //Convertimos el informe de html a pdf
        try {
            PrintStream p;
            FileOutputStream salida = new FileOutputStream("/opt/tomcat/webapps" + sAplicacion + "informes/" + sNombreInforme + ".pdf");
            p = new PrintStream(salida);
            p.append("<html><body>" + sContenido + "</body></html>");
            p.close();
            Runtime.getRuntime().exec("htmldoc --webpage -t pdf /opt/tomcat/webapps" + sAplicacion + "informes/" + sNombreInforme + ".pdf --size legal -f /opt/tomcat/webapps" + sAplicacion + "informes/" + sNombreInforme + ".pdf");
        } catch (Exception e) {
            System.out.println("el documento pdf no se pudo generar");
        }
        return datosInforme.getContenido();
    }

    private String generarFecha(Date fecha) {
        int iAnio = fecha.getYear() + 1900;
        int iDia = fecha.getDate();
        String sMes = "";
        switch (fecha.getMonth()) {
            case (0):
                sMes = "enero";
                break;
            case (1):
                sMes = "febrero";
                break;
            case (2):
                sMes = "marzo";
                break;
            case (3):
                sMes = "abril";
                break;
            case (4):
                sMes = "mayo";
                break;
            case (5):
                sMes = "junio";
                break;
            case (6):
                sMes = "julio";
                break;
            case (7):
                sMes = "agosto";
                break;
            case (8):
                sMes = "septiembre";
                break;
            case (9):
                sMes = "octubre";
                break;
            case (10):
                sMes = "noviembre";
                break;
            case (11):
                sMes = "diciembre";
                break;
        }
        String sFecha_salida = Integer.toString(iDia) + " de  " + sMes + " de  " + Integer.toString(iAnio);
        return sFecha_salida;
    }
}
