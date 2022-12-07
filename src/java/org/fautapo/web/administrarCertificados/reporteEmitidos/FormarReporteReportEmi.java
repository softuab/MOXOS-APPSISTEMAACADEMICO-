/** **************************************
 * @usuario          :: Luis Jordan
 * @fec_registro :: 2007-06-26
 * @ult_usuario :: Jorge Copa
 * @fec_modificacion :: 2007-11-13
****************************************
 */
package org.fautapo.web.administrarCertificados.reporteEmitidos;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.fautapo.domain.*;
import org.fautapo.domain.Estudiantes;
import java.util.List;

public class FormarReporteReportEmi implements Controller {

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
        modelo.put("acceso", (Accesos) request.getSession().getAttribute("__sess_acceso"));

        modelo.put("fec_comprobantei", f.sRequest("fec_comprobantei"));
        modelo.put("fec_comprobantef", f.sRequest("fec_comprobantef"));

        System.out.println("FechaI-> " + f.sRequest("fec_comprobantei"));
        System.out.println("FechaF-> " + f.sRequest("fec_comprobantef"));

        String sFi = f.sRequest("fec_comprobantei");
        String sFf = f.sRequest("fec_comprobantef");
        String sSedes = cliente.getString(request, "sede");
        String sTipo_cert = cliente.getString(request, "tipo_cert");

        System.out.println("FechaI-> " + sFi);
        System.out.println("FechaF-> " + sFf);
        System.out.println("Sede-> " + sSedes);

        System.out.println("ANTES");
        Estudiantes datosAnu = new Estudiantes();
        datosAnu.setid_sede(Integer.parseInt(sSedes));
        datosAnu.setFec_inicio(sFi);
        datosAnu.setFec_fin(sFf);
        datosAnu.setid_concepto(Integer.parseInt(sTipo_cert));
        List lDatosAnuladosCertificados = this.mi.getListarCertGenEmitidos(datosAnu);
        System.out.println("SIZE " + lDatosAnuladosCertificados.size());
        modelo.put("lDatosAnuladosCertificados", lDatosAnuladosCertificados);
        System.out.println("DESPUES");

        //Sacamos el formato de la fecha
        Abm formatoFecha = new Abm();
        formatoFecha.setCampo("formato_fecha");
        formatoFecha.setCodigo("dibrap");
        modelo.put("formatoFecha", this.mi.getDibBuscarParametro(formatoFecha));

        return new ModelAndView("administrarCertificados/reporteEmitidos/FormarReporte", modelo);
    }
}
