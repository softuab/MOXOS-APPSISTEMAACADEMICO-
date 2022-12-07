/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fautapo.Model;

import java.util.ArrayList;
import java.util.List;

public class PostulantesModel {

    public PostulantesModel() {
        detalle = new ArrayList<>();
    }
    private Integer idPersona;
    private Integer nro;
    private String dip;
    private String nombreCompleto;
    private List<DetallePostulanteModel> detalle;

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public Integer getNro() {
        return nro;
    }

    public void setNro(Integer nro) {
        this.nro = nro;
    }

    public List<DetallePostulanteModel> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<DetallePostulanteModel> detalle) {
        this.detalle = detalle;
    }

    public String getDip() {
        return dip;
    }

    public void setDip(String dip) {
        this.dip = dip;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

}
