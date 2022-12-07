package org.fautapo.web.reportesEspecializados.estadisticas.mayorNota;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.fautapo.domain.*;

public class FormarReporteNotMa implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //Declaracion de Variables
        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
        if (cliente == null) {
            return new ModelAndView("Aviso", "mensaje", "Su sesion termino, debe volver a la pagina inicial e ingresar de nuevo.");
        }
        Map modelo = new HashMap();
        Funciones f = new Funciones(request, modelo, mi);
        String sql = "";

        //Sacamos los datos del programa
        Programas programa = new Programas();
        programa.setId_programa(Integer.parseInt(f.sRequest("id_programa")));
        programa = this.mi.getPrgBuscarPrograma(programa);
        modelo.put("programa", programa);

        //Sacamos los datos de la Facultad
        Facultades datosFacultad = new Facultades();
        datosFacultad.setId_facultad(programa.getId_facultad());
        datosFacultad = this.mi.getFclBuscarFacultad(datosFacultad);
        modelo.put("datosFacultad", datosFacultad);

        //Buscamos Tipo Evaluacion
        Libretas datosTipoEvaluacion = new Libretas();
        datosTipoEvaluacion.setId_tipo_evaluacion(f.iRequest("id_tipo_evaluacion"));
        datosTipoEvaluacion = this.mi.getTpsBuscarTipoEvaluacion(datosTipoEvaluacion);
        modelo.put("datosTipoEvaluacion", datosTipoEvaluacion);

        //Buscamos los datos de prg_planes
        Planes datosPrgPlan = new Planes();
        datosPrgPlan.setId_prg_plan(f.iRequest("id_prg_plan"));
        datosPrgPlan = this.mi.getBuscarPrgPlan2(datosPrgPlan);
        modelo.put("datosPrgPlan", datosPrgPlan);

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

        // Definicion de la consulta SQL
        sql += "\n SELECT * FROM mi_rep_mayor_nota(" + f.sRequest("id_programa") + ", '" + datosPrgPlan.getId_plan() + "', " + datosPrgPlan.getId_tipo_grado() + ", " + f.sRequest("gestion") + ", " + f.sRequest("periodo") + ", " + f.sRequest("id_tipo_evaluacion") + ")";
        sql += "\n AS (id_materia integer, nivel_academico dentero, sigla dtexto, materia dtexto, grupo dtexto, id_estudiante dentero, paterno dtexto2, materno dtexto2, nombres dtexto, nota integer)";

        System.out.println("\n\n--Listar Transacciones-->\n" + sql + ";\n\n\n");

        //definicion de las etiquetas
        String etiquetas = "Id_Materia###Nivel###Sigla###Materia###Grupo###R.U.###Paterno###Materno###Nombres###Mayor Nota";

        //Generacion de la matriz
        f.matriz_etiquetas(sql, "datos", 1, "desde", 10, etiquetas);
        modelo.put("nombres", cliente.getNombres());
        modelo.put("periodo", f.sRequest("periodo"));
        modelo.put("gestion", f.sRequest("gestion"));

        return new ModelAndView("reportesEspecializados/estadisticas/mayorNota/FormarReporte", modelo);
    }
}
