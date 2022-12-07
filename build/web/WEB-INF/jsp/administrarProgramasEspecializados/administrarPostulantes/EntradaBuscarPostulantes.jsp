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
            <div class="titulo">Administrar Postulantes</div>
        </c:if>
        <c:if test="${!empty titulo}">
            <div class="titulo"><c:out value="${titulo}"/></div>
        </c:if>
        <br>
        <form name="fvolver" action="<c:url value='/registrarTramiteNuevo.fautapo'/>" method="post">
            <div> <a class="volver" href="javascript:document.fvolver.submit();"> Volver</a> </div>
        </form>
        <br>
        <form id="forma" action="listarPostulantes.fautapo" method="post">
            <table class="formulario" aria-describedby="entrada ver datos">
                <thead>
                    <tr>
                        <th colspan="3"> BUSCAR POSTULANTE </th>
                    </tr> 
                </thead>
                <tbody>
                    <tr>
                        <td colspan="3">
                            <fieldset>
                                <legend>Buscar por</legend>
                                <div class="grid-fieldset">
                                    <label style="text-align: right"><strong>DIP ::</strong></label>
                                    <input type=text name="dip" onblur='validar(dip, "9")'>
                                    <input value='Buscar por carnet' type="Button" class="buscar" onClick="enviarSolicitud('forma')"> 
                                    <label style="text-align: right"><strong>Nombres ::</strong></label>
                                    <input type=text name="nombre" />
                                    <input value='Buscar por nombre' type="Button" class="buscar" onClick="enviarSolicitud('forma')">
                                </div>
                                <input type="hidden" name="id_proceso" value="<c:out value='${id_proceso}'/>">
                                <input type="hidden" name="id_tramite" value="<c:out value='${id_tramite}'/>">
                                <input type="hidden" name="titulo" value="<c:out value='${titulo}'/>">
                            </fieldset>
                        </td>
                    </tr>
                </tbody>
            </table>
        </form> 
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
