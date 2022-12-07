package org.fautapo.web.administrarProgramasEspecializados.matriculacionEstudiantesNuevos;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Postulantes;
import org.fautapo.domain.Personas;
import org.fautapo.domain.Tramites;
import org.fautapo.domain.Estudiantes;
import org.fautapo.domain.Perfiles;
import org.fautapo.domain.Planes;
import org.fautapo.domain.Abm;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-04-05
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-04-05
 */
public class RegistrarPersonaEstudiante implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    /**
     *
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String viewError = "Error";
        String modelName = "mensaje";
        String parameterTramite = "id_tramite";
        //Sacamos los datos de la session
        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
        if (cliente == null) {
            return new ModelAndView("Aviso", modelName, "Su sesion ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");
        }
        Map<String, Object> modelo = new HashMap<>();
        //Para wayka
        String idProceso = request.getParameter("id_proceso");
        String idTramite = request.getParameter(parameterTramite);
        String tituloProceso = request.getParameter("titulo_proceso");

        modelo.put("titulo", tituloProceso);
        modelo.put("id_proceso", idProceso);
        modelo.put(parameterTramite, idTramite);

        //obtener el descuento
        String sDescuento = request.getParameter("descuento");
        String idTipoDescuento = Integer.toString(cliente.getInt(request, "id_tipo_descuento"));

        int idPostulante = cliente.getInt(request, "id_postulante");
        String sPaterno = (request.getParameter("paterno")).trim();
        String sMaterno = (request.getParameter("materno")).trim();
        String sNombres = (request.getParameter("nombres")).trim();
        String sFecNacimiento = request.getParameter("fec_nacimiento");
        String sDireccion = (request.getParameter("direccion")).trim();
        String sTelefono = (request.getParameter("telefono")).trim();

        String sDip = (request.getParameter("dip")).trim();
        String idTipoSexo = cliente.getString(request, "id_tipo_sexo");
        String idTipoEstadoCivil = cliente.getString(request, "id_tipo_estado_civil");
        String idPais = cliente.getString(request, "id_pais_n");
        String idDepartamento = cliente.getString(request, "id_departamento_n");
        String idProvincia = cliente.getString(request, "id_provincia_n");
        String idLocalidad = cliente.getString(request, "id_localidad_n");
        String idTipoInstitucion = cliente.getString(request, "id_tipo_institucion");
        String idColegio = cliente.getString(request, "id_colegio");
        String idTipoTurno = cliente.getString(request, "id_tipo_turno");
        String idTipoClasificacion = cliente.getString(request, "id_tipo_clasificacion");
        int idTipoGraduacion = cliente.getInt(request, "id_tipo_graduacion");
        String idTipoEmpresaTelefonica = cliente.getString(request, "id_tipo_empresa_telefonica");
        int iAnioTitulacion = cliente.getInt(request, "anio_titulacion");
        String sTitulo = cliente.getString(request, "titulo");
        String sTipoSanguineo = cliente.getString(request, "tipo_sanguineo");
        int iNroHijos = cliente.getInt(request, "nro_hijos");
        int iNroDependientes = cliente.getInt(request, "nro_dependientes");
        String sNroSeguroMedico = cliente.getString(request, "nro_seguro_medico");
        String sCelular = cliente.getString(request, "celular");
        String sCorreo = cliente.getString(request, "correo");

        String idPrograma = request.getParameter("id_programa");
        String idTipoAdmision = cliente.getString(request, "id_tipo_admision");
        String idTipoGrado = cliente.getString(request, "id_tipo_grado");
        String idTipoEstudiante = cliente.getString(request, "id_tipo_estudiante");
        String sFecInscripcion = request.getParameter("fec_inscripcion");
        String sGestion = request.getParameter("gestion");
        String sPeriodo = request.getParameter("periodo");
        Integer idDesconcentrado = cliente.getInt(request, "id_desconcentrado");
        modelo.put("gestion", sGestion);
        modelo.put("periodo", sPeriodo);
        int idPrgPlan = cliente.getInt(request, "id_prg_plan");

        //Buscamos el plan de prg_planes
        Planes datosPlan = new Planes();
        datosPlan.setId_prg_plan(idPrgPlan);
        datosPlan = this.mi.getBuscarPrgPlan2(datosPlan);
        if (datosPlan == null) {
            return new ModelAndView(viewError, modelName, "No se puede encontrar el plan en Prg Planes");
        }
        String idPlan = datosPlan.getId_plan();
        //Listar Perfiles Procesos
        if (!"".equals(idProceso) && (idProceso != null)) {
            //Para Cajas 
            Perfiles datoPerfil = new Perfiles();
            datoPerfil.setId_proceso(Integer.parseInt(idProceso));
            List<Perfiles> lPerfilesProcesos = this.mi.getTrnMiListarPerfilesProceso(datoPerfil);
            if (lPerfilesProcesos.size() == 1) {
                modelo.put("contador", "1");
            }
            modelo.put("lPerfilesProcesos", lPerfilesProcesos);
        }
        //Fin Listar Perfiles Procesos   

        if ((!"".equals(idPlan)) && (idPlan != null) && (!"".equals(idPrograma)) && (idPrograma != null) && (!"".equals(idTipoAdmision)) && (!"".equals(idTipoGrado))
                && (!"".equals(idTipoEstudiante)) && (!"".equals(idTipoClasificacion))
                && (!"".equals(idPais)) && (!"".equals(idDepartamento)) && (!"".equals(idProvincia)) && (!"".equals(idLocalidad)) && (!"".equals(idTipoInstitucion)) && (!"".equals(idColegio)) && (!"".equals(idTipoTurno))
                && (!"".equals(sNombres)) && (sNombres != null) && (!"".equals(sDip)) && (sDip != null) && (!"".equals(sFecNacimiento)) && (sFecNacimiento != null)
                && (!"".equals(sDireccion)) && (!"".equals(idTipoEstadoCivil)) && (!"".equals(idTipoSexo)) && (!"".equals(idTipoEmpresaTelefonica)) && (!"".equals(sFecInscripcion))) {
            Personas datosP = new Personas();

            datosP.setId_pais(Integer.parseInt(idPais));
            datosP.setId_departamento(Integer.parseInt(idDepartamento));
            datosP.setId_provincia(Integer.parseInt(idProvincia));
            datosP.setId_localidad(Integer.parseInt(idLocalidad));
            datosP.setId_tipo_estado_civil(Integer.parseInt(idTipoEstadoCivil));
            datosP.setId_tipo_sexo(Integer.parseInt(idTipoSexo));
            datosP.setId_tipo_empresa_telefonica(Integer.parseInt(idTipoEmpresaTelefonica));
            datosP.setNombres(sNombres);
            datosP.setPaterno(sPaterno);
            datosP.setMaterno(sMaterno);
            datosP.setDip(sDip);
            datosP.setFec_nacimiento(sFecNacimiento);
            datosP.setDireccion(sDireccion);
            datosP.setTelefono(sTelefono);
            datosP.setCelular(sCelular);
            datosP.setCorreo(sCorreo);
            datosP.setAnio_titulacion(iAnioTitulacion);
            datosP.setTitulo(sTitulo);
            datosP.setTipo_sanguineo(sTipoSanguineo);
            datosP.setNro_hijos(iNroHijos);
            datosP.setNro_dependientes(iNroDependientes);
            datosP.setNro_seguro_medico(sNroSeguroMedico);
            datosP.setUlt_usuario(cliente.getId_usuario());
            int idPersonaResultado = this.mi.setRegistrarActualizarPersona(datosP);
            if (idPersonaResultado != 0) {
                datosP.setId_persona(idPersonaResultado);
                datosP.setId_colegio(Integer.parseInt(idColegio));
                datosP.setId_tipo_turno(Integer.parseInt(idTipoTurno));
                datosP.setAnio_egreso(iAnioTitulacion);
                //Registrando prs_colegios
                int iResultadoCole = this.mi.setRegistrarPrsColegio(datosP);
                if (iResultadoCole == 0) {
                    return new ModelAndView(viewError, modelName, "Los datos de colegios no se registraron");
                }

            } else {
                return new ModelAndView(viewError, modelName, "Ocurrio un error. Los datos no se registraron");
            }

            //Sacando la fecha actual
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Date dFecInscripcion = df.parse(sFecInscripcion);

            Estudiantes datosEst = new Estudiantes();
            datosEst.setId_persona(idPersonaResultado);
            datosEst.setId_programa(Integer.parseInt(idPrograma));
            datosEst.setId_plan(idPlan);
            datosEst.setId_tipo_admision(Integer.parseInt(idTipoAdmision));
            datosEst.setId_tipo_estudiante(Integer.parseInt(idTipoEstudiante));
            datosEst.setId_tipo_grado(Integer.parseInt(idTipoGrado));
            datosEst.setId_tipo_graduacion(idTipoGraduacion);
            datosEst.setFec_inscripcion(dFecInscripcion);
            datosEst.setId_desconcentrado(idDesconcentrado);
            datosEst.setUlt_usuario(cliente.getId_usuario());
            int idEstudianteResultado = this.mi.setRegistrarEstudiante(datosEst);

            if (idEstudianteResultado > 0) {
                //Cambia el estado de postulante
                Postulantes datoPst = new Postulantes();
                datoPst.setId_postulante(idPostulante);
                datoPst.setId_estado("E"); //Regis
                datoPst.setUlt_usuario(cliente.getId_usuario());
                this.mi.setPstModificarEstadoPostulante(datoPst);
                //Crear un tramite
                Tramites tramite = new Tramites();
                tramite.setId_proceso(Integer.parseInt(idProceso));
                tramite.setPara(cliente.getId_usuario());
                int sidTramite = this.mi.setInsertarTramiteLimbo(tramite); //CREA UN TRAMITE
                if (sidTramite == 0) {
                    return new ModelAndView("Error", "mensaje", "El tramite no se creo");
                }

                //Registramos los valores en wayka
                //Datos del Nombre
                Tramites datosTramite = new Tramites();
                datosTramite.setId_tramite(sidTramite);
                datosTramite.setEtiqueta("prs_nombres");
                datosTramite.setValor(sNombres);
                datosTramite.setUlt_usuario(cliente.getId_usuario());
                this.mi.setRegistrarValorLimbo2(datosTramite);

                //Datos del Paterno
                datosTramite = new Tramites();
                datosTramite.setId_tramite(sidTramite);
                datosTramite.setEtiqueta("prs_paterno");
                datosTramite.setValor(sPaterno);
                datosTramite.setUlt_usuario(cliente.getId_usuario());
                this.mi.setRegistrarValorLimbo2(datosTramite);

                //Datos del Materno
                datosTramite = new Tramites();
                datosTramite.setId_tramite(sidTramite);
                datosTramite.setEtiqueta("prs_materno");
                datosTramite.setValor(sMaterno);
                datosTramite.setUlt_usuario(cliente.getId_usuario());
                this.mi.setRegistrarValorLimbo2(datosTramite);

                //Datos del Materno
                datosTramite = new Tramites();
                datosTramite.setId_tramite(sidTramite);
                datosTramite.setEtiqueta("prs_dip");
                datosTramite.setValor(sDip);
                datosTramite.setUlt_usuario(cliente.getId_usuario());
                this.mi.setRegistrarValorLimbo2(datosTramite);

                //Datos del Identificador Id_persona
                datosTramite = new Tramites();
                datosTramite.setId_tramite(sidTramite);
                datosTramite.setEtiqueta("id_persona");
                datosTramite.setValor(Integer.toString(idPersonaResultado));
                datosTramite.setUlt_usuario(cliente.getId_usuario());
                this.mi.setRegistrarValorLimbo2(datosTramite);

                //Datos del Identificador Id_etudiante
                datosTramite = new Tramites();
                datosTramite.setId_tramite(sidTramite);
                datosTramite.setEtiqueta("id_estudiante");
                datosTramite.setValor(Integer.toString(idEstudianteResultado));
                datosTramite.setUlt_usuario(cliente.getId_usuario());
                this.mi.setRegistrarValorLimbo2(datosTramite);

                //Datos del Identificador descuento
                datosTramite = new Tramites();
                datosTramite.setId_tramite(sidTramite);
                datosTramite.setEtiqueta("descuento");
                datosTramite.setValor(sDescuento);
                datosTramite.setUlt_usuario(cliente.getId_usuario());
                this.mi.setRegistrarValorLimbo2(datosTramite);

                //Datos del Identificador id_tipo_descuento
                datosTramite = new Tramites();
                datosTramite.setId_tramite(sidTramite);
                datosTramite.setEtiqueta("id_tipo_descuento");
                datosTramite.setValor(idTipoDescuento);
                datosTramite.setUlt_usuario(cliente.getId_usuario());
                this.mi.setRegistrarValorLimbo2(datosTramite);

                //Datos de la gestion
                datosTramite = new Tramites();
                datosTramite.setId_tramite(sidTramite);
                datosTramite.setEtiqueta("gestion_matricula");
                datosTramite.setValor(sGestion);
                datosTramite.setUlt_usuario(cliente.getId_usuario());
                this.mi.setRegistrarValorLimbo2(datosTramite);

                //Datos del Paterno
                datosTramite = new Tramites();
                datosTramite.setId_tramite(sidTramite);
                datosTramite.setEtiqueta("periodo_matricula");
                datosTramite.setValor(sPeriodo);
                datosTramite.setUlt_usuario(cliente.getId_usuario());
                this.mi.setRegistrarValorLimbo2(datosTramite);

                //Sacando los datos del estudiante 
                Estudiantes buscarEst = new Estudiantes();
                buscarEst.setId_estudiante(idEstudianteResultado);
                buscarEst = this.mi.getEstBuscarEstudiantePrs(buscarEst);
                modelo.put("buscarEst", buscarEst);

                //Registrando en est_clasificaciones
                Estudiantes registrarClas = new Estudiantes();
                registrarClas.setId_estudiante(idEstudianteResultado);
                registrarClas.setId_tipo_clasificacion(Integer.parseInt(idTipoClasificacion));
                registrarClas.setId_tipo_clasificacion_inicial(Integer.parseInt(idTipoClasificacion));
                registrarClas.setUlt_usuario(cliente.getId_usuario());
                this.mi.setRegistrarEstClasificacion(registrarClas);

                //Buscar Tipo clasificacion estudiante
                Estudiantes datosClas = new Estudiantes();
                datosClas.setId_estudiante(buscarEst.getId_estudiante());
                datosClas = this.mi.getBuscarTipoClasificacionEstudiante(datosClas);
                modelo.put("datosClas", datosClas);

                //Listar TiposDocumentos*tipoclasificacion
                Postulantes tiposDoc = new Postulantes();
                tiposDoc.setId_tipo_clasificacion(Integer.parseInt(idTipoClasificacion));
                List<Postulantes> lTiposDocumentosClasf = this.mi.getListarTiposDocumentosClasificacionVigente(tiposDoc);
                modelo.put("lTiposDocumentosClasf", lTiposDocumentosClasf);

                datosClas.setId_persona(buscarEst.getId_persona());
                datosClas.setId_tipo_clasificacion(Integer.parseInt(idTipoClasificacion));
                List<Personas> lPrsDocumentosTodo = this.mi.getListarPrsDocumentosPersona(datosClas);
                modelo.put("lPrsDocumentosTodo", lPrsDocumentosTodo);
                List<Personas> lPrsCompromisosTodo = this.mi.getListarPrsCompromisosPersona(datosClas);
                modelo.put("lPrsCompromisosTodo", lPrsCompromisosTodo);
                List<Personas> lPrsDocumentosClasificacion = this.mi.getListarPrsDocumentosClasificacion(datosClas);
                modelo.put("lPrsDocumentosClasificacion", lPrsDocumentosClasificacion);

                //Listando Tipos Compromisos y Documentos Presentados
                List<Personas> lTiposCompromisos = this.mi.getListarTiposCompromisos();
                modelo.put("lTiposCompromisos", lTiposCompromisos);

                //Sacando el id_perfil_prorroga de _parametros
                Abm formatoParametro = new Abm();
                formatoParametro.setCampo("id_perfil_prorroga");
                formatoParametro.setCodigo("mi");
                modelo.put("formatoPerfilProrroga", this.mi.getDibBuscarParametro(formatoParametro));
                //Sacamos el formato de la fecha
                formatoParametro.setCampo("formato_fecha");
                formatoParametro.setCodigo("dibrap");
                modelo.put("formatoFecha", this.mi.getDibBuscarParametro(formatoParametro));

                //Votamos el id_tramite
                modelo.put(parameterTramite, Integer.toString(sidTramite));

                return new ModelAndView("administrarProgramasEspecializados/matriculacionEstudiantesNuevos/ListarTiposDocumentosPersona", modelo);
            }
        } else {
            return new ModelAndView(viewError, modelName, "LLene todos los datos obligatorios");
        }

        return new ModelAndView("administrarProgramasEspecializados/matriculacionEstudiantesNuevos/EntradaBuscarPostulantes", modelo);
    }
}
