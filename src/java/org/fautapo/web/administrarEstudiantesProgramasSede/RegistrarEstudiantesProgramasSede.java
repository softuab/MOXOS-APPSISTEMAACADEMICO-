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
public class RegistrarEstudiantesProgramasSede implements Controller {

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
        int idDesconcentrado = cliente.getInt(request, "id_desconcentrado");
        int idEstudiante = cliente.getInt(request, "id_estudiante");
        int idEstudianteProgramaSede = cliente.getInt(request, "id_estudiante_programa_sede");
        modelo.put("id_programa", idPrograma);
        modelo.put("id_estudiante", idEstudiante);

        String nota = request.getParameter("nota");
        String accion = request.getParameter("accion");
        Estudiantes datosEstudiante = new Estudiantes();
        if ("Eliminar".equals(accion)) {
            int resultado = 0;
            datosEstudiante.setId_estudiante(idEstudiante);
            datosEstudiante.setId_estudiante_programa_sede(idEstudianteProgramaSede);
            datosEstudiante.setId_programa(idPrograma);
            datosEstudiante.setId_desconcentrado(idDesconcentrado);
            resultado = this.mi.setEliminarProgramaDesconcentrado(datosEstudiante);
            modelo.put("resultado", resultado);
            modelo.put("datosEstudios", datosEstudiante);
            modelo.put("mensaje", "Se Elimino Correctamente");
            return new ModelAndView("administrarEstudiantesProgramasSedes/Aviso", modelo);
        }
        if ("Modificar".equals(accion)) {
            int resultado = 0;
            datosEstudiante.setId_estudiante_programa_sede(idEstudianteProgramaSede);
            datosEstudiante.setId_desconcentrado(idDesconcentrado);
            datosEstudiante.setId_programa(idPrograma);
            datosEstudiante.setNota(nota);
            datosEstudiante.setId_estudiante(idEstudiante);
            datosEstudiante.setId_rol(cliente.getId_rol());
            datosEstudiante.setUlt_usuario(cliente.getId_usuario());
            this.mi.setModificarProgramaDesconcentrado(datosEstudiante);

            Estudiantes datosEstudiantess = new Estudiantes();
            datosEstudiantess.setId_estudiante(idEstudiante);
            datosEstudiantess.setId_programa(idPrograma);
            datosEstudiantess = this.mi.getEstBuscarEstudiantePrograma(datosEstudiantess);
            modelo.put("datosEstudiantes", datosEstudiantess);
            datosEstudiantess = this.mi.getDetalleEstudiantesProgramaSede(idEstudiante);
            modelo.put("datosEstudiantes1", datosEstudiantess);

            Personas datosPersona = new Personas();
            datosPersona.setId_persona(datosEstudiante.getId_persona());
            datosPersona = this.mi.getPrsBuscarPersona(datosPersona);
            modelo.put("datosPersona", datosPersona);
            //Sacamos los datos del Programa
            Programas datosPrograma = new Programas();
            datosPrograma.setId_programa(idPrograma);
            datosPrograma = this.mi.getPrgBuscarPrograma(datosPrograma);
            modelo.put("datosPrograma", datosPrograma);

            List<Estudiantes> lProgramasDesconcentradosVer = this.mi.getVerProgramasFaseDesconcentrado(idEstudiante);
            modelo.put("lProgramasDesconcentradosVer", lProgramasDesconcentradosVer);

            datosEstudiante = this.mi.getMostraSedeDesconcentrada(idDesconcentrado);
            modelo.put("datosSede", datosEstudiante);
            return new ModelAndView("administrarEstudiantesProgramasSedes/ListasEstudiantesSedePrograma", modelo);
        }
        if ("Nuevo".equals(accion)) {
            int resultado = 0;
            Estudiantes datosEstudiantes = new Estudiantes();
            datosEstudiantes.setId_estudiante(idEstudiante);
            datosEstudiantes.setId_programa(idPrograma);
            datosEstudiantes.setId_desconcentrado(idDesconcentrado);
            datosEstudiantes.setNota(nota);
            datosEstudiantes.setId_rol(cliente.getId_rol());
            datosEstudiantes.setUlt_usuario(cliente.getId_usuario());
            this.mi.setRegistrarEstudiantes_programas_sede(datosEstudiantes);
            datosEstudiante = this.mi.getEstBuscarEstudiantePrograma(datosEstudiantes);
            modelo.put("datosEstudiantes", datosEstudiante);

            Personas datosPersona = new Personas();
            datosPersona.setId_persona(datosEstudiante.getId_persona());
            datosPersona = this.mi.getPrsBuscarPersona(datosPersona);
            modelo.put("datosPersona", datosPersona);

            Programas datosPrograma = new Programas();
            datosPrograma.setId_programa(idPrograma);
            datosPrograma = this.mi.getPrgBuscarPrograma(datosPrograma);
            modelo.put("datosPrograma", datosPrograma);
            datosEstudiante = this.mi.getDetalleEstudiantesProgramaSede(idEstudiante);
            modelo.put("datosEstudiantes1", datosEstudiante);
            modelo.put("nota", nota);
            List<Estudiantes> lProgramasDesconcentradosVer = this.mi.getVerProgramasFaseDesconcentrado(idEstudiante);
            modelo.put("lProgramasDesconcentradosVer", lProgramasDesconcentradosVer);

            datosEstudiante = this.mi.getMostraSedeDesconcentrada(idDesconcentrado);
            modelo.put("datosSede", datosEstudiante);
            resultado = this.mi.setActualizarIdDesconcentradoEstudiantes(datosEstudiantes);
            modelo.put("resultado", resultado);
            return new ModelAndView("administrarEstudiantesProgramasSedes/ListasEstudiantesSedePrograma", modelo);
        }

        if (datosEstudiante != null) {
            return new ModelAndView("Error", "mensaje", "Ya se encuentra registrado el Estudiante con el RU :" + idEstudiante);
        }
        return new ModelAndView("administrarEstudiantesProgramasSedes/ListasEstudiantesSedePrograma", modelo);
    }
}
