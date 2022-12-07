package org.fautapo.web.administrarProgramasEspecializados.matriculacionEstudiantesNuevos;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Actividades;
import org.fautapo.domain.Personas;
import org.fautapo.domain.Planes;
import org.fautapo.domain.Postulantes;
import org.fautapo.domain.Programas;
import org.fautapo.domain.Estudiantes;
import org.fautapo.domain.Universidades;
import org.fautapo.domain.Tramites;
import org.fautapo.domain.Abm;
import org.fautapo.domain.Facultades;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-01-13
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-07-17
 */
public class EntradaBuscarPostulantesNuevo implements Controller {

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
        //Para Wayka
        String sIdTramite = request.getParameter("id_tramite");
        String sIdProceso = cliente.getString(request, "id_proceso");

        modelo.put("id_proceso", sIdProceso);
        modelo.put("id_tramite", sIdTramite);

        //Sacamos el formato de la fecha
        Abm formatoFecha = new Abm();
        formatoFecha.setCampo("formato_fecha");
        formatoFecha.setCodigo("dibrap");
        modelo.put("formatoFecha", this.mi.getDibBuscarParametro(formatoFecha));
        //Sacamos el formatO de la GESTION SIGUIENTE
        formatoFecha.setCampo("gestion_siguiente");
        formatoFecha.setCodigo("mi");
        String sGestion = this.mi.getDibBuscarParametro(formatoFecha);
        modelo.put("gestion", sGestion);

        //Sacamos el formata de la PERIODO SIGUIENTE
        formatoFecha.setCampo("periodo_siguiente");
        formatoFecha.setCodigo("mi");
        String sPeriodo = this.mi.getDibBuscarParametro(formatoFecha);
        modelo.put("periodo", sPeriodo);

        if ((sIdProceso != null) && (!"".equals(sIdProceso))) {
            Actividades proceso = new Actividades();
            proceso.setId_proceso(Integer.parseInt(sIdProceso));
            proceso = this.mi.getBuscarProceso(proceso);
            if (proceso == null) {
                return new ModelAndView("Error", "mensaje", "No ingreso el proceso");
            }
            modelo.put("titulo", proceso.getProceso());

        }

        //Listamos los tipos de Admision que existen
        List<Programas> lTiposAdmisiones = this.mi.getListarTiposAdmisiones();
        modelo.put("lTiposAdmisiones", lTiposAdmisiones);

        Planes datoPlan = new Planes();
        Programas bProg = new Programas();
        Postulantes tiposDoc = new Postulantes();
        Personas dPaises = new Personas();
        if ((sIdTramite != null) && (!"".equals(sIdTramite))) {
            //Si el tamite existe busco el id_estudiante
            Tramites tramite = new Tramites();
            tramite.setId_tramite(Integer.parseInt(sIdTramite));
            tramite.setEtiqueta("id_estudiante");
            tramite = (Tramites) this.mi.getBuscarCampoGw(tramite);
            String sIdEstudiante = tramite.getValores();
            if (("".equals(sIdEstudiante)) || (sIdEstudiante == null)) {
                return new ModelAndView("Error", "mensaje", "En este Nro. de tramite no se encuentra el R.U. del estudiante");
            }

            //Busco datos del Estudiante
            Estudiantes datosEst = new Estudiantes();
            datosEst.setId_estudiante(Integer.parseInt(sIdEstudiante));
            datosEst = this.mi.getEstBuscarEstudiantePrs(datosEst);
            modelo.put("datosEst", datosEst);
            bProg.setId_programa(datosEst.getId_programa());
            bProg = this.mi.getPrgBuscarPrograma(bProg);
            modelo.put("id_facultad", Integer.toString(bProg.getId_facultad()));
            //Buscar Persona
            Personas datosPrs = new Personas();
            datosPrs.setId_persona(datosEst.getId_persona());
            datosPrs = this.mi.getPrsBuscarPersona(datosPrs);
            Personas datosCol = this.mi.getBuscarPersonaColegio(datosPrs);
            modelo.put("datosPrs", datosPrs);
            modelo.put("datosCol", datosCol);

            //Listando Facultades
            Universidades datosUniversidad = new Universidades();
            datosUniversidad.setId_universidad(cliente.getId_universidad());
            List<Facultades> lFacultades = this.mi.getUnvListarFacultades(datosUniversidad);
            modelo.put("lFacultades", lFacultades);
            //Listando Programa
            //Sacamos el listado de los programas
            List<Programas> lProgramas = this.mi.getUnvListarProgramas(datosUniversidad);
            modelo.put("lProgramas", lProgramas);
            //Listar Plan del programa actual
            List<Planes> lPlanesActual = this.mi.getListarPrgPlanesActual(datoPlan);
            modelo.put("lPlanesActual", lPlanesActual);

            //Listando los tipos  
            List<Postulantes> lTiposClasificaciones = this.mi.getListarTiposClasificaciones();
            modelo.put("lTiposClasificaciones", lTiposClasificaciones);
            //Listar TiposDocumentos*tipoclasificacion
            List<Postulantes> lTiposDocumentosClasf = this.mi.getListarTiposDocumentosClasificacionVigente(tiposDoc);
            modelo.put("lTiposDocumentosClasf", lTiposDocumentosClasf);
            //Listando Paises
            List<Personas> lPaises = this.mi.getListarPaises();
            modelo.put("lPaises", lPaises);
            List<Personas> lDepartamentos = this.mi.getListarDepartamentos(dPaises);
            modelo.put("lDepartamentos", lDepartamentos);
            List<Personas> lProvincias = this.mi.getListarProvincias(dPaises);
            modelo.put("lProvincias", lProvincias);
            List<Personas> lLocalidades = this.mi.getListarLocalidades(dPaises);
            modelo.put("lLocalidades", lLocalidades);
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
            modelo.put("lColegiosTipoInst", lColegiosTipoInst);
            List<Personas> lTiposTurnos = this.mi.getListarTiposTurnos();
            modelo.put("lTiposTurnos", lTiposTurnos);
            List<Planes> lTiposGrados = this.mi.getListarTiposGrados();
            modelo.put("lTiposGrados", lTiposGrados);
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

            return new ModelAndView("administrarProgramasEspecializados/matriculacionEstudiantesNuevos/ModificarDatosEstudiante", modelo);

        }
        return new ModelAndView("administrarProgramasEspecializados/matriculacionEstudiantesNuevos/EntradaBuscarPostulantes", modelo);
    }
}
