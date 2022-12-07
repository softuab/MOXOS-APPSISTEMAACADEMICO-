package org.fautapo.web.administrarProgramasEspecializados.matriculacionEstudiantesAntiguosPost;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Abm;
import org.fautapo.domain.Postulantes;
import org.fautapo.domain.Personas;
import org.fautapo.domain.Tramites;
import org.fautapo.domain.Estudiantes;
import org.fautapo.domain.Perfiles;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2008-01-07
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2008-01-07
 */
public class RegistrarModificarPersonaEstudianteEstAntPosts implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> modelo = new HashMap<>();
        String parametroGestion = "gestion_matricula";
        String parametroPeriodo = "periodo_matricula";
        String parametroError = "Error";
        String parametroEstudiante = "id_estudiante";
        String modelView = "mensaje";
        //Sacamos los datos de la session
        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
        if (cliente == null) {
            return new ModelAndView("Aviso", modelView, "Su sesion ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");
        }
        //Para wayka
        String sIdProceso = request.getParameter("id_proceso");
        String sTituloProceso = request.getParameter("titulo_proceso");
        String sGestionMatricula = cliente.getString(request, parametroGestion);
        String sPeriodoMatricula = cliente.getString(request, parametroPeriodo);
        modelo.put(parametroGestion, sGestionMatricula);
        modelo.put(parametroPeriodo, sPeriodoMatricula);
        modelo.put("gestion", sGestionMatricula);
        modelo.put("periodo", sPeriodoMatricula);

        modelo.put("titulo", sTituloProceso);
        modelo.put("id_proceso", sIdProceso);

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
        String sIdTipoEmpresaTelefonica = cliente.getString(request, "id_tipo_empresa_telefonica");
        int iAnioTitulacion = cliente.getInt(request, "anio_titulacion");
        String sTitulo = cliente.getString(request, "titulo");
        String sTipoSanguineo = cliente.getString(request, "tipo_sanguineo");
        int iNroHijos = cliente.getInt(request, "nro_hijos");
        int iNroDependientes = cliente.getInt(request, "nro_dependientes");
        String sNroSeguroMedico = cliente.getString(request, "nro_seguro_medico");
        String sCelular = cliente.getString(request, "celular");
        String sCorreo = cliente.getString(request, "correo");

        String sIdTipoEstudiante = cliente.getString(request, "id_tipo_estudiante");
        String sFecInscripcion = request.getParameter("fec_inscripcion");
        String sDescuento = request.getParameter("descuento");
        String sIdTipoDescuento = request.getParameter("id_tipo_descuento");
        int iIdPersona = cliente.getInt(request, "id_persona");
        int iIdEstudiante = cliente.getInt(request, parametroEstudiante);

        //Para wayka listar los perfiles procesos
        if (!"".equals(sIdProceso) && (sIdProceso != null)) {
            //Para Cajas 
            Perfiles datoPerfil = new Perfiles();
            datoPerfil.setId_proceso(Integer.parseInt(sIdProceso));
            List<Perfiles> lPerfilesProcesos = this.mi.getTrnMiListarPerfilesProceso(datoPerfil);
            if (lPerfilesProcesos.size() == 1) {
                int iContador = 1;
            }
            modelo.put("lPerfilesProcesos", lPerfilesProcesos);
        } else {
            return new ModelAndView(parametroError, modelView, "No existe el proceso. Verifique");
        }
        //fin

        if (iIdEstudiante > 0 && iIdPersona > 0) {
            if ((!"".equals(sIdTipoEstudiante)) && (!"".equals(sIdTipoClasificacion))
                    && (!"".equals(sIdPais)) && (!"".equals(sIdDepartamento)) && (!"".equals(sIdProvincia)) && (!"".equals(sIdLocalidad)) && (!"".equals(sIdTipoInstitucion)) && (!"".equals(sIdColegio)) && (!"".equals(sIdTipoTurno))
                    && (!"".equals(sNombres)) && (sNombres != null) && (!"".equals(sDip)) && (sDip != null) && (!"".equals(sFecNacimiento)) && (sFecNacimiento != null)
                    && (!"".equals(sDireccion)) && (!"".equals(sIdTipoEstadoCivil)) && (!"".equals(sIdTipoSexo)) && (!"".equals(sIdTipoEmpresaTelefonica)) && (!"".equals(sFecInscripcion))) {
                //Verificamos si el estudiante ya tiene matricula para la gestion y periodo
                Estudiantes datosMatricula = new Estudiantes();
                datosMatricula.setId_estudiante(iIdEstudiante);
                datosMatricula.setGestion(Integer.parseInt(sGestionMatricula));
                datosMatricula.setPeriodo(Integer.parseInt(sPeriodoMatricula));
                datosMatricula = this.mi.getMtrBuscarMatricula(datosMatricula);
                if (datosMatricula != null) {
                    return new ModelAndView(parametroError, modelView, "El estudiante con R.U. " + iIdEstudiante + " ya tiene matricula para la gestion " + sGestionMatricula + " y el periodo " + sPeriodoMatricula);
                }

                Personas datosP = new Personas();
                datosP.setId_persona(iIdPersona);
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
                        return new ModelAndView(parametroError, modelView, "Los datos de colegios no se registraron");
                    }
                    //Registrando en est_clasificaciones
                    Estudiantes registrarClas = new Estudiantes();
                    registrarClas.setId_estudiante(iIdEstudiante);
                    registrarClas.setId_tipo_clasificacion(Integer.parseInt(sIdTipoClasificacion));
                    registrarClas.setUlt_usuario(cliente.getId_usuario());
                    this.mi.setRegistrarEstClasificacion(registrarClas);
                } else {
                    return new ModelAndView(parametroError, modelView, "Ocurrio un error. Los datos no se registraron");
                }

                //Sacando la fecha actual 
                Estudiantes datosEst = new Estudiantes();
                datosEst.setId_estudiante(iIdEstudiante);
                datosEst.setId_tipo_estudiante(Integer.parseInt(sIdTipoEstudiante));
                datosEst.setUlt_usuario(cliente.getId_usuario());
                int iResultadoTipoEst = this.mi.setModificarTipoEstudiante(datosEst);

                //Si registro el tipo_estudiante => vemos sus documentos
                if (iResultadoTipoEst > 0) {
                    //Crear un tramite
                    Tramites tramite = new Tramites();
                    tramite.setId_proceso(Integer.parseInt(sIdProceso));
                    tramite.setPara(cliente.getId_usuario());
                    int iIdTramite = this.mi.setInsertarTramiteLimbo(tramite); //CREA UN TRAMITE
                    if (iIdTramite == 0) {
                        return new ModelAndView(parametroError, modelView, "El tramite no se creo");
                    }
                    //Datos de nombres
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
                    //Datos del Dip
                    datosTramite = new Tramites();
                    datosTramite.setId_tramite(iIdTramite);
                    datosTramite.setEtiqueta("prs_dip");
                    datosTramite.setValor(sDip);
                    datosTramite.setUlt_usuario(cliente.getId_usuario());
                    this.mi.setRegistrarValorLimbo2(datosTramite);

                    //Datos del id_estudiante
                    datosTramite = new Tramites();
                    datosTramite.setId_tramite(iIdTramite);
                    datosTramite.setEtiqueta(parametroEstudiante);
                    datosTramite.setValor(Integer.toString(iIdEstudiante));
                    datosTramite.setUlt_usuario(cliente.getId_usuario());
                    this.mi.setRegistrarValorLimbo2(datosTramite);

                    //Datos el descuento
                    datosTramite = new Tramites();
                    datosTramite.setId_tramite(iIdTramite);
                    datosTramite.setEtiqueta("descuento");
                    datosTramite.setValor(sDescuento);
                    datosTramite.setUlt_usuario(cliente.getId_usuario());
                    this.mi.setRegistrarValorLimbo2(datosTramite);

                    //Datos del id_tipo_descuento
                    datosTramite = new Tramites();
                    datosTramite.setId_tramite(iIdTramite);
                    datosTramite.setEtiqueta("id_tipo_descuento");
                    datosTramite.setValor(sIdTipoDescuento);
                    datosTramite.setUlt_usuario(cliente.getId_usuario());
                    this.mi.setRegistrarValorLimbo2(datosTramite);
                    //Datos de gestion matriculacion
                    datosTramite = new Tramites();
                    datosTramite.setId_tramite(iIdTramite);
                    datosTramite.setEtiqueta(parametroGestion);
                    datosTramite.setValor(sGestionMatricula);
                    datosTramite.setUlt_usuario(cliente.getId_usuario());
                    this.mi.setRegistrarValorLimbo2(datosTramite);
                    //Datos del periodo de matriculacion
                    datosTramite = new Tramites();
                    datosTramite.setId_tramite(iIdTramite);
                    datosTramite.setEtiqueta(parametroPeriodo);
                    datosTramite.setValor(sPeriodoMatricula);
                    datosTramite.setUlt_usuario(cliente.getId_usuario());
                    this.mi.setRegistrarValorLimbo2(datosTramite);
                    modelo.put(parametroGestion, sGestionMatricula);
                    modelo.put(parametroPeriodo, sPeriodoMatricula);
                    //Listados para mostrar en la siguiente pantalla	
                    //Sacando los datos del estudiante 
                    Estudiantes buscarEst = new Estudiantes();
                    buscarEst.setId_estudiante(iIdEstudiante);
                    buscarEst = this.mi.getEstBuscarEstudiantePrs(buscarEst);
                    modelo.put("buscarEst", buscarEst);
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
                    modelo.put("id_tramite", Integer.toString(iIdTramite));
                    modelo.put(parametroEstudiante, Integer.toString(iIdEstudiante));

                    return new ModelAndView("administrarProgramasEspecializados/matriculacionEstudiantesAntiguosPost/ListarTiposDocumentosPersona", modelo);
                }

            } else {
                return new ModelAndView(parametroError, modelView, "LLene todos los datos obligatorios");
            }
        } else {
            return new ModelAndView(parametroError, modelView, "No existe el estudiante");
        }

        return new ModelAndView("administrarProgramasEspecializados/matriculacionEstudiantesAntiguosPost/EntradaBuscarEstudiantes", modelo);
    }
}
