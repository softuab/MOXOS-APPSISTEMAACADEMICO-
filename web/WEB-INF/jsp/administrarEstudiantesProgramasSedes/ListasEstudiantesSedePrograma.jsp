<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<jsp:useBean id="now" class="java.util.Date"/>  
<!DOCTYPE html>
<html lang="es">
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="<c:url value='/pagina.css'/>" type="text/css">
        <link rel="stylesheet" href="<c:url value='/basico.css'/>" type="text/css">
        <link rel="stylesheet" href="<c:url value='/principal.css'/>" type="text/css">
        <link rel="stylesheet" href="<c:url value='/css/font-awesome.min.css'/>" type="text/css"> 
        <link href="imagenes\principal\aureliox.ico" rel="shortcut icon" type="image/x-icon">
        <META HTTP-EQUIV="Cache-Control" CONTENT="max-age='0'" />
        <META HTTP-EQUIV="Cache-Control" CONTENT="no-cache" />
        <META http-equiv="expires" content="0" />
        <META HTTP-EQUIV="Expires" CONTENT="Tue, 01 Jan 1980 1:00:00 GMT" />
        <META HTTP-EQUIV="Pragma" CONTENT="no-cache" />
        <title>Moxos - Academico</title>
    </head>
    <body>
        <div class="titulo">Buscar Estudiantes</div> 
        <br>
        <table>
            <tr>
                <th colspan="2"></th>
            </tr>
            <tr>
                <td>
                    <form id="fvolver" name="fvolver" action="<c:url value="/entradaEstudiante/ProgramaSede.fautapo"/>" method="get">
                        <div> <a class="volver" href="javascript:enviarSolicitud('fvolver');"> Volver</a> </div>
                    </form>
                </td>
                <td>
                    <form id="fnuevo" name="fnuevo" action="<c:url value='/entradaEstudiante/registarEstudiantesProgramaSede.fautapo'/>">
                        <div><a class="agregar" href="javascript:enviarSolicitud('fnuevo');">Nuevo</a>
                            <input type="hidden" name="accion" value="Nuevo">
                            <input type="hidden" name="id_estudiante" value="<c:out value="${id_estudiante}"/>"/>
                            <input type="hidden" name="id_programa" value="<c:out value="${datosEstudiantes.id_programa}"/>"/>
                        </div>
                    </form>
                </td>
            </tr>  
        </table>
        <table class="tabla">
            <tr>
                <th>RU</th>
                <th>ESTUDIANTE</th>
                <th>PROGRAMA</th>
            </tr>
            <tr>
                <td><c:out value="${datosEstudiantes.id_estudiante}"/></td>
                <td>
                    <c:out value="${datosPersona.nombres}"/> &nbsp; 
                    <c:out value="${datosPersona.paterno}"/> &nbsp;
                    <c:out value="${datosPersona.materno}"/>
                </td>
                <td><c:out value="${datosPrograma.programa}"/>
            </tr>
        </table>
        <br>
        <div class="container">
            <div class="search-content">
                <input type="text" onkeyup="filter(this, 'table')" id="search" class="search"  placeholder="Buscar por nombres.." title="Type in a name"> 
            </div>
            <div class="table-content">
                <table class="table" id="table" aria-describedby="lista de estudiantes">
                    <thead>
                        <tr>
                            <th scope="informacion" colspan="11">INFORMACION ENCONTRADA EN ESTUDIANTES</th>
                        </tr>
                        <tr>
                            <th  scope="Nro">Nro.</th>
                            <th  scope="Sede"> SEDE DESCONCENTRADA</th>
                            <th scope="nota">NOTA</th>
                            <th scope="Modificar">MODIFICAR</th>
                            <th scope="eliminar">ELIMINAR</th>
                            <th scope="imprimir">IMPRIMIR</th> 
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="datos" items="${lProgramasDesconcentradosVer}" varStatus="contador">
                            <tr class="filter">
                                <td><c:out value="${contador.count}"/></td>
                                <td><c:out value="${datos.sede_desconcentrada}"/></td>
                                <td><c:out value="${datos.nota}"/></td>        
                                <td>
                                    <c:if test="${!datos.estadoSede}">
                                        <form id="formamodificar<c:out value="${contador.count}"/>" name=formamodificar<c:out value="${contador.count}"/> method="POST" action='<c:url value="/entradaEstudiante/ModificarEstudianteProgramaSede.fautapo"/>'>
                                            <input type="hidden" name="id_estudiante" value="<c:out value="${datosEstudiantes.id_estudiante}"/>"/>
                                            <input type="hidden" name="id_programa" value="<c:out value="${datosEstudiantes.id_programa}"/>"/>
                                            <input type="hidden" name="id_estudiante_programa_sede" value="<c:out value="${datos.id_estudiante_programa_sede}"/>"/>
                                            <input type="hidden" name="accion" value="Modificar"/>
                                        </form>
                                        <a class="modificar" href="javascript:enviarSolicitud('formamodificar<c:out value="${contador.count}"/>');">Modificar</a>
                                    </c:if>
                                </td>
                                <td>
                                    <c:if test="${!datos.estadoSede}">
                                        <form id="formaeliminar<c:out value="${contador.count}"/>" name=formaeliminar<c:out value="${contador.count}"/> method="POST" action='<c:url value="/entradaEstudiante/ConfirmarBorradoProgramaSede.fautapo"/>'>
                                            <input type="hidden" name="id_estudiante" value="<c:out value="${datosEstudiantes.id_estudiante}"/>"/>
                                            <input type="hidden" name="id_programa" value="<c:out value="${datosEstudiantes.id_programa}"/>"/>
                                            <input type="hidden" name="id_estudiante_programa_sede" value="<c:out value="${datos.id_estudiante_programa_sede}"/>"/>
                                            <input type="hidden" name="accion" value="Eliminar"/>
                                        </form>
                                        <a class="eliminar" href="javascript:enviarSolicitud('formaeliminar<c:out value="${contador.count}"/>')">Eliminar</a>
                                    </c:if>
                                </td>
                                <td>
                                    <form id="formadetalle<c:out value="${contador.count}"/>" name=formadetalle<c:out value="${contador.count}"/> method="POST" action='<c:url value="/entradaEstudiante/DetalleEstudianteProgramaSede.fautapo"/>'>
                                        <input type="hidden" name="id_estudiante" value="<c:out value="${datosEstudiantes.id_estudiante}"/>"/>
                                        <input type="hidden" name="id_programa" value="<c:out value="${datosEstudiantes.id_programa}"/>"/>
                                        <input type="hidden" name="id_estudiante_programa_sede" value="<c:out value="${datos.id_estudiante_programa_sede}"/>"/>
                                        <input type="hidden" name="id_desconcentrado" value="<c:out value="${datos.id_desconcentrado}"/>">
                                    </form>
                                    <a class="modificar" href="javascript:enviarSolicitud('formadetalle<c:out value="${contador.count}"/>')">Imprimir</a>
                                </td>
                            </tr> 
                        </c:forEach> 
                    </tbody>
                </table>
            </div>
        </div>       
        <div id="loader" class="modal"> 
            <div class="modal-content"> 
                <span class="loader"></span>
                <span>Enviando solicitud...</span>
            </div>
        </div> 
        <script type="text/javascript" src="<c:url value='/js/funciones.js'/>"></script>
        <script type="text/javascript" src="<c:url value='/js/herramientas.js'/>"></script>
        <script type="text/javascript" src="<c:url value='/js/ajax.js'/>"></script>
        <script type="text/javascript" src="<c:url value='/js/sistema/operaciones.js'/>"></script> 
        <script src="<c:url value='/js/main.js'/>" type="text/javascript"></script> 
        <script>
                    var modal = document.getElementById("loader");
                    const enviarSolicitud = (formulario) => {
                        modal.style.display = "block";
                        document.getElementById(formulario).submit();
                    }
        </script>
    </body>
</html>
