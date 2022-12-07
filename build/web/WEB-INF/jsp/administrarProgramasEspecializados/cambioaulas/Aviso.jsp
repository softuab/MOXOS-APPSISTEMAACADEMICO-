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
        <title>Moxos - Academico</title>
    </head>
    <body>
        <div class="container center-group">
            <br>
            <br>
            <br>
            <br>
            <div class="item">
                <div class='cuadroAviso'>
                    <div class="titulo center"><span class="blink">¡Aviso!</span></div>
                    <div class="center">
                        <c:out value="${mensaje}"/>
                        <br>
                        <br> 
                        <a class="volver" href="<c:url value="/estudiante/cambioaula/buscarEstudianteEntrada.fautapo"/>">Volver</a>
                    </div>
                </div>  
            </div>
        </div>
    </body>
</html>
