package org.fautapo.domain.logic;

import java.util.List;

import org.fautapo.dao.AbmDao;
import org.fautapo.dao.ClientesDao;
import org.fautapo.dao.UsuariosDao;
import org.fautapo.dao.RolesDao;
import org.fautapo.dao.CategoriasDao;
import org.fautapo.dao.EnlacesDao;
import org.fautapo.dao.HerramientasDao;
import org.fautapo.dao.ActividadesDao;
import org.fautapo.dao.DominiosDao;
import org.fautapo.dao.CamposDao;
import org.fautapo.dao.InformesDao;
import org.fautapo.dao.GwDao;
import org.fautapo.dao.TramitesDao;
import org.fautapo.dao.PersonasDao;
import org.fautapo.dao.ProveidosDao;
import org.fautapo.dao.AdjuntosDao;
import org.fautapo.dao.TablerosDao;
import org.fautapo.dao.HilosDao;
import org.fautapo.dao.DibwaykaDao;
import org.fautapo.dao.HorariosDao;  //MICOIMATA
import org.fautapo.dao.PlanesDao;
import org.fautapo.dao.ProgramasDao;
import org.fautapo.dao.DepartamentosDao;
import org.fautapo.dao.FacultadesDao;
import org.fautapo.dao.UniversidadesDao;
import org.fautapo.dao.NotasDao;
import org.fautapo.dao.MateriasDao;
import org.fautapo.dao.LibretasDao;
import org.fautapo.dao.AsignacionesDao;
import org.fautapo.dao.DocentesDao;
import org.fautapo.dao.EstudiantesDao;
import org.fautapo.dao.GruposDao;
import org.fautapo.dao.PostulantesDao;
import org.fautapo.dao.PerfilesDao;
import org.fautapo.dao.CurriculumDao;
import org.fautapo.dao.CalendariosDao;
import org.fautapo.dao.ProgramasDesconcetradosDao;

import org.fautapo.domain.Abm;
import org.fautapo.domain.Clientes;
import org.fautapo.domain.Usuarios;
import org.fautapo.domain.Roles;
import org.fautapo.domain.Categorias;
import org.fautapo.domain.Enlaces;
import org.fautapo.domain.Instituciones;
import org.fautapo.domain.Herramientas;
import org.fautapo.domain.Actividades;
import org.fautapo.domain.Dominios;
import org.fautapo.domain.Campos;
import org.fautapo.domain.Informes;
import org.fautapo.domain.Tramites;
import org.fautapo.domain.Personas;
import org.fautapo.domain.Proveidos;
import org.fautapo.domain.Adjuntos;
import org.fautapo.domain.Tableros;
import org.fautapo.domain.Hilos;
import org.fautapo.domain.Dibwayka;
import org.fautapo.domain.Horarios;  //MICOIMATA
import org.fautapo.domain.Planes;
import org.fautapo.domain.Programas;
import org.fautapo.domain.Departamentos;
import org.fautapo.domain.Facultades;
import org.fautapo.domain.Universidades;
import org.fautapo.domain.Notas;
import org.fautapo.domain.Materias;
import org.fautapo.domain.Libretas;
import org.fautapo.domain.Asignaciones;
import org.fautapo.domain.Docentes;
import org.fautapo.domain.Estudiantes;
import org.fautapo.domain.Grupos;
import org.fautapo.domain.Postulantes;
import org.fautapo.domain.Modelos_ahorros;
import org.fautapo.domain.Perfiles;
import org.fautapo.domain.Curriculum;
import org.fautapo.domain.Menciones;
import org.fautapo.domain.Calendarios;
import org.fautapo.domain.ProgramasDesconcentrados;

/**
 * @autor FAUTAPO
 * @fec_registro 2005-11-01
 * @ult_usuario FAUTAPO
 * @fec_modificacion 2006-04-03
 */
public class MiImpl implements MiFacade {

    private AbmDao abmDao;
    private ClientesDao clientesDao;
    private UsuariosDao usuariosDao;
    private RolesDao rolesDao;
    private CategoriasDao categoriasDao;
    private EnlacesDao enlacesDao;
    private HerramientasDao herramientasDao;
    private ActividadesDao actividadesDao;
    private DominiosDao dominiosDao;
    private CamposDao camposDao;
    private InformesDao informesDao;
    private GwDao gwDao;
    private TramitesDao tramitesDao;
    private PersonasDao personasDao;
    private ProveidosDao proveidosDao;
    private AdjuntosDao adjuntosDao;
    private TablerosDao tablerosDao;
    private HilosDao hilosDao;
    private DibwaykaDao dibwaykaDao;
    private HorariosDao horariosDao; //MICOIMATA
    private PlanesDao planesDao;
    private ProgramasDao programasDao;
    private DepartamentosDao departamentosDao;
    private FacultadesDao facultadesDao;
    private UniversidadesDao universidadesDao;
    private NotasDao notasDao;
    private MateriasDao materiasDao;
    private LibretasDao libretasDao;
    private AsignacionesDao asignacionesDao;
    private DocentesDao docentesDao;
    private EstudiantesDao estudiantesDao;
    private GruposDao gruposDao;
    private PostulantesDao postulantesDao;
    private PerfilesDao perfilesDao;
    private CurriculumDao curriculumDao;
    private CalendariosDao calendariosDao;
    private ProgramasDesconcetradosDao programadesconcentradoDao;
    //------------------ Clases DAO ---------------
    //ABM

    public void setProgramadesconcentradoDao(ProgramasDesconcetradosDao programadesconcentradoDao) {
        this.programadesconcentradoDao = programadesconcentradoDao;
    }

    public void setAbmDao(AbmDao abmDao) {
        this.abmDao = abmDao;
    }
    //CLIENTES

    public void setClientesDao(ClientesDao clientesDao) {
        this.clientesDao = clientesDao;
    }
    //USUARIOS

    public void setUsuariosDao(UsuariosDao usuariosDao) {
        this.usuariosDao = usuariosDao;
    }
    //ROLES

    public void setRolesDao(RolesDao rolesDao) {
        this.rolesDao = rolesDao;
    }
    //CATEGORIAS

    public void setCategoriasDao(CategoriasDao categoriasDao) {
        this.categoriasDao = categoriasDao;
    }
    //ENLACES

    public void setEnlacesDao(EnlacesDao enlacesDao) {
        this.enlacesDao = enlacesDao;
    }
    // HERRAMIENTAS

    public void setHerramientasDao(HerramientasDao herramientasDao) {
        this.herramientasDao = herramientasDao;
    }
    //ACTIVIDADES

    public void setActividadesDao(ActividadesDao actividadesDao) {
        this.actividadesDao = actividadesDao;
    }
    //DOMINIOS

    public void setDominiosDao(DominiosDao dominiosDao) {
        this.dominiosDao = dominiosDao;
    }
    //CAMPOS

    public void setCamposDao(CamposDao camposDao) {
        this.camposDao = camposDao;
    }
    //INFORMES

    public void setInformesDao(InformesDao informesDao) {
        this.informesDao = informesDao;
    }
    //GW

    public void setGwDao(GwDao gwDao) {
        this.gwDao = gwDao;
    }
    //TRAMITES

    public void setTramitesDao(TramitesDao tramitesDao) {
        this.tramitesDao = tramitesDao;
    }
    //PERSONAS

    public void setPersonasDao(PersonasDao personasDao) {
        this.personasDao = personasDao;
    }
    //PROVEIDOS

    public void setProveidosDao(ProveidosDao proveidosDao) {
        this.proveidosDao = proveidosDao;
    }
    //ADJUNTOS

    public void setAdjuntosDao(AdjuntosDao adjuntosDao) {
        this.adjuntosDao = adjuntosDao;
    }
    //TABLEROS

    public void setTablerosDao(TablerosDao tablerosDao) {
        this.tablerosDao = tablerosDao;
    }
    //HILOS

    public void setHilosDao(HilosDao hilosDao) {
        this.hilosDao = hilosDao;
    }
    //DIBWAYKA

    public void setDibwaykaDao(DibwaykaDao dibwaykaDao) {
        this.dibwaykaDao = dibwaykaDao;
    }
    //MICOIMATA
    // PLANES

    public void setPlanesDao(PlanesDao planesDao) {
        this.planesDao = planesDao;
    }
    // PROGRAMAS

    public void setProgramasDao(ProgramasDao programasDao) {
        this.programasDao = programasDao;
    }
    // DEPARTAMENTOS

    public void setDepartamentosDao(DepartamentosDao departamentosDao) {
        this.departamentosDao = departamentosDao;
    }
    // FACULTADES

    public void setFacultadesDao(FacultadesDao facultadesDao) {
        this.facultadesDao = facultadesDao;
    }
    // UNIVERSIDADES

    public void setUniversidadesDao(UniversidadesDao universidadesDao) {
        this.universidadesDao = universidadesDao;
    }
    // HORARIOS

    public void setHorariosDao(HorariosDao horariosDao) {
        this.horariosDao = horariosDao;
    }
    // NOTAS

    public void setNotasDao(NotasDao notasDao) {
        this.notasDao = notasDao;
    }
    // MATERIAS

    public void setMateriasDao(MateriasDao materiasDao) {
        this.materiasDao = materiasDao;
    }
    // LIBRETAS

    public void setLibretasDao(LibretasDao libretasDao) {
        this.libretasDao = libretasDao;
    }
    // ASIGNACIONES

    public void setAsignacionesDao(AsignacionesDao asignacionesDao) {
        this.asignacionesDao = asignacionesDao;
    }
    // DOCENTES

    public void setDocentesDao(DocentesDao docentesDao) {
        this.docentesDao = docentesDao;
    }
    // ESTUDIANTES

    public void setEstudiantesDao(EstudiantesDao estudiantesDao) {
        this.estudiantesDao = estudiantesDao;
    }
    // GRUPOS

    public void setGruposDao(GruposDao gruposDao) {
        this.gruposDao = gruposDao;
    }
    // POSTULANTES

    public void setPostulantesDao(PostulantesDao postulantesDao) {
        this.postulantesDao = postulantesDao;
    }
    // PERFILES

    public void setPerfilesDao(PerfilesDao perfilesDao) {
        this.perfilesDao = perfilesDao;
    }
    // CURRICULUM

    public void setCurriculumDao(CurriculumDao curriculumDao) {
        this.curriculumDao = curriculumDao;
    }
    // CALENDARIOS

    public void setCalendariosDao(CalendariosDao calendariosDao) {
        this.calendariosDao = calendariosDao;
    }

//-------------------------------------------------------------------------
// Operation methods, implementing the MiFacade interface
//-------------------------------------------------------------------------
    //ABM GENERAL
    public List getListarTablas() {
        return this.abmDao.getListarTablas();
    }

    public Abm getBuscarTabla(Abm abm) {
        return this.abmDao.getBuscarTabla(abm);
    }

    public List getListarCamposTabla(Abm abm) {
        return this.abmDao.getListarCamposTabla(abm);
    }

    public int setEjecutarConsulta(Abm abm) {
        return this.abmDao.setEjecutarConsulta(abm);
    }

    public List getEjecutarListado(Abm abm) {
        return this.abmDao.getEjecutarListado(abm);
    }

    //  INICIO JOJO  \\
    public List getEjecutarListado2(Abm abm) {
        return this.abmDao.getEjecutarListado2(abm);
    }

    public String getDibContadorClasico(Abm abm) {
        return this.abmDao.getDibContadorClasico(abm);
    }

    public String getDibBuscarParametro(Abm abm) {
        return this.abmDao.getDibBuscarParametro(abm);
    }

    public List getListarRegistros(Abm abm) {
        return this.abmDao.getListarRegistros(abm);
    }

    public int setInsertarDatos(Abm abm) {
        return this.abmDao.setInsertarDatos(abm);
    }
    //CODE

    public int setRegistrarCerGen(Estudiantes estudiante) {
        return this.estudiantesDao.setRegistrarCerGen(estudiante);
    }

    public int getBuscarMaxCertSede(Estudiantes estudiante) {
        return this.estudiantesDao.getBuscarMaxCertSede(estudiante);
    }

    public int getbuscarnrotransacciones(Estudiantes estudiante) {
        return this.estudiantesDao.getbuscarnrotransacciones(estudiante);
    }

    public int getbuscarnrocertificado(Estudiantes estudiante) {
        return this.estudiantesDao.getbuscarnrocertificado(estudiante);
    }

    public int getcert_buscar_nro_certificado_gestioncode(Estudiantes estudiante) {
        return this.estudiantesDao.getcert_buscar_nro_certificado_gestioncode(estudiante);
    }

    public int setRegistrarCerGenNotas(Estudiantes estudiante) {
        return this.estudiantesDao.setRegistrarCerGenNotas(estudiante);
    }

    public void setEliminarCertificadoNotas(Estudiantes estudiante) {
        this.estudiantesDao.setEliminarCertificadoNotas(estudiante);
    }

    public List getListarCertGen(Estudiantes estudiante) {
        return this.estudiantesDao.getListarCertGen(estudiante);
    }

    public List getListarCertGenAnulados(Estudiantes estudiante) {
        return this.estudiantesDao.getListarCertGenAnulados(estudiante);
    }

    public List getListarCertGenEmitidos(Estudiantes estudiante) {
        return this.estudiantesDao.getListarCertGenEmitidos(estudiante);
    }

    public List getListarNotasCertificados(Estudiantes estudiante) {
        return this.estudiantesDao.getListarNotasCertificados(estudiante);
    }

    public List getListarCombos(Abm abm) {
        return this.abmDao.getListarCombos(abm);
    }

    public Abm getBuscarForanea(Abm abm) {
        return this.abmDao.getBuscarForanea(abm);
    }

    public Abm getBuscarCampoTabla(Abm abm) {
        return this.abmDao.getBuscarCampoTabla(abm);
    }

    public int getContarDependientes(Abm abm) {
        return this.abmDao.getContarDependientes(abm);
    }

    public String setDibInsertarRegistro(Abm abm) {
        return this.abmDao.setDibInsertarRegistro(abm);
    }

    //  INICIO huaica  \\
    public List getListarCamposTablaActividad(Abm abm) {
        return this.abmDao.getListarCamposTablaActividad(abm);
    }

    public List getEjecutarListado3(Abm abm) {
        return this.abmDao.getEjecutarListado3(abm);
    }

    public List getListarRegistrosActividad(Abm abm) {
        return this.abmDao.getListarRegistrosActividad(abm);
    }
    //  FIN huaica  \\

    // INICIO Combustible \\
    public Enlaces getEnlBuscarEnlace(Enlaces enlace) {
        return this.enlacesDao.getEnlBuscarEnlace(enlace);
    }

    public List getEnlListarCamposTabla(Abm abm) {
        return this.abmDao.getEnlListarCamposTabla(abm);
    }

    public List getEnlEjecutarListado(Abm abm) {
        return this.abmDao.getEnlEjecutarListado(abm);
    }

    public List getEnlListarRegistros(Abm abm) {
        return this.abmDao.getEnlListarRegistros(abm);
    }
    // FIN Combustible \\

    //  FIN JOJO  \\
    public List getListarCamposCondicion(Abm abm) {
        return this.abmDao.getListarCamposCondicion(abm);
    }

    public Abm getBuscarCampo(Abm abm) {
        return this.abmDao.getBuscarCampo(abm);
    }

    public List getListarForaneosTabla(Abm abm) {
        return this.abmDao.getListarForaneosTabla(abm);
    }

    public Abm getBuscarTabla1(Abm abm) {
        return this.abmDao.getBuscarTabla1(abm);
    }

    public int setInsertarConsulta(Abm abm) {
        return this.abmDao.setInsertarConsulta(abm);
    }

    public Abm getBuscarConsulta(Abm abm) {
        return this.abmDao.getBuscarConsulta(abm);
    }

    public int setInsertarConsultaTotales(Abm abm) {
        return this.abmDao.setInsertarConsultaTotales(abm);
    }

    public Abm getBuscarConsultaTotales(Abm abm) {
        return this.abmDao.getBuscarConsultaTotales(abm);
    }

    public List getListarConsultas() {
        return this.abmDao.getListarConsultas();
    }
    //fin ABM GENERAL

    //Clientes
    public Clientes getBuscarConexion(Usuarios usuario) {
        return this.clientesDao.getBuscarConexion(usuario);
    }

    public String getFechaCadena(Clientes cliente) {
        return this.clientesDao.getFechaCadena(cliente);
    }

    public String getCadenaFecha(Clientes cliente) {
        return this.clientesDao.getCadenaFecha(cliente);
    }

    public Integer getUsrBuscarIp(Clientes cliente) {
        return this.clientesDao.getUsrBuscarIp(cliente);
    }
    //fin Clientes

    //Roles
    public Roles getBuscarRol(Roles rol) {
        return this.rolesDao.getBuscarRol(rol);
    }

    public List getListarRoles() {
        return this.rolesDao.getListarRoles();
    }

    public List getListarRolesCliente(Roles rol) {
        return this.rolesDao.getListarRolesCliente(rol);
    }

    public Roles getBuscarRolCliente(Roles rol) {
        return this.rolesDao.getBuscarRolCliente(rol);
    }

    public List getListarAlmacenesCliente(Roles rol) {
        return this.rolesDao.getListarAlmacenesCliente(rol);
    }

    public Roles getBuscarAlmacenCliente(Roles rol) {
        return this.rolesDao.getBuscarAlmacenCliente(rol);
    }
    //fin Roles

    //Menues
    public List getListarCategorias(Categorias categoria) {
        return this.categoriasDao.getListarCategorias(categoria);
    }

    public List getListarEnlaces(Enlaces enlace) {
        return this.enlacesDao.getListarEnlaces(enlace);
    }

    public Enlaces getBuscarEnlace(Enlaces enlace) {
        return this.enlacesDao.getBuscarEnlace(enlace);
    }
    //fin Menues

    public Abm getBuscarCampoTabla1(Abm abm) {
        return this.abmDao.getBuscarCampoTabla1(abm);
    }

    public Clientes getComprobarUsuario(Usuarios usuario) {
        return this.clientesDao.getComprobarUsuario(usuario);
    }

    public Clientes getComprobarUsuSede(Usuarios usuario) {
        return this.clientesDao.getComprobarUsuSede(usuario);
    }

    public int setBorrarConsulta(Abm abm) {
        return this.abmDao.setBorrarConsulta(abm);
    }

    public int setModificarConsulta(Abm abm) {
        return this.abmDao.setModificarConsulta(abm);
    }

    public Instituciones getBuscarInstitucion(Instituciones institucion) {
        return this.clientesDao.getBuscarInstitucion(institucion);
    }

    public Instituciones getBuscarInstitucionSede(Instituciones institucion) {
        return this.clientesDao.getBuscarInstitucionSede(institucion);
    }

    public List getListarCombosPagina(Herramientas herramienta) {
        return this.herramientasDao.getListarCombosPagina(herramienta);
    }

//INICIO DE WAYKA
    //Actividades
    public List getListarActividades(Actividades actividad) {
        return this.actividadesDao.getListarActividades(actividad);
    }

    public List getListarTiposAlertasAct(Actividades actividad) {
        return this.actividadesDao.getListarTiposAlertasAct(actividad);
    }

