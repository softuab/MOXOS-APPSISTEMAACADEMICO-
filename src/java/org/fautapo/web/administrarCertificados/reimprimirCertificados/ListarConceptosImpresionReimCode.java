package org.fautapo.web.administrarCertificados.reimprimirCertificados;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Literales;
import org.fautapo.domain.Abm;
import org.fautapo.domain.Instituciones;
import org.fautapo.domain.Perfiles;
import org.fautapo.domain.Estudiantes;
import org.fautapo.domain.Personas;
import org.fautapo.domain.Usuarios;
import org.fautapo.domain.Planes;

import org.fautapo.domain.Facultades;
import org.fautapo.domain.Programas;
import org.fautapo.domain.Libretas;

import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-03-30
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-03-30
*/

public class ListarConceptosImpresionReimCode implements Controller {

  private MiFacade mi;
  public void setMi(MiFacade mi) { this.mi = mi; }

  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
     
	
	Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
    if (cliente == null) { return new ModelAndView("Error", "mensaje", "Tu sesi?n termin?. Por favor, ingresa nuevamente."); }
    Map modelo = new HashMap();

    // Comprobamos si es quien debe ingresar al modulo, de acuerdo a su clave
    Usuarios usuario = new Usuarios();
    usuario.setId_usuario(cliente.getId_usuario());
    usuario.setClave(request.getParameter("clave" + request.getParameter("hora")));
    if (null == this.mi.getComprobarUsuario(usuario)) {
      return new ModelAndView("administrarCertificados/reimprimirCertificados/Aviso", "mensaje", "Clave incorrecta, por favor, vuelva a intentarlo");
    }
    
    String sNro_certificado = cliente.getString(request, "nro_certificado");
	String sSedes = cliente.getString(request, "sede");
	String sTipo_cert = cliente.getString(request, "tipo_cert");
	
	
	modelo.put("sNro_certificado", sNro_certificado);
	
	//CONTROL DE NRO TRANSACCION
	int control_nro;
	String estado="A";
	Estudiantes nro = new Estudiantes();
    nro.setNro_certificado2(sNro_certificado);
	nro.setId_estado(estado);
	nro.setid_concepto(Integer.parseInt(sTipo_cert));
	nro.setid_sede(Integer.parseInt(sSedes));
	control_nro = this.mi.getbuscarnrocertificado(nro);
	if (control_nro == 0) {
		int control_nro2;
		String estado2="B";
		Estudiantes nro2 = new Estudiantes();
		nro2.setNro_certificado2(sNro_certificado);
		nro2.setId_estado(estado2);
		nro2.setid_concepto(Integer.parseInt(sTipo_cert));
		nro2.setid_sede(Integer.parseInt(sSedes));
		control_nro2 = this.mi.getbuscarnrocertificado(nro2);
		if (control_nro2 == 0) {
            return new ModelAndView("administrarCertificados/reimprimirCertificados/Aviso","mensaje","El numero de Certificado  "+ sNro_certificado + " no es valido. Verifique el dato.");
      }
	}

    Estudiantes estnuevo = new Estudiantes();
 
	estnuevo.setNrocertificado_gestion(sNro_certificado);
	estnuevo.setid_sede(Integer.parseInt(sSedes));
	estnuevo.setid_concepto(Integer.parseInt(sTipo_cert));
	
	List estcert = this.mi.getListarCertGen(estnuevo);
	
	Estudiantes datosIdcertificados = new Estudiantes();
	    for (int i=0; i<estcert.size();i++) {
			datosIdcertificados = (Estudiantes) estcert.get(i);
        }
		
	Estudiantes estnuevo1 = new Estudiantes();

	List estcert1 = this.mi.getListarNotasCertificados(datosIdcertificados);
	
	modelo.put("estcert", estcert);
    modelo.put("estcert1", estcert1);

    String sNro_recibo = cliente.getString(request, "nro_recibo");
	
    //Sacamos los datos para la impresion del RECIBO
    Perfiles datosTransaccion = new Perfiles();

    datosTransaccion.setNro_recibo(sNro_recibo);
	datosTransaccion.setIns_sede(cliente.getId_almacen());
 
    //Sacamos los datos de la transaccion
    if (datosTransaccion==null) {
      return new ModelAndView("administrarCertificados/reimprimirCertificados/Aviso", "mensaje", "No existe una transaccion con Nro. de Certificado en esta sede"+sNro_recibo);
    }
    
    Literales literal = new Literales();
    modelo.put("literal", literal.convert(datosTransaccion.getPagado()));
    datosTransaccion.setIns_sede(cliente.getId_almacen());
    //Sacamos el listado de trn_detalles
    List lDetalles = this.mi.getTrnListarTransaccionesReciboSede(datosTransaccion);
    
	modelo.put("lDetalles", lDetalles);
	
