package org.fautapo.web.abmDptoGrupos;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Abm;
import org.fautapo.domain.Materias;
import org.fautapo.domain.Grupos;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2005-11-01
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2005-11-01
 */

public class ConfirmarBorradog implements Controller {

  private MiFacade mi;
  public void setMi(MiFacade mi) { this.mi = mi; }

  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
    if(cliente==null) return new ModelAndView("Aviso", "mensaje", "Su sesi�n ha terminado. Vuelva a la pagina inicial e ingrese de nuevo.");
    Map modelo = new HashMap();

    int iId_programa = cliente.getInt(request, "id_programa");
    int iId_tipo_evaluacion = cliente.getInt(request, "id_tipo_evaluacion");
    int iId_prg_plan = cliente.getInt(request, "id_prg_plan");
    int iGestion = cliente.getInt(request, "gestion");
    int iPeriodo = cliente.getInt(request, "periodo");
    int _yabe = cliente.getInt(request, "_yabe");
	
	System.out.println("El iddptogrupo es: "+_yabe);
    modelo.put("id_programa", Integer.toString(iId_programa));
    modelo.put("id_prg_plan", Integer.toString(iId_prg_plan));
    modelo.put("id_tipo_evaluacion", Integer.toString(iId_tipo_evaluacion));
    modelo.put("gestion", Integer.toString(iGestion));
    modelo.put("periodo", Integer.toString(iPeriodo));
    modelo.put("_yabe", Integer.toString(_yabe));

    //Svcamos el formato de la fecha
    Abm formatoFecha = new Abm();
    formatoFecha.setCampo("formato_fecha");
    formatoFecha.setCodigo("dibrap");
    modelo.put("formatoFecha", this.mi.getDibBuscarParametro(formatoFecha));
     
    //Sacamos los datos del grupo
    Grupos grupo = new Grupos();
    grupo.setId_dpto_grupo(_yabe);
    grupo = this.mi.getMiDptoBuscarGrupo(grupo);
    modelo.put("grupo", grupo);
    int id_grupo=grupo.getId_grupo();
	System.out.println("El id del grupo es: "+id_grupo);
	modelo.put("id_grupo",Integer.toString(id_grupo));
	
    //Sacamos los datos de la materia
    Materias materia = new Materias();
    materia.setId_materia(grupo.getId_materia());
    modelo.put("materia", this.mi.getMtrBuscarMateria(materia));
    modelo.put("grupito", this.mi.getGrpBuscarGrupo(grupo));
    int id_materia= materia.getId_materia();
	System.out.println("El id de la materia es: "+id_materia);
	modelo.put("id_materia",Integer.toString(id_materia));
    return new ModelAndView("abmDptoGrupos/ConfirmarBorrado", modelo);
  }
}