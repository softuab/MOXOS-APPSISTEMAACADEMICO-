/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fautapo.domain.logic;

import java.util.List;
import org.fautapo.dao.AbmDao;
import org.fautapo.dao.ActividadesDao;
import org.fautapo.dao.AdjuntosDao;
import org.fautapo.dao.AsignacionesDao;
import org.fautapo.dao.CalendariosDao;
import org.fautapo.dao.CamposDao;
import org.fautapo.dao.CategoriasDao;
import org.fautapo.dao.ClientesDao;
import org.fautapo.dao.CurriculumDao;
import org.fautapo.dao.DepartamentosDao;
import org.fautapo.dao.DibwaykaDao;
import org.fautapo.dao.DocentesDao;
import org.fautapo.dao.DominiosDao;
import org.fautapo.dao.EnlacesDao;
import org.fautapo.dao.EstudiantesDao;
import org.fautapo.dao.FacultadesDao;
import org.fautapo.dao.GruposDao;
import org.fautapo.dao.GwDao;
import org.fautapo.dao.HerramientasDao;
import org.fautapo.dao.HilosDao;
import org.fautapo.dao.HorariosDao;
import org.fautapo.dao.InformesDao;
import org.fautapo.dao.LibretasDao;
import org.fautapo.dao.MateriasDao;
import org.fautapo.dao.NotasDao;
import org.fautapo.dao.PerfilesDao;
import org.fautapo.dao.PersonasDao;
import org.fautapo.dao.PlanesDao;
import org.fautapo.dao.PostulantesDao;
import org.fautapo.dao.ProgramasDao;
import org.fautapo.dao.ProveidosDao;
import org.fautapo.dao.RolesDao;
import org.fautapo.dao.TablerosDao;
import org.fautapo.dao.TramitesDao;
import org.fautapo.dao.UniversidadesDao;
import org.fautapo.dao.UsuariosDao;
import org.fautapo.domain.Abm;
import org.fautapo.domain.Actividades;
import org.fautapo.domain.Adjuntos;
import org.fautapo.domain.Asignaciones;
import org.fautapo.domain.Calendarios;
import org.fautapo.domain.Campos;
import org.fautapo.domain.Categorias;
import org.fautapo.domain.Clientes;
import org.fautapo.domain.Curriculum;
import org.fautapo.domain.Departamentos;
import org.fautapo.domain.Dibwayka;
import org.fautapo.domain.Docentes;
import org.fautapo.domain.Dominios;
import org.fautapo.domain.Enlaces;
import org.fautapo.domain.Estudiantes;
import org.fautapo.domain.Facultades;
import org.fautapo.domain.Grupos;
import org.fautapo.domain.Herramientas;
import org.fautapo.domain.Hilos;
import org.fautapo.domain.Horarios;
import org.fautapo.domain.Informes;
import org.fautapo.domain.Instituciones;
import org.fautapo.domain.Libretas;
import org.fautapo.domain.Materias;
import org.fautapo.domain.Menciones;
import org.fautapo.domain.Modelos_ahorros;
import org.fautapo.domain.Notas;
import org.fautapo.domain.Perfiles;
import org.fautapo.domain.Personas;
import org.fautapo.domain.Planes;
import org.fautapo.domain.Postulantes;
import org.fautapo.domain.Programas;
import org.fautapo.domain.Proveidos;
import org.fautapo.domain.Roles;
import org.fautapo.domain.Tableros;
import org.fautapo.domain.Tramites;
import org.fautapo.domain.Universidades;
import org.fautapo.domain.Usuarios;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FNZABALETAA
 */
public class MiImplTest {
    
