<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<jsp:useBean id="now" class="java.util.Date"/> 
<!DOCTYPE html>
<html lang="es">
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value='/css/impresion/style.css'/>" rel="stylesheet" type="text/css"/>
        <link href="<c:url value='/css/impresion/style2.css'/>" rel="stylesheet" type="text/css"/>
        <link href="<c:url value='/css/impresion/style3.css'/>" rel="stylesheet" type="text/css"/>
        <link href="<c:url value='/css/impresion/stylereport.css'/>" rel="stylesheet" type="text/css"/> 
        <link href="<c:url value='/css/grid.css'/>" rel="stylesheet" type="text/css"/>  
        <title>Moxos - Academico</title> 
    </head>

    <body>
        <div id="sidebar">
            <div id="outline">
            </div>
        </div>
        <div id="page-container">
            <div id="pf1" class="pf w0 h0" data-page-no="1">
                <div class="pc pc1 w0 h0">
                    <div class="marca-agua"></div>
                    <div class="escudo">
                        <img class="logo-escudo" src='<c:url value="/imagenes/logos/logominiatura.png"/>' alt="" /> 
                    </div>
                    <div class="c x3 y1 w3 h2">
                        <div class="container-grid">
                            <div class="row">
                                <div class="col-xs-12">
                                    <div class="h2-title">
                                        UNIVERSIDAD AUTONOMA DEL BENI "JOSE BALLIVIAN"<br>
                                        <span class="span-subtitle">DIRECCION DE PLANIFICACIÓN ACADEMICA</span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="qr-document">
                        <img class="logoqr" src="data:image/png;base64,${qr}" alt="" /> 
                    </div>
                    <div class="content-report">
                        <div class="container-grid">
                            <br>
                            <div class="row">
                                <div class="col-xs-12 center bold">
                                    CERTIFICADO DE HABILITACION
                                </div>
                            </div>
                            <hr>
                            <br>
                            <div class="row font-10">
                                <div class="col-xs-4 center">
                                    <c:out value="${datosPostulante.id_postulante}"/><br>
                                    ..................................................<br>
                                    Nº de Registro de Admisión
                                </div>
                                <div class="col-xs-4 center"> 
                                </div>
                                <div class="col-xs-4 center">

                                </div>
                            </div>
                            <br>
                            <div class="row font-10">
                                <div class="col-xs-4 center">
                                    <c:out value="${datosPostulante.paterno}"/><br>
                                    ..................................................<br>
                                    1er Apellido
                                </div>
                                <div class="col-xs-4 center">
                                    <c:out value="${datosPostulante.materno}"/><br>
                                    ..................................................<br>
                                    2do Apellido
                                </div>
                                <div class="col-xs-4 center">
                                    <c:out value="${datosPostulante.nombres}"/><br>
                                    ..................................................<br>
                                    Nombres
                                </div>
                            </div>
                            <br>
                            <div class="row font-10">
                                <div class="col-xs-4 center"> 
                                    <c:out value="${datosPostulante.dip}"/><br>
                                    ..................................................<br>
                                    C. I.
                                </div>
                                <div class="col-xs-4 center">
                                    <c:out value="${datosPostulante.facultad}"/><br>
                                    ..................................................<br>
                                    Facultad

                                </div>
                                <div class="col-xs-4 center">
                                    <c:out value="${datosPostulante.programa}"/><br>
                                    ..................................................<br>
                                    Carrera 
                                </div>
                            </div>
                            <br> 
                            <div class="row">
                                <div class="col-xs-12 center bold">
                                    <table style="border: 1px solid #ccc;">
                                        <thead>
                                            <tr>
                                                <th class="th-title center">
                                                    <h3>SOLICITUD DE ADMISIÓN</h3>
                                                </th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>
                                                    <table>
                                                        <tbody class="font-10 aling-top"> 
                                                            <tr>
                                                                <td class="left" style="width: 40%"><strong>Modalidad de Admisi&oacute;n::</strong>&nbsp; <c:out value="${datosPostulante.tipo_admision}"/></td>
                                                                <td class="left" style="width: 60%"><strong>Periodo ::</strong> <c:out value="${datosPostulante.periodo}"/>/<c:out value="${datosPostulante.gestion}"/> </td>
                                                            </tr>
                                                            <c:if test="${!empty lMateriasPlanTipoGrado}">
                                                                <tr>
                                                                    <td colspan="2">
                                                                        <table>
                                                                            <tr>
                                                                                <th>Nro</th>
                                                                                <th>Asignaturas Aprobadas</th>
                                                                            </tr>
                                                                            <c:forEach var="lista" items="${lMateriasPlanTipoGrado}" varStatus="contador">
                                                                                <tr>
                                                                                    <td><c:out value="${contador.count}"/></td>
                                                                                    <td><c:out value="${lista.materia}"/></td>
                                                                                </tr>
                                                                            </c:forEach>
                                                                        </table>
                                                                    </td>
                                                                </tr>
                                                            </c:if>
                                                            <tr>
                                                                <td class="left" colspan="2">En consecuencia queda Habilitado para tramitar su condici&oacute;n de alumno regular</td>
                                                            </tr>
                                                        </tbody>
                                                    </table>
                                                </td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <br>
                            <div class="row">
                                <div class="col-xs-12 center bold">
                                    ...............................................................<br>
                                    <strong>Firma</strong>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-xs-12  left font-10">
                                    <br>
                                    <br>
                                    <br>
                                    Trinidad, <fmt:formatDate value="${now}" pattern="EEEE"/>&nbsp; <fmt:formatDate value="${now}" pattern="dd"/> de <fmt:formatDate value="${now}" pattern="MMMM"/>  del <fmt:formatDate value="${now}" pattern="yyyy"/>
                                    <br>ADVERTENCIA: </b>Este documento queda nulo si en el hubiesen hecho raspaduras o enmiendas 
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="pi" data-data='{"ctm":[1.000000,0.000000,0.000000,1.000000,0.000000,0.000000]}'></div>
            </div>
        </div>
    </body> 
</html>