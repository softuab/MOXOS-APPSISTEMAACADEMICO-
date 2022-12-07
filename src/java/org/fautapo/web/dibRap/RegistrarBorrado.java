package org.fautapo.web.dibRap;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Abm;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2005-11-01
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2005-11-01
 */
public class RegistrarBorrado implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map modelo = new HashMap();

        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
        String sId_enlace = request.getParameter("e");
        modelo.put("id_enlace", sId_enlace);
        String sPermiso = request.getParameter("p"); // Permiso
        modelo.put("permiso", sPermiso);
        String sFiltro = request.getParameter("f"); // Condicion (filtro)
        modelo.put("condicion", sFiltro);
        int iId_tabla = Integer.parseInt(request.getParameter("t"));
        String sValoresPrimarios = request.getParameter("c");

        Abm tabla = new Abm();
        tabla.setId_tabla(iId_tabla);
        tabla = this.mi.getBuscarTabla(tabla);
        modelo.put("tabla", tabla);

        // Contar DEPENDIENTES
        tabla.setCondicion(sValoresPrimarios);
        if (this.mi.getContarDependientes(tabla) > 0) {
            return new ModelAndView("Error", "mensaje", "No se puede eliminar este registro, porque existen otros que dependen de el");
        }

        String sql = "UPDATE " + tabla.getTabla() + " SET id_estado = 'X', ult_usuario = " + cliente.getId_usuario() + " WHERE ";
        tabla.setPermiso("p");
        List listaLlavesPrimarias = this.mi.getListarCamposTabla(tabla);
        String vValoresPrimarios[] = sValoresPrimarios.split("#~~#");
        for (int i = 0; i < listaLlavesPrimarias.size(); i++) {
            Abm campo = (Abm) listaLlavesPrimarias.get(i);
            //sql = sql + campo.getCampo() + " = '" + vValoresPrimarios[i] + "'::" + campo.getTipo_dato() + " AND ";
            sql = sql + campo.getCampo() + " = " + (campo.getTipo_dato().indexOf("fecha") > -1 ? "_cadena_fecha('" : "'") + vValoresPrimarios[i] + (campo.getTipo_dato().indexOf("fecha") > -1 ? "')" : "'::" + campo.getTipo_dato()) + " AND ";
        }
        sql = sql.substring(0, sql.length() - 4);
        tabla.setSql(sql);
        try {
            this.mi.setEjecutarConsulta(tabla);
            modelo.put("mensaje", "La transaccion se registro correctamente");
        } catch (Exception e) {
            // No es lo adecuado, pero suma
            String mensajes[] = ((String[]) (e.getCause().getMessage().split("SQLException: ERROR: ")))[1].split("Detail:");

            System.out.println("dibRap - " + mensajes[0]);
            //String problema = "Hubo un error al realizar la transaccion en la relacion '" + tabla.getTabla() + "'.<br/><br/>" + mensajes[0];
            String problema = mensajes[0];
            if (mensajes.length > 1) {
                System.out.println("dibRap - DETALLE:" + mensajes[1]);
                problema += "<br> DETALLE:" + mensajes[1] + "<hr/>SQL='" + sql + "'";
            }
            return new ModelAndView("Error", "mensaje", problema);
        }
        return new ModelAndView("dibRap/Aviso", modelo);
    }
}
