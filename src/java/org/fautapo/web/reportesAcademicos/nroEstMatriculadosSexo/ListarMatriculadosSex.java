package org.fautapo.web.reportesAcademicos.nroEstMatriculadosSexo;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Abm;
import org.fautapo.domain.Instituciones;
import org.fautapo.domain.Estudiantes;
import org.fautapo.domain.Clientes;

import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-04-08
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-04-08
 */

public class ListarMatriculadosSex implements Controller {

  private MiFacade mi;
  public void setMi(MiFacade mi) {
    this.mi = mi;
  }

  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    Map modelo = new HashMap();
    
    Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
    if(cliente==null) return new ModelAndView("Aviso", "mensaje", "Su sesion ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");    
    int iId_universidad = cliente.getId_universidad();
    
    String sGestion = request.getParameter("gestion");
    String sPeriodo = request.getParameter("periodo"); 

    //Convertimos a entero los datos necesarios
    int iGestion = Integer.parseInt(sGestion);
    int iPeriodo = Integer.parseInt(sPeriodo);

    modelo.put("gestion", sGestion);
    modelo.put("periodo", sPeriodo);
    
    //Sacando la lista de estudiantes matriculados
    Estudiantes datosEstudiante = new Estudiantes();
    datosEstudiante.setGestion(iGestion);
    datosEstudiante.setPeriodo(iPeriodo);
    List lEstudiantes = this.mi.getListarNroEstMatriculadosSexos(datosEstudiante);
    modelo.put("lEstudiantes", lEstudiantes);

  //  Estudiantes datosEstudiante = new Estudiantes();
    List lProgramas = this.mi.getListarNroEstudiantesMatriculados(datosEstudiante);
    modelo.put("lProgramas", lProgramas);

//    Programas datosPrograma = new Programas();
//    datosPrograma.setId_universidad(iId_universidad);
//    List lProgramas = this.mi.getUnvListarProgramas(datosPrograma);
//    modelo.put("lProgramas", lProgramas);

//    List lTestudiantes = this.mi.getListarTiposEstudiantes();
//    modelo.put("lTiposEstudiantes", lTestudiantes);

//    List lTiposSexos = this.mi.getListarTiposSexos();
//    modelo.put("tTsexos", Integer.toString(lTiposSexos.size()));
//    modelo.put("lTiposSexos", lTiposSexos);
    
    //Sacamos los datos de la institucion
    Instituciones datosInstitucion = new Instituciones();
    datosInstitucion.setId_institucion(1); //--------------------------ESTATICO
    datosInstitucion = this.mi.getBuscarInstitucion(datosInstitucion);
    if (datosInstitucion !=null) {
      modelo.put("datosInstitucion", datosInstitucion);
    }

    Instituciones datosInstitucionSede = new Instituciones();
    datosInstitucionSede.setId_institucion(cliente.getId_almacen()); //--------------------------ESTATICO
    datosInstitucionSede = this.mi.getBuscarInstitucionSede(datosInstitucionSede);
    if (datosInstitucionSede !=null) {
      modelo.put("datosInstitucionsede", datosInstitucionSede);
    }
    
    //Sacamos el formato de la fecha
    Abm formatoFecha = new Abm();
    formatoFecha.setCampo("formato_fecha");
    formatoFecha.setCodigo("dibrap");
    modelo.put("formatoFecha", this.mi.getDibBuscarParametro(formatoFecha));

    return new ModelAndView("reportesAcademicos/nroEstMatriculadosSexo/ListarMatriculados", modelo);
  }
}