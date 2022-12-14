package org.fautapo.domain;

import org.fautapo.domain.Planes;

/**
 * @autor FAUTAPO
 * @fec_registro 2005-11-01
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2005-11-01
 */
public class Notas extends Menciones {

    /* Private Fields */
    private int gestion;
    private int periodo;
    private String id_estado;
    private int nota;
    private String nro_resolucion;
    private int id_docente;
    private int id_matricula;
    private int id_materia;
    private int id_grupo;
    private String nombres;
    private int id_nota;
    private int id_departamento;
    private int id_fase;
    private int id_asignacion;
    private int id_convalidacion;
    private String folio;
    private String libro;
    private String observacion;
    private boolean rectificado;
    private String literal;
    private int hrs_periodo;
    private String tipo_evaluacion;
    private int id_tipo_materia;
    private String nombre_completo;
    private int sumMaterias;
    private int cantidad;
    private double promedionota;
    private int id_estudiante;
    private int anios;
    private int total_anios;
    private int cantidadreprobado;

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public int getTotal_anios() {
        return total_anios;
    }

    public void setTotal_anios(int total_anios) {
        this.total_anios = total_anios;
    }

    public int getCantidadreprobado() {
        return cantidadreprobado;
    }

    public void setCantidadreprobado(int cantidadreprobado) {
        this.cantidadreprobado = cantidadreprobado;
    }

    public int getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(int id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public int getSumMaterias() {
        return sumMaterias;
    }

    public void setSumMaterias(int sumMaterias) {
        this.sumMaterias = sumMaterias;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPromedionota() {
        return promedionota;
    }

    public void setPromedionota(double promedionota) {
        this.promedionota = promedionota;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    /* JavaBeans Properties */
    public int getGestion() {
        return gestion;
    }

    public void setGestion(int gestion) {
        this.gestion = gestion;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String getId_estado() {
        return id_estado;
    }

    public void setId_estado(String id_estado) {
        this.id_estado = id_estado;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
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

    public int getId_matricula() {
        return id_matricula;
    }

    public void setId_matricula(int id_matricula) {
        this.id_matricula = id_matricula;
    }

    public int getId_materia() {
        return id_materia;
    }

    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
    }

    public int getId_grupo() {
        return id_grupo;
    }

    public void setId_grupo(int id_grupo) {
        this.id_grupo = id_grupo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getId_nota() {
        return id_nota;
    }

    public void setId_nota(int id_nota) {
        this.id_nota = id_nota;
    }

    public int getId_departamento() {
        return id_departamento;
    }

    public void setId_departamento(int id_departamento) {
        this.id_departamento = id_departamento;
    }

    public int getId_fase() {
        return id_fase;
    }

    public void setId_fase(int id_fase) {
        this.id_fase = id_fase;
    }

    public int getId_asignacion() {
        return this.id_asignacion;
    }

    public void setId_asignacion(int id_asignacion) {
        this.id_asignacion = id_asignacion;
    }

    public int getId_convalidacion() {
        return this.id_convalidacion;
    }

    public void setId_convalidacion(int id_convalidacion) {
        this.id_convalidacion = id_convalidacion;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public boolean getRectificado() {
        return rectificado;
    }

    public void setRectificado(boolean rectificado) {
        this.rectificado = rectificado;
    }

    public String getLiteral() {
        return this.literal;
    }

    public void setLiteral(String literal) {
        this.literal = literal;
    }

    public int getHrs_periodo() {
        return this.hrs_periodo;
    }

    public void setHrs_periodo(int hrs_periodo) {
        this.hrs_periodo = hrs_periodo;
    }

    public String getTipo_evaluacion() {
        return this.tipo_evaluacion;
    }

    public void setTipo_evaluacion(String tipo_evaluacion) {
        this.tipo_evaluacion = tipo_evaluacion;
    }

    public int getId_tipo_materia() {
        return id_tipo_materia;
    }

    public void setId_tipo_materia(int id_tipo_materia) {
        this.id_tipo_materia = id_tipo_materia;
    }
}
