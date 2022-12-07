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
                <td>
                    <form id="fvolver" name="fvolver" action="<c:url value="/entradaEstudiante/ProgramaSede.fautapo"/>" method="get">
                        <div> <a class="volver" href="javascript:enviarSolicitud('fvolver');"> Volver</a> </div>
                    </form>
                </td>
            </tr>
        </table>
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
                            <th  scope="RU">RU</th>
                            <th  scope="DIP">DIP</th>
                            <th  scope="NOMBRES">NOMBRES</th>
                            <th  scope="PROGRAMA">PROGRAMA</th> 
                            <th  scope="PLAN">PLAN</th>
                            <th  scope="REGISTRAR">REGISTRAR</th>
                            <th  scope="MODIFICAR">MODIFICAR</th>
                            <th  scope="ELIMINAR">ELIMINAR</th>
                            <th  scope="DETALLE">DETALLE</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="datos" items="${lEstudiantes}" varStatus="contador"> 
                            <tr class="filter">
                                <td><c:out value="${contador.count}"/></td>
                                <td><c:out value="${datos.id_estudiante}"/></td>
                                <td><c:out value="${datos.dip}"/></td>        
                                <td><c:out value="${datos.nombre_completo}"/></td>
                                <td><c:out value="${datos.programa}"/></td>
                                <td><c:out value="${datos.id_plan}"/></td>
                                <td>
                                    <form name=formaregistrar<c:out value="${contador.count}"/> method="POST" action='<c:url value="/entradaEstudiante/registarEstudiantesProgramaSede.fautapo"/>'>
                                        <input type="hidden" name="id_estudiante" value="<c:out value="${datos.id_estudiante}"/>"/>
                                        <input type="hidden" name="id_programa" value="<c:out value="${datos.id_programa}"/>"/>
                                    </form>
                                    <a class="agregar" href="javascript: document.formaregistrar<c:out value="${contador.count}"/>.submit()">Registrar</a>
                                </td>
                                <td>
                                    <form name=formamodificar<c:out value="${contador.count}"/> method="POST" action='<c:url value="/entradaEstudiante/ModificarEstudianteProgramaSede.fautapo"/>'>
                                        <input type="hidden" name="id_estudiante" value="<c:out value="${datos.id_estudiante}"/>"/>
                                        <input type="hidden" name="id_programa" value="<c:out value="${datos.id_programa}"/>"/>
                                        <input type="hidden" name="accion" value="Modificar"/>
                                    </form>
                                    <a class="modificar" href="javascript: document.formamodificar<c:out value="${contador.count}"/>.submit()">Modificar</a>
                                </td>
                                <td>
                                    <form name=formaeliminar<c:out value="${contador.count}"/> method="POST" action='<c:url value="/entradaEstudiante/ConfirmarBorradoProgramaSede.fautapo"/>'>
                                        <input type="hidden" name="id_estudiante" value="<c:out value="${datos.id_estudiante}"/>"/>
                                        <input type="hidden" name="id_programa" value="<c:out value="${datos.id_programa}"/>"/>
                                        <input type="hidden" name="accion" value="Eliminar"/>
                                    </form>
                                    <a class="eliminar" href="javascript: document.formaeliminar<c:out value="${contador.count}"/>.submit()">Eliminar</a>
                                </td>
                                <td>
                                    <form name=formadetalle<c:out value="${contador.count}"/> method="POST" action='<c:url value="/entradaEstudiante/DetalleEstudianteProgramaSede.fautapo"/>'>
                                        <input type="hidden" name="id_estudiante" value="<c:out value="${datos.id_estudiante}"/>"/>
                                        <input type="hidden" name="id_programa" value="<c:out value="${datos.id_programa}"/>"/>
                                    </form>
                                    <a class="modificar" href="javascript: document.formadetalle<c:out value="${contador.count}"/>.submit()">Ver</a>
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
