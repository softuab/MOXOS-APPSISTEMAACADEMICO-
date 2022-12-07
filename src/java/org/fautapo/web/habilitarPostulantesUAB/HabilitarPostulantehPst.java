package org.fautapo.web.habilitarPostulantesUAB;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
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
public class HabilitarPostulantehPst implements Controller {

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
        String sIdPrograma = cliente.getString(request, "id_programa");
        String sIdFacultad = cliente.getString(request, "id_facultad");
        String sGestion = cliente.getString(request, "gestion");
        String sPeriodo = cliente.getString(request, "periodo");
        String sIdPostulanteHab[] = request.getParameterValues("id_postulante_hab");
        String sIdPostulante;
        int iResultado = 0;
        List<Postulantes> listaPostulantes;
        Postulantes datosP = null;
        if (sIdPostulanteHab != null) {
            for (int i = 0; i < sIdPostulanteHab.length; i++) {
                datosP = new Postulantes();
                sIdPostulante = sIdPostulanteHab[i];
                datosP.setId_postulante(Integer.parseInt(sIdPostulante));
                datosP.setId_estado("A"); //Regis
                datosP.setUlt_usuario(cliente.getId_usuario()); //Regis
                iResultado = this.mi.setPstModificarEstadoPostulante(datosP);
            }
        }

        if (iResultado == 1) {
            datosP = new Postulantes();
            datosP.setGestion(Integer.parseInt(sGestion));
            datosP.setPeriodo(Integer.parseInt(sPeriodo));
            datosP.setId_programa(Integer.parseInt(sIdPrograma));
            listaPostulantes = this.mi.getMiListarPstProgramaGestionPeriodo(datosP);
            modelo.put("listaPostulantes", listaPostulantes);
        } else {
            return new ModelAndView("Error", "mensaje", "No se ha realizado el registro");
        }

        modelo.put("id_programa", sIdPrograma);
        modelo.put("id_facultad", sIdFacultad);
        modelo.put("gestion", sGestion);
        modelo.put("periodo", sPeriodo);

        return new ModelAndView("habilitarPostulantesUAB/ListarPostulantes", modelo);

    }
}