    public Actividades getBuscarProceso(Actividades actividad) {
        return this.actividadesDao.getBuscarProceso(actividad);
    }

    public List getListarProcesosAcceso(Clientes cliente) {
        return this.actividadesDao.getListarProcesosAcceso(cliente);
    }

    public List getListarProcesosAccesoTramites(Clientes cliente) {
        return this.actividadesDao.getListarProcesosAccesoTramites(cliente);
    }

    public List getListarProcesosAccesoTramites2(Clientes cliente) {
        return this.actividadesDao.getListarProcesosAccesoTramites2(cliente);
    }

    public List getListarProcesosAccesoCorresp(Clientes cliente) {
        return this.actividadesDao.getListarProcesosAccesoCorresp(cliente);
    }

    public Actividades getBuscarTipoAlerta(Actividades actividad) {
        return this.actividadesDao.getBuscarTipoAlerta(actividad);
    }

    public List getListarTiposAlertas(Actividades actividad) {
        return this.actividadesDao.getListarTiposAlertas(actividad);
    }

    public Actividades getBuscarActividad(Actividades actividad) {
        return this.actividadesDao.getBuscarActividad(actividad);
    }

    public Actividades getBuscarActividadOrden(Actividades actividad) {
        return this.actividadesDao.getBuscarActividadOrden(actividad);
    }

    public List getListarUbicacionesOrganicas() {
        return this.actividadesDao.getListarUbicacionesOrganicas();
    }

    public Actividades getBuscarUbicacionOrganica(Actividades actividad) {
        return this.actividadesDao.getBuscarUbicacionOrganica(actividad);
    }

    public List getListarTiposActuaciones() {
        return this.actividadesDao.getListarTiposActuaciones();
    }

    public Actividades getBuscarTipoActuacion(Actividades actividad) {
        return this.actividadesDao.getBuscarTipoActuacion(actividad);
    }

    public int setRegistrarActividad(Actividades actividad) {
        return this.actividadesDao.setRegistrarActividad(actividad);
    }

    public int setReiniciarTiposAlertas(Actividades actividad) {
        return this.actividadesDao.setReiniciarTiposAlertas(actividad);
    }

    public int setRegistrarTipoAlerta(Actividades actividad) {
        return this.actividadesDao.setRegistrarTipoAlerta(actividad);
    }

    public int setEliminarActividad(Actividades actividad) {
        return this.actividadesDao.setEliminarActividad(actividad);
    }

    public List getListarTiposProcesos() {
        return this.actividadesDao.getListarTiposProcesos();
    }

    public List getListarTiposDuraciones() {
        return this.actividadesDao.getListarTiposDuraciones();
    }

    public Actividades getBuscarTipoDuracion(Actividades actividad) {
        return this.actividadesDao.getBuscarTipoDuracion(actividad);
    }
    //Fin Actividades

    //Dominios
    public List getListarDominios() {
        return this.dominiosDao.getListarDominios();
    }

    public List getListarDominiosAcceso(Clientes cliente) {
        return this.dominiosDao.getListarDominiosAcceso(cliente);
    }

    public List getListarTiposDominios() {
        return this.dominiosDao.getListarTiposDominios();
    }

    public Dominios getBuscarDominio(Dominios dominio) {
        return this.dominiosDao.getBuscarDominio(dominio);
    }

    public Dominios getBuscarTipoDominio(Dominios dominio) {
        return this.dominiosDao.getBuscarTipoDominio(dominio);
    }

    public int setRegistrarDominio(Dominios dominio) {
        return this.dominiosDao.setRegistrarDominio(dominio);
    }

    public int setEliminarDominio(Dominios dominio) {
        return this.dominiosDao.setEliminarDominio(dominio);
    }

    public int getBuscarDominioOtrasTb(Dominios dominio) {
        return this.dominiosDao.getBuscarDominioOtrasTb(dominio);
    }
    //Fin Dominios

    //Tuplas
    public List getListarTuplas(Dominios dominio) {
        return this.dominiosDao.getListarTuplas(dominio);
    }

    public List getListarTuplasPadre(Dominios dominio) {
        return this.dominiosDao.getListarTuplasPadre(dominio);
    }

    public Dominios getBuscarTupla(Dominios dominio) {
        return this.dominiosDao.getBuscarTupla(dominio);
    }

    public int setRegistrarTupla(Dominios dominio) {
        return this.dominiosDao.setRegistrarTupla(dominio);
    }

    public int setEliminarTupla(Dominios dominio) {
        return this.dominiosDao.setEliminarTupla(dominio);
    }

    public Dominios getBuscarTupla2(Dominios dominio) {
        return this.dominiosDao.getBuscarTupla2(dominio);
    }

    public int setRegistrarTempTupla(Tramites tramite) {
        return this.dominiosDao.setRegistrarTempTupla(tramite);
    }

    public int setLimpiarTempTuplas() {
        return this.dominiosDao.setLimpiarTempTuplas();
    }
    //Fin Tuplas  

    //Campos
    public List getListarFormularios() {
        return this.camposDao.getListarFormularios();
    }

    public List getListarFormulariosAcceso(Clientes cliente) {
        return this.camposDao.getListarFormulariosAcceso(cliente);
    }

    public List getListarCampos(Campos campo) {
        return this.camposDao.getListarCampos(campo);
    }

    public Campos getBuscarFormulario(Campos campo) {
        return this.camposDao.getBuscarFormulario(campo);
    }

    public Campos getBuscarCampoForm(Campos campo) {
        return this.camposDao.getBuscarCampoForm(campo);
    }

    public List getListarTiposValidaciones() {
        return this.camposDao.getListarTiposValidaciones();
    }

    public Campos getBuscarTipoValidacion(Campos campo) {
        return this.camposDao.getBuscarTipoValidacion(campo);
    }

    public int setRegistrarCampo(Campos campo) {
        return this.camposDao.setRegistrarCampo(campo);
    }

    public int setEliminarCampo(Campos campo) {
        return this.camposDao.setEliminarCampo(campo);
    }
    //Fin Campos

    //Acl
    public Campos getBuscarFormulario1(Campos campo) {
        return this.camposDao.getBuscarFormulario1(campo);
    }

    public List getListarTiposPermisos() {
        return this.camposDao.getListarTiposPermisos();
    }

    public List getListarCamposAcl(Campos campo) {
        return this.camposDao.getListarCamposAcl(campo);
    }

    public int setRegistrarAcl(Campos campo) {
        return this.camposDao.setRegistrarAcl(campo);
    }

    public int setEliminarAcl(Campos campo) {
        return this.camposDao.setEliminarAcl(campo);
    }
    //Fin Acl

    //Informes
    public List getListarInformes(Informes informe) {
        return this.informesDao.getListarInformes(informe);
    }

    public Informes getBuscarInforme(Informes informe) {
        return this.informesDao.getBuscarInforme(informe);
    }

    public int setRegistrarInforme(Informes informe) {
        return this.informesDao.setRegistrarInforme(informe);
    }

    public int setEliminarInforme(Informes informe) {
        return this.informesDao.setEliminarInforme(informe);
    }

    public List getListarInformesActividad(Tramites tramite) {
        return this.informesDao.getListarInformesActividad(tramite);
    }

    public Informes getBuscarInforme2(Informes informe) {
        return this.informesDao.getBuscarInforme2(informe);
    }
    //Fin Informes

    //Gw
    public String getListarDatosTabla(Abm abm) {
        return this.gwDao.getListarDatosTabla(abm);
    }

    public String getListarDatosPrimarios(Abm abm) {
        return this.gwDao.getListarDatosPrimarios(abm);
    }

    public Abm getListarCamposTabla2(Abm abm) {
        return this.gwDao.getListarCamposTabla2(abm);
    }

    public Tramites getBuscarCampoGw(Tramites tramite) {
        return this.gwDao.getBuscarCampoGw(tramite);
    }

    //Tramites Limbo
    public List getListarTramitesMiosLimbo(Tramites tramite) {
        return this.gwDao.getListarTramitesMiosLimbo(tramite);
    }

    public int setRegistrarValorLimbo(Tramites tramite) {
        return this.gwDao.setRegistrarValorLimbo(tramite);
    }

    public int setInsertarTramiteLimbo(Tramites tramite) {
        return this.gwDao.setInsertarTramiteLimbo(tramite);
    }

    public int setRetrocederTramiteLimbo(Tramites tramite) {
        return this.gwDao.setRetrocederTramiteLimbo(tramite);
    }

    public int setRegistrarValorLimbo2(Tramites tramite) {
        return this.gwDao.setRegistrarValorLimbo2(tramite);
    }

    public int setRegistrarTrPrFrLogLimbo(Tramites tramite) {
        return this.gwDao.setRegistrarTrPrFrLogLimbo(tramite);
    }
    //Fin Tramites Limbo
    //Fin Gw

    //Administracion de tramites
    public List getListarFormularioNuevo(Tramites tramite) {
        return this.tramitesDao.getListarFormularioNuevo(tramite);
    }

    public int getBuscarTieneHijos(Tramites tramite) {
        return this.dominiosDao.getBuscarTieneHijos(tramite);
    }

    public List getListarCombos2(Tramites tramite) {
        return this.dominiosDao.getListarCombos2(tramite);
    }

    public int getBuscarTuplaPadre(Tramites tramite) {
        return this.dominiosDao.getBuscarTuplaPadre(tramite);
    }

    public int setInsertarTramite(Tramites tramite) {
        return this.tramitesDao.setInsertarTramite(tramite);
    }

    public int getBuscarActividadMinima(Tramites tramite) {
        return this.tramitesDao.getBuscarActividadMinima(tramite);
    }

    public int setInsertarFrLog(Tramites tramite) {
        return this.tramitesDao.setInsertarFrLog(tramite);
    }

    public int setRegistrarValor(Tramites tramite) {
        return this.tramitesDao.setRegistrarValor(tramite);
    }

    public Tramites getBuscarTramite(Tramites tramite) {
        return this.tramitesDao.getBuscarTramite(tramite);
    }

    public int setRecibirTramite(Tramites tramite) {
        return this.tramitesDao.setRecibirTramite(tramite);
    }

    public Tramites getBuscarFrLog(Tramites tramite) {
        return this.tramitesDao.getBuscarFrLog(tramite);
    }

    public int setAvanzarTramite(Tramites tramite) {
        return this.tramitesDao.setAvanzarTramite(tramite);
    }

    public int setConcluirTramite(Tramites tramite) {
        return this.tramitesDao.setConcluirTramite(tramite);
    }

    public int setEliminarFrLog(Tramites tramite) {
        return this.tramitesDao.setEliminarFrLog(tramite);
    }

    public List getListarTramitesMios(Tramites tramite) {
        return this.tramitesDao.getListarTramitesMios(tramite);
    }

    public List getListarTramitesMiosFiltrado(Tramites tramite) {
        return this.tramitesDao.getListarTramitesMiosFiltrado(tramite);
    }

    public List getListarTramitesMiosDespachados(Tramites tramite) {
        return this.tramitesDao.getListarTramitesMiosDespachados(tramite);
    }

    public List getListarTramitesMiosDespachadosFiltrado(Tramites tramite) {
        return this.tramitesDao.getListarTramitesMiosDespachadosFiltrado(tramite);
    }

    public List getListarUsuariosActividadSiguiente(Tramites tramite) {
        return this.tramitesDao.getListarUsuariosActividadSiguiente(tramite);
    }

    public List getListarCamposReferencia(Tramites tramite) {
        return this.tramitesDao.getListarCamposReferencia(tramite);
    }

    public int setRetrocederTramite(Tramites tramite) {
        return this.tramitesDao.setRetrocederTramite(tramite);
    }

    public List getListarFormulario(Tramites tramite) {
        return this.tramitesDao.getListarFormulario(tramite);
    }
    //Fin Administracion de tramites

    //Personas
    public Personas getBuscarPersonaUsuario(Personas persona) {
        return this.personasDao.getBuscarPersonaUsuario(persona);
    }
    //Fin Personas

    //Proveidos
    public int setRegistrarProveido(Proveidos proveido) {
        return this.proveidosDao.setRegistrarProveido(proveido);
    }

    public Proveidos getBuscarUltimoProveido(Proveidos proveido) {
        return this.proveidosDao.getBuscarUltimoProveido(proveido);
    }

    public String getBuscarUltimoProveido2(Proveidos proveido) {
        return this.proveidosDao.getBuscarUltimoProveido2(proveido);
    }

    public List getListarProveidosHistoricos(Proveidos proveido) {
        return this.proveidosDao.getListarProveidosHistoricos(proveido);
    }

    public Proveidos getBuscarProveido(Proveidos proveido) {
        return this.proveidosDao.getBuscarProveido(proveido);
    }
    //Fin Proveidos

    //Adjuntos
    public int setRegistrarAdjunto(Adjuntos adjunto) {
        return this.adjuntosDao.setRegistrarAdjunto(adjunto);
    }

    public List getListarAdjuntos(Adjuntos adjunto) {
        return this.adjuntosDao.getListarAdjuntos(adjunto);
    }
    //Fin Adjuntos

    //Administrar mis pendientes agrupados
    public List getListarTramitesMiosAgrupados(Tramites tramite) {
        return this.tramitesDao.getListarTramitesMiosAgrupados(tramite);
    }

    public List getListarTramitesMiosAgrupados2(Tramites tramite) {
        return this.tramitesDao.getListarTramitesMiosAgrupados2(tramite);
    }

    public List getListarTramitesMiosAgrupadosDespachados(Tramites tramite) {
        return this.tramitesDao.getListarTramitesMiosAgrupadosDespachados(tramite);
    }

    public List getListarTramitesMiosAgrupadosDespachados2(Tramites tramite) {
        return this.tramitesDao.getListarTramitesMiosAgrupadosDespachados2(tramite);
    }

    public Tramites getContarTramitesPorFechaEstado(Tramites tramite) {
        return this.tramitesDao.getContarTramitesPorFechaEstado(tramite);
    }

    public Tramites getContarTramitesPorFechaEstado2(Tramites tramite) {
        return this.tramitesDao.getContarTramitesPorFechaEstado2(tramite);
    }

    public Tramites getContarTramitesPorFecha(Tramites tramite) {
        return this.tramitesDao.getContarTramitesPorFecha(tramite);
    }

    public Tramites getContarTramitesPorFecha2(Tramites tramite) {
        return this.tramitesDao.getContarTramitesPorFecha2(tramite);
    }

    public Tramites getContarTramitesPorFecha3(Tramites tramite) {
        return this.tramitesDao.getContarTramitesPorFecha3(tramite);
    }
    //Fin Administrar mis pendientes agrupados

    //Administraci??n de Reportes
    public List getListarCamposProceso(Campos campo) {
        return this.camposDao.getListarCamposProceso(campo);
    }

    public List getListarCamposReporte(Campos campo) {
        return this.camposDao.getListarCamposReporte(campo);
    }

    public List getListarCamposReporte2(Campos campo) {
        return this.camposDao.getListarCamposReporte2(campo);
    }

    public String getListarTotalesDatos(Campos campo) {
        return this.camposDao.getListarTotalesDatos(campo);
    }
    //Fin Administraci??n de Reportes

    //Busqueda de tramites
    public List getListarTramitesPorCampos(Tramites tramite) {
        return this.tramitesDao.getListarTramitesPorCampos(tramite);
    }

    public int getBuscarTramiteExisteUbicacionOrganica(Tramites tramite) {
        return this.tramitesDao.getBuscarTramiteExisteUbicacionOrganica(tramite);
    }

    public Tramites getBuscarTramiteUbicacionOrganica(Tramites tramite) {
        return this.tramitesDao.getBuscarTramiteUbicacionOrganica(tramite);
    }

    public List getListarTramiteLog(Tramites tramite) {
        return this.tramitesDao.getListarTramiteLog(tramite);
    }

    public List getListarTramitesFechaUbicacionOrganica(Tramites tramite) {
        return this.tramitesDao.getListarTramitesFechaUbicacionOrganica(tramite);
    }

    public List getListarTramitesIniciados(Tramites tramite) {
        return this.tramitesDao.getListarTramitesIniciados(tramite);
    }

    public List getListarTramitesMovidos(Tramites tramite) {
        return this.tramitesDao.getListarTramitesMovidos(tramite);
    }

    public List getListarTramitesConcluidos(Tramites tramite) {
        return this.tramitesDao.getListarTramitesConcluidos(tramite);
    }

    public List getListarTramitesIniciadosDetalle(Tramites tramite) {
        return this.tramitesDao.getListarTramitesIniciadosDetalle(tramite);
    }

    public List getListarTramitesMovidosDetalle(Tramites tramite) {
        return this.tramitesDao.getListarTramitesMovidosDetalle(tramite);
    }

    public List getListarTramitesConcluidosDetalle(Tramites tramite) {
        return this.tramitesDao.getListarTramitesConcluidosDetalle(tramite);
    }
    //Fin Busqueda de tramites

    //Busqueda ejecutiva
    public List getListarDatosTramite(Tramites tramite) {
        return this.tramitesDao.getListarDatosTramite(tramite);
    }
    //Fin Busqueda ejecutiva

    //Bloquear Tramites
    public int setBloquearTramite(Tramites tramite) {
        return this.tramitesDao.setBloquearTramite(tramite);
    }
    //Fin Bloquear Tramites

    //Desbloquear Tramites
    public int setDesbloquearTramite(Tramites tramite) {
        return this.tramitesDao.setDesbloquearTramite(tramite);
    }
    //Fin Desbloquear Tramites

    //Anular tramites
    public List getListarTramitesAnulados() {
        return this.tramitesDao.getListarTramitesAnulados();
    }

    public int setAnularTramite(Tramites tramite) {
        return this.tramitesDao.setAnularTramite(tramite);
    }
    //Fin Anular tramites

    //CAmbiar Estado Tramites
    public int setCambiarEstadoTramite(Tramites tramite) {
        return this.tramitesDao.setCambiarEstadoTramite(tramite);
    }
    //Fin Cambiar Estado
    //Administrar noticias

    public List getListarNoticias() {
        return this.tablerosDao.getListarNoticias();
    }

    public List getListarTiposTableros() {
        return this.tablerosDao.getListarTiposTableros();
    }

    public List getListarTiposAvisos() {
        return this.tablerosDao.getListarTiposAvisos();
    }

    public int setRegistrarTablero(Tableros tablero) {
        return this.tablerosDao.setRegistrarTablero(tablero);
    }

    public Tableros getBuscarTablero(Tableros tablero) {
        return this.tablerosDao.getBuscarTablero(tablero);
    }

    public int setEliminarTablero(Tableros tablero) {
        return this.tablerosDao.setEliminarTablero(tablero);
    }
    //Fin Administrar noticias

    //Imprimir tramites
    public List getListarTramitesImpresion(Tramites tramite) {
        return this.tramitesDao.getListarTramitesImpresion(tramite);
    }
    //Fin Imprimir tramites

    //Redireccionar tramites
    public List getListarTramites(Tramites tramite) {
        return this.tramitesDao.getListarTramites(tramite);
    }

    public int setRedireccionarTramite(Tramites tramite) {
        return this.tramitesDao.setRedireccionarTramite(tramite);
    }

