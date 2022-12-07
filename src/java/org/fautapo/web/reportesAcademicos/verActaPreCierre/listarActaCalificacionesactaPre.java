package org.fautapo.web.reportesAcademicos.verActaPreCierre;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Abm;
import org.fautapo.domain.Clientes;
import org.fautapo.domain.Facultades;
import org.fautapo.domain.Materias;
import org.fautapo.domain.Programas;
import org.fautapo.domain.Notas;   
import org.fautapo.domain.Docentes;   
import org.fautapo.domain.Libretas;      
import org.fautapo.domain.Instituciones;

import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-04-08
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-04-08
 */

public class listarActaCalificacionesactaPre implements Controller {

  private MiFacade mi;
  public void setMi(MiFacade mi) {
    this.mi = mi;
  }

  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    Map modelo = new HashMap();
    
    Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
    if(cliente==null) return new ModelAndView("Aviso", "mensaje", "Su sesion ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");    
    int id_facultad = cliente.getId_facultad();
    String sId_tipo_nota_s      = "";  
    String sId_materia          = request.getParameter("id_materia");
    String sId_grupo            = request.getParameter("id_grupo");  
    String sGrupo               = request.getParameter("grupo");  
    String sId_programa         = request.getParameter("id_programa");
    String sId_fase             = request.getParameter("id_fase");
    String sId_modelo_ahorro    = request.getParameter("id_modelo_ahorro");
    sId_tipo_nota_s             = request.getParameter("id_tipo_nota_s");
    String sNro_nota_s          = request.getParameter("nro_nota_s");
    String sMateria             = request.getParameter("materia");
    String sPrograma            = request.getParameter("programa");    
    String sBandera             = request.getParameter("bandera");
    String sGestion             = request.getParameter("gestion");
    String sPeriodo             = request.getParameter("periodo"); 
    String sFacultad            = request.getParameter("facultad");    
    String sId_docente          = request.getParameter("id_docente");    
    String sId_plan             = request.getParameter("id_plan");    
    String sNivel_academico     = request.getParameter("nivel_academico");    
    String sId_tipo_evaluacion  = request.getParameter("id_tipo_evaluacion");    
    String sId_departamento     = request.getParameter("id_departamento");    
    
    modelo.put("gestion", sGestion);   // TOMANDO EN CUENTA LA GESTION Y PERIODO;    
    modelo.put("periodo", sPeriodo);
    modelo.put("nombres", cliente.getNombres());
    modelo.put("id_grupo", sId_grupo);
    modelo.put("grupo", sGrupo);
    modelo.put("id_fase", sId_fase);
    modelo.put("id_modelo_ahorro", sId_modelo_ahorro);
    modelo.put("nro_nota", sNro_nota_s);
    modelo.put("nro_nota_s", sNro_nota_s);
    modelo.put("id_materia", sId_materia);
    modelo.put("materia", sMateria);
    modelo.put("id_programa", sId_programa);
    modelo.put("programa", sPrograma);
    modelo.put("facultad", sFacultad);    
    modelo.put("id_plan", sId_plan);    
    modelo.put("nivel_academico", sNivel_academico);    
    modelo.put("id_tipo_evaluacion", sId_tipo_evaluacion);    
    modelo.put("id_departamento", sId_departamento);
    
    //Convertimos a entero los datos necesarios
    int iGestion = Integer.parseInt(sGestion);
    int iPeriodo = Integer.parseInt(sPeriodo);
    int iId_materia = Integer.parseInt(sId_materia);
    int iId_fase = Integer.parseInt(sId_fase);    
    int iId_grupo = Integer.parseInt(sId_grupo);    
    int iId_modelo_ahorro = Integer.parseInt(sId_modelo_ahorro);
    
    //Buscar Docente
    Docentes datosDoc = new Docentes();
    datosDoc.setId_docente(Integer.parseInt(sId_docente));
    datosDoc = this.mi.getBuscarDocente(datosDoc);
    modelo.put("datosDoc", datosDoc);
    //Buscamos el grado_academico por programa e id_plan
    Libretas datosGrados = new Libretas();
    datosGrados.setId_programa(Integer.parseInt(sId_programa));
    datosGrados.setId_plan(sId_plan);
    datosGrados = this.mi.getBuscarGradoAcademicoPrograma(datosGrados);
    modelo.put("datosGrados",datosGrados);
    
    //listamos los estudiantes con Acta de calificaciones (tabla notas)
    Notas datosNotas = new Notas();
    datosNotas.setId_materia(iId_materia);
    datosNotas.setId_grupo(iId_grupo);
    datosNotas.setGestion(iGestion);
    datosNotas.setPeriodo(iPeriodo);
    datosNotas.setId_tipo_evaluacion(Integer.parseInt(sId_tipo_evaluacion));
    datosNotas.setId_departamento(Integer.parseInt(sId_departamento));
    datosNotas.setId_modelo_ahorro(Integer.parseInt(sId_modelo_ahorro));
    List listNotas = this.mi.getListarActaCalificacionesPreCierre(datosNotas);
    modelo.put("listNotas", listNotas);
   
    //Buscamos Tipo Evaluacion
    Libretas datosTipoEvaluacion = new Libretas();
    datosTipoEvaluacion.setId_tipo_evaluacion(Integer.parseInt(sId_tipo_evaluacion));
    datosTipoEvaluacion = this.mi.getTpsBuscarTipoEvaluacion(datosTipoEvaluacion);
    modelo.put("datosTipoEvaluacion", datosTipoEvaluacion);
    
    //Sacamos los datos de la Facultad
    Facultades datosFacultad = new Facultades();
    datosFacultad.setId_facultad(id_facultad);
    datosFacultad = this.mi.getFclBuscarFacultad(datosFacultad);
    modelo.put("datosFacultad", datosFacultad);

    //Sacamos el programa  
    Programas datosPrograma = new Programas();
    datosPrograma.setId_programa(Integer.parseInt(sId_programa));
    Programas buscarPrograma = this.mi.getPrgBuscarPrograma(datosPrograma);
    modelo.put("id_programa", sId_programa);
    modelo.put("programa", buscarPrograma);
    
    //Sacamos datos de la materia
    Materias datosMateria = new Materias();
    datosMateria.setId_materia(iId_materia);
    Materias buscarMateria = this.mi.getMtrBuscarMateria(datosMateria);
    modelo.put("materia", buscarMateria.getMateria());
    modelo.put("sigla", buscarMateria.getSigla());
    modelo.put("id_departamento", Integer.toString(buscarMateria.getId_departamento()));
    modelo.put("id_materia", sId_materia);
    modelo.put("id_tipo_nota_s", sId_tipo_nota_s);

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

    return new ModelAndView("reportesAcademicos/verActaPreCierre/listarActaCalificaciones", modelo);
  }
}