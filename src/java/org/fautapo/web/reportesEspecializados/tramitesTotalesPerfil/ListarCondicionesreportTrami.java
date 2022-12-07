/** **************************************
 * @usuario          :: Luis Jordan
 * @fec_registro :: 15.09.2006
 * @ult_usuario :: Dayana Torrico
 * @fec_modificacion :: 2008-05-02
****************************************
 */
package org.fautapo.web.reportesEspecializados.tramitesTotalesPerfil;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.fautapo.domain.Abm;
import org.fautapo.domain.Clientes;
import org.fautapo.domain.Tramites;

import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ListarCondicionesreportTrami implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
        if (cliente == null) {
            return new ModelAndView("Aviso", "mensaje", "Su sesion termino, debe volver a la pagina inicial e ingresar de nuevo.");
        }
        Map modelo = new HashMap();

        Abm formatoFecha = new Abm();
        formatoFecha.setCampo("formato_fecha");
        formatoFecha.setCodigo("dibrap");
        modelo.put("formatoFecha", this.mi.getDibBuscarParametro(formatoFecha));

        Tramites datosProcesos = new Tramites();
        modelo.put("lProcesos", this.mi.getTrListarProcesos());

        return new ModelAndView("reportesEspecializados/tramitesTotalesPerfil/ListarCondiciones", modelo);
    }
}
