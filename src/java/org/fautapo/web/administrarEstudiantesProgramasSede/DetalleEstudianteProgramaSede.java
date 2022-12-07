package org.fautapo.web.administrarEstudiantesProgramasSede;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.io.ByteArrayOutputStream;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.fautapo.domain.Abm;
import org.fautapo.domain.Clientes;
import org.fautapo.domain.Estudiantes;
import org.fautapo.domain.Facultades;
import org.fautapo.domain.Instituciones;
import org.fautapo.domain.Personas;
import org.fautapo.domain.Programas;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author Usuario
 */
public class DetalleEstudianteProgramaSede implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map modelo = new HashMap();
        //Sacamos los datos de la session
        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
        if (cliente == null) {
            return new ModelAndView("Aviso", "mensaje", "Su sesion ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");
        }
        int idPrograma = cliente.getInt(request, "id_programa");
        int idEstudiante = cliente.getInt(request, "id_estudiante");
        int idEstudianteProgramaSede = cliente.getInt(request, "id_estudiante_programa_sede"); 
        Estudiantes datosEstudiantess = new Estudiantes();
        datosEstudiantess = this.mi.getDetalleEstudiantesProgramaSede(idEstudianteProgramaSede);
        modelo.put("datosEstudiante", datosEstudiantess); 
        List<Estudiantes> lProgramasDesconcentradosVer = this.mi.getVerProgramasFaseDesconcentrado(idEstudiante);
        modelo.put("lProgramasDesconcentradosVer", lProgramasDesconcentradosVer);
        Estudiantes datosEstudiantes = new Estudiantes();
       // datosEstudiantes = this.mi.getMostraSedeDesconcentrada(datosEstudiantess.getId_desconcentrado())
        modelo.put("datosSede", datosEstudiantes);
        
        Estudiantes datosEstudiante = new Estudiantes();
        datosEstudiante.setId_estudiante(idEstudiante);
        datosEstudiante.setId_programa(idPrograma);
        datosEstudiante = this.mi.getEstBuscarEstudiantePrograma(datosEstudiante);

        //Sacando los datos personales del Estudiante encontrado
        Personas datosPersona = new Personas();
        datosPersona.setId_persona(datosEstudiante.getId_persona());
        datosPersona = this.mi.getPrsBuscarPersona(datosPersona);
        modelo.put("datosPersona", datosPersona);
        //Sacamos los datos del Programa
        Programas datosPrograma = new Programas();
        datosPrograma.setId_programa(idPrograma);
        datosPrograma = this.mi.getPrgBuscarPrograma(datosPrograma);
        modelo.put("datosPrograma", datosPrograma);
        //Sacamos los datos de la Facultad
        Facultades datosFacultad = new Facultades();
        datosFacultad.setId_facultad(datosPrograma.getId_facultad());
        datosFacultad = this.mi.getFclBuscarFacultad(datosFacultad);
        modelo.put("datosFacultad", datosFacultad);

        //Sacamos los datos de la institucion
        Instituciones datosInstitucion = new Instituciones();
        datosInstitucion.setId_institucion(1); //--------------------------ESTATICO
        datosInstitucion = this.mi.getBuscarInstitucion(datosInstitucion);
        if (datosInstitucion != null) {
            modelo.put("datosInstitucion", datosInstitucion);
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
        modelo.put("formatoFecha", this.mi.getDibBuscarParametro(formatoFecha));

        QRCodeWriter barcodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = barcodeWriter.encode(idEstudianteProgramaSede + "|" + datosEstudiante.getId_estudiante() + "|" + datosEstudiantess.getId_desconcentrado() + "|", BarcodeFormat.QR_CODE, 200, 200);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        MatrixToImageWriter.writeToStream(bitMatrix, "png", bos);
        String image = Base64.getEncoder().encodeToString(bos.toByteArray());
        modelo.put("qr", image);
        modelo.put("usuario", cliente.getNombres());

        return new ModelAndView("administrarEstudiantesProgramasSedes/Detalle", modelo);

    }

}
