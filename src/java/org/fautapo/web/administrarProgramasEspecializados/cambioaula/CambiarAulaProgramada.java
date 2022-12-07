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
import org.fautapo.Model.ItemViewModel;
import org.fautapo.domain.Clientes;
import org.fautapo.domain.Estudiantes;
import org.fautapo.domain.Libretas;
import org.fautapo.domain.ProgramasDesconcentrados;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author FNZABALETAA
 */
public class CambiarAulaProgramada implements Controller {

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
        String nombreCompleto = cliente.getString(request, "nombre_completo");
        String programa = cliente.getString(request, "programa");
        Integer idPrograma = cliente.getInt(request, "id_programa");
        List<ItemViewModel> litemSedesDescontrados = new ArrayList<>();
        List<ItemViewModel> litemTiposEvaluaciones = new ArrayList<>();

        List<Estudiantes> lProgramasDesconcentrados = this.mi.getListarFclProgramasDescocentrado(idPrograma);
        for (Estudiantes item : lProgramasDesconcentrados) {
            litemSedesDescontrados.add(new ItemViewModel(item.getId_desconcentrado(), item.getId_programa(), item.getSede_desconcentrada()));
        }
        modelo.put("lDesconcentrado", litemSedesDescontrados);
        //Listando los tipos_evaluaciones
        List<Libretas> lTiposEvaluaciones = this.mi.getTpsListarTiposEvaluaciones();
        for (Libretas item : lTiposEvaluaciones) {
            litemTiposEvaluaciones.add(new ItemViewModel(item.getId_tipo_evaluacion(), -1, item.getTipo_evaluacion()));
        }
        modelo.put("lTiposEvaluaciones", litemTiposEvaluaciones);

        modelo.put("nombre_completo", nombreCompleto);
        modelo.put("programa", programa);
        modelo.put("id_estudiante", cliente.getInt(request, "id_estudiante"));
        modelo.put("gestion", cliente.getGestion());
        modelo.put("periodo", cliente.getPeriodo());
        return new ModelAndView("administrarProgramasEspecializados/cambioaulas/SeleccionarPeriodoGestion", modelo);
    }

}