    public List getListarActividades2(Actividades actividad) {
        return this.actividadesDao.getListarActividades2(actividad);
    }

    public List getListarUsuariosRolActividad(Actividades actividad) {
        return this.actividadesDao.getListarUsuariosRolActividad(actividad);
    }
    //Fin Redireccionar tramites

    //Reingresar tramites
    public Tramites getBuscarTramite2(Tramites tramite) {
        return this.tramitesDao.getBuscarTramite2(tramite);
    }

    public int setReingresarTramite(Tramites tramite) {
        return this.tramitesDao.setReingresarTramite(tramite);
    }
    //Fin Reingresar tramites

    //Administrar Correspondencias
    public Tramites getBuscarTipoProceso2(Tramites tramite) {
        return this.tramitesDao.getBuscarTipoProceso2(tramite);
    }

    public Usuarios getBuscarUsuario(Usuarios usuario) {
        return this.usuariosDao.getBuscarUsuario(usuario);
    }

    public List getListarUsuariosUbicacionOrganica(Usuarios usuario) {
        return this.usuariosDao.getListarUsuariosUbicacionOrganica(usuario);
    }

    public List getListarTramitesMiosCorrespondenciaDe(Tramites tramite) {
        return this.tramitesDao.getListarTramitesMiosCorrespondenciaDe(tramite);
    }

    public List getListarTramitesMiosCorrespondenciaPara(Tramites tramite) {
        return this.tramitesDao.getListarTramitesMiosCorrespondenciaPara(tramite);
    }

    public int setAvanzarCorrespondencia(Tramites tramite) {
        return this.tramitesDao.setAvanzarCorrespondencia(tramite);
    }

    public int setInsertarTramiteCopia(Tramites tramite) {
        return this.tramitesDao.setInsertarTramiteCopia(tramite);
    }

    public Proveidos getBuscarProveidoCorresp(Proveidos proveido) {
        return this.proveidosDao.getBuscarProveidoCorresp(proveido);
    }
    //Fin - Administrar Correspondencias

    //Reporte de campos por actividades
    public String getListarCamposActividad(Campos campo) {
        return this.camposDao.getListarCamposActividad(campo);
    }
    //Fin Reporte de campos por actividades

    //Reporte de actividades por roles
    public String getListarActividadesRoles(Actividades actividad) {
        return this.actividadesDao.getListarActividadesRoles(actividad);
    }
    //Fin Reporte de actividades por roles

    //Administraci??n de hilos
    public List getListarUsuariosHilos(Usuarios usuario) {
        return this.hilosDao.getListarUsuariosHilos(usuario);
    }

    public List getListarTiposHilos() {
        return this.hilosDao.getListarTiposHilos();
    }

    public int setRegistrarHilo(Hilos hilo) {
        return this.hilosDao.setRegistrarHilo(hilo);
    }

    public List getListarTiposSegmentos() {
        return this.hilosDao.getListarTiposSegmentos();
    }

    public List getListarSegmentos(Hilos hilo) {
        return this.hilosDao.getListarSegmentos(hilo);
    }

    public List getListarDestinatarios(Hilos hilo) {
        return this.hilosDao.getListarDestinatarios(hilo);
    }

    public int setRegistrarSegmento(Hilos hilo) {
        return this.hilosDao.setRegistrarSegmento(hilo);
    }

    public int setRegistrarSgmAdjunto(Hilos hilo) {
        return this.hilosDao.setRegistrarSgmAdjunto(hilo);
    }

    public List getListarAdjuntosHilos(Hilos hilo) {
        return this.hilosDao.getListarAdjuntosHilos(hilo);
    }

    public Hilos getBuscarHilo(Hilos hilo) {
        return this.hilosDao.getBuscarHilo(hilo);
    }

    public List getListarHilosMios(Hilos hilo) {
        return this.hilosDao.getListarHilosMios(hilo);
    }

    public List getListarHilosAMi(Hilos hilo) {
        return this.hilosDao.getListarHilosAMi(hilo);
    }

    public int getNroMensajes(Hilos hilo) {
        return this.hilosDao.getNroMensajes(hilo);
    }

    public int getNroMensajesNuevos(Hilos hilo) {
        return this.hilosDao.getNroMensajesNuevos(hilo);
    }

    public int setBorrarHilo(Hilos hilo) {
        return this.hilosDao.setBorrarHilo(hilo);
    }
    //Fin Administraci??n de hilos

    //Busqueda por Estados y Fechas
    public List getListarEstadosTramites() {
        return this.tramitesDao.getListarEstadosTramites();
    }

    public List getListarTramitesEstadoFechaUbicacionOrganica(Tramites tramite) {
        return this.tramitesDao.getListarTramitesEstadoFechaUbicacionOrganica(tramite);
    }
    //Fin Busqueda por Estados y Fechas

    //Acl dibRap
    public List getListarCamposAcl2(Campos campo) {
        return this.camposDao.getListarCamposAcl2(campo);
    }

    public int setRegistrarAcl2(Campos campo) {
        return this.camposDao.setRegistrarAcl2(campo);
    }

    public int setEliminarAcl2(Campos campo) {
        return this.camposDao.setEliminarAcl2(campo);
    }
    //Fin Acl dibRap

    public List getListarActividadesNoLimbo(Actividades actividad) {
        return this.actividadesDao.getListarActividadesNoLimbo(actividad);
    }

    public List getListarActividadesLimbo(Actividades actividad) {
        return this.actividadesDao.getListarActividadesLimbo(actividad);
    }

    public String getBuscarTablaLimbo(Tramites tramite) {
        return this.gwDao.getBuscarTablaLimbo(tramite);
    }

    public int setAvanzarTramiteLimbo(Tramites tramite) {
        return this.gwDao.setAvanzarTramiteLimbo(tramite);
    }

    public int getBuscarIdCampoLimbo(Tramites tramite) {
        return this.gwDao.getBuscarIdCampoLimbo(tramite);
    }

    public int getVerificarUsuario(Usuarios usuario) {
        return this.usuariosDao.getVerificarUsuario(usuario);
    }

    public int setRegistrarNuevaClave(Usuarios usuario) {
        return this.usuariosDao.setRegistrarNuevaClave(usuario);
    }

    //Habilitar Tramites
    public int setHabilitarTramite(Tramites tramite) {
        return this.tramitesDao.setHabilitarTramite(tramite);
    }
    //Fin Habilitar Tramites  

    public List getListarTramitesPorEstadoFecha(Tramites tramite) {
        return this.tramitesDao.getListarTramitesPorEstadoFecha(tramite);
    }

    //Administracion de formularios
    public int setRegistrarFormulario(Campos campo) {
        return this.camposDao.setRegistrarFormulario(campo);
    }

    public int setEliminarFormulario(Campos campo) {
        return this.camposDao.setEliminarFormulario(campo);
    }
    //Fin Administracion de formularios

    //TramiteKardex
    public List getListarProcesosAccesoKardex() {
        return this.actividadesDao.getListarProcesosAccesoKardex();
    }

    public List getListarTramitesMiosKardex(Tramites tramite) {
        return this.tramitesDao.getListarTramitesMiosKardex(tramite);
    }

    public List getListarTramitesMiosKardexPorProceso(Tramites tramite) {
        return this.tramitesDao.getListarTramitesMiosKardexPorProceso(tramite);
    }

    //Administrar Kardex
    public List getListarProcesosKardexs() {
        return this.actividadesDao.getListarProcesosKardexs();
    }

    public int setRegistrarProcesoKardex(Actividades actividad) {
        return this.actividadesDao.setRegistrarProcesoKardex(actividad);
    }

    public int setModificarProcesoKardex(Actividades actividad) {
        return this.actividadesDao.setModificarProcesoKardex(actividad);
    }

    public int setEliminarProcesoKardex(Actividades actividad) {
        return this.actividadesDao.setEliminarProcesoKardex(actividad);
    }

    public Campos getBuscarTipoPermiso(Campos campo) {
        return this.camposDao.getBuscarTipoPermiso(campo);
    }

    public int setRegistrarCampoAclProcesoKardex(Campos campo) {
        return this.camposDao.setRegistrarCampoAclProcesoKardex(campo);
    }

    //Para ver siguiente formulario kardex
    public List getListarTramitesMiosKardexPorProcesoAtendidos(Tramites tramite) {
        return this.tramitesDao.getListarTramitesMiosKardexPorProcesoAtendidos(tramite);
    }

    public Tramites getBuscarMinMaxTramitesMiosKardexPorProceso(Tramites tramite) {
        return this.tramitesDao.getBuscarMinMaxTramitesMiosKardexPorProceso(tramite);
    }
    //Fin TramiteKardex   

    //Reporte de tramites por funcionarios
    public List getListarTramitesFuncionarios(Tramites tramite) {
        return this.tramitesDao.getListarTramitesFuncionarios(tramite);
    }

    public List getListarTramitesFuncionarioProceso(Tramites tramite) {
        return this.tramitesDao.getListarTramitesFuncionarioProceso(tramite);
    }

    public List getListarTramitesAtendidos(Tramites tramite) {
        return this.tramitesDao.getListarTramitesAtendidos(tramite);
    }

    public Tramites getContarTramitesAtendidos(Tramites tramite) {
        return this.tramitesDao.getContarTramitesAtendidos(tramite);
    }
    //Fin - Reporte de tramites por funcionarios

    public String getContarPaginas(Tramites tramite) {
        return this.tramitesDao.getContarPaginas(tramite);
    }

    public String getContarPaginasDespachados(Tramites tramite) {
        return this.tramitesDao.getContarPaginasDespachados(tramite);
    }

    public String getContarPaginasLimbo(Tramites tramite) {
        return this.gwDao.getContarPaginasLimbo(tramite);
    }

    public List getListarTramitesCorrelativo(Tramites tramite) {
        return this.tramitesDao.getListarTramitesCorrelativo(tramite);
    }

    //Administrar tramites concluidos
    public List getListarTramitesConcluidosPorProceso(Tramites tramite) {
        return this.tramitesDao.getListarTramitesConcluidosPorProceso(tramite);
    }

    public List getListarTramitesConcluidosPorProcesoFiltrado(Tramites tramite) {
        return this.tramitesDao.getListarTramitesConcluidosPorProcesoFiltrado(tramite);
    }

    public String getContarPaginasConcluidos(Tramites tramite) {
        return this.tramitesDao.getContarPaginasConcluidos(tramite);
    }

    public String getContarPaginasTramitesGestionProceso(Tramites tramite) {
        return this.tramitesDao.getContarPaginasTramitesGestionProceso(tramite);
    }
    //Fin - Administrar tramites concluidos

    public List getListarCamposReferenciaProceso(Campos campo) {
        return this.camposDao.getListarCamposReferenciaProceso(campo);
    }

    public List getListarCamposReporteProceso(Campos campo) {
        return this.camposDao.getListarCamposReporteProceso(campo);
    }

    //INICIO - Administrar Reportes
    public List getListarTuplasCampo(Campos campo) {
        return this.camposDao.getListarTuplasCampo(campo);
    }
    //NUEVO - Administrar Reportes

    //Inicio - DIBREP WAYKA
    public List getListarCamposProcesoWK(Dibwayka dibwayka) {
        return this.dibwaykaDao.getListarCamposProcesoWK(dibwayka);
    }

    public List getListarComboWK(Dibwayka dibwayka) {
        return this.dibwaykaDao.getListarComboWK(dibwayka);
    }

    public int setCrearTablasDibWK(Dibwayka dibwayka) {
        return this.dibwaykaDao.setCrearTablasDibWK(dibwayka);
    }

    public List getListarCamposDibWK(Dibwayka dibwayka) {
        return this.dibwaykaDao.getListarCamposDibWK(dibwayka);
    }

    public Dibwayka getBuscarTablaDibWK(Dibwayka dibwayka) {
        return this.dibwaykaDao.getBuscarTablaDibWK(dibwayka);
    }

    public Dibwayka getBuscarCampoDibWK(Dibwayka dibwayka) {
        return this.dibwaykaDao.getBuscarCampoDibWK(dibwayka);
    }

    public Dibwayka getBuscarTuplaDibWK(Dibwayka dibwayka) {
        return this.dibwaykaDao.getBuscarTuplaDibWK(dibwayka);
    }

    public int setInsertarConsultaDibWK(Dibwayka dibwayka) {
        return this.dibwaykaDao.setInsertarConsultaDibWK(dibwayka);
    }

    public List getListarCondicionesConsultaDibWK(Dibwayka dibwayka) {
        return this.dibwaykaDao.getListarCondicionesConsultaDibWK(dibwayka);
    }

    public List getListarConsultasDibWK() {
        return this.dibwaykaDao.getListarConsultasDibWK();
    }

    public int setBorrarConsultaDibWK(Dibwayka dibwayka) {
        return this.dibwaykaDao.setBorrarConsultaDibWK(dibwayka);
    }

    public int setModificarConsultaDibWK(Dibwayka dibwayka) {
        return this.dibwaykaDao.setModificarConsultaDibWK(dibwayka);
    }

    public Dibwayka getBuscarConsultaDibWK(Dibwayka dibwayka) {
        return this.dibwaykaDao.getBuscarConsultaDibWK(dibwayka);
    }

    public List getConsultaCondicionDibWK(Dibwayka dibwayka) {
        return this.dibwaykaDao.getConsultaCondicionDibWK(dibwayka);
    }
    //Fin - DIBREP WAYKA

// -----------INICIO MICOIMATA---------------------------------------------- \\
    //PLANES
    public List getPrgListarPlanes(Programas programa) {
        return this.planesDao.getPrgListarPlanes(programa);
    }

    public List getFclListarPlanes(Facultades facultad) {
        return this.planesDao.getFclListarPlanes(facultad);
    }

    public List getUnvListarPlanes(Universidades universidad) {
        return this.planesDao.getUnvListarPlanes(universidad);
    }

    public List getPlnListarMateriasNivel(Planes plan) {
        return this.planesDao.getPlnListarMateriasNivel(plan);
    }

    public int getPlnListarNroNiveles(Planes plan) {
        return this.planesDao.getPlnListarNroNiveles(plan);
    }

    public List getPlnListarMateriasRequisitos(Planes plan) {
        return this.planesDao.getPlnListarMateriasRequisitos(plan);
    }

    public List getPlnListarMateriasNroRequisitos(Planes plan) {
        return this.planesDao.getPlnListarMateriasNroRequisitos(plan);
    }

    public List getUnvGrdListarPlanes(Planes plan) {
        return this.planesDao.getUnvGrdListarPlanes(plan);
    }
    //fin PLANES

    // PROGRAMAS
    public Programas getPrgBuscarPrograma(Programas programa) {
        return this.programasDao.getPrgBuscarPrograma(programa);
    }

    public List getFclListarProgramas(Facultades facultad) {
        return this.programasDao.getFclListarProgramas(facultad);
    }

    public List getUnvListarProgramas(Universidades universidad) {
        return this.programasDao.getUnvListarProgramas(universidad);
    }

    public List getUnvListarProgramasPost(Universidades universidad) {
        return this.programasDao.getUnvListarProgramasPost(universidad);
    }
    // fin PROGRAMAS

    // DEPARTAMENTOS
    public Departamentos getDptBuscarDepartamento(Departamentos departamento) {
        return this.departamentosDao.getDptBuscarDepartamento(departamento);
    }

    public List getFclListarDepartamentos(Facultades facultad) {
        return this.departamentosDao.getFclListarDepartamentos(facultad);
    }

    public List getUnvListarDepartamentos(Universidades universidad) {
        return this.departamentosDao.getUnvListarDepartamentos(universidad);
    }
    // fin DEPARTAMENTOS

    // FACULTADES
    public Facultades getFclBuscarFacultad(Facultades facultad) {
        return this.facultadesDao.getFclBuscarFacultad(facultad);
    }

    public List<Facultades> getUnvListarFacultades(Universidades universidad) {
        return this.facultadesDao.getUnvListarFacultades(universidad);
    }

    public List getUnvListarFacultadesPost(Universidades universidad) {
        return this.facultadesDao.getUnvListarFacultadesPost(universidad);
    }
    // fin FACULTADES

    // UNIVERSIDADES
    public Universidades getUnvBuscarUniversidad(Universidades universidad) {
        return this.universidadesDao.getUnvBuscarUniversidad(universidad);
    }
    // fin UNIVERSIDADES

    //MOVER NOTAS
    public Notas getMtcMoverNoMatriculados(Notas nota) {
        return this.notasDao.getMtcMoverNoMatriculados(nota);
    }

    public Notas getMtcMoverMatriculados(Notas nota) {
        return this.notasDao.getMtcMoverMatriculados(nota);
    }
    //FIN MOVER NOTAS

    // MATERIAS
    public List getPlnListarMaterias(Planes plan) {
        return this.materiasDao.getPlnListarMaterias(plan);
    }
    // fin MATERIAS

    //EST_PROGRAMACIONES 
    public List getEstListarEstudiantesNombres(Estudiantes estudiante) {
        return this.estudiantesDao.getEstListarEstudiantesNombres(estudiante);
    }

    public List getEstListarEstudiantesDip(Estudiantes estudiante) {
        return this.estudiantesDao.getEstListarEstudiantesDip(estudiante);
    }

    public List getEstListarEstudiantesNombresAccesos(Estudiantes estudiante) {
        return this.estudiantesDao.getEstListarEstudiantesNombresAccesos(estudiante);
    }

    public List getEstListarEstudiantesDipAccesos(Estudiantes estudiante) {
        return this.estudiantesDao.getEstListarEstudiantesDipAccesos(estudiante);
    }

    public List getEstListarEstudiantesNombres2(Estudiantes estudiante) {
        return this.estudiantesDao.getEstListarEstudiantesNombres2(estudiante);
    }

    public List getEstListarEstudiantesDip2(Estudiantes estudiante) {
        return this.estudiantesDao.getEstListarEstudiantesDip2(estudiante);
    }
    //Personas

    public Personas getPrsBuscarPersona(Personas persona) {
        return this.personasDao.getPrsBuscarPersona(persona);
    }
    //fin Personas
    //Estudiantes

    public Estudiantes getEstBuscarEstudiante(Estudiantes estudiante) {
        return this.estudiantesDao.getEstBuscarEstudiante(estudiante);
    }

    public Estudiantes getEstBuscarEstudiantePrograma(Estudiantes estudiante) {
        return this.estudiantesDao.getEstBuscarEstudiantePrograma(estudiante);
    }

    public Estudiantes getEstBuscarEstudianteAccesos(Estudiantes estudiante) {
        return this.estudiantesDao.getEstBuscarEstudianteAccesos(estudiante);
    }
    //fin Estudiantes

    public Programas getPrdBuscarPrgPeriodo(Programas programa) {
        return this.programasDao.getPrdBuscarPrgPeriodo(programa);
    }

    public List getPrgBuscarDetalles(Programas programa) {
        return this.programasDao.getPrgBuscarDetalles(programa);
    }

    public List getEstPrgListarProgramacionMateriasAut(Materias materia) {
        return this.materiasDao.getEstPrgListarProgramacionMateriasAut(materia);
    }

    public List getDptoListarMateriaGrupo(Materias materia) {
        return this.materiasDao.getDptoListarMateriaGrupo(materia);
    }

