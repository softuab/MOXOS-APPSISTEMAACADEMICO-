package org.fautapo.web.administrarProgramasEspecializadosLiberacion.administrarPostulantesLib;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Postulantes;
import org.fautapo.domain.Planes;
import org.fautapo.domain.Tramites;
import org.fautapo.domain.Perfiles;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-04-05
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-04-05
 */
public class RegistrarPostulantePost implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> modelo = new HashMap<>();

        //Sacamos los datos de la session
        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
        if (cliente == null) {
            return new ModelAndView("Aviso", "mensaje", "Su sesion ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");
        }

        //Para wayka
        String sIdProceso = request.getParameter("id_proceso");
        String sIdTramite = request.getParameter("id_tramite");
        String sTitulo = request.getParameter("titulo");
        modelo.put("titulo", sTitulo);
        modelo.put("id_proceso", sIdProceso);
        modelo.put("id_tramite", sIdTramite);

        int iIdPersona = 0;
        String sPaterno = (request.getParameter("paterno")).trim();
        String sMaterno = (request.getParameter("materno")).trim();
        String sNombres = (request.getParameter("nombres")).trim();
        String sFecNacimiento = request.getParameter("fec_nacimiento");
        String sDireccion = (request.getParameter("direccion")).trim();
        String sTelefono = (request.getParameter("telefono")).trim();
        String sDip = (request.getParameter("dip")).trim();
        String sIdPrograma = request.getParameter("id_programa");
        String sIdTipoAdmision = request.getParameter("id_tipo_admision");
        String sGestion = request.getParameter("gestion");
        String sPeriodo = request.getParameter("periodo");
        String sIdTipoDocumentoP[] = request.getParameterValues("id_tipo_documento_p");
        String sDescuento = request.getParameter("descuento");
        String sIdTipoDescuento = request.getParameter("id_tipo_descuento");
        String sBandera;
        //Nuevo request
        String sIdTipoSexo = cliente.getString(request, "id_tipo_sexo");
        String sIdTipoEstadoCivil = cliente.getString(request, "id_tipo_estado_civil");
        String sIdPais = cliente.getString(request, "id_pais_n");
        String sIdDepartamento = cliente.getString(request, "id_departamento_n");
        String sIdProvincia = cliente.getString(request, "id_provincia_n");
        String sIdLocalidad = cliente.getString(request, "id_localidad_n");
        String sIdColegio = cliente.getString(request, "id_colegio");
        String sIdTipoTurno = cliente.getString(request, "id_tipo_turno");
        String sIdTipoEmpresaTelefonica = cliente.getString(request, "id_tipo_empresa_telefonica");
        String sAnioEgreso = cliente.getString(request, "anio_egreso");
        String sCelular = cliente.getString(request, "celular");
        String sCorreo = cliente.getString(request, "correo");

        //Fin Nuevo
        //Primero comprobamos si entro  el proceso
        if (!"".equals(sIdProceso) && (sIdProceso != null)) {
            //Para Cajas 
            Perfiles datoPerfil = new Perfiles();
            datoPerfil.setId_proceso(Integer.parseInt(sIdProceso));
            List<Perfiles> lPerfilesProcesos = this.mi.getTrnMiListarPerfilesProceso(datoPerfil);
            modelo.put("lPerfilesProcesos", lPerfilesProcesos);
        } else {
            return new ModelAndView("Error", "mensaje", "No existe el proceso. Verifique");
        }

        //Buscamos en prg_planes
        Planes buscarPlan = new Planes();
        buscarPlan.setId_programa(Integer.parseInt(sIdPrograma));
        buscarPlan.setId_tipo_grado(2); //Vestibular
        Planes buscarPrgPlan = this.mi.getBuscarMaxPrgPlanActual(buscarPlan);
        if (buscarPrgPlan.getPlan() == null) {
            return new ModelAndView("Error", "mensaje", "No existe planificacion para vestibulares del programa seleccionado");
        }

        //Registramos a Pst Personas
        Postulantes datosP = new Postulantes();
        datosP.setId_plan(buscarPrgPlan.getPlan());  //Plan sacado de prg_planes
        datosP.setId_programa(Integer.parseInt(sIdPrograma));
        datosP.setId_tipo_admision(Integer.parseInt(sIdTipoAdmision));
        //datosP.setId_tipo_admision(3); //Vestibular Pre-Universitario
        datosP.setId_tipo_grado(2);  // Vestibular
        datosP.setNombres(sNombres);
        datosP.setPaterno(sPaterno);
        datosP.setMaterno(sMaterno);
        datosP.setDip(sDip);
        datosP.setDireccion(sDireccion);
        datosP.setTelefono(sTelefono);
        datosP.setCorreo(sCorreo);
        datosP.setCelular(sCelular);
        datosP.setFec_nacimiento(sFecNacimiento);
        datosP.setGestion(Integer.parseInt(sGestion));
        datosP.setPeriodo(Integer.parseInt(sPeriodo));
        datosP.setUlt_usuario(cliente.getId_usuario());
        datosP.setId_rol(cliente.getId_rol());

        datosP.setId_pais(Integer.parseInt(sIdPais));
        datosP.setId_departamento(Integer.parseInt(sIdDepartamento));
        datosP.setId_provincia(Integer.parseInt(sIdProvincia));
        datosP.setId_localidad(Integer.parseInt(sIdLocalidad));
        datosP.setId_tipo_estado_civil(Integer.parseInt(sIdTipoEstadoCivil));
        datosP.setId_tipo_sexo(Integer.parseInt(sIdTipoSexo));
        datosP.setId_tipo_empresa_telefonica(Integer.parseInt(sIdTipoEmpresaTelefonica));

        try {
            iIdPersona = this.mi.setMiRegistrarPstPersona(datosP);
        } catch (Exception e) {
            return new ModelAndView("Error", "mensaje", " Ya existe una persona registrado con el mismo Nro. DIP");
        }

        if (iIdPersona != 0) {
            datosP.setId_persona(iIdPersona);
            datosP.setId_tipo_clasificacion(1); // Vestibular= Clasificacion=1
            //Registrando documentos
            if (sIdTipoDocumentoP != null) {
                for (int i = 0; i < sIdTipoDocumentoP.length; i++) {
                    String sId_tipo_documento = sIdTipoDocumentoP[i];
                    datosP.setId_tipo_documento(Integer.parseInt(sId_tipo_documento));
                    datosP.setNumero(request.getParameter("numero" + sId_tipo_documento));
                    datosP.setObservacion(request.getParameter("observacion" + sId_tipo_documento));
                    this.mi.setPstRegistrarDocumentos(datosP);
                }
            }
            datosP.setId_colegio(Integer.parseInt(sIdColegio));
            datosP.setId_tipo_turno(Integer.parseInt(sIdTipoTurno));
            datosP.setAnio_egreso(Integer.parseInt(sAnioEgreso));
            this.mi.setRegistrarPstPrsColegio(datosP);
        } else {
            return new ModelAndView("Error", "mensaje", "Los datos como persona no se registraron");
        }

        int iIdPostulanteResultado = this.mi.setMiRegistrarPostulanteC(datosP);
        if (iIdPostulanteResultado > 0) {
            //Crear un tramite
            Tramites tramite = new Tramites();
            tramite.setId_proceso(Integer.parseInt(sIdProceso));
            tramite.setPara(cliente.getId_usuario());
            int iIdTramite = this.mi.setInsertarTramiteLimbo(tramite); //CREA UN TRAMITE
            if (iIdTramite == 0) {
                return new ModelAndView("Error", "mensaje", "El tramite no se creo");
            }

            //Registramos los valores en wayka
            //Datos del Nombre
            Tramites datosTramite = new Tramites();
            datosTramite.setId_tramite(iIdTramite);
            datosTramite.setEtiqueta("pst_nombres");
            datosTramite.setValor(sNombres);
            datosTramite.setUlt_usuario(cliente.getId_usuario());
            this.mi.setRegistrarValorLimbo2(datosTramite);

            //Datos del Paterno
            datosTramite = new Tramites();
            datosTramite.setId_tramite(iIdTramite);
            datosTramite.setEtiqueta("pst_paterno");
            datosTramite.setValor(sPaterno);
            datosTramite.setUlt_usuario(cliente.getId_usuario());
            this.mi.setRegistrarValorLimbo2(datosTramite);

            //Datos del Materno
            datosTramite = new Tramites();
            datosTramite.setId_tramite(iIdTramite);
            datosTramite.setEtiqueta("pst_materno");
            datosTramite.setValor(sMaterno);
            datosTramite.setUlt_usuario(cliente.getId_usuario());
            this.mi.setRegistrarValorLimbo2(datosTramite);

            //Datos del dip
            datosTramite = new Tramites();
            datosTramite.setId_tramite(iIdTramite);
            datosTramite.setEtiqueta("pst_dip");
            datosTramite.setValor(sDip);
            datosTramite.setUlt_usuario(cliente.getId_usuario());
            this.mi.setRegistrarValorLimbo2(datosTramite);

            //Datos del Identificador ID_postulante
            datosTramite = new Tramites();
            datosTramite.setId_tramite(iIdTramite);
            datosTramite.setEtiqueta("id_postulante");
            datosTramite.setValor(Integer.toString(iIdPostulanteResultado));
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

            //Mandar a sacar el id_perfil del postulante.Buscar Datos del postulante
            modelo.put("id_postulante", Integer.toString(iIdPostulanteResultado));
            //Sacando los datos del postulante    
            Postulantes datosPostulante = new Postulantes();
            datosPostulante.setId_postulante(iIdPostulanteResultado);
            datosPostulante = this.mi.getPstBuscarPostulanteNombres(datosPostulante);
            modelo.put("datosPostulante", datosPostulante);

            //Votamos el id_tramite
            modelo.put("id_tramite", Integer.toString(iIdTramite));

            return new ModelAndView("administrarProgramasEspecializadosLiberacion/administrarPostulantesLib/ListarPerfilesPostulante", modelo);
        } else {
            modelo.put("mensaje", "No se pudo registrar a la persona como postulante");
            return new ModelAndView("administrarProgramasEspecializadosLiberacion/administrarPostulantesLib/SalidaPostulante", modelo);
        }

    }
}