    public MiImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setAbmDao method, of class MiImpl.
     */
    @Test
    public void testSetAbmDao() {
        System.out.println("setAbmDao");
        AbmDao abmDao = null;
        MiImpl instance = new MiImpl();
        instance.setAbmDao(abmDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClientesDao method, of class MiImpl.
     */
    @Test
    public void testSetClientesDao() {
        System.out.println("setClientesDao");
        ClientesDao clientesDao = null;
        MiImpl instance = new MiImpl();
        instance.setClientesDao(clientesDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuariosDao method, of class MiImpl.
     */
    @Test
    public void testSetUsuariosDao() {
        System.out.println("setUsuariosDao");
        UsuariosDao usuariosDao = null;
        MiImpl instance = new MiImpl();
        instance.setUsuariosDao(usuariosDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRolesDao method, of class MiImpl.
     */
    @Test
    public void testSetRolesDao() {
        System.out.println("setRolesDao");
        RolesDao rolesDao = null;
        MiImpl instance = new MiImpl();
        instance.setRolesDao(rolesDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategoriasDao method, of class MiImpl.
     */
    @Test
    public void testSetCategoriasDao() {
        System.out.println("setCategoriasDao");
        CategoriasDao categoriasDao = null;
        MiImpl instance = new MiImpl();
        instance.setCategoriasDao(categoriasDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEnlacesDao method, of class MiImpl.
     */
    @Test
    public void testSetEnlacesDao() {
        System.out.println("setEnlacesDao");
        EnlacesDao enlacesDao = null;
        MiImpl instance = new MiImpl();
        instance.setEnlacesDao(enlacesDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHerramientasDao method, of class MiImpl.
     */
    @Test
    public void testSetHerramientasDao() {
        System.out.println("setHerramientasDao");
        HerramientasDao herramientasDao = null;
        MiImpl instance = new MiImpl();
        instance.setHerramientasDao(herramientasDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActividadesDao method, of class MiImpl.
     */
    @Test
    public void testSetActividadesDao() {
        System.out.println("setActividadesDao");
        ActividadesDao actividadesDao = null;
        MiImpl instance = new MiImpl();
        instance.setActividadesDao(actividadesDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDominiosDao method, of class MiImpl.
     */
    @Test
    public void testSetDominiosDao() {
        System.out.println("setDominiosDao");
        DominiosDao dominiosDao = null;
        MiImpl instance = new MiImpl();
        instance.setDominiosDao(dominiosDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCamposDao method, of class MiImpl.
     */
    @Test
    public void testSetCamposDao() {
        System.out.println("setCamposDao");
        CamposDao camposDao = null;
        MiImpl instance = new MiImpl();
        instance.setCamposDao(camposDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInformesDao method, of class MiImpl.
     */
    @Test
    public void testSetInformesDao() {
        System.out.println("setInformesDao");
        InformesDao informesDao = null;
        MiImpl instance = new MiImpl();
        instance.setInformesDao(informesDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGwDao method, of class MiImpl.
     */
    @Test
    public void testSetGwDao() {
        System.out.println("setGwDao");
        GwDao gwDao = null;
        MiImpl instance = new MiImpl();
        instance.setGwDao(gwDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTramitesDao method, of class MiImpl.
     */
    @Test
    public void testSetTramitesDao() {
        System.out.println("setTramitesDao");
        TramitesDao tramitesDao = null;
        MiImpl instance = new MiImpl();
        instance.setTramitesDao(tramitesDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersonasDao method, of class MiImpl.
     */
    @Test
    public void testSetPersonasDao() {
        System.out.println("setPersonasDao");
        PersonasDao personasDao = null;
        MiImpl instance = new MiImpl();
        instance.setPersonasDao(personasDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProveidosDao method, of class MiImpl.
     */
    @Test
    public void testSetProveidosDao() {
        System.out.println("setProveidosDao");
        ProveidosDao proveidosDao = null;
        MiImpl instance = new MiImpl();
        instance.setProveidosDao(proveidosDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAdjuntosDao method, of class MiImpl.
     */
    @Test
    public void testSetAdjuntosDao() {
        System.out.println("setAdjuntosDao");
        AdjuntosDao adjuntosDao = null;
        MiImpl instance = new MiImpl();
        instance.setAdjuntosDao(adjuntosDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTablerosDao method, of class MiImpl.
     */
    @Test
    public void testSetTablerosDao() {
        System.out.println("setTablerosDao");
        TablerosDao tablerosDao = null;
        MiImpl instance = new MiImpl();
        instance.setTablerosDao(tablerosDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHilosDao method, of class MiImpl.
     */
    @Test
    public void testSetHilosDao() {
        System.out.println("setHilosDao");
        HilosDao hilosDao = null;
        MiImpl instance = new MiImpl();
        instance.setHilosDao(hilosDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDibwaykaDao method, of class MiImpl.
     */
    @Test
    public void testSetDibwaykaDao() {
        System.out.println("setDibwaykaDao");
        DibwaykaDao dibwaykaDao = null;
        MiImpl instance = new MiImpl();
        instance.setDibwaykaDao(dibwaykaDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlanesDao method, of class MiImpl.
     */
    @Test
    public void testSetPlanesDao() {
        System.out.println("setPlanesDao");
        PlanesDao planesDao = null;
        MiImpl instance = new MiImpl();
        instance.setPlanesDao(planesDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProgramasDao method, of class MiImpl.
     */
    @Test
    public void testSetProgramasDao() {
        System.out.println("setProgramasDao");
        ProgramasDao programasDao = null;
        MiImpl instance = new MiImpl();
        instance.setProgramasDao(programasDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDepartamentosDao method, of class MiImpl.
     */
    @Test
    public void testSetDepartamentosDao() {
        System.out.println("setDepartamentosDao");
        DepartamentosDao departamentosDao = null;
        MiImpl instance = new MiImpl();
        instance.setDepartamentosDao(departamentosDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFacultadesDao method, of class MiImpl.
     */
    @Test
    public void testSetFacultadesDao() {
        System.out.println("setFacultadesDao");
        FacultadesDao facultadesDao = null;
        MiImpl instance = new MiImpl();
        instance.setFacultadesDao(facultadesDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUniversidadesDao method, of class MiImpl.
     */
    @Test
    public void testSetUniversidadesDao() {
        System.out.println("setUniversidadesDao");
        UniversidadesDao universidadesDao = null;
        MiImpl instance = new MiImpl();
        instance.setUniversidadesDao(universidadesDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHorariosDao method, of class MiImpl.
     */
    @Test
    public void testSetHorariosDao() {
        System.out.println("setHorariosDao");
        HorariosDao horariosDao = null;
        MiImpl instance = new MiImpl();
        instance.setHorariosDao(horariosDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNotasDao method, of class MiImpl.
     */
    @Test
    public void testSetNotasDao() {
        System.out.println("setNotasDao");
        NotasDao notasDao = null;
        MiImpl instance = new MiImpl();
        instance.setNotasDao(notasDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMateriasDao method, of class MiImpl.
     */
    @Test
    public void testSetMateriasDao() {
        System.out.println("setMateriasDao");
        MateriasDao materiasDao = null;
        MiImpl instance = new MiImpl();
        instance.setMateriasDao(materiasDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLibretasDao method, of class MiImpl.
     */
    @Test
    public void testSetLibretasDao() {
        System.out.println("setLibretasDao");
        LibretasDao libretasDao = null;
        MiImpl instance = new MiImpl();
        instance.setLibretasDao(libretasDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAsignacionesDao method, of class MiImpl.
     */
    @Test
    public void testSetAsignacionesDao() {
        System.out.println("setAsignacionesDao");
        AsignacionesDao asignacionesDao = null;
        MiImpl instance = new MiImpl();
        instance.setAsignacionesDao(asignacionesDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDocentesDao method, of class MiImpl.
     */
    @Test
    public void testSetDocentesDao() {
        System.out.println("setDocentesDao");
        DocentesDao docentesDao = null;
        MiImpl instance = new MiImpl();
        instance.setDocentesDao(docentesDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstudiantesDao method, of class MiImpl.
     */
    @Test
    public void testSetEstudiantesDao() {
        System.out.println("setEstudiantesDao");
        EstudiantesDao estudiantesDao = null;
        MiImpl instance = new MiImpl();
        instance.setEstudiantesDao(estudiantesDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGruposDao method, of class MiImpl.
     */
    @Test
    public void testSetGruposDao() {
        System.out.println("setGruposDao");
        GruposDao gruposDao = null;
        MiImpl instance = new MiImpl();
        instance.setGruposDao(gruposDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPostulantesDao method, of class MiImpl.
     */
    @Test
    public void testSetPostulantesDao() {
        System.out.println("setPostulantesDao");
        PostulantesDao postulantesDao = null;
        MiImpl instance = new MiImpl();
        instance.setPostulantesDao(postulantesDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPerfilesDao method, of class MiImpl.
     */
    @Test
    public void testSetPerfilesDao() {
        System.out.println("setPerfilesDao");
        PerfilesDao perfilesDao = null;
        MiImpl instance = new MiImpl();
        instance.setPerfilesDao(perfilesDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurriculumDao method, of class MiImpl.
     */
    @Test
    public void testSetCurriculumDao() {
        System.out.println("setCurriculumDao");
        CurriculumDao curriculumDao = null;
        MiImpl instance = new MiImpl();
        instance.setCurriculumDao(curriculumDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCalendariosDao method, of class MiImpl.
     */
    @Test
    public void testSetCalendariosDao() {
        System.out.println("setCalendariosDao");
        CalendariosDao calendariosDao = null;
        MiImpl instance = new MiImpl();
        instance.setCalendariosDao(calendariosDao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTablas method, of class MiImpl.
     */
    @Test
    public void testGetListarTablas() {
        System.out.println("getListarTablas");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTablas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarTabla method, of class MiImpl.
     */
    @Test
    public void testGetBuscarTabla() {
        System.out.println("getBuscarTabla");
        Abm abm = null;
        MiImpl instance = new MiImpl();
        Abm expResult = null;
        Abm result = instance.getBuscarTabla(abm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCamposTabla method, of class MiImpl.
     */
    @Test
    public void testGetListarCamposTabla() {
        System.out.println("getListarCamposTabla");
        Abm abm = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCamposTabla(abm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEjecutarConsulta method, of class MiImpl.
     */
    @Test
    public void testSetEjecutarConsulta() {
        System.out.println("setEjecutarConsulta");
        Abm abm = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setEjecutarConsulta(abm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEjecutarListado method, of class MiImpl.
     */
    @Test
    public void testGetEjecutarListado() {
        System.out.println("getEjecutarListado");
        Abm abm = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEjecutarListado(abm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEjecutarListado2 method, of class MiImpl.
     */
    @Test
    public void testGetEjecutarListado2() {
        System.out.println("getEjecutarListado2");
        Abm abm = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEjecutarListado2(abm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDibContadorClasico method, of class MiImpl.
     */
    @Test
    public void testGetDibContadorClasico() {
        System.out.println("getDibContadorClasico");
        Abm abm = null;
        MiImpl instance = new MiImpl();
        String expResult = "";
        String result = instance.getDibContadorClasico(abm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDibBuscarParametro method, of class MiImpl.
     */
    @Test
    public void testGetDibBuscarParametro() {
        System.out.println("getDibBuscarParametro");
        Abm abm = null;
        MiImpl instance = new MiImpl();
        String expResult = "";
        String result = instance.getDibBuscarParametro(abm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarRegistros method, of class MiImpl.
     */
    @Test
    public void testGetListarRegistros() {
        System.out.println("getListarRegistros");
        Abm abm = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarRegistros(abm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInsertarDatos method, of class MiImpl.
     */
    @Test
    public void testSetInsertarDatos() {
        System.out.println("setInsertarDatos");
        Abm abm = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setInsertarDatos(abm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarCerGen method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarCerGen() {
        System.out.println("setRegistrarCerGen");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarCerGen(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarMaxCertSede method, of class MiImpl.
     */
    @Test
    public void testGetBuscarMaxCertSede() {
        System.out.println("getBuscarMaxCertSede");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.getBuscarMaxCertSede(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getbuscarnrotransacciones method, of class MiImpl.
     */
    @Test
    public void testGetbuscarnrotransacciones() {
        System.out.println("getbuscarnrotransacciones");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.getbuscarnrotransacciones(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getbuscarnrocertificado method, of class MiImpl.
     */
    @Test
    public void testGetbuscarnrocertificado() {
        System.out.println("getbuscarnrocertificado");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.getbuscarnrocertificado(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getcert_buscar_nro_certificado_gestioncode method, of class MiImpl.
     */
    @Test
    public void testGetcert_buscar_nro_certificado_gestioncode() {
        System.out.println("getcert_buscar_nro_certificado_gestioncode");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.getcert_buscar_nro_certificado_gestioncode(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarCerGenNotas method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarCerGenNotas() {
        System.out.println("setRegistrarCerGenNotas");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarCerGenNotas(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEliminarCertificadoNotas method, of class MiImpl.
     */
    @Test
    public void testSetEliminarCertificadoNotas() {
        System.out.println("setEliminarCertificadoNotas");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        instance.setEliminarCertificadoNotas(estudiante);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCertGen method, of class MiImpl.
     */
    @Test
    public void testGetListarCertGen() {
        System.out.println("getListarCertGen");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCertGen(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCertGenAnulados method, of class MiImpl.
     */
    @Test
    public void testGetListarCertGenAnulados() {
        System.out.println("getListarCertGenAnulados");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCertGenAnulados(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCertGenEmitidos method, of class MiImpl.
     */
    @Test
    public void testGetListarCertGenEmitidos() {
        System.out.println("getListarCertGenEmitidos");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCertGenEmitidos(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarNotasCertificados method, of class MiImpl.
     */
    @Test
    public void testGetListarNotasCertificados() {
        System.out.println("getListarNotasCertificados");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarNotasCertificados(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCombos method, of class MiImpl.
     */
    @Test
    public void testGetListarCombos() {
        System.out.println("getListarCombos");
        Abm abm = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCombos(abm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarForanea method, of class MiImpl.
     */
    @Test
    public void testGetBuscarForanea() {
        System.out.println("getBuscarForanea");
        Abm abm = null;
        MiImpl instance = new MiImpl();
        Abm expResult = null;
        Abm result = instance.getBuscarForanea(abm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarCampoTabla method, of class MiImpl.
     */
    @Test
    public void testGetBuscarCampoTabla() {
        System.out.println("getBuscarCampoTabla");
        Abm abm = null;
        MiImpl instance = new MiImpl();
        Abm expResult = null;
        Abm result = instance.getBuscarCampoTabla(abm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContarDependientes method, of class MiImpl.
     */
    @Test
    public void testGetContarDependientes() {
        System.out.println("getContarDependientes");
        Abm abm = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.getContarDependientes(abm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDibInsertarRegistro method, of class MiImpl.
     */
    @Test
    public void testSetDibInsertarRegistro() {
        System.out.println("setDibInsertarRegistro");
        Abm abm = null;
        MiImpl instance = new MiImpl();
        String expResult = "";
        String result = instance.setDibInsertarRegistro(abm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCamposTablaActividad method, of class MiImpl.
     */
    @Test
    public void testGetListarCamposTablaActividad() {
        System.out.println("getListarCamposTablaActividad");
        Abm abm = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCamposTablaActividad(abm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEjecutarListado3 method, of class MiImpl.
     */
    @Test
    public void testGetEjecutarListado3() {
        System.out.println("getEjecutarListado3");
        Abm abm = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEjecutarListado3(abm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarRegistrosActividad method, of class MiImpl.
     */
    @Test
    public void testGetListarRegistrosActividad() {
        System.out.println("getListarRegistrosActividad");
        Abm abm = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarRegistrosActividad(abm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnlBuscarEnlace method, of class MiImpl.
     */
    @Test
    public void testGetEnlBuscarEnlace() {
        System.out.println("getEnlBuscarEnlace");
        Enlaces enlace = null;
        MiImpl instance = new MiImpl();
        Enlaces expResult = null;
        Enlaces result = instance.getEnlBuscarEnlace(enlace);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnlListarCamposTabla method, of class MiImpl.
     */
    @Test
    public void testGetEnlListarCamposTabla() {
        System.out.println("getEnlListarCamposTabla");
        Abm abm = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEnlListarCamposTabla(abm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnlEjecutarListado method, of class MiImpl.
     */
    @Test
    public void testGetEnlEjecutarListado() {
        System.out.println("getEnlEjecutarListado");
        Abm abm = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEnlEjecutarListado(abm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnlListarRegistros method, of class MiImpl.
     */
    @Test
    public void testGetEnlListarRegistros() {
        System.out.println("getEnlListarRegistros");
        Abm abm = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEnlListarRegistros(abm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCamposCondicion method, of class MiImpl.
     */
    @Test
    public void testGetListarCamposCondicion() {
        System.out.println("getListarCamposCondicion");
        Abm abm = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCamposCondicion(abm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarCampo method, of class MiImpl.
     */
    @Test
    public void testGetBuscarCampo() {
        System.out.println("getBuscarCampo");
        Abm abm = null;
        MiImpl instance = new MiImpl();
        Abm expResult = null;
        Abm result = instance.getBuscarCampo(abm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarForaneosTabla method, of class MiImpl.
     */
    @Test
    public void testGetListarForaneosTabla() {
        System.out.println("getListarForaneosTabla");
        Abm abm = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarForaneosTabla(abm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarTabla1 method, of class MiImpl.
     */
    @Test
    public void testGetBuscarTabla1() {
        System.out.println("getBuscarTabla1");
        Abm abm = null;
        MiImpl instance = new MiImpl();
        Abm expResult = null;
        Abm result = instance.getBuscarTabla1(abm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInsertarConsulta method, of class MiImpl.
     */
    @Test
    public void testSetInsertarConsulta() {
        System.out.println("setInsertarConsulta");
        Abm abm = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setInsertarConsulta(abm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarConsulta method, of class MiImpl.
     */
    @Test
    public void testGetBuscarConsulta() {
        System.out.println("getBuscarConsulta");
        Abm abm = null;
        MiImpl instance = new MiImpl();
        Abm expResult = null;
        Abm result = instance.getBuscarConsulta(abm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInsertarConsultaTotales method, of class MiImpl.
     */
    @Test
    public void testSetInsertarConsultaTotales() {
        System.out.println("setInsertarConsultaTotales");
        Abm abm = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setInsertarConsultaTotales(abm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarConsultaTotales method, of class MiImpl.
     */
    @Test
    public void testGetBuscarConsultaTotales() {
        System.out.println("getBuscarConsultaTotales");
        Abm abm = null;
        MiImpl instance = new MiImpl();
        Abm expResult = null;
        Abm result = instance.getBuscarConsultaTotales(abm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarConsultas method, of class MiImpl.
     */
    @Test
    public void testGetListarConsultas() {
        System.out.println("getListarConsultas");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarConsultas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarConexion method, of class MiImpl.
     */
    @Test
    public void testGetBuscarConexion() {
        System.out.println("getBuscarConexion");
        Usuarios usuario = null;
        MiImpl instance = new MiImpl();
        Clientes expResult = null;
        Clientes result = instance.getBuscarConexion(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaCadena method, of class MiImpl.
     */
    @Test
    public void testGetFechaCadena() {
        System.out.println("getFechaCadena");
        Clientes cliente = null;
        MiImpl instance = new MiImpl();
        String expResult = "";
        String result = instance.getFechaCadena(cliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCadenaFecha method, of class MiImpl.
     */
    @Test
    public void testGetCadenaFecha() {
        System.out.println("getCadenaFecha");
        Clientes cliente = null;
        MiImpl instance = new MiImpl();
        String expResult = "";
        String result = instance.getCadenaFecha(cliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsrBuscarIp method, of class MiImpl.
     */
    @Test
    public void testGetUsrBuscarIp() {
        System.out.println("getUsrBuscarIp");
        Clientes cliente = null;
        MiImpl instance = new MiImpl();
        Integer expResult = null;
        Integer result = instance.getUsrBuscarIp(cliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarRol method, of class MiImpl.
     */
    @Test
    public void testGetBuscarRol() {
        System.out.println("getBuscarRol");
        Roles rol = null;
        MiImpl instance = new MiImpl();
        Roles expResult = null;
        Roles result = instance.getBuscarRol(rol);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarRoles method, of class MiImpl.
     */
    @Test
    public void testGetListarRoles() {
        System.out.println("getListarRoles");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarRoles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarRolesCliente method, of class MiImpl.
     */
    @Test
    public void testGetListarRolesCliente() {
        System.out.println("getListarRolesCliente");
        Roles rol = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarRolesCliente(rol);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarRolCliente method, of class MiImpl.
     */
    @Test
    public void testGetBuscarRolCliente() {
        System.out.println("getBuscarRolCliente");
        Roles rol = null;
        MiImpl instance = new MiImpl();
        Roles expResult = null;
        Roles result = instance.getBuscarRolCliente(rol);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarAlmacenesCliente method, of class MiImpl.
     */
    @Test
    public void testGetListarAlmacenesCliente() {
        System.out.println("getListarAlmacenesCliente");
        Roles rol = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarAlmacenesCliente(rol);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarAlmacenCliente method, of class MiImpl.
     */
    @Test
    public void testGetBuscarAlmacenCliente() {
        System.out.println("getBuscarAlmacenCliente");
        Roles rol = null;
        MiImpl instance = new MiImpl();
        Roles expResult = null;
        Roles result = instance.getBuscarAlmacenCliente(rol);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCategorias method, of class MiImpl.
     */
    @Test
    public void testGetListarCategorias() {
        System.out.println("getListarCategorias");
        Categorias categoria = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCategorias(categoria);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarEnlaces method, of class MiImpl.
     */
    @Test
    public void testGetListarEnlaces() {
        System.out.println("getListarEnlaces");
        Enlaces enlace = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarEnlaces(enlace);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarEnlace method, of class MiImpl.
     */
    @Test
    public void testGetBuscarEnlace() {
        System.out.println("getBuscarEnlace");
        Enlaces enlace = null;
        MiImpl instance = new MiImpl();
        Enlaces expResult = null;
        Enlaces result = instance.getBuscarEnlace(enlace);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarCampoTabla1 method, of class MiImpl.
     */
    @Test
    public void testGetBuscarCampoTabla1() {
        System.out.println("getBuscarCampoTabla1");
        Abm abm = null;
        MiImpl instance = new MiImpl();
        Abm expResult = null;
        Abm result = instance.getBuscarCampoTabla1(abm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComprobarUsuario method, of class MiImpl.
     */
    @Test
    public void testGetComprobarUsuario() {
        System.out.println("getComprobarUsuario");
        Usuarios usuario = null;
        MiImpl instance = new MiImpl();
        Clientes expResult = null;
        Clientes result = instance.getComprobarUsuario(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComprobarUsuSede method, of class MiImpl.
     */
    @Test
    public void testGetComprobarUsuSede() {
        System.out.println("getComprobarUsuSede");
        Usuarios usuario = null;
        MiImpl instance = new MiImpl();
        Clientes expResult = null;
        Clientes result = instance.getComprobarUsuSede(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBorrarConsulta method, of class MiImpl.
     */
    @Test
    public void testSetBorrarConsulta() {
        System.out.println("setBorrarConsulta");
        Abm abm = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setBorrarConsulta(abm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModificarConsulta method, of class MiImpl.
     */
    @Test
    public void testSetModificarConsulta() {
        System.out.println("setModificarConsulta");
        Abm abm = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setModificarConsulta(abm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarInstitucion method, of class MiImpl.
     */
    @Test
    public void testGetBuscarInstitucion() {
        System.out.println("getBuscarInstitucion");
        Instituciones institucion = null;
        MiImpl instance = new MiImpl();
        Instituciones expResult = null;
        Instituciones result = instance.getBuscarInstitucion(institucion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarInstitucionSede method, of class MiImpl.
     */
    @Test
    public void testGetBuscarInstitucionSede() {
        System.out.println("getBuscarInstitucionSede");
        Instituciones institucion = null;
        MiImpl instance = new MiImpl();
        Instituciones expResult = null;
        Instituciones result = instance.getBuscarInstitucionSede(institucion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCombosPagina method, of class MiImpl.
     */
    @Test
    public void testGetListarCombosPagina() {
        System.out.println("getListarCombosPagina");
        Herramientas herramienta = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCombosPagina(herramienta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarActividades method, of class MiImpl.
     */
    @Test
    public void testGetListarActividades() {
        System.out.println("getListarActividades");
        Actividades actividad = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarActividades(actividad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposAlertasAct method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposAlertasAct() {
        System.out.println("getListarTiposAlertasAct");
        Actividades actividad = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposAlertasAct(actividad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarProceso method, of class MiImpl.
     */
    @Test
    public void testGetBuscarProceso() {
        System.out.println("getBuscarProceso");
        Actividades actividad = null;
        MiImpl instance = new MiImpl();
        Actividades expResult = null;
        Actividades result = instance.getBuscarProceso(actividad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarProcesosAcceso method, of class MiImpl.
     */
    @Test
    public void testGetListarProcesosAcceso() {
        System.out.println("getListarProcesosAcceso");
        Clientes cliente = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarProcesosAcceso(cliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarProcesosAccesoTramites method, of class MiImpl.
     */
    @Test
    public void testGetListarProcesosAccesoTramites() {
        System.out.println("getListarProcesosAccesoTramites");
        Clientes cliente = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarProcesosAccesoTramites(cliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarProcesosAccesoTramites2 method, of class MiImpl.
     */
    @Test
    public void testGetListarProcesosAccesoTramites2() {
        System.out.println("getListarProcesosAccesoTramites2");
        Clientes cliente = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarProcesosAccesoTramites2(cliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarProcesosAccesoCorresp method, of class MiImpl.
     */
    @Test
    public void testGetListarProcesosAccesoCorresp() {
        System.out.println("getListarProcesosAccesoCorresp");
        Clientes cliente = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarProcesosAccesoCorresp(cliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarTipoAlerta method, of class MiImpl.
     */
    @Test
    public void testGetBuscarTipoAlerta() {
        System.out.println("getBuscarTipoAlerta");
        Actividades actividad = null;
        MiImpl instance = new MiImpl();
        Actividades expResult = null;
        Actividades result = instance.getBuscarTipoAlerta(actividad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposAlertas method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposAlertas() {
        System.out.println("getListarTiposAlertas");
        Actividades actividad = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposAlertas(actividad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarActividad method, of class MiImpl.
     */
    @Test
    public void testGetBuscarActividad() {
        System.out.println("getBuscarActividad");
        Actividades actividad = null;
        MiImpl instance = new MiImpl();
        Actividades expResult = null;
        Actividades result = instance.getBuscarActividad(actividad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarActividadOrden method, of class MiImpl.
     */
    @Test
    public void testGetBuscarActividadOrden() {
        System.out.println("getBuscarActividadOrden");
        Actividades actividad = null;
        MiImpl instance = new MiImpl();
        Actividades expResult = null;
        Actividades result = instance.getBuscarActividadOrden(actividad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarUbicacionesOrganicas method, of class MiImpl.
     */
    @Test
    public void testGetListarUbicacionesOrganicas() {
        System.out.println("getListarUbicacionesOrganicas");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarUbicacionesOrganicas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarUbicacionOrganica method, of class MiImpl.
     */
    @Test
    public void testGetBuscarUbicacionOrganica() {
        System.out.println("getBuscarUbicacionOrganica");
        Actividades actividad = null;
        MiImpl instance = new MiImpl();
        Actividades expResult = null;
        Actividades result = instance.getBuscarUbicacionOrganica(actividad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposActuaciones method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposActuaciones() {
        System.out.println("getListarTiposActuaciones");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposActuaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarTipoActuacion method, of class MiImpl.
     */
    @Test
    public void testGetBuscarTipoActuacion() {
        System.out.println("getBuscarTipoActuacion");
        Actividades actividad = null;
        MiImpl instance = new MiImpl();
        Actividades expResult = null;
        Actividades result = instance.getBuscarTipoActuacion(actividad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarActividad method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarActividad() {
        System.out.println("setRegistrarActividad");
        Actividades actividad = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarActividad(actividad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReiniciarTiposAlertas method, of class MiImpl.
     */
    @Test
    public void testSetReiniciarTiposAlertas() {
        System.out.println("setReiniciarTiposAlertas");
        Actividades actividad = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setReiniciarTiposAlertas(actividad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarTipoAlerta method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarTipoAlerta() {
        System.out.println("setRegistrarTipoAlerta");
        Actividades actividad = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarTipoAlerta(actividad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEliminarActividad method, of class MiImpl.
     */
    @Test
    public void testSetEliminarActividad() {
        System.out.println("setEliminarActividad");
        Actividades actividad = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setEliminarActividad(actividad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposProcesos method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposProcesos() {
        System.out.println("getListarTiposProcesos");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposProcesos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposDuraciones method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposDuraciones() {
        System.out.println("getListarTiposDuraciones");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposDuraciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarTipoDuracion method, of class MiImpl.
     */
    @Test
    public void testGetBuscarTipoDuracion() {
        System.out.println("getBuscarTipoDuracion");
        Actividades actividad = null;
        MiImpl instance = new MiImpl();
        Actividades expResult = null;
        Actividades result = instance.getBuscarTipoDuracion(actividad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarDominios method, of class MiImpl.
     */
    @Test
    public void testGetListarDominios() {
        System.out.println("getListarDominios");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarDominios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarDominiosAcceso method, of class MiImpl.
     */
    @Test
    public void testGetListarDominiosAcceso() {
        System.out.println("getListarDominiosAcceso");
        Clientes cliente = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarDominiosAcceso(cliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposDominios method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposDominios() {
        System.out.println("getListarTiposDominios");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposDominios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarDominio method, of class MiImpl.
     */
    @Test
    public void testGetBuscarDominio() {
        System.out.println("getBuscarDominio");
        Dominios dominio = null;
        MiImpl instance = new MiImpl();
        Dominios expResult = null;
        Dominios result = instance.getBuscarDominio(dominio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarTipoDominio method, of class MiImpl.
     */
    @Test
    public void testGetBuscarTipoDominio() {
        System.out.println("getBuscarTipoDominio");
        Dominios dominio = null;
        MiImpl instance = new MiImpl();
        Dominios expResult = null;
        Dominios result = instance.getBuscarTipoDominio(dominio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarDominio method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarDominio() {
        System.out.println("setRegistrarDominio");
        Dominios dominio = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarDominio(dominio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEliminarDominio method, of class MiImpl.
     */
    @Test
    public void testSetEliminarDominio() {
        System.out.println("setEliminarDominio");
        Dominios dominio = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setEliminarDominio(dominio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarDominioOtrasTb method, of class MiImpl.
     */
    @Test
    public void testGetBuscarDominioOtrasTb() {
        System.out.println("getBuscarDominioOtrasTb");
        Dominios dominio = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.getBuscarDominioOtrasTb(dominio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTuplas method, of class MiImpl.
     */
    @Test
    public void testGetListarTuplas() {
        System.out.println("getListarTuplas");
        Dominios dominio = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTuplas(dominio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTuplasPadre method, of class MiImpl.
     */
    @Test
    public void testGetListarTuplasPadre() {
        System.out.println("getListarTuplasPadre");
        Dominios dominio = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTuplasPadre(dominio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarTupla method, of class MiImpl.
     */
    @Test
    public void testGetBuscarTupla() {
        System.out.println("getBuscarTupla");
        Dominios dominio = null;
        MiImpl instance = new MiImpl();
        Dominios expResult = null;
        Dominios result = instance.getBuscarTupla(dominio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarTupla method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarTupla() {
        System.out.println("setRegistrarTupla");
        Dominios dominio = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarTupla(dominio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEliminarTupla method, of class MiImpl.
     */
    @Test
    public void testSetEliminarTupla() {
        System.out.println("setEliminarTupla");
        Dominios dominio = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setEliminarTupla(dominio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarTupla2 method, of class MiImpl.
     */
    @Test
    public void testGetBuscarTupla2() {
        System.out.println("getBuscarTupla2");
        Dominios dominio = null;
        MiImpl instance = new MiImpl();
        Dominios expResult = null;
        Dominios result = instance.getBuscarTupla2(dominio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarTempTupla method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarTempTupla() {
        System.out.println("setRegistrarTempTupla");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarTempTupla(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLimpiarTempTuplas method, of class MiImpl.
     */
    @Test
    public void testSetLimpiarTempTuplas() {
        System.out.println("setLimpiarTempTuplas");
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setLimpiarTempTuplas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarFormularios method, of class MiImpl.
     */
    @Test
    public void testGetListarFormularios() {
        System.out.println("getListarFormularios");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarFormularios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarFormulariosAcceso method, of class MiImpl.
     */
    @Test
    public void testGetListarFormulariosAcceso() {
        System.out.println("getListarFormulariosAcceso");
        Clientes cliente = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarFormulariosAcceso(cliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCampos method, of class MiImpl.
     */
    @Test
    public void testGetListarCampos() {
        System.out.println("getListarCampos");
        Campos campo = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCampos(campo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarFormulario method, of class MiImpl.
     */
    @Test
    public void testGetBuscarFormulario() {
        System.out.println("getBuscarFormulario");
        Campos campo = null;
        MiImpl instance = new MiImpl();
        Campos expResult = null;
        Campos result = instance.getBuscarFormulario(campo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarCampoForm method, of class MiImpl.
     */
    @Test
    public void testGetBuscarCampoForm() {
        System.out.println("getBuscarCampoForm");
        Campos campo = null;
        MiImpl instance = new MiImpl();
        Campos expResult = null;
        Campos result = instance.getBuscarCampoForm(campo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposValidaciones method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposValidaciones() {
        System.out.println("getListarTiposValidaciones");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposValidaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarTipoValidacion method, of class MiImpl.
     */
    @Test
    public void testGetBuscarTipoValidacion() {
        System.out.println("getBuscarTipoValidacion");
        Campos campo = null;
        MiImpl instance = new MiImpl();
        Campos expResult = null;
        Campos result = instance.getBuscarTipoValidacion(campo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarCampo method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarCampo() {
        System.out.println("setRegistrarCampo");
        Campos campo = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarCampo(campo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEliminarCampo method, of class MiImpl.
     */
    @Test
    public void testSetEliminarCampo() {
        System.out.println("setEliminarCampo");
        Campos campo = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setEliminarCampo(campo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarFormulario1 method, of class MiImpl.
     */
    @Test
    public void testGetBuscarFormulario1() {
        System.out.println("getBuscarFormulario1");
        Campos campo = null;
        MiImpl instance = new MiImpl();
        Campos expResult = null;
        Campos result = instance.getBuscarFormulario1(campo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposPermisos method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposPermisos() {
        System.out.println("getListarTiposPermisos");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposPermisos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCamposAcl method, of class MiImpl.
     */
    @Test
    public void testGetListarCamposAcl() {
        System.out.println("getListarCamposAcl");
        Campos campo = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCamposAcl(campo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarAcl method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarAcl() {
        System.out.println("setRegistrarAcl");
        Campos campo = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarAcl(campo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEliminarAcl method, of class MiImpl.
     */
    @Test
    public void testSetEliminarAcl() {
        System.out.println("setEliminarAcl");
        Campos campo = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setEliminarAcl(campo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarInformes method, of class MiImpl.
     */
    @Test
    public void testGetListarInformes() {
        System.out.println("getListarInformes");
        Informes informe = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarInformes(informe);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarInforme method, of class MiImpl.
     */
    @Test
    public void testGetBuscarInforme() {
        System.out.println("getBuscarInforme");
        Informes informe = null;
        MiImpl instance = new MiImpl();
        Informes expResult = null;
        Informes result = instance.getBuscarInforme(informe);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarInforme method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarInforme() {
        System.out.println("setRegistrarInforme");
        Informes informe = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarInforme(informe);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEliminarInforme method, of class MiImpl.
     */
    @Test
    public void testSetEliminarInforme() {
        System.out.println("setEliminarInforme");
        Informes informe = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setEliminarInforme(informe);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarInformesActividad method, of class MiImpl.
     */
    @Test
    public void testGetListarInformesActividad() {
        System.out.println("getListarInformesActividad");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarInformesActividad(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarInforme2 method, of class MiImpl.
     */
    @Test
    public void testGetBuscarInforme2() {
        System.out.println("getBuscarInforme2");
        Informes informe = null;
        MiImpl instance = new MiImpl();
        Informes expResult = null;
        Informes result = instance.getBuscarInforme2(informe);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarDatosTabla method, of class MiImpl.
     */
    @Test
    public void testGetListarDatosTabla() {
        System.out.println("getListarDatosTabla");
        Abm abm = null;
        MiImpl instance = new MiImpl();
        String expResult = "";
        String result = instance.getListarDatosTabla(abm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarDatosPrimarios method, of class MiImpl.
     */
    @Test
    public void testGetListarDatosPrimarios() {
        System.out.println("getListarDatosPrimarios");
        Abm abm = null;
        MiImpl instance = new MiImpl();
        String expResult = "";
        String result = instance.getListarDatosPrimarios(abm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCamposTabla2 method, of class MiImpl.
     */
    @Test
    public void testGetListarCamposTabla2() {
        System.out.println("getListarCamposTabla2");
        Abm abm = null;
        MiImpl instance = new MiImpl();
        Abm expResult = null;
        Abm result = instance.getListarCamposTabla2(abm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarCampoGw method, of class MiImpl.
     */
    @Test
    public void testGetBuscarCampoGw() {
        System.out.println("getBuscarCampoGw");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        Tramites expResult = null;
        Tramites result = instance.getBuscarCampoGw(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTramitesMiosLimbo method, of class MiImpl.
     */
    @Test
    public void testGetListarTramitesMiosLimbo() {
        System.out.println("getListarTramitesMiosLimbo");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTramitesMiosLimbo(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarValorLimbo method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarValorLimbo() {
        System.out.println("setRegistrarValorLimbo");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarValorLimbo(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInsertarTramiteLimbo method, of class MiImpl.
     */
    @Test
    public void testSetInsertarTramiteLimbo() {
        System.out.println("setInsertarTramiteLimbo");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setInsertarTramiteLimbo(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRetrocederTramiteLimbo method, of class MiImpl.
     */
    @Test
    public void testSetRetrocederTramiteLimbo() {
        System.out.println("setRetrocederTramiteLimbo");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRetrocederTramiteLimbo(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarValorLimbo2 method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarValorLimbo2() {
        System.out.println("setRegistrarValorLimbo2");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarValorLimbo2(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarTrPrFrLogLimbo method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarTrPrFrLogLimbo() {
        System.out.println("setRegistrarTrPrFrLogLimbo");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarTrPrFrLogLimbo(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarFormularioNuevo method, of class MiImpl.
     */
    @Test
    public void testGetListarFormularioNuevo() {
        System.out.println("getListarFormularioNuevo");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarFormularioNuevo(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarTieneHijos method, of class MiImpl.
     */
    @Test
    public void testGetBuscarTieneHijos() {
        System.out.println("getBuscarTieneHijos");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.getBuscarTieneHijos(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCombos2 method, of class MiImpl.
     */
    @Test
    public void testGetListarCombos2() {
        System.out.println("getListarCombos2");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCombos2(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarTuplaPadre method, of class MiImpl.
     */
    @Test
    public void testGetBuscarTuplaPadre() {
        System.out.println("getBuscarTuplaPadre");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.getBuscarTuplaPadre(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInsertarTramite method, of class MiImpl.
     */
    @Test
    public void testSetInsertarTramite() {
        System.out.println("setInsertarTramite");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setInsertarTramite(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarActividadMinima method, of class MiImpl.
     */
    @Test
    public void testGetBuscarActividadMinima() {
        System.out.println("getBuscarActividadMinima");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.getBuscarActividadMinima(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInsertarFrLog method, of class MiImpl.
     */
    @Test
    public void testSetInsertarFrLog() {
        System.out.println("setInsertarFrLog");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setInsertarFrLog(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarValor method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarValor() {
        System.out.println("setRegistrarValor");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarValor(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarTramite method, of class MiImpl.
     */
    @Test
    public void testGetBuscarTramite() {
        System.out.println("getBuscarTramite");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        Tramites expResult = null;
        Tramites result = instance.getBuscarTramite(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRecibirTramite method, of class MiImpl.
     */
    @Test
    public void testSetRecibirTramite() {
        System.out.println("setRecibirTramite");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRecibirTramite(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarFrLog method, of class MiImpl.
     */
    @Test
    public void testGetBuscarFrLog() {
        System.out.println("getBuscarFrLog");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        Tramites expResult = null;
        Tramites result = instance.getBuscarFrLog(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAvanzarTramite method, of class MiImpl.
     */
    @Test
    public void testSetAvanzarTramite() {
        System.out.println("setAvanzarTramite");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setAvanzarTramite(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConcluirTramite method, of class MiImpl.
     */
    @Test
    public void testSetConcluirTramite() {
        System.out.println("setConcluirTramite");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setConcluirTramite(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEliminarFrLog method, of class MiImpl.
     */
    @Test
    public void testSetEliminarFrLog() {
        System.out.println("setEliminarFrLog");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setEliminarFrLog(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTramitesMios method, of class MiImpl.
     */
    @Test
    public void testGetListarTramitesMios() {
        System.out.println("getListarTramitesMios");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTramitesMios(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTramitesMiosFiltrado method, of class MiImpl.
     */
    @Test
    public void testGetListarTramitesMiosFiltrado() {
        System.out.println("getListarTramitesMiosFiltrado");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTramitesMiosFiltrado(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTramitesMiosDespachados method, of class MiImpl.
     */
    @Test
    public void testGetListarTramitesMiosDespachados() {
        System.out.println("getListarTramitesMiosDespachados");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTramitesMiosDespachados(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTramitesMiosDespachadosFiltrado method, of class MiImpl.
     */
    @Test
    public void testGetListarTramitesMiosDespachadosFiltrado() {
        System.out.println("getListarTramitesMiosDespachadosFiltrado");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTramitesMiosDespachadosFiltrado(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarUsuariosActividadSiguiente method, of class MiImpl.
     */
    @Test
    public void testGetListarUsuariosActividadSiguiente() {
        System.out.println("getListarUsuariosActividadSiguiente");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarUsuariosActividadSiguiente(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCamposReferencia method, of class MiImpl.
     */
    @Test
    public void testGetListarCamposReferencia() {
        System.out.println("getListarCamposReferencia");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCamposReferencia(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRetrocederTramite method, of class MiImpl.
     */
    @Test
    public void testSetRetrocederTramite() {
        System.out.println("setRetrocederTramite");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRetrocederTramite(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarFormulario method, of class MiImpl.
     */
    @Test
    public void testGetListarFormulario() {
        System.out.println("getListarFormulario");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarFormulario(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarPersonaUsuario method, of class MiImpl.
     */
    @Test
    public void testGetBuscarPersonaUsuario() {
        System.out.println("getBuscarPersonaUsuario");
        Personas persona = null;
        MiImpl instance = new MiImpl();
        Personas expResult = null;
        Personas result = instance.getBuscarPersonaUsuario(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarProveido method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarProveido() {
        System.out.println("setRegistrarProveido");
        Proveidos proveido = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarProveido(proveido);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarUltimoProveido method, of class MiImpl.
     */
    @Test
    public void testGetBuscarUltimoProveido() {
        System.out.println("getBuscarUltimoProveido");
        Proveidos proveido = null;
        MiImpl instance = new MiImpl();
        Proveidos expResult = null;
        Proveidos result = instance.getBuscarUltimoProveido(proveido);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarUltimoProveido2 method, of class MiImpl.
     */
    @Test
    public void testGetBuscarUltimoProveido2() {
        System.out.println("getBuscarUltimoProveido2");
        Proveidos proveido = null;
        MiImpl instance = new MiImpl();
        String expResult = "";
        String result = instance.getBuscarUltimoProveido2(proveido);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarProveidosHistoricos method, of class MiImpl.
     */
    @Test
    public void testGetListarProveidosHistoricos() {
        System.out.println("getListarProveidosHistoricos");
        Proveidos proveido = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarProveidosHistoricos(proveido);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarProveido method, of class MiImpl.
     */
    @Test
    public void testGetBuscarProveido() {
        System.out.println("getBuscarProveido");
        Proveidos proveido = null;
        MiImpl instance = new MiImpl();
        Proveidos expResult = null;
        Proveidos result = instance.getBuscarProveido(proveido);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarAdjunto method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarAdjunto() {
        System.out.println("setRegistrarAdjunto");
        Adjuntos adjunto = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarAdjunto(adjunto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarAdjuntos method, of class MiImpl.
     */
    @Test
    public void testGetListarAdjuntos() {
        System.out.println("getListarAdjuntos");
        Adjuntos adjunto = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarAdjuntos(adjunto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTramitesMiosAgrupados method, of class MiImpl.
     */
    @Test
    public void testGetListarTramitesMiosAgrupados() {
        System.out.println("getListarTramitesMiosAgrupados");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTramitesMiosAgrupados(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTramitesMiosAgrupados2 method, of class MiImpl.
     */
    @Test
    public void testGetListarTramitesMiosAgrupados2() {
        System.out.println("getListarTramitesMiosAgrupados2");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTramitesMiosAgrupados2(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTramitesMiosAgrupadosDespachados method, of class MiImpl.
     */
    @Test
    public void testGetListarTramitesMiosAgrupadosDespachados() {
        System.out.println("getListarTramitesMiosAgrupadosDespachados");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTramitesMiosAgrupadosDespachados(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTramitesMiosAgrupadosDespachados2 method, of class MiImpl.
     */
    @Test
    public void testGetListarTramitesMiosAgrupadosDespachados2() {
        System.out.println("getListarTramitesMiosAgrupadosDespachados2");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTramitesMiosAgrupadosDespachados2(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContarTramitesPorFechaEstado method, of class MiImpl.
     */
    @Test
    public void testGetContarTramitesPorFechaEstado() {
        System.out.println("getContarTramitesPorFechaEstado");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        Tramites expResult = null;
        Tramites result = instance.getContarTramitesPorFechaEstado(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContarTramitesPorFechaEstado2 method, of class MiImpl.
     */
    @Test
    public void testGetContarTramitesPorFechaEstado2() {
        System.out.println("getContarTramitesPorFechaEstado2");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        Tramites expResult = null;
        Tramites result = instance.getContarTramitesPorFechaEstado2(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContarTramitesPorFecha method, of class MiImpl.
     */
    @Test
    public void testGetContarTramitesPorFecha() {
        System.out.println("getContarTramitesPorFecha");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        Tramites expResult = null;
        Tramites result = instance.getContarTramitesPorFecha(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContarTramitesPorFecha2 method, of class MiImpl.
     */
    @Test
    public void testGetContarTramitesPorFecha2() {
        System.out.println("getContarTramitesPorFecha2");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        Tramites expResult = null;
        Tramites result = instance.getContarTramitesPorFecha2(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContarTramitesPorFecha3 method, of class MiImpl.
     */
    @Test
    public void testGetContarTramitesPorFecha3() {
        System.out.println("getContarTramitesPorFecha3");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        Tramites expResult = null;
        Tramites result = instance.getContarTramitesPorFecha3(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCamposProceso method, of class MiImpl.
     */
    @Test
    public void testGetListarCamposProceso() {
        System.out.println("getListarCamposProceso");
        Campos campo = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCamposProceso(campo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCamposReporte method, of class MiImpl.
     */
    @Test
    public void testGetListarCamposReporte() {
        System.out.println("getListarCamposReporte");
        Campos campo = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCamposReporte(campo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCamposReporte2 method, of class MiImpl.
     */
    @Test
    public void testGetListarCamposReporte2() {
        System.out.println("getListarCamposReporte2");
        Campos campo = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCamposReporte2(campo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTotalesDatos method, of class MiImpl.
     */
    @Test
    public void testGetListarTotalesDatos() {
        System.out.println("getListarTotalesDatos");
        Campos campo = null;
        MiImpl instance = new MiImpl();
        String expResult = "";
        String result = instance.getListarTotalesDatos(campo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTramitesPorCampos method, of class MiImpl.
     */
    @Test
    public void testGetListarTramitesPorCampos() {
        System.out.println("getListarTramitesPorCampos");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTramitesPorCampos(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarTramiteExisteUbicacionOrganica method, of class MiImpl.
     */
    @Test
    public void testGetBuscarTramiteExisteUbicacionOrganica() {
        System.out.println("getBuscarTramiteExisteUbicacionOrganica");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.getBuscarTramiteExisteUbicacionOrganica(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarTramiteUbicacionOrganica method, of class MiImpl.
     */
    @Test
    public void testGetBuscarTramiteUbicacionOrganica() {
        System.out.println("getBuscarTramiteUbicacionOrganica");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        Tramites expResult = null;
        Tramites result = instance.getBuscarTramiteUbicacionOrganica(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTramiteLog method, of class MiImpl.
     */
    @Test
    public void testGetListarTramiteLog() {
        System.out.println("getListarTramiteLog");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTramiteLog(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTramitesFechaUbicacionOrganica method, of class MiImpl.
     */
    @Test
    public void testGetListarTramitesFechaUbicacionOrganica() {
        System.out.println("getListarTramitesFechaUbicacionOrganica");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTramitesFechaUbicacionOrganica(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTramitesIniciados method, of class MiImpl.
     */
    @Test
    public void testGetListarTramitesIniciados() {
        System.out.println("getListarTramitesIniciados");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTramitesIniciados(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTramitesMovidos method, of class MiImpl.
     */
    @Test
    public void testGetListarTramitesMovidos() {
        System.out.println("getListarTramitesMovidos");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTramitesMovidos(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTramitesConcluidos method, of class MiImpl.
     */
    @Test
    public void testGetListarTramitesConcluidos() {
        System.out.println("getListarTramitesConcluidos");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTramitesConcluidos(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTramitesIniciadosDetalle method, of class MiImpl.
     */
    @Test
    public void testGetListarTramitesIniciadosDetalle() {
        System.out.println("getListarTramitesIniciadosDetalle");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTramitesIniciadosDetalle(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTramitesMovidosDetalle method, of class MiImpl.
     */
    @Test
    public void testGetListarTramitesMovidosDetalle() {
        System.out.println("getListarTramitesMovidosDetalle");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTramitesMovidosDetalle(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTramitesConcluidosDetalle method, of class MiImpl.
     */
    @Test
    public void testGetListarTramitesConcluidosDetalle() {
        System.out.println("getListarTramitesConcluidosDetalle");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTramitesConcluidosDetalle(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarDatosTramite method, of class MiImpl.
     */
    @Test
    public void testGetListarDatosTramite() {
        System.out.println("getListarDatosTramite");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarDatosTramite(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBloquearTramite method, of class MiImpl.
     */
    @Test
    public void testSetBloquearTramite() {
        System.out.println("setBloquearTramite");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setBloquearTramite(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDesbloquearTramite method, of class MiImpl.
     */
    @Test
    public void testSetDesbloquearTramite() {
        System.out.println("setDesbloquearTramite");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setDesbloquearTramite(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTramitesAnulados method, of class MiImpl.
     */
    @Test
    public void testGetListarTramitesAnulados() {
        System.out.println("getListarTramitesAnulados");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTramitesAnulados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnularTramite method, of class MiImpl.
     */
    @Test
    public void testSetAnularTramite() {
        System.out.println("setAnularTramite");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setAnularTramite(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCambiarEstadoTramite method, of class MiImpl.
     */
    @Test
    public void testSetCambiarEstadoTramite() {
        System.out.println("setCambiarEstadoTramite");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setCambiarEstadoTramite(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarNoticias method, of class MiImpl.
     */
    @Test
    public void testGetListarNoticias() {
        System.out.println("getListarNoticias");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarNoticias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposTableros method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposTableros() {
        System.out.println("getListarTiposTableros");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposTableros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposAvisos method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposAvisos() {
        System.out.println("getListarTiposAvisos");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposAvisos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarTablero method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarTablero() {
        System.out.println("setRegistrarTablero");
        Tableros tablero = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarTablero(tablero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarTablero method, of class MiImpl.
     */
    @Test
    public void testGetBuscarTablero() {
        System.out.println("getBuscarTablero");
        Tableros tablero = null;
        MiImpl instance = new MiImpl();
        Tableros expResult = null;
        Tableros result = instance.getBuscarTablero(tablero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEliminarTablero method, of class MiImpl.
     */
    @Test
    public void testSetEliminarTablero() {
        System.out.println("setEliminarTablero");
        Tableros tablero = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setEliminarTablero(tablero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTramitesImpresion method, of class MiImpl.
     */
    @Test
    public void testGetListarTramitesImpresion() {
        System.out.println("getListarTramitesImpresion");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTramitesImpresion(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTramites method, of class MiImpl.
     */
    @Test
    public void testGetListarTramites() {
        System.out.println("getListarTramites");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTramites(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRedireccionarTramite method, of class MiImpl.
     */
    @Test
    public void testSetRedireccionarTramite() {
        System.out.println("setRedireccionarTramite");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRedireccionarTramite(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarActividades2 method, of class MiImpl.
     */
    @Test
    public void testGetListarActividades2() {
        System.out.println("getListarActividades2");
        Actividades actividad = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarActividades2(actividad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarUsuariosRolActividad method, of class MiImpl.
     */
    @Test
    public void testGetListarUsuariosRolActividad() {
        System.out.println("getListarUsuariosRolActividad");
        Actividades actividad = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarUsuariosRolActividad(actividad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarTramite2 method, of class MiImpl.
     */
    @Test
    public void testGetBuscarTramite2() {
        System.out.println("getBuscarTramite2");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        Tramites expResult = null;
        Tramites result = instance.getBuscarTramite2(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReingresarTramite method, of class MiImpl.
     */
    @Test
    public void testSetReingresarTramite() {
        System.out.println("setReingresarTramite");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setReingresarTramite(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarTipoProceso2 method, of class MiImpl.
     */
    @Test
    public void testGetBuscarTipoProceso2() {
        System.out.println("getBuscarTipoProceso2");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        Tramites expResult = null;
        Tramites result = instance.getBuscarTipoProceso2(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarUsuario method, of class MiImpl.
     */
    @Test
    public void testGetBuscarUsuario() {
        System.out.println("getBuscarUsuario");
        Usuarios usuario = null;
        MiImpl instance = new MiImpl();
        Usuarios expResult = null;
        Usuarios result = instance.getBuscarUsuario(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarUsuariosUbicacionOrganica method, of class MiImpl.
     */
    @Test
    public void testGetListarUsuariosUbicacionOrganica() {
        System.out.println("getListarUsuariosUbicacionOrganica");
        Usuarios usuario = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarUsuariosUbicacionOrganica(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTramitesMiosCorrespondenciaDe method, of class MiImpl.
     */
    @Test
    public void testGetListarTramitesMiosCorrespondenciaDe() {
        System.out.println("getListarTramitesMiosCorrespondenciaDe");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTramitesMiosCorrespondenciaDe(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTramitesMiosCorrespondenciaPara method, of class MiImpl.
     */
    @Test
    public void testGetListarTramitesMiosCorrespondenciaPara() {
        System.out.println("getListarTramitesMiosCorrespondenciaPara");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTramitesMiosCorrespondenciaPara(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAvanzarCorrespondencia method, of class MiImpl.
     */
    @Test
    public void testSetAvanzarCorrespondencia() {
        System.out.println("setAvanzarCorrespondencia");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setAvanzarCorrespondencia(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInsertarTramiteCopia method, of class MiImpl.
     */
    @Test
    public void testSetInsertarTramiteCopia() {
        System.out.println("setInsertarTramiteCopia");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setInsertarTramiteCopia(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarProveidoCorresp method, of class MiImpl.
     */
    @Test
    public void testGetBuscarProveidoCorresp() {
        System.out.println("getBuscarProveidoCorresp");
        Proveidos proveido = null;
        MiImpl instance = new MiImpl();
        Proveidos expResult = null;
        Proveidos result = instance.getBuscarProveidoCorresp(proveido);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCamposActividad method, of class MiImpl.
     */
    @Test
    public void testGetListarCamposActividad() {
        System.out.println("getListarCamposActividad");
        Campos campo = null;
        MiImpl instance = new MiImpl();
        String expResult = "";
        String result = instance.getListarCamposActividad(campo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarActividadesRoles method, of class MiImpl.
     */
    @Test
    public void testGetListarActividadesRoles() {
        System.out.println("getListarActividadesRoles");
        Actividades actividad = null;
        MiImpl instance = new MiImpl();
        String expResult = "";
        String result = instance.getListarActividadesRoles(actividad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarUsuariosHilos method, of class MiImpl.
     */
    @Test
    public void testGetListarUsuariosHilos() {
        System.out.println("getListarUsuariosHilos");
        Usuarios usuario = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarUsuariosHilos(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposHilos method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposHilos() {
        System.out.println("getListarTiposHilos");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposHilos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarHilo method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarHilo() {
        System.out.println("setRegistrarHilo");
        Hilos hilo = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarHilo(hilo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposSegmentos method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposSegmentos() {
        System.out.println("getListarTiposSegmentos");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposSegmentos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarSegmentos method, of class MiImpl.
     */
    @Test
    public void testGetListarSegmentos() {
        System.out.println("getListarSegmentos");
        Hilos hilo = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarSegmentos(hilo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarDestinatarios method, of class MiImpl.
     */
    @Test
    public void testGetListarDestinatarios() {
        System.out.println("getListarDestinatarios");
        Hilos hilo = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarDestinatarios(hilo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarSegmento method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarSegmento() {
        System.out.println("setRegistrarSegmento");
        Hilos hilo = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarSegmento(hilo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarSgmAdjunto method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarSgmAdjunto() {
        System.out.println("setRegistrarSgmAdjunto");
        Hilos hilo = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarSgmAdjunto(hilo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarAdjuntosHilos method, of class MiImpl.
     */
    @Test
    public void testGetListarAdjuntosHilos() {
        System.out.println("getListarAdjuntosHilos");
        Hilos hilo = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarAdjuntosHilos(hilo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarHilo method, of class MiImpl.
     */
    @Test
    public void testGetBuscarHilo() {
        System.out.println("getBuscarHilo");
        Hilos hilo = null;
        MiImpl instance = new MiImpl();
        Hilos expResult = null;
        Hilos result = instance.getBuscarHilo(hilo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarHilosMios method, of class MiImpl.
     */
    @Test
    public void testGetListarHilosMios() {
        System.out.println("getListarHilosMios");
        Hilos hilo = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarHilosMios(hilo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarHilosAMi method, of class MiImpl.
     */
    @Test
    public void testGetListarHilosAMi() {
        System.out.println("getListarHilosAMi");
        Hilos hilo = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarHilosAMi(hilo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNroMensajes method, of class MiImpl.
     */
    @Test
    public void testGetNroMensajes() {
        System.out.println("getNroMensajes");
        Hilos hilo = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.getNroMensajes(hilo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNroMensajesNuevos method, of class MiImpl.
     */
    @Test
    public void testGetNroMensajesNuevos() {
        System.out.println("getNroMensajesNuevos");
        Hilos hilo = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.getNroMensajesNuevos(hilo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBorrarHilo method, of class MiImpl.
     */
    @Test
    public void testSetBorrarHilo() {
        System.out.println("setBorrarHilo");
        Hilos hilo = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setBorrarHilo(hilo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarEstadosTramites method, of class MiImpl.
     */
    @Test
    public void testGetListarEstadosTramites() {
        System.out.println("getListarEstadosTramites");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarEstadosTramites();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTramitesEstadoFechaUbicacionOrganica method, of class MiImpl.
     */
    @Test
    public void testGetListarTramitesEstadoFechaUbicacionOrganica() {
        System.out.println("getListarTramitesEstadoFechaUbicacionOrganica");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTramitesEstadoFechaUbicacionOrganica(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCamposAcl2 method, of class MiImpl.
     */
    @Test
    public void testGetListarCamposAcl2() {
        System.out.println("getListarCamposAcl2");
        Campos campo = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCamposAcl2(campo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarAcl2 method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarAcl2() {
        System.out.println("setRegistrarAcl2");
        Campos campo = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarAcl2(campo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEliminarAcl2 method, of class MiImpl.
     */
    @Test
    public void testSetEliminarAcl2() {
        System.out.println("setEliminarAcl2");
        Campos campo = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setEliminarAcl2(campo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarActividadesNoLimbo method, of class MiImpl.
     */
    @Test
    public void testGetListarActividadesNoLimbo() {
        System.out.println("getListarActividadesNoLimbo");
        Actividades actividad = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarActividadesNoLimbo(actividad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarActividadesLimbo method, of class MiImpl.
     */
    @Test
    public void testGetListarActividadesLimbo() {
        System.out.println("getListarActividadesLimbo");
        Actividades actividad = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarActividadesLimbo(actividad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarTablaLimbo method, of class MiImpl.
     */
    @Test
    public void testGetBuscarTablaLimbo() {
        System.out.println("getBuscarTablaLimbo");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        String expResult = "";
        String result = instance.getBuscarTablaLimbo(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAvanzarTramiteLimbo method, of class MiImpl.
     */
    @Test
    public void testSetAvanzarTramiteLimbo() {
        System.out.println("setAvanzarTramiteLimbo");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setAvanzarTramiteLimbo(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarIdCampoLimbo method, of class MiImpl.
     */
    @Test
    public void testGetBuscarIdCampoLimbo() {
        System.out.println("getBuscarIdCampoLimbo");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.getBuscarIdCampoLimbo(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVerificarUsuario method, of class MiImpl.
     */
    @Test
    public void testGetVerificarUsuario() {
        System.out.println("getVerificarUsuario");
        Usuarios usuario = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.getVerificarUsuario(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarNuevaClave method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarNuevaClave() {
        System.out.println("setRegistrarNuevaClave");
        Usuarios usuario = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarNuevaClave(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHabilitarTramite method, of class MiImpl.
     */
    @Test
    public void testSetHabilitarTramite() {
        System.out.println("setHabilitarTramite");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setHabilitarTramite(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTramitesPorEstadoFecha method, of class MiImpl.
     */
    @Test
    public void testGetListarTramitesPorEstadoFecha() {
        System.out.println("getListarTramitesPorEstadoFecha");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTramitesPorEstadoFecha(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarFormulario method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarFormulario() {
        System.out.println("setRegistrarFormulario");
        Campos campo = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarFormulario(campo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEliminarFormulario method, of class MiImpl.
     */
    @Test
    public void testSetEliminarFormulario() {
        System.out.println("setEliminarFormulario");
        Campos campo = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setEliminarFormulario(campo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarProcesosAccesoKardex method, of class MiImpl.
     */
    @Test
    public void testGetListarProcesosAccesoKardex() {
        System.out.println("getListarProcesosAccesoKardex");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarProcesosAccesoKardex();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTramitesMiosKardex method, of class MiImpl.
     */
    @Test
    public void testGetListarTramitesMiosKardex() {
        System.out.println("getListarTramitesMiosKardex");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTramitesMiosKardex(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTramitesMiosKardexPorProceso method, of class MiImpl.
     */
    @Test
    public void testGetListarTramitesMiosKardexPorProceso() {
        System.out.println("getListarTramitesMiosKardexPorProceso");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTramitesMiosKardexPorProceso(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarProcesosKardexs method, of class MiImpl.
     */
    @Test
    public void testGetListarProcesosKardexs() {
        System.out.println("getListarProcesosKardexs");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarProcesosKardexs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarProcesoKardex method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarProcesoKardex() {
        System.out.println("setRegistrarProcesoKardex");
        Actividades actividad = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarProcesoKardex(actividad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModificarProcesoKardex method, of class MiImpl.
     */
    @Test
    public void testSetModificarProcesoKardex() {
        System.out.println("setModificarProcesoKardex");
        Actividades actividad = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setModificarProcesoKardex(actividad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEliminarProcesoKardex method, of class MiImpl.
     */
    @Test
    public void testSetEliminarProcesoKardex() {
        System.out.println("setEliminarProcesoKardex");
        Actividades actividad = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setEliminarProcesoKardex(actividad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarTipoPermiso method, of class MiImpl.
     */
    @Test
    public void testGetBuscarTipoPermiso() {
        System.out.println("getBuscarTipoPermiso");
        Campos campo = null;
        MiImpl instance = new MiImpl();
        Campos expResult = null;
        Campos result = instance.getBuscarTipoPermiso(campo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarCampoAclProcesoKardex method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarCampoAclProcesoKardex() {
        System.out.println("setRegistrarCampoAclProcesoKardex");
        Campos campo = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarCampoAclProcesoKardex(campo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTramitesMiosKardexPorProcesoAtendidos method, of class MiImpl.
     */
    @Test
    public void testGetListarTramitesMiosKardexPorProcesoAtendidos() {
        System.out.println("getListarTramitesMiosKardexPorProcesoAtendidos");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTramitesMiosKardexPorProcesoAtendidos(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarMinMaxTramitesMiosKardexPorProceso method, of class MiImpl.
     */
    @Test
    public void testGetBuscarMinMaxTramitesMiosKardexPorProceso() {
        System.out.println("getBuscarMinMaxTramitesMiosKardexPorProceso");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        Tramites expResult = null;
        Tramites result = instance.getBuscarMinMaxTramitesMiosKardexPorProceso(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTramitesFuncionarios method, of class MiImpl.
     */
    @Test
    public void testGetListarTramitesFuncionarios() {
        System.out.println("getListarTramitesFuncionarios");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTramitesFuncionarios(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTramitesFuncionarioProceso method, of class MiImpl.
     */
    @Test
    public void testGetListarTramitesFuncionarioProceso() {
        System.out.println("getListarTramitesFuncionarioProceso");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTramitesFuncionarioProceso(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTramitesAtendidos method, of class MiImpl.
     */
    @Test
    public void testGetListarTramitesAtendidos() {
        System.out.println("getListarTramitesAtendidos");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTramitesAtendidos(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContarTramitesAtendidos method, of class MiImpl.
     */
    @Test
    public void testGetContarTramitesAtendidos() {
        System.out.println("getContarTramitesAtendidos");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        Tramites expResult = null;
        Tramites result = instance.getContarTramitesAtendidos(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContarPaginas method, of class MiImpl.
     */
    @Test
    public void testGetContarPaginas() {
        System.out.println("getContarPaginas");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        String expResult = "";
        String result = instance.getContarPaginas(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContarPaginasDespachados method, of class MiImpl.
     */
    @Test
    public void testGetContarPaginasDespachados() {
        System.out.println("getContarPaginasDespachados");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        String expResult = "";
        String result = instance.getContarPaginasDespachados(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContarPaginasLimbo method, of class MiImpl.
     */
    @Test
    public void testGetContarPaginasLimbo() {
        System.out.println("getContarPaginasLimbo");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        String expResult = "";
        String result = instance.getContarPaginasLimbo(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTramitesCorrelativo method, of class MiImpl.
     */
    @Test
    public void testGetListarTramitesCorrelativo() {
        System.out.println("getListarTramitesCorrelativo");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTramitesCorrelativo(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTramitesConcluidosPorProceso method, of class MiImpl.
     */
    @Test
    public void testGetListarTramitesConcluidosPorProceso() {
        System.out.println("getListarTramitesConcluidosPorProceso");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTramitesConcluidosPorProceso(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTramitesConcluidosPorProcesoFiltrado method, of class MiImpl.
     */
    @Test
    public void testGetListarTramitesConcluidosPorProcesoFiltrado() {
        System.out.println("getListarTramitesConcluidosPorProcesoFiltrado");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTramitesConcluidosPorProcesoFiltrado(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContarPaginasConcluidos method, of class MiImpl.
     */
    @Test
    public void testGetContarPaginasConcluidos() {
        System.out.println("getContarPaginasConcluidos");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        String expResult = "";
        String result = instance.getContarPaginasConcluidos(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContarPaginasTramitesGestionProceso method, of class MiImpl.
     */
    @Test
    public void testGetContarPaginasTramitesGestionProceso() {
        System.out.println("getContarPaginasTramitesGestionProceso");
        Tramites tramite = null;
        MiImpl instance = new MiImpl();
        String expResult = "";
        String result = instance.getContarPaginasTramitesGestionProceso(tramite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCamposReferenciaProceso method, of class MiImpl.
     */
    @Test
    public void testGetListarCamposReferenciaProceso() {
        System.out.println("getListarCamposReferenciaProceso");
        Campos campo = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCamposReferenciaProceso(campo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCamposReporteProceso method, of class MiImpl.
     */
    @Test
    public void testGetListarCamposReporteProceso() {
        System.out.println("getListarCamposReporteProceso");
        Campos campo = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCamposReporteProceso(campo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTuplasCampo method, of class MiImpl.
     */
    @Test
    public void testGetListarTuplasCampo() {
        System.out.println("getListarTuplasCampo");
        Campos campo = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTuplasCampo(campo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCamposProcesoWK method, of class MiImpl.
     */
    @Test
    public void testGetListarCamposProcesoWK() {
        System.out.println("getListarCamposProcesoWK");
        Dibwayka dibwayka = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCamposProcesoWK(dibwayka);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarComboWK method, of class MiImpl.
     */
    @Test
    public void testGetListarComboWK() {
        System.out.println("getListarComboWK");
        Dibwayka dibwayka = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarComboWK(dibwayka);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCrearTablasDibWK method, of class MiImpl.
     */
    @Test
    public void testSetCrearTablasDibWK() {
        System.out.println("setCrearTablasDibWK");
        Dibwayka dibwayka = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setCrearTablasDibWK(dibwayka);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCamposDibWK method, of class MiImpl.
     */
    @Test
    public void testGetListarCamposDibWK() {
        System.out.println("getListarCamposDibWK");
        Dibwayka dibwayka = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCamposDibWK(dibwayka);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarTablaDibWK method, of class MiImpl.
     */
    @Test
    public void testGetBuscarTablaDibWK() {
        System.out.println("getBuscarTablaDibWK");
        Dibwayka dibwayka = null;
        MiImpl instance = new MiImpl();
        Dibwayka expResult = null;
        Dibwayka result = instance.getBuscarTablaDibWK(dibwayka);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarCampoDibWK method, of class MiImpl.
     */
    @Test
    public void testGetBuscarCampoDibWK() {
        System.out.println("getBuscarCampoDibWK");
        Dibwayka dibwayka = null;
        MiImpl instance = new MiImpl();
        Dibwayka expResult = null;
        Dibwayka result = instance.getBuscarCampoDibWK(dibwayka);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarTuplaDibWK method, of class MiImpl.
     */
    @Test
    public void testGetBuscarTuplaDibWK() {
        System.out.println("getBuscarTuplaDibWK");
        Dibwayka dibwayka = null;
        MiImpl instance = new MiImpl();
        Dibwayka expResult = null;
        Dibwayka result = instance.getBuscarTuplaDibWK(dibwayka);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInsertarConsultaDibWK method, of class MiImpl.
     */
    @Test
    public void testSetInsertarConsultaDibWK() {
        System.out.println("setInsertarConsultaDibWK");
        Dibwayka dibwayka = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setInsertarConsultaDibWK(dibwayka);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCondicionesConsultaDibWK method, of class MiImpl.
     */
    @Test
    public void testGetListarCondicionesConsultaDibWK() {
        System.out.println("getListarCondicionesConsultaDibWK");
        Dibwayka dibwayka = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCondicionesConsultaDibWK(dibwayka);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarConsultasDibWK method, of class MiImpl.
     */
    @Test
    public void testGetListarConsultasDibWK() {
        System.out.println("getListarConsultasDibWK");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarConsultasDibWK();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBorrarConsultaDibWK method, of class MiImpl.
     */
    @Test
    public void testSetBorrarConsultaDibWK() {
        System.out.println("setBorrarConsultaDibWK");
        Dibwayka dibwayka = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setBorrarConsultaDibWK(dibwayka);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModificarConsultaDibWK method, of class MiImpl.
     */
    @Test
    public void testSetModificarConsultaDibWK() {
        System.out.println("setModificarConsultaDibWK");
        Dibwayka dibwayka = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setModificarConsultaDibWK(dibwayka);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarConsultaDibWK method, of class MiImpl.
     */
    @Test
    public void testGetBuscarConsultaDibWK() {
        System.out.println("getBuscarConsultaDibWK");
        Dibwayka dibwayka = null;
        MiImpl instance = new MiImpl();
        Dibwayka expResult = null;
        Dibwayka result = instance.getBuscarConsultaDibWK(dibwayka);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConsultaCondicionDibWK method, of class MiImpl.
     */
    @Test
    public void testGetConsultaCondicionDibWK() {
        System.out.println("getConsultaCondicionDibWK");
        Dibwayka dibwayka = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getConsultaCondicionDibWK(dibwayka);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrgListarPlanes method, of class MiImpl.
     */
    @Test
    public void testGetPrgListarPlanes() {
        System.out.println("getPrgListarPlanes");
        Programas programa = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getPrgListarPlanes(programa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFclListarPlanes method, of class MiImpl.
     */
    @Test
    public void testGetFclListarPlanes() {
        System.out.println("getFclListarPlanes");
        Facultades facultad = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getFclListarPlanes(facultad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUnvListarPlanes method, of class MiImpl.
     */
    @Test
    public void testGetUnvListarPlanes() {
        System.out.println("getUnvListarPlanes");
        Universidades universidad = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getUnvListarPlanes(universidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlnListarMateriasNivel method, of class MiImpl.
     */
    @Test
    public void testGetPlnListarMateriasNivel() {
        System.out.println("getPlnListarMateriasNivel");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getPlnListarMateriasNivel(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlnListarNroNiveles method, of class MiImpl.
     */
    @Test
    public void testGetPlnListarNroNiveles() {
        System.out.println("getPlnListarNroNiveles");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.getPlnListarNroNiveles(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlnListarMateriasRequisitos method, of class MiImpl.
     */
    @Test
    public void testGetPlnListarMateriasRequisitos() {
        System.out.println("getPlnListarMateriasRequisitos");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getPlnListarMateriasRequisitos(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlnListarMateriasNroRequisitos method, of class MiImpl.
     */
    @Test
    public void testGetPlnListarMateriasNroRequisitos() {
        System.out.println("getPlnListarMateriasNroRequisitos");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getPlnListarMateriasNroRequisitos(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUnvGrdListarPlanes method, of class MiImpl.
     */
    @Test
    public void testGetUnvGrdListarPlanes() {
        System.out.println("getUnvGrdListarPlanes");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getUnvGrdListarPlanes(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrgBuscarPrograma method, of class MiImpl.
     */
    @Test
    public void testGetPrgBuscarPrograma() {
        System.out.println("getPrgBuscarPrograma");
        Programas programa = null;
        MiImpl instance = new MiImpl();
        Programas expResult = null;
        Programas result = instance.getPrgBuscarPrograma(programa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFclListarProgramas method, of class MiImpl.
     */
    @Test
    public void testGetFclListarProgramas() {
        System.out.println("getFclListarProgramas");
        Facultades facultad = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getFclListarProgramas(facultad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUnvListarProgramas method, of class MiImpl.
     */
    @Test
    public void testGetUnvListarProgramas() {
        System.out.println("getUnvListarProgramas");
        Universidades universidad = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getUnvListarProgramas(universidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUnvListarProgramasPost method, of class MiImpl.
     */
    @Test
    public void testGetUnvListarProgramasPost() {
        System.out.println("getUnvListarProgramasPost");
        Universidades universidad = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getUnvListarProgramasPost(universidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDptBuscarDepartamento method, of class MiImpl.
     */
    @Test
    public void testGetDptBuscarDepartamento() {
        System.out.println("getDptBuscarDepartamento");
        Departamentos departamento = null;
        MiImpl instance = new MiImpl();
        Departamentos expResult = null;
        Departamentos result = instance.getDptBuscarDepartamento(departamento);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFclListarDepartamentos method, of class MiImpl.
     */
    @Test
    public void testGetFclListarDepartamentos() {
        System.out.println("getFclListarDepartamentos");
        Facultades facultad = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getFclListarDepartamentos(facultad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUnvListarDepartamentos method, of class MiImpl.
     */
    @Test
    public void testGetUnvListarDepartamentos() {
        System.out.println("getUnvListarDepartamentos");
        Universidades universidad = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getUnvListarDepartamentos(universidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFclBuscarFacultad method, of class MiImpl.
     */
    @Test
    public void testGetFclBuscarFacultad() {
        System.out.println("getFclBuscarFacultad");
        Facultades facultad = null;
        MiImpl instance = new MiImpl();
        Facultades expResult = null;
        Facultades result = instance.getFclBuscarFacultad(facultad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUnvListarFacultades method, of class MiImpl.
     */
    @Test
    public void testGetUnvListarFacultades() {
        System.out.println("getUnvListarFacultades");
        Universidades universidad = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getUnvListarFacultades(universidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUnvListarFacultadesPost method, of class MiImpl.
     */
    @Test
    public void testGetUnvListarFacultadesPost() {
        System.out.println("getUnvListarFacultadesPost");
        Universidades universidad = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getUnvListarFacultadesPost(universidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUnvBuscarUniversidad method, of class MiImpl.
     */
    @Test
    public void testGetUnvBuscarUniversidad() {
        System.out.println("getUnvBuscarUniversidad");
        Universidades universidad = null;
        MiImpl instance = new MiImpl();
        Universidades expResult = null;
        Universidades result = instance.getUnvBuscarUniversidad(universidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMtcMoverNoMatriculados method, of class MiImpl.
     */
    @Test
    public void testGetMtcMoverNoMatriculados() {
        System.out.println("getMtcMoverNoMatriculados");
        Notas nota = null;
        MiImpl instance = new MiImpl();
        Notas expResult = null;
        Notas result = instance.getMtcMoverNoMatriculados(nota);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMtcMoverMatriculados method, of class MiImpl.
     */
    @Test
    public void testGetMtcMoverMatriculados() {
        System.out.println("getMtcMoverMatriculados");
        Notas nota = null;
        MiImpl instance = new MiImpl();
        Notas expResult = null;
        Notas result = instance.getMtcMoverMatriculados(nota);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlnListarMaterias method, of class MiImpl.
     */
    @Test
    public void testGetPlnListarMaterias() {
        System.out.println("getPlnListarMaterias");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getPlnListarMaterias(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstListarEstudiantesNombres method, of class MiImpl.
     */
    @Test
    public void testGetEstListarEstudiantesNombres() {
        System.out.println("getEstListarEstudiantesNombres");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEstListarEstudiantesNombres(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstListarEstudiantesDip method, of class MiImpl.
     */
    @Test
    public void testGetEstListarEstudiantesDip() {
        System.out.println("getEstListarEstudiantesDip");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEstListarEstudiantesDip(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstListarEstudiantesNombresAccesos method, of class MiImpl.
     */
    @Test
    public void testGetEstListarEstudiantesNombresAccesos() {
        System.out.println("getEstListarEstudiantesNombresAccesos");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEstListarEstudiantesNombresAccesos(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstListarEstudiantesDipAccesos method, of class MiImpl.
     */
    @Test
    public void testGetEstListarEstudiantesDipAccesos() {
        System.out.println("getEstListarEstudiantesDipAccesos");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEstListarEstudiantesDipAccesos(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstListarEstudiantesNombres2 method, of class MiImpl.
     */
    @Test
    public void testGetEstListarEstudiantesNombres2() {
        System.out.println("getEstListarEstudiantesNombres2");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEstListarEstudiantesNombres2(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstListarEstudiantesDip2 method, of class MiImpl.
     */
    @Test
    public void testGetEstListarEstudiantesDip2() {
        System.out.println("getEstListarEstudiantesDip2");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEstListarEstudiantesDip2(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrsBuscarPersona method, of class MiImpl.
     */
    @Test
    public void testGetPrsBuscarPersona() {
        System.out.println("getPrsBuscarPersona");
        Personas persona = null;
        MiImpl instance = new MiImpl();
        Personas expResult = null;
        Personas result = instance.getPrsBuscarPersona(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstBuscarEstudiante method, of class MiImpl.
     */
    @Test
    public void testGetEstBuscarEstudiante() {
        System.out.println("getEstBuscarEstudiante");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        Estudiantes expResult = null;
        Estudiantes result = instance.getEstBuscarEstudiante(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstBuscarEstudiantePrograma method, of class MiImpl.
     */
    @Test
    public void testGetEstBuscarEstudiantePrograma() {
        System.out.println("getEstBuscarEstudiantePrograma");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        Estudiantes expResult = null;
        Estudiantes result = instance.getEstBuscarEstudiantePrograma(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstBuscarEstudianteAccesos method, of class MiImpl.
     */
    @Test
    public void testGetEstBuscarEstudianteAccesos() {
        System.out.println("getEstBuscarEstudianteAccesos");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        Estudiantes expResult = null;
        Estudiantes result = instance.getEstBuscarEstudianteAccesos(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrdBuscarPrgPeriodo method, of class MiImpl.
     */
    @Test
    public void testGetPrdBuscarPrgPeriodo() {
        System.out.println("getPrdBuscarPrgPeriodo");
        Programas programa = null;
        MiImpl instance = new MiImpl();
        Programas expResult = null;
        Programas result = instance.getPrdBuscarPrgPeriodo(programa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrgBuscarDetalles method, of class MiImpl.
     */
    @Test
    public void testGetPrgBuscarDetalles() {
        System.out.println("getPrgBuscarDetalles");
        Programas programa = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getPrgBuscarDetalles(programa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstPrgListarProgramacionMateriasAut method, of class MiImpl.
     */
    @Test
    public void testGetEstPrgListarProgramacionMateriasAut() {
        System.out.println("getEstPrgListarProgramacionMateriasAut");
        Materias materia = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEstPrgListarProgramacionMateriasAut(materia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDptoListarMateriaGrupo method, of class MiImpl.
     */
    @Test
    public void testGetDptoListarMateriaGrupo() {
        System.out.println("getDptoListarMateriaGrupo");
        Materias materia = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getDptoListarMateriaGrupo(materia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMdlBuscarMateriaAhorro method, of class MiImpl.
     */
    @Test
    public void testGetMdlBuscarMateriaAhorro() {
        System.out.println("getMdlBuscarMateriaAhorro");
        Programas programa = null;
        MiImpl instance = new MiImpl();
        Programas expResult = null;
        Programas result = instance.getMdlBuscarMateriaAhorro(programa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGrpBuscarGrupo method, of class MiImpl.
     */
    @Test
    public void testGetGrpBuscarGrupo() {
        System.out.println("getGrpBuscarGrupo");
        Grupos grupo = null;
        MiImpl instance = new MiImpl();
        Grupos expResult = null;
        Grupos result = instance.getGrpBuscarGrupo(grupo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDptoBuscarCupoRestanteGrupo method, of class MiImpl.
     */
    @Test
    public void testGetDptoBuscarCupoRestanteGrupo() {
        System.out.println("getDptoBuscarCupoRestanteGrupo");
        Grupos grupo = null;
        MiImpl instance = new MiImpl();
        Grupos expResult = null;
        Grupos result = instance.getDptoBuscarCupoRestanteGrupo(grupo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstProgramacionMateria method, of class MiImpl.
     */
    @Test
    public void testSetEstProgramacionMateria() {
        System.out.println("setEstProgramacionMateria");
        Programas programa = null;
        MiImpl instance = new MiImpl();
        Programas expResult = null;
        Programas result = instance.setEstProgramacionMateria(programa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPstBuscarPostulante method, of class MiImpl.
     */
    @Test
    public void testGetPstBuscarPostulante() {
        System.out.println("getPstBuscarPostulante");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        Postulantes expResult = null;
        Postulantes result = instance.getPstBuscarPostulante(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPstBuscarPostulantePrograma method, of class MiImpl.
     */
    @Test
    public void testGetPstBuscarPostulantePrograma() {
        System.out.println("getPstBuscarPostulantePrograma");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        Postulantes expResult = null;
        Postulantes result = instance.getPstBuscarPostulantePrograma(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPstListarPostulantesNombres method, of class MiImpl.
     */
    @Test
    public void testGetPstListarPostulantesNombres() {
        System.out.println("getPstListarPostulantesNombres");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getPstListarPostulantesNombres(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPstListarPostulantesDip method, of class MiImpl.
     */
    @Test
    public void testGetPstListarPostulantesDip() {
        System.out.println("getPstListarPostulantesDip");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getPstListarPostulantesDip(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPstPrgListarProgramacionMateriasAut method, of class MiImpl.
     */
    @Test
    public void testGetPstPrgListarProgramacionMateriasAut() {
        System.out.println("getPstPrgListarProgramacionMateriasAut");
        Materias materia = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getPstPrgListarProgramacionMateriasAut(materia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPstProgramacionMateria method, of class MiImpl.
     */
    @Test
    public void testSetPstProgramacionMateria() {
        System.out.println("setPstProgramacionMateria");
        Programas programa = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setPstProgramacionMateria(programa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMiPrsBuscarPostulante method, of class MiImpl.
     */
    @Test
    public void testGetMiPrsBuscarPostulante() {
        System.out.println("getMiPrsBuscarPostulante");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        Postulantes expResult = null;
        Postulantes result = instance.getMiPrsBuscarPostulante(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPstRegistrarPrograma method, of class MiImpl.
     */
    @Test
    public void testSetPstRegistrarPrograma() {
        System.out.println("setPstRegistrarPrograma");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        instance.setPstRegistrarPrograma(postulante);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTpsListarProgramaciones method, of class MiImpl.
     */
    @Test
    public void testGetTpsListarProgramaciones() {
        System.out.println("getTpsListarProgramaciones");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getTpsListarProgramaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTpsBuscarProgramacion method, of class MiImpl.
     */
    @Test
    public void testGetTpsBuscarProgramacion() {
        System.out.println("getTpsBuscarProgramacion");
        Programas programa = null;
        MiImpl instance = new MiImpl();
        Programas expResult = null;
        Programas result = instance.getTpsBuscarProgramacion(programa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComprobarEstudiante method, of class MiImpl.
     */
    @Test
    public void testGetComprobarEstudiante() {
        System.out.println("getComprobarEstudiante");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        Estudiantes expResult = null;
        Estudiantes result = instance.getComprobarEstudiante(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMncListarMenciones method, of class MiImpl.
     */
    @Test
    public void testGetMncListarMenciones() {
        System.out.println("getMncListarMenciones");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getMncListarMenciones(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstListarProgramacionMateriasReq method, of class MiImpl.
     */
    @Test
    public void testGetEstListarProgramacionMateriasReq() {
        System.out.println("getEstListarProgramacionMateriasReq");
        Materias materia = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEstListarProgramacionMateriasReq(materia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarNivelMaximoPlanesEst method, of class MiImpl.
     */
    @Test
    public void testGetBuscarNivelMaximoPlanesEst() {
        System.out.println("getBuscarNivelMaximoPlanesEst");
        Programas programa = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.getBuscarNivelMaximoPlanesEst(programa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getZchListarChoqueMaterias method, of class MiImpl.
     */
    @Test
    public void testGetZchListarChoqueMaterias() {
        System.out.println("getZchListarChoqueMaterias");
        Programas programa = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getZchListarChoqueMaterias(programa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getZchListarChoquePeriodos method, of class MiImpl.
     */
    @Test
    public void testGetZchListarChoquePeriodos() {
        System.out.println("getZchListarChoquePeriodos");
        Programas programa = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getZchListarChoquePeriodos(programa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstListarProgramarMaterias method, of class MiImpl.
     */
    @Test
    public void testSetEstListarProgramarMaterias() {
        System.out.println("setEstListarProgramarMaterias");
        Programas programa = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.setEstListarProgramarMaterias(programa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstRegistrarMencionEstudiante method, of class MiImpl.
     */
    @Test
    public void testSetEstRegistrarMencionEstudiante() {
        System.out.println("setEstRegistrarMencionEstudiante");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setEstRegistrarMencionEstudiante(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstListarProgramacionesEstudiante method, of class MiImpl.
     */
    @Test
    public void testGetEstListarProgramacionesEstudiante() {
        System.out.println("getEstListarProgramacionesEstudiante");
        Programas programa = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEstListarProgramacionesEstudiante(programa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstPrgRetirarProgramacionesMaterias method, of class MiImpl.
     */
    @Test
    public void testSetEstPrgRetirarProgramacionesMaterias() {
        System.out.println("setEstPrgRetirarProgramacionesMaterias");
        Programas programa = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.setEstPrgRetirarProgramacionesMaterias(programa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstPrgRegistrarListarCambiarGrupos method, of class MiImpl.
     */
    @Test
    public void testSetEstPrgRegistrarListarCambiarGrupos() {
        System.out.println("setEstPrgRegistrarListarCambiarGrupos");
        Programas programa = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.setEstPrgRegistrarListarCambiarGrupos(programa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDctBuscarAsignacionDocente method, of class MiImpl.
     */
    @Test
    public void testGetDctBuscarAsignacionDocente() {
        System.out.println("getDctBuscarAsignacionDocente");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        Asignaciones expResult = null;
        Asignaciones result = instance.getDctBuscarAsignacionDocente(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDctBuscarAsignacionDocentemaslafuncion method, of class MiImpl.
     */
    @Test
    public void testGetDctBuscarAsignacionDocentemaslafuncion() {
        System.out.println("getDctBuscarAsignacionDocentemaslafuncion");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        Asignaciones expResult = null;
        Asignaciones result = instance.getDctBuscarAsignacionDocentemaslafuncion(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarasignacion method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarasignacion() {
        System.out.println("setRegistrarasignacion");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarasignacion(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDctBuscarAsignacionDocenteDesignacion method, of class MiImpl.
     */
    @Test
    public void testGetDctBuscarAsignacionDocenteDesignacion() {
        System.out.println("getDctBuscarAsignacionDocenteDesignacion");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        Asignaciones expResult = null;
        Asignaciones result = instance.getDctBuscarAsignacionDocenteDesignacion(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMtrBuscarMateriaAhorro method, of class MiImpl.
     */
    @Test
    public void testGetMtrBuscarMateriaAhorro() {
        System.out.println("getMtrBuscarMateriaAhorro");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getMtrBuscarMateriaAhorro(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMtrBuscarMateria method, of class MiImpl.
     */
    @Test
    public void testGetMtrBuscarMateria() {
        System.out.println("getMtrBuscarMateria");
        Materias materia = null;
        MiImpl instance = new MiImpl();
        Materias expResult = null;
        Materias result = instance.getMtrBuscarMateria(materia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLbrBuscarFase method, of class MiImpl.
     */
    @Test
    public void testGetLbrBuscarFase() {
        System.out.println("getLbrBuscarFase");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        Libretas expResult = null;
        Libretas result = instance.getLbrBuscarFase(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGrpListarEvaluacionDefinida method, of class MiImpl.
     */
    @Test
    public void testGetGrpListarEvaluacionDefinida() {
        System.out.println("getGrpListarEvaluacionDefinida");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getGrpListarEvaluacionDefinida(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLbrBuscarTipoNota method, of class MiImpl.
     */
    @Test
    public void testGetLbrBuscarTipoNota() {
        System.out.println("getLbrBuscarTipoNota");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        Libretas expResult = null;
        Libretas result = instance.getLbrBuscarTipoNota(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstBuscarEstudiantesProgramados method, of class MiImpl.
     */
    @Test
    public void testGetEstBuscarEstudiantesProgramados() {
        System.out.println("getEstBuscarEstudiantesProgramados");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEstBuscarEstudiantesProgramados(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPstBuscarPostulantesProgramados method, of class MiImpl.
     */
    @Test
    public void testGetPstBuscarPostulantesProgramados() {
        System.out.println("getPstBuscarPostulantesProgramados");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getPstBuscarPostulantesProgramados(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstListarNotasEstudiante method, of class MiImpl.
     */
    @Test
    public void testGetEstListarNotasEstudiante() {
        System.out.println("getEstListarNotasEstudiante");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEstListarNotasEstudiante(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPstListarNotasPostulante method, of class MiImpl.
     */
    @Test
    public void testGetPstListarNotasPostulante() {
        System.out.println("getPstListarNotasPostulante");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getPstListarNotasPostulante(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstInsertarNotaEstudianteFase method, of class MiImpl.
     */
    @Test
    public void testSetEstInsertarNotaEstudianteFase() {
        System.out.println("setEstInsertarNotaEstudianteFase");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setEstInsertarNotaEstudianteFase(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPstInsertarNotaPostulanteFase method, of class MiImpl.
     */
    @Test
    public void testSetPstInsertarNotaPostulanteFase() {
        System.out.println("setPstInsertarNotaPostulanteFase");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setPstInsertarNotaPostulanteFase(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDctAvanzarFase method, of class MiImpl.
     */
    @Test
    public void testSetDctAvanzarFase() {
        System.out.println("setDctAvanzarFase");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setDctAvanzarFase(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDctAvanzarFaseSemiFinal method, of class MiImpl.
     */
    @Test
    public void testSetDctAvanzarFaseSemiFinal() {
        System.out.println("setDctAvanzarFaseSemiFinal");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setDctAvanzarFaseSemiFinal(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstSumarNotasEstudianteEvalRegular method, of class MiImpl.
     */
    @Test
    public void testGetEstSumarNotasEstudianteEvalRegular() {
        System.out.println("getEstSumarNotasEstudianteEvalRegular");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.getEstSumarNotasEstudianteEvalRegular(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstSumarNotasEstudianteEvalContinua method, of class MiImpl.
     */
    @Test
    public void testGetEstSumarNotasEstudianteEvalContinua() {
        System.out.println("getEstSumarNotasEstudianteEvalContinua");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.getEstSumarNotasEstudianteEvalContinua(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLbrBuscarFaseMinima method, of class MiImpl.
     */
    @Test
    public void testGetLbrBuscarFaseMinima() {
        System.out.println("getLbrBuscarFaseMinima");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.getLbrBuscarFaseMinima(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLbrBuscarFaseMaxima method, of class MiImpl.
     */
    @Test
    public void testGetLbrBuscarFaseMaxima() {
        System.out.println("getLbrBuscarFaseMaxima");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.getLbrBuscarFaseMaxima(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComprobarDocente method, of class MiImpl.
     */
    @Test
    public void testGetComprobarDocente() {
        System.out.println("getComprobarDocente");
        Docentes docente = null;
        MiImpl instance = new MiImpl();
        Docentes expResult = null;
        Docentes result = instance.getComprobarDocente(docente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDctBuscarAsignacionDocenteMateria method, of class MiImpl.
     */
    @Test
    public void testGetDctBuscarAsignacionDocenteMateria() {
        System.out.println("getDctBuscarAsignacionDocenteMateria");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        Asignaciones expResult = null;
        Asignaciones result = instance.getDctBuscarAsignacionDocenteMateria(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMtrListarMateriaAhorro method, of class MiImpl.
     */
    @Test
    public void testGetMtrListarMateriaAhorro() {
        System.out.println("getMtrListarMateriaAhorro");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getMtrListarMateriaAhorro(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLbrBuscarTipoNotaDefinida method, of class MiImpl.
     */
    @Test
    public void testGetLbrBuscarTipoNotaDefinida() {
        System.out.println("getLbrBuscarTipoNotaDefinida");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        Libretas expResult = null;
        Libretas result = instance.getLbrBuscarTipoNotaDefinida(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLbrListarTiposNotas method, of class MiImpl.
     */
    @Test
    public void testGetLbrListarTiposNotas() {
        System.out.println("getLbrListarTiposNotas");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getLbrListarTiposNotas(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGrpInsertarEvaluacion method, of class MiImpl.
     */
    @Test
    public void testSetGrpInsertarEvaluacion() {
        System.out.println("setGrpInsertarEvaluacion");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setGrpInsertarEvaluacion(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGrpModificarEvaluacion method, of class MiImpl.
     */
    @Test
    public void testSetGrpModificarEvaluacion() {
        System.out.println("setGrpModificarEvaluacion");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setGrpModificarEvaluacion(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGrpRegistrarEvaluacion method, of class MiImpl.
     */
    @Test
    public void testSetGrpRegistrarEvaluacion() {
        System.out.println("setGrpRegistrarEvaluacion");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setGrpRegistrarEvaluacion(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGrpEliminarEvaluacion method, of class MiImpl.
     */
    @Test
    public void testSetGrpEliminarEvaluacion() {
        System.out.println("setGrpEliminarEvaluacion");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setGrpEliminarEvaluacion(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDctListarAsignacionDocente method, of class MiImpl.
     */
    @Test
    public void testGetDctListarAsignacionDocente() {
        System.out.println("getDctListarAsignacionDocente");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getDctListarAsignacionDocente(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLbrListarTiposNotasDefinidas method, of class MiImpl.
     */
    @Test
    public void testGetLbrListarTiposNotasDefinidas() {
        System.out.println("getLbrListarTiposNotasDefinidas");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getLbrListarTiposNotasDefinidas(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarProgramasAcceso method, of class MiImpl.
     */
    @Test
    public void testGetListarProgramasAcceso() {
        System.out.println("getListarProgramasAcceso");
        Usuarios usuario = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarProgramasAcceso(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMtrListarPlanesPrograma method, of class MiImpl.
     */
    @Test
    public void testGetMtrListarPlanesPrograma() {
        System.out.println("getMtrListarPlanesPrograma");
        Programas programa = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getMtrListarPlanesPrograma(programa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarPlanProgramaModeloAhorro method, of class MiImpl.
     */
    @Test
    public void testGetListarPlanProgramaModeloAhorro() {
        System.out.println("getListarPlanProgramaModeloAhorro");
        Modelos_ahorros modelo = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarPlanProgramaModeloAhorro(modelo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDptoListarGruposMateria method, of class MiImpl.
     */
    @Test
    public void testGetDptoListarGruposMateria() {
        System.out.println("getDptoListarGruposMateria");
        Materias materia = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getDptoListarGruposMateria(materia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDptoBuscarGrupo method, of class MiImpl.
     */
    @Test
    public void testGetDptoBuscarGrupo() {
        System.out.println("getDptoBuscarGrupo");
        Grupos grupo = null;
        MiImpl instance = new MiImpl();
        Grupos expResult = null;
        Grupos result = instance.getDptoBuscarGrupo(grupo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarDias method, of class MiImpl.
     */
    @Test
    public void testGetListarDias() {
        System.out.println("getListarDias");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarDias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarHorario method, of class MiImpl.
     */
    @Test
    public void testGetListarHorario() {
        System.out.println("getListarHorario");
        Horarios horario = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarHorario(horario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarAulasDisponibles method, of class MiImpl.
     */
    @Test
    public void testGetListarAulasDisponibles() {
        System.out.println("getListarAulasDisponibles");
        Horarios horario = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarAulasDisponibles(horario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHrsLimpiarHorarioMateria method, of class MiImpl.
     */
    @Test
    public void testSetHrsLimpiarHorarioMateria() {
        System.out.println("setHrsLimpiarHorarioMateria");
        Horarios horario = null;
        MiImpl instance = new MiImpl();
        instance.setHrsLimpiarHorarioMateria(horario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHrsRegistrarHorarioAula method, of class MiImpl.
     */
    @Test
    public void testSetHrsRegistrarHorarioAula() {
        System.out.println("setHrsRegistrarHorarioAula");
        Horarios horario = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setHrsRegistrarHorarioAula(horario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMtrBuscarPlanPrograma method, of class MiImpl.
     */
    @Test
    public void testGetMtrBuscarPlanPrograma() {
        System.out.println("getMtrBuscarPlanPrograma");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        Planes expResult = null;
        Planes result = instance.getMtrBuscarPlanPrograma(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarMateriasCerrarLibreta method, of class MiImpl.
     */
    @Test
    public void testGetListarMateriasCerrarLibreta() {
        System.out.println("getListarMateriasCerrarLibreta");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarMateriasCerrarLibreta(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCerrarLibreta method, of class MiImpl.
     */
    @Test
    public void testSetCerrarLibreta() {
        System.out.println("setCerrarLibreta");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setCerrarLibreta(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarNoticiasRol method, of class MiImpl.
     */
    @Test
    public void testGetListarNoticiasRol() {
        System.out.println("getListarNoticiasRol");
        Tableros tablero = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarNoticiasRol(tablero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarRolesNoticias method, of class MiImpl.
     */
    @Test
    public void testGetListarRolesNoticias() {
        System.out.println("getListarRolesNoticias");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarRolesNoticias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCambioPinDocente method, of class MiImpl.
     */
    @Test
    public void testSetCambioPinDocente() {
        System.out.println("setCambioPinDocente");
        Docentes docente = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setCambioPinDocente(docente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMtrBuscarMatricula method, of class MiImpl.
     */
    @Test
    public void testGetMtrBuscarMatricula() {
        System.out.println("getMtrBuscarMatricula");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        Estudiantes expResult = null;
        Estudiantes result = instance.getMtrBuscarMatricula(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMtrBuscarMatriculaNuevo method, of class MiImpl.
     */
    @Test
    public void testGetMtrBuscarMatriculaNuevo() {
        System.out.println("getMtrBuscarMatriculaNuevo");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        Estudiantes expResult = null;
        Estudiantes result = instance.getMtrBuscarMatriculaNuevo(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstBuscarEstudianteTipoGrado method, of class MiImpl.
     */
    @Test
    public void testGetEstBuscarEstudianteTipoGrado() {
        System.out.println("getEstBuscarEstudianteTipoGrado");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        Estudiantes expResult = null;
        Estudiantes result = instance.getEstBuscarEstudianteTipoGrado(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMtrModificarPinEstudiante method, of class MiImpl.
     */
    @Test
    public void testSetMtrModificarPinEstudiante() {
        System.out.println("setMtrModificarPinEstudiante");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setMtrModificarPinEstudiante(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarIngresoUAB method, of class MiImpl.
     */
    @Test
    public void testGetListarIngresoUAB() {
        System.out.println("getListarIngresoUAB");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        Estudiantes expResult = null;
        Estudiantes result = instance.getListarIngresoUAB(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTpsListarTiposEvaluaciones method, of class MiImpl.
     */
    @Test
    public void testGetTpsListarTiposEvaluaciones() {
        System.out.println("getTpsListarTiposEvaluaciones");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getTpsListarTiposEvaluaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTpsListarTiposEstados method, of class MiImpl.
     */
    @Test
    public void testGetTpsListarTiposEstados() {
        System.out.println("getTpsListarTiposEstados");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getTpsListarTiposEstados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTpsBuscarTipoEvaluacion method, of class MiImpl.
     */
    @Test
    public void testGetTpsBuscarTipoEvaluacion() {
        System.out.println("getTpsBuscarTipoEvaluacion");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        Libretas expResult = null;
        Libretas result = instance.getTpsBuscarTipoEvaluacion(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLbrListarFases method, of class MiImpl.
     */
    @Test
    public void testGetLbrListarFases() {
        System.out.println("getLbrListarFases");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getLbrListarFases(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLbrListarFases2 method, of class MiImpl.
     */
    @Test
    public void testGetLbrListarFases2() {
        System.out.println("getLbrListarFases2");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getLbrListarFases2(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLbrListarTiposNotasFase method, of class MiImpl.
     */
    @Test
    public void testGetLbrListarTiposNotasFase() {
        System.out.println("getLbrListarTiposNotasFase");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getLbrListarTiposNotasFase(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStdListarEstadosTabla method, of class MiImpl.
     */
    @Test
    public void testGetStdListarEstadosTabla() {
        System.out.println("getStdListarEstadosTabla");
        Enlaces enlace = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getStdListarEstadosTabla(enlace);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLbrInsertarTipoNota method, of class MiImpl.
     */
    @Test
    public void testSetLbrInsertarTipoNota() {
        System.out.println("setLbrInsertarTipoNota");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setLbrInsertarTipoNota(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLbrModificarTipoNota method, of class MiImpl.
     */
    @Test
    public void testSetLbrModificarTipoNota() {
        System.out.println("setLbrModificarTipoNota");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setLbrModificarTipoNota(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMiListarPostulantesDip method, of class MiImpl.
     */
    @Test
    public void testGetMiListarPostulantesDip() {
        System.out.println("getMiListarPostulantesDip");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getMiListarPostulantesDip(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMiListarPostulantesNombre method, of class MiImpl.
     */
    @Test
    public void testGetMiListarPostulantesNombre() {
        System.out.println("getMiListarPostulantesNombre");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getMiListarPostulantesNombre(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMiRegistrarPstPersona method, of class MiImpl.
     */
    @Test
    public void testSetMiRegistrarPstPersona() {
        System.out.println("setMiRegistrarPstPersona");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setMiRegistrarPstPersona(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMiRegistrarPostulante method, of class MiImpl.
     */
    @Test
    public void testSetMiRegistrarPostulante() {
        System.out.println("setMiRegistrarPostulante");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setMiRegistrarPostulante(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMiRegistrarPostulanteC method, of class MiImpl.
     */
    @Test
    public void testSetMiRegistrarPostulanteC() {
        System.out.println("setMiRegistrarPostulanteC");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setMiRegistrarPostulanteC(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPstRegistrarDocumentos method, of class MiImpl.
     */
    @Test
    public void testSetPstRegistrarDocumentos() {
        System.out.println("setPstRegistrarDocumentos");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setPstRegistrarDocumentos(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposDocumentos method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposDocumentos() {
        System.out.println("getListarTiposDocumentos");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposDocumentos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposAdmisiones method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposAdmisiones() {
        System.out.println("getListarTiposAdmisiones");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposAdmisiones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposAdmisionesPost method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposAdmisionesPost() {
        System.out.println("getListarTiposAdmisionesPost");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposAdmisionesPost();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposAdmisionesPrograma method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposAdmisionesPrograma() {
        System.out.println("getListarTiposAdmisionesPrograma");
        Programas programa = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposAdmisionesPrograma(programa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposAdmisionesProgramaLiberacion method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposAdmisionesProgramaLiberacion() {
        System.out.println("getListarTiposAdmisionesProgramaLiberacion");
        Programas programa = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposAdmisionesProgramaLiberacion(programa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposGrados method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposGrados() {
        System.out.println("getListarTiposGrados");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposGrados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarTiposGrados method, of class MiImpl.
     */
    @Test
    public void testGetBuscarTiposGrados() {
        System.out.println("getBuscarTiposGrados");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        Planes expResult = null;
        Planes result = instance.getBuscarTiposGrados(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarPrgPlanesActual method, of class MiImpl.
     */
    @Test
    public void testGetListarPrgPlanesActual() {
        System.out.println("getListarPrgPlanesActual");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarPrgPlanesActual(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposDocumentosClasificacionVigente method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposDocumentosClasificacionVigente() {
        System.out.println("getListarTiposDocumentosClasificacionVigente");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposDocumentosClasificacionVigente(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposClasificaciones method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposClasificaciones() {
        System.out.println("getListarTiposClasificaciones");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposClasificaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposClasificacionesPost method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposClasificacionesPost() {
        System.out.println("getListarTiposClasificacionesPost");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposClasificacionesPost();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPstBuscarPersona method, of class MiImpl.
     */
    @Test
    public void testGetPstBuscarPersona() {
        System.out.println("getPstBuscarPersona");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        Postulantes expResult = null;
        Postulantes result = instance.getPstBuscarPersona(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDptoListarMateriaGrupoMinimo method, of class MiImpl.
     */
    @Test
    public void testGetDptoListarMateriaGrupoMinimo() {
        System.out.println("getDptoListarMateriaGrupoMinimo");
        Materias materia = null;
        MiImpl instance = new MiImpl();
        Materias expResult = null;
        Materias result = instance.getDptoListarMateriaGrupoMinimo(materia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPstRegistrarMatricula method, of class MiImpl.
     */
    @Test
    public void testSetPstRegistrarMatricula() {
        System.out.println("setPstRegistrarMatricula");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setPstRegistrarMatricula(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarPstMateriasProgramadas method, of class MiImpl.
     */
    @Test
    public void testGetListarPstMateriasProgramadas() {
        System.out.println("getListarPstMateriasProgramadas");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarPstMateriasProgramadas(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPstBuscarPostulanteNombres method, of class MiImpl.
     */
    @Test
    public void testGetPstBuscarPostulanteNombres() {
        System.out.println("getPstBuscarPostulanteNombres");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        Postulantes expResult = null;
        Postulantes result = instance.getPstBuscarPostulanteNombres(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPstBuscarPostulanteNombresSede method, of class MiImpl.
     */
    @Test
    public void testGetPstBuscarPostulanteNombresSede() {
        System.out.println("getPstBuscarPostulanteNombresSede");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        Postulantes expResult = null;
        Postulantes result = instance.getPstBuscarPostulanteNombresSede(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPstBuscarMatriculaPostulante method, of class MiImpl.
     */
    @Test
    public void testGetPstBuscarMatriculaPostulante() {
        System.out.println("getPstBuscarMatriculaPostulante");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        Postulantes expResult = null;
        Postulantes result = instance.getPstBuscarMatriculaPostulante(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrfBuscarPerfil method, of class MiImpl.
     */
    @Test
    public void testGetPrfBuscarPerfil() {
        System.out.println("getPrfBuscarPerfil");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        Perfiles expResult = null;
        Perfiles result = instance.getPrfBuscarPerfil(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPstListarPerfiles method, of class MiImpl.
     */
    @Test
    public void testGetPstListarPerfiles() {
        System.out.println("getPstListarPerfiles");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getPstListarPerfiles(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPstListarPerfilesEntidad method, of class MiImpl.
     */
    @Test
    public void testGetPstListarPerfilesEntidad() {
        System.out.println("getPstListarPerfilesEntidad");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getPstListarPerfilesEntidad(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrfListarConceptos method, of class MiImpl.
     */
    @Test
    public void testGetPrfListarConceptos() {
        System.out.println("getPrfListarConceptos");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getPrfListarConceptos(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPstListarConceptos method, of class MiImpl.
     */
    @Test
    public void testGetPstListarConceptos() {
        System.out.println("getPstListarConceptos");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getPstListarConceptos(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstListarConceptos method, of class MiImpl.
     */
    @Test
    public void testGetEstListarConceptos() {
        System.out.println("getEstListarConceptos");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEstListarConceptos(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDctListarConceptos method, of class MiImpl.
     */
    @Test
    public void testGetDctListarConceptos() {
        System.out.println("getDctListarConceptos");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getDctListarConceptos(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsrListarConceptos method, of class MiImpl.
     */
    @Test
    public void testGetUsrListarConceptos() {
        System.out.println("getUsrListarConceptos");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getUsrListarConceptos(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPstRegistrarTransaccion method, of class MiImpl.
     */
    @Test
    public void testSetPstRegistrarTransaccion() {
        System.out.println("setPstRegistrarTransaccion");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setPstRegistrarTransaccion(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrcBuscarPerfil method, of class MiImpl.
     */
    @Test
    public void testGetPrcBuscarPerfil() {
        System.out.println("getPrcBuscarPerfil");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        Perfiles expResult = null;
        Perfiles result = instance.getPrcBuscarPerfil(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarTrnDetalle method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarTrnDetalle() {
        System.out.println("setRegistrarTrnDetalle");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarTrnDetalle(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrnBuscarTransaccion method, of class MiImpl.
     */
    @Test
    public void testGetTrnBuscarTransaccion() {
        System.out.println("getTrnBuscarTransaccion");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        Perfiles expResult = null;
        Perfiles result = instance.getTrnBuscarTransaccion(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrnBuscarTransaccionRecibo method, of class MiImpl.
     */
    @Test
    public void testGetTrnBuscarTransaccionRecibo() {
        System.out.println("getTrnBuscarTransaccionRecibo");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        Perfiles expResult = null;
        Perfiles result = instance.getTrnBuscarTransaccionRecibo(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrnBuscarTransaccionReciboSede method, of class MiImpl.
     */
    @Test
    public void testGetTrnBuscarTransaccionReciboSede() {
        System.out.println("getTrnBuscarTransaccionReciboSede");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        Perfiles expResult = null;
        Perfiles result = instance.getTrnBuscarTransaccionReciboSede(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrnListarTrnDetalles method, of class MiImpl.
     */
    @Test
    public void testGetTrnListarTrnDetalles() {
        System.out.println("getTrnListarTrnDetalles");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getTrnListarTrnDetalles(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrsListarConceptos method, of class MiImpl.
     */
    @Test
    public void testGetPrsListarConceptos() {
        System.out.println("getPrsListarConceptos");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getPrsListarConceptos(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrsRegistrarTransaccion method, of class MiImpl.
     */
    @Test
    public void testSetPrsRegistrarTransaccion() {
        System.out.println("setPrsRegistrarTransaccion");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setPrsRegistrarTransaccion(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrnListarTiposDescuentos method, of class MiImpl.
     */
    @Test
    public void testGetTrnListarTiposDescuentos() {
        System.out.println("getTrnListarTiposDescuentos");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getTrnListarTiposDescuentos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrnBuscarTipoDescuento method, of class MiImpl.
     */
    @Test
    public void testGetTrnBuscarTipoDescuento() {
        System.out.println("getTrnBuscarTipoDescuento");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        Perfiles expResult = null;
        Perfiles result = instance.getTrnBuscarTipoDescuento(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarPerfilConcepto method, of class MiImpl.
     */
    @Test
    public void testGetBuscarPerfilConcepto() {
        System.out.println("getBuscarPerfilConcepto");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        Perfiles expResult = null;
        Perfiles result = instance.getBuscarPerfilConcepto(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrnListarCajeros method, of class MiImpl.
     */
    @Test
    public void testGetTrnListarCajeros() {
        System.out.println("getTrnListarCajeros");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getTrnListarCajeros(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrnListarCajerosProv method, of class MiImpl.
     */
    @Test
    public void testGetTrnListarCajerosProv() {
        System.out.println("getTrnListarCajerosProv");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getTrnListarCajerosProv(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrnPrcListarPerfiles method, of class MiImpl.
     */
    @Test
    public void testGetTrnPrcListarPerfiles() {
        System.out.println("getTrnPrcListarPerfiles");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getTrnPrcListarPerfiles(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrnListarTransacciones method, of class MiImpl.
     */
    @Test
    public void testGetTrnListarTransacciones() {
        System.out.println("getTrnListarTransacciones");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getTrnListarTransacciones(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasTransaccionesDiarias method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasTransaccionesDiarias() {
        System.out.println("getRepCajasTransaccionesDiarias");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasTransaccionesDiarias(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasTransaccionesDiariasGlobal method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasTransaccionesDiariasGlobal() {
        System.out.println("getRepCajasTransaccionesDiariasGlobal");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasTransaccionesDiariasGlobal(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasTransaccionesDiariasGlobalProv method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasTransaccionesDiariasGlobalProv() {
        System.out.println("getRepCajasTransaccionesDiariasGlobalProv");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasTransaccionesDiariasGlobalProv(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasTransaccionesDiariasGlobalxcajero method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasTransaccionesDiariasGlobalxcajero() {
        System.out.println("getRepCajasTransaccionesDiariasGlobalxcajero");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasTransaccionesDiariasGlobalxcajero(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasTransaccionesDiariasGlobalxcajeroProv method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasTransaccionesDiariasGlobalxcajeroProv() {
        System.out.println("getRepCajasTransaccionesDiariasGlobalxcajeroProv");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasTransaccionesDiariasGlobalxcajeroProv(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasTransaccionesDiariasEntidades method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasTransaccionesDiariasEntidades() {
        System.out.println("getRepCajasTransaccionesDiariasEntidades");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasTransaccionesDiariasEntidades(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasResumenTesoroEntidades method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasResumenTesoroEntidades() {
        System.out.println("getRepCajasResumenTesoroEntidades");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasResumenTesoroEntidades(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasResumenInstitucionalEntidades method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasResumenInstitucionalEntidades() {
        System.out.println("getRepCajasResumenInstitucionalEntidades");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasResumenInstitucionalEntidades(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasResumenInstitucionalEntidadesConcepto method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasResumenInstitucionalEntidadesConcepto() {
        System.out.println("getRepCajasResumenInstitucionalEntidadesConcepto");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasResumenInstitucionalEntidadesConcepto(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasResumenEstudiantilEntidades method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasResumenEstudiantilEntidades() {
        System.out.println("getRepCajasResumenEstudiantilEntidades");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasResumenEstudiantilEntidades(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasResumenEstudiantilEntidadesConcepto method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasResumenEstudiantilEntidadesConcepto() {
        System.out.println("getRepCajasResumenEstudiantilEntidadesConcepto");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasResumenEstudiantilEntidadesConcepto(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasResumenProfactulativoEntidades method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasResumenProfactulativoEntidades() {
        System.out.println("getRepCajasResumenProfactulativoEntidades");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasResumenProfactulativoEntidades(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasResumenProfactulativoCarrera method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasResumenProfactulativoCarrera() {
        System.out.println("getRepCajasResumenProfactulativoCarrera");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasResumenProfactulativoCarrera(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasDetalladoEntidades method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasDetalladoEntidades() {
        System.out.println("getRepCajasDetalladoEntidades");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasDetalladoEntidades(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasDetalladoCarrera method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasDetalladoCarrera() {
        System.out.println("getRepCajasDetalladoCarrera");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasDetalladoCarrera(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasTransaccionesDetalleGlobal method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasTransaccionesDetalleGlobal() {
        System.out.println("getRepCajasTransaccionesDetalleGlobal");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasTransaccionesDetalleGlobal(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasTransaccionesDetalleGlobalProv method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasTransaccionesDetalleGlobalProv() {
        System.out.println("getRepCajasTransaccionesDetalleGlobalProv");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasTransaccionesDetalleGlobalProv(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasTransaccionesDetalleGlobalAnuladas method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasTransaccionesDetalleGlobalAnuladas() {
        System.out.println("getRepCajasTransaccionesDetalleGlobalAnuladas");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasTransaccionesDetalleGlobalAnuladas(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasTransaccionesDetalleGlobalAnuladasProv method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasTransaccionesDetalleGlobalAnuladasProv() {
        System.out.println("getRepCajasTransaccionesDetalleGlobalAnuladasProv");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasTransaccionesDetalleGlobalAnuladasProv(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasTransaccionesDetalleEntidad method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasTransaccionesDetalleEntidad() {
        System.out.println("getRepCajasTransaccionesDetalleEntidad");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasTransaccionesDetalleEntidad(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasTransaccionesDetalle method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasTransaccionesDetalle() {
        System.out.println("getRepCajasTransaccionesDetalle");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasTransaccionesDetalle(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasTransaccionesDetalleAnuladas method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasTransaccionesDetalleAnuladas() {
        System.out.println("getRepCajasTransaccionesDetalleAnuladas");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasTransaccionesDetalleAnuladas(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasResumenMatriculas method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasResumenMatriculas() {
        System.out.println("getRepCajasResumenMatriculas");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasResumenMatriculas(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasResumenTesoroCarrera method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasResumenTesoroCarrera() {
        System.out.println("getRepCajasResumenTesoroCarrera");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasResumenTesoroCarrera(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasResumenMatriculasGlobal method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasResumenMatriculasGlobal() {
        System.out.println("getRepCajasResumenMatriculasGlobal");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasResumenMatriculasGlobal(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasResumenMatriculasGlobalProv method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasResumenMatriculasGlobalProv() {
        System.out.println("getRepCajasResumenMatriculasGlobalProv");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasResumenMatriculasGlobalProv(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasResumenInstitucional method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasResumenInstitucional() {
        System.out.println("getRepCajasResumenInstitucional");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasResumenInstitucional(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasResumenInstitucionalGlobal method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasResumenInstitucionalGlobal() {
        System.out.println("getRepCajasResumenInstitucionalGlobal");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasResumenInstitucionalGlobal(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasResumenInstitucionalGlobalProv method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasResumenInstitucionalGlobalProv() {
        System.out.println("getRepCajasResumenInstitucionalGlobalProv");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasResumenInstitucionalGlobalProv(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasResumenEstudiantil method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasResumenEstudiantil() {
        System.out.println("getRepCajasResumenEstudiantil");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasResumenEstudiantil(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasResumenEstudiantilGlobal method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasResumenEstudiantilGlobal() {
        System.out.println("getRepCajasResumenEstudiantilGlobal");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasResumenEstudiantilGlobal(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasResumenEstudiantilGlobalProv method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasResumenEstudiantilGlobalProv() {
        System.out.println("getRepCajasResumenEstudiantilGlobalProv");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasResumenEstudiantilGlobalProv(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasResumenProfacultativo method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasResumenProfacultativo() {
        System.out.println("getRepCajasResumenProfacultativo");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasResumenProfacultativo(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasResumenProfacultativoGlobal method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasResumenProfacultativoGlobal() {
        System.out.println("getRepCajasResumenProfacultativoGlobal");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasResumenProfacultativoGlobal(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasResumenProfacultativoGlobalProv method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasResumenProfacultativoGlobalProv() {
        System.out.println("getRepCajasResumenProfacultativoGlobalProv");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasResumenProfacultativoGlobalProv(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasResumenDetalladoMatriculas method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasResumenDetalladoMatriculas() {
        System.out.println("getRepCajasResumenDetalladoMatriculas");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasResumenDetalladoMatriculas(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasResumenDetalladoMatriculasGlobal method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasResumenDetalladoMatriculasGlobal() {
        System.out.println("getRepCajasResumenDetalladoMatriculasGlobal");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasResumenDetalladoMatriculasGlobal(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasResumenDetalladoMatriculasGlobalProv method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasResumenDetalladoMatriculasGlobalProv() {
        System.out.println("getRepCajasResumenDetalladoMatriculasGlobalProv");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasResumenDetalladoMatriculasGlobalProv(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasResumenDetalladoEstudiantil method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasResumenDetalladoEstudiantil() {
        System.out.println("getRepCajasResumenDetalladoEstudiantil");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasResumenDetalladoEstudiantil(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasResumenDetalladoEstudiantilGlobal method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasResumenDetalladoEstudiantilGlobal() {
        System.out.println("getRepCajasResumenDetalladoEstudiantilGlobal");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasResumenDetalladoEstudiantilGlobal(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasResumenDetalladoEstudiantilGlobalProv method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasResumenDetalladoEstudiantilGlobalProv() {
        System.out.println("getRepCajasResumenDetalladoEstudiantilGlobalProv");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasResumenDetalladoEstudiantilGlobalProv(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasResumenDetalladoInstitucional method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasResumenDetalladoInstitucional() {
        System.out.println("getRepCajasResumenDetalladoInstitucional");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasResumenDetalladoInstitucional(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasResumenDetalladoInstitucionalGlobal method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasResumenDetalladoInstitucionalGlobal() {
        System.out.println("getRepCajasResumenDetalladoInstitucionalGlobal");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasResumenDetalladoInstitucionalGlobal(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasResumenDetalladoInstitucionalGlobalProv method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasResumenDetalladoInstitucionalGlobalProv() {
        System.out.println("getRepCajasResumenDetalladoInstitucionalGlobalProv");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasResumenDetalladoInstitucionalGlobalProv(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasResumenDetallado method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasResumenDetallado() {
        System.out.println("getRepCajasResumenDetallado");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasResumenDetallado(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasResumenDetalladoGlobal method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasResumenDetalladoGlobal() {
        System.out.println("getRepCajasResumenDetalladoGlobal");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasResumenDetalladoGlobal(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasResumenDetalladoGlobalMatricula method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasResumenDetalladoGlobalMatricula() {
        System.out.println("getRepCajasResumenDetalladoGlobalMatricula");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasResumenDetalladoGlobalMatricula(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasResumenDetalladoGlobalProv method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasResumenDetalladoGlobalProv() {
        System.out.println("getRepCajasResumenDetalladoGlobalProv");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasResumenDetalladoGlobalProv(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasTransaccionesPorPrograma method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasTransaccionesPorPrograma() {
        System.out.println("getRepCajasTransaccionesPorPrograma");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasTransaccionesPorPrograma(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepCajasResumenDetalladoEntidades method, of class MiImpl.
     */
    @Test
    public void testGetRepCajasResumenDetalladoEntidades() {
        System.out.println("getRepCajasResumenDetalladoEntidades");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepCajasResumenDetalladoEntidades(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrnListarTransaccionesRecibo method, of class MiImpl.
     */
    @Test
    public void testGetTrnListarTransaccionesRecibo() {
        System.out.println("getTrnListarTransaccionesRecibo");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getTrnListarTransaccionesRecibo(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrnListarTransaccionesReciboSede method, of class MiImpl.
     */
    @Test
    public void testGetTrnListarTransaccionesReciboSede() {
        System.out.println("getTrnListarTransaccionesReciboSede");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getTrnListarTransaccionesReciboSede(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrnListarTrnDetalles2 method, of class MiImpl.
     */
    @Test
    public void testGetTrnListarTrnDetalles2() {
        System.out.println("getTrnListarTrnDetalles2");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getTrnListarTrnDetalles2(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrnListarMateriasVerano method, of class MiImpl.
     */
    @Test
    public void testGetTrnListarMateriasVerano() {
        System.out.println("getTrnListarMateriasVerano");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getTrnListarMateriasVerano(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrnListarEvaluacionesVerano method, of class MiImpl.
     */
    @Test
    public void testGetTrnListarEvaluacionesVerano() {
        System.out.println("getTrnListarEvaluacionesVerano");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getTrnListarEvaluacionesVerano();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrnBuscarPorNroRecibo method, of class MiImpl.
     */
    @Test
    public void testGetTrnBuscarPorNroRecibo() {
        System.out.println("getTrnBuscarPorNroRecibo");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getTrnBuscarPorNroRecibo(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrnBuscarPorNroReciboSede method, of class MiImpl.
     */
    @Test
    public void testGetTrnBuscarPorNroReciboSede() {
        System.out.println("getTrnBuscarPorNroReciboSede");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getTrnBuscarPorNroReciboSede(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTrnBorrarDetalle method, of class MiImpl.
     */
    @Test
    public void testSetTrnBorrarDetalle() {
        System.out.println("setTrnBorrarDetalle");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        instance.setTrnBorrarDetalle(perfil);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTrnBorrarTransaccion method, of class MiImpl.
     */
    @Test
    public void testSetTrnBorrarTransaccion() {
        System.out.println("setTrnBorrarTransaccion");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        instance.setTrnBorrarTransaccion(perfil);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarListaDocentesNombres method, of class MiImpl.
     */
    @Test
    public void testGetBuscarListaDocentesNombres() {
        System.out.println("getBuscarListaDocentesNombres");
        Docentes docente = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getBuscarListaDocentesNombres(docente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarListaDocentesDip method, of class MiImpl.
     */
    @Test
    public void testGetBuscarListaDocentesDip() {
        System.out.println("getBuscarListaDocentesDip");
        Docentes docente = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getBuscarListaDocentesDip(docente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposDocentes method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposDocentes() {
        System.out.println("getListarTiposDocentes");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposDocentes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposAsignaciones method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposAsignaciones() {
        System.out.println("getListarTiposAsignaciones");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposAsignaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposFunciones method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposFunciones() {
        System.out.println("getListarTiposFunciones");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposFunciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarAsignacionDocente method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarAsignacionDocente() {
        System.out.println("setRegistrarAsignacionDocente");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarAsignacionDocente(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarAsignacionDocentefac method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarAsignacionDocentefac() {
        System.out.println("setRegistrarAsignacionDocentefac");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarAsignacionDocentefac(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarMemo method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarMemo() {
        System.out.println("setRegistrarMemo");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarMemo(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrnBuscarSiguienteNroMemo method, of class MiImpl.
     */
    @Test
    public void testGetTrnBuscarSiguienteNroMemo() {
        System.out.println("getTrnBuscarSiguienteNroMemo");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.getTrnBuscarSiguienteNroMemo(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrnBuscaridMemo method, of class MiImpl.
     */
    @Test
    public void testGetTrnBuscaridMemo() {
        System.out.println("getTrnBuscaridMemo");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.getTrnBuscaridMemo(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarFaseResolucion method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarFaseResolucion() {
        System.out.println("setRegistrarFaseResolucion");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarFaseResolucion(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarFaseResolucionfac method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarFaseResolucionfac() {
        System.out.println("setRegistrarFaseResolucionfac");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarFaseResolucionfac(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarFaseResolucionuni method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarFaseResolucionuni() {
        System.out.println("setRegistrarFaseResolucionuni");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarFaseResolucionuni(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setmostrarplan method, of class MiImpl.
     */
    @Test
    public void testSetmostrarplan() {
        System.out.println("setmostrarplan");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setmostrarplan(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarRetrocederFaseResolucion method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarRetrocederFaseResolucion() {
        System.out.println("setRegistrarRetrocederFaseResolucion");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarRetrocederFaseResolucion(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDctVerificarAsignacionDocenteGestion method, of class MiImpl.
     */
    @Test
    public void testGetDctVerificarAsignacionDocenteGestion() {
        System.out.println("getDctVerificarAsignacionDocenteGestion");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        Asignaciones expResult = null;
        Asignaciones result = instance.getDctVerificarAsignacionDocenteGestion(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMiListarPstNombreGestionPeriodo method, of class MiImpl.
     */
    @Test
    public void testGetMiListarPstNombreGestionPeriodo() {
        System.out.println("getMiListarPstNombreGestionPeriodo");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getMiListarPstNombreGestionPeriodo(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMiListarPstDipGestionPeriodo method, of class MiImpl.
     */
    @Test
    public void testGetMiListarPstDipGestionPeriodo() {
        System.out.println("getMiListarPstDipGestionPeriodo");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getMiListarPstDipGestionPeriodo(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMiListarPstAprobadoNombreGestionPeriodo method, of class MiImpl.
     */
    @Test
    public void testGetMiListarPstAprobadoNombreGestionPeriodo() {
        System.out.println("getMiListarPstAprobadoNombreGestionPeriodo");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getMiListarPstAprobadoNombreGestionPeriodo(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMiListarPstAprobadoDipGestionPeriodo method, of class MiImpl.
     */
    @Test
    public void testGetMiListarPstAprobadoDipGestionPeriodo() {
        System.out.println("getMiListarPstAprobadoDipGestionPeriodo");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getMiListarPstAprobadoDipGestionPeriodo(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarPaises method, of class MiImpl.
     */
    @Test
    public void testGetListarPaises() {
        System.out.println("getListarPaises");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarPaises();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarDepartamentos method, of class MiImpl.
     */
    @Test
    public void testGetListarDepartamentos() {
        System.out.println("getListarDepartamentos");
        Personas persona = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarDepartamentos(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarProvincias method, of class MiImpl.
     */
    @Test
    public void testGetListarProvincias() {
        System.out.println("getListarProvincias");
        Personas persona = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarProvincias(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarLocalidades method, of class MiImpl.
     */
    @Test
    public void testGetListarLocalidades() {
        System.out.println("getListarLocalidades");
        Personas persona = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarLocalidades(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarLocalidadesTodas method, of class MiImpl.
     */
    @Test
    public void testGetListarLocalidadesTodas() {
        System.out.println("getListarLocalidadesTodas");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarLocalidadesTodas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposSexos method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposSexos() {
        System.out.println("getListarTiposSexos");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposSexos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposEstadosCiviles method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposEstadosCiviles() {
        System.out.println("getListarTiposEstadosCiviles");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposEstadosCiviles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposEmpresasTelef method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposEmpresasTelef() {
        System.out.println("getListarTiposEmpresasTelef");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposEmpresasTelef();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposEstudiantes method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposEstudiantes() {
        System.out.println("getListarTiposEstudiantes");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposEstudiantes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarTipoEstudiante method, of class MiImpl.
     */
    @Test
    public void testGetBuscarTipoEstudiante() {
        System.out.println("getBuscarTipoEstudiante");
        Personas persona = null;
        MiImpl instance = new MiImpl();
        Personas expResult = null;
        Personas result = instance.getBuscarTipoEstudiante(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposGraduaciones method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposGraduaciones() {
        System.out.println("getListarTiposGraduaciones");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposGraduaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposInstituciones method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposInstituciones() {
        System.out.println("getListarTiposInstituciones");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposInstituciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarColegiosTipoIns method, of class MiImpl.
     */
    @Test
    public void testGetListarColegiosTipoIns() {
        System.out.println("getListarColegiosTipoIns");
        Personas persona = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarColegiosTipoIns(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposTurnos method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposTurnos() {
        System.out.println("getListarTiposTurnos");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposTurnos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposProblemasRol method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposProblemasRol() {
        System.out.println("getListarTiposProblemasRol");
        Personas persona = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposProblemasRol(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarPersona method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarPersona() {
        System.out.println("setRegistrarPersona");
        Personas persona = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarPersona(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarPrsColegio method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarPrsColegio() {
        System.out.println("setRegistrarPrsColegio");
        Personas persona = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarPrsColegio(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarPrsClasificacion method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarPrsClasificacion() {
        System.out.println("setRegistrarPrsClasificacion");
        Personas persona = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarPrsClasificacion(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarPrsDocumentos method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarPrsDocumentos() {
        System.out.println("setRegistrarPrsDocumentos");
        Personas persona = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarPrsDocumentos(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarPrsCompromisos method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarPrsCompromisos() {
        System.out.println("setRegistrarPrsCompromisos");
        Personas persona = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarPrsCompromisos(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarPrsDocumentosPersona method, of class MiImpl.
     */
    @Test
    public void testGetListarPrsDocumentosPersona() {
        System.out.println("getListarPrsDocumentosPersona");
        Personas persona = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarPrsDocumentosPersona(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarTipoClasificacionPersona method, of class MiImpl.
     */
    @Test
    public void testGetBuscarTipoClasificacionPersona() {
        System.out.println("getBuscarTipoClasificacionPersona");
        Personas persona = null;
        MiImpl instance = new MiImpl();
        Personas expResult = null;
        Personas result = instance.getBuscarTipoClasificacionPersona(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposCompromisos method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposCompromisos() {
        System.out.println("getListarTiposCompromisos");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposCompromisos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarPersonaColegio method, of class MiImpl.
     */
    @Test
    public void testGetBuscarPersonaColegio() {
        System.out.println("getBuscarPersonaColegio");
        Personas persona = null;
        MiImpl instance = new MiImpl();
        Personas expResult = null;
        Personas result = instance.getBuscarPersonaColegio(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarEstudiante method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarEstudiante() {
        System.out.println("setRegistrarEstudiante");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarEstudiante(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModificarEstudiante method, of class MiImpl.
     */
    @Test
    public void testSetModificarEstudiante() {
        System.out.println("setModificarEstudiante");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setModificarEstudiante(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstBuscarEstudiantePrs method, of class MiImpl.
     */
    @Test
    public void testGetEstBuscarEstudiantePrs() {
        System.out.println("getEstBuscarEstudiantePrs");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        Estudiantes expResult = null;
        Estudiantes result = instance.getEstBuscarEstudiantePrs(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstBuscarEstudiantePrsSede method, of class MiImpl.
     */
    @Test
    public void testGetEstBuscarEstudiantePrsSede() {
        System.out.println("getEstBuscarEstudiantePrsSede");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        Estudiantes expResult = null;
        Estudiantes result = instance.getEstBuscarEstudiantePrsSede(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstBuscarEstudiantePrsPos method, of class MiImpl.
     */
    @Test
    public void testGetEstBuscarEstudiantePrsPos() {
        System.out.println("getEstBuscarEstudiantePrsPos");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        Estudiantes expResult = null;
        Estudiantes result = instance.getEstBuscarEstudiantePrsPos(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstBuscarEstudiantePrsPre method, of class MiImpl.
     */
    @Test
    public void testGetEstBuscarEstudiantePrsPre() {
        System.out.println("getEstBuscarEstudiantePrsPre");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        Estudiantes expResult = null;
        Estudiantes result = instance.getEstBuscarEstudiantePrsPre(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstBuscarEstudiantePrsPreSede method, of class MiImpl.
     */
    @Test
    public void testGetEstBuscarEstudiantePrsPreSede() {
        System.out.println("getEstBuscarEstudiantePrsPreSede");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        Estudiantes expResult = null;
        Estudiantes result = instance.getEstBuscarEstudiantePrsPreSede(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPstModificarEstadoPostulante method, of class MiImpl.
     */
    @Test
    public void testSetPstModificarEstadoPostulante() {
        System.out.println("setPstModificarEstadoPostulante");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setPstModificarEstadoPostulante(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarMatriculaEstudiante method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarMatriculaEstudiante() {
        System.out.println("setRegistrarMatriculaEstudiante");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarMatriculaEstudiante(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarMatriculaEstPrs method, of class MiImpl.
     */
    @Test
    public void testGetBuscarMatriculaEstPrs() {
        System.out.println("getBuscarMatriculaEstPrs");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        Estudiantes expResult = null;
        Estudiantes result = instance.getBuscarMatriculaEstPrs(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMiPrsBuscarEstudiante method, of class MiImpl.
     */
    @Test
    public void testGetMiPrsBuscarEstudiante() {
        System.out.println("getMiPrsBuscarEstudiante");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        Estudiantes expResult = null;
        Estudiantes result = instance.getMiPrsBuscarEstudiante(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cvGetListarRubrosPersona method, of class MiImpl.
     */
    @Test
    public void testCvGetListarRubrosPersona() {
        System.out.println("cvGetListarRubrosPersona");
        Curriculum curriculum = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.cvGetListarRubrosPersona(curriculum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cvGetListarRubros method, of class MiImpl.
     */
    @Test
    public void testCvGetListarRubros() {
        System.out.println("cvGetListarRubros");
        Curriculum curriculum = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.cvGetListarRubros(curriculum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cvGetListarSubRubros method, of class MiImpl.
     */
    @Test
    public void testCvGetListarSubRubros() {
        System.out.println("cvGetListarSubRubros");
        Curriculum curriculum = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.cvGetListarSubRubros(curriculum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cvSetRegistrarCurriculum method, of class MiImpl.
     */
    @Test
    public void testCvSetRegistrarCurriculum() {
        System.out.println("cvSetRegistrarCurriculum");
        Curriculum curriculum = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.cvSetRegistrarCurriculum(curriculum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarDctAdjuntos method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarDctAdjuntos() {
        System.out.println("setRegistrarDctAdjuntos");
        Curriculum curriculum = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarDctAdjuntos(curriculum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarAdjuntosDocente method, of class MiImpl.
     */
    @Test
    public void testGetListarAdjuntosDocente() {
        System.out.println("getListarAdjuntosDocente");
        Curriculum curriculum = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarAdjuntosDocente(curriculum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEliminarDctAdjunto method, of class MiImpl.
     */
    @Test
    public void testSetEliminarDctAdjunto() {
        System.out.println("setEliminarDctAdjunto");
        Curriculum curriculum = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setEliminarDctAdjunto(curriculum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarDocente method, of class MiImpl.
     */
    @Test
    public void testGetBuscarDocente() {
        System.out.println("getBuscarDocente");
        Docentes docente = null;
        MiImpl instance = new MiImpl();
        Docentes expResult = null;
        Docentes result = instance.getBuscarDocente(docente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarDocentexdepartamento method, of class MiImpl.
     */
    @Test
    public void testGetBuscarDocentexdepartamento() {
        System.out.println("getBuscarDocentexdepartamento");
        Docentes docente = null;
        MiImpl instance = new MiImpl();
        Docentes expResult = null;
        Docentes result = instance.getBuscarDocentexdepartamento(docente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstBuscarEstudianteNombres method, of class MiImpl.
     */
    @Test
    public void testGetEstBuscarEstudianteNombres() {
        System.out.println("getEstBuscarEstudianteNombres");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        Estudiantes expResult = null;
        Estudiantes result = instance.getEstBuscarEstudianteNombres(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstBuscarEstudianteNombresSede method, of class MiImpl.
     */
    @Test
    public void testGetEstBuscarEstudianteNombresSede() {
        System.out.println("getEstBuscarEstudianteNombresSede");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        Estudiantes expResult = null;
        Estudiantes result = instance.getEstBuscarEstudianteNombresSede(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstListarFichaAcademica method, of class MiImpl.
     */
    @Test
    public void testGetEstListarFichaAcademica() {
        System.out.println("getEstListarFichaAcademica");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEstListarFichaAcademica(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstListarFichaAcademicaModificar method, of class MiImpl.
     */
    @Test
    public void testGetEstListarFichaAcademicaModificar() {
        System.out.println("getEstListarFichaAcademicaModificar");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEstListarFichaAcademicaModificar(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstListarFichaAcademicaConvalidada method, of class MiImpl.
     */
    @Test
    public void testGetEstListarFichaAcademicaConvalidada() {
        System.out.println("getEstListarFichaAcademicaConvalidada");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEstListarFichaAcademicaConvalidada(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstListarFichaAcademicaConvalidada2 method, of class MiImpl.
     */
    @Test
    public void testGetEstListarFichaAcademicaConvalidada2() {
        System.out.println("getEstListarFichaAcademicaConvalidada2");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEstListarFichaAcademicaConvalidada2(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstListarFichaAcademicaAprobadas method, of class MiImpl.
     */
    @Test
    public void testGetEstListarFichaAcademicaAprobadas() {
        System.out.println("getEstListarFichaAcademicaAprobadas");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEstListarFichaAcademicaAprobadas(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstListarProgramacion method, of class MiImpl.
     */
    @Test
    public void testGetEstListarProgramacion() {
        System.out.println("getEstListarProgramacion");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEstListarProgramacion(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstListarProgramacioncv method, of class MiImpl.
     */
    @Test
    public void testGetEstListarProgramacioncv() {
        System.out.println("getEstListarProgramacioncv");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEstListarProgramacioncv(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstRegistrarCambioPlan method, of class MiImpl.
     */
    @Test
    public void testSetEstRegistrarCambioPlan() {
        System.out.println("setEstRegistrarCambioPlan");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setEstRegistrarCambioPlan(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarMateriasPlanGrupo method, of class MiImpl.
     */
    @Test
    public void testGetListarMateriasPlanGrupo() {
        System.out.println("getListarMateriasPlanGrupo");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarMateriasPlanGrupo(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarMateriasPlanGrupoCantidad method, of class MiImpl.
     */
    @Test
    public void testGetListarMateriasPlanGrupoCantidad() {
        System.out.println("getListarMateriasPlanGrupoCantidad");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarMateriasPlanGrupoCantidad(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarMateriasPlan method, of class MiImpl.
     */
    @Test
    public void testGetListarMateriasPlan() {
        System.out.println("getListarMateriasPlan");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarMateriasPlan(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarMateriasPlanAnterior method, of class MiImpl.
     */
    @Test
    public void testGetListarMateriasPlanAnterior() {
        System.out.println("getListarMateriasPlanAnterior");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarMateriasPlanAnterior(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarMateriasPlanAnterior2 method, of class MiImpl.
     */
    @Test
    public void testGetListarMateriasPlanAnterior2() {
        System.out.println("getListarMateriasPlanAnterior2");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarMateriasPlanAnterior2(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarMateriasPlanConvalidado method, of class MiImpl.
     */
    @Test
    public void testGetListarMateriasPlanConvalidado() {
        System.out.println("getListarMateriasPlanConvalidado");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarMateriasPlanConvalidado(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarMtrPlan method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarMtrPlan() {
        System.out.println("setRegistrarMtrPlan");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarMtrPlan(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEliminarMtrPlan method, of class MiImpl.
     */
    @Test
    public void testSetEliminarMtrPlan() {
        System.out.println("setEliminarMtrPlan");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setEliminarMtrPlan(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMncBuscarMencion method, of class MiImpl.
     */
    @Test
    public void testGetMncBuscarMencion() {
        System.out.println("getMncBuscarMencion");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        Planes expResult = null;
        Planes result = instance.getMncBuscarMencion(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarMateriaPlan method, of class MiImpl.
     */
    @Test
    public void testGetBuscarMateriaPlan() {
        System.out.println("getBuscarMateriaPlan");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        Planes expResult = null;
        Planes result = instance.getBuscarMateriaPlan(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstListarMateriasNoAprobadas method, of class MiImpl.
     */
    @Test
    public void testGetEstListarMateriasNoAprobadas() {
        System.out.println("getEstListarMateriasNoAprobadas");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEstListarMateriasNoAprobadas(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrnListarTiposPerfiles method, of class MiImpl.
     */
    @Test
    public void testGetTrnListarTiposPerfiles() {
        System.out.println("getTrnListarTiposPerfiles");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getTrnListarTiposPerfiles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrnMiListarPerfilesProceso method, of class MiImpl.
     */
    @Test
    public void testGetTrnMiListarPerfilesProceso() {
        System.out.println("getTrnMiListarPerfilesProceso");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getTrnMiListarPerfilesProceso(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrnBuscarPerfilProceso method, of class MiImpl.
     */
    @Test
    public void testGetTrnBuscarPerfilProceso() {
        System.out.println("getTrnBuscarPerfilProceso");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        Perfiles expResult = null;
        Perfiles result = instance.getTrnBuscarPerfilProceso(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrnPerfilTieneDescuento method, of class MiImpl.
     */
    @Test
    public void testGetTrnPerfilTieneDescuento() {
        System.out.println("getTrnPerfilTieneDescuento");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.getTrnPerfilTieneDescuento(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrnListarPerfilesMaterias method, of class MiImpl.
     */
    @Test
    public void testGetTrnListarPerfilesMaterias() {
        System.out.println("getTrnListarPerfilesMaterias");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getTrnListarPerfilesMaterias(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrnBuscarPerfilMateria method, of class MiImpl.
     */
    @Test
    public void testGetTrnBuscarPerfilMateria() {
        System.out.println("getTrnBuscarPerfilMateria");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        Perfiles expResult = null;
        Perfiles result = instance.getTrnBuscarPerfilMateria(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrnListarPerfiles method, of class MiImpl.
     */
    @Test
    public void testGetTrnListarPerfiles() {
        System.out.println("getTrnListarPerfiles");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getTrnListarPerfiles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrnBuscarPerfil method, of class MiImpl.
     */
    @Test
    public void testGetTrnBuscarPerfil() {
        System.out.println("getTrnBuscarPerfil");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        Perfiles expResult = null;
        Perfiles result = instance.getTrnBuscarPerfil(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTrnRegistrarPerfilMateria method, of class MiImpl.
     */
    @Test
    public void testSetTrnRegistrarPerfilMateria() {
        System.out.println("setTrnRegistrarPerfilMateria");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setTrnRegistrarPerfilMateria(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMtrListarMatriculasEstudiante method, of class MiImpl.
     */
    @Test
    public void testGetMtrListarMatriculasEstudiante() {
        System.out.println("getMtrListarMatriculasEstudiante");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getMtrListarMatriculasEstudiante(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarMateriasPlanRequisitos method, of class MiImpl.
     */
    @Test
    public void testGetListarMateriasPlanRequisitos() {
        System.out.println("getListarMateriasPlanRequisitos");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarMateriasPlanRequisitos(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarMateriasElectivasPlan method, of class MiImpl.
     */
    @Test
    public void testGetListarMateriasElectivasPlan() {
        System.out.println("getListarMateriasElectivasPlan");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarMateriasElectivasPlan(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarMateriasPlanMencion method, of class MiImpl.
     */
    @Test
    public void testGetListarMateriasPlanMencion() {
        System.out.println("getListarMateriasPlanMencion");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarMateriasPlanMencion(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarMateriasRequisitos method, of class MiImpl.
     */
    @Test
    public void testGetListarMateriasRequisitos() {
        System.out.println("getListarMateriasRequisitos");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarMateriasRequisitos(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarMateriasNoRequisitos method, of class MiImpl.
     */
    @Test
    public void testGetListarMateriasNoRequisitos() {
        System.out.println("getListarMateriasNoRequisitos");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarMateriasNoRequisitos(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarMateriasConvalidadas method, of class MiImpl.
     */
    @Test
    public void testGetListarMateriasConvalidadas() {
        System.out.println("getListarMateriasConvalidadas");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarMateriasConvalidadas(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarMateriasNoConvalidadas method, of class MiImpl.
     */
    @Test
    public void testGetListarMateriasNoConvalidadas() {
        System.out.println("getListarMateriasNoConvalidadas");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarMateriasNoConvalidadas(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarMateriasNoPlan method, of class MiImpl.
     */
    @Test
    public void testGetListarMateriasNoPlan() {
        System.out.println("getListarMateriasNoPlan");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarMateriasNoPlan(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlnListarTiposMaterias method, of class MiImpl.
     */
    @Test
    public void testGetPlnListarTiposMaterias() {
        System.out.println("getPlnListarTiposMaterias");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getPlnListarTiposMaterias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlnBuscarTipoMateria method, of class MiImpl.
     */
    @Test
    public void testGetPlnBuscarTipoMateria() {
        System.out.println("getPlnBuscarTipoMateria");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        Planes expResult = null;
        Planes result = instance.getPlnBuscarTipoMateria(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarPrgPlan method, of class MiImpl.
     */
    @Test
    public void testGetBuscarPrgPlan() {
        System.out.println("getBuscarPrgPlan");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        Planes expResult = null;
        Planes result = instance.getBuscarPrgPlan(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarPrgPlan2 method, of class MiImpl.
     */
    @Test
    public void testGetBuscarPrgPlan2() {
        System.out.println("getBuscarPrgPlan2");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        Planes expResult = null;
        Planes result = instance.getBuscarPrgPlan2(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarMtrPlan method, of class MiImpl.
     */
    @Test
    public void testGetBuscarMtrPlan() {
        System.out.println("getBuscarMtrPlan");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        Planes expResult = null;
        Planes result = instance.getBuscarMtrPlan(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModificarMtrPlan method, of class MiImpl.
     */
    @Test
    public void testSetModificarMtrPlan() {
        System.out.println("setModificarMtrPlan");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setModificarMtrPlan(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarCambiarEstadoEstudiante method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarCambiarEstadoEstudiante() {
        System.out.println("setRegistrarCambiarEstadoEstudiante");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarCambiarEstadoEstudiante(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarCambiarEstadoMatricula method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarCambiarEstadoMatricula() {
        System.out.println("setRegistrarCambiarEstadoMatricula");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarCambiarEstadoMatricula(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPstListarPersonasNombre method, of class MiImpl.
     */
    @Test
    public void testGetPstListarPersonasNombre() {
        System.out.println("getPstListarPersonasNombre");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getPstListarPersonasNombre(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPstListarPersonasDip method, of class MiImpl.
     */
    @Test
    public void testGetPstListarPersonasDip() {
        System.out.println("getPstListarPersonasDip");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getPstListarPersonasDip(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMiListarPstProgramaGestionPeriodo method, of class MiImpl.
     */
    @Test
    public void testGetMiListarPstProgramaGestionPeriodo() {
        System.out.println("getMiListarPstProgramaGestionPeriodo");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getMiListarPstProgramaGestionPeriodo(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMiListarPstProgramaGestionPeriodoSede method, of class MiImpl.
     */
    @Test
    public void testGetMiListarPstProgramaGestionPeriodoSede() {
        System.out.println("getMiListarPstProgramaGestionPeriodoSede");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getMiListarPstProgramaGestionPeriodoSede(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMiListarPstPsaGestionPeriodo method, of class MiImpl.
     */
    @Test
    public void testGetMiListarPstPsaGestionPeriodo() {
        System.out.println("getMiListarPstPsaGestionPeriodo");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getMiListarPstPsaGestionPeriodo(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepAsistenciapostulantepsa method, of class MiImpl.
     */
    @Test
    public void testGetRepAsistenciapostulantepsa() {
        System.out.println("getRepAsistenciapostulantepsa");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepAsistenciapostulantepsa(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPstModificarAsistenciaPostulante method, of class MiImpl.
     */
    @Test
    public void testSetPstModificarAsistenciaPostulante() {
        System.out.println("setPstModificarAsistenciaPostulante");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setPstModificarAsistenciaPostulante(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepAsistenciapostulantepsaci method, of class MiImpl.
     */
    @Test
    public void testGetRepAsistenciapostulantepsaci() {
        System.out.println("getRepAsistenciapostulantepsaci");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRepAsistenciapostulantepsaci(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDctListarPostulantespsasoloid method, of class MiImpl.
     */
    @Test
    public void testGetDctListarPostulantespsasoloid() {
        System.out.println("getDctListarPostulantespsasoloid");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getDctListarPostulantespsasoloid(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNroPostulantesPsa method, of class MiImpl.
     */
    @Test
    public void testGetNroPostulantesPsa() {
        System.out.println("getNroPostulantesPsa");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getNroPostulantesPsa(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrsListarPersonasDip method, of class MiImpl.
     */
    @Test
    public void testGetPrsListarPersonasDip() {
        System.out.println("getPrsListarPersonasDip");
        Personas persona = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getPrsListarPersonasDip(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarItemsPersonasDip method, of class MiImpl.
     */
    @Test
    public void testGetListarItemsPersonasDip() {
        System.out.println("getListarItemsPersonasDip");
        Personas persona = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarItemsPersonasDip(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarItemPersona method, of class MiImpl.
     */
    @Test
    public void testGetBuscarItemPersona() {
        System.out.println("getBuscarItemPersona");
        Personas persona = null;
        MiImpl instance = new MiImpl();
        Personas expResult = null;
        Personas result = instance.getBuscarItemPersona(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarItemsUsuario method, of class MiImpl.
     */
    @Test
    public void testGetBuscarItemsUsuario() {
        System.out.println("getBuscarItemsUsuario");
        Personas persona = null;
        MiImpl instance = new MiImpl();
        Personas expResult = null;
        Personas result = instance.getBuscarItemsUsuario(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarEstAdjuntos method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarEstAdjuntos() {
        System.out.println("setRegistrarEstAdjuntos");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarEstAdjuntos(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarAdjuntosEstudiante method, of class MiImpl.
     */
    @Test
    public void testGetListarAdjuntosEstudiante() {
        System.out.println("getListarAdjuntosEstudiante");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarAdjuntosEstudiante(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEliminarEstAdjunto method, of class MiImpl.
     */
    @Test
    public void testSetEliminarEstAdjunto() {
        System.out.println("setEliminarEstAdjunto");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setEliminarEstAdjunto(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMiListarPostulantesPorPersona method, of class MiImpl.
     */
    @Test
    public void testGetMiListarPostulantesPorPersona() {
        System.out.println("getMiListarPostulantesPorPersona");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getMiListarPostulantesPorPersona(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarPstPrsColegio method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarPstPrsColegio() {
        System.out.println("setRegistrarPstPrsColegio");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarPstPrsColegio(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarPstPersonaColegio method, of class MiImpl.
     */
    @Test
    public void testGetBuscarPstPersonaColegio() {
        System.out.println("getBuscarPstPersonaColegio");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        Postulantes expResult = null;
        Postulantes result = instance.getBuscarPstPersonaColegio(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarPrgPlanesVestibulares method, of class MiImpl.
     */
    @Test
    public void testGetListarPrgPlanesVestibulares() {
        System.out.println("getListarPrgPlanesVestibulares");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarPrgPlanesVestibulares();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarPrgPlanesUniversitarios method, of class MiImpl.
     */
    @Test
    public void testGetListarPrgPlanesUniversitarios() {
        System.out.println("getListarPrgPlanesUniversitarios");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarPrgPlanesUniversitarios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarMaxPrgPlanActual method, of class MiImpl.
     */
    @Test
    public void testGetBuscarMaxPrgPlanActual() {
        System.out.println("getBuscarMaxPrgPlanActual");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        Planes expResult = null;
        Planes result = instance.getBuscarMaxPrgPlanActual(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarNotasFaseEstudiantes method, of class MiImpl.
     */
    @Test
    public void testGetListarNotasFaseEstudiantes() {
        System.out.println("getListarNotasFaseEstudiantes");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarNotasFaseEstudiantes(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarDocentesProgramados method, of class MiImpl.
     */
    @Test
    public void testGetListarDocentesProgramados() {
        System.out.println("getListarDocentesProgramados");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarDocentesProgramados(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarResumenNotasEstudiantes method, of class MiImpl.
     */
    @Test
    public void testGetListarResumenNotasEstudiantes() {
        System.out.println("getListarResumenNotasEstudiantes");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarResumenNotasEstudiantes(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarActaCalificaciones method, of class MiImpl.
     */
    @Test
    public void testGetListarActaCalificaciones() {
        System.out.println("getListarActaCalificaciones");
        Notas nota = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarActaCalificaciones(nota);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarMateriasCerrarLibretaIndiv method, of class MiImpl.
     */
    @Test
    public void testGetListarMateriasCerrarLibretaIndiv() {
        System.out.println("getListarMateriasCerrarLibretaIndiv");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarMateriasCerrarLibretaIndiv(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCerrarLibretaPorMateria method, of class MiImpl.
     */
    @Test
    public void testSetCerrarLibretaPorMateria() {
        System.out.println("setCerrarLibretaPorMateria");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setCerrarLibretaPorMateria(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarNroEstudiantesMatriculados method, of class MiImpl.
     */
    @Test
    public void testGetListarNroEstudiantesMatriculados() {
        System.out.println("getListarNroEstudiantesMatriculados");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarNroEstudiantesMatriculados(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarNroEstMatriculadosSexosNacionalidades method, of class MiImpl.
     */
    @Test
    public void testGetListarNroEstMatriculadosSexosNacionalidades() {
        System.out.println("getListarNroEstMatriculadosSexosNacionalidades");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarNroEstMatriculadosSexosNacionalidades(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarNroEstMatriculadosTipoEstudiante method, of class MiImpl.
     */
    @Test
    public void testGetListarNroEstMatriculadosTipoEstudiante() {
        System.out.println("getListarNroEstMatriculadosTipoEstudiante");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarNroEstMatriculadosTipoEstudiante(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarNroEstMatriculadosTipoAdmision method, of class MiImpl.
     */
    @Test
    public void testGetListarNroEstMatriculadosTipoAdmision() {
        System.out.println("getListarNroEstMatriculadosTipoAdmision");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarNroEstMatriculadosTipoAdmision(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarNroEstMatriculadosSexos method, of class MiImpl.
     */
    @Test
    public void testGetListarNroEstMatriculadosSexos() {
        System.out.println("getListarNroEstMatriculadosSexos");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarNroEstMatriculadosSexos(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarNroEstMatriculadosNacionalidad method, of class MiImpl.
     */
    @Test
    public void testGetListarNroEstMatriculadosNacionalidad() {
        System.out.println("getListarNroEstMatriculadosNacionalidad");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarNroEstMatriculadosNacionalidad(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarGradosProgramas method, of class MiImpl.
     */
    @Test
    public void testGetListarGradosProgramas() {
        System.out.println("getListarGradosProgramas");
        Programas programa = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarGradosProgramas(programa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarNroEstProgramadosMaterias method, of class MiImpl.
     */
    @Test
    public void testGetListarNroEstProgramadosMaterias() {
        System.out.println("getListarNroEstProgramadosMaterias");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarNroEstProgramadosMaterias(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarNroEstProgramadosSexosNacionalidades method, of class MiImpl.
     */
    @Test
    public void testGetListarNroEstProgramadosSexosNacionalidades() {
        System.out.println("getListarNroEstProgramadosSexosNacionalidades");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarNroEstProgramadosSexosNacionalidades(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarNroPostProgramadosMaterias method, of class MiImpl.
     */
    @Test
    public void testGetListarNroPostProgramadosMaterias() {
        System.out.println("getListarNroPostProgramadosMaterias");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarNroPostProgramadosMaterias(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarNroEstProgAprReprAbaMaterias method, of class MiImpl.
     */
    @Test
    public void testGetListarNroEstProgAprReprAbaMaterias() {
        System.out.println("getListarNroEstProgAprReprAbaMaterias");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarNroEstProgAprReprAbaMaterias(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarNroEstAproPreU method, of class MiImpl.
     */
    @Test
    public void testGetListarNroEstAproPreU() {
        System.out.println("getListarNroEstAproPreU");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarNroEstAproPreU(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarNroEstAproAdmiEsp method, of class MiImpl.
     */
    @Test
    public void testGetListarNroEstAproAdmiEsp() {
        System.out.println("getListarNroEstAproAdmiEsp");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarNroEstAproAdmiEsp(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarNroEstAproPreUSexosNacionalidad method, of class MiImpl.
     */
    @Test
    public void testGetListarNroEstAproPreUSexosNacionalidad() {
        System.out.println("getListarNroEstAproPreUSexosNacionalidad");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarNroEstAproPreUSexosNacionalidad(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarNroEstAproAdEspSexosNacionalidad method, of class MiImpl.
     */
    @Test
    public void testGetListarNroEstAproAdEspSexosNacionalidad() {
        System.out.println("getListarNroEstAproAdEspSexosNacionalidad");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarNroEstAproAdEspSexosNacionalidad(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarMateriasGradoPlanPrograma method, of class MiImpl.
     */
    @Test
    public void testGetListarMateriasGradoPlanPrograma() {
        System.out.println("getListarMateriasGradoPlanPrograma");
        Materias materia = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarMateriasGradoPlanPrograma(materia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCerticadoCalificaciones method, of class MiImpl.
     */
    @Test
    public void testGetListarCerticadoCalificaciones() {
        System.out.println("getListarCerticadoCalificaciones");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCerticadoCalificaciones(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrgBuscarProgramaEstudiante method, of class MiImpl.
     */
    @Test
    public void testGetPrgBuscarProgramaEstudiante() {
        System.out.println("getPrgBuscarProgramaEstudiante");
        Programas programa = null;
        MiImpl instance = new MiImpl();
        Programas expResult = null;
        Programas result = instance.getPrgBuscarProgramaEstudiante(programa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstListarDetalleProgramacion method, of class MiImpl.
     */
    @Test
    public void testGetEstListarDetalleProgramacion() {
        System.out.println("getEstListarDetalleProgramacion");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEstListarDetalleProgramacion(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstListarEstudiantesPorGrupos method, of class MiImpl.
     */
    @Test
    public void testGetEstListarEstudiantesPorGrupos() {
        System.out.println("getEstListarEstudiantesPorGrupos");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEstListarEstudiantesPorGrupos(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstListarNotasEvaluacionContinua method, of class MiImpl.
     */
    @Test
    public void testGetEstListarNotasEvaluacionContinua() {
        System.out.println("getEstListarNotasEvaluacionContinua");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEstListarNotasEvaluacionContinua(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarEstudiantesEvaluacionContinua method, of class MiImpl.
     */
    @Test
    public void testGetListarEstudiantesEvaluacionContinua() {
        System.out.println("getListarEstudiantesEvaluacionContinua");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarEstudiantesEvaluacionContinua(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLbrTiposnotasListarDefinicion method, of class MiImpl.
     */
    @Test
    public void testGetLbrTiposnotasListarDefinicion() {
        System.out.println("getLbrTiposnotasListarDefinicion");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getLbrTiposnotasListarDefinicion(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModificarFaseDocente method, of class MiImpl.
     */
    @Test
    public void testSetModificarFaseDocente() {
        System.out.println("setModificarFaseDocente");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setModificarFaseDocente(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModificarFaseDocenteCerrarLibreta method, of class MiImpl.
     */
    @Test
    public void testSetModificarFaseDocenteCerrarLibreta() {
        System.out.println("setModificarFaseDocenteCerrarLibreta");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setModificarFaseDocenteCerrarLibreta(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEliminarFaseEstLibretas method, of class MiImpl.
     */
    @Test
    public void testSetEliminarFaseEstLibretas() {
        System.out.println("setEliminarFaseEstLibretas");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setEliminarFaseEstLibretas(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBloquearEstudiantesTodos method, of class MiImpl.
     */
    @Test
    public void testSetBloquearEstudiantesTodos() {
        System.out.println("setBloquearEstudiantesTodos");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setBloquearEstudiantesTodos(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModificarTipoEstudiante method, of class MiImpl.
     */
    @Test
    public void testSetModificarTipoEstudiante() {
        System.out.println("setModificarTipoEstudiante");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setModificarTipoEstudiante(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarPrsCompromisosPersona method, of class MiImpl.
     */
    @Test
    public void testGetListarPrsCompromisosPersona() {
        System.out.println("getListarPrsCompromisosPersona");
        Personas persona = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarPrsCompromisosPersona(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarPrsDocumentosClasificacion method, of class MiImpl.
     */
    @Test
    public void testGetListarPrsDocumentosClasificacion() {
        System.out.println("getListarPrsDocumentosClasificacion");
        Personas persona = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarPrsDocumentosClasificacion(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarPrsDocumentacionCompleta method, of class MiImpl.
     */
    @Test
    public void testGetBuscarPrsDocumentacionCompleta() {
        System.out.println("getBuscarPrsDocumentacionCompleta");
        Personas persona = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.getBuscarPrsDocumentacionCompleta(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMiEstListarCompromisos method, of class MiImpl.
     */
    @Test
    public void testGetMiEstListarCompromisos() {
        System.out.println("getMiEstListarCompromisos");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getMiEstListarCompromisos(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMiBuscarCompromiso method, of class MiImpl.
     */
    @Test
    public void testGetMiBuscarCompromiso() {
        System.out.println("getMiBuscarCompromiso");
        Personas persona = null;
        MiImpl instance = new MiImpl();
        Personas expResult = null;
        Personas result = instance.getMiBuscarCompromiso(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMiPrsNroCompromisos method, of class MiImpl.
     */
    @Test
    public void testGetMiPrsNroCompromisos() {
        System.out.println("getMiPrsNroCompromisos");
        Personas persona = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.getMiPrsNroCompromisos(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMiEstListarCompromisosCant method, of class MiImpl.
     */
    @Test
    public void testGetMiEstListarCompromisosCant() {
        System.out.println("getMiEstListarCompromisosCant");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.getMiEstListarCompromisosCant(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarEstProgramacionTipo method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarEstProgramacionTipo() {
        System.out.println("setRegistrarEstProgramacionTipo");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarEstProgramacionTipo(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDctListarAsignacionDocenteProgramaPlan method, of class MiImpl.
     */
    @Test
    public void testGetDctListarAsignacionDocenteProgramaPlan() {
        System.out.println("getDctListarAsignacionDocenteProgramaPlan");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getDctListarAsignacionDocenteProgramaPlan(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarGradoAcademicoPrograma method, of class MiImpl.
     */
    @Test
    public void testGetBuscarGradoAcademicoPrograma() {
        System.out.println("getBuscarGradoAcademicoPrograma");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        Libretas expResult = null;
        Libretas result = instance.getBuscarGradoAcademicoPrograma(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarActaCalificacionesPreCierre method, of class MiImpl.
     */
    @Test
    public void testGetListarActaCalificacionesPreCierre() {
        System.out.println("getListarActaCalificacionesPreCierre");
        Notas nota = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarActaCalificacionesPreCierre(nota);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarAsignacionDocenteTodas method, of class MiImpl.
     */
    @Test
    public void testGetListarAsignacionDocenteTodas() {
        System.out.println("getListarAsignacionDocenteTodas");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarAsignacionDocenteTodas(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarActaCalificacionesPorFase method, of class MiImpl.
     */
    @Test
    public void testGetListarActaCalificacionesPorFase() {
        System.out.println("getListarActaCalificacionesPorFase");
        Notas nota = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarActaCalificacionesPorFase(nota);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstListarProgramasEstudiante method, of class MiImpl.
     */
    @Test
    public void testGetEstListarProgramasEstudiante() {
        System.out.println("getEstListarProgramasEstudiante");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEstListarProgramasEstudiante(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstListarMatriculadosPorPrograma method, of class MiImpl.
     */
    @Test
    public void testGetEstListarMatriculadosPorPrograma() {
        System.out.println("getEstListarMatriculadosPorPrograma");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEstListarMatriculadosPorPrograma(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstListarMatriculadosPorProgramaTipoAdmision method, of class MiImpl.
     */
    @Test
    public void testGetEstListarMatriculadosPorProgramaTipoAdmision() {
        System.out.println("getEstListarMatriculadosPorProgramaTipoAdmision");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEstListarMatriculadosPorProgramaTipoAdmision(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMiBuscarEstProgramacion method, of class MiImpl.
     */
    @Test
    public void testGetMiBuscarEstProgramacion() {
        System.out.println("getMiBuscarEstProgramacion");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        Estudiantes expResult = null;
        Estudiantes result = instance.getMiBuscarEstProgramacion(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarMateriasPlanTipoGrado method, of class MiImpl.
     */
    @Test
    public void testGetListarMateriasPlanTipoGrado() {
        System.out.println("getListarMateriasPlanTipoGrado");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarMateriasPlanTipoGrado(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNroPstInscritosHabilitados method, of class MiImpl.
     */
    @Test
    public void testGetNroPstInscritosHabilitados() {
        System.out.println("getNroPstInscritosHabilitados");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getNroPstInscritosHabilitados(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNroPstInscritosHabilitadosTipoAdmision method, of class MiImpl.
     */
    @Test
    public void testGetNroPstInscritosHabilitadosTipoAdmision() {
        System.out.println("getNroPstInscritosHabilitadosTipoAdmision");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getNroPstInscritosHabilitadosTipoAdmision(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPstRegistrarProgramaAnterior method, of class MiImpl.
     */
    @Test
    public void testSetPstRegistrarProgramaAnterior() {
        System.out.println("setPstRegistrarProgramaAnterior");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setPstRegistrarProgramaAnterior(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarNotasRectificar method, of class MiImpl.
     */
    @Test
    public void testGetListarNotasRectificar() {
        System.out.println("getListarNotasRectificar");
        Notas nota = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarNotasRectificar(nota);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarNota method, of class MiImpl.
     */
    @Test
    public void testGetBuscarNota() {
        System.out.println("getBuscarNota");
        Notas nota = null;
        MiImpl instance = new MiImpl();
        Notas expResult = null;
        Notas result = instance.getBuscarNota(nota);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstListarFichaAcademicaBuscar method, of class MiImpl.
     */
    @Test
    public void testGetEstListarFichaAcademicaBuscar() {
        System.out.println("getEstListarFichaAcademicaBuscar");
        Notas nota = null;
        MiImpl instance = new MiImpl();
        Notas expResult = null;
        Notas result = instance.getEstListarFichaAcademicaBuscar(nota);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstListarFichaAcademicaBuscarBuscarAnulada method, of class MiImpl.
     */
    @Test
    public void testGetEstListarFichaAcademicaBuscarBuscarAnulada() {
        System.out.println("getEstListarFichaAcademicaBuscarBuscarAnulada");
        Notas nota = null;
        MiImpl instance = new MiImpl();
        Notas expResult = null;
        Notas result = instance.getEstListarFichaAcademicaBuscarBuscarAnulada(nota);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarRectificacion method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarRectificacion() {
        System.out.println("setRegistrarRectificacion");
        Notas nota = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarRectificacion(nota);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarRectificacionNota method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarRectificacionNota() {
        System.out.println("setRegistrarRectificacionNota");
        Notas nota = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarRectificacionNota(nota);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrgListarGrupos method, of class MiImpl.
     */
    @Test
    public void testGetPrgListarGrupos() {
        System.out.println("getPrgListarGrupos");
        Grupos grupo = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getPrgListarGrupos(grupo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMtrListarGruposNoAsignados method, of class MiImpl.
     */
    @Test
    public void testGetMtrListarGruposNoAsignados() {
        System.out.println("getMtrListarGruposNoAsignados");
        Grupos grupo = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getMtrListarGruposNoAsignados(grupo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMiDptoBuscarGrupo method, of class MiImpl.
     */
    @Test
    public void testGetMiDptoBuscarGrupo() {
        System.out.println("getMiDptoBuscarGrupo");
        Grupos grupo = null;
        MiImpl instance = new MiImpl();
        Grupos expResult = null;
        Grupos result = instance.getMiDptoBuscarGrupo(grupo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDctListarAsignacionDocenteProgramaPlanTipoGrado method, of class MiImpl.
     */
    @Test
    public void testGetDctListarAsignacionDocenteProgramaPlanTipoGrado() {
        System.out.println("getDctListarAsignacionDocenteProgramaPlanTipoGrado");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getDctListarAsignacionDocenteProgramaPlanTipoGrado(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDptoListarGruposMateriaTipoEvaluacion method, of class MiImpl.
     */
    @Test
    public void testGetDptoListarGruposMateriaTipoEvaluacion() {
        System.out.println("getDptoListarGruposMateriaTipoEvaluacion");
        Materias materia = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getDptoListarGruposMateriaTipoEvaluacion(materia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDptoListarGruposMateriaTipoEvaluacionDesignado method, of class MiImpl.
     */
    @Test
    public void testGetDptoListarGruposMateriaTipoEvaluacionDesignado() {
        System.out.println("getDptoListarGruposMateriaTipoEvaluacionDesignado");
        Materias materia = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getDptoListarGruposMateriaTipoEvaluacionDesignado(materia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarDocentesTodos method, of class MiImpl.
     */
    @Test
    public void testGetListarDocentesTodos() {
        System.out.println("getListarDocentesTodos");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarDocentesTodos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposNotas method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposNotas() {
        System.out.println("getListarTiposNotas");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposNotas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarLbrFase method, of class MiImpl.
     */
    @Test
    public void testGetBuscarLbrFase() {
        System.out.println("getBuscarLbrFase");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        Libretas expResult = null;
        Libretas result = instance.getBuscarLbrFase(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarLbrTipoNota method, of class MiImpl.
     */
    @Test
    public void testGetBuscarLbrTipoNota() {
        System.out.println("getBuscarLbrTipoNota");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        Libretas expResult = null;
        Libretas result = instance.getBuscarLbrTipoNota(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLbrRegistrarTipoNota method, of class MiImpl.
     */
    @Test
    public void testSetLbrRegistrarTipoNota() {
        System.out.println("setLbrRegistrarTipoNota");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setLbrRegistrarTipoNota(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLbrEliminarTipoNota method, of class MiImpl.
     */
    @Test
    public void testSetLbrEliminarTipoNota() {
        System.out.println("setLbrEliminarTipoNota");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setLbrEliminarTipoNota(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarMateriasCerrarLibretaDctAsignacion method, of class MiImpl.
     */
    @Test
    public void testGetListarMateriasCerrarLibretaDctAsignacion() {
        System.out.println("getListarMateriasCerrarLibretaDctAsignacion");
        Materias materia = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarMateriasCerrarLibretaDctAsignacion(materia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarEstudiantesParaCierreLibreta method, of class MiImpl.
     */
    @Test
    public void testGetListarEstudiantesParaCierreLibreta() {
        System.out.println("getListarEstudiantesParaCierreLibreta");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarEstudiantesParaCierreLibreta(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarEstudiantesEnEstLibretas method, of class MiImpl.
     */
    @Test
    public void testGetListarEstudiantesEnEstLibretas() {
        System.out.println("getListarEstudiantesEnEstLibretas");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarEstudiantesEnEstLibretas(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCertificadoNotasTodas method, of class MiImpl.
     */
    @Test
    public void testGetListarCertificadoNotasTodas() {
        System.out.println("getListarCertificadoNotasTodas");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCertificadoNotasTodas(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCertificadoNotasNivel method, of class MiImpl.
     */
    @Test
    public void testGetListarCertificadoNotasNivel() {
        System.out.println("getListarCertificadoNotasNivel");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCertificadoNotasNivel(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCertificadoNotasAprobadas method, of class MiImpl.
     */
    @Test
    public void testGetListarCertificadoNotasAprobadas() {
        System.out.println("getListarCertificadoNotasAprobadas");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCertificadoNotasAprobadas(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCertificadoNotasTodas2 method, of class MiImpl.
     */
    @Test
    public void testGetListarCertificadoNotasTodas2() {
        System.out.println("getListarCertificadoNotasTodas2");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCertificadoNotasTodas2(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCertificadoNotasAprobadas2 method, of class MiImpl.
     */
    @Test
    public void testGetListarCertificadoNotasAprobadas2() {
        System.out.println("getListarCertificadoNotasAprobadas2");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCertificadoNotasAprobadas2(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCertificadoNotasTodas3 method, of class MiImpl.
     */
    @Test
    public void testGetListarCertificadoNotasTodas3() {
        System.out.println("getListarCertificadoNotasTodas3");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCertificadoNotasTodas3(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCertificadoNotasAprobadas3 method, of class MiImpl.
     */
    @Test
    public void testGetListarCertificadoNotasAprobadas3() {
        System.out.println("getListarCertificadoNotasAprobadas3");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCertificadoNotasAprobadas3(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarHistorialAcademico method, of class MiImpl.
     */
    @Test
    public void testGetListarHistorialAcademico() {
        System.out.println("getListarHistorialAcademico");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarHistorialAcademico(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarEvaluacionesFinalesFase method, of class MiImpl.
     */
    @Test
    public void testGetListarEvaluacionesFinalesFase() {
        System.out.println("getListarEvaluacionesFinalesFase");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarEvaluacionesFinalesFase(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalAprobadosReprobadosMateria method, of class MiImpl.
     */
    @Test
    public void testGetTotalAprobadosReprobadosMateria() {
        System.out.println("getTotalAprobadosReprobadosMateria");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getTotalAprobadosReprobadosMateria(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarNotasEstudiantesLibretas method, of class MiImpl.
     */
    @Test
    public void testGetListarNotasEstudiantesLibretas() {
        System.out.println("getListarNotasEstudiantesLibretas");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarNotasEstudiantesLibretas(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCalificacionCalendario method, of class MiImpl.
     */
    @Test
    public void testGetListarCalificacionCalendario() {
        System.out.println("getListarCalificacionCalendario");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCalificacionCalendario(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCalificacionCalendarioDocente method, of class MiImpl.
     */
    @Test
    public void testGetListarCalificacionCalendarioDocente() {
        System.out.println("getListarCalificacionCalendarioDocente");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCalificacionCalendarioDocente(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEliminarAsignacionDocenteMateria method, of class MiImpl.
     */
    @Test
    public void testSetEliminarAsignacionDocenteMateria() {
        System.out.println("setEliminarAsignacionDocenteMateria");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setEliminarAsignacionDocenteMateria(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBuscar_id_fase_resolucion method, of class MiImpl.
     */
    @Test
    public void testSetBuscar_id_fase_resolucion() {
        System.out.println("setBuscar_id_fase_resolucion");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setBuscar_id_fase_resolucion(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBuscar_id_fase_resolucionFinal method, of class MiImpl.
     */
    @Test
    public void testSetBuscar_id_fase_resolucionFinal() {
        System.out.println("setBuscar_id_fase_resolucionFinal");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setBuscar_id_fase_resolucionFinal(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstListarMatriculadosPorProgramaTipoEstudiante method, of class MiImpl.
     */
    @Test
    public void testGetEstListarMatriculadosPorProgramaTipoEstudiante() {
        System.out.println("getEstListarMatriculadosPorProgramaTipoEstudiante");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEstListarMatriculadosPorProgramaTipoEstudiante(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPstListarInscritosPorProgramaTipoAdmision method, of class MiImpl.
     */
    @Test
    public void testGetPstListarInscritosPorProgramaTipoAdmision() {
        System.out.println("getPstListarInscritosPorProgramaTipoAdmision");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getPstListarInscritosPorProgramaTipoAdmision(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPstListarAprobadosPorProgramaTipoAdmision method, of class MiImpl.
     */
    @Test
    public void testGetPstListarAprobadosPorProgramaTipoAdmision() {
        System.out.println("getPstListarAprobadosPorProgramaTipoAdmision");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getPstListarAprobadosPorProgramaTipoAdmision(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPstListarReprobadosPorProgramaTipoAdmision method, of class MiImpl.
     */
    @Test
    public void testGetPstListarReprobadosPorProgramaTipoAdmision() {
        System.out.println("getPstListarReprobadosPorProgramaTipoAdmision");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getPstListarReprobadosPorProgramaTipoAdmision(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarMateriasPorDepartamento method, of class MiImpl.
     */
    @Test
    public void testGetListarMateriasPorDepartamento() {
        System.out.println("getListarMateriasPorDepartamento");
        Materias materia = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarMateriasPorDepartamento(materia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarMateriasPorSigla method, of class MiImpl.
     */
    @Test
    public void testGetListarMateriasPorSigla() {
        System.out.println("getListarMateriasPorSigla");
        Materias materia = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarMateriasPorSigla(materia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarMateriasPorMateria method, of class MiImpl.
     */
    @Test
    public void testGetListarMateriasPorMateria() {
        System.out.println("getListarMateriasPorMateria");
        Materias materia = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarMateriasPorMateria(materia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMtrBuscarTipoMateria method, of class MiImpl.
     */
    @Test
    public void testGetMtrBuscarTipoMateria() {
        System.out.println("getMtrBuscarTipoMateria");
        Materias materia = null;
        MiImpl instance = new MiImpl();
        Materias expResult = null;
        Materias result = instance.getMtrBuscarTipoMateria(materia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMtrListarTiposMaterias method, of class MiImpl.
     */
    @Test
    public void testGetMtrListarTiposMaterias() {
        System.out.println("getMtrListarTiposMaterias");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getMtrListarTiposMaterias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarMateria method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarMateria() {
        System.out.println("setRegistrarMateria");
        Materias materia = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarMateria(materia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEliminarMateria method, of class MiImpl.
     */
    @Test
    public void testSetEliminarMateria() {
        System.out.println("setEliminarMateria");
        Materias materia = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setEliminarMateria(materia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscar_nro_excepcion_calendario method, of class MiImpl.
     */
    @Test
    public void testGetBuscar_nro_excepcion_calendario() {
        System.out.println("getBuscar_nro_excepcion_calendario");
        Materias materia = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.getBuscar_nro_excepcion_calendario(materia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarTipoAdmision method, of class MiImpl.
     */
    @Test
    public void testGetBuscarTipoAdmision() {
        System.out.println("getBuscarTipoAdmision");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        Estudiantes expResult = null;
        Estudiantes result = instance.getBuscarTipoAdmision(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarTipoClasificacionEstudiante method, of class MiImpl.
     */
    @Test
    public void testGetBuscarTipoClasificacionEstudiante() {
        System.out.println("getBuscarTipoClasificacionEstudiante");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        Estudiantes expResult = null;
        Estudiantes result = instance.getBuscarTipoClasificacionEstudiante(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarEstClasificacion method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarEstClasificacion() {
        System.out.println("setRegistrarEstClasificacion");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarEstClasificacion(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMiListarPostulantesDipTipoAdm method, of class MiImpl.
     */
    @Test
    public void testGetMiListarPostulantesDipTipoAdm() {
        System.out.println("getMiListarPostulantesDipTipoAdm");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getMiListarPostulantesDipTipoAdm(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMiListarPostulantesNombreTipoAdm method, of class MiImpl.
     */
    @Test
    public void testGetMiListarPostulantesNombreTipoAdm() {
        System.out.println("getMiListarPostulantesNombreTipoAdm");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getMiListarPostulantesNombreTipoAdm(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMiBuscarUltimoEstRegularizacion method, of class MiImpl.
     */
    @Test
    public void testGetMiBuscarUltimoEstRegularizacion() {
        System.out.println("getMiBuscarUltimoEstRegularizacion");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        Estudiantes expResult = null;
        Estudiantes result = instance.getMiBuscarUltimoEstRegularizacion(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMiBuscarEstRegularizacion method, of class MiImpl.
     */
    @Test
    public void testGetMiBuscarEstRegularizacion() {
        System.out.println("getMiBuscarEstRegularizacion");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        Estudiantes expResult = null;
        Estudiantes result = instance.getMiBuscarEstRegularizacion(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMiListarRegularizacionesEstudiante method, of class MiImpl.
     */
    @Test
    public void testGetMiListarRegularizacionesEstudiante() {
        System.out.println("getMiListarRegularizacionesEstudiante");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getMiListarRegularizacionesEstudiante(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarEstRegularizacionBloqueoEst method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarEstRegularizacionBloqueoEst() {
        System.out.println("setRegistrarEstRegularizacionBloqueoEst");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarEstRegularizacionBloqueoEst(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModificarRegularizar method, of class MiImpl.
     */
    @Test
    public void testSetModificarRegularizar() {
        System.out.println("setModificarRegularizar");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setModificarRegularizar(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMiListarTiposRegularizaciones method, of class MiImpl.
     */
    @Test
    public void testGetMiListarTiposRegularizaciones() {
        System.out.println("getMiListarTiposRegularizaciones");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getMiListarTiposRegularizaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstBuscarMencion method, of class MiImpl.
     */
    @Test
    public void testGetEstBuscarMencion() {
        System.out.println("getEstBuscarMencion");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        Menciones expResult = null;
        Menciones result = instance.getEstBuscarMencion(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarPlanMateriasNotas method, of class MiImpl.
     */
    @Test
    public void testGetListarPlanMateriasNotas() {
        System.out.println("getListarPlanMateriasNotas");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarPlanMateriasNotas(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarPlanMateriasNotas2 method, of class MiImpl.
     */
    @Test
    public void testGetListarPlanMateriasNotas2() {
        System.out.println("getListarPlanMateriasNotas2");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarPlanMateriasNotas2(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarPlanMateriasNotas3 method, of class MiImpl.
     */
    @Test
    public void testGetListarPlanMateriasNotas3() {
        System.out.println("getListarPlanMateriasNotas3");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarPlanMateriasNotas3(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarPromedioDeNotas method, of class MiImpl.
     */
    @Test
    public void testGetBuscarPromedioDeNotas() {
        System.out.println("getBuscarPromedioDeNotas");
        Notas nota = null;
        MiImpl instance = new MiImpl();
        double expResult = 0.0;
        double result = instance.getBuscarPromedioDeNotas(nota);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCantidadMateriasAprobadas method, of class MiImpl.
     */
    @Test
    public void testGetCantidadMateriasAprobadas() {
        System.out.println("getCantidadMateriasAprobadas");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.getCantidadMateriasAprobadas(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarDocente method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarDocente() {
        System.out.println("setRegistrarDocente");
        Docentes docente = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarDocente(docente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEliminarDocente method, of class MiImpl.
     */
    @Test
    public void testSetEliminarDocente() {
        System.out.println("setEliminarDocente");
        Docentes docente = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setEliminarDocente(docente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarPersonas method, of class MiImpl.
     */
    @Test
    public void testGetListarPersonas() {
        System.out.println("getListarPersonas");
        Personas persona = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarPersonas(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCalendarios method, of class MiImpl.
     */
    @Test
    public void testGetListarCalendarios() {
        System.out.println("getListarCalendarios");
        Calendarios calendario = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCalendarios(calendario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarTiposConvalidaciones method, of class MiImpl.
     */
    @Test
    public void testGetListarTiposConvalidaciones() {
        System.out.println("getListarTiposConvalidaciones");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarTiposConvalidaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarTipoConvalidacion method, of class MiImpl.
     */
    @Test
    public void testGetBuscarTipoConvalidacion() {
        System.out.println("getBuscarTipoConvalidacion");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        Planes expResult = null;
        Planes result = instance.getBuscarTipoConvalidacion(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUnvListarUniversidades method, of class MiImpl.
     */
    @Test
    public void testGetUnvListarUniversidades() {
        System.out.println("getUnvListarUniversidades");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getUnvListarUniversidades();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarConvalidacionManual method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarConvalidacionManual() {
        System.out.println("setRegistrarConvalidacionManual");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarConvalidacionManual(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarDetallesConvalidacionManual method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarDetallesConvalidacionManual() {
        System.out.println("setRegistrarDetallesConvalidacionManual");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarDetallesConvalidacionManual(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarConvalidacionManualPrograma method, of class MiImpl.
     */
    @Test
    public void testGetListarConvalidacionManualPrograma() {
        System.out.println("getListarConvalidacionManualPrograma");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarConvalidacionManualPrograma(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarConvalidacionManualPrograma2 method, of class MiImpl.
     */
    @Test
    public void testGetListarConvalidacionManualPrograma2() {
        System.out.println("getListarConvalidacionManualPrograma2");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarConvalidacionManualPrograma2(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarConvalidacionManual method, of class MiImpl.
     */
    @Test
    public void testGetBuscarConvalidacionManual() {
        System.out.println("getBuscarConvalidacionManual");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        Planes expResult = null;
        Planes result = instance.getBuscarConvalidacionManual(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCnvDetallesConvalidacion method, of class MiImpl.
     */
    @Test
    public void testGetListarCnvDetallesConvalidacion() {
        System.out.println("getListarCnvDetallesConvalidacion");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCnvDetallesConvalidacion(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCnvDetallesConvalidacion2 method, of class MiImpl.
     */
    @Test
    public void testGetListarCnvDetallesConvalidacion2() {
        System.out.println("getListarCnvDetallesConvalidacion2");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCnvDetallesConvalidacion2(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarNotasCruceCnvDetalles method, of class MiImpl.
     */
    @Test
    public void testGetListarNotasCruceCnvDetalles() {
        System.out.println("getListarNotasCruceCnvDetalles");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarNotasCruceCnvDetalles(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarEstNotasConvalidacionManual method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarEstNotasConvalidacionManual() {
        System.out.println("setRegistrarEstNotasConvalidacionManual");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarEstNotasConvalidacionManual(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEliminarCnvDetalle method, of class MiImpl.
     */
    @Test
    public void testSetEliminarCnvDetalle() {
        System.out.println("setEliminarCnvDetalle");
        Planes plan = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setEliminarCnvDetalle(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarDeudasEstudiante method, of class MiImpl.
     */
    @Test
    public void testGetListarDeudasEstudiante() {
        System.out.println("getListarDeudasEstudiante");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarDeudasEstudiante(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMiBuscarEstDeuda method, of class MiImpl.
     */
    @Test
    public void testGetMiBuscarEstDeuda() {
        System.out.println("getMiBuscarEstDeuda");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        Estudiantes expResult = null;
        Estudiantes result = instance.getMiBuscarEstDeuda(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarUltimaEstDeuda method, of class MiImpl.
     */
    @Test
    public void testGetBuscarUltimaEstDeuda() {
        System.out.println("getBuscarUltimaEstDeuda");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        Estudiantes expResult = null;
        Estudiantes result = instance.getBuscarUltimaEstDeuda(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarEstDeuda method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarEstDeuda() {
        System.out.println("setRegistrarEstDeuda");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarEstDeuda(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModificarEstDeuda method, of class MiImpl.
     */
    @Test
    public void testSetModificarEstDeuda() {
        System.out.println("setModificarEstDeuda");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setModificarEstDeuda(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMiListarTiposDeudas method, of class MiImpl.
     */
    @Test
    public void testGetMiListarTiposDeudas() {
        System.out.println("getMiListarTiposDeudas");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getMiListarTiposDeudas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrnBuscarSiguienteNroRecibo method, of class MiImpl.
     */
    @Test
    public void testGetTrnBuscarSiguienteNroRecibo() {
        System.out.println("getTrnBuscarSiguienteNroRecibo");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.getTrnBuscarSiguienteNroRecibo(perfil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTrnActualizarNroRecibo method, of class MiImpl.
     */
    @Test
    public void testSetTrnActualizarNroRecibo() {
        System.out.println("setTrnActualizarNroRecibo");
        Perfiles perfil = null;
        MiImpl instance = new MiImpl();
        instance.setTrnActualizarNroRecibo(perfil);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarPersona method, of class MiImpl.
     */
    @Test
    public void testGetBuscarPersona() {
        System.out.println("getBuscarPersona");
        Personas persona = null;
        MiImpl instance = new MiImpl();
        Personas expResult = null;
        Personas result = instance.getBuscarPersona(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarUsuarios method, of class MiImpl.
     */
    @Test
    public void testGetListarUsuarios() {
        System.out.println("getListarUsuarios");
        Usuarios usuario = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarUsuarios(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarUsuario method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarUsuario() {
        System.out.println("setRegistrarUsuario");
        Usuarios usuario = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarUsuario(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEliminarUsuario method, of class MiImpl.
     */
    @Test
    public void testSetEliminarUsuario() {
        System.out.println("setEliminarUsuario");
        Usuarios usuario = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setEliminarUsuario(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModificarApodoClaveDocente method, of class MiImpl.
     */
    @Test
    public void testSetModificarApodoClaveDocente() {
        System.out.println("setModificarApodoClaveDocente");
        Docentes docente = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setModificarApodoClaveDocente(docente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMtrModificarApodoClaveEstudiante method, of class MiImpl.
     */
    @Test
    public void testSetMtrModificarApodoClaveEstudiante() {
        System.out.println("setMtrModificarApodoClaveEstudiante");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setMtrModificarApodoClaveEstudiante(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarApodoClaveMatricula method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarApodoClaveMatricula() {
        System.out.println("setRegistrarApodoClaveMatricula");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarApodoClaveMatricula(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMiBuscarTipoNota method, of class MiImpl.
     */
    @Test
    public void testGetMiBuscarTipoNota() {
        System.out.println("getMiBuscarTipoNota");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        Libretas expResult = null;
        Libretas result = instance.getMiBuscarTipoNota(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstListarPorProgramaTipoDescuento method, of class MiImpl.
     */
    @Test
    public void testGetEstListarPorProgramaTipoDescuento() {
        System.out.println("getEstListarPorProgramaTipoDescuento");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEstListarPorProgramaTipoDescuento(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDctListarAsignacionDocenteMateria method, of class MiImpl.
     */
    @Test
    public void testGetDctListarAsignacionDocenteMateria() {
        System.out.println("getDctListarAsignacionDocenteMateria");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getDctListarAsignacionDocenteMateria(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDctListarAsignacionDocenteMateriaFuncion method, of class MiImpl.
     */
    @Test
    public void testGetDctListarAsignacionDocenteMateriaFuncion() {
        System.out.println("getDctListarAsignacionDocenteMateriaFuncion");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getDctListarAsignacionDocenteMateriaFuncion(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDctListarAsignacionDocenteMateriaFuncionxid method, of class MiImpl.
     */
    @Test
    public void testGetDctListarAsignacionDocenteMateriaFuncionxid() {
        System.out.println("getDctListarAsignacionDocenteMateriaFuncionxid");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getDctListarAsignacionDocenteMateriaFuncionxid(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDctListarAsignacionDocenteMateriaFuncionsintitular method, of class MiImpl.
     */
    @Test
    public void testGetDctListarAsignacionDocenteMateriaFuncionsintitular() {
        System.out.println("getDctListarAsignacionDocenteMateriaFuncionsintitular");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getDctListarAsignacionDocenteMateriaFuncionsintitular(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDctListarAsignacionDocenteMateriaFuncionsintitularfinal method, of class MiImpl.
     */
    @Test
    public void testGetDctListarAsignacionDocenteMateriaFuncionsintitularfinal() {
        System.out.println("getDctListarAsignacionDocenteMateriaFuncionsintitularfinal");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getDctListarAsignacionDocenteMateriaFuncionsintitularfinal(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDctListarAsignacionDocenteMateriaFuncionsoloid method, of class MiImpl.
     */
    @Test
    public void testGetDctListarAsignacionDocenteMateriaFuncionsoloid() {
        System.out.println("getDctListarAsignacionDocenteMateriaFuncionsoloid");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getDctListarAsignacionDocenteMateriaFuncionsoloid(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDctListarAsignacionDocenteMateriaFuncionparamemo method, of class MiImpl.
     */
    @Test
    public void testGetDctListarAsignacionDocenteMateriaFuncionparamemo() {
        System.out.println("getDctListarAsignacionDocenteMateriaFuncionparamemo");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getDctListarAsignacionDocenteMateriaFuncionparamemo(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDctListarAsignacionDocenteMateriacontador method, of class MiImpl.
     */
    @Test
    public void testGetDctListarAsignacionDocenteMateriacontador() {
        System.out.println("getDctListarAsignacionDocenteMateriacontador");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getDctListarAsignacionDocenteMateriacontador(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDctListarAsignacionDocenteMateriatc method, of class MiImpl.
     */
    @Test
    public void testGetDctListarAsignacionDocenteMateriatc() {
        System.out.println("getDctListarAsignacionDocenteMateriatc");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getDctListarAsignacionDocenteMateriatc(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDctListarNroAsignacionDocenteMateriaFuncionxid method, of class MiImpl.
     */
    @Test
    public void testGetDctListarNroAsignacionDocenteMateriaFuncionxid() {
        System.out.println("getDctListarNroAsignacionDocenteMateriaFuncionxid");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getDctListarNroAsignacionDocenteMateriaFuncionxid(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDctListarAsignacionAuxiliarMateria method, of class MiImpl.
     */
    @Test
    public void testGetDctListarAsignacionAuxiliarMateria() {
        System.out.println("getDctListarAsignacionAuxiliarMateria");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getDctListarAsignacionAuxiliarMateria(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarEstConProrroga method, of class MiImpl.
     */
    @Test
    public void testGetListarEstConProrroga() {
        System.out.println("getListarEstConProrroga");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarEstConProrroga(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRendimientoAcademico method, of class MiImpl.
     */
    @Test
    public void testGetRendimientoAcademico() {
        System.out.println("getRendimientoAcademico");
        Estudiantes promedio = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getRendimientoAcademico(promedio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDesignacionBecaTrabajo method, of class MiImpl.
     */
    @Test
    public void testGetDesignacionBecaTrabajo() {
        System.out.println("getDesignacionBecaTrabajo");
        Estudiantes becario = null;
        MiImpl instance = new MiImpl();
        Estudiantes expResult = null;
        Estudiantes result = instance.getDesignacionBecaTrabajo(becario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstBuscarEstudianteDocente method, of class MiImpl.
     */
    @Test
    public void testGetEstBuscarEstudianteDocente() {
        System.out.println("getEstBuscarEstudianteDocente");
        Personas persona = null;
        MiImpl instance = new MiImpl();
        Personas expResult = null;
        Personas result = instance.getEstBuscarEstudianteDocente(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarEstBecasTrabajo method, of class MiImpl.
     */
    @Test
    public void testGetListarEstBecasTrabajo() {
        System.out.println("getListarEstBecasTrabajo");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarEstBecasTrabajo(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarEstBecasTrabajoFuncional method, of class MiImpl.
     */
    @Test
    public void testGetListarEstBecasTrabajoFuncional() {
        System.out.println("getListarEstBecasTrabajoFuncional");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarEstBecasTrabajoFuncional(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarNiveles method, of class MiImpl.
     */
    @Test
    public void testGetListarNiveles() {
        System.out.println("getListarNiveles");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarNiveles(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMiRegistrarPstPersonaTrn method, of class MiImpl.
     */
    @Test
    public void testSetMiRegistrarPstPersonaTrn() {
        System.out.println("setMiRegistrarPstPersonaTrn");
        Postulantes postulante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setMiRegistrarPstPersonaTrn(postulante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarDocentesPorDpto method, of class MiImpl.
     */
    @Test
    public void testGetListarDocentesPorDpto() {
        System.out.println("getListarDocentesPorDpto");
        Docentes docente = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarDocentesPorDpto(docente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarClavesEstPorPrograma method, of class MiImpl.
     */
    @Test
    public void testGetListarClavesEstPorPrograma() {
        System.out.println("getListarClavesEstPorPrograma");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarClavesEstPorPrograma(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCursoPreIngles method, of class MiImpl.
     */
    @Test
    public void testGetListarCursoPreIngles() {
        System.out.println("getListarCursoPreIngles");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCursoPreIngles(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCursoPreInglesOtros method, of class MiImpl.
     */
    @Test
    public void testGetListarCursoPreInglesOtros() {
        System.out.println("getListarCursoPreInglesOtros");
        Personas persona = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCursoPreInglesOtros(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDptoListarGruposMateriaTipoEvaluacionAuxiliares method, of class MiImpl.
     */
    @Test
    public void testGetDptoListarGruposMateriaTipoEvaluacionAuxiliares() {
        System.out.println("getDptoListarGruposMateriaTipoEvaluacionAuxiliares");
        Materias materia = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getDptoListarGruposMateriaTipoEvaluacionAuxiliares(materia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarAuxiliaresTodos method, of class MiImpl.
     */
    @Test
    public void testGetListarAuxiliaresTodos() {
        System.out.println("getListarAuxiliaresTodos");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarAuxiliaresTodos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarAsignacionAuxiliar method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarAsignacionAuxiliar() {
        System.out.println("setRegistrarAsignacionAuxiliar");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarAsignacionAuxiliar(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDctBuscarAsignacionAuxiliar method, of class MiImpl.
     */
    @Test
    public void testGetDctBuscarAsignacionAuxiliar() {
        System.out.println("getDctBuscarAsignacionAuxiliar");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        Asignaciones expResult = null;
        Asignaciones result = instance.getDctBuscarAsignacionAuxiliar(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarAuxiliar method, of class MiImpl.
     */
    @Test
    public void testGetBuscarAuxiliar() {
        System.out.println("getBuscarAuxiliar");
        Docentes docente = null;
        MiImpl instance = new MiImpl();
        Docentes expResult = null;
        Docentes result = instance.getBuscarAuxiliar(docente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEliminarAsignacionAuxiliarMateria method, of class MiImpl.
     */
    @Test
    public void testSetEliminarAsignacionAuxiliarMateria() {
        System.out.println("setEliminarAsignacionAuxiliarMateria");
        Asignaciones asignacion = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setEliminarAsignacionAuxiliarMateria(asignacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstBuscarEstudianteNombresMatriculados method, of class MiImpl.
     */
    @Test
    public void testGetEstBuscarEstudianteNombresMatriculados() {
        System.out.println("getEstBuscarEstudianteNombresMatriculados");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        Estudiantes expResult = null;
        Estudiantes result = instance.getEstBuscarEstudianteNombresMatriculados(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstBuscarEstudianteAdmitidoAuxiliar method, of class MiImpl.
     */
    @Test
    public void testGetEstBuscarEstudianteAdmitidoAuxiliar() {
        System.out.println("getEstBuscarEstudianteAdmitidoAuxiliar");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        Estudiantes expResult = null;
        Estudiantes result = instance.getEstBuscarEstudianteAdmitidoAuxiliar(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrarAdmisionEstudianteAuxiliar method, of class MiImpl.
     */
    @Test
    public void testSetRegistrarAdmisionEstudianteAuxiliar() {
        System.out.println("setRegistrarAdmisionEstudianteAuxiliar");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setRegistrarAdmisionEstudianteAuxiliar(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEliminarAdmisionEstudianteAuxiliar method, of class MiImpl.
     */
    @Test
    public void testSetEliminarAdmisionEstudianteAuxiliar() {
        System.out.println("setEliminarAdmisionEstudianteAuxiliar");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setEliminarAdmisionEstudianteAuxiliar(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarEstudianteAuxiliar method, of class MiImpl.
     */
    @Test
    public void testGetBuscarEstudianteAuxiliar() {
        System.out.println("getBuscarEstudianteAuxiliar");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getBuscarEstudianteAuxiliar(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarEstudianteAuxiliarTodas method, of class MiImpl.
     */
    @Test
    public void testGetBuscarEstudianteAuxiliarTodas() {
        System.out.println("getBuscarEstudianteAuxiliarTodas");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getBuscarEstudianteAuxiliarTodas(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarEstudiantesAuxiliaresPorPrograma method, of class MiImpl.
     */
    @Test
    public void testGetListarEstudiantesAuxiliaresPorPrograma() {
        System.out.println("getListarEstudiantesAuxiliaresPorPrograma");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarEstudiantesAuxiliaresPorPrograma(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarEstudiantesAuxiliaresPorPrograma method, of class MiImpl.
     */
    @Test
    public void testGetBuscarEstudiantesAuxiliaresPorPrograma() {
        System.out.println("getBuscarEstudiantesAuxiliaresPorPrograma");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getBuscarEstudiantesAuxiliaresPorPrograma(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrListarProcesos method, of class MiImpl.
     */
    @Test
    public void testGetTrListarProcesos() {
        System.out.println("getTrListarProcesos");
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getTrListarProcesos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstListarNotasRectificadasEstudiante method, of class MiImpl.
     */
    @Test
    public void testGetEstListarNotasRectificadasEstudiante() {
        System.out.println("getEstListarNotasRectificadasEstudiante");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getEstListarNotasRectificadasEstudiante(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscarEstudiantePersona method, of class MiImpl.
     */
    @Test
    public void testGetBuscarEstudiantePersona() {
        System.out.println("getBuscarEstudiantePersona");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getBuscarEstudiantePersona(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCursoPsicoEst method, of class MiImpl.
     */
    @Test
    public void testGetListarCursoPsicoEst() {
        System.out.println("getListarCursoPsicoEst");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCursoPsicoEst(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCursoPsicoOtros method, of class MiImpl.
     */
    @Test
    public void testGetListarCursoPsicoOtros() {
        System.out.println("getListarCursoPsicoOtros");
        Personas persona = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCursoPsicoOtros(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarCursoSemioEst method, of class MiImpl.
     */
    @Test
    public void testGetListarCursoSemioEst() {
        System.out.println("getListarCursoSemioEst");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getListarCursoSemioEst(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getlistarMiembrosT method, of class MiImpl.
     */
    @Test
    public void testGetlistarMiembrosT() {
        System.out.println("getlistarMiembrosT");
        Estudiantes estudiante = null;
        MiImpl instance = new MiImpl();
        List expResult = null;
        List result = instance.getlistarMiembrosT(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBuscarCalendarioAcademicoPrograma method, of class MiImpl.
     */
    @Test
    public void testSetBuscarCalendarioAcademicoPrograma() {
        System.out.println("setBuscarCalendarioAcademicoPrograma");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setBuscarCalendarioAcademicoPrograma(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBuscarProgramacionAutorizacion method, of class MiImpl.
     */
    @Test
    public void testSetBuscarProgramacionAutorizacion() {
        System.out.println("setBuscarProgramacionAutorizacion");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setBuscarProgramacionAutorizacion(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCambioEstadoProgramacionAutorizacion method, of class MiImpl.
     */
    @Test
    public void testSetCambioEstadoProgramacionAutorizacion() {
        System.out.println("setCambioEstadoProgramacionAutorizacion");
        Libretas libreta = null;
        MiImpl instance = new MiImpl();
        int expResult = 0;
        int result = instance.setCambioEstadoProgramacionAutorizacion(libreta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
