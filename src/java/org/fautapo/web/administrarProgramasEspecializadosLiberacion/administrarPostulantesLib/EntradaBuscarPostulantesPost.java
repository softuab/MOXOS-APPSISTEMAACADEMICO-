package org.fautapo.web.administrarProgramasEspecializadosLiberacion.administrarPostulantesLib;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Actividades;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-01-13
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-07-17
 */
public class EntradaBuscarPostulantesPost implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> modelo = new HashMap<>();

        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
        if (cliente == null) {
            return new ModelAndView("Aviso", "mensaje", "Su sesi�n ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");
        }

        //Para Wayka
        String sIdTramite = request.getParameter("id_tramite");
        String sIdProceso = cliente.getString(request, "id_proceso");
        if ((sIdProceso != null) && (!"".equals(sIdProceso))) {
            Actividades proceso = new Actividades();
            proceso.setId_proceso(Integer.parseInt(sIdProceso));
            proceso = this.mi.getBuscarProceso(proceso);
            modelo.put("titulo", proceso.getProceso());

        }
        modelo.put("id_proceso", cliente.getString(request, "id_proceso"));
        modelo.put("id_tramite", sIdTramite);

        return new ModelAndView("administrarProgramasEspecializadosLiberacion/administrarPostulantesLib/EntradaBuscarPostulantes", modelo);
    }
}
