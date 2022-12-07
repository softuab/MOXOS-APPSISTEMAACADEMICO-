/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.fautapo.web.administrarEstudiantesProgramasSede;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.fautapo.domain.Clientes;
import org.fautapo.domain.Estudiantes;
import org.fautapo.domain.Personas;
import org.fautapo.domain.Programas;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author Usuario
 */
public class ConfirmarBorradoProgramaSede implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
        if (cliente == null) {
            return new ModelAndView("Error", "mensaje", "Tu sesion termino. Por favor, ingresa nuevamente.");
        }
        Map<String, Object> modelo = new HashMap<>();
        int idPrograma = cliente.getInt(request, "id_programa");
        int idEstudiante = cliente.getInt(request, "id_estudiante");
        int idEstudianteProgramaSede = cliente.getInt(request, "id_estudiante_programa_sede");

        Estudiantes datosEstudiante = new Estudiantes();
        datosEstudiante.setId_estudiante(idEstudiante);
        datosEstudiante.setId_programa(idPrograma);
        datosEstudiante = this.mi.getEstBuscarEstudiantePrograma(datosEstudiante);
        modelo.put("datosEstudiante", datosEstudiante);

        //Sacando los datos personales del Estudiante encontrado
        Personas datosPersona = new Personas();
        datosPersona.setId_persona(datosEstudiante.getId_persona());
        datosPersona = this.mi.getPrsBuscarPersona(datosPersona);
        modelo.put("datosPersona", datosPersona);

        List<Estudiantes> lProgramasDesconcentrados = this.mi.getListarFclProgramasDescocentrado(idPrograma);
        modelo.put("lProgramasFacDescocentrados", lProgramasDesconcentrados);
        modelo.put("datosSede", datosEstudiante);
        datosEstudiante = this.mi.getDetalleEstudiantesProgramaSede(idEstudianteProgramaSede);
        modelo.put("datosEstudiantes", datosEstudiante);

        //Sacamos los datos del Programa
        Programas datosPrograma = new Programas();
        datosPrograma.setId_programa(idPrograma);
        datosPrograma = this.mi.getPrgBuscarPrograma(datosPrograma);
        modelo.put("datosPrograma", datosPrograma);
        return new ModelAndView("administrarEstudiantesProgramasSedes/ConfirmarBorrado", modelo);
    }
}