    public Programas getMdlBuscarMateriaAhorro(Programas programa) {
        return this.programasDao.getMdlBuscarMateriaAhorro(programa);
    }
    //Grupos

    public Grupos getGrpBuscarGrupo(Grupos grupo) {
        return this.gruposDao.getGrpBuscarGrupo(grupo);
    }

    public Grupos getDptoBuscarCupoRestanteGrupo(Grupos grupo) {
        return this.gruposDao.getDptoBuscarCupoRestanteGrupo(grupo);
    }
    //fin Grupos

    public Programas setEstProgramacionMateria(Programas programa) {
        return this.programasDao.setEstProgramacionMateria(programa);
    }
    //Postulantes

    public Postulantes getPstBuscarPostulante(Postulantes postulante) {
        return this.postulantesDao.getPstBuscarPostulante(postulante);
    }

    public Postulantes getPstBuscarPostulantePrograma(Postulantes postulante) {
        return this.postulantesDao.getPstBuscarPostulantePrograma(postulante);
    }

    public List getPstListarPostulantesNombres(Postulantes postulante) {
        return this.postulantesDao.getPstListarPostulantesNombres(postulante);
    }

    public List getPstListarPostulantesDip(Postulantes postulante) {
        return this.postulantesDao.getPstListarPostulantesDip(postulante);
    }

    public List getPstPrgListarProgramacionMateriasAut(Materias materia) {
        return this.materiasDao.getPstPrgListarProgramacionMateriasAut(materia);
    }

    public int setPstProgramacionMateria(Programas programa) {
        return this.programasDao.setPstProgramacionMateria(programa);
    }
    // inicio JOJO

    public Postulantes getMiPrsBuscarPostulante(Postulantes postulante) {
        return this.postulantesDao.getMiPrsBuscarPostulante(postulante);
    }

    public void setPstRegistrarPrograma(Postulantes postulante) {
        this.postulantesDao.setPstRegistrarPrograma(postulante);
    }
    //Tipos Programaciones

    public List getTpsListarProgramaciones() {
        return this.programasDao.getTpsListarProgramaciones();
    }

    public Programas getTpsBuscarProgramacion(Programas programa) {
        return this.programasDao.getTpsBuscarProgramacion(programa);
    }
    //Proramciones como estudiante

    public Estudiantes getComprobarEstudiante(Estudiantes estudiante) {
        return this.estudiantesDao.getComprobarEstudiante(estudiante);
    }

    public List getMncListarMenciones(Planes plan) {
        return this.planesDao.getMncListarMenciones(plan);
    }

    public List getEstListarProgramacionMateriasReq(Materias materia) {
        return this.materiasDao.getEstListarProgramacionMateriasReq(materia);
    }

    public int getBuscarNivelMaximoPlanesEst(Programas programa) {
        return this.programasDao.getBuscarNivelMaximoPlanesEst(programa);
    }

    public List getZchListarChoqueMaterias(Programas programa) {
        return this.programasDao.getZchListarChoqueMaterias(programa);
    }

    public List getZchListarChoquePeriodos(Programas programa) {
        return this.programasDao.getZchListarChoquePeriodos(programa);
    }

    public List setEstListarProgramarMaterias(Programas programa) {
        return this.programasDao.setEstListarProgramarMaterias(programa);
    }

    public int setEstRegistrarMencionEstudiante(Planes plan) {
        return this.planesDao.setEstRegistrarMencionEstudiante(plan);
    }
    //FIN EST_PROGRAMACIONES

    //RETIRO ADICION DE MATERIAS AUTORIDAD
    public List getEstListarProgramacionesEstudiante(Programas programa) {
        return this.programasDao.getEstListarProgramacionesEstudiante(programa);
    }

    public List setEstPrgRetirarProgramacionesMaterias(Programas programa) {
        return this.programasDao.setEstPrgRetirarProgramacionesMaterias(programa);
    }

    public List setEstPrgRegistrarListarCambiarGrupos(Programas programa) {
        return this.programasDao.setEstPrgRegistrarListarCambiarGrupos(programa);
    }
    //FIN  RETIRO ADICION DE MATERIAS AUTORIDAD      

    // ADMINISTRAR LIBRETAS
    public Asignaciones getDctBuscarAsignacionDocente(Asignaciones asignacion) {
        return this.asignacionesDao.getDctBuscarAsignacionDocente(asignacion);
    }

    public Asignaciones getDctBuscarAsignacionDocentemaslafuncion(Asignaciones asignacion) {
        return this.asignacionesDao.getDctBuscarAsignacionDocentemaslafuncion(asignacion);
    }

    public int setRegistrarasignacion(Postulantes postulante) {
        return this.postulantesDao.setRegistrarasignacion(postulante);
    }

    public Asignaciones getDctBuscarAsignacionDocenteDesignacion(Asignaciones asignacion) {
        return this.asignacionesDao.getDctBuscarAsignacionDocenteDesignacion(asignacion);
    }

    public List getMtrBuscarMateriaAhorro(Asignaciones asignacion) {
        return this.asignacionesDao.getMtrBuscarMateriaAhorro(asignacion);
    }

    public Materias getMtrBuscarMateria(Materias materia) {
        return this.materiasDao.getMtrBuscarMateria(materia);
    }

    public Libretas getLbrBuscarFase(Libretas libreta) {
        return this.libretasDao.getLbrBuscarFase(libreta);
    }

    public List getGrpListarEvaluacionDefinida(Libretas libreta) {
        return this.libretasDao.getGrpListarEvaluacionDefinida(libreta);
    }

    public Libretas getLbrBuscarTipoNota(Libretas libreta) {
        return this.libretasDao.getLbrBuscarTipoNota(libreta);
    }

    public List getEstBuscarEstudiantesProgramados(Libretas libreta) {
        return this.libretasDao.getEstBuscarEstudiantesProgramados(libreta);
    }

    public List getPstBuscarPostulantesProgramados(Libretas libreta) {
        return this.libretasDao.getPstBuscarPostulantesProgramados(libreta);
    }

    public List getEstListarNotasEstudiante(Libretas libreta) {
        return this.libretasDao.getEstListarNotasEstudiante(libreta);
    }

    public List getPstListarNotasPostulante(Libretas libreta) {
        return this.libretasDao.getPstListarNotasPostulante(libreta);
    }

    public int setEstInsertarNotaEstudianteFase(Libretas libreta) {
        return this.libretasDao.setEstInsertarNotaEstudianteFase(libreta);
    }

    public int setPstInsertarNotaPostulanteFase(Libretas libreta) {
        return this.libretasDao.setPstInsertarNotaPostulanteFase(libreta);
    }

    public int setDctAvanzarFase(Libretas libreta) {
        return this.libretasDao.setDctAvanzarFase(libreta);
    }

    public int setDctAvanzarFaseSemiFinal(Libretas libreta) {
        return this.libretasDao.setDctAvanzarFaseSemiFinal(libreta);
    }

    public int getEstSumarNotasEstudianteEvalRegular(Libretas libreta) {
        return this.libretasDao.getEstSumarNotasEstudianteEvalRegular(libreta);
    }

    public int getEstSumarNotasEstudianteEvalContinua(Libretas libreta) {
        return this.libretasDao.getEstSumarNotasEstudianteEvalContinua(libreta);
    }

    public int getLbrBuscarFaseMinima(Libretas libreta) {
        return this.libretasDao.getLbrBuscarFaseMinima(libreta);
    }

    public int getLbrBuscarFaseMaxima(Libretas libreta) {
        return this.libretasDao.getLbrBuscarFaseMaxima(libreta);
    }
    //fin ADMINISTRAR LIBRETAS

    //DEFINIR EVALUACION
    public Docentes getComprobarDocente(Docentes docente) {
        return this.docentesDao.getComprobarDocente(docente);
    }

    public Asignaciones getDctBuscarAsignacionDocenteMateria(Asignaciones asignacion) {
        return this.asignacionesDao.getDctBuscarAsignacionDocenteMateria(asignacion);
    }

    public List getMtrListarMateriaAhorro(Asignaciones asignacion) {
        return this.asignacionesDao.getMtrListarMateriaAhorro(asignacion);
    }

    public Libretas getLbrBuscarTipoNotaDefinida(Libretas libreta) {
        return this.libretasDao.getLbrBuscarTipoNotaDefinida(libreta);
    }

    public List getLbrListarTiposNotas(Libretas libreta) {
        return this.libretasDao.getLbrListarTiposNotas(libreta);
    }

    public int setGrpInsertarEvaluacion(Libretas libreta) {
        return this.libretasDao.setGrpInsertarEvaluacion(libreta);
    }

    public int setGrpModificarEvaluacion(Libretas libreta) {
        return this.libretasDao.setGrpModificarEvaluacion(libreta);
    }

    public int setGrpRegistrarEvaluacion(Libretas libreta) {
        return this.libretasDao.setGrpRegistrarEvaluacion(libreta);
    }

    public int setGrpEliminarEvaluacion(Libretas libreta) {
        return this.libretasDao.setGrpEliminarEvaluacion(libreta);
    }

    public List getDctListarAsignacionDocente(Asignaciones asignacion) {
        return this.asignacionesDao.getDctListarAsignacionDocente(asignacion);
    }

    public List getLbrListarTiposNotasDefinidas(Libretas libreta) {
        return this.libretasDao.getLbrListarTiposNotasDefinidas(libreta);
    }
    //FIN DEFINIR EVALUACION

    //ADMINISTRAR HORARIOS
    public List getListarProgramasAcceso(Usuarios usuario) {
        return this.programasDao.getListarProgramasAcceso(usuario);
    }

    public List getMtrListarPlanesPrograma(Programas programa) {
        return this.programasDao.getMtrListarPlanesPrograma(programa);
    }

    public List getListarPlanProgramaModeloAhorro(Modelos_ahorros modelo) {
        return this.planesDao.getListarPlanProgramaModeloAhorro(modelo);
    }

    public List getDptoListarGruposMateria(Materias materia) {
        return this.gruposDao.getDptoListarGruposMateria(materia);
    }

    public Grupos getDptoBuscarGrupo(Grupos grupo) {
        return this.gruposDao.getDptoBuscarGrupo(grupo);
    }

    public List getListarDias() {
        return this.horariosDao.getListarDias();
    }

    public List getListarHorario(Horarios horario) {
        return this.horariosDao.getListarHorario(horario);
    }

    public List getListarAulasDisponibles(Horarios horario) {
        return this.horariosDao.getListarAulasDisponibles(horario);
    }

    public void setHrsLimpiarHorarioMateria(Horarios horario) {
        this.horariosDao.setHrsLimpiarHorarioMateria(horario);
    }

    public int setHrsRegistrarHorarioAula(Horarios horario) {
        return this.horariosDao.setHrsRegistrarHorarioAula(horario);
    }

    public Planes getMtrBuscarPlanPrograma(Planes plan) {
        return this.planesDao.getMtrBuscarPlanPrograma(plan);
    }
    //fin ADMINISTRAR HORARIOS

    //CERRAR LIBRETA
    public List getListarMateriasCerrarLibreta(Libretas libreta) {
        return this.libretasDao.getListarMateriasCerrarLibreta(libreta);
    }

    public int setCerrarLibreta(Libretas libreta) {
        return this.libretasDao.setCerrarLibreta(libreta);
    }
    //FIN CERRAR LIBRETA  

    //Administrar tableros/noticias
    public List getListarNoticiasRol(Tableros tablero) {
        return this.tablerosDao.getListarNoticiasRol(tablero);
    }

    public List getListarRolesNoticias() {
        return this.tablerosDao.getListarRolesNoticias();
    }
    //Fin Administrar tableros/noticias

    //Cambio Pin Docente
    public int setCambioPinDocente(Docentes docente) {
        return this.docentesDao.setCambioPinDocente(docente);
    }
    //FIN Cambio Pin Docente

    // Cambio Pin Estudiante
    public Estudiantes getMtrBuscarMatricula(Estudiantes estudiante) {
        return this.estudiantesDao.getMtrBuscarMatricula(estudiante);
    }

    public Estudiantes getMtrBuscarMatriculaNuevo(Estudiantes estudiante) {
        return this.estudiantesDao.getMtrBuscarMatriculaNuevo(estudiante);
    }

    public Estudiantes getEstBuscarEstudianteTipoGrado(Estudiantes estudiante) {
        return this.estudiantesDao.getEstBuscarEstudianteTipoGrado(estudiante);
    }

    public int setMtrModificarPinEstudiante(Estudiantes estudiante) {
        return this.estudiantesDao.setMtrModificarPinEstudiante(estudiante);
    }
    // Fin Cambio Pin Estudiante

    //Mostrar Ingreso a la UAB
    public Estudiantes getListarIngresoUAB(Estudiantes estudiante) {
        return this.estudiantesDao.getListarIngresoUAB(estudiante);
    }
    // FIN ingreso UAB
    //Administrar lbr tipos notas

    public List getTpsListarTiposEvaluaciones() {
        return this.libretasDao.getTpsListarTiposEvaluaciones();
    }
    //Administrar estado notas

    public List getTpsListarTiposEstados() {
        return this.libretasDao.getTpsListarTiposEstados();
    }

    public Libretas getTpsBuscarTipoEvaluacion(Libretas libreta) {
        return this.libretasDao.getTpsBuscarTipoEvaluacion(libreta);
    }

    public List getLbrListarFases(Libretas libreta) {
        return this.libretasDao.getLbrListarFases(libreta);
    }

    public List getLbrListarFases2(Libretas libreta) {
        return this.libretasDao.getLbrListarFases2(libreta);
    }

    public List getLbrListarTiposNotasFase(Libretas libreta) {
        return this.libretasDao.getLbrListarTiposNotasFase(libreta);
    }

    public List getStdListarEstadosTabla(Enlaces enlace) {
        return this.enlacesDao.getStdListarEstadosTabla(enlace);
    }

    public int setLbrInsertarTipoNota(Libretas libreta) {
        return this.libretasDao.setLbrInsertarTipoNota(libreta);
    }

    public int setLbrModificarTipoNota(Libretas libreta) {
        return this.libretasDao.setLbrModificarTipoNota(libreta);
    }
    //Fin Administrar lbr tipos

    // MI SEGUNDA PARTE
    // Listar - Jojo
    public List getMiListarPostulantesDip(Postulantes postulante) {
        return this.postulantesDao.getMiListarPostulantesDip(postulante);
    }

    public List getMiListarPostulantesNombre(Postulantes postulante) {
        return this.postulantesDao.getMiListarPostulantesNombre(postulante);
    }
    // Listar - Jojo
    //Registrar Postulante

    public int setMiRegistrarPstPersona(Postulantes postulante) {
        Integer idPersona = null;
        try {
            idPersona = this.postulantesDao.getIdPersonaPostulante(postulante);
        } catch (Exception ex) {
            idPersona = null;
        }
        if (idPersona == null) {
            idPersona = this.postulantesDao.setMiRegistrarPstPersona(postulante);
        }
        return idPersona;
    }

    public int setMiRegistrarPostulante(Postulantes postulante) {
        return this.postulantesDao.setMiRegistrarPostulante(postulante);
    }

    //
    public int setMiRegistrarPostulanteC(Postulantes postulante) {
        return this.postulantesDao.setMiRegistrarPostulanteC(postulante);
    }
    //

    public int setPstRegistrarDocumentos(Postulantes postulante) {
        return this.postulantesDao.setPstRegistrarDocumentos(postulante);
    }

    //LISTAR TIPOS
    public List getListarTiposDocumentos() {
        return this.postulantesDao.getListarTiposDocumentos();
    }

    public List getListarTiposAdmisiones() {
        return this.programasDao.getListarTiposAdmisiones();
    }

    public List getListarTiposAdmisionesPost() {
        return this.programasDao.getListarTiposAdmisionesPost();
    }

    public List getListarTiposAdmisionesPrograma(Programas programa) {
        return this.programasDao.getListarTiposAdmisionesPrograma(programa);
    }

    public List getListarTiposAdmisionesProgramaLiberacion(Programas programa) {
        return this.programasDao.getListarTiposAdmisionesProgramaLiberacion(programa);
    }

    public List getListarTiposGrados() {
        return this.planesDao.getListarTiposGrados();
    }

    public Planes getBuscarTiposGrados(Planes plan) {
        return this.planesDao.getBuscarTiposGrados(plan);
    }

    public List getListarPrgPlanesActual(Planes plan) {
        return this.planesDao.getListarPrgPlanesActual(plan);
    }

    public List getListarTiposDocumentosClasificacionVigente(Postulantes postulante) {
        return this.postulantesDao.getListarTiposDocumentosClasificacionVigente(postulante);
    }

    public List getListarTiposClasificaciones() {
        return this.postulantesDao.getListarTiposClasificaciones();
    }

    public List getListarTiposClasificacionesPost() {
        return this.postulantesDao.getListarTiposClasificacionesPost();
    }

    public Postulantes getPstBuscarPersona(Postulantes postulante) {
        return this.postulantesDao.getPstBuscarPersona(postulante);
    }

    //programacion automatica
    public Materias getDptoListarMateriaGrupoMinimo(Materias materia) {
        return this.materiasDao.getDptoListarMateriaGrupoMinimo(materia);
    }

    public int setPstRegistrarMatricula(Postulantes postulante) {
        return this.postulantesDao.setPstRegistrarMatricula(postulante);
    }

    public List getListarPstMateriasProgramadas(Postulantes postulante) {
        return this.postulantesDao.getListarPstMateriasProgramadas(postulante);
    }

    public Postulantes getPstBuscarPostulanteNombres(Postulantes postulante) {
        return this.postulantesDao.getPstBuscarPostulanteNombres(postulante);
    }

    public Postulantes getPstBuscarPostulanteNombresSede(Postulantes postulante) {
        return this.postulantesDao.getPstBuscarPostulanteNombresSede(postulante);
    }

    public Postulantes getPstBuscarMatriculaPostulante(Postulantes postulante) {
        return this.postulantesDao.getPstBuscarMatriculaPostulante(postulante);
    }
    // inicio - CAJAS

    public Perfiles getPrfBuscarPerfil(Perfiles perfil) {
        return this.perfilesDao.getPrfBuscarPerfil(perfil);
    }

    public List getPstListarPerfiles(Perfiles perfil) {
        return this.perfilesDao.getPstListarPerfiles(perfil);
    }

    public List getPstListarPerfilesEntidad(Perfiles perfil) {
        return this.perfilesDao.getPstListarPerfilesEntidad(perfil);
    }

    public List getPrfListarConceptos(Perfiles perfil) {
        return this.perfilesDao.getPrfListarConceptos(perfil);
    }

    public List getPstListarConceptos(Perfiles perfil) {
        return this.perfilesDao.getPstListarConceptos(perfil);
    }

    public List getEstListarConceptos(Perfiles perfil) {
        return this.perfilesDao.getEstListarConceptos(perfil);
    }

    public List getDctListarConceptos(Perfiles perfil) {
        return this.perfilesDao.getDctListarConceptos(perfil);
    }

    public List getUsrListarConceptos(Perfiles perfil) {
        return this.perfilesDao.getUsrListarConceptos(perfil);
    }

