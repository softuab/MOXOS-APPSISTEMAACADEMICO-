package org.fautapo.web.administrarPostulantes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.fautapo.Model.ItemViewModel;

import org.fautapo.domain.Clientes;
//import org.fautapo.domain.Programas;
//import org.fautapo.domain.Planes;
import org.fautapo.domain.Postulantes;
import org.fautapo.domain.Personas;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.fautapo.util.Util;
import org.json.JSONArray;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-04-05
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-04-05
 */
public class ModificarPstPersona implements Controller {

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
        List<ItemViewModel> litemDepartamentos = new ArrayList<>();
        List<ItemViewModel> litemProvincia = new ArrayList<>();
        List<ItemViewModel> litemLocalidad = new ArrayList<>();
        List<ItemViewModel> litemColegios = new ArrayList<>();

        String sIdPersona = request.getParameter("id_persona");
        String sIdPostulante = request.getParameter("id_postulante");

        Personas dPaises = new Personas();

        if (Util.isNullOrBlank(sIdPersona)) {
            return new ModelAndView("Error", "mensaje", "Faltan datos");
        }

        //Buscar Datos Pst_persona
        Postulantes datosPstPersona = new Postulantes();
        datosPstPersona.setId_persona(Integer.parseInt(sIdPersona));
        datosPstPersona = this.mi.getPstBuscarPersona(datosPstPersona);
        modelo.put("datosPstPersona", datosPstPersona);
        Postulantes datosColegio = new Postulantes();
        datosColegio.setId_persona(Integer.parseInt(sIdPersona));
        datosColegio = this.mi.getBuscarPstPersonaColegio(datosColegio);
        modelo.put("datosColegio", datosColegio);

        //Listando Paises
        List<Personas> lPaises = this.mi.getListarPaises();
        modelo.put("lPaises", lPaises);
        List<Personas> lDepartamentos = this.mi.getListarDepartamentos(dPaises);
        for (Personas item : lDepartamentos) {
            litemDepartamentos.add(new ItemViewModel(item.getId_departamento(), item.getId_pais(), item.getDepartamento()));
        }
        modelo.put("lDepartamentos", new JSONArray(litemDepartamentos));

        List<Personas> lProvincias = this.mi.getListarProvincias(dPaises);
        for (Personas item : lProvincias) {
            litemProvincia.add(new ItemViewModel(item.getId_provincia(), item.getId_departamento(), item.getProvincia()));
        }
        modelo.put("lProvincias", new JSONArray(litemProvincia));

        List<Personas> lLocalidades = this.mi.getListarLocalidades(dPaises);
        for (Personas item : lLocalidades) {
            litemLocalidad.add(new ItemViewModel(item.getId_localidad(), item.getId_provincia(), item.getLocalidad()));
        }
        modelo.put("lLocalidades", new JSONArray(litemLocalidad));
        //Listar Tipos
        List<Personas> lTiposSexos = this.mi.getListarTiposSexos();
        modelo.put("lTiposSexos", lTiposSexos);

        List<Personas> lTiposEstadosCiviles = this.mi.getListarTiposEstadosCiviles();
        modelo.put("lTiposEstadosCiviles", lTiposEstadosCiviles);

        List<Personas> lTiposEmpresasTelefonicas = this.mi.getListarTiposEmpresasTelef();
        modelo.put("lTiposEmpresasTelefonicas", lTiposEmpresasTelefonicas);

        List<Personas> lTiposInstituciones = this.mi.getListarTiposInstituciones();
        modelo.put("lTiposInstituciones", lTiposInstituciones);

        List<Personas> lColegiosTipoInst = this.mi.getListarColegiosTipoIns(dPaises);
        for (Personas item : lColegiosTipoInst) {
            litemColegios.add(new ItemViewModel(item.getId_colegio(), item.getId_tipo_institucion(), item.getColegio()));
        }
        modelo.put("lColegiosTipoInst", new JSONArray(litemColegios));

        List<Personas> lTiposTurnos = this.mi.getListarTiposTurnos();
        modelo.put("lTiposTurnos", lTiposTurnos);
        //Fin listar tipos

        modelo.put("gestion", Integer.toString(cliente.getGestion()));
        modelo.put("periodo", Integer.toString(cliente.getPeriodo()));
        modelo.put("cliente", cliente);
        modelo.put("id_persona", sIdPersona);
        modelo.put("id_postulante", sIdPostulante);

        return new ModelAndView("administrarPostulantes/ModificarPstPersona", modelo);

    }
}
