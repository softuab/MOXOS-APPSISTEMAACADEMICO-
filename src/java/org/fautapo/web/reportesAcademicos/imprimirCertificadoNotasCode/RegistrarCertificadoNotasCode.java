package org.fautapo.web.reportesAcademicos.imprimirCertificadoNotasCode;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Abm;
import org.fautapo.domain.Literales;
import org.fautapo.domain.Instituciones;
import org.fautapo.domain.Estudiantes;
import org.fautapo.domain.Personas;
import org.fautapo.domain.Programas;
import org.fautapo.domain.Libretas;
import org.fautapo.domain.Facultades;
import org.fautapo.domain.Notas;
import org.fautapo.domain.Planes;

import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeImageHandler;
import java.io.FileOutputStream;
import java.io.IOException;

import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-03-30
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-03-30
 */
public class RegistrarCertificadoNotasCode implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
        if (cliente == null) {
            return new ModelAndView("Error", "mensaje", "Tu sesi�n termino. Por favor, ingresa nuevamente.");
        }
        Map modelo = new HashMap();

        //Recuperando variables del jsp
        String sGestion = request.getParameter("gestion");
        String sPeriodo = request.getParameter("periodo");
        String sId_programa = request.getParameter("id_programa");
        String sRu = request.getParameter("id_estudiante");
        String sNombres = request.getParameter("nombres");
        String sPaterno = request.getParameter("paterno");
        String sMaterno = request.getParameter("materno");
        //String sPlan = request.getParameter("plan");
        //String sApellidos = request.getParameter("apellidos");
        String sNro_recibo = cliente.getString(request, "nrocertificado");
        String sTodas = request.getParameter("todas");
        String sCi = request.getParameter("ci");
        String sFacultad = request.getParameter("facultad");
        String sPrograma = request.getParameter("programa");
        String sGradoAcademico = request.getParameter("gradoAcademico");
        String sPlan = request.getParameter("plan");
        String x = request.getParameter("x");

        System.out.println("X-registrarCertificadoNotas" + x);
        //CONTROL DE NRO TRANSACCION
        int control_nro;
        Estudiantes nro = new Estudiantes();
        nro.setnro_transaccion(sNro_recibo);
        control_nro = this.mi.getbuscarnrotransacciones(nro);
        if (control_nro == 1) {
            return new ModelAndView("reportesAcademicos/imprimirCertificadoNotasCode/Aviso", "mensaje", "El numero de Recibo  " + sNro_recibo + " ya se ultilizo. Verifique el dato.");
        }
        //

        /*//Votamos los datos*/
        modelo.put("gestion", sGestion);
        modelo.put("periodo", sPeriodo);
        modelo.put("id_programa", sId_programa);
        //modelo.put("id_estudiante",sId_estudiante);
        modelo.put("nombres", sNombres);
        modelo.put("paterno", sPaterno);
        modelo.put("materno", sMaterno);
        modelo.put("plan", sPlan);
        modelo.put("nrocertificado", sNro_recibo);
        modelo.put("todas", sTodas);
        modelo.put("sRu", sRu);

        System.out.println("1-> " + sGestion);
        System.out.println("2-> " + sPeriodo);
        //System.out.println("3-> "+sId_programa);
        //System.out.println("4-> "+sId_estudiante);
        System.out.println("4-> " + sNombres);
        System.out.println("p-> " + sPaterno);
        System.out.println("m-> " + sMaterno);
        System.out.println("pl-> " + sPlan);
        System.out.println("5-> " + sNro_recibo);
        System.out.println("6-> " + sTodas);
        //modelo.put("acceso", (Accesos) request.getSession().getAttribute("__sess_acceso"));

        //Buscamos el programa
        Programas datosPrograma = new Programas();
        datosPrograma.setId_programa(Integer.parseInt(sId_programa));
        datosPrograma = this.mi.getPrgBuscarPrograma(datosPrograma);
        modelo.put("datosPrograma", datosPrograma);

        // if ("".equals(sId_estudiante) ){
        //  return new ModelAndView("reportesAcademicos/imprimirCertificadoNotasCode/", modelo);
        //}
        // if (!"".equals(sId_estudiante)) {
        //Sacando los datos del estudiante    
        Estudiantes datosEstudiante = new Estudiantes();
        //try {
        datosEstudiante.setId_estudiante(Integer.parseInt(sRu));
        // } catch(Exception e) {
        //  return new ModelAndView("Error", "mensaje", "El R.U. no es valido, introduzca un numero");
        // }
        datosEstudiante.setId_programa(Integer.parseInt(sId_programa));
        datosEstudiante = this.mi.getEstBuscarEstudiantePrograma(datosEstudiante);
        // modelo.put("datosEstudiante", datosEstudiante);

        // if (datosEstudiante == null) {
        // return new ModelAndView("reportesAcademicos/imprimirCertificadoNotasCode/Aviso","mensaje","El estudiante con R.U. : "+ sId_estudiante + "no esta registrado en el Programa : "+ datosPrograma.getPrograma() + ". Verifique.");
        // }
        //datosEstudiante.setGestion(Integer.parseInt(sGestion));
        // datosEstudiante.setPeriodo(Integer.parseInt(sPeriodo));
        //Buscamos el grado_academico por programa e id_plan
        Libretas datosGrados = new Libretas();
        datosGrados.setId_programa(datosEstudiante.getId_programa());
        datosGrados.setId_plan(datosEstudiante.getId_plan());
        datosGrados = this.mi.getBuscarGradoAcademicoPrograma(datosGrados);
        modelo.put("datosGrados", datosGrados);

        //Sacamos los datos de la Facultad
        Facultades datosFacultad = new Facultades();
        datosFacultad.setId_facultad(datosPrograma.getId_facultad());
        datosFacultad = this.mi.getFclBuscarFacultad(datosFacultad);
        modelo.put("datosFacultad", datosFacultad);

        //Sacamos los datos del Estudiante
        datosEstudiante = new Estudiantes();
        datosEstudiante.setId_estudiante(Integer.parseInt(sRu));
        datosEstudiante = this.mi.getEstBuscarEstudianteNombres(datosEstudiante);
        modelo.put("datosEstudiante2", datosEstudiante);

        //Sacamos los datos de la institucion
        Instituciones datosInstitucion = new Instituciones();
        datosInstitucion.setId_institucion(1); //--------------------------ESTATICO
        datosInstitucion = this.mi.getBuscarInstitucion(datosInstitucion);
        if (datosInstitucion != null) {
            //  modelo.put("datosInstitucion", datosInstitucion);
        }

        Instituciones datosInstitucionSede = new Instituciones();
        datosInstitucionSede.setId_institucion(cliente.getId_almacen()); //--------------------------ESTATICO
        datosInstitucionSede = this.mi.getBuscarInstitucionSede(datosInstitucionSede);
        if (datosInstitucionSede != null) {
            modelo.put("datosInstitucionsede", datosInstitucionSede);
        }

        //Sacamos el formato de la fecha
        Abm formatoFecha = new Abm();
        formatoFecha.setCampo("formato_fecha");
        formatoFecha.setCodigo("dibrap");
        //  modelo.put("formatoFecha", this.mi.getDibBuscarParametro(formatoFecha));

        // tabla: CERTIFICADOS GENERADOS
        Estudiantes MaxCode = new Estudiantes();

        MaxCode.setid_sede(datosPrograma.getId_sede());
        MaxCode.setgestion_certificado(cliente.getGestion());
        MaxCode.setid_concepto(Integer.parseInt(x));

        int iMaxCode = this.mi.getBuscarMaxCertSede(MaxCode);

        System.out.println("MaxCode" + iMaxCode);
        int nro_cert = 0;
        if (iMaxCode > 0) {
            nro_cert = iMaxCode + 1;
            System.out.println("if nroCode" + nro_cert);
        } else {
            nro_cert = 1;
        }

        System.out.println("nroCode" + nro_cert);

        modelo.put("MaxCode", MaxCode);
        System.out.println("ESTOY EN NOTASCODE1");
        int iResultado = 0;
        // System.out.println("ESTOY EN CODE");
        Estudiantes code = new Estudiantes();
        code.setid_concepto(Integer.parseInt(x));
        code.setid_sede(datosPrograma.getId_sede());
        code.setnro_certificado(nro_cert);
        code.setgestion_certificado(cliente.getGestion());
        code.setnro_transaccion(sNro_recibo);
        code.setFacultad(sFacultad);
        code.setcarrera(sPrograma);
        code.setnivel(sGradoAcademico);
        code.setId_plan(sPlan);

        if ("27".equals(x)) {
            code.setperiodo_academico(sPeriodo + '/' + sGestion);
        }
        if ("31".equals(x)) {
            code.setperiodo_academico("NINGUNO");
        }
        code.setRu(Integer.parseInt(sRu));
        code.setCi(Integer.parseInt(sCi));
        code.setestudiante(sNombres + ' ' + sPaterno + ' ' + sMaterno);
        //  code.setobservacion("ninguna");
        code.setreimpresiones(0);
        code.setUlt_usuario(cliente.getId_usuario());
        System.out.println("ESTOY EN NOTASCODE2");

        iResultado = this.mi.setRegistrarCerGen(code);

        //Sacamos los datos del certificado
        List lNotas = new ArrayList();

        datosEstudiante = new Estudiantes();

        datosEstudiante.setId_estudiante(Integer.parseInt(sRu));

        datosEstudiante.setId_programa(Integer.parseInt(sId_programa));
        datosEstudiante = this.mi.getEstBuscarEstudiantePrograma(datosEstudiante);
        modelo.put("datosEstudiante", datosEstudiante);

        //Sacamos los datos del certificado
        ///////////////////////////////
        if ("42".equals(x)) {
            int iId_programa = cliente.getInt(request, "id_programa");
            int iId_mencion = cliente.getInt(request, "id_mencion");
            int iId_estudiante = cliente.getInt(request, "id_estudiante");

            System.out.println("programa%%2 --> " + iId_programa);
            System.out.println("mension%%2 --> " + iId_mencion);
            System.out.println("estudiante%%2 --> " + iId_estudiante);

            //Sacando los datos personales del Estudiante encontrado
            Personas datosPersona = new Personas();
            datosPersona.setId_persona(datosEstudiante.getId_persona());
            datosPersona = this.mi.getPrsBuscarPersona(datosPersona);
            modelo.put("datosPersona", datosPersona);

            //Sacamos el listado de las materias del plan nuevo
            Planes datosPlan = new Planes();
            datosPlan.setId_programa(datosEstudiante.getId_programa());
            datosPlan.setId_plan(datosEstudiante.getId_plan());
            datosPlan.setId_tipo_grado(datosEstudiante.getId_tipo_grado());
            datosPlan.setId_mencion(iId_mencion);
            List lPlanDeEstudios = this.mi.getListarMateriasPlanMencion(datosPlan);
            modelo.put("lPlanDeEstudios", lPlanDeEstudios);

        }
        ///////////////////////////////
        if ("27".equals(x)) {
            datosEstudiante.setGestion(Integer.parseInt(sGestion));
            datosEstudiante.setPeriodo(Integer.parseInt(sPeriodo));
            if ("Si".equals(sTodas)) {
                lNotas = this.mi.getListarCertificadoNotasTodas3(datosEstudiante);
            }
            if ("No".equals(sTodas)) {
                lNotas = this.mi.getListarCertificadoNotasAprobadas3(datosEstudiante);
            }
        }
        if ("31".equals(x)) {
            lNotas = this.mi.getListarHistorialAcademico(datosEstudiante);
            //
            modelo.put("total_materias_aprobadas", Integer.toString(lNotas.size()));
            //Sacamos el plan de estudios
            Planes datosPlan = new Planes();
            datosPlan.setId_programa(datosEstudiante.getId_programa());
            datosPlan.setId_plan(datosEstudiante.getId_plan());
            datosPlan.setId_tipo_grado(datosEstudiante.getId_tipo_grado());
            List lPlanDeEstudios = this.mi.getListarMateriasPlanRequisitos(datosPlan);
            modelo.put("total_materias_plan", Integer.toString(lPlanDeEstudios.size()));
            //Sacamos el porcentaje de materias aprobadas
            Notas datosNota = new Notas();
            datosNota.setId_estudiante(datosEstudiante.getId_estudiante());
            double promedio = this.mi.getBuscarPromedioDeNotas(datosNota);
            modelo.put("promedio", Double.toString(promedio));
            System.out.println("total_materias_aprobadas-> " + lNotas.size());
            System.out.println("total_materias_plan-> " + lPlanDeEstudios.size());
            System.out.println("promedio-> " + promedio);
            //
        }

        List lMateriasNotas = new ArrayList();
        for (int i = 0; i < lNotas.size(); i++) {
            Libretas datosLibreta = (Libretas) lNotas.get(i);
            Literales literal = new Literales();
            datosLibreta.setLiteral(literal.convertNumber(datosLibreta.getNota()));
            lMateriasNotas.add(i, datosLibreta);

            int iResultadoCertNotas = 0;
            Estudiantes codecert = new Estudiantes();
            codecert.setid_certificados_generados(iResultado);
            codecert.setNro_certificado2(Integer.toString(nro_cert) + '/' + Integer.toString(cliente.getGestion()));
            codecert.setSigla(datosLibreta.getSigla());
            codecert.setnivel2(datosLibreta.getNivel_academico());
            codecert.setasignatura(datosLibreta.getMateria());
            codecert.setnumeral(datosLibreta.getNota());
            codecert.setliteral(literal.convertNumber(datosLibreta.getNota()));
            codecert.setTipo_evaluacion(datosLibreta.getTipo_evaluacion());
            if (datosPrograma.getId_periodo() == 1) {
                if (datosLibreta.getPeriodo() == 0) {
                    codecert.setperiodogestion("");
                }
                if (datosLibreta.getPeriodo() != 0) {
                    codecert.setperiodogestion(Integer.toString(datosLibreta.getPeriodo()) + '-' + Integer.toString(datosLibreta.getGestion()));
                }
            }
            if (datosPrograma.getId_periodo() == 2) {
                if (datosLibreta.getGestion() == 0) {
                    codecert.setperiodogestion("");
                }
                if (datosLibreta.getGestion() != 0) {
                    codecert.setperiodogestion(Integer.toString(datosLibreta.getGestion()));
                }
            }
            codecert.setId_estado("A");
            codecert.setUlt_usuario(cliente.getId_usuario());
            codecert.setObservacion(datosLibreta.getId_estado());
            // System.out.println("ESTADO OBS"+datosLibreta.getId_estado());
            iResultadoCertNotas = this.mi.setRegistrarCerGenNotas(codecert);
        }

        //BARBECUDE 
        //*NOTA COLOCAR EL NOMBRE DE LA APLICACION
        String sAplicacion = "/moxos/";
        String sNC = nro_cert + "/" + Integer.toString(cliente.getGestion());
        String sNC1 = nro_cert + "-" + Integer.toString(cliente.getGestion());
        Barcode barcode = BarcodeFactory.createCode128(sRu + "-" + sNC);
        barcode.setBarHeight(50);
        barcode.setBarWidth(3);
        barcode.setDrawingText(false);
        barcode.setResolution(400);
        String liga = "/Program Files/opt/Apache Software Foundation/Tomcat 5.5/webapps";

        if ("42".equals(x)) {
            try {
                //CARPETA DE RESPALDO C:\Program Files\opt\Apache Software Foundation\Tomcat 5.5\webapps
                String fichero1 = liga + "/CodigoBarra/Certificado/";
                FileOutputStream fos1 = new FileOutputStream(fichero1 + "barcode_pe" + sNC1 + ".jpg");
                BarcodeImageHandler.outputBarcodeAsJPEGImage(barcode, fos1);
                //CARPETA EN LA APLICACION
                String fichero = liga + sAplicacion + "imagenes/CodigoBarra/Certificado/";
                FileOutputStream fos = new FileOutputStream(fichero + "barcode_pe" + sNC1 + ".jpg");
                BarcodeImageHandler.outputBarcodeAsJPEGImage(barcode, fos);
                modelo.put("ruta", sAplicacion + "imagenes/CodigoBarra/Certificado/" + "barcode_pe" + sNC1 + ".jpg");
            } catch (IOException e) {
                System.out.println("ERROR AL GENERAR BARBECUE");
                System.out.println("certificadoNotas " + sNC1);
                System.out.println("certificadoNotas " + sNC);
            }
        }
        if ("27".equals(x)) {
            try {
                //CARPETA DE RESPALDO C:\Program Files\opt\Apache Software Foundation\Tomcat 5.5\webapps
                String fichero1 = liga + "/CodigoBarra/Certificado/";
                FileOutputStream fos1 = new FileOutputStream(fichero1 + "barcode_cn" + sNC1 + ".jpg");
                BarcodeImageHandler.outputBarcodeAsJPEGImage(barcode, fos1);
                //CARPETA EN LA APLICACION
                String fichero = liga + sAplicacion + "imagenes/CodigoBarra/Certificado/";
                FileOutputStream fos = new FileOutputStream(fichero + "barcode_cn" + sNC1 + ".jpg");
                BarcodeImageHandler.outputBarcodeAsJPEGImage(barcode, fos);
                modelo.put("ruta", sAplicacion + "imagenes/CodigoBarra/Certificado/" + "barcode_cn" + sNC1 + ".jpg");
            } catch (IOException e) {
                System.out.println("ERROR AL GENERAR BARBECUE");
                System.out.println("certificadoNotas " + sNC1);
                System.out.println("certificadoNotas " + sNC);
            }
        }
        if ("31".equals(x)) {
            try {
                //CARPETA DE RESPALDO C:\Program Files\opt\Apache Software Foundation\Tomcat 5.5\webapps
                String fichero1 = liga + "/CodigoBarra/Certificado/";
                FileOutputStream fos1 = new FileOutputStream(fichero1 + "barcode_ha" + sNC1 + ".jpg");
                BarcodeImageHandler.outputBarcodeAsJPEGImage(barcode, fos1);
                //CARPETA EN LA APLICACION
                String fichero = liga + sAplicacion + "imagenes/CodigoBarra/Certificado/";
                FileOutputStream fos = new FileOutputStream(fichero + "barcode_ha" + sNC1 + ".jpg");
                BarcodeImageHandler.outputBarcodeAsJPEGImage(barcode, fos);
                modelo.put("ruta", sAplicacion + "imagenes/CodigoBarra/Certificado/" + "barcode_ha" + sNC1 + ".jpg");
            } catch (IOException e) {
                System.out.println("ERROR AL GENERAR BARBECUE");
                System.out.println("historialAcademico " + sNC1);
                System.out.println("historialAcademico " + sNC);
            }
        }

        modelo.put("NC", sNC);
        modelo.put("NC1", sNC1);
        modelo.put("Ru", sRu);
        // FIN BARBECUE
        modelo.put("lMateriasNotas", lMateriasNotas);
        // modelo.put("lNotas", lNotas);
        if ("42".equals(x)) {
            return new ModelAndView("reportesAcademicos/imprimirCertificadoNotasCode/RegistrarPlandeEstudios", modelo);
        }
        if ("31".equals(x)) {
            return new ModelAndView("reportesAcademicos/imprimirCertificadoNotasCode/RegistrarHistorialAcademico", modelo);
        }
        return new ModelAndView("reportesAcademicos/imprimirCertificadoNotasCode/RegistrarCertificadoNotas", modelo);
    }
}
