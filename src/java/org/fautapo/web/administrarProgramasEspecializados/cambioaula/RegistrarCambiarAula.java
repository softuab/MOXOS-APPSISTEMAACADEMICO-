/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fautapo.web.administrarProgramasEspecializados.cambioaula;

import java.util.HashMap;
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
 * @author FNZABALETAA
 */
public class RegistrarCambiarAula implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String mensajeModel = "mensaje";
        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
        if (cliente == null) {
            return new ModelAndView("Aviso", mensajeModel, "Su sesion ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");
        }
        Integer gestion = cliente.getInt(request, "gestion");
        Integer periodo = cliente.getInt(request, "periodo");
        Integer idEstudiante = cliente.getInt(request, "id_estudiante");
        Integer idDesconcentrado = cliente.getInt(request, "id_desconcentrado");
        Integer idTipoEvaluacion = cliente.getInt(request, "id_tipo_evaluacion");

        Estudiantes estudiante = new Estudiantes();
        estudiante.setGestion(gestion);
        estudiante.setPeriodo(periodo);
        estudiante.setId_estudiante(idEstudiante);
        estudiante.setId_desconcentrado(idDesconcentrado);
        estudiante.setId_tipo_evaluacion(idTipoEvaluacion);
        mi.RegistrarCsmbioAulaProgramacion(estudiante);

        return new ModelAndView("administrarProgramasEspecializados/cambioaulas/Aviso", mensajeModel, "Se actualizo correctamente");
    }
}