    //Sacamos los datos del perfil
    Perfiles datosPerfil = new Perfiles();
    datosPerfil.setId_perfil(datosTransaccion.getId_perfil());
    datosPerfil = this.mi.getPrfBuscarPerfil(datosPerfil);
    modelo.put("datosPerfil", datosPerfil);

    //Sacamos el formato de la fecha
    Abm formatoFecha = new Abm();
    formatoFecha.setCampo("formato_fecha");
    formatoFecha.setCodigo("dibrap");
    modelo.put("formatoFecha", this.mi.getDibBuscarParametro(formatoFecha));

    //Sacamos el formato de la hora
    formatoFecha.setCampo("formato_hora");
    formatoFecha.setCodigo("dibrap");
    modelo.put("formatoHora", this.mi.getDibBuscarParametro(formatoFecha));

    //Sacamos los datos de la institucion
    Instituciones datosInstitucion = new Instituciones();
    datosInstitucion.setId_institucion(1); //--------------------------ESTATICO
    datosInstitucion = this.mi.getBuscarInstitucion(datosInstitucion);
    modelo.put("datosInstitucion", datosInstitucion);
    modelo.put("datosTransaccion", datosTransaccion); 
    Instituciones datosInstitucionSede = new Instituciones();
    datosInstitucionSede.setId_institucion(cliente.getId_almacen()); //--------------------------ESTATICO
    datosInstitucionSede = this.mi.getBuscarInstitucionSede(datosInstitucionSede);
	
    if (datosInstitucionSede !=null) {
      modelo.put("datosInstitucionsede", datosInstitucionSede);
    } 
	
	//List estcert3 = new ArrayList();
	if("42".equals(sTipo_cert)){
    int iId_programa = cliente.getInt(request, "id_programa");
    int iId_mencion = cliente.getInt(request, "id_mencion");
    int iId_estudiante = cliente.getInt(request, "id_estudiante");
	
	System.out.println("programaRE%%2 --> "+iId_programa);
	System.out.println("mensionRE%%2 --> "+iId_mencion);
	System.out.println("estudianteRE%%2 --> "+iId_estudiante); 
	
    //Sacamos los datos del Programa
    Programas datosPrograma = new Programas();
    datosPrograma.setId_programa(iId_programa);
    datosPrograma = this.mi.getPrgBuscarPrograma(datosPrograma);
    modelo.put("datosPrograma", datosPrograma);

    //Sacando los datos del estudiante    
    Estudiantes datosEstudiante = new Estudiantes();
    datosEstudiante.setId_estudiante(iId_estudiante);
    datosEstudiante.setId_programa(iId_programa);
    datosEstudiante = this.mi.getEstBuscarEstudiantePrograma(datosEstudiante);
    modelo.put("datosEstudiante", datosEstudiante);

    //Sacando los datos personales del Estudiante encontrado
    Personas datosPersona = new Personas();
    datosPersona.setId_persona(datosEstudiante.getId_persona());
    datosPersona = this.mi.getPrsBuscarPersona(datosPersona);
    modelo.put("datosPersona", datosPersona);

    //Sacamos los datos de la Facultad
    Facultades datosFacultad = new Facultades();
    datosFacultad.setId_facultad(datosPrograma.getId_facultad());
    datosFacultad = this.mi.getFclBuscarFacultad(datosFacultad);
    modelo.put("datosFacultad", datosFacultad);

    //Buscamos el grado_academico por programa e id_plan
    Libretas datosGrados = new Libretas();
    datosGrados.setId_programa(datosEstudiante.getId_programa());
    datosGrados.setId_plan(datosEstudiante.getId_plan());
    datosGrados = this.mi.getBuscarGradoAcademicoPrograma(datosGrados);
    modelo.put("datosGrados", datosGrados);

    //Sacamos el listado de las materias del plan nuevo
    Planes datosPlan = new Planes();
    datosPlan.setId_programa(datosEstudiante.getId_programa());
    datosPlan.setId_plan(datosEstudiante.getId_plan());
    datosPlan.setId_tipo_grado(datosEstudiante.getId_tipo_grado());
    datosPlan.setId_mencion(iId_mencion);
    List lPlanDeEstudios = this.mi.getListarMateriasPlanMencion(datosPlan);
    modelo.put("lPlanDeEstudios", lPlanDeEstudios);

		return new ModelAndView("administrarCertificados/reimprimirCertificados/ReimprimirPlandeEstudios", modelo);
      } 
	if("31".equals(sTipo_cert)){
		return new ModelAndView("administrarCertificados/reimprimirCertificados/ReimprimirHistorialAcademico", modelo);
	}
		return new ModelAndView("administrarCertificados/reimprimirCertificados/ReimprimirCertificadoNotas", modelo);
	}
}