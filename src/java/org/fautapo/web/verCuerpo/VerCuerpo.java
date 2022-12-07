package org.fautapo.web.verCuerpo;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Tableros;

/**
 * @autor FAUTAPO
 * @fec_registro 2005-11-01
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2005-11-01
 */
public class VerCuerpo implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> modelo = new HashMap<>();

        String sId_rol, sVisita;
        String sEntrada = request.getParameter("entrada");
        String sBandera;

        try {
            Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
            sId_rol = Integer.toString(cliente.getId_rol());
        } catch (Exception e) {
            sId_rol = null;
        }

        if (sId_rol == null) {
            sVisita = "Si";
        } else {
            sVisita = "No";
        }
        modelo.put("sVisita", sVisita);

        //Listar Tableros
        return new ModelAndView("verCuerpo/VerCuerpo", modelo); //enviar "modelo" a "menu.jsp"

    }
}
