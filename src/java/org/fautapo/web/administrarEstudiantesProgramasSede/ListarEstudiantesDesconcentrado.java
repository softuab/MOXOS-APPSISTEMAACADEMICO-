/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.fautapo.web.administrarEstudiantesProgramasSede;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.fautapo.domain.Clientes;
import org.fautapo.domain.Estudiantes;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author Usuario
 */
public class ListarEstudiantesDesconcentrado implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map modelo = new HashMap();

        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
        if (cliente == null) {
            return new ModelAndView("Aviso", "mensaje", "Su sesion ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");
        }
        Estudiantes datosEstudiante;
        String sId_Estudiante = request.getParameter("id_estudiante");
        String sCi = request.getParameter("ci");
        String sNombres = request.getParameter("nombres");

        if (!"".equals(sId_Estudiante)) {
            //Sacando los datos del estudiante    
            datosEstudiante = new Estudiantes();
            try {
                datosEstudiante.setId_estudiante(Integer.parseInt(sId_Estudiante));
            } catch (Exception e) {
                return new ModelAndView("Error", "mensaje", "El R.U. deber ser un dato entero, por favor Verifique");
            }
            datosEstudiante.setId_universidad(cliente.getId_universidad());
            datosEstudiante.setId_facultad(cliente.getId_facultad());
            datosEstudiante.setId_programa(cliente.getId_programa());
            datosEstudiante = this.mi.getEstBuscarEstudianteAccesos(datosEstudiante);
            modelo.put("datosEstudiante", datosEstudiante);
            if (datosEstudiante == null) {
                return new ModelAndView("administrarEstudiantesProgramasSedes/Aviso", "mensaje", "El estudiante no es de su Area, Por favor verifique");
            }
            datosEstudiante = this.mi.getEstBuscarEstudianteNombres(datosEstudiante);
            List<Estudiantes> lEstudiantes = new ArrayList();
            lEstudiantes.add(datosEstudiante);
            modelo.put("lEstudiantes", lEstudiantes);
            return new ModelAndView("administrarEstudiantesProgramasSedes/ListarEstudiantes", modelo);
        }
        //Si la busqueda es por CI
        if (!"".equals(sCi)) {
            datosEstudiante = new Estudiantes();
            datosEstudiante.setDip(sCi);
            datosEstudiante.setId_universidad(cliente.getId_universidad());
            datosEstudiante.setId_facultad(cliente.getId_facultad());
            datosEstudiante.setId_programa(cliente.getId_programa());
            List<Estudiantes> lEstudiantes = this.mi.getEstListarEstudiantesDipAccesos(datosEstudiante);
            modelo.put("lEstudiantes", lEstudiantes);
        }
        //Si la busqueda es por nombre
        if (!"".equals(sNombres)) {
            datosEstudiante = new Estudiantes();
            datosEstudiante.setNombres(sNombres);
            datosEstudiante.setId_universidad(cliente.getId_universidad());
            datosEstudiante.setId_facultad(cliente.getId_facultad());
            datosEstudiante.setId_programa(cliente.getId_programa());
            List<Estudiantes> lEstudiantes = this.mi.getEstListarEstudiantesNombresAccesos(datosEstudiante);
            modelo.put("lEstudiantes", lEstudiantes);
        }
        return new ModelAndView("administrarEstudiantesProgramasSedes/ListarVerDatosEstudiantes", modelo);
    }
}
