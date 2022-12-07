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
        <c:if test="${empty titulo}">
            <div class="titulo">Administrar Estudiante Antiguo  Documentos</div>
        </c:if>
        <c:if test="${!empty titulo}">
            <div class="titulo"><c:out value="${titulo}"/></div>
        </c:if> 
        <br>
        <table>
            <tr>
                <td>
                    <form id="fvolver" name="fvolver" action="<c:url value='/estudianteAntiguoDocumentos/entrada.fautapo'/>" method="post">
                        <input type="hidden" name="id_proceso" value="<c:out value='${id_proceso}'/>">
                        <input type="hidden" name="id_tramite" value="<c:out value='${id_tramite}'/>">
                        <input type="hidden" name="titulo"     value="<c:out value='${titulo}'/>">
                        <input type="hidden" name="gestion"    value="<c:out value='${gestion}'/>">
                        <input type="hidden" name="periodo"    value="<c:out value='${periodo}'/>">
                        <input type="hidden" name="dip"        value="<c:out value='${dip}'/>">
                        <input type="hidden" name="nombre"     value="<c:out value='${nombre}'/>">
                        <div> <a class="volver" href="javascript:enviarSolicitud('fvolver');"> Volver</a> </div>
                    </form>
                </td>
            </tr>
        </table> 
        <br>
        <div class="container">
            <div class="search-content">
                <input type="text" onkeyup="filter(this, 'table')" id="search" class="search"  placeholder="Buscar por nombres.." title="Type in a name"> 
            </div>
            <div class="table-content">
                <table class="table" id="table" aria-describedby="lista de postulantes">
                    <thead> 
                        <tr>
                            <th scope="informacion"  colspan="8">INFORMACION ENCONTRADA</th> 
                        </tr> 
                        <tr>
                            <th  scope="1er. Apellido" >1er. Apellido</th>
                            <th  scope="2do. Apellido">2do. Apellido</th>
                            <th  scope="Nombres">Nombres</th>
                            <th  scope="CEEdula de Identidad">C&eacute;dula de Identidad</th>
                            <th  scope="Programa (Carrera)">Programa (Carrera)</th>
                            <th  scope="Estado">Estado<br>de Estudiante</th>
                            <th  scope="Registrar Datos">Registrar Datos</th>
                        </tr> 
                    </thead>
                    <tbody>
                        <c:if test="${!empty datosEstudiante}"> 
                            <tr>
                                <td><c:out value="${datosEstudiante.paterno}"/></td>
                                <td><c:out value="${datosEstudiante.materno}"/></td>
                                <td><c:out value="${datosEstudiante.nombres}"/></td>
                                <td><c:out value="${datosEstudiante.dip}"/></td>
                                <td><c:out value="${datosEstudiante.programa}"/></td>
                                <td><c:if test="${datosEstudiante.id_estado !='A'}"><c:out value="${datosEstudiante.estado}"/></c:if> <c:if test="${datosEstudiante.id_estado =='A'}"><c:out value="${datosEstudiante.estado}"/> </c:if></td>
                                    <td>
                                            <form id="fnuevo<c:out value='${contador.count}'/>" name="fnuevo<c:out value='${contador.count}'/>" action="<c:url value='/estudianteAntiguoDocumentos/modificarEstudiante.fautapo'/>" method="post">
                                        <input type="hidden" name="id_proceso" value="<c:out value='${id_proceso}'/>">
                                        <input type="hidden" name="id_tramite" value="<c:out value='${id_tramite}'/>">
                                        <input type="hidden" name="titulo" value="<c:out value='${titulo}'/>">
                                        <input type="hidden" name="id_estudiante" value="<c:out value='${datosEstudiante.id_estudiante}'/>">
                                        <div> <a class="agregar" href="javascript:enviarSolicitud('fnuevo<c:out value='${contador.count}'/>');"> Ver Datos</a> </div>
                                    </form>
                                </td>
                            </tr>
                        </c:if>
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
