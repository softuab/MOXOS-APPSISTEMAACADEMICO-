/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fautapo.Model;

/**
 *
 * @author FNZABALETAA
 */
public class DetallePostulanteModel {

    private String programa;
    private String tipoAdmision;
    private Integer gestion;
    private Integer periodo;
    private Integer idPostulante;
    private String idEstado;

    public Integer getIdPostulante() {
        return idPostulante;
    }

    public void setIdPostulante(Integer idPostulante) {
        this.idPostulante = idPostulante;
    }

    public String getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(String idEstado) {
        this.idEstado = idEstado;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getTipoAdmision() {
        return tipoAdmision;
    }

    public void setTipoAdmision(String tipoAdmision) {
        this.tipoAdmision = tipoAdmision;
    }

    public Integer getGestion() {
        return gestion;
    }

    public void setGestion(Integer gestion) {
        this.gestion = gestion;
    }

    public Integer getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

}
