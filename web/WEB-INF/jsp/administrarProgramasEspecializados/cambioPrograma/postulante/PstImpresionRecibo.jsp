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
                                        <span class="span-subtitle">DIRECCION DE PLANIFICACIÓN ACADEMICA</span><br>
                                        <span class="span-subtitle">DEPARTAMENTO DE ADMISIONES Y REGISTROS</span>
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
                                    CAMBIO DE PROGRAMA
                                </div>
                            </div>
                            <hr>
                            <div class="row">
                                <div class="col-xs-12 left">
                                    <strong>Postulante</strong>	  <c:out value="${postulante.nombres}"/> <c:out value="${postulante.paterno}"/> <c:out value="${postulante.materno}"/>	<strong>R.P.</strong>	<c:out value="${postulante.id_postulante}"/>
                                </div>
                            </div> 
                            <br> 
                            <br> 
                            <div class="row">
                                <div class="col-xs-12 left">
                                    <table border="1">
                                        <tr>
                                            <th class="th-title center" colspan="2"><h2>NUEVO REGISTRO</h2></th>
                                        </tr>
                                        <tr>
                                            <th>Anterior Programa</th>
                                            <td><c:out value="${programa_ant.programa}"/></td>
                                        </tr>
                                        <tr>
                                            <th>Programa Nuevo</th>
                                            <td><c:out value="${programa}"/></td>
                                        </tr>
                                    </table>
                                </div>
                            </div>  
                            <br> 
                            <br> 
                            <br> 
                            <br> 
                            <div class="row">
                                <div class="col-xs-12 right">
                                    <fmt:formatDate value="${now}" pattern="${formatoFecha} ${formatoHora}"/>
                                </div> 
                            </div>
                            <div class="row">
                                <div class="col-xs-12 center bold">
                                    ..........................................<br>
                                    Sello y firma<br>
                                    <c:out value="${usuario}"/>
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
