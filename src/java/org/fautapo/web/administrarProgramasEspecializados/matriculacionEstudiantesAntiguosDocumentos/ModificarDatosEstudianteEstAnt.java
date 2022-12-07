package org.fautapo.web.administrarProgramasEspecializados.matriculacionEstudiantesAntiguosDocumentos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.fautapo.Model.ItemViewModel;

import org.fautapo.domain.Abm;
import org.fautapo.domain.Clientes;
import org.fautapo.domain.Actividades;
import org.fautapo.domain.Personas;
import org.fautapo.domain.Planes;
import org.fautapo.domain.Postulantes;
import org.fautapo.domain.Programas;
import org.fautapo.domain.Estudiantes;
import org.fautapo.domain.Facultades;
import org.fautapo.domain.Perfiles;
import org.fautapo.domain.logic.MiFacade;
import org.json.JSONArray;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-01-13
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-07-17
 */
public class ModificarDatosEstudianteEstAnt implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String parameterProceso = "id_proceso";
        String modelName = "mensaje";
        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
        if (cliente == null) {
            return new ModelAndView("Aviso", modelName, "Su sesi�n ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");
        }
        Map<String, Object> modelo = new HashMap<>(); 
        List<ItemViewModel> litemDepartamentos = new ArrayList<>();
        List<ItemViewModel> litemProvincia = new ArrayList<>();
        List<ItemViewModel> litemLocalidad = new ArrayList<>();
        List<ItemViewModel> litemColegios = new ArrayList<>();

        //Para Wayka
        String sIdTramite = request.getParameter("id_tramite");
        String sIdProceso = cliente.getString(request, parameterProceso);
        String sIdEstudiante = cliente.getString(request, "id_estudiante");
        Planes datoPlan = new Planes();
        Programas bProg = new Programas(); 
        Personas dPaises = new Personas();

        modelo.put("id_proceso", cliente.getString(request, parameterProceso));
        modelo.put("id_tramite", sIdTramite);
        modelo.put("ru", cliente.getString(request, "ru"));

        if ((sIdProceso != null) && (!"".equals(sIdProceso))) {
            Actividades proceso = new Actividades();
            proceso.setId_proceso(Integer.parseInt(sIdProceso));
            proceso = this.mi.getBuscarProceso(proceso);
            modelo.put("titulo", proceso.getProceso());
        }

        if ((sIdEstudiante != null) && (!"".equals(sIdEstudiante))) {
            //Busco datos del Estudiante
            Estudiantes datosEst = new Estudiantes();
            datosEst.setId_estudiante(Integer.parseInt(sIdEstudiante));

            //Primero verificamos si tiene que esta dentro del limite de regularizacion y tiene suspencion
            //Listar el ultimo est_regularizacion
            datosEst.setId_tipo_regularizacion(1); //Suspencion=1
            Estudiantes ultimoEstRegularizacion = this.mi.getMiBuscarUltimoEstRegularizacion(datosEst);
            modelo.put("ultimoEstRegularizacion", ultimoEstRegularizacion);

            if (ultimoEstRegularizacion != null) {
                //Sacando el parametro gestiones_suspenciones en _parameteros  
                return new ModelAndView("Aviso", modelName, "El estudiante con R.U. " + sIdEstudiante
                        + " tiene SUSPENCION por lo que  puede estar Bloqueado. Debe regularizar su situacion para el tipo de regularizacion " + ultimoEstRegularizacion.getTipo_regularizacion() + ".");
            }

            //Listamos sus matriculas
            List<Estudiantes> lMatriculasEstudiante = this.mi.getMtrListarMatriculasEstudiante(datosEst);
            modelo.put("lMatriculasEstudiante", lMatriculasEstudiante);

            //Buscar Datos del Estudiante
            datosEst = this.mi.getEstBuscarEstudiantePrs(datosEst);
            modelo.put("datosEst", datosEst);
            bProg.setId_programa(datosEst.getId_programa());
            bProg = this.mi.getPrgBuscarPrograma(bProg);
            modelo.put("datosPrograma", bProg);
            Facultades datosFacultad = new Facultades();
            datosFacultad.setId_facultad(bProg.getId_facultad());
            datosFacultad = this.mi.getFclBuscarFacultad(datosFacultad);
            modelo.put("datosFacultad", datosFacultad);
            //Buscar Persona Colegio
            Personas datosPrs = new Personas();
            datosPrs.setId_persona(datosEst.getId_persona());
            datosPrs = this.mi.getPrsBuscarPersona(datosPrs);
            Personas datosCol = this.mi.getBuscarPersonaColegio(datosPrs);
            modelo.put("datosPrs", datosPrs);
            modelo.put("datosCol", datosCol);

            //Listando Tipos Clasificacion
            List<Postulantes> lTiposClasificaciones = this.mi.getListarTiposClasificaciones();
            modelo.put("lTiposClasificaciones", lTiposClasificaciones);

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

            //lista de localidades
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

            List<Personas> lTiposEstudiantes = this.mi.getListarTiposEstudiantes();
            modelo.put("lTiposEstudiantes", lTiposEstudiantes);

            //Tipo estudiante Nuevo y Tipo Grado
            Personas tipoEst = new Personas();
            tipoEst.setId_tipo_estudiante(datosEst.getId_tipo_estudiante()); //Estudiante Nuevo
            tipoEst = this.mi.getBuscarTipoEstudiante(tipoEst);
            modelo.put("tipoEst", tipoEst);
            datoPlan.setId_tipo_grado(datosEst.getId_tipo_grado());//Grado Universitario
            datoPlan = this.mi.getBuscarTiposGrados(datoPlan);
            modelo.put("datoPlan", datoPlan);

            //Buscar Tipo clasificacion estudiante
            Estudiantes datosClas = new Estudiantes();
            datosClas.setId_estudiante(datosEst.getId_estudiante());
            datosClas = this.mi.getBuscarTipoClasificacionEstudiante(datosClas);
            modelo.put("datosClas", datosClas);

            //Listamos tipos descuentos
            List<Perfiles> lTiposDescuentos = this.mi.getTrnListarTiposDescuentos();
            modelo.put("lTiposDescuentos", lTiposDescuentos);

            //Sacamos el formato de la fecha
            Abm formatoFecha = new Abm();
            formatoFecha.setCampo("formato_fecha");
            formatoFecha.setCodigo("dibrap");
            modelo.put("formatoFecha", this.mi.getDibBuscarParametro(formatoFecha));
            //Sacamos el formata de la gestion siguiente
            formatoFecha.setCampo("gestion_siguiente");
            formatoFecha.setCodigo("mi");
            modelo.put("gestion_siguiente", this.mi.getDibBuscarParametro(formatoFecha));
            //Sacamos el formata de la periodo siguiente
            formatoFecha.setCampo("periodo_siguiente");
            formatoFecha.setCodigo("mi");
            modelo.put("periodo_siguiente", this.mi.getDibBuscarParametro(formatoFecha));

            return new ModelAndView("administrarProgramasEspecializados/matriculacionEstudiantesAntiguosDocumentos/ModificarDatosEstudiante", modelo);

        }
        return new ModelAndView("administrarProgramasEspecializados/matriculacionEstudiantesAntiguosDocumentos/EntradaBuscarEstudiantes", modelo);
    }
}