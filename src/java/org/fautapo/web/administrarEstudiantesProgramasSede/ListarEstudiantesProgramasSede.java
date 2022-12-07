package org.fautapo.web.administrarEstudiantesProgramasSede;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.fautapo.domain.Clientes;
import org.fautapo.domain.Estudiantes;
import org.fautapo.domain.Programas;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author Usuario
 */
public class ListarEstudiantesProgramasSede implements Controller {

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
        Integer idEstudiante = cliente.getInt(request, "id_estudiante");
        Integer idPrograma = cliente.getInt(request, "id_programa");
        modelo.put("id_estudiante", idEstudiante);
        modelo.put("idPrograma", idEstudiante);

        //Sacamos los datos del programa
        Programas programa = new Programas();
        programa.setId_programa(idPrograma);
        modelo.put("programa", this.mi.getPrgBuscarPrograma(programa));

        //Sacamos los datos del Estudiante
        Estudiantes datosEstudiante = new Estudiantes();
        datosEstudiante.setId_estudiante(idEstudiante);
        datosEstudiante = this.mi.getEstBuscarEstudiante(datosEstudiante);
        modelo.put("datosEstudiante", datosEstudiante);
        //Sacamos el nombre del Estudiante
        datosEstudiante = this.mi.getEstBuscarEstudianteNombres(datosEstudiante);
        modelo.put("datosEstudiante2", datosEstudiante);
        datosEstudiante = this.mi.getListarEstudiantesProgramasSede(datosEstudiante);
        modelo.put("lEstudiantes", datosEstudiante);
        List<Estudiantes> lProgramasDesconcentrados = this.mi.getListarFclProgramasDescocentrado(idPrograma);
        modelo.put("lProgramasFacDescocentrados", lProgramasDesconcentrados);
        return new ModelAndView("administrarEstudiantesProgramasSedes/Registrar", modelo);
    }
}