    public int setPstRegistrarTransaccion(Perfiles perfil) {
        return this.perfilesDao.setPstRegistrarTransaccion(perfil);
    }

    public Perfiles getPrcBuscarPerfil(Perfiles perfil) {
        return this.perfilesDao.getPrcBuscarPerfil(perfil);
    }

    public int setRegistrarTrnDetalle(Perfiles perfil) {
        return this.perfilesDao.setRegistrarTrnDetalle(perfil);
    }

    public Perfiles getTrnBuscarTransaccion(Perfiles perfil) {
        return this.perfilesDao.getTrnBuscarTransaccion(perfil);
    }

    public Perfiles getTrnBuscarTransaccionRecibo(Perfiles perfil) {
        return this.perfilesDao.getTrnBuscarTransaccionRecibo(perfil);
    }

    public Perfiles getTrnBuscarTransaccionReciboSede(Perfiles perfil) {
        return this.perfilesDao.getTrnBuscarTransaccionReciboSede(perfil);
    }

    public Perfiles getTrnBuscarTransaccionReciboSedePerfil(Perfiles perfil) {
        return this.perfilesDao.getTrnBuscarTransaccionReciboSedePerfil(perfil);
    }

    public List getTrnListarTrnDetalles(Perfiles perfil) {
        return this.perfilesDao.getTrnListarTrnDetalles(perfil);
    }

    public List getPrsListarConceptos(Perfiles perfil) {
        return this.perfilesDao.getPrsListarConceptos(perfil);
    }

    public int setPrsRegistrarTransaccion(Perfiles perfil) {
        return this.perfilesDao.setPrsRegistrarTransaccion(perfil);
    }

    public List getTrnListarTiposDescuentos() {
        return this.perfilesDao.getTrnListarTiposDescuentos();
    }

    public Perfiles getTrnBuscarTipoDescuento(Perfiles perfil) {
        return this.perfilesDao.getTrnBuscarTipoDescuento(perfil);
    }

    public Perfiles getBuscarPerfilConcepto(Perfiles perfil) {
        return this.perfilesDao.getBuscarPerfilConcepto(perfil);
    }

    public List getTrnListarCajeros(Perfiles perfil) {
        return this.perfilesDao.getTrnListarCajeros(perfil);
    }

    public List getTrnListarCajerosProv(Perfiles perfil) {
        return this.perfilesDao.getTrnListarCajerosProv(perfil);
    }

    public List getTrnPrcListarPerfiles(Perfiles perfil) {
        return this.perfilesDao.getTrnPrcListarPerfiles(perfil);
    }

    public List getTrnListarTransacciones(Perfiles perfil) {
        return perfilesDao.getTrnListarTransacciones(perfil);
    }

    //aqui se agrego
    public List getRepCajasTransaccionesDiarias(Perfiles perfil) {
        return perfilesDao.getRepCajasTransaccionesDiarias(perfil);
    }

    public List getRepCajasTransaccionesDiariasGlobal(Perfiles perfil) {
        return perfilesDao.getRepCajasTransaccionesDiariasGlobal(perfil);
    }
    //agregado provincia

    public List getRepCajasTransaccionesDiariasGlobalProv(Perfiles perfil) {
        return perfilesDao.getRepCajasTransaccionesDiariasGlobalProv(perfil);
    }

    //fin provincia
    //agregado reporte detallado de conceptos x cajero tdd
    public List getRepCajasTransaccionesDiariasGlobalxcajero(Perfiles perfil) {
        return perfilesDao.getRepCajasTransaccionesDiariasGlobalxcajero(perfil);
    }

    //fin provincia
    //agregado reporte detallado de conceptos x cajero provincia
    public List getRepCajasTransaccionesDiariasGlobalxcajeroProv(Perfiles perfil) {
        return perfilesDao.getRepCajasTransaccionesDiariasGlobalxcajeroProv(perfil);
    }

    //fin provincia
    public List getRepCajasTransaccionesDiariasEntidades(Perfiles perfil) {
        return perfilesDao.getRepCajasTransaccionesDiariasEntidades(perfil);
    }

    public List getRepCajasResumenTesoroEntidades(Perfiles perfil) {
        return perfilesDao.getRepCajasResumenTesoroEntidades(perfil);
    }

    public List getRepCajasResumenInstitucionalEntidades(Perfiles perfil) {
        return perfilesDao.getRepCajasResumenInstitucionalEntidades(perfil);
    }

    public List getRepCajasResumenInstitucionalEntidadesConcepto(Perfiles perfil) {
        return perfilesDao.getRepCajasResumenInstitucionalEntidadesConcepto(perfil);
    }

    public List getRepCajasResumenEstudiantilEntidades(Perfiles perfil) {
        return perfilesDao.getRepCajasResumenEstudiantilEntidades(perfil);
    }

    public List getRepCajasResumenEstudiantilEntidadesConcepto(Perfiles perfil) {
        return perfilesDao.getRepCajasResumenEstudiantilEntidadesConcepto(perfil);
    }

    public List getRepCajasResumenProfactulativoEntidades(Perfiles perfil) {
        return perfilesDao.getRepCajasResumenProfactulativoEntidades(perfil);
    }

    public List getRepCajasResumenProfactulativoCarrera(Perfiles perfil) {
        return perfilesDao.getRepCajasResumenProfactulativoCarrera(perfil);
    }

    public List getRepCajasDetalladoEntidades(Perfiles perfil) {
        return perfilesDao.getRepCajasDetalladoEntidades(perfil);
    }

    public List getRepCajasDetalladoCarrera(Perfiles perfil) {
        return perfilesDao.getRepCajasDetalladoCarrera(perfil);
    }

    public List getRepCajasTransaccionesDetalleGlobal(Perfiles perfil) {
        return perfilesDao.getRepCajasTransaccionesDetalleGlobal(perfil);
    }

    public List getRepCajasTransaccionesDetalleGlobalProv(Perfiles perfil) {
        return perfilesDao.getRepCajasTransaccionesDetalleGlobalProv(perfil);
    }

    public List getRepCajasTransaccionesDetalleGlobalAnuladas(Perfiles perfil) {
        return perfilesDao.getRepCajasTransaccionesDetalleGlobalAnuladas(perfil);
    }

    public List getRepCajasTransaccionesDetalleGlobalAnuladasProv(Perfiles perfil) {
        return perfilesDao.getRepCajasTransaccionesDetalleGlobalAnuladasProv(perfil);
    }

    public List getRepCajasTransaccionesDetalleEntidad(Perfiles perfil) {
        return perfilesDao.getRepCajasTransaccionesDetalleEntidad(perfil);
    }

    public List getRepCajasTransaccionesDetalle(Perfiles perfil) {
        return perfilesDao.getRepCajasTransaccionesDetalle(perfil);
    }

    public List getRepCajasTransaccionesDetalleAnuladas(Perfiles perfil) {
        return perfilesDao.getRepCajasTransaccionesDetalleAnuladas(perfil);
    }

    public List getRepCajasResumenMatriculas(Perfiles perfil) {
        return perfilesDao.getRepCajasResumenMatriculas(perfil);
    }

    public List getRepCajasResumenTesoroCarrera(Perfiles perfil) {
        return perfilesDao.getRepCajasResumenTesoroCarrera(perfil);
    }

    public List getRepCajasResumenMatriculasGlobal(Perfiles perfil) {
        return perfilesDao.getRepCajasResumenMatriculasGlobal(perfil);
    }
    //Nro_2

    public List getRepCajasResumenMatriculasGlobalProv(Perfiles perfil) {
        return perfilesDao.getRepCajasResumenMatriculasGlobalProv(perfil);
    }

    public List getRepCajasResumenInstitucional(Perfiles perfil) {
        return perfilesDao.getRepCajasResumenInstitucional(perfil);
    }

    public List getRepCajasResumenInstitucionalGlobal(Perfiles perfil) {
        return perfilesDao.getRepCajasResumenInstitucionalGlobal(perfil);
    }
    //Nro_3

    public List getRepCajasResumenInstitucionalGlobalProv(Perfiles perfil) {
        return perfilesDao.getRepCajasResumenInstitucionalGlobalProv(perfil);
    }

    public List getRepCajasResumenEstudiantil(Perfiles perfil) {
        return perfilesDao.getRepCajasResumenEstudiantil(perfil);
    }

    public List getRepCajasResumenEstudiantilGlobal(Perfiles perfil) {
        return perfilesDao.getRepCajasResumenEstudiantilGlobal(perfil);
    }
    //Nro_4

    public List getRepCajasResumenEstudiantilGlobalProv(Perfiles perfil) {
        return perfilesDao.getRepCajasResumenEstudiantilGlobalProv(perfil);
    }

    public List getRepCajasResumenProfacultativo(Perfiles perfil) {
        return perfilesDao.getRepCajasResumenProfacultativo(perfil);
    }

    public List getRepCajasResumenProfacultativoGlobal(Perfiles perfil) {
        return perfilesDao.getRepCajasResumenProfacultativoGlobal(perfil);
    }
    //Nro_5

    public List getRepCajasResumenProfacultativoGlobalProv(Perfiles perfil) {
        return perfilesDao.getRepCajasResumenProfacultativoGlobalProv(perfil);
    }

    public List getRepCajasResumenDetalladoMatriculas(Perfiles perfil) {
        return perfilesDao.getRepCajasResumenDetalladoMatriculas(perfil);
    }

    public List getRepCajasResumenDetalladoMatriculasGlobal(Perfiles perfil) {
        return perfilesDao.getRepCajasResumenDetalladoMatriculasGlobal(perfil);
    }

    public List getRepCajasResumenDetalladoMatriculasGlobalProv(Perfiles perfil) {
        return perfilesDao.getRepCajasResumenDetalladoMatriculasGlobalProv(perfil);
    }

    public List getRepCajasResumenDetalladoEstudiantil(Perfiles perfil) {
        return perfilesDao.getRepCajasResumenDetalladoEstudiantil(perfil);
    }

    public List getRepCajasResumenDetalladoEstudiantilGlobal(Perfiles perfil) {
        return perfilesDao.getRepCajasResumenDetalladoEstudiantilGlobal(perfil);
    }

    public List getRepCajasResumenDetalladoEstudiantilGlobalProv(Perfiles perfil) {
        return perfilesDao.getRepCajasResumenDetalladoEstudiantilGlobalProv(perfil);
    }

    public List getRepCajasResumenDetalladoInstitucional(Perfiles perfil) {
        return perfilesDao.getRepCajasResumenDetalladoInstitucional(perfil);
    }

    public List getRepCajasResumenDetalladoInstitucionalGlobal(Perfiles perfil) {
        return perfilesDao.getRepCajasResumenDetalladoInstitucionalGlobal(perfil);
    }

    public List getRepCajasResumenDetalladoInstitucionalGlobalProv(Perfiles perfil) {
        return perfilesDao.getRepCajasResumenDetalladoInstitucionalGlobalProv(perfil);
    }

    public List getRepCajasResumenDetallado(Perfiles perfil) {
        return perfilesDao.getRepCajasResumenDetallado(perfil);
    }

    public List getRepCajasResumenDetalladoGlobal(Perfiles perfil) {
        return perfilesDao.getRepCajasResumenDetalladoGlobal(perfil);
    }

    public List getRepCajasResumenDetalladoGlobalMatricula(Perfiles perfil) {
        return perfilesDao.getRepCajasResumenDetalladoGlobalMatricula(perfil);
    }

    public List getRepCajasResumenDetalladoGlobalProv(Perfiles perfil) {
        return perfilesDao.getRepCajasResumenDetalladoGlobalProv(perfil);
    }

    public List getRepCajasTransaccionesPorPrograma(Perfiles perfil) {
        return perfilesDao.getRepCajasTransaccionesPorPrograma(perfil);
    }

    public List getRepCajasResumenDetalladoEntidades(Perfiles perfil) {
        return perfilesDao.getRepCajasResumenDetalladoEntidades(perfil);
    }
    // public List getRepCajasGlobalGeneral(Perfiles perfil) {return perfilesDao.getRepCajasGlobalGeneral(perfil);}

    //hasta aqui
    public List getTrnListarTransaccionesRecibo(Perfiles perfil) {
        return perfilesDao.getTrnListarTransaccionesRecibo(perfil);
    }

    public List getTrnListarTransaccionesReciboSede(Perfiles perfil) {
        return perfilesDao.getTrnListarTransaccionesReciboSede(perfil);
    }

    public List getTrnListarTrnDetalles2(Perfiles perfil) {
        return perfilesDao.getTrnListarTrnDetalles2(perfil);
    }

    public List getTrnListarMateriasVerano(Estudiantes estudiante) {
        return this.estudiantesDao.getTrnListarMateriasVerano(estudiante);
    }

    public List getTrnListarEvaluacionesVerano() {
        return this.libretasDao.getTrnListarEvaluacionesVerano();
    }

    public List getTrnBuscarPorNroRecibo(Perfiles perfil) {
        return this.perfilesDao.getTrnBuscarPorNroRecibo(perfil);
    }

    public List getTrnBuscarPorNroReciboSede(Perfiles perfil) {
        return this.perfilesDao.getTrnBuscarPorNroReciboSede(perfil);
    }

    public void setTrnBorrarDetalle(Perfiles perfil) {
        this.perfilesDao.setTrnBorrarDetalle(perfil);
    }

    public void setTrnBorrarTransaccion(Perfiles perfil) {
        this.perfilesDao.setTrnBorrarTransaccion(perfil);
    }
    // fin - CAJAS

    //DOCENTES
    public List getBuscarListaDocentesNombres(Docentes docente) {
        return this.docentesDao.getBuscarListaDocentesNombres(docente);
    }

    public List getBuscarListaDocentesDip(Docentes docente) {
        return this.docentesDao.getBuscarListaDocentesDip(docente);
    }

    public List getListarTiposDocentes() {
        return this.docentesDao.getListarTiposDocentes();
    }

    public List getListarTiposAsignaciones() {
        return this.docentesDao.getListarTiposAsignaciones();
    }

    public List getListarTiposFunciones() {
        return this.docentesDao.getListarTiposFunciones();
    }

    public int setRegistrarAsignacionDocente(Asignaciones asignacion) {
        return this.asignacionesDao.setRegistrarAsignacionDocente(asignacion);
    }

    public int setRegistrarAsignacionDocentefac(Asignaciones asignacion) {
        return this.asignacionesDao.setRegistrarAsignacionDocentefac(asignacion);
    }

    public int setRegistrarMemo(Asignaciones asignacion) {
        return this.asignacionesDao.setRegistrarMemo(asignacion);
    }
    //Para sacar el numero del siguiente memo

    public int getTrnBuscarSiguienteNroMemo(Asignaciones asignacion) {
        return this.asignacionesDao.getTrnBuscarSiguienteNroMemo(asignacion);
    }

    public int getTrnBuscaridMemo(Asignaciones asignacion) {
        return this.asignacionesDao.getTrnBuscaridMemo(asignacion);
    }
    //Fin para sacar el numero del siguiente memo

    public int setRegistrarFaseResolucion(Asignaciones asignacion) {
        return this.asignacionesDao.setRegistrarFaseResolucion(asignacion);
    }

    public int setRegistrarFaseResolucionfac(Asignaciones asignacion) {
        return this.asignacionesDao.setRegistrarFaseResolucionfac(asignacion);
    }

    public int setRegistrarFaseResolucionuni(Asignaciones asignacion) {
        return this.asignacionesDao.setRegistrarFaseResolucionuni(asignacion);
    }

    public int setmostrarplan(Asignaciones asignacion) {
        return this.asignacionesDao.setmostrarplan(asignacion);
    }

    public int setRegistrarRetrocederFaseResolucion(Asignaciones asignacion) {
        return this.asignacionesDao.setRegistrarRetrocederFaseResolucion(asignacion);
    }

    public Asignaciones getDctVerificarAsignacionDocenteGestion(Asignaciones asignacion) {
        return this.asignacionesDao.getDctVerificarAsignacionDocenteGestion(asignacion);
    }
    //FIN DOCENTES

    public List getMiListarPstNombreGestionPeriodo(Postulantes postulante) {
        return this.postulantesDao.getMiListarPstNombreGestionPeriodo(postulante);
    }

    public List getMiListarPstDipGestionPeriodo(Postulantes postulante) {
        return this.postulantesDao.getMiListarPstDipGestionPeriodo(postulante);
    }

    public List getMiListarPstAprobadoNombreGestionPeriodo(Postulantes postulante) {
        return this.postulantesDao.getMiListarPstAprobadoNombreGestionPeriodo(postulante);
    }

    public List getMiListarPstAprobadoDipGestionPeriodo(Postulantes postulante) {
        return this.postulantesDao.getMiListarPstAprobadoDipGestionPeriodo(postulante);
    }

    //PERSONAS
    public List getListarPaises() {
        return this.personasDao.getListarPaises();
    }

    public List getListarDepartamentos(Personas persona) {
        return this.personasDao.getListarDepartamentos(persona);
    }

    public List getListarProvincias(Personas persona) {
        return this.personasDao.getListarProvincias(persona);
    }

    public List getListarLocalidades(Personas persona) {
        return this.personasDao.getListarLocalidades(persona);
    }

    public List getListarLocalidadesTodas() {
        return this.personasDao.getListarLocalidadesTodas();
    }

    public List getListarTiposSexos() {
        return this.personasDao.getListarTiposSexos();
    }

    public List getListarTiposEstadosCiviles() {
        return this.personasDao.getListarTiposEstadosCiviles();
    }

    public List getListarTiposEmpresasTelef() {
        return this.personasDao.getListarTiposEmpresasTelef();
    }

    public List getListarTiposEstudiantes() {
        return this.personasDao.getListarTiposEstudiantes();
    }

    public Personas getBuscarTipoEstudiante(Personas persona) {
        return this.personasDao.getBuscarTipoEstudiante(persona);
    }

    public List getListarTiposGraduaciones() {
        return this.personasDao.getListarTiposGraduaciones();
    }

    public List getListarTiposInstituciones() {
        return this.personasDao.getListarTiposInstituciones();
    }

    public List getListarColegiosTipoIns(Personas persona) {
        return this.personasDao.getListarColegiosTipoIns(persona);
    }

    public List getListarTiposTurnos() {
        return this.personasDao.getListarTiposTurnos();
    }

    public List getListarTiposProblemasRol(Personas persona) {
        return this.personasDao.getListarTiposProblemasRol(persona);
    }

    public int setRegistrarPersona(Personas persona) {
        return this.personasDao.setRegistrarPersona(persona);
    }

    public int setRegistrarPrsColegio(Personas persona) {
        return this.personasDao.setRegistrarPrsColegio(persona);
    }

    public int setRegistrarPrsClasificacion(Personas persona) {
        return this.personasDao.setRegistrarPrsClasificacion(persona);
    }

    public int setRegistrarPrsDocumentos(Personas persona) {
        return this.personasDao.setRegistrarPrsDocumentos(persona);
    }

    public int setRegistrarPrsCompromisos(Personas persona) {
        return this.personasDao.setRegistrarPrsCompromisos(persona);
    }

    public List getListarPrsDocumentosPersona(Personas persona) {
        return this.personasDao.getListarPrsDocumentosPersona(persona);
    }

