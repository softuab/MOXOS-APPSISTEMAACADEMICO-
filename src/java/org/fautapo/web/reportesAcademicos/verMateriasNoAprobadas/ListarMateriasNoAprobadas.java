package org.fautapo.web.reportesAcademicos.verMateriasNoAprobadas;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Accesos;
import org.fautapo.domain.Estudiantes;
import org.fautapo.domain.Programas;

import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2005-11-01
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-07-17
 */

public class ListarMateriasNoAprobadas implements Controller {

  private MiFacade mi;
  public void setMi(MiFacade mi) { this.mi = mi; }

  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    Map modelo = new HashMap();

    Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
    if (cliente==null) return new ModelAndView("Aviso", "mensaje", "Su sesi�n ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");
    
    // Comprobamos es quien debe, de acuerdo a su clave
    Estudiantes datosEstudiante = new Estudiantes();
    datosEstudiante.setId_estudiante(cliente.getId_usuario());
    datosEstudiante.setClave(request.getParameter("clave"+request.getParameter("hora")));

    if (null == this.mi.getComprobarEstudiante(datosEstudiante)) {
      return new ModelAndView("reportesAcademicos/verMateriasNoAprobadas/Entrada", "cliente", cliente);
    }
    modelo.put("cliente", cliente);
    modelo.put("acceso", (Accesos) request.getSession().getAttribute("__sess_acceso"));
    
    //Sacamos los datos del Estudiante
    datosEstudiante = new Estudiantes();
    datosEstudiante.setId_estudiante(cliente.getId_usuario());
    datosEstudiante = this.mi.getEstBuscarEstudiante(datosEstudiante);
    modelo.put("datosEstudiante", datosEstudiante);
    
    //Sacamos los datos del Programa
    Programas datosPrograma = new Programas();
    datosPrograma.setId_programa(datosEstudiante.getId_programa());
    datosPrograma = this.mi.getPrgBuscarPrograma(datosPrograma);
    modelo.put("datosPrograma", datosPrograma);
    
    //Listamos las materias no aprobadas
    List lMateriasNoAprobadas = this.mi.getEstListarMateriasNoAprobadas(datosEstudiante);
    modelo.put("lMateriasNoAprobadas", lMateriasNoAprobadas);
    
    return new ModelAndView("reportesAcademicos/verMateriasNoAprobadas/ListarMateriasNoAprobadas", modelo);
  }
}