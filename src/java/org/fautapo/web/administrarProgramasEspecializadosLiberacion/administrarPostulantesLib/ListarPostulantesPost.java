package org.fautapo.web.administrarProgramasEspecializadosLiberacion.administrarPostulantesLib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.fautapo.Model.DetallePostulanteModel;
import org.fautapo.Model.PostulantesModel;

import org.fautapo.domain.Clientes;
import org.fautapo.domain.Postulantes;
import org.fautapo.domain.logic.MiFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @autor FAUTAPO
 * @fec_registro 2006-03-30
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-03-30
 */
public class ListarPostulantesPost implements Controller {

    private MiFacade mi;

    public void setMi(MiFacade mi) {
        this.mi = mi;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Clientes cliente = (Clientes) request.getSession().getAttribute("__sess_cliente");
        if (cliente == null) {
            return new ModelAndView("Error", "mensaje", "Tu sesi�n termino. Por favor, ingresa nuevamente.");
        }

        String sDip = cliente.getString(request, "dip");
        String sNombre = cliente.getString(request, "nombre");

        if ("".equals(sDip) && "".equals(sNombre)) {
            return new ModelAndView("administrarProgramasEspecializadosLiberacion/administrarPostulantesLib/EntradaBuscarPostulantes");
        }
        Map<String, Object> modelo = new HashMap<>();
        List<PostulantesModel> lPstPersonas;
        Postulantes postulante = new Postulantes();
        if ("".equals(sDip)) {
            postulante.setNombres(sNombre);
            lPstPersonas = parserPostulante(this.mi.getPstListarPersonasNombre(postulante)); 
        } else {
            postulante.setDip(sDip);
            lPstPersonas = parserPostulante(this.mi.getPstListarPersonasDip(postulante));
        }
        modelo.put("lPstPersonas", lPstPersonas);
        //Para wayka
        modelo.put("id_proceso", cliente.getString(request, "id_proceso"));
        modelo.put("titulo", cliente.getString(request, "titulo"));
        modelo.put("id_tramite", cliente.getString(request, "id_tramite"));

        return new ModelAndView("administrarProgramasEspecializadosLiberacion/administrarPostulantesLib/ListarPostulantes", modelo);
    }

    private List<PostulantesModel> parserPostulante(List<Postulantes> lPstPersonas) {
        List<PostulantesModel> model = new ArrayList<>();
        int i = 1;
        for (Postulantes p : lPstPersonas) {
            if (model.stream().filter(prop -> prop.getIdPersona().equals(p.getId_persona())).count() == 0) {
                PostulantesModel obj = new PostulantesModel();
                obj.setDip(p.getDip());
                obj.setNombreCompleto(p.getNombre_completo());
                obj.setNro(i);
                obj.setIdPersona(p.getId_persona());
                List<Postulantes> sublista = lPstPersonas.stream().filter(props -> props.getId_persona() == obj.getIdPersona()).collect(Collectors.toList());
                for (Postulantes pp : sublista) {
                    DetallePostulanteModel detalle = new DetallePostulanteModel();
                    detalle.setGestion(pp.getGestion());
                    detalle.setPeriodo(pp.getPeriodo());
                    detalle.setPrograma(pp.getPrograma());
                    detalle.setTipoAdmision(pp.getTipo_admision());
                    detalle.setIdEstado(pp.getId_estado());
                    obj.getDetalle().add(detalle);
                }
                model.add(obj);
                i++;
            }
        }
        return model;
    }
}
