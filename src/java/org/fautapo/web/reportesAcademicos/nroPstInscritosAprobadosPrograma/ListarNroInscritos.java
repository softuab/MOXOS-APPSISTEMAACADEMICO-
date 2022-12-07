package org.fautapo.web.reportesAcademicos.nroPstInscritosAprobadosPrograma;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Abm;
import org.fautapo.domain.Clientes;
import org.fautapo.domain.Programas;
import org.fautapo.domain.Facultades;
import org.fautapo.domain.Instituciones;
import org.fautapo.domain.Postulantes;

import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-04-08
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-04-08
 */

public class ListarNroInscritos implements Controller {

  private MiFacade mi;
  public void setMi(MiFacade mi) {
    this.mi = mi;
  }

  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    Map modelo = new HashMap();
    
    Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
    if(cliente==null) return new ModelAndView("Aviso", "mensaje", "Su sesion ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");    

    int iId_programa = cliente.getInt(request, "id_programa");
    int iId_facultad = cliente.getInt(request, "id_facultad");
    int iGestion = cliente.getInt(request, "gestion");
    int iPeriodo = cliente.getInt(request, "periodo");
    modelo.put("gestion", Integer.toString(iGestion));
    modelo.put("periodo", Integer.toString(iPeriodo));
    

    //Sacando la lista de postulantes inscritos
    Postulantes datosPst = new Postulantes();
    datosPst.setId_facultad(iId_facultad);
    datosPst.setGestion(iGestion);
    datosPst.setPeriodo(iPeriodo);
    List lNroPstInscritosHabilitados = this.mi.getNroPstInscritosHabilitados(datosPst);
    modelo.put("lNroPstInscritosHabilitados", lNroPstInscritosHabilitados);
    
    //sacamos el programa
    Programas datosPrograma = new Programas();
    datosPrograma.setId_programa(iId_programa); 
    datosPrograma = this.mi.getPrgBuscarPrograma(datosPrograma);
    modelo.put("datosPrograma", datosPrograma);
    
    //Sacamos los datos de la Facultad
    Facultades datosFacultad = new Facultades();
    datosFacultad.setId_facultad(datosPrograma.getId_facultad());
    datosFacultad = this.mi.getFclBuscarFacultad(datosFacultad);
    modelo.put("datosFacultad", datosFacultad);

    //Sacamos los datos de la institucion
    Instituciones datosInstitucion = new Instituciones();
    datosInstitucion.setId_institucion(1); //--------------------------ESTATICO
    datosInstitucion = this.mi.getBuscarInstitucion(datosInstitucion);
    if (datosInstitucion !=null) {
      modelo.put("datosInstitucion", datosInstitucion);
    }
    
    //Sacamos el formato de la fecha
    Abm formatoFecha = new Abm();
    formatoFecha.setCampo("formato_fecha");
    formatoFecha.setCodigo("dibrap");
    modelo.put("formatoFecha", this.mi.getDibBuscarParametro(formatoFecha));

    return new ModelAndView("reportesAcademicos/nroPstInscritosAprobadosPrograma/ListarNroInscritos", modelo);
  }
}