/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fautapo.web.reportesAcademicos.MayoresNotasEstudiantes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.fautapo.domain.Abm;
import org.fautapo.domain.Clientes;
import org.fautapo.domain.Instituciones;
import org.fautapo.domain.Notas;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author FNZABALETAA
 */
public class ListarMayoresNotas implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map modelo = new HashMap();

        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
        if (cliente == null) {
            return new ModelAndView("Aviso", "mensaje", "Su sesion ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");
        }
        int iGestion = cliente.getInt(request, "gestion");
        int iPeriodo = cliente.getInt(request, "periodo");

        modelo.put("gestion", Integer.toString(iGestion));
        modelo.put("periodo", Integer.toString(iPeriodo));

        Instituciones datosInstitucionSede = new Instituciones();
        datosInstitucionSede.setId_institucion(cliente.getId_almacen());
        datosInstitucionSede = this.mi.getBuscarInstitucionSede(datosInstitucionSede);
        if (datosInstitucionSede != null) {
            modelo.put("datosInstitucionsede", datosInstitucionSede);
        }
        List<Notas> lnotas = mi.getListaMayoresa80SinModalidad(iGestion, iPeriodo);
        modelo.put("lnotas", lnotas);

        Abm formatoFecha = new Abm();
        formatoFecha.setCampo("formato_fecha");
        formatoFecha.setCodigo("dibrap");
        modelo.put("formatoFecha", this.mi.getDibBuscarParametro(formatoFecha));

        return new ModelAndView("reportesAcademicos/mejoresnotas/ListarMateriasMoyoresa80", modelo); 
    }

}
