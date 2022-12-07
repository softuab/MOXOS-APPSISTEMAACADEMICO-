package org.fautapo.domain;

import java.util.Date;
import org.fautapo.domain.Departamentos;

/**
 * @autor FAUTAPO
 * @fec_registro 2005-11-01
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2005-11-01
 */
public class Calendarios extends Departamentos {

    /* Private Fields */
    private int id_programa;
    private String tabla;
    private String fec_inicio;
    private String fec_fin;
    private int id_docente;
    private String tipo_evaluacion;
    private String programa;
    private String tipo_nota;
    private int nro_tipo_nota;
    private Date fecha_inicio;
    private Date fecha_limite;
    private Integer id_control_calendario_actividad;
    private String actividad;
    private String detalle;
    private Date fec_final;
    private Date fec_inicio_calendario;
    private String nro_resolucion; 

    public Date getFec_inicio_calendario() {
        return fec_inicio_calendario;
    }

    /* JavaBeans Properties */
    public void setFec_inicio_calendario(Date fec_inicio_calendario) {
        this.fec_inicio_calendario = fec_inicio_calendario;
    }

    public Integer getId_control_calendario_actividad() {
        return id_control_calendario_actividad;
    }

    public void setId_control_calendario_actividad(Integer id_control_calendario_actividad) {
        this.id_control_calendario_actividad = id_control_calendario_actividad;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Date getFec_final() {
        return fec_final;
    }

    public void setFec_final(Date fec_final) {
        this.fec_final = fec_final;
    }

    public String getNro_resolucion() {
        return nro_resolucion;
    }

    public void setNro_resolucion(String nro_resolucion) {
        this.nro_resolucion = nro_resolucion;
    }

    public int getId_docente() {
        return id_docente;
    }

    public void setId_docente(int id_docente) {
        this.id_docente = id_docente;
    }

    public String getTipo_evaluacion() {
        return tipo_evaluacion;
    }

    public void setTipo_evaluacion(String tipo_evaluacion) {
        this.tipo_evaluacion = tipo_evaluacion;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getTipo_nota() {
        return tipo_nota;
    }

    public void setTipo_nota(String tipo_nota) {
        this.tipo_nota = tipo_nota;
    }

    public int getNro_tipo_nota() {
        return nro_tipo_nota;
    }

    public void setNro_tipo_nota(int nro_tipo_nota) {
        this.nro_tipo_nota = nro_tipo_nota;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_limite() {
        return fecha_limite;
    }

    public void setFecha_limite(Date fecha_limite) {
        this.fecha_limite = fecha_limite;
    }

    public int getId_programa() {
        return id_programa;
    }

    public void setId_programa(int id_programa) {
        this.id_programa = id_programa;
    }

    public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }

    public String getFec_inicio() {
        return fec_inicio;
    }

    public void setFec_inicio(String fec_inicio) {
        this.fec_inicio = fec_inicio;
    }

    public String getFec_fin() {
        return fec_fin;
    }

    public void setFec_fin(String fec_fin) {
        this.fec_fin = fec_fin;
    }

}
