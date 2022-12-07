/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.fautapo.domain;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class ProgramasDesconcentrados {

    private Integer id_desconcentrado;
    private Integer id_programa;
    private String sede_desconcentrada;
    private String id_estado;
    private Date fec_registro;
    private Date fec_modificacion;
    private int ult_usuario;

    public Integer getId_desconcentrado() {
        return id_desconcentrado;
    }

    public void setId_desconcentrado(Integer id_desconcentrado) {
        this.id_desconcentrado = id_desconcentrado;
    }

    public Integer getId_programa() {
        return id_programa;
    }

    public void setId_programa(Integer id_programa) {
        this.id_programa = id_programa;
    }

    public String getSede_desconcentrada() {
        return sede_desconcentrada;
    }

    public void setSede_desconcentrada(String sede_desconcentrada) {
        this.sede_desconcentrada = sede_desconcentrada;
    }

    public String getId_estado() {
        return id_estado;
    }

    public void setId_estado(String id_estado) {
        this.id_estado = id_estado;
    }

    public Date getFec_registro() {
        return fec_registro;
    }

    public void setFec_registro(Date fec_registro) {
        this.fec_registro = fec_registro;
    }

    public Date getFec_modificacion() {
        return fec_modificacion;
    }

    public void setFec_modificacion(Date fec_modificacion) {
        this.fec_modificacion = fec_modificacion;
    }

    public int getUlt_usuario() {
        return ult_usuario;
    }

    public void setUlt_usuario(int ult_usuario) {
        this.ult_usuario = ult_usuario;
    }

}
