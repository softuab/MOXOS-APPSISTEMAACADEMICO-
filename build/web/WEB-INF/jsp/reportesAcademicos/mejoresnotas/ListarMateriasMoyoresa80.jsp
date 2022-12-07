<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page isELIgnored="false" %>
<jsp:useBean id="now" class="java.util.Date" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0//EN">
<html>
    <head>
        <title>Sistema Integrado - Moxos</title> 
        <link rel="stylesheet" href="<c:url value='/pagina.css'/>" type="text/css">
        <link rel="stylesheet" href="<c:url value='/basico.css'/>" type="text/css">
        <link rel="stylesheet" href="<c:url value='/principal.css'/>" type="text/css">
        <link href="imagenes\principal\aureliox.ico" rel="shortcut icon" type="image/x-icon">
        <script type="text/javascript" src="<c:url value='/js/funciones.js'/>"></script>
        <script type="text/javascript" src="<c:url value='/js/herramientas.js'/>"></script>
        <script type="text/javascript" src="<c:url value='/js/ajax.js'/>"></script> 
        <META HTTP-EQUIV="Cache-Control" CONTENT="max-age='0'" />
        <META HTTP-EQUIV="Cache-Control" CONTENT="no-cache" />
        <META http-equiv="expires" content="0" />
        <META HTTP-EQUIV="Expires" CONTENT="Tue, 01 Jan 1980 1:00:00 GMT" />
        <META HTTP-EQUIV="Pragma" CONTENT="no-cache" />
    </head>

    <body>

        <table border="0" width="100%">
            <!-- SE REPITE-->
            <thead>
                <tr>
                    <td width="100%" align="center" cellspancin="0" cellpading="0">
                        <table width="100%">
                            <tr>
                                <td width="14%" align="center">
                                    <img src="<c:url value='/imagenes/logo/logo.png'/>" border="0" ALT="logo institucion" width="40%">
                                </td>
                                <td width="72%" align="center">
                                    <table width="100%" heigth="100%" cellpading="2" cellspacing="0" >
                                        <tr>
                                            <td align="center"><h1><b><c:out value='${datosInstitucion.institucion}'/></h1></td>
                                        <tr>
                                        <tr>
                                            <td align="center"><font size="3"><b><c:out value='${datosInstitucionsede.localidad}'/> - <c:out value='${datosInstitucionsede.departamento}'/> - <c:out value='${datosInstitucionsede.pais}'/></b></font></td>
                            <tr>
                            </tr>
                            <td align="center"><c:out value='${datosInstitucion.actividad}'/></td>
                </tr>
        </table>
    </td>
<td width="14%">
    Fecha : <a href='javascript: window.print()'><fmt:formatDate value="${now}" pattern="${formatoFecha}"/></a> 
</td>
</tr>
</table>
<hr>
<table width="100%" align="center">
    <tr>
        <td align="center"><label><h1>ESTUDIANTE CON EL PROMEDIO MAYOR A 80 SIN MODALIDAD</h1></label></td>
    </tr>
</table>
<table border="0">
    <tr>
        <td>PERIODO ::</td>
        <td><c:out value="${periodo}"/> - <c:out value="${gestion}"/></td>
    </tr>
</table>
<br>
</td>
</tr>
</thead>
<!-- HASTA AQUI SE REPITE-->
<tr>
    <td>
        <table class="tabla" border="1" width="97%">
            <tr>
                <th>Nro</th>
                <th>Facultad</th>
                <th>Programa</th>
                <th>Plan</th>
                <th>Cantidad de Años</th>
                <th>Gestion de ingreso</th>
                <th>Años de salida</th>
                <th>Tiene Materias Reprobadas</th>
                <th>R.U.</th>
                <th>Nombre Estudiante</th>
                <th>Promedio</th>
            </tr>	
            <c:set var="total" value="0"/>
            <c:forEach var="lestudiante" items="${lnotas}" varStatus="contador">
                <tr>          
                    <td><c:out value="${contador.count}"/></td>   
                    <td><c:out value="${lestudiante.facultad}"/></td>		  
                    <td><c:out value="${lestudiante.programa}"/></td>
                    <td><c:out value="${lestudiante.id_plan}"/></td>
                    <td><c:out value="${lestudiante.anios}"/></td>
                    <td><c:out value="${lestudiante.gestion}"/></td>
                    <td><c:out value="${lestudiante.total_anios}"/></td>
                    <c:if test="${lestudiante.cantidadreprobado>0}"><td>SI</td></c:if> 
                    <c:if test="${lestudiante.cantidadreprobado==0}"><td>NO</td></c:if> 
                    <td><c:out value="${lestudiante.id_estudiante}"/></td>
                    <td><c:out value="${lestudiante.nombre_completo}"/></td>
                    <td><c:out value="${lestudiante.promedionota}"/></td>
                    <c:set var="total" value="${contador.count}"/>
                    <c:set var="cont" value="1"/> 
                </tr>   	
            </c:forEach>  
            <tr>
                <td class="colb" colspan="10">
                    TOTAL ESTUDIANTES:
                </td>
                <td class="colb">
                    <c:out value="${total}"/> Estudiantes
                </td>
            </tr>  
        </table> 
    </body>
</html>