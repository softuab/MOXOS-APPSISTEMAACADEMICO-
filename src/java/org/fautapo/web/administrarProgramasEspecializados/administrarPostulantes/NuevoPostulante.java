package org.fautapo.web.administrarProgramasEspecializados.administrarPostulantes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.fautapo.Model.ItemViewModel;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Programas;
import org.fautapo.domain.Universidades;
import org.fautapo.domain.Personas;
import org.fautapo.domain.Perfiles;
import org.fautapo.domain.Abm;
import org.fautapo.domain.Facultades;
import org.fautapo.domain.Planes;
import org.fautapo.domain.Postulantes;
import org.fautapo.domain.ProgramasDesconcentrados;
import org.fautapo.domain.logic.MiFacade;
import org.json.JSONArray;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-04-05
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-04-05
 */
public class NuevoPostulante implements Controller {

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
        int iGestion = cliente.getGestion();
        int iPeriodo = cliente.getPeriodo();
        List<ItemViewModel> litemFacultades = new ArrayList<>();
        List<ItemViewModel> litemProgramas = new ArrayList<>();
        List<ItemViewModel> litemPlanes = new ArrayList<>();
        List<ItemViewModel> litemSedesDescontrados = new ArrayList<>();
        List<ItemViewModel> litemDepartamentos = new ArrayList<>();
        List<ItemViewModel> litemProvincia = new ArrayList<>();
        List<ItemViewModel> litemLocalidad = new ArrayList<>();
        List<ItemViewModel> litemColegios = new ArrayList<>();
        List<ItemViewModel> litemAdmisiones = new ArrayList<>();

        //Para wayka
        String sIdProceso = request.getParameter("id_proceso");
        String sIdTramite = request.getParameter("id_tramite");
        String sTitulo = request.getParameter("titulo");
        modelo.put("titulo", sTitulo);
        modelo.put("id_proceso", sIdProceso);
        modelo.put("id_tramite", sIdTramite);

        //Sacamos el formato de la fecha
        Abm formatoFecha = new Abm();
        formatoFecha.setCampo("formato_fecha");
        formatoFecha.setCodigo("dibrap");
        modelo.put("formatoFecha", this.mi.getDibBuscarParametro(formatoFecha));

        Programas datoPrograma = null;
        Personas dPaises = new Personas();

        //Listar tipos
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
        //Listando Facultades
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
        modelo.put("id_programa", -1);
        modelo.put("lProgramas", new JSONArray(litemProgramas));

        //Listar Plan del programa actual
        List<Planes> lPlanesActual = this.mi.getListarPrgPlanesUniversitarios();
        for (Planes item : lPlanesActual) {
            litemPlanes.add(new ItemViewModel(item.getId_prg_plan(), item.getId_programa(), item.getId_plan() + " - " + item.getTipo_grado()));
        }
        modelo.put("lPlanesActual", new JSONArray(litemPlanes));

        List<ProgramasDesconcentrados> lDesconcentrado = this.mi.getListarProgramasDesconcentrados();
        for (ProgramasDesconcentrados item : lDesconcentrado) {
            litemSedesDescontrados.add(new ItemViewModel(item.getId_desconcentrado(), item.getId_programa(), item.getSede_desconcentrada()));
        }
        modelo.put("lDesconcentrado", new JSONArray(litemSedesDescontrados));

        //Listando los tipos
        Programas datosTipoAdmision = new Programas();
        datosTipoAdmision.setGestion(iGestion);
        datosTipoAdmision.setPeriodo(iPeriodo);
        List<Programas> lTiposAdmisiones = this.mi.getListarTiposAdmisionesPrograma(datosTipoAdmision);
        for (Programas item : lTiposAdmisiones) {
            litemAdmisiones.add(new ItemViewModel(item.getId_tipo_admision(), item.getId_programa(), item.getTipo_admision()));
        }
        modelo.put("lTiposAdmisiones", new JSONArray(litemAdmisiones));

        //Buscamos el id_tipo_perfil, id_perfil
        if (!"".equals(sIdProceso) && (sIdProceso != null)) {
            Perfiles datoPerfil = new Perfiles();
            datoPerfil.setId_proceso(Integer.parseInt(sIdProceso));
            List<Perfiles> lPerfilesProcesos = this.mi.getTrnMiListarPerfilesProceso(datoPerfil);
            modelo.put("lPerfilesProcesos", lPerfilesProcesos);
        } else {
            return new ModelAndView("Error", "mensaje", "No existe el proceso. Verifique");
        }
        //Listamos tipos descuentos
        List<Perfiles> lTiposDescuentos = this.mi.getTrnListarTiposDescuentos();
        modelo.put("lTiposDescuentos", lTiposDescuentos);

        //Listar TiposDocumentos*tipoclasificacion
        Postulantes tiposDoc = new Postulantes();
        tiposDoc.setId_tipo_clasificacion(1); //Por ser Vestibular
        List<Postulantes> lTiposDocumentosClasf = this.mi.getListarTiposDocumentosClasificacionVigente(tiposDoc);
        modelo.put("lTiposDocumentosClasf", lTiposDocumentosClasf);

        modelo.put("gestion", Integer.toString(iGestion));
        modelo.put("periodo", Integer.toString(iPeriodo));
        modelo.put("cliente", cliente);
        return new ModelAndView("administrarProgramasEspecializados/administrarPostulantes/NuevoPostulante", modelo);
    }
}