    public Personas getBuscarTipoClasificacionPersona(Personas persona) {
        return this.personasDao.getBuscarTipoClasificacionPersona(persona);
    }

    public List getListarTiposCompromisos() {
        return this.personasDao.getListarTiposCompromisos();
    }

    public Personas getBuscarPersonaColegio(Personas persona) {
        return this.personasDao.getBuscarPersonaColegio(persona);
    }
    // FIN PERSONAS
    //Estudiante

    public int setRegistrarEstudiante(Estudiantes estudiante) {
        return this.estudiantesDao.setRegistrarEstudiante(estudiante);
    }

    public int setModificarEstudiante(Estudiantes estudiante) {
        return this.estudiantesDao.setModificarEstudiante(estudiante);
    }

    public Estudiantes getEstBuscarEstudiantePrs(Estudiantes estudiante) {
        return this.estudiantesDao.getEstBuscarEstudiantePrs(estudiante);
    }

    public Estudiantes getEstBuscarEstudiantePrsSede(Estudiantes estudiante) {
        return this.estudiantesDao.getEstBuscarEstudiantePrsSede(estudiante);
    }

    public Estudiantes getEstBuscarEstudiantePrsPos(Estudiantes estudiante) {
        return this.estudiantesDao.getEstBuscarEstudiantePrsPos(estudiante);
    }

    public Estudiantes getEstBuscarEstudiantePrsPre(Estudiantes estudiante) {
        return this.estudiantesDao.getEstBuscarEstudiantePrsPre(estudiante);
    }

    public Estudiantes getEstBuscarEstudiantePrsPreSede(Estudiantes estudiante) {
        return this.estudiantesDao.getEstBuscarEstudiantePrsPreSede(estudiante);
    }

    public int setPstModificarEstadoPostulante(Postulantes postulante) {
        return this.postulantesDao.setPstModificarEstadoPostulante(postulante);
    }

    public int setRegistrarMatriculaEstudiante(Estudiantes estudiante) {
        return this.estudiantesDao.setRegistrarMatriculaEstudiante(estudiante);
    }

    public Estudiantes getBuscarMatriculaEstPrs(Estudiantes estudiante) {
        return this.estudiantesDao.getBuscarMatriculaEstPrs(estudiante);
    }
    // inicio JOJO

    public Estudiantes getMiPrsBuscarEstudiante(Estudiantes estudiante) {
        return this.estudiantesDao.getMiPrsBuscarEstudiante(estudiante);
    }

    //Fin Estudiante
    // CURRICULUM
    public List cvGetListarRubrosPersona(Curriculum curriculum) {
        return this.curriculumDao.cvGetListarRubrosPersona(curriculum);
    }

    public List cvGetListarRubros(Curriculum curriculum) {
        return this.curriculumDao.cvGetListarRubros(curriculum);
    }

    public List cvGetListarSubRubros(Curriculum curriculum) {
        return this.curriculumDao.cvGetListarSubRubros(curriculum);
    }

    public int cvSetRegistrarCurriculum(Curriculum curriculum) {
        return this.curriculumDao.cvSetRegistrarCurriculum(curriculum);
    }

    public int setRegistrarDctAdjuntos(Curriculum curriculum) {
        return this.curriculumDao.setRegistrarDctAdjuntos(curriculum);
    }

    public List getListarAdjuntosDocente(Curriculum curriculum) {
        return this.curriculumDao.getListarAdjuntosDocente(curriculum);
    }

    public int setEliminarDctAdjunto(Curriculum curriculum) {
        return this.curriculumDao.setEliminarDctAdjunto(curriculum);
    }

    //FIN CURRICULUM
    public Docentes getBuscarDocente(Docentes docente) {
        return this.docentesDao.getBuscarDocente(docente);
    }

    public Docentes getBuscarDocentexdepartamento(Docentes docente) {
        return this.docentesDao.getBuscarDocentexdepartamento(docente);
    }

    //  FIN MI SEGUNDA PARTE 
    // INICIO - Ver Ficha Academica
    public Estudiantes getEstBuscarEstudianteNombres(Estudiantes estudiante) {
        return this.estudiantesDao.getEstBuscarEstudianteNombres(estudiante);
    }

    public Estudiantes getEstBuscarEstudianteNombresSede(Estudiantes estudiante) {
        return this.estudiantesDao.getEstBuscarEstudianteNombresSede(estudiante);
    }

    public Estudiantes getEstBuscarEstudianteNombresSedePostgrado(Estudiantes estudiante) {
        return this.estudiantesDao.getEstBuscarEstudianteNombresSedePostgrado(estudiante);
    }

    public List getEstListarFichaAcademica(Estudiantes estudiante) {
        return this.estudiantesDao.getEstListarFichaAcademica(estudiante);
    }

    public List getEstListarFichaAcademicaModificar(Estudiantes estudiante) {
        return this.estudiantesDao.getEstListarFichaAcademicaModificar(estudiante);
    }

    public List getEstListarFichaAcademicaConvalidada(Estudiantes estudiante) {
        return this.estudiantesDao.getEstListarFichaAcademicaConvalidada(estudiante);
    }

    public List getEstListarFichaAcademicaConvalidada2(Estudiantes estudiante) {
        return this.estudiantesDao.getEstListarFichaAcademicaConvalidada2(estudiante);
    }

    public List getEstListarFichaAcademicaAprobadas(Estudiantes estudiante) {
        return this.estudiantesDao.getEstListarFichaAcademicaAprobadas(estudiante);
    }
    // FIN - Ver Ficha Academica

    // INICIO - Ver Programacion
    public List getEstListarProgramacion(Estudiantes estudiante) {
        return this.estudiantesDao.getEstListarProgramacion(estudiante);
    }

    public List getEstListarProgramacioncv(Estudiantes estudiante) {
        return this.estudiantesDao.getEstListarProgramacioncv(estudiante);
    }
    // FIN - Ver Programacion

    // INICIO - Cambio de plan de estudios
    public int setEstRegistrarCambioPlan(Planes plan) {
        return this.estudiantesDao.setEstRegistrarCambioPlan(plan);
    }
    // FIN - Cambio de plan de estudios

    // INICIO - Convalidacion Automatica
    public List getListarMateriasPlanGrupo(Planes plan) {
        return this.planesDao.getListarMateriasPlanGrupo(plan);
    }

    public List getListarMateriasPlanGrupoCantidad(Planes plan) {
        return this.planesDao.getListarMateriasPlanGrupoCantidad(plan);
    }

    public List getListarMateriasPlan(Planes plan) {
        return this.planesDao.getListarMateriasPlan(plan);
    }

    public List getListarMateriasPlanAnterior(Planes plan) {
        return this.planesDao.getListarMateriasPlanAnterior(plan);
    }

    public List getListarMateriasPlanAnterior2(Planes plan) {
        return this.planesDao.getListarMateriasPlanAnterior2(plan);
    }

    public List getListarMateriasPlanConvalidado(Planes plan) {
        return this.planesDao.getListarMateriasPlanConvalidado(plan);
    }

    public int setRegistrarMtrPlan(Planes plan) {
        return this.planesDao.setRegistrarMtrPlan(plan);
    }

    public int setEliminarMtrPlan(Planes plan) {
        return this.planesDao.setEliminarMtrPlan(plan);
    }

    public Planes getMncBuscarMencion(Planes plan) {
        return this.planesDao.getMncBuscarMencion(plan);
    }

    public Planes getBuscarMateriaPlan(Planes plan) {
        return this.planesDao.getBuscarMateriaPlan(plan);
    }
    // FIN - Convalidacion Automatica

    // INICIO - Materias no aprobadas
    public List getEstListarMateriasNoAprobadas(Estudiantes estudiante) {
        return this.estudiantesDao.getEstListarMateriasNoAprobadas(estudiante);
    }
    // FIN - Materias no aprobadas

    //Listar Tipos Cajas
    public List getTrnListarTiposPerfiles() {
        return this.perfilesDao.getTrnListarTiposPerfiles();
    }

    public List getTrnMiListarPerfilesProceso(Perfiles perfil) {
        return this.perfilesDao.getTrnMiListarPerfilesProceso(perfil);
    }

    public Perfiles getTrnBuscarPerfilProceso(Perfiles perfil) {
        return this.perfilesDao.getTrnBuscarPerfilProceso(perfil);
    }

    public int getTrnPerfilTieneDescuento(Perfiles perfil) {
        return this.perfilesDao.getTrnPerfilTieneDescuento(perfil);
    }
    //Fin Listar Tipos Cajas

    //INICIO - Perfiles Materias
    public List getTrnListarPerfilesMaterias(Planes plan) {
        return this.perfilesDao.getTrnListarPerfilesMaterias(plan);
    }

    public Perfiles getTrnBuscarPerfilMateria(Perfiles perfil) {
        return this.perfilesDao.getTrnBuscarPerfilMateria(perfil);
    }

    public List getTrnListarPerfiles() {
        return this.perfilesDao.getTrnListarPerfiles();
    }

    public Perfiles getTrnBuscarPerfil(Perfiles perfil) {
        return this.perfilesDao.getTrnBuscarPerfil(perfil);
    }

    public int setTrnRegistrarPerfilMateria(Planes plan) {
        return this.perfilesDao.setTrnRegistrarPerfilMateria(plan);
    }
    //FIN - Perfiles Materias

    //Matricula antiguo
    public List getMtrListarMatriculasEstudiante(Estudiantes estudiante) {
        return this.estudiantesDao.getMtrListarMatriculasEstudiante(estudiante);
    }
    //Fin Matricula antiguo

    //INICIO- Admin Planes de Estudio
    public List getListarMateriasPlanRequisitos(Planes plan) {
        return this.planesDao.getListarMateriasPlanRequisitos(plan);
    }

    public List getListarMateriasElectivasPlan(Planes plan) {
        return this.planesDao.getListarMateriasElectivasPlan(plan);
    }

    public List getListarMateriasPlanMencion(Planes plan) {
        return this.planesDao.getListarMateriasPlanMencion(plan);
    }

    public List getListarMateriasRequisitos(Planes plan) {
        return this.planesDao.getListarMateriasRequisitos(plan);
    }

    public List getListarMateriasNoRequisitos(Planes plan) {
        return this.planesDao.getListarMateriasNoRequisitos(plan);
    }

    public List getListarMateriasConvalidadas(Planes plan) {
        return this.planesDao.getListarMateriasConvalidadas(plan);
    }

    public List getListarMateriasNoConvalidadas(Planes plan) {
        return this.planesDao.getListarMateriasNoConvalidadas(plan);
    }

    public List getListarMateriasNoPlan(Planes plan) {
        return this.planesDao.getListarMateriasNoPlan(plan);
    }

    public List getPlnListarTiposMaterias() {
        return this.planesDao.getPlnListarTiposMaterias();
    }

    public Planes getPlnBuscarTipoMateria(Planes plan) {
        return this.planesDao.getPlnBuscarTipoMateria(plan);
    }

    public Planes getBuscarPrgPlan(Planes plan) {
        return this.planesDao.getBuscarPrgPlan(plan);
    }

    public Planes getBuscarPrgPlan2(Planes plan) {
        return this.planesDao.getBuscarPrgPlan2(plan);
    }

    public Planes getBuscarMtrPlan(Planes plan) {
        return this.planesDao.getBuscarMtrPlan(plan);
    }

    public int setModificarMtrPlan(Planes plan) {
        return this.planesDao.setModificarMtrPlan(plan);
    }
    //FIN - Admin Planes de Estudio
    // Cambiar estado estudiante

    public int setRegistrarCambiarEstadoEstudiante(Estudiantes estudiante) {
        return this.estudiantesDao.setRegistrarCambiarEstadoEstudiante(estudiante);
    }

    public int setRegistrarCambiarEstadoMatricula(Estudiantes estudiante) {
        return this.estudiantesDao.setRegistrarCambiarEstadoMatricula(estudiante);
    }
    // Fin cambiar estado estudiante
    //Pst Personas

    public List getPstListarPersonasNombre(Postulantes postulante) {
        return this.postulantesDao.getPstListarPersonasNombre(postulante);
    }

    public List getPstListarPersonasDip(Postulantes postulante) {
        return this.postulantesDao.getPstListarPersonasDip(postulante);
    }

    public List getMiListarPstProgramaGestionPeriodo(Postulantes postulante) {
        return this.postulantesDao.getMiListarPstProgramaGestionPeriodo(postulante);
    }

    public List getMiListarPstProgramaGestionPeriodoSede(Postulantes postulante) {
        return this.postulantesDao.getMiListarPstProgramaGestionPeriodoSede(postulante);
    }

    public List getMiListarPstPsaGestionPeriodo(Postulantes postulante) {
        return this.postulantesDao.getMiListarPstPsaGestionPeriodo(postulante);
    }

    public List getRepAsistenciapostulantepsa(Postulantes postulante) {
        return this.postulantesDao.getRepAsistenciapostulantepsa(postulante);
    }

    public int setPstModificarAsistenciaPostulante(Postulantes postulante) {
        return this.postulantesDao.setPstModificarAsistenciaPostulante(postulante);
    }

    public List getRepAsistenciapostulantepsaci(Postulantes postulante) {
        return this.postulantesDao.getRepAsistenciapostulantepsaci(postulante);
    }

    public List getDctListarPostulantespsasoloid(Postulantes postulante) {
        return this.postulantesDao.getDctListarPostulantespsasoloid(postulante);
    }

    public List getNroPostulantesPsa(Postulantes postulante) {
        return this.postulantesDao.getNroPostulantesPsa(postulante);
    }

    //Fin Pst Personas
    //Personas
    public List getPrsListarPersonasDip(Personas persona) {
        return this.personasDao.getPrsListarPersonasDip(persona);
    }
    //Items Persona

    public List getListarItemsPersonasDip(Personas persona) {
        return this.personasDao.getListarItemsPersonasDip(persona);
    }

    public Personas getBuscarItemPersona(Personas persona) {
        return this.personasDao.getBuscarItemPersona(persona);
    }

    public Personas getBuscarItemsUsuario(Personas persona) {
        return this.personasDao.getBuscarItemsUsuario(persona);
    }

    //Adjunto Estudiante
    public int setRegistrarEstAdjuntos(Estudiantes estudiante) {
        return this.estudiantesDao.setRegistrarEstAdjuntos(estudiante);
    }

    public List getListarAdjuntosEstudiante(Estudiantes estudiante) {
        return this.estudiantesDao.getListarAdjuntosEstudiante(estudiante);
    }

    public int setEliminarEstAdjunto(Estudiantes estudiante) {
        return this.estudiantesDao.setEliminarEstAdjunto(estudiante);
    }
    //Fin Adjunto Estudiante

    public List getMiListarPostulantesPorPersona(Postulantes postulante) {
        return this.postulantesDao.getMiListarPostulantesPorPersona(postulante);
    }

    public int setRegistrarPstPrsColegio(Postulantes postulante) {
        return this.postulantesDao.setRegistrarPstPrsColegio(postulante);
    }

    public Postulantes getBuscarPstPersonaColegio(Postulantes postulante) {
        return this.postulantesDao.getBuscarPstPersonaColegio(postulante);
    }

    public List getListarPrgPlanesVestibulares() {
        return this.planesDao.getListarPrgPlanesVestibulares();
    }

    public List getListarPrgPlanesUniversitarios() {
        return this.planesDao.getListarPrgPlanesUniversitarios();
    }

    public Planes getBuscarMaxPrgPlanActual(Planes plan) {
        return this.planesDao.getBuscarMaxPrgPlanActual(plan);
    }

    //reporte libretas
    public List getListarNotasFaseEstudiantes(Libretas libreta) {
        return this.libretasDao.getListarNotasFaseEstudiantes(libreta);
    }
    //FIN reporte libretas 

    //reporte resumen de notas
    public List getListarDocentesProgramados(Asignaciones asignacion) {
        return this.asignacionesDao.getListarDocentesProgramados(asignacion);
    }

    public List getListarResumenNotasEstudiantes(Libretas libreta) {
        return this.libretasDao.getListarResumenNotasEstudiantes(libreta);
    }
    //FIN reporte resumen de notas

    //reporte Acta de calificaciones
    public List getListarActaCalificaciones(Notas nota) {
        return this.notasDao.getListarActaCalificaciones(nota);
    }
    //Fin reporte Acta de calificaciones

    //CERRAR LIBRETA POR MATERIA
    public List getListarMateriasCerrarLibretaIndiv(Libretas libreta) {
        return this.libretasDao.getListarMateriasCerrarLibretaIndiv(libreta);
    }

    public int setCerrarLibretaPorMateria(Libretas libreta) {
        return this.libretasDao.setCerrarLibretaPorMateria(libreta);
    }
    //FIN CERRAR LIBRETA  POR MATERIA

    //Inicio Estadisticas
    public List getListarNroEstudiantesMatriculados(Estudiantes estudiante) {
        return this.estudiantesDao.getListarNroEstudiantesMatriculados(estudiante);
    }

    public List getListarNroEstMatriculadosSexosNacionalidades(Estudiantes estudiante) {
        return this.estudiantesDao.getListarNroEstMatriculadosSexosNacionalidades(estudiante);
    }

    public List getListarNroEstMatriculadosTipoEstudiante(Estudiantes estudiante) {
        return this.estudiantesDao.getListarNroEstMatriculadosTipoEstudiante(estudiante);
    }

    public List getListarNroEstMatriculadosTipoAdmision(Estudiantes estudiante) {
        return this.estudiantesDao.getListarNroEstMatriculadosTipoAdmision(estudiante);
    }

    public List getListarNroEstMatriculadosSexos(Estudiantes estudiante) {
        return this.estudiantesDao.getListarNroEstMatriculadosSexos(estudiante);
    }

    public List getListarNroEstMatriculadosNacionalidad(Estudiantes estudiante) {
        return this.estudiantesDao.getListarNroEstMatriculadosNacionalidad(estudiante);
    }

    public List getListarGradosProgramas(Programas programa) {
        return this.programasDao.getListarGradosProgramas(programa);
    }

    public List getListarNroEstProgramadosMaterias(Estudiantes estudiante) {
        return this.estudiantesDao.getListarNroEstProgramadosMaterias(estudiante);
    }

    public List getListarNroEstProgramadosSexosNacionalidades(Estudiantes estudiante) {
        return this.estudiantesDao.getListarNroEstProgramadosSexosNacionalidades(estudiante);
    }

    public List getListarNroPostProgramadosMaterias(Estudiantes estudiante) {
        return this.estudiantesDao.getListarNroPostProgramadosMaterias(estudiante);
    }

    public List getListarNroEstProgAprReprAbaMaterias(Estudiantes estudiante) {
        return this.estudiantesDao.getListarNroEstProgAprReprAbaMaterias(estudiante);
    }

    public List getListarNroEstAproPreU(Estudiantes estudiante) {
        return this.estudiantesDao.getListarNroEstAproPreU(estudiante);
    }

    public List getListarNroEstAproAdmiEsp(Estudiantes estudiante) {
        return this.estudiantesDao.getListarNroEstAproAdmiEsp(estudiante);
    }

    public List getListarNroEstAproPreUSexosNacionalidad(Estudiantes estudiante) {
        return this.estudiantesDao.getListarNroEstAproPreUSexosNacionalidad(estudiante);
    }

