package org.fautapo.web.administrarProgramasEspecializados.matriculacionEstudiantesNuevosPost;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.fautapo.Model.ItemViewModel;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Postulantes;
import org.fautapo.domain.Personas;
import org.fautapo.domain.Universidades;
import org.fautapo.domain.Programas;
import org.fautapo.domain.Planes;
import org.fautapo.domain.Abm;
import org.fautapo.domain.Facultades;
import org.fautapo.domain.Perfiles;
import org.fautapo.domain.ProgramasDesconcentrados;
import org.fautapo.domain.logic.MiFacade;
import org.json.JSONArray;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-03-30
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-03-30
 */
public class BuscarDatosPostulante implements Controller {

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
        List<ItemViewModel> litemFacultades = new ArrayList<>();
        List<ItemViewModel> litemProgramas = new ArrayList<>();
        List<ItemViewModel> litemPlanes = new ArrayList<>();
        List<ItemViewModel> litemSedesDescontrados = new ArrayList<>();
        List<ItemViewModel> litemDepartamentos = new ArrayList<>();
        List<ItemViewModel> litemProvincia = new ArrayList<>();
        List<ItemViewModel> litemLocalidad = new ArrayList<>();
        List<ItemViewModel> litemColegios = new ArrayList<>();

        int iIdPostulante = cliente.getInt(request, "id_postulante");
        int iGestion = cliente.getInt(request, "gestion");
        int iPeriodo = cliente.getInt(request, "periodo");
        modelo.put("gestion", Integer.toString(iGestion));
        modelo.put("periodo", Integer.toString(iPeriodo));
        modelo.put("nombre", request.getParameter("nombre"));
        modelo.put("dip", request.getParameter("dip"));

        Programas bProg = new Programas();
        Postulantes tiposDoc = new Postulantes();
        Personas dPaises = new Personas();
        //Buscamos datos del postulante aprobado
        if (iIdPostulante > 0) {
            Postulantes bPst = new Postulantes();
            bPst.setId_postulante(iIdPostulante);
            bPst = this.mi.getPstBuscarPostulanteNombres(bPst);
            modelo.put("bPst", bPst);
            //Buscar datosPstColegio
            if (bPst != null) {
                bPst.setId_persona(bPst.getId_persona());
                Postulantes bPstColegio = this.mi.getBuscarPstPersonaColegio(bPst);
                modelo.put("bPstColegio", bPstColegio);
            }

            bProg.setId_programa(bPst.getId_programa());
            bProg = this.mi.getPrgBuscarPrograma(bProg);
            modelo.put("id_facultad", Integer.toString(bProg.getId_facultad()));
        }

        //Listando Facultades
        Universidades datosUniversidad = new Universidades();
        datosUniversidad.setId_universidad(cliente.getId_universidad());
        List<Facultades> lFacultades = this.mi.getUnvListarFacultadesPost(datosUniversidad);
        for (Facultades item : lFacultades) {
            litemFacultades.add(new ItemViewModel(item.getId_facultad(), -1, item.getFacultad()));
        }
        modelo.put("lFacultades", litemFacultades);

        //Listando Programa
        //Sacamos el listado de los programas
        List<Programas> lProgramas = this.mi.getUnvListarProgramasPost(datosUniversidad);
        for (Programas item : lProgramas) {
            litemProgramas.add(new ItemViewModel(item.getId_programa(), item.getId_facultad(), item.getPrograma()));
        }
        modelo.put("id_programa", bProg.getId_programa());
        modelo.put("lProgramas", new JSONArray(litemProgramas));

        //Listar Plan del programa actual
        List<Planes> lPlanesActual = this.mi.getListarPrgPlanesUniversitarios();
        for (Planes item : lPlanesActual) {
            litemPlanes.add(new ItemViewModel(item.getId_prg_plan(), item.getId_programa(), item.getId_plan() + " - " + item.getTipo_grado()));
        }
        modelo.put("lPlanesActual", new JSONArray(litemPlanes));

        // lista de areas desconcentradas por carrera
        List<ProgramasDesconcentrados> lDesconcentrado = this.mi.getListarProgramasDesconcentrados();
        for (ProgramasDesconcentrados item : lDesconcentrado) {
            litemSedesDescontrados.add(new ItemViewModel(item.getId_desconcentrado(), item.getId_programa(), item.getSede_desconcentrada()));
        }
        modelo.put("lDesconcentrado", new JSONArray(litemSedesDescontrados));

        //Listando los tipos 
        List<Postulantes> lTiposClasificaciones = this.mi.getListarTiposClasificacionesPost();
        modelo.put("lTiposClasificaciones", lTiposClasificaciones);

        //Listar TiposDocumentos*tipoclasificacion
        List lTiposDocumentosClasf = this.mi.getListarTiposDocumentosClasificacionVigente(tiposDoc);
        modelo.put("lTiposDocumentosClasf", lTiposDocumentosClasf);
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
        
        //Tipo estudiante Nuevo y Tipo Grado
        Personas tipoEst = new Personas();
        tipoEst.setId_tipo_estudiante(1); //Estudiante Nuevo
        tipoEst = this.mi.getBuscarTipoEstudiante(tipoEst);
        modelo.put("tipoEst", tipoEst);
        Planes datoPlan = new Planes();
        datoPlan.setId_tipo_grado(1);//Grado Universitario
        datoPlan = this.mi.getBuscarTiposGrados(datoPlan);
        modelo.put("datoPlan", datoPlan);

        //Listamos tipos descuentos
        List<Perfiles> lTiposDescuentos = this.mi.getTrnListarTiposDescuentos();
        modelo.put("lTiposDescuentos", lTiposDescuentos);

        //Sacamos el formato de la fecha
        Abm formatoFecha = new Abm();
        formatoFecha.setCampo("formato_fecha");
        formatoFecha.setCodigo("dibrap");
        modelo.put("formatoFecha", this.mi.getDibBuscarParametro(formatoFecha));

        //Para wayka
        modelo.put("id_proceso", cliente.getString(request, "id_proceso"));
        modelo.put("titulo", cliente.getString(request, "titulo"));
        modelo.put("id_tramite", cliente.getString(request, "id_tramite"));

        return new ModelAndView("administrarProgramasEspecializados/matriculacionEstudiantesNuevosPost/BuscarDatosPostulante", modelo);

    }
}
