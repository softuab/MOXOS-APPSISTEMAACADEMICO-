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
public class MostrarEstudiantesProgramas implements Controller {

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
        int idEstudiante = cliente.getInt(request, "id_estudiante");
        int idPrograma = cliente.getInt(request, "id_programa");
        modelo.put("id_estudiante", idEstudiante);
        modelo.put("id_programa", idPrograma);  

        Estudiantes datosEstudiante = new Estudiantes();
        datosEstudiante.setId_estudiante(idEstudiante);
        datosEstudiante.setId_programa(idPrograma);
        datosEstudiante = this.mi.getEstBuscarEstudiantePrograma(datosEstudiante);
        modelo.put("datosEstudiantes", datosEstudiante);

        Personas datosPersona = new Personas();
        datosPersona.setId_persona(datosEstudiante.getId_persona());
        datosPersona = this.mi.getPrsBuscarPersona(datosPersona);
        modelo.put("datosPersona", datosPersona);
 
        datosEstudiante = this.mi.getMostraSedeDesconcentrada(datosEstudiante.getId_desconcentrado());
        modelo.put("datosSede", datosEstudiante);
        List<Estudiantes> lProgramasDesconcentradosVer = this.mi.getVerProgramasFaseDesconcentrado(idEstudiante);
        modelo.put("lProgramasDesconcentradosVer", lProgramasDesconcentradosVer);

        //  
        modelo.put("datosEstudiantes1", datosEstudiante);
        //Sacamos los datos del Programa
        Programas datosPrograma = new Programas();
        datosPrograma.setId_programa(idPrograma);
        datosPrograma = this.mi.getPrgBuscarPrograma(datosPrograma);
        modelo.put("datosPrograma", datosPrograma);
        return new ModelAndView("administrarEstudiantesProgramasSedes/ListasEstudiantesSedePrograma", modelo);
    }
}