    public List getListarNroEstAproAdEspSexosNacionalidad(Estudiantes estudiante) {
        return this.estudiantesDao.getListarNroEstAproAdEspSexosNacionalidad(estudiante);
    }

    public List getListarMateriasGradoPlanPrograma(Materias materia) {
        return this.materiasDao.getListarMateriasGradoPlanPrograma(materia);
    }
    //Fin Estadisticas

    // Inicio Reportes Academicos
    //reporte certificado de calificaciones
    public List getListarCerticadoCalificaciones(Libretas libreta) {
        return this.libretasDao.getListarCerticadoCalificaciones(libreta);
    }
    //FIN reporte certificado de calificaciones

    //Buscar programa de estudiante
    public Programas getPrgBuscarProgramaEstudiante(Programas programa) {
        return this.programasDao.getPrgBuscarProgramaEstudiante(programa);
    }
    //fin Buscar programa de estudiante

    //listar datos detalle de programacion
    public List getEstListarDetalleProgramacion(Estudiantes estudiante) {
        return this.estudiantesDao.getEstListarDetalleProgramacion(estudiante);
    }
    //fin  listar datos detalle de programacion

    //INICIO - Listar estudiantes por Grupos
    public List getEstListarEstudiantesPorGrupos(Estudiantes estudiante) {
        return this.estudiantesDao.getEstListarEstudiantesPorGrupos(estudiante);
    }
    //FIN - Listar estudiantes por Grupos

    //listar detalle de materia notas contnua
    public List getEstListarNotasEvaluacionContinua(Libretas libreta) {
        return this.libretasDao.getEstListarNotasEvaluacionContinua(libreta);
    }
    //fin listar detalle de materia notas contnua

    //listar evaluacion continua estudiantes
    public List getListarEstudiantesEvaluacionContinua(Libretas libreta) {
        return this.libretasDao.getListarEstudiantesEvaluacionContinua(libreta);
    }
    //fin listar evaluacion continua estudiantes

    //listar fases y tipos notas de la definicion de evaluacion
    public List getLbrTiposnotasListarDefinicion(Libretas libreta) {
        return this.libretasDao.getLbrTiposnotasListarDefinicion(libreta);
    }
    //fin listar fases y tipos notas de la definicion de evaluacion
    // Fin Reportes Academicos

    //Retroceder Fase
    //modificar fase docente asignacion
    public int setModificarFaseDocente(Libretas libreta) {
        return this.libretasDao.setModificarFaseDocente(libreta);
    }

    public int setModificarFaseDocenteCerrarLibreta(Libretas libreta) {
        return this.libretasDao.setModificarFaseDocenteCerrarLibreta(libreta);
    }
    //fin modificar fase docente asignacion

    //Eliminar Fase calculado
    public int setEliminarFaseEstLibretas(Libretas libreta) {
        return this.libretasDao.setEliminarFaseEstLibretas(libreta);
    }
    //fin eliminar fase calculado
    //FIN Retroceder Fase

    //Bloquear estudiantes todos
    public int setBloquearEstudiantesTodos(Estudiantes estudiante) {
        return this.estudiantesDao.setBloquearEstudiantesTodos(estudiante);
    }
    //Fin Bloquear estudiantes todos 

    //Modificar Tipo Estudiante
    public int setModificarTipoEstudiante(Estudiantes estudiante) {
        return this.estudiantesDao.setModificarTipoEstudiante(estudiante);
    }
    //Fin Modificar Tipo Estudiante 

    //Listar PrsCompromisos
    public List getListarPrsCompromisosPersona(Personas persona) {
        return this.personasDao.getListarPrsCompromisosPersona(persona);
    }

    public List getListarPrsDocumentosClasificacion(Personas persona) {
        return this.personasDao.getListarPrsDocumentosClasificacion(persona);
    }

    public int getBuscarPrsDocumentacionCompleta(Personas persona) {
        return this.personasDao.getBuscarPrsDocumentacionCompleta(persona);
    }

    public int getBuscarPrsDocumentacionCompletaDoc(Personas persona) {
        return this.personasDao.getBuscarPrsDocumentacionCompletaDoc(persona);
    }
    //Fin Listar PrsCompromisos

    // COMPROMISOS
    public List getMiEstListarCompromisos(Estudiantes estudiante) {
        return this.estudiantesDao.getMiEstListarCompromisos(estudiante);
    }

    public Personas getMiBuscarCompromiso(Personas persona) {
        return this.personasDao.getMiBuscarCompromiso(persona);
    }

    public int getMiPrsNroCompromisos(Personas persona) {
        return this.personasDao.getMiPrsNroCompromisos(persona);
    }

    public int getMiEstListarCompromisosCant(Estudiantes estudiante) {
        return this.estudiantesDao.getMiEstListarCompromisosCant(estudiante);
    }

    // fin - COMPROMISOS
    //est_programacion
    public int setRegistrarEstProgramacionTipo(Estudiantes estudiante) {
        return this.estudiantesDao.setRegistrarEstProgramacionTipo(estudiante);
    }
    //fin est_programacion

    //dct_asignacion x programa
    public List getDctListarAsignacionDocenteProgramaPlan(Asignaciones asignacion) {
        return this.asignacionesDao.getDctListarAsignacionDocenteProgramaPlan(asignacion);
    }

    // PRG_grados_Academicos  
    public Libretas getBuscarGradoAcademicoPrograma(Libretas libreta) {
        return this.libretasDao.getBuscarGradoAcademicoPrograma(libreta);
    }

    //ListarPreCierreNotas
    public List getListarActaCalificacionesPreCierre(Notas nota) {
        return this.notasDao.getListarActaCalificacionesPreCierre(nota);
    }

    //INICIO - Buscar docentes
    public List getListarAsignacionDocenteTodas(Asignaciones asignacion) {
        return this.asignacionesDao.getListarAsignacionDocenteTodas(asignacion);
    }
    //FIN - Buscar docentes

    //Listar Notas por Fase
    public List getListarActaCalificacionesPorFase(Notas nota) {
        return this.notasDao.getListarActaCalificacionesPorFase(nota);
    }

    public List getEstListarProgramasEstudiante(Estudiantes estudiante) {
        return this.estudiantesDao.getEstListarProgramasEstudiante(estudiante);
    }

    public List getEstListarMatriculadosPorPrograma(Estudiantes estudiante) {
        return this.estudiantesDao.getEstListarMatriculadosPorPrograma(estudiante);
    }

    public List getEstListarMatriculadosPorProgramaTipoAdmision(Estudiantes estudiante) {
        return this.estudiantesDao.getEstListarMatriculadosPorProgramaTipoAdmision(estudiante);
    }

    //Buscar est_programacion
    public Estudiantes getMiBuscarEstProgramacion(Estudiantes estudiante) {
        return this.estudiantesDao.getMiBuscarEstProgramacion(estudiante);
    }

    //Listar plan por tipo_grado
    public List getListarMateriasPlanTipoGrado(Planes plan) {
        return this.planesDao.getListarMateriasPlanTipoGrado(plan);
    }

    //Estadistica Postulantes
    public List getNroPstInscritosHabilitados(Postulantes postulante) {
        return this.postulantesDao.getNroPstInscritosHabilitados(postulante);
    }

    public List getNroPstInscritosHabilitadosTipoAdmision(Postulantes postulante) {
        return this.postulantesDao.getNroPstInscritosHabilitadosTipoAdmision(postulante);
    }

    //Fin Estadistica Postulantes
    //Cambio de programa_anterior postulante
    public int setPstRegistrarProgramaAnterior(Postulantes postulante) {
        return this.postulantesDao.setPstRegistrarProgramaAnterior(postulante);
    }

    //INICIO - Rectificacion de notas
    public List getListarNotasRectificar(Notas nota) {
        return this.notasDao.getListarNotasRectificar(nota);
    }

    public Notas getBuscarNota(Notas nota) {
        return this.notasDao.getBuscarNota(nota);
    }

    public Notas getEstListarFichaAcademicaBuscar(Notas nota) {
        return this.notasDao.getEstListarFichaAcademicaBuscar(nota);
    }

    public Notas getEstListarFichaAcademicaBuscarBuscarAnulada(Notas nota) {
        return this.notasDao.getEstListarFichaAcademicaBuscarBuscarAnulada(nota);
    }

    public int setRegistrarRectificacion(Notas nota) {
        return this.notasDao.setRegistrarRectificacion(nota);
    }

    public int setRegistrarRectificacionNota(Notas nota) {
        return this.notasDao.setRegistrarRectificacionNota(nota);
    }

    //FIN - Rectificacion de notas
    //  inicio - GRUPOS jojo
    public List getPrgListarGrupos(Grupos grupo) {
        return this.gruposDao.getPrgListarGrupos(grupo);
    }

    public List getMtrListarGruposNoAsignados(Grupos grupo) {
        return this.gruposDao.getMtrListarGruposNoAsignados(grupo);
    }

    public Grupos getMiDptoBuscarGrupo(Grupos grupo) {
        return this.gruposDao.getMiDptoBuscarGrupo(grupo);
    }
    //  fin - GRUPOS jojo

    //Inicio dct_asignacion
    //dct_asignacion x programa plan tipo programa
    public List getDctListarAsignacionDocenteProgramaPlanTipoGrado(Asignaciones asignacion) {
        return this.asignacionesDao.getDctListarAsignacionDocenteProgramaPlanTipoGrado(asignacion);
    }
    //dct_asignacion planes-grupos

    public List getDptoListarGruposMateriaTipoEvaluacion(Materias materia) {
        return this.gruposDao.getDptoListarGruposMateriaTipoEvaluacion(materia);
    }

    public List getDptoListarGruposMateriaTipoEvaluacionDesignado(Materias materia) {
        return this.gruposDao.getDptoListarGruposMateriaTipoEvaluacionDesignado(materia);
    }

    //listar docentes todos
    public List getListarDocentesTodos() {
        return this.docentesDao.getListarDocentesTodos();
    }

    //Fin dct_asignacion
    //Listar TiposNotas
    public List getListarTiposNotas() {
        return this.libretasDao.getListarTiposNotas();
    }

    //Buscar Lbr Fase
    public Libretas getBuscarLbrFase(Libretas libreta) {
        return this.libretasDao.getBuscarLbrFase(libreta);
    }

    public Libretas getBuscarLbrTipoNota(Libretas libreta) {
        return this.libretasDao.getBuscarLbrTipoNota(libreta);
    }

    public int setLbrRegistrarTipoNota(Libretas libreta) {
        return this.libretasDao.setLbrRegistrarTipoNota(libreta);
    }

    public int setLbrEliminarTipoNota(Libretas libreta) {
        return this.libretasDao.setLbrEliminarTipoNota(libreta);
    }

    //Cerrar Libreta por Dct Asignacion
    public List getListarMateriasCerrarLibretaDctAsignacion(Materias materia) {
        return this.asignacionesDao.getListarMateriasCerrarLibretaDctAsignacion(materia);
    }
    //Lista estudiantes libretas

    public List getListarEstudiantesParaCierreLibreta(Libretas libreta) {
        return this.libretasDao.getListarEstudiantesParaCierreLibreta(libreta);
    }

    public List getListarEstudiantesEnEstLibretas(Libretas libreta) {
        return this.libretasDao.getListarEstudiantesEnEstLibretas(libreta);
    }

    //INICIO - Impresion de Certificado de Notas
    public List getListarCertificadoNotasTodas(Estudiantes estudiante) {
        return this.notasDao.getListarCertificadoNotasTodas(estudiante);
    }

    public List getListarCertificadoNotasNivel(Estudiantes estudiante) {
        return this.notasDao.getListarCertificadoNotasNivel(estudiante);
    }

    public List getListarCertificadoNotasAprobadas(Estudiantes estudiante) {
        return this.notasDao.getListarCertificadoNotasAprobadas(estudiante);
    }
    //FIN - Impresion de Certificado de Notas

    //INICIO2 - Impresion de Certificado de Notas
    public List getListarCertificadoNotasTodas2(Estudiantes estudiante) {
        return this.notasDao.getListarCertificadoNotasTodas2(estudiante);
    }

    public List getListarCertificadoNotasAprobadas2(Estudiantes estudiante) {
        return this.notasDao.getListarCertificadoNotasAprobadas2(estudiante);
    }

    public List getListarCertificadoNotasTodas3(Estudiantes estudiante) {
        return this.notasDao.getListarCertificadoNotasTodas3(estudiante);
    }

    public List getListarCertificadoNotasAprobadas3(Estudiantes estudiante) {
        return this.notasDao.getListarCertificadoNotasAprobadas3(estudiante);
    }

    public List getListarHistorialAcademico(Estudiantes estudiante) {
        return this.notasDao.getListarHistorialAcademico(estudiante);
    }
    //FIN - Impresion de Certificado de Notas

    public List getListarEvaluacionesFinalesFase(Libretas libreta) {
        return this.libretasDao.getListarEvaluacionesFinalesFase(libreta);
    }

    public List getTotalAprobadosReprobadosMateria(Libretas libreta) {
        return this.libretasDao.getTotalAprobadosReprobadosMateria(libreta);
    }

    //Lista notas ponderadas
    public List getListarNotasEstudiantesLibretas(Libretas libreta) {
        return this.libretasDao.getListarNotasEstudiantesLibretas(libreta);
    }

    public List getListarCalificacionCalendario(Libretas libreta) {
        return this.libretasDao.getListarCalificacionCalendario(libreta);
    }

    public List getListarCalificacionCalendarioDocente(Libretas libreta) {
        return this.libretasDao.getListarCalificacionCalendarioDocente(libreta);
    }

    //Eliminar Asignacion Docente Materia
    public int setEliminarAsignacionDocenteMateria(Asignaciones asignacion) {
        return this.asignacionesDao.setEliminarAsignacionDocenteMateria(asignacion);
    }

    //Devuelve id fase resolucion
    public int setBuscar_id_fase_resolucion(Asignaciones asignacion) {
        return this.asignacionesDao.setBuscar_id_fase_resolucion(asignacion);
    }

    public int setBuscar_id_fase_resolucionFinal(Asignaciones asignacion) {
        return this.asignacionesDao.setBuscar_id_fase_resolucionFinal(asignacion);
    }

    // Matriculados Por Tipos de Estudiantes
    public List getEstListarMatriculadosPorProgramaTipoEstudiante(Estudiantes estudiante) {
        return this.estudiantesDao.getEstListarMatriculadosPorProgramaTipoEstudiante(estudiante);
    }

    // Listado de Postulantes Inscritos
    public List getPstListarInscritosPorProgramaTipoAdmision(Postulantes postulante) {
        return this.postulantesDao.getPstListarInscritosPorProgramaTipoAdmision(postulante);
    }

    // Listado de Postulantes Aprobados
    public List getPstListarAprobadosPorProgramaTipoAdmision(Postulantes postulante) {
        return this.postulantesDao.getPstListarAprobadosPorProgramaTipoAdmision(postulante);
    }

    // Listado de Postulantes Reprobados
    public List getPstListarReprobadosPorProgramaTipoAdmision(Postulantes postulante) {
        return this.postulantesDao.getPstListarReprobadosPorProgramaTipoAdmision(postulante);
    }

    //INICIO - Admin Materias
    public List getListarMateriasPorDepartamento(Materias materia) {
        return this.materiasDao.getListarMateriasPorDepartamento(materia);
    }

    public List getListarMateriasPorSigla(Materias materia) {
        return this.materiasDao.getListarMateriasPorSigla(materia);
    }

    public List getListarMateriasPorMateria(Materias materia) {
        return this.materiasDao.getListarMateriasPorMateria(materia);
    }

    public Materias getMtrBuscarTipoMateria(Materias materia) {
        return this.materiasDao.getMtrBuscarTipoMateria(materia);
    }

    public List getMtrListarTiposMaterias() {
        return this.materiasDao.getMtrListarTiposMaterias();
    }

    public int setRegistrarMateria(Materias materia) {
        return this.materiasDao.setRegistrarMateria(materia);
    }

    public int setEliminarMateria(Materias materia) {
        return this.materiasDao.setEliminarMateria(materia);
    }

    public int getBuscar_nro_excepcion_calendario(Materias materia) {
        return this.materiasDao.getBuscar_nro_excepcion_calendario(materia);
    }

    //FIN - Admin Materias
    //Buscar Tipo Admision
    public Estudiantes getBuscarTipoAdmision(Estudiantes estudiante) {
        return this.estudiantesDao.getBuscarTipoAdmision(estudiante);
    }

    //Est_clasificaciones
    public Estudiantes getBuscarTipoClasificacionEstudiante(Estudiantes estudiante) {
        return this.estudiantesDao.getBuscarTipoClasificacionEstudiante(estudiante);
    }

    public int setRegistrarEstClasificacion(Estudiantes estudiante) {
        return this.estudiantesDao.setRegistrarEstClasificacion(estudiante);
    }

    public List getMiListarPostulantesDipTipoAdm(Postulantes postulante) {
        return this.postulantesDao.getMiListarPostulantesDipTipoAdm(postulante);
    }

    public List getMiListarPostulantesNombreTipoAdm(Postulantes postulante) {
        return this.postulantesDao.getMiListarPostulantesNombreTipoAdm(postulante);
    }

    //Est_regularizaciones
    public Estudiantes getMiBuscarUltimoEstRegularizacion(Estudiantes estudiante) {
        return this.estudiantesDao.getMiBuscarUltimoEstRegularizacion(estudiante);
    }

    public Estudiantes getMiBuscarEstRegularizacion(Estudiantes estudiante) {
        return this.estudiantesDao.getMiBuscarEstRegularizacion(estudiante);
    }

    public List getMiListarRegularizacionesEstudiante(Estudiantes estudiante) {
        return this.estudiantesDao.getMiListarRegularizacionesEstudiante(estudiante);
    }

    public int setRegistrarEstRegularizacionBloqueoEst(Estudiantes estudiante) {
        return this.estudiantesDao.setRegistrarEstRegularizacionBloqueoEst(estudiante);
    }

    public int setModificarRegularizar(Estudiantes estudiante) {
        return this.estudiantesDao.setModificarRegularizar(estudiante);
    }

    public List getMiListarTiposRegularizaciones() {
        return this.estudiantesDao.getMiListarTiposRegularizaciones();
    }
    //Fin Est_regularizaciones

    public Menciones getEstBuscarMencion(Estudiantes estudiante) {
        return this.estudiantesDao.getEstBuscarMencion(estudiante);
    }

    //INICIO - Historial Academico
    public List getListarPlanMateriasNotas(Estudiantes estudiante) {
        return this.notasDao.getListarPlanMateriasNotas(estudiante);
    }

    public List getListarPlanMateriasNotas2(Estudiantes estudiante) {
        return this.notasDao.getListarPlanMateriasNotas2(estudiante);
    }

    public List getListarPlanMateriasNotas3(Estudiantes estudiante) {
        return this.notasDao.getListarPlanMateriasNotas3(estudiante);
    }

    public double getBuscarPromedioDeNotas(Notas nota) {
        return this.notasDao.getBuscarPromedioDeNotas(nota);
    }

