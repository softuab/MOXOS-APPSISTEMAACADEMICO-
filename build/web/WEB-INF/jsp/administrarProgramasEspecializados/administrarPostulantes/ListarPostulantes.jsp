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
        <title>Moxos - academico</title>
    </head>
    <body> 
        <c:if test="${empty titulo}">
            <div class="titulo">Registrar Nuevo Postulantes</div>
        </c:if>
        <c:if test="${!empty titulo}">
            <div class="titulo"><c:out value="${titulo}"/></div>
        </c:if>

        <br>
        <table>
            <thead><th colspan="2"></th></thead>
        <tbody>
            <tr>
                <td>
                    <form id="fvolver" name="fvolver" action="<c:url value='/postulantes/entrada.fautapo'/>" method="post">
                        <input type="hidden" name="id_proceso" value="<c:out value='${id_proceso}'/>">
                        <input type="hidden" name="id_tramite" value="<c:out value='${id_tramite}'/>">
                        <input type="hidden" name="titulo" value="<c:out value='${titulo}'/>">
                        <div> <a class="volver" href="javascript:enviarSolicitud('fvolver');"> Volver</a> </div>
                    </form> 
                </td>
                <td>
                    <form name="fnuevo" id="fnuevo" action="<c:url value='/postulantes/nuevoPostulante.fautapo'/>" method="post">
                        <input type="hidden" name="id_proceso" value="<c:out value='${id_proceso}'/>">
                        <input type="hidden" name="id_tramite" value="<c:out value='${id_tramite}'/>">
                        <input type="hidden" name="titulo" value="<c:out value='${titulo}'/>">
                        <div> <a class="agregar" href="javascript:enviarSolicitud('fnuevo');"> Nuevo</a> </div>
                    </form>
                </td>
            </tr>
        </tbody>
    </table>
    <div class="centro">
        <table class="table-1">
            <thead>
                <tr>
                    <th scope="resultado" colspan="6">RESULTADO DE LA BUSQUEDA</th>
                </tr> 
                <tr>
                    <th scope="Programa">Programa</th>
                    <th scope="Admision">Tipo Admisi&oacute;n</th>
                    <th scope="Gestion">Gesti&oacute;n</th>
                    <th scope="Periodo">Periodo</th>
                    <th scope="Situacion">Situaci&oacute;n</th> 
                    <th></th>
                <tr> 
            </thead>
            <tbody>
                <c:forEach var="lista" items="${lPstPersonas}" varStatus="contador">
                    <tr> 
                        <td class="sub-title" colspan="5"> <c:out value="${contador.count}"/>.- <c:out value="${lista.dip}"/> - <c:out value="${lista.nombreCompleto}"/> 
                        <td class="sub-title">
                            <form id="fregistra<c:out value='${contador.count}'/>" name="fregistra<c:out value='${contador.count}'/>" action="<c:url value='/postulantes/nuevoPrsPostulante.fautapo'/>" method="post">
                                <input type="hidden" name="id_proceso" value="<c:out value='${id_proceso}'/>">
                                <input type="hidden" name="id_tramite" value="<c:out value='${id_tramite}'/>">
                                <input type="hidden" name="titulo" value="<c:out value='${titulo}'/>">
                                <input type="hidden" name="id_persona" value="<c:out value='${lista.idPersona}'/>">
                                <div> <a class="agregar" href="javascript:enviarSolicitud('fregistra<c:out value='${contador.count}'/>');"> Registrar</a> </div>
                            </form>
                        </td>
                    </tr>
                    <c:if test="${!empty lista.detalle}">
                        <c:forEach var="lPst" items="${lista.detalle}" varStatus="contadorA">
                            <tr>
                                <td><c:out value="${lPst.programa}"/></td>
                                <td><c:out value="${lPst.tipoAdmision}"/></td>
                                <td><c:out value="${lPst.gestion}"/></td>
                                <td><c:out value="${lPst.periodo}"/></td>
                                <td>
                                    <c:if test="${lPst.idEstado != 'X'}"> 
                                        <c:if test="${lPst.idEstado == 'P'}"><span style="color: red;"> Postulante </span> </c:if>
                                        <c:if test="${lPst.idEstado == 'R'}"><span style="color: blue;"> Registrado </span> </c:if>
                                        <c:if test="${lPst.idEstado == 'B'}"><span style="color: black;"> Bloqueado </span> </c:if>
                                        <c:if test="${lPst.idEstado == 'A'}"> <span style="color: red;"> Habilitado </span></c:if>
                                        <c:if test="${lPst.idEstado == 'E'}"> <span style="color: red;">Inscrito Estudiante </span> </c:if>
                                    </c:if>
                                </td>
                            </tr>
                        </c:forEach>
                    </c:if>
                </c:forEach>
            </tbody>
        </table>
    </div>
    <div id="loader" class="modal"> 
        <div class="modal-content"> 
            <span class="loader"></span>
            <span>Enviando solicitud...</span>
        </div>
    </div> 
    <script>
        var modal = document.getElementById("loader");
        const enviarSolicitud = (name) => {
            modal.style.display = "block";
            document.getElementById(name).submit();
        }
    </script>
</body>
</html>
