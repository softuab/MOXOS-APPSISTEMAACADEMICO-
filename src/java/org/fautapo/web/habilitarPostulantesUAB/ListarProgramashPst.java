package org.fautapo.web.habilitarPostulantesUAB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.fautapo.Model.ItemViewModel;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Usuarios;
import org.fautapo.domain.Accesos;
import org.fautapo.domain.Facultades;
import org.fautapo.domain.Programas;
import org.fautapo.domain.Universidades;

import org.fautapo.domain.logic.MiFacade;
import org.json.JSONArray;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2005-11-01
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-07-17
 */
public class ListarProgramashPst implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
        if (cliente == null) {
            return new ModelAndView("Aviso", "mensaje", "Su sesi�n ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");
        }
        Map<String, Object> modelo = new HashMap<>();
        List<ItemViewModel> litemFacultades = new ArrayList<>();
        List<ItemViewModel> litemProgramas = new ArrayList<>();
        //Si dio volver recuperamos los datos
        String sIdFacultad = request.getParameter("id_facultad");
        String sIdPrograma = request.getParameter("id_programa");
        String sGestion = cliente.getString(request, "gestion");
        String sPeriodo = cliente.getString(request, "periodo");

        modelo.put("id_facultad", sIdFacultad);
        modelo.put("id_programa", sIdPrograma);

        // Comprobamos es quien debe, de acuerdo a su clave
        Usuarios datosUsuario = new Usuarios();
        datosUsuario.setId_usuario(cliente.getId_usuario());
        datosUsuario.setClave(request.getParameter("clave" + request.getParameter("hora")));

        if (null == this.mi.getComprobarUsuario(datosUsuario)) {
            return new ModelAndView("Error", "mensaje", "Clave incorrecta, por favor intente nuevamente");
        }

        modelo.put("cliente", cliente);
        modelo.put("acceso", (Accesos) request.getSession().getAttribute("__sess_acceso"));

        //Sacamos el listado de las facultades
        Universidades datosUniversidad = new Universidades();
        datosUniversidad.setId_universidad(cliente.getId_universidad());
        List<Facultades> lFacultades = this.mi.getUnvListarFacultades(datosUniversidad);
        for (Facultades item : lFacultades) {
            litemFacultades.add(new ItemViewModel(item.getId_facultad(), -1, item.getFacultad()));
        }
        modelo.put("lFacultades", litemFacultades);

        //Sacamos el listado de los programas
        List<Programas> lProgramas = this.mi.getUnvListarProgramas(datosUniversidad);
        for (Programas item : lProgramas) {
            litemProgramas.add(new ItemViewModel(item.getId_programa(), item.getId_facultad(), item.getPrograma()));
        }
        modelo.put("lProgramas", new JSONArray(litemProgramas));
        modelo.put("gestion", sGestion);
        modelo.put("periodo", sPeriodo);

        return new ModelAndView("habilitarPostulantesUAB/ListarProgramas", modelo);
    }
}
