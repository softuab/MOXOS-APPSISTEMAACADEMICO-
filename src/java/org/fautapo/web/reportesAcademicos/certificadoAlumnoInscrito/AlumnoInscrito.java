package org.fautapo.web.reportesAcademicos.certificadoAlumnoInscrito;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.io.ByteArrayOutputStream;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
//segundo aumentado
//segundo aumentado

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Estudiantes;
import org.fautapo.domain.Programas;
import org.fautapo.domain.Libretas;
import org.fautapo.domain.Abm;
import org.fautapo.domain.Instituciones;

import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2005-11-01
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-07-17
 */
public class AlumnoInscrito implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> modelo = new HashMap<>();

        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
        if (cliente == null) {
            return new ModelAndView("Aviso", "mensaje", "Su sesi�n ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");
        }

        String sId_estudiante = request.getParameter("id_estudiante");
        String sGestion = request.getParameter("gestion");
        String sPeriodo = request.getParameter("periodo");
        modelo.put("gestion", sGestion);
        modelo.put("periodo", sPeriodo);

        String sNombres = cliente.getNombres();
        modelo.put("usuario", sNombres);

        if (Integer.parseInt(sId_estudiante) > 0) {
            //Busco datos del Estudiante
            Estudiantes datosEst = new Estudiantes();
            datosEst.setId_estudiante(Integer.parseInt(sId_estudiante));
            datosEst = this.mi.getEstBuscarEstudianteNombres(datosEst);
            if (datosEst == null) {
                return new ModelAndView("Error", "mensaje", "El Estudiante no pertenece a su Area. Verique");
            }
            modelo.put("datosEst", datosEst);

            //SACO EL id_persona 
            int iId_persona = datosEst.getId_persona();
            //fin de la sacada       

            //para cortar la carrera
            String sCarrera = datosEst.getPrograma();
            String[] sCortarcadena = sCarrera.split("\\(");
            String sCarreracortada = sCortarcadena[0];

            modelo.put("sCarreracortada", sCarreracortada);
            //fin de la cortada jajaja

            //Verificar Si la carrera es Anual o Semestral
            //si el id_periodo de fcl_programas  es  2 la carrera es anual     1 es semestral
            //buscamos el periodo
            Programas buscarPeriodo = new Programas();
            buscarPeriodo.setId_programa(datosEst.getId_programa());
            buscarPeriodo = this.mi.getPrdBuscarPrgPeriodo(buscarPeriodo);
            modelo.put("id_periodo", Integer.toString(buscarPeriodo.getId_periodo()));

            //PARA ANUAL
            if (buscarPeriodo.getId_periodo() == 2) {
                //Verificando si tiene matricula para el periodo y gestion actual        
                Estudiantes datosMatricula = new Estudiantes();
                datosMatricula.setId_estudiante(Integer.parseInt(sId_estudiante));
                datosMatricula.setGestion(Integer.parseInt(sGestion));
                datosMatricula.setPeriodo(1);  //----> OJO estatico el periodo para anual    
                datosMatricula = this.mi.getMtrBuscarMatricula(datosMatricula);

                if (datosMatricula == null) {
                    return new ModelAndView("Aviso", "mensaje", "El estudiante con R.U." + sId_estudiante + "no esta matriculado para la gestion" + sGestion + "y periodo" + sPeriodo);
                }
                if ("B".equals(datosMatricula.getId_estado())) {
                    return new ModelAndView("Aviso", "mensaje", "La matricula del estudiante con R.U." + sId_estudiante + "esta bloqueada");
                }
            } //para SEMESTRAL
            else {

                //Verificando si tiene matricula para el periodo y gestion actual        
                Estudiantes datosMatricula = new Estudiantes();
                datosMatricula.setId_estudiante(Integer.parseInt(sId_estudiante));
                datosMatricula.setGestion(Integer.parseInt(sGestion));
                datosMatricula.setPeriodo(Integer.parseInt(sPeriodo));
                datosMatricula = this.mi.getMtrBuscarMatricula(datosMatricula);

                if (datosMatricula == null) {
                    return new ModelAndView("Aviso", "mensaje", "El estudiante con R.U." + sId_estudiante + "no esta matriculado para la gestion" + sGestion + "y periodo" + sPeriodo);
                }
                if ("B".equals(datosMatricula.getId_estado())) {
                    return new ModelAndView("Aviso", "mensaje", "La matricula del estudiante con R.U." + sId_estudiante + "esta bloqueada");
                }

            }

            //BUSCAR GRADO ACADEMICO
            Libretas datosGrados = new Libretas();
            datosGrados.setId_programa(datosEst.getId_programa());
            datosGrados.setId_plan(datosEst.getId_plan());
            datosGrados = this.mi.getBuscarGradoAcademicoPrograma(datosGrados);
            modelo.put("datosGrados", datosGrados);

            //SACAMOS FECHA DE INGRESO A LA UAB
            Estudiantes ingresoU = new Estudiantes();
            ingresoU.setId_persona((iId_persona));
            ingresoU = this.mi.getListarIngresoUAB(ingresoU);
            modelo.put("ingresoU", ingresoU);

            //Sacamos los datos de la institucion
            Instituciones datosInstitucion = new Instituciones();
            datosInstitucion.setId_institucion(1); //--------------------------ESTATICO
            datosInstitucion = this.mi.getBuscarInstitucion(datosInstitucion);

            if (datosInstitucion != null) {
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

            QRCodeWriter barcodeWriter = new QRCodeWriter();
            BitMatrix bitMatrix = barcodeWriter.encode(datosEst.getId_estudiante() + "|" + datosEst.getDip() + "|" + datosEst.getId_programa(), BarcodeFormat.QR_CODE, 200, 200);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            MatrixToImageWriter.writeToStream(bitMatrix, "png", bos);
            String image = Base64.getEncoder().encodeToString(bos.toByteArray());
            modelo.put("qr", "data:image/png;base64," + image);
            return new ModelAndView("reportesAcademicos/certificadoAlumnoInscrito/SalidaImpresionCertificado", modelo);
        } else {
            return new ModelAndView("Aviso", "mensaje", "No ingreso el R.U. del estudiante");
        }

    }
}
