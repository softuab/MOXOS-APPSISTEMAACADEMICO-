package org.fautapo.web.abmDptoGrupos;

import java.util.HashMap;
import java.util.Map;
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

public class RegistrarBorradog implements Controller {

  private MiFacade mi;
  public void setMi(MiFacade mi) { this.mi = mi; }

  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
    if(cliente==null) return new ModelAndView("Aviso", "mensaje", "Su sesi�n ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");
    Map modelo = new HashMap();

    int iId_programa = cliente.getInt(request, "id_programa");
    int iId_prg_plan = cliente.getInt(request, "id_prg_plan");
    int iId_tipo_evaluacion = cliente.getInt(request, "id_tipo_evaluacion");
    int iGestion = cliente.getInt(request, "gestion");
    int iPeriodo = cliente.getInt(request, "periodo");
	int iIdmateria=cliente.getInt(request,"id_materia");
	int iId_grupo=cliente.getInt(request,"id_grupo");
    modelo.put("id_programa", Integer.toString(iId_programa));
    modelo.put("id_tipo_evaluacion", Integer.toString(iId_tipo_evaluacion));
    modelo.put("id_prg_plan", Integer.toString(iId_prg_plan));
    modelo.put("gestion", Integer.toString(iGestion));
    modelo.put("periodo", Integer.toString(iPeriodo));
	  modelo.put("id_materia", Integer.toString(iIdmateria));
	  modelo.put("id_grupo", Integer.toString(iId_grupo));

    //String sql = "UPDATE dpto_grupos SET ";
    //sql += "id_estado='X', id_rol="+cliente.getId_rol()+", ult_usuario="+cliente.getId_usuario();
    //sql += " WHERE id_dpto_grupo="+cliente.getInt(request, "_yabe");
	String mensaje="No puede eliminar este grupo ya que tiene un registro asociado.";
	String sql= "UPDATE dpto_grupos SET ";
	sql+="id_estado='X',id_rol="+cliente.getId_rol()+", ult_usuario="+cliente.getId_usuario();
    sql+= " where id_tipo_evaluacion="+iId_tipo_evaluacion+" and gestion="+iGestion+" and periodo="+iPeriodo;
	sql+=" and id_departamento="+iId_programa+" and id_materia="+iIdmateria;
	sql+=" and id_dpto_grupo="+cliente.getInt(request, "_yabe")+" and id_grupo="+iId_grupo;
	sql+=" and not exists(select * from dct_asignaciones a where id_materia="+iIdmateria+" and gestion="+iGestion+" and periodo="+iPeriodo;
	sql+=" and id_departamento="+iId_programa+" and id_tipo_evaluacion="+iId_tipo_evaluacion+" and a.id_grupo= "+iId_grupo+ " and id_estado<>'X')";
	
    Abm tabla = new Abm();
    tabla.setSql(sql);
    try {
      this.mi.setEjecutarConsulta(tabla);
      modelo.put("mensaje", "Los datos se registraron correctamente");
    } catch (Exception e) {
      // No es lo adecuado, pero suma
      String mensajes[] = ((String[]) (e.getCause().getMessage().split("SQLException: ERROR: ")))[1].split("Detail:");

      System.out.println("dibRap - " + mensajes[0]);
      //String problema = "Hubo un error al realizar la transacci�n en la relaci�n '" + tabla.getTabla() + "'.<br/><br/>" + mensajes[0];
      String problema = mensajes[0];
      if (mensajes.length > 1) {
        System.out.println("dibRap - DETALLE:" + mensajes[1]);
        problema += "<br> DETALLE:" + mensajes[1] + "<hr/>SQL='" + sql + "'";
      }
      return new ModelAndView("Error", "mensaje", problema);
    }
	if(this.mi.setEjecutarConsulta(tabla)==0){
		 modelo.put("mensaje", "No se puede realizar porque existe una relacion.");
	}
	System.out.println("El resultado de la consulta retorna:"+this.mi.setEjecutarConsulta(tabla));
    return new ModelAndView("abmDptoGrupos/Distro", modelo);
  }
}