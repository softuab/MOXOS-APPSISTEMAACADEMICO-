package org.fautapo.dao.ibatis;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.fautapo.dao.EstudiantesDao;
import org.fautapo.domain.Estudiantes;
import org.fautapo.domain.Planes;
import org.fautapo.domain.Menciones;

public class SqlMapEstudiantesDao extends SqlMapClientDaoSupport implements EstudiantesDao {

    public int getMiEstListarCompromisosCant(Estudiantes estudiante) throws DataAccessException {
        Integer i = (Integer) getSqlMapClientTemplate().queryForObject("getMiEstListarCompromisosCant", estudiante);
        return i.intValue();
    }

    //CRCB  
    public Estudiantes getEstBuscarEstudiante(Estudiantes estudiante) throws DataAccessException {
        return (Estudiantes) getSqlMapClientTemplate().queryForObject("getEstBuscarEstudiante", estudiante);
    }

    public Estudiantes getEstBuscarEstudiantePrograma(Estudiantes estudiante) throws DataAccessException {
        return (Estudiantes) getSqlMapClientTemplate().queryForObject("getEstBuscarEstudiantePrograma", estudiante);
    }

    public Estudiantes getEstBuscarEstudianteAccesos(Estudiantes estudiante) throws DataAccessException {
        return (Estudiantes) getSqlMapClientTemplate().queryForObject("getEstBuscarEstudianteAccesos", estudiante);
    }

    public List getEstListarEstudiantesNombres(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getEstListarEstudiantesNombres", estudiante);
    }

    public List getEstListarEstudiantesDip(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getEstListarEstudiantesDip", estudiante);
    }

    public List getEstListarEstudiantesNombresAccesos(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getEstListarEstudiantesNombresAccesos", estudiante);
    }

    public List getEstListarEstudiantesDipAccesos(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getEstListarEstudiantesDipAccesos", estudiante);
    }

    public List getEstListarEstudiantesNombres2(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getEstListarEstudiantesNombres2", estudiante);
    }

    public List getEstListarEstudiantesDip2(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getEstListarEstudiantesDip2", estudiante);
    }

    //Programacion como estudiante
    public Estudiantes getComprobarEstudiante(Estudiantes estudiante) throws DataAccessException {
        return (Estudiantes) getSqlMapClientTemplate().queryForObject("getComprobarEstudiante", estudiante);
    }
    // Fin Programacion como estudiante

    // Cambiar Pin Estudiante
    public Estudiantes getMtrBuscarMatricula(Estudiantes estudiante) throws DataAccessException {
        return (Estudiantes) getSqlMapClientTemplate().queryForObject("getMtrBuscarMatricula", estudiante);
    }

    public Estudiantes getMtrBuscarMatriculaNuevo(Estudiantes estudiante) throws DataAccessException {
        return (Estudiantes) getSqlMapClientTemplate().queryForObject("getMtrBuscarMatriculaNuevo", estudiante);
    }

    public Estudiantes getEstBuscarEstudianteTipoGrado(Estudiantes estudiante) throws DataAccessException {
        return (Estudiantes) getSqlMapClientTemplate().queryForObject("getEstBuscarEstudianteTipoGrado", estudiante);
    }

    public int setMtrModificarPinEstudiante(Estudiantes estudiante) throws DataAccessException {
        Integer i = (Integer) getSqlMapClientTemplate().queryForObject("setMtrModificarPinEstudiante", estudiante);
        return i.intValue();
    }
    // Fin Cambiar Pin Estudiante  

    //Mostrar año de ingreso a la UAB
    public Estudiantes getListarIngresoUAB(Estudiantes estudiante) throws DataAccessException {
        return (Estudiantes) getSqlMapClientTemplate().queryForObject("getListarIngresoUAB", estudiante);
    }

    //FIN año de ingreso a la uab
    //Reg. Estudiante
    public int setRegistrarEstudiante(Estudiantes estudiante) throws DataAccessException {
        Integer i = (Integer) getSqlMapClientTemplate().queryForObject("setRegistrarEstudiante", estudiante);
        return i.intValue();
    }

    public int setModificarEstudiante(Estudiantes estudiante) throws DataAccessException {
        Integer i = (Integer) getSqlMapClientTemplate().queryForObject("setModificarEstudiante", estudiante);
        return i.intValue();
    }

    public Estudiantes getEstBuscarEstudiantePrs(Estudiantes estudiante) throws DataAccessException {
        return (Estudiantes) getSqlMapClientTemplate().queryForObject("getEstBuscarEstudiantePrs", estudiante);
    }

    public Estudiantes getEstBuscarEstudiantePrsSede(Estudiantes estudiante) throws DataAccessException {
        return (Estudiantes) getSqlMapClientTemplate().queryForObject("getEstBuscarEstudiantePrsSede", estudiante);
    }

    public Estudiantes getEstBuscarEstudiantePrsPos(Estudiantes estudiante) throws DataAccessException {
        return (Estudiantes) getSqlMapClientTemplate().queryForObject("getEstBuscarEstudiantePrsPos", estudiante);
    }

    public Estudiantes getEstBuscarEstudiantePrsPre(Estudiantes estudiante) throws DataAccessException {
        return (Estudiantes) getSqlMapClientTemplate().queryForObject("getEstBuscarEstudiantePrsPre", estudiante);
    }

    public Estudiantes getEstBuscarEstudiantePrsPreSede(Estudiantes estudiante) throws DataAccessException {
        return (Estudiantes) getSqlMapClientTemplate().queryForObject("getEstBuscarEstudiantePrsPreSede", estudiante);
    }

    public int setRegistrarMatriculaEstudiante(Estudiantes estudiante) throws DataAccessException {
        Integer i = (Integer) getSqlMapClientTemplate().queryForObject("setRegistrarMatriculaEstudiante", estudiante);
        return i.intValue();
    }

    public Estudiantes getBuscarMatriculaEstPrs(Estudiantes estudiante) throws DataAccessException {
        return (Estudiantes) getSqlMapClientTemplate().queryForObject("getBuscarMatriculaEstPrs", estudiante);
    }

    //Fin Reg. Estudiante
    //INICIO - Ver Ficha Academica
    public Estudiantes getEstBuscarEstudianteNombres(Estudiantes estudiante) throws DataAccessException {
        return (Estudiantes) getSqlMapClientTemplate().queryForObject("getEstBuscarEstudianteNombres", estudiante);
    }

    public Estudiantes getEstBuscarEstudianteNombresSede(Estudiantes estudiante) throws DataAccessException {
        return (Estudiantes) getSqlMapClientTemplate().queryForObject("getEstBuscarEstudianteNombresSede", estudiante);
    }

    public Estudiantes getEstBuscarEstudianteNombresSedePostgrado(Estudiantes estudiante) throws DataAccessException {
        return (Estudiantes) getSqlMapClientTemplate().queryForObject("getEstBuscarEstudianteNombresSedePostgrado", estudiante);
    }

    public List getEstListarFichaAcademica(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getEstListarFichaAcademica", estudiante);
    }

    public List getEstListarFichaAcademicaModificar(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getEstListarFichaAcademicaModificar", estudiante);
    }

    public List getEstListarFichaAcademicaConvalidada(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getEstListarFichaAcademicaConvalidada", estudiante);
    }

    public List getEstListarFichaAcademicaConvalidada2(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getEstListarFichaAcademicaConvalidada2", estudiante);
    }

    public List getEstListarFichaAcademicaAprobadas(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getEstListarFichaAcademicaAprobadas", estudiante);
    }
    //FIN - Ver Ficha Academica

    //INICIO - Ver Programacion
    public List getEstListarProgramacion(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getEstListarProgramacion", estudiante);
    }

    public List getEstListarProgramacioncv(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getEstListarProgramacioncv", estudiante);
    }

    //FIN - Ver Programacion
    // INICIO - Cambio de Plan
    public int setEstRegistrarCambioPlan(Planes plan) throws DataAccessException {
        return ((Integer) getSqlMapClientTemplate().queryForObject("setEstRegistrarCambioPlan", plan)).intValue();
    }
    // FIN - Cambio de Plan

    //INICIO - Materias no aprobadas
    public List getEstListarMateriasNoAprobadas(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getEstListarMateriasNoAprobadas", estudiante);
    }
    //FIN - Materias no aprobadas 

    //Mi Matricula Antiguo
    public List getMtrListarMatriculasEstudiante(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getMtrListarMatriculasEstudiante", estudiante);
    }

    //Fin Mi Matricula
    //Cambio de estado
    public int setRegistrarCambiarEstadoEstudiante(Estudiantes estudiante) throws DataAccessException {
        Integer i = (Integer) getSqlMapClientTemplate().queryForObject("setRegistrarCambiarEstadoEstudiante", estudiante);
        return i.intValue();
    }

    public int setRegistrarCambiarEstadoMatricula(Estudiantes estudiante) throws DataAccessException {
        Integer i = (Integer) getSqlMapClientTemplate().queryForObject("setRegistrarCambiarEstadoMatricula", estudiante);
        return i.intValue();
    }
    //Fin Cambio de estado

    //Adjuntos Est
    public int setRegistrarEstAdjuntos(Estudiantes estudiante) throws DataAccessException {
        return ((Integer) getSqlMapClientTemplate().queryForObject("setRegistrarEstAdjuntos", estudiante)).intValue();
    }

    public List getListarAdjuntosEstudiante(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getListarAdjuntosEstudiante", estudiante);
    }

    public int setEliminarEstAdjunto(Estudiantes estudiante) throws DataAccessException {
        return ((Integer) getSqlMapClientTemplate().queryForObject("setEliminarEstAdjunto", estudiante)).intValue();
    }

    //Inicio estadisticas
    public List getListarNroEstudiantesMatriculados(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getListarNroEstudiantesMatriculados", estudiante);
    }

    public List getListarNroEstMatriculadosSexosNacionalidades(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getListarNroEstMatriculadosSexosNacionalidades", estudiante);
    }

    public List getListarNroEstMatriculadosTipoEstudiante(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getListarNroEstMatriculadosTipoEstudiante", estudiante);
    }

    public List getListarNroEstMatriculadosTipoAdmision(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getListarNroEstMatriculadosTipoAdmision", estudiante);
    }

    public List getListarNroEstMatriculadosSexos(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getListarNroEstMatriculadosSexos", estudiante);
    }

    public List getListarNroEstMatriculadosNacionalidad(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getListarNroEstMatriculadosNacionalidad", estudiante);
    }

    public List getListarNroEstProgramadosMaterias(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getListarNroEstProgramadosMaterias", estudiante);
    }

    public List getListarNroEstProgramadosSexosNacionalidades(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getListarNroEstProgramadosSexosNacionalidades", estudiante);
    }

    public List getListarNroPostProgramadosMaterias(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getListarNroPostProgramadosMaterias", estudiante);
    }

    public List getListarNroEstProgAprReprAbaMaterias(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getListarNroEstProgAprReprAbaMaterias", estudiante);
    }

    public List getListarNroEstAproPreU(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getListarNroEstAproPreU", estudiante);
    }

    public List getListarNroEstAproAdmiEsp(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getListarNroEstAproAdmiEsp", estudiante);
    }

    public List getListarNroEstAproPreUSexosNacionalidad(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getListarNroEstAproPreUSexosNacionalidad", estudiante);
    }

    public List getListarNroEstAproAdEspSexosNacionalidad(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getListarNroEstAproAdEspSexosNacionalidad", estudiante);
    }
    //Fin Estadisticas

    //listar datos programacion Edgar
    public List getEstListarDetalleProgramacion(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getEstListarDetalleProgramacion", estudiante);
    }
    //Fin listar Datos programacion Edgar

    //Estudiantes por grupos
    public List getEstListarEstudiantesPorGrupos(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getEstListarEstudiantesPorGrupos", estudiante);
    }
    //Fin Estudiantes por grupos

    //Bloquear estudiantes todos
    public int setBloquearEstudiantesTodos(Estudiantes estudiante) throws DataAccessException {
        Integer i = (Integer) getSqlMapClientTemplate().queryForObject("setBloquearEstudiantesTodos", estudiante);
        return i.intValue();
    }
    //Fin Bloquear estudiantes todos

    //Modificar tipo_estudiante
    public int setModificarTipoEstudiante(Estudiantes estudiante) throws DataAccessException {
        Integer i = (Integer) getSqlMapClientTemplate().queryForObject("setModificarTipoEstudiante", estudiante);
        return i.intValue();
    }
    //Fin Modificar Tipo Estudiante

    public List getMiEstListarCompromisos(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getMiEstListarCompromisos", estudiante);
    }

    //Registrar est_programacion
    public int setRegistrarEstProgramacionTipo(Estudiantes estudiante) throws DataAccessException {
        Integer i = (Integer) getSqlMapClientTemplate().queryForObject("setRegistrarEstProgramacionTipo", estudiante);
        return i.intValue();
    }

    public Estudiantes getMiPrsBuscarEstudiante(Estudiantes estudiante) throws DataAccessException {
        return (Estudiantes) getSqlMapClientTemplate().queryForObject("getMiPrsBuscarEstudiante", estudiante);
    }

    // inicio JOJO
    public List getTrnListarMateriasVerano(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getTrnListarMateriasVerano", estudiante);
    }
    // fin JOJO

    public List getEstListarProgramasEstudiante(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getEstListarProgramasEstudiante", estudiante);
    }

    public List getEstListarMatriculadosPorPrograma(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getEstListarMatriculadosPorPrograma", estudiante);
    }

    public List getEstListarMatriculadosPorProgramaTipoAdmision(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getEstListarMatriculadosPorProgramaTipoAdmision", estudiante);
    }

    //Buscar est_programacion
    public Estudiantes getMiBuscarEstProgramacion(Estudiantes estudiante) throws DataAccessException {
        return (Estudiantes) getSqlMapClientTemplate().queryForObject("getMiBuscarEstProgramacion", estudiante);
    }

    public List getEstListarMatriculadosPorProgramaTipoEstudiante(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getEstListarMatriculadosPorProgramaTipoEstudiante", estudiante);
    }

    //Buscar tipos Admisiones
    public Estudiantes getBuscarTipoAdmision(Estudiantes estudiante) throws DataAccessException {
        return (Estudiantes) getSqlMapClientTemplate().queryForObject("getBuscarTipoAdmision", estudiante);
    }

    //est_clasificaciones
    public Estudiantes getBuscarTipoClasificacionEstudiante(Estudiantes estudiante) throws DataAccessException {
        return (Estudiantes) getSqlMapClientTemplate().queryForObject("getBuscarTipoClasificacionEstudiante", estudiante);
    }

    public int setRegistrarEstClasificacion(Estudiantes estudiante) throws DataAccessException {
        Integer i = (Integer) getSqlMapClientTemplate().queryForObject("setRegistrarEstClasificacion", estudiante);
        return i.intValue();
    }

    //Est_regularizaciones
    public Estudiantes getMiBuscarUltimoEstRegularizacion(Estudiantes estudiante) throws DataAccessException {
        return (Estudiantes) getSqlMapClientTemplate().queryForObject("getMiBuscarUltimoEstRegularizacion", estudiante);
    }

    public Estudiantes getMiBuscarEstRegularizacion(Estudiantes estudiante) throws DataAccessException {
        return (Estudiantes) getSqlMapClientTemplate().queryForObject("getMiBuscarEstRegularizacion", estudiante);
    }

    public List getMiListarRegularizacionesEstudiante(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getMiListarRegularizacionesEstudiante", estudiante);
    }

    public int setRegistrarEstRegularizacionBloqueoEst(Estudiantes estudiante) throws DataAccessException {
        Integer i = (Integer) getSqlMapClientTemplate().queryForObject("setRegistrarEstRegularizacionBloqueoEst", estudiante);
        return i.intValue();
    }

    public int setModificarRegularizar(Estudiantes estudiante) throws DataAccessException {
        Integer i = (Integer) getSqlMapClientTemplate().queryForObject("setModificarRegularizar", estudiante);
        return i.intValue();
    }

    public List getMiListarTiposRegularizaciones() throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getMiListarTiposRegularizaciones", null);
    }
    //Fin Est_regularizaciones

    public Menciones getEstBuscarMencion(Estudiantes estudiante) throws DataAccessException {
        return (Menciones) getSqlMapClientTemplate().queryForObject("getEstBuscarMencion", estudiante);
    }

    // Inicio Est Deudas
    public List getListarDeudasEstudiante(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getListarDeudasEstudiante", estudiante);
    }

    public Estudiantes getMiBuscarEstDeuda(Estudiantes estudiante) throws DataAccessException {
        return (Estudiantes) getSqlMapClientTemplate().queryForObject("getMiBuscarEstDeuda", estudiante);
    }

    public Estudiantes getBuscarUltimaEstDeuda(Estudiantes estudiante) throws DataAccessException {
        return (Estudiantes) getSqlMapClientTemplate().queryForObject("getBuscarUltimaEstDeuda", estudiante);
    }

    public int setRegistrarEstDeuda(Estudiantes estudiante) throws DataAccessException {
        Integer i = (Integer) getSqlMapClientTemplate().queryForObject("setRegistrarEstDeuda", estudiante);
        return i.intValue();
    }

    public int setModificarEstDeuda(Estudiantes estudiante) throws DataAccessException {
        Integer i = (Integer) getSqlMapClientTemplate().queryForObject("setModificarEstDeuda", estudiante);
        return i.intValue();
    }

    public List getMiListarTiposDeudas() throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getMiListarTiposDeudas", null);
    }
    //Fin est_deudas

    // Cambiar PIM Estudiante General
    public int setMtrModificarApodoClaveEstudiante(Estudiantes estudiante) throws DataAccessException {
        Integer i = (Integer) getSqlMapClientTemplate().queryForObject("setMtrModificarApodoClaveEstudiante", estudiante);
        return i.intValue();
    }

    public int setRegistrarApodoClaveMatricula(Estudiantes estudiante) throws DataAccessException {
        Integer i = (Integer) getSqlMapClientTemplate().queryForObject("setRegistrarApodoClaveMatricula", estudiante);
        return i.intValue();
    }

    //Fin Cambiar PIN Estudiante General
//INICIO - METODOS ADICIONADOS POR LA UAP
    // Listado de Estudiantes Con Descuentos
    public List getEstListarPorProgramaTipoDescuento(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getEstListarPorProgramaTipoDescuento", estudiante);
    }
    // Listado de Estudiante Con Prorroga

    public List getListarEstConProrroga(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getListarEstConProrroga", estudiante);
    }

    public List getRendimientoAcademico(Estudiantes promedio) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getRendimientoAcademico", promedio);
    }

    public Estudiantes getDesignacionBecaTrabajo(Estudiantes becario) throws DataAccessException {
        return (Estudiantes) getSqlMapClientTemplate().queryForObject("getDesignacionBecaTrabajo", becario);
    }

    // Listado de Becarios 
    public List getListarEstBecasTrabajo(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getListarEstBecasTrabajo", estudiante);
    }

    // Listado de Becarios por Unidad Funcional
    public List getListarEstBecasTrabajoFuncional(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getListarEstBecasTrabajoFuncional", estudiante);
    }

    // Listado de Estudiantes por Nivel Academico
    public List getListarNiveles(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getListarNiveles", estudiante);
    }

    // Listado de Claves de Estudiantes por Programas
    public List getListarClavesEstPorPrograma(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getListarClavesEstPorPrograma", estudiante);
    }

    // Listado de Curso de Preparatoria de Ingles Estudiantes
    public List getListarCursoPreIngles(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getListarCursoPreIngles", estudiante);
    }

    //Admision Auxiliares de Docencia
    public Estudiantes getEstBuscarEstudianteNombresMatriculados(Estudiantes estudiante) throws DataAccessException {
        return (Estudiantes) getSqlMapClientTemplate().queryForObject("getEstBuscarEstudianteNombresMatriculados", estudiante);
    }

    public Estudiantes getEstBuscarEstudianteAdmitidoAuxiliar(Estudiantes estudiante) throws DataAccessException {
        return (Estudiantes) getSqlMapClientTemplate().queryForObject("getEstBuscarEstudianteAdmitidoAuxiliar", estudiante);
    }

    public int setRegistrarAdmisionEstudianteAuxiliar(Estudiantes estudiante) throws DataAccessException {
        Integer i = (Integer) getSqlMapClientTemplate().queryForObject("setRegistrarAdmisionEstudianteAuxiliar", estudiante);
        return i.intValue();
    }

    public int setEliminarAdmisionEstudianteAuxiliar(Estudiantes estudiante) throws DataAccessException {
        Integer i = (Integer) getSqlMapClientTemplate().queryForObject("setEliminarAdmisionEstudianteAuxiliar", estudiante);
        return i.intValue();
    }

    public List getBuscarEstudianteAuxiliar(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getBuscarEstudianteAuxiliar", estudiante);
    }

    public List getBuscarEstudianteAuxiliarTodas(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getBuscarEstudianteAuxiliarTodas", estudiante);
    }

    // REPORTES DE ESTUDIANTES DOCENCIA POR PROGRAMA
    public List getListarEstudiantesAuxiliaresPorPrograma(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getListarEstudiantesAuxiliaresPorPrograma", estudiante);
    }

    public List getBuscarEstudiantesAuxiliaresPorPrograma(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getBuscarEstudiantesAuxiliaresPorPrograma", estudiante);
    }

    //TARJETAS MAGNETICAS
    public List getBuscarEstudiantePersona(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getBuscarEstudiantePersona", estudiante);
    }

    // Listado de Curso Varios Extracurricular en la UAP
    public List getListarCursoPsicoEst(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getListarCursoPsicoEst", estudiante);
    }

    public List getListarCursoSemioEst(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getListarCursoSemioEst", estudiante);
    }

    public List getlistarMiembrosT(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getlistarMiembrosT", estudiante);
    }
    //Reg. CODE

    public List getListarCertGen(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getListarCertGen", estudiante);
    }

    public List getListarCertGenAnulados(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getListarCertGenAnulados", estudiante);
    }

    public List getListarCertGenEmitidos(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getListarCertGenEmitidos", estudiante);
    }

    public List getListarNotasCertificados(Estudiantes estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getListarNotasCertificados", estudiante);
    }

    public int setRegistrarCerGen(Estudiantes estudiante) throws DataAccessException {
        Integer i = (Integer) getSqlMapClientTemplate().queryForObject("setRegistrarCerGen", estudiante);
        return i.intValue();
    }

    public int getBuscarMaxCertSede(Estudiantes estudiante) throws DataAccessException {
        Integer i = (Integer) getSqlMapClientTemplate().queryForObject("getBuscarMaxCertSede", estudiante);
        return i.intValue();
    }

    public int setRegistrarCerGenNotas(Estudiantes estudiante) throws DataAccessException {
        Integer i = (Integer) getSqlMapClientTemplate().queryForObject("setRegistrarCerGenNotas", estudiante);
        return i.intValue();
    }

    public void setEliminarCertificadoNotas(Estudiantes estudiante) throws DataAccessException {
        getSqlMapClientTemplate().queryForObject("setEliminarCertificadoNotas", estudiante);
    }

    public int getbuscarnrotransacciones(Estudiantes estudiante) throws DataAccessException {
        Integer i = (Integer) getSqlMapClientTemplate().queryForObject("getbuscarnrotransacciones", estudiante);
        return i.intValue();
    }

    public int getbuscarnrocertificado(Estudiantes estudiante) throws DataAccessException {
        Integer i = (Integer) getSqlMapClientTemplate().queryForObject("getbuscarnrocertificado", estudiante);
        return i.intValue();
    }

    public int getcert_buscar_nro_certificado_gestioncode(Estudiantes estudiante) throws DataAccessException {
        Integer i = (Integer) getSqlMapClientTemplate().queryForObject("getcert_buscar_nro_certificado_gestioncode", estudiante);
        return i.intValue();
    }
