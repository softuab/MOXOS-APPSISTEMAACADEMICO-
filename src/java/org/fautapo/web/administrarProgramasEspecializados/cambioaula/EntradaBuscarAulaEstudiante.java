/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fautapo.web.administrarProgramasEspecializados.cambioaula;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.fautapo.domain.Clientes;
import org.fautapo.domain.Estudiantes;
import org.fautapo.domain.logic.MiFacade;
import org.fautapo.util.Util;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author FNZABALETAA
 */
public class EntradaBuscarAulaEstudiante implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> modelo = new HashMap<>();
        String mensajeModel = "mensaje";
        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
        if (cliente == null) {
            return new ModelAndView("Aviso", mensajeModel, "Su sesion ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");
        }
        Estudiantes datosEstudiante;
        String sIdEstudiante = request.getParameter("id_estudiante");
        String sCi = request.getParameter("ci");
        String sNombres = request.getParameter("nombres");
        List<Estudiantes> lEstudiantes = new ArrayList<>();
        if (Util.isNullOrBlank(sIdEstudiante) && Util.isNullOrBlank(sNombres) && Util.isNullOrBlank(sCi)) {
            return new ModelAndView("administrarProgramasEspecializados/cambioaulas/BuscarEstudiantes", modelo);
        }

        if (!Util.isNullOrBlank(sIdEstudiante)) {
            //Sacando los datos del estudiante    
            datosEstudiante = new Estudiantes();
            try {
                datosEstudiante.setId_estudiante(Integer.parseInt(sIdEstudiante));
            } catch (Exception e) {
                return new ModelAndView("administrarProgramasEspecializados/cambioaulas/Error", mensajeModel, "El R.U. no es valido, introduzca un numero");
            }
            datosEstudiante = this.mi.getEstBuscarEstudianteNombres(datosEstudiante);
            lEstudiantes.add(datosEstudiante);
        }

        //Si la busqueda es por CI
        if (!Util.isNullOrBlank(sCi)) {
            datosEstudiante = new Estudiantes();
            datosEstudiante.setDip(sCi);
            datosEstudiante.setId_universidad(cliente.getId_universidad());
            datosEstudiante.setId_facultad(cliente.getId_facultad());
            datosEstudiante.setId_programa(cliente.getId_programa());
            lEstudiantes = this.mi.getEstListarEstudiantesDipAccesos(datosEstudiante);
        }
        //Si la busqueda es por nombre
        if (!"".equals(sNombres)) {
            datosEstudiante = new Estudiantes();
            datosEstudiante.setNombres(sNombres);
            datosEstudiante.setId_universidad(cliente.getId_universidad());
            datosEstudiante.setId_facultad(cliente.getId_facultad());
            datosEstudiante.setId_programa(cliente.getId_programa());
            lEstudiantes = this.mi.getEstListarEstudiantesNombresAccesos(datosEstudiante);
        }
        modelo.put("lEstudiantes", lEstudiantes);
        return new ModelAndView("administrarProgramasEspecializados/cambioaulas/ListarDatosEstudiantes", modelo);
    }

}
