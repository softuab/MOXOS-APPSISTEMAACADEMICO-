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
                        <img class="logoqr" src="${qr}" alt="" /> 
                    </div>
                    <div class="content-report">
                        <div class="container-grid">
                            <br>
                            <div class="row">
                                <div class="col-xs-12 center bold">
                                    SOLICITUD DE PR&Oacute;RROGA<br>
                                    EN LA PRESENTACI&Oacute;N DE DOCUMENTACI&Oacute;N
                                </div>
                            </div>
                            <hr>
                            <div class="row">
                                <div class="col-xs-12 justify">
                                    <p>Se&ntilde;or Director:</p>
                                    <p>
                                        Yo, <strong><c:out value="${estudiante.paterno}"/> <c:out value="${estudiante.materno}"/> </strong> <c:out value="${estudiante.nombres}"/> con R.U. <strong> <c:out value="${estudiante.id_estudiante}"/></strong>
                                    </p>
                                    <p>
                                        Solicito acogerme a la prórroga en la presentación del documento de:
                                        <strong><c:out value="${compromiso.tipo_documento}"/></strong>, esta solicitud la realizo por las siguientes causas que motivaron la demora en la presentación del documento son:
                                    </p>
                                    <ul><li><b><c:out value="${compromiso.tipo_compromiso}"/></b></li></ul>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-xs-12 left">
                                    Bolivia - Trinidad, <fmt:formatDate value="${now}" type="date" dateStyle="long"/><br>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-xs-12 right">
                                    ..........................................<br> 
                                    FIRMA DEL INTERESADO
                                </div>
                            </div>
                            <hr>
                            <div class="row">
                                <div class="col-xs-12 center bold">
                                    COMPROMISO DE PRESENTACIÓN DE DOCUMENTACIÓN
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-xs-12 justify">
                                    <p>
                                        Yo, <c:out value="${estudiante.paterno}"/> <c:out value="${estudiante.materno}"/> <c:out value="${estudiante.nombres}"/>, con C.I. Nº <strong><c:out value="${estudiante.dip}"/></strong>.	
                                        Firmo el Compromiso de Presentación del documento de:
                                        <strong><c:out value="${compromiso.tipo_documento}"/></strong>,  antes del  	
                                        <strong><c:out value="${compromiso.fec_vencimiento}"/></strong>, en el Departamento de Admisiones y Registros de la U.A.B. Si por algún motivo incumplo	
                                        con el plazo de entrega, el trámite iniciado quedará nulo.
                                    </p>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-xs-12 left">
                                    Bolivia - Trinidad, <fmt:formatDate value="${now}" type="date" dateStyle="long"/><br>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-xs-12 right">
                                    ..........................................
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
