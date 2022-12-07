package org.fautapo.web.habilitarPostulantesUAB;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Postulantes;
import org.fautapo.domain.Programas;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-03-30
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-03-30
 */
public class ListarPostulanteshPst implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
        if (cliente == null) {
            return new ModelAndView("Error", "mensaje", "Tu sesi�n termino. Por favor, ingresa nuevamente.");
        }
        Map<String, Object> modelo = new HashMap<>();
        String sGestion = cliente.getString(request, "gestion");
        String sPeriodo = cliente.getString(request, "periodo");
        //Si dio volver recuperamos los datos
        String sIdFacultad = request.getParameter("id_facultad");
        String sIdPrograma = request.getParameter("id_programa");
        List<Postulantes> listaPostulantes;

        Postulantes postulante = new Postulantes();
        postulante.setGestion(Integer.parseInt(sGestion));
        postulante.setPeriodo(Integer.parseInt(sPeriodo));

        if ((!"".equals(sIdPrograma)) && (!"".equals(sGestion)) && (!"".equals(sPeriodo))) {
            postulante.setId_programa(Integer.parseInt(sIdPrograma));
            listaPostulantes = this.mi.getMiListarPstProgramaGestionPeriodo(postulante);
            modelo.put("listaPostulantes", listaPostulantes);
            Programas programa = new Programas();
            programa.setId_programa(Integer.parseInt(sIdPrograma));
            programa = this.mi.getPrgBuscarPrograma(programa);
            modelo.put("programa", programa);
        } else {
            return new ModelAndView("Error", "mensaje", "Faltan datos");
        }
 
        modelo.put("gestion", sGestion);
        modelo.put("periodo", sPeriodo);
        modelo.put("id_facultad", sIdFacultad);
        modelo.put("id_programa", sIdPrograma);

        return new ModelAndView("habilitarPostulantesUAB/ListarPostulantes", modelo);
    }
}
