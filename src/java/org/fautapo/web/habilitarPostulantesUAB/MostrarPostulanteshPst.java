package org.fautapo.web.habilitarPostulantesUAB;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Postulantes;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-04-05
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-04-05
 */
public class MostrarPostulanteshPst implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //Sacamos los datos de la session
        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
        if (cliente == null) {
            return new ModelAndView("Aviso", "mensaje", "Su sesion ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");
        }
        Map<String, Object> modelo = new HashMap<>();
        String sIdFacultad = request.getParameter("id_facultad");
        String sIdPrograma = request.getParameter("id_programa");
        String sGestion = cliente.getString(request, "gestion");
        String sPeriodo = cliente.getString(request, "periodo");

        String sIdPostulanteHab[] = request.getParameterValues("id_postulante_hab");
        String sIdPostulante;
        Postulantes datosP = null;
        List<Postulantes> lPostulantesSelec = new ArrayList<>();

        if (sIdPostulanteHab != null) {
            for (int i = 0; i < sIdPostulanteHab.length; i++) {
                datosP = new Postulantes();
                sIdPostulante = sIdPostulanteHab[i];
                datosP.setId_postulante(Integer.parseInt(sIdPostulante));
                datosP = this.mi.getPstBuscarPostulanteNombres(datosP);
                lPostulantesSelec.add(datosP);
            }
        }
        modelo.put("lPostulantesSelec", lPostulantesSelec);
        modelo.put("id_facultad", sIdFacultad);
        modelo.put("id_programa", sIdPrograma);
        modelo.put("gestion", sGestion);
        modelo.put("periodo", sPeriodo);

        return new ModelAndView("habilitarPostulantesUAB/MostrarPostulantes", modelo);

    }
}
