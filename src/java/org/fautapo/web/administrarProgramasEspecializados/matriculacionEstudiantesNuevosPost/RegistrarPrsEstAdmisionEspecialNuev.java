package org.fautapo.web.administrarProgramasEspecializados.matriculacionEstudiantesNuevosPost;

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
import org.fautapo.domain.Abm;
import org.fautapo.domain.Planes;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2008-03-05
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2008-03-05
 */
public class RegistrarPrsEstAdmisionEspecialNuev implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> modelo = new HashMap<>();
        String viewError = "Error";
        String modelName = "mensaje";
        String parameterTramite = "id_tramite";

        //Sacamos los datos de la session
        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
        if (cliente == null) {
            return new ModelAndView("Aviso", modelName, "Su sesion ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");
        }

        //Para wayka
        String sIdProceso = request.getParameter("id_proceso");
        String sIdTramite = request.getParameter(parameterTramite);
        String sTituloProceso = request.getParameter("titulo_proceso");
        modelo.put("titulo", sTituloProceso);
        modelo.put("id_proceso", sIdProceso);
        modelo.put(parameterTramite, sIdTramite);

        String sDescuento = request.getParameter("descuento");
        String sIdTipoDescuento = Integer.toString(cliente.getInt(request, "id_tipo_descuento"));
        //Recuperando variables de entrada
        String sIdPersona = request.getParameter("id_persona");
        if ("".equals(sIdPersona) || (sIdPersona == null)) {
            return new ModelAndView(viewError, modelName, "No ingreso el dato persona");
        }
        String sPaterno = (request.getParameter("paterno")).trim();
        String sMaterno = (request.getParameter("materno")).trim();
        String sNombres = (request.getParameter("nombres")).trim();
        String sFecNacimiento = request.getParameter("fec_nacimiento");
        String sDireccion = (request.getParameter("direccion")).trim();
        String sTelefono = (request.getParameter("telefono")).trim();

        String sDip = (request.getParameter("dip")).trim();
        String sIdTipoSexo = cliente.getString(request, "id_tipo_sexo");
        String sIdTipoEstadoCivil = cliente.getString(request, "id_tipo_estado_civil");
        String sIdPais = cliente.getString(request, "id_pais_n");
        String sIdDepartamento = cliente.getString(request, "id_departamento_n");
        String sIdProvincia = cliente.getString(request, "id_provincia_n");
        String sIdLocalidad = cliente.getString(request, "id_localidad_n");
        String sIdTipoInstitucion = cliente.getString(request, "id_tipo_institucion");
        String sIdColegio = cliente.getString(request, "id_colegio");
        String sIdTipoTurno = cliente.getString(request, "id_tipo_turno");
        String sIdTipoClasificacion = cliente.getString(request, "id_tipo_clasificacion");
        int iIdTipoGraduacion = cliente.getInt(request, "id_tipo_graduacion");
        int iIdDesconcentrado = cliente.getInt(request, "id_desconcentrado");
        String sIdTipoEmpresaTelefonica = cliente.getString(request, "id_tipo_empresa_telefonica");
        int iAnioTitulacion = cliente.getInt(request, "anio_titulacion");
        String sTitulo = cliente.getString(request, "titulo");
        String sTipoSanguineo = cliente.getString(request, "tipo_sanguineo");
        int iNroHijos = cliente.getInt(request, "nro_hijos");
        int iNroDependientes = cliente.getInt(request, "nro_dependientes");
        String sNroSeguroMedico = cliente.getString(request, "nro_seguro_medico");
        String sCelular = cliente.getString(request, "celular");
        String sCorreo = cliente.getString(request, "correo");
        String sIdPrograma = request.getParameter("id_programa");
        String sIdTipoAdmision = cliente.getString(request, "id_tipo_admision");
        String sIdTipoGrado = cliente.getString(request, "id_tipo_grado");
        String sIdTipoEstudiante = cliente.getString(request, "id_tipo_estudiante");
        String sFecInscripcion = request.getParameter("fec_inscripcion");
        String sGestion = request.getParameter("gestion");
        String sPeriodo = request.getParameter("periodo");
        modelo.put("gestion", sGestion);
        modelo.put("periodo", sPeriodo);
        int iIdPrgPlan = cliente.getInt(request, "id_prg_plan");

        //Buscamos el plan de prg_planes
        Planes datosPlan = new Planes();
        datosPlan.setId_prg_plan(iIdPrgPlan);
        datosPlan = this.mi.getBuscarPrgPlan2(datosPlan);
        if (datosPlan == null) {
            return new ModelAndView(viewError, modelName, "No se puede encontrar el plan en Prg Planes");
        }
        String sId_plan = datosPlan.getId_plan();
        //Listar Perfiles Procesos
        if (!"".equals(sIdProceso) && (sIdProceso != null)) {
            //Para Cajas 
            Perfiles datoPerfil = new Perfiles();
            datoPerfil.setId_proceso(Integer.parseInt(sIdProceso));
            List<Perfiles> lPerfilesProcesos = this.mi.getTrnMiListarPerfilesProceso(datoPerfil);
            if (lPerfilesProcesos.size() == 1) {
                modelo.put("contador", "1");
            }
            modelo.put("lPerfilesProcesos", lPerfilesProcesos);
        } else {
            return new ModelAndView(viewError, modelName, "No existe el proceso. Verifique");
        }
        //Fin Listar Perfiles Procesos
        //Verificacamos si es ya es un estudiante => existe persona
        if ((!"".equals(sId_plan)) && (sId_plan != null) && (!"".equals(sIdPrograma)) && (sIdPrograma != null) && (!"".equals(sIdTipoAdmision)) && (!"".equals(sIdTipoGrado))
                && (!"".equals(sIdTipoEstudiante)) && (!"".equals(sIdTipoClasificacion))
                && (!"".equals(sIdPais)) && (!"".equals(sIdDepartamento)) && (!"".equals(sIdProvincia)) && (!"".equals(sIdLocalidad)) && (!"".equals(sIdTipoInstitucion)) && (!"".equals(sIdColegio)) && (!"".equals(sIdTipoTurno))
                && (!"".equals(sNombres)) && (sNombres != null) && (!"".equals(sDip)) && (sDip != null) && (!"".equals(sFecNacimiento)) && (sFecNacimiento != null)
                && (!"".equals(sDireccion)) && (!"".equals(sIdTipoEstadoCivil)) && (!"".equals(sIdTipoSexo)) && (!"".equals(sIdTipoEmpresaTelefonica)) && (!"".equals(sFecInscripcion))) {
            Personas datosP = new Personas();
            datosP.setId_persona(Integer.parseInt(sIdPersona));
            datosP.setId_pais(Integer.parseInt(sIdPais));
            datosP.setId_departamento(Integer.parseInt(sIdDepartamento));
            datosP.setId_provincia(Integer.parseInt(sIdProvincia));
            datosP.setId_localidad(Integer.parseInt(sIdLocalidad));
            datosP.setId_tipo_estado_civil(Integer.parseInt(sIdTipoEstadoCivil));
            datosP.setId_tipo_sexo(Integer.parseInt(sIdTipoSexo));
            datosP.setId_tipo_empresa_telefonica(Integer.parseInt(sIdTipoEmpresaTelefonica));
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
            int iIdPersonaResultado = this.mi.setRegistrarPersona(datosP);
            if (iIdPersonaResultado != 0) {
                datosP.setId_colegio(Integer.parseInt(sIdColegio));
                datosP.setId_tipo_turno(Integer.parseInt(sIdTipoTurno));
                datosP.setAnio_egreso(iAnioTitulacion);
                //Registrando prs_colegios
                int iResultadoCole = this.mi.setRegistrarPrsColegio(datosP);
                if (iResultadoCole == 0) {
                    return new ModelAndView(viewError, "mesnaje", "Los datos de colegios no se registraron");
                }

            } else {
                return new ModelAndView(viewError, modelName, "Ocurrio un error. Los datos no se registraron");
            }

            //Sacando la fecha actual
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Date dFecInscripcion = df.parse(sFecInscripcion);

            Estudiantes datosEst = new Estudiantes();
            datosEst.setId_persona(Integer.parseInt(sIdPersona));
            datosEst.setId_programa(Integer.parseInt(sIdPrograma));
            datosEst.setId_plan(sId_plan);
            datosEst.setId_tipo_admision(Integer.parseInt(sIdTipoAdmision));
            datosEst.setId_tipo_estudiante(Integer.parseInt(sIdTipoEstudiante));
            datosEst.setId_tipo_grado(Integer.parseInt(sIdTipoGrado));
            datosEst.setId_tipo_graduacion(iIdTipoGraduacion);
            datosEst.setFec_inscripcion(dFecInscripcion);
            datosEst.setUlt_usuario(cliente.getId_usuario());
            datosEst.setId_desconcentrado(iIdDesconcentrado);
            int iIdEstudianteResultado = this.mi.setRegistrarEstudiante(datosEst);
            if (iIdEstudianteResultado > 0) {
                //Crear un tramite
                Tramites tramite = new Tramites();
                tramite.setId_proceso(Integer.parseInt(sIdProceso));
                tramite.setPara(cliente.getId_usuario());
                int iIdTramite = this.mi.setInsertarTramiteLimbo(tramite); //CREA UN TRAMITE
                if (iIdTramite == 0) {
                    return new ModelAndView(viewError, modelName, "El tramite no se creo");
                }
                //Registramos los valores en wayka
                //Datos del Nombre
                Tramites datosTramite = new Tramites();
                datosTramite.setId_tramite(iIdTramite);
                datosTramite.setEtiqueta("prs_nombres");
                datosTramite.setValor(sNombres);
                datosTramite.setUlt_usuario(cliente.getId_usuario());
                this.mi.setRegistrarValorLimbo2(datosTramite);

                //Datos del Paterno
                datosTramite = new Tramites();
                datosTramite.setId_tramite(iIdTramite);
                datosTramite.setEtiqueta("prs_paterno");
                datosTramite.setValor(sPaterno);
                datosTramite.setUlt_usuario(cliente.getId_usuario());
                this.mi.setRegistrarValorLimbo2(datosTramite);

                //Datos del Materno
                datosTramite = new Tramites();
                datosTramite.setId_tramite(iIdTramite);
                datosTramite.setEtiqueta("prs_materno");
                datosTramite.setValor(sMaterno);
                datosTramite.setUlt_usuario(cliente.getId_usuario());
                this.mi.setRegistrarValorLimbo2(datosTramite);

                //Datos del Materno
                datosTramite = new Tramites();
                datosTramite.setId_tramite(iIdTramite);
                datosTramite.setEtiqueta("prs_dip");
                datosTramite.setValor(sDip);
                datosTramite.setUlt_usuario(cliente.getId_usuario());
                this.mi.setRegistrarValorLimbo2(datosTramite);

                //Datos del Identificador Id_persona
                datosTramite = new Tramites();
                datosTramite.setId_tramite(iIdTramite);
                datosTramite.setEtiqueta("id_persona");
                datosTramite.setValor(Integer.toString(iIdPersonaResultado));
                datosTramite.setUlt_usuario(cliente.getId_usuario());
                this.mi.setRegistrarValorLimbo2(datosTramite);

                //Datos del Identificador Id_etudiante
                datosTramite = new Tramites();
                datosTramite.setId_tramite(iIdTramite);
                datosTramite.setEtiqueta("id_estudiante");
                datosTramite.setValor(Integer.toString(iIdEstudianteResultado));
                datosTramite.setUlt_usuario(cliente.getId_usuario());
                this.mi.setRegistrarValorLimbo2(datosTramite);

                //Datos del Identificador descuento
                datosTramite = new Tramites();
                datosTramite.setId_tramite(iIdTramite);
                datosTramite.setEtiqueta("descuento");
                datosTramite.setValor(sDescuento);
                datosTramite.setUlt_usuario(cliente.getId_usuario());
                this.mi.setRegistrarValorLimbo2(datosTramite);

                //Datos del Identificador id_tipo_descuento
                datosTramite = new Tramites();
                datosTramite.setId_tramite(iIdTramite);
                datosTramite.setEtiqueta("id_tipo_descuento");
                datosTramite.setValor(sIdTipoDescuento);
                datosTramite.setUlt_usuario(cliente.getId_usuario());
                this.mi.setRegistrarValorLimbo2(datosTramite);

                //Datos de la gestion
                datosTramite = new Tramites();
                datosTramite.setId_tramite(iIdTramite);
                datosTramite.setEtiqueta("gestion_matricula");
                datosTramite.setValor(sGestion);
                datosTramite.setUlt_usuario(cliente.getId_usuario());
                this.mi.setRegistrarValorLimbo2(datosTramite);

                //Datos del Paterno
                datosTramite = new Tramites();
                datosTramite.setId_tramite(iIdTramite);
                datosTramite.setEtiqueta("periodo_matricula");
                datosTramite.setValor(sPeriodo);
                datosTramite.setUlt_usuario(cliente.getId_usuario());
                this.mi.setRegistrarValorLimbo2(datosTramite);

                //Sacando los datos del estudiante 
                Estudiantes buscarEst = new Estudiantes();
                buscarEst.setId_estudiante(iIdEstudianteResultado);
                buscarEst = this.mi.getEstBuscarEstudiantePrs(buscarEst);
                modelo.put("buscarEst", buscarEst);

                //Registrando en est_clasificaciones
                Estudiantes registrarClas = new Estudiantes();
                registrarClas.setId_estudiante(iIdEstudianteResultado);
                registrarClas.setId_tipo_clasificacion(Integer.parseInt(sIdTipoClasificacion));
                registrarClas.setId_tipo_clasificacion_inicial(Integer.parseInt(sIdTipoClasificacion));
                registrarClas.setUlt_usuario(cliente.getId_usuario());
                this.mi.setRegistrarEstClasificacion(registrarClas);

                //Buscar Tipo clasificacion estudiante
                Estudiantes datosClas = new Estudiantes();
                datosClas.setId_estudiante(buscarEst.getId_estudiante());
                datosClas = this.mi.getBuscarTipoClasificacionEstudiante(datosClas);
                modelo.put("datosClas", datosClas);

                //Listar TiposDocumentos*tipoclasificacion
                Postulantes tiposDoc = new Postulantes();
                tiposDoc.setId_tipo_clasificacion(Integer.parseInt(sIdTipoClasificacion));
                List<Postulantes> lTiposDocumentosClasf = this.mi.getListarTiposDocumentosClasificacionVigente(tiposDoc);
                modelo.put("lTiposDocumentosClasf", lTiposDocumentosClasf);

                datosClas.setId_persona(buscarEst.getId_persona());
                datosClas.setId_tipo_clasificacion(Integer.parseInt(sIdTipoClasificacion));
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
                modelo.put(parameterTramite, Integer.toString(iIdTramite));
                modelo.put("id_estudiante", Integer.toString(iIdEstudianteResultado));

                return new ModelAndView("administrarProgramasEspecializados/matriculacionEstudiantesNuevosPost/ListarTiposDocumentosPersona", modelo);

            } else {
                return new ModelAndView(viewError, modelName, "No se registro el Estudiante. Por que ya esta existe registrado en el mismo programa");
            }
        } else {
            return new ModelAndView(viewError, modelName, "LLene todos los datos obligatorios");
        }

    }
}