//FIN - METODOS ADICIONADOS POR LA UAP

    //ESTUDIANTES PROGRAMAS SEDE
    @Override
    public Estudiantes getListarEstudiantesProgramasSede(Estudiantes estudiante) throws DataAccessException {
        return (Estudiantes) getSqlMapClientTemplate().queryForObject("getListarEstudiantesProgramasSede", estudiante);
    }

    @Override
    public List getListarFclProgramasDescocentrado(int id_programa) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getListarFclProgramasDescocentrado", id_programa);
    }

    public int setRegistrarEstudiantes_programas_sede(Estudiantes estudiante) throws DataAccessException {
        Integer i = (Integer) getSqlMapClientTemplate().queryForObject("setRegistrarEstudiantes_programas_sede", estudiante);
        return i.intValue();
    }

    @Override
    public Estudiantes getDetalleEstudiantesProgramaSede(int id_estudiante_programa_sede) throws DataAccessException {
        return (Estudiantes) getSqlMapClientTemplate().queryForObject("getDetalleEstudiantesProgramaSede", id_estudiante_programa_sede);
    }

    @Override
    public int setModificarProgramaDesconcentrado(Estudiantes estudiantes) throws DataAccessException {
        Integer i = (Integer) getSqlMapClientTemplate().queryForObject("setModificarProgramaDesconcentrado", estudiantes);
        return i.intValue();
    }

    @Override
    public int setEliminarProgramaDesconcentrado(Estudiantes estudiantes) throws DataAccessException {
        Integer i = (Integer) getSqlMapClientTemplate().queryForObject("setEliminarProgramaDesconcentrado", estudiantes);
        return i.intValue();
    }

    @Override
    public List getVerProgramasFaseDesconcentrado(int id_estudiante) throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getVerProgramasFaseDesconcentrado", id_estudiante);
    }

    @Override
    public Estudiantes getMostraSedeDesconcentrada(int id_desconcentrado) throws DataAccessException {
        return (Estudiantes) getSqlMapClientTemplate().queryForObject("getMostraSedeDesconcentrada", id_desconcentrado);
    }

    @Override
    public int setActualizarIdDesconcentradoEstudiantes(Estudiantes estudiantes) throws DataAccessException {
        Integer i = (Integer) getSqlMapClientTemplate().queryForObject("setActualizarIdDesconcentradoEstudiantes", estudiantes);
        return i.intValue();
    }

    @Override
    public Estudiantes getDatosImpresionAfp(int id_estudiante) throws DataAccessException {
        return (Estudiantes) getSqlMapClientTemplate().queryForObject("getDatosImpresionAfp", id_estudiante);
    }

    @Override
    public void RegistrarCsmbioAulaProgramacion(Estudiantes estudiantes) throws DataAccessException {
        getSqlMapClientTemplate().update("RegistrarCsmbioAulaProgramacion", estudiantes);
    }
}