    public int getCantidadMateriasAprobadas(Estudiantes estudiante) {
        return this.notasDao.getCantidadMateriasAprobadas(estudiante);
    }
    //FIN - Historial Academico

    //INICIO - Administrar Docente
    public int setRegistrarDocente(Docentes docente) {
        return this.docentesDao.setRegistrarDocente(docente);
    }

    public int setEliminarDocente(Docentes docente) {
        return this.docentesDao.setEliminarDocente(docente);
    }

    public List getListarPersonas(Personas persona) {
        return this.personasDao.getListarPersonas(persona);
    }
    //FIN - Administrar Docente

    //INICIO - Administrar Calendarios
    public List getListarCalendarios(Calendarios calendario) {
        return this.calendariosDao.getListarCalendarios(calendario);
    }
    //FIN - Administrar Calendarios

    //INICIO - Convalidacion manual
    public List getListarTiposConvalidaciones() {
        return this.planesDao.getListarTiposConvalidaciones();
    }

    public Planes getBuscarTipoConvalidacion(Planes plan) {
        return this.planesDao.getBuscarTipoConvalidacion(plan);
    }

    public List getUnvListarUniversidades() {
        return this.universidadesDao.getUnvListarUniversidades();
    }

    public int setRegistrarConvalidacionManual(Planes plan) {
        return this.planesDao.setRegistrarConvalidacionManual(plan);
    }

    public int setRegistrarDetallesConvalidacionManual(Planes plan) {
        return this.planesDao.setRegistrarDetallesConvalidacionManual(plan);
    }
    //FIN - Convalidacion Manual
    //INICIO - Autorizar Convalidacion Manual

    public List getListarConvalidacionManualPrograma(Planes plan) {
        return this.planesDao.getListarConvalidacionManualPrograma(plan);
    }

    public List getListarConvalidacionManualPrograma2(Planes plan) {
        return this.planesDao.getListarConvalidacionManualPrograma2(plan);
    }

    public Planes getBuscarConvalidacionManual(Planes plan) {
        return this.planesDao.getBuscarConvalidacionManual(plan);
    }

    public List getListarCnvDetallesConvalidacion(Planes plan) {
        return this.planesDao.getListarCnvDetallesConvalidacion(plan);
    }

    public List getListarCnvDetallesConvalidacion2(Planes plan) {
        return this.planesDao.getListarCnvDetallesConvalidacion2(plan);
    }

    public List getListarNotasCruceCnvDetalles(Planes plan) {
        return this.planesDao.getListarNotasCruceCnvDetalles(plan);
    }

    public int setRegistrarEstNotasConvalidacionManual(Planes plan) {
        return this.planesDao.setRegistrarEstNotasConvalidacionManual(plan);
    }

    public int setEliminarCnvDetalle(Planes plan) {
        return this.planesDao.setEliminarCnvDetalle(plan);
    }
    //FIN - Autorizar Convalidacion Manual

    //Inicio- Est deudas
    public List getListarDeudasEstudiante(Estudiantes estudiante) {
        return this.estudiantesDao.getListarDeudasEstudiante(estudiante);
    }

    public Estudiantes getMiBuscarEstDeuda(Estudiantes estudiante) {
        return this.estudiantesDao.getMiBuscarEstDeuda(estudiante);
    }

    public Estudiantes getBuscarUltimaEstDeuda(Estudiantes estudiante) {
        return this.estudiantesDao.getBuscarUltimaEstDeuda(estudiante);
    }

    public int setRegistrarEstDeuda(Estudiantes estudiante) {
        return this.estudiantesDao.setRegistrarEstDeuda(estudiante);
    }

    public int setModificarEstDeuda(Estudiantes estudiante) {
        return this.estudiantesDao.setModificarEstDeuda(estudiante);
    }

    public List getMiListarTiposDeudas() {
        return this.estudiantesDao.getMiListarTiposDeudas();
    }
    //Fin-Est-Deudas

    public int getTrnBuscarSiguienteNroRecibo(Perfiles perfil) {
        return this.perfilesDao.getTrnBuscarSiguienteNroRecibo(perfil);
    }

    public void setTrnActualizarNroRecibo(Perfiles perfil) {
        this.perfilesDao.setTrnActualizarNroRecibo(perfil);
    }

    //Inicio Admin. Usuarios
    public Personas getBuscarPersona(Personas persona) {
        return this.personasDao.getBuscarPersona(persona);
    }

    public List getListarUsuarios(Usuarios usuario) {
        return this.usuariosDao.getListarUsuarios(usuario);
    }

    public int setRegistrarUsuario(Usuarios usuario) {
        return this.usuariosDao.setRegistrarUsuario(usuario);
    }

    public int setEliminarUsuario(Usuarios usuario) {
        return this.usuariosDao.setEliminarUsuario(usuario);
    }
    //Fin Admin. Usuarios

    //Cambio PIN Docente General
    public int setModificarApodoClaveDocente(Docentes docente) {
        return this.docentesDao.setModificarApodoClaveDocente(docente);
    }
    //Fin PIN Docente General

    //Cambio PIN Estudiante General
    public int setMtrModificarApodoClaveEstudiante(Estudiantes estudiante) {
        return this.estudiantesDao.setMtrModificarApodoClaveEstudiante(estudiante);
    }

    public int setRegistrarApodoClaveMatricula(Estudiantes estudiante) {
        return this.estudiantesDao.setRegistrarApodoClaveMatricula(estudiante);
    }
    //Fin PIN Estudiante General
    //Buscar Tipo Nota

    public Libretas getMiBuscarTipoNota(Libretas libreta) {
        return this.libretasDao.getMiBuscarTipoNota(libreta);
    }

//INICIO - METODOS ADICIONADOS POR LA UAP
    // Listado de Estudiantes Con Descuentos
    public List getEstListarPorProgramaTipoDescuento(Estudiantes estudiante) {
        return this.estudiantesDao.getEstListarPorProgramaTipoDescuento(estudiante);
    }

    // Asignacion Docentes
    public List getDctListarAsignacionDocenteMateria(Asignaciones asignacion) {
        return this.asignacionesDao.getDctListarAsignacionDocenteMateria(asignacion);
    }

    public List getDctListarAsignacionDocenteMateriaFuncion(Asignaciones asignacion) {
        return this.asignacionesDao.getDctListarAsignacionDocenteMateriaFuncion(asignacion);
    }

    public List getDctListarAsignacionDocenteMateriaFuncionxid(Asignaciones asignacion) {
        return this.asignacionesDao.getDctListarAsignacionDocenteMateriaFuncionxid(asignacion);
    }

    public List getDctListarAsignacionDocenteMateriaFuncionsintitular(Asignaciones asignacion) {
        return this.asignacionesDao.getDctListarAsignacionDocenteMateriaFuncionsintitular(asignacion);
    }

    public List getDctListarAsignacionDocenteMateriaFuncionsintitularfinal(Asignaciones asignacion) {
        return this.asignacionesDao.getDctListarAsignacionDocenteMateriaFuncionsintitularfinal(asignacion);
    }

    public List getDctListarAsignacionDocenteMateriaFuncionsoloid(Asignaciones asignacion) {
        return this.asignacionesDao.getDctListarAsignacionDocenteMateriaFuncionsoloid(asignacion);
    }

    public List getDctListarAsignacionDocenteMateriaFuncionparamemo(Asignaciones asignacion) {
        return this.asignacionesDao.getDctListarAsignacionDocenteMateriaFuncionparamemo(asignacion);
    }

    public List getDctListarAsignacionDocenteMateriacontador(Asignaciones asignacion) {
        return this.asignacionesDao.getDctListarAsignacionDocenteMateriacontador(asignacion);
    }

    public List getDctListarAsignacionDocenteMateriatc(Asignaciones asignacion) {
        return this.asignacionesDao.getDctListarAsignacionDocenteMateriatc(asignacion);
    }

    public List getDctListarNroAsignacionDocenteMateriaFuncionxid(Asignaciones asignacion) {
        return this.asignacionesDao.getDctListarNroAsignacionDocenteMateriaFuncionxid(asignacion);
    }
    // Asignacion Auxiliares

    public List getDctListarAsignacionAuxiliarMateria(Asignaciones asignacion) {
        return this.asignacionesDao.getDctListarAsignacionAuxiliarMateria(asignacion);
    }

    // Listado de Estudiante Con Prorroga
    public List getListarEstConProrroga(Estudiantes estudiante) {
        return this.estudiantesDao.getListarEstConProrroga(estudiante);
    }

    // Listado de Estudiante Con Rendimiento Academico
    public List getRendimientoAcademico(Estudiantes promedio) {
        return this.estudiantesDao.getRendimientoAcademico(promedio);
    }

    public Estudiantes getDesignacionBecaTrabajo(Estudiantes becario) {
        return this.estudiantesDao.getDesignacionBecaTrabajo(becario);
    }

    // Listado de Estudiante Docente
    public Personas getEstBuscarEstudianteDocente(Personas persona) {
        return this.personasDao.getEstBuscarEstudianteDocente(persona);
    }

    // Listado de Asignacion Becarios
    public List getListarEstBecasTrabajo(Estudiantes estudiante) {
        return this.estudiantesDao.getListarEstBecasTrabajo(estudiante);
    }

    // Listado de Asignacion Becarios por Unidad Funcional
    public List getListarEstBecasTrabajoFuncional(Estudiantes estudiante) {
        return this.estudiantesDao.getListarEstBecasTrabajoFuncional(estudiante);
    }

    // Listado de Estudiantes Por Nivel Academico
    public List getListarNiveles(Estudiantes estudiante) {
        return this.estudiantesDao.getListarNiveles(estudiante);
    }

    // Insertar Pst_personas para tramites
    public int setMiRegistrarPstPersonaTrn(Postulantes postulante) {
        return this.postulantesDao.setMiRegistrarPstPersonaTrn(postulante);
    }

    // Listado de Asignacion Docentes por Dpto.
    public List getListarDocentesPorDpto(Docentes docente) {
        return this.docentesDao.getListarDocentesPorDpto(docente);
    }

    // Listado de Claves de Estudiantes por Programas
    public List getListarClavesEstPorPrograma(Estudiantes estudiante) {
        return this.estudiantesDao.getListarClavesEstPorPrograma(estudiante);
    }

    // Listado de Curso de Preparatoria de Ingles Estudiantes
    public List getListarCursoPreIngles(Estudiantes estudiante) {
        return this.estudiantesDao.getListarCursoPreIngles(estudiante);
    }

    // Listado de Curso de Preparatoria de Ingles Otros
    public List getListarCursoPreInglesOtros(Personas persona) {
        return this.personasDao.getListarCursoPreInglesOtros(persona);
    }

    //2008-06-20
    //aux_asignacion planes-grupos
    public List getDptoListarGruposMateriaTipoEvaluacionAuxiliares(Materias materia) {
        return this.gruposDao.getDptoListarGruposMateriaTipoEvaluacionAuxiliares(materia);
    }

    public List getListarAuxiliaresTodos() {
        return this.docentesDao.getListarAuxiliaresTodos();
    }

    public int setRegistrarAsignacionAuxiliar(Asignaciones asignacion) {
        return this.asignacionesDao.setRegistrarAsignacionAuxiliar(asignacion);
    }

    public Asignaciones getDctBuscarAsignacionAuxiliar(Asignaciones asignacion) {
        return this.asignacionesDao.getDctBuscarAsignacionAuxiliar(asignacion);
    }

    public Docentes getBuscarAuxiliar(Docentes docente) {
        return this.docentesDao.getBuscarAuxiliar(docente);
    }

    public int setEliminarAsignacionAuxiliarMateria(Asignaciones asignacion) {
        return this.asignacionesDao.setEliminarAsignacionAuxiliarMateria(asignacion);
    }

    public Estudiantes getEstBuscarEstudianteNombresMatriculados(Estudiantes estudiante) {
        return this.estudiantesDao.getEstBuscarEstudianteNombresMatriculados(estudiante);
    }

    public Estudiantes getEstBuscarEstudianteAdmitidoAuxiliar(Estudiantes estudiante) {
        return this.estudiantesDao.getEstBuscarEstudianteAdmitidoAuxiliar(estudiante);
    }

    public int setRegistrarAdmisionEstudianteAuxiliar(Estudiantes estudiante) {
        return this.estudiantesDao.setRegistrarAdmisionEstudianteAuxiliar(estudiante);
    }

    public int setEliminarAdmisionEstudianteAuxiliar(Estudiantes estudiante) {
        return this.estudiantesDao.setEliminarAdmisionEstudianteAuxiliar(estudiante);
    }

    public List getBuscarEstudianteAuxiliar(Estudiantes estudiante) {
        return this.estudiantesDao.getBuscarEstudianteAuxiliar(estudiante);
    }

    public List getBuscarEstudianteAuxiliarTodas(Estudiantes estudiante) {
        return this.estudiantesDao.getBuscarEstudianteAuxiliarTodas(estudiante);
    }

    // INICIO -- REPORTES DE ESTUDIANTES DE DOCENCIA POR PROGRAMA
    public List getListarEstudiantesAuxiliaresPorPrograma(Estudiantes estudiante) {
        return this.estudiantesDao.getListarEstudiantesAuxiliaresPorPrograma(estudiante);
    }

    public List getBuscarEstudiantesAuxiliaresPorPrograma(Estudiantes estudiante) {
        return this.estudiantesDao.getBuscarEstudiantesAuxiliaresPorPrograma(estudiante);
    }
    // FIN -- REPORTES DE ESTUDIANTES DE DOCENCIA POR PROGRAMA

    //TRAMITES ATENDIDOS
    public List getTrListarProcesos() {
        return this.tramitesDao.getTrListarProcesos();
    }

    //LISTADO DE NOTAS RECTIFICADAS
    public List getEstListarNotasRectificadasEstudiante(Libretas libreta) {
        return this.libretasDao.getEstListarNotasRectificadasEstudiante(libreta);
    }
    //----------------FIN MICOIMATA------------------------------\\    

    // TARJETAS MAGNETICAS
    public List getBuscarEstudiantePersona(Estudiantes estudiante) {
        return this.estudiantesDao.getBuscarEstudiantePersona(estudiante);
    }

    //Cursos Varios
    public List getListarCursoPsicoEst(Estudiantes estudiante) {
        return this.estudiantesDao.getListarCursoPsicoEst(estudiante);
    }

    public List getListarCursoPsicoOtros(Personas persona) {
        return this.personasDao.getListarCursoPsicoOtros(persona);
    }

    public List getListarCursoSemioEst(Estudiantes estudiante) {
        return this.estudiantesDao.getListarCursoSemioEst(estudiante);
    }

    public List getlistarMiembrosT(Estudiantes estudiante) {
        return this.estudiantesDao.getlistarMiembrosT(estudiante);
    }

//FIN - METODOS ADICIONADOS POR LA UAP
    public int setBuscarCalendarioAcademicoPrograma(Libretas libreta) {
        return this.libretasDao.setBuscarCalendarioAcademicoPrograma(libreta);
    }

    public int setBuscarProgramacionAutorizacion(Libretas libreta) {
        return this.libretasDao.setBuscarProgramacionAutorizacion(libreta);
    }

    public int setCambioEstadoProgramacionAutorizacion(Libretas libreta) {
        return this.libretasDao.setCambioEstadoProgramacionAutorizacion(libreta);
    }

    public int getBuscar_ampliacion_calendario(Materias materia) {
        return this.materiasDao.getBuscar_ampliacion_calendario(materia);
    }

//----------------FIN MICOIMATA------------------------------\\    
    @Override
    public List<Notas> getListaMayoresa80SinModalidad(int gestion, int periodo) {
        Notas nota = new Notas();
        nota.setGestion(gestion);
        nota.setPeriodo(periodo);
        return this.notasDao.getListaMayoresa80SinModalidad(nota);
    }

    @Override
    public List<Notas> getListaMayoresa80(int gestion, int periodo) {
        Notas nota = new Notas();
        nota.setGestion(gestion);
        nota.setPeriodo(periodo);
        return this.notasDao.getListaMayoresa80(nota);
    }

    @Override
    public List<Perfiles> getTrnBuscarTransaccionReciboSedePerfiles(Perfiles perfil) {
        return this.perfilesDao.getTrnBuscarTransaccionReciboSedePerfiles(perfil);
    }
//ESTUDIANTES PROGRAMAS SEDE DESCONCENTRADOS

    @Override
    public List<ProgramasDesconcentrados> getListarProgramasDesconcentrados() {
        return this.programadesconcentradoDao.getListarProgramasDesconcentrados();
    }

    @Override
    public Estudiantes getListarEstudiantesProgramasSede(Estudiantes estudiante) {
        return this.estudiantesDao.getListarEstudiantesProgramasSede(estudiante);
    }

    @Override
    public List getListarFclProgramasDescocentrado(int id_programa) {
        return this.estudiantesDao.getListarFclProgramasDescocentrado(id_programa);
    }

    @Override
    public int setRegistrarEstudiantes_programas_sede(Estudiantes estudiante) {
        return this.estudiantesDao.setRegistrarEstudiantes_programas_sede(estudiante);
    }

    @Override
    public Estudiantes getDetalleEstudiantesProgramaSede(int id_estudiante_programa_sede) {
        return this.estudiantesDao.getDetalleEstudiantesProgramaSede(id_estudiante_programa_sede);
    }

    @Override
    public int setModificarProgramaDesconcentrado(Estudiantes estudiante) {
        return this.estudiantesDao.setModificarProgramaDesconcentrado(estudiante);
    }

    public int setEliminarProgramaDesconcentrado(Estudiantes estudiante) {
        return this.estudiantesDao.setEliminarProgramaDesconcentrado(estudiante);
    }

    @Override
    public List getVerProgramasFaseDesconcentrado(int id_estudiante) {
        return this.estudiantesDao.getVerProgramasFaseDesconcentrado(id_estudiante);
    }

    @Override
    public Estudiantes getMostraSedeDesconcentrada(int id_desconcentrado) {
        return this.estudiantesDao.getMostraSedeDesconcentrada(id_desconcentrado);
    }

    public int setActualizarIdDesconcentradoEstudiantes(Estudiantes estudiantes) {
        return this.estudiantesDao.setActualizarIdDesconcentradoEstudiantes(estudiantes);
    }

    //FIN ESTUDIANTE PROGRAMAS DESCONCENTRADOS SEDE
    @Override
    public Integer setRegistrarActualizarPersona(Personas persona) {
        Integer idPersona = null;
        try {
            idPersona = this.personasDao.getIdPersona(persona);
        } catch (Exception ex) {
            idPersona = null;
        }
        if (idPersona == null) {
            idPersona = this.personasDao.setRegistrarPersona(persona);
        }
        return idPersona;
    }

    @Override
    public Calendarios getDetalleCalendarioAcademico(Calendarios calendario) {
        return this.calendariosDao.getDetalleCalendarioAcademico(calendario);
    }

    @Override
    public Estudiantes getDatosImpresionAfp(int id_estudiante) {
        return this.estudiantesDao.getDatosImpresionAfp(id_estudiante);
    }

    @Override
    public void RegistrarCsmbioAulaProgramacion(Estudiantes estudiantes) {
        this.estudiantesDao.RegistrarCsmbioAulaProgramacion(estudiantes);
    }
}
