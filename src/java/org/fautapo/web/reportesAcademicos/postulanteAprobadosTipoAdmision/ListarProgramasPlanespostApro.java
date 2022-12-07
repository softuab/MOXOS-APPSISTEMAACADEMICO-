package org.fautapo.web.reportesAcademicos.postulanteAprobadosTipoAdmision;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Usuarios;
import org.fautapo.domain.Accesos;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-04-05
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-04-05
 */
public class ListarProgramasPlanespostApro implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map modelo = new HashMap();

        //Sacamos los datos de la session
        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
        if (cliente == null) {
            return new ModelAndView("Aviso", "mensaje", "Su sesion ha terminado. Debe volver a la pagina inicial e ingresar de nuevo.");
        }
        String sClave = request.getParameter("clave" + request.getParameter("hora"));
        String sGestion = request.getParameter("gestion");
        String sPeriodo = request.getParameter("periodo");
        modelo.put("gestion", sGestion);
        modelo.put("periodo", sPeriodo);

        // Comprobamos si es quien debe ingresar al modulo, de acuerdo a su clave
        Usuarios usuario = new Usuarios();
        usuario.setId_usuario(cliente.getId_usuario());
        usuario.setClave(sClave);
        if ("".equals(sClave)) {
            return new ModelAndView("reportesAcademicos/postulantesAprobados/Entrada", modelo);
        }

        if (null == this.mi.getComprobarUsuario(usuario)) {
            String mensaje = "Clave incorrecta";
            modelo.put("mensaje", mensaje);
            return new ModelAndView("Error", modelo);
        }
        modelo.put("acceso", (Accesos) request.getSession().getAttribute("__sess_acceso"));
        return new ModelAndView("reportesAcademicos/postulantesAprobadosTipoAdmision/ListarProgramasPlanes", modelo);
    }
}
