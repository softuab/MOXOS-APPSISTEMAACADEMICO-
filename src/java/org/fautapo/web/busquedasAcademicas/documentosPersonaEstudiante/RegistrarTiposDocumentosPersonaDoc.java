package org.fautapo.web.busquedasAcademicas.documentosPersonaEstudiante;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Personas;
import org.fautapo.domain.Estudiantes;
import org.fautapo.domain.Instituciones;
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


public class RegistrarTiposDocumentosPersonaDoc implements Controller {

  private MiFacade mi;
  public void setMi(MiFacade mi) { this.mi = mi; }

  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    Map modelo = new HashMap();
    
    //Sacamos los datos de la session
    Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
    if (cliente==null) return new ModelAndView("Aviso", "mensaje", "Su sesion ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");
    String sNombres = cliente.getNombres();
    modelo.put("usuario", sNombres);

    String sGestion = request.getParameter("gestion");
    String sPeriodo = request.getParameter("periodo");
    String sProrroga= request.getParameter("prorroga");
    String sId_persona = request.getParameter("id_persona");
    String sId_estudiante = request.getParameter("id_estudiante");
    String sId_tipo_documento_p[] = request.getParameterValues("id_tipo_documento_p");
    String sId_tipo_compromiso_p[] = request.getParameterValues("id_tipo_compromiso_p");
    int iResultadoDoc=0; int iResultadoCom=0;
    int iBand=0;
    
    if (Integer.parseInt(sId_estudiante) > 0) {
       //Busco datos del Estudiante
      Estudiantes datosEst = new Estudiantes();
      datosEst.setId_estudiante(Integer.parseInt(sId_estudiante));
      datosEst = this.mi.getEstBuscarEstudianteNombres(datosEst);
      modelo.put("datosEst",datosEst);
      
      //Buscar Tipo clasificacion estudiante
      Estudiantes datosClas = new Estudiantes();
      datosClas = this.mi.getBuscarTipoClasificacionEstudiante(datosEst);
      modelo.put("datosClas",datosClas);

      Personas datosP = new Personas();
      datosP.setId_persona(datosEst.getId_persona());
      datosP.setUlt_usuario(cliente.getId_usuario());
      datosP.setId_tipo_clasificacion(datosClas.getId_tipo_clasificacion());
      System.out.println("El datosP.setId_tipo_clasificacion -->"+ Integer.toString(datosP.getId_tipo_clasificacion()));
      //Listamos los prs_documentos clasificacion
      List lPrsDocumentosClasificacion= this.mi.getListarPrsDocumentosClasificacion(datosP);
      modelo.put("lPrsDocumentosClasificacion",lPrsDocumentosClasificacion);
      System.out.println("El tamanio de la lista -->"+ Integer.toString(lPrsDocumentosClasificacion.size()));
      
      //Registramos los tipos documentos
      if (lPrsDocumentosClasificacion.size() > 0) {
	for(int j=0; j<lPrsDocumentosClasificacion.size(); j++) {
	  iBand = 0;
          Personas documento = (Personas) lPrsDocumentosClasificacion.get(j);
	  String sId_tipo_documento_sac = Integer.toString(documento.getId_tipo_documento());
	  System.out.println(" sId_tipo_documento_sac -->"+  sId_tipo_documento_sac);
	  datosP.setId_tipo_documento(Integer.parseInt(sId_tipo_documento_sac));
	  String sPresento = request.getParameter("presento"+sId_tipo_documento_sac);
	  if ("true".equals(sPresento)) {
            datosP.setPresento(true);
          }
          else {
                datosP.setPresento(false);
          }
	  datosP.setNumero(request.getParameter("numero"+sId_tipo_documento_sac));
	  datosP.setObservacion(request.getParameter("observacion"+sId_tipo_documento_sac));
          iResultadoDoc  = this.mi.setRegistrarPrsDocumentos(datosP);
	  iBand=1;
	  //Registramos compromisos
	  String sId_tipo_compromiso_sac = request.getParameter("id_tipo_compromiso_"+sId_tipo_documento_sac);
	  if ((!"".equals(sId_tipo_compromiso_sac)) && (sId_tipo_compromiso_sac != null)) {
            datosP.setId_tipo_compromiso(Integer.parseInt(sId_tipo_compromiso_sac));
	    datosP.setGestion(cliente.getGestion());
	    datosP.setPeriodo(cliente.getPeriodo());
	    datosP.setObservacion(request.getParameter("observacionCompromiso"+sId_tipo_documento_sac));
	    datosP.setFec_vencimiento(request.getParameter("fec_vencimiento"+sId_tipo_documento_sac));
	    iResultadoCom  = this.mi.setRegistrarPrsCompromisos(datosP);
          }
	}
      }
      
      //Listar PrsDocumentos y Prs_compromisos
      Personas documento = new Personas();
      documento.setId_persona(datosEst.getId_persona());
      List lPrsCompromisosTodo= this.mi.getListarPrsCompromisosPersona(documento);
      modelo.put("lPrsCompromisosTodo",lPrsCompromisosTodo);
      List lPrsDocumentosTodo= this.mi.getListarPrsDocumentosPersona(documento);
      modelo.put("lPrsDocumentosTodo",lPrsDocumentosTodo);
      //Listar el ultimo est_regularizacion
      Estudiantes lUltimoEstRegularizacion= this.mi.getMiBuscarUltimoEstRegularizacion(datosEst);
      modelo.put("lUltimoEstRegularizacion",lUltimoEstRegularizacion);
      
      //Sacamos los datos de la institucion
      Instituciones datosInstitucion = new Instituciones();
      datosInstitucion.setId_institucion(1); //--------------------------ESTATICO
      datosInstitucion = this.mi.getBuscarInstitucion(datosInstitucion);
      if (datosInstitucion !=null) {
        modelo.put("datosInstitucion", datosInstitucion);
      }

      //Sacamos el formato de la fecha
      Abm formatoFecha = new Abm();
      formatoFecha.setCampo("formato_fecha");
      formatoFecha.setCodigo("dibrap");
      modelo.put("formatoFecha", this.mi.getDibBuscarParametro(formatoFecha));

      //Sacamos el formato de la hora
      formatoFecha.setCampo("formato_hora");
      formatoFecha.setCodigo("dibrap");
      modelo.put("formatoHora", this.mi.getDibBuscarParametro(formatoFecha));  
      return new ModelAndView("busquedasAcademicas/documentosPersonasEstudiantes/SalidaImpresionEstudiante", modelo);      
    }
    else{
      return new ModelAndView("Aviso","mensaje","No ingreso el R.U. del estudiante");
    }  
    
  }
}
