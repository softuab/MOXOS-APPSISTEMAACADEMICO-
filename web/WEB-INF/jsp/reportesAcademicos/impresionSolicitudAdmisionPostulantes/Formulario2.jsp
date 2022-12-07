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
                                        <span class="span-subtitle">DEPARTAMENTO DE ADMISION Y REGISTRO</span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="qr-document">
                        <img class="logoqr" src="data:image/png;base64,${qr}" alt="" /> 
                    </div>
                    <div class="content-report">
                        <div class="container-grid border">
                            <div class="row">
                                <div class="col-xs-12 right bold">
                                    FORM: DPA 003-1
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-xs-12 center bold">
                                    SOLICITUD DE ADMISIÓN ESPECIAL EXCELENCIA DE BACHILLER
                                </div>
                            </div> 
                            <div class="row">
                                <div class="col-xs-12 right">
                                    <br>
                                    <strong>Fecha</strong>  <fmt:formatDate value="${now}" pattern="${formatoFecha}"/>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-xs-12 justify">
                                    <p>Yo, <strong><c:out value="${datosPostulante.nombres}" /> <c:out value="${datosPostulante.paterno}" /> <c:out value="${datosPostulante.materno}" /></strong>, hábil por derecho con C.I.
                                        N° <strong><c:out value="${datosPostulante.dip}" /></strong> Ante su autoridad digo:<br>
                                        Que estando comprendido en el artículo N°13 del Reglamento Estudiantil de la
                                        Universidad Boliviana y de acuerdo al articulo 13 del Reglamento de Admisión vigente
                                        en la Universidad Autónoma del Beni “José Ballivián”. Solicito autorice mi
                                        incorporación en la presente gestión en la Carrera
                                        de <strong><c:out value="${datosPostulante.programa}" /></strong>
                                        dependiente de esta
                                        Casa Superior de Estudios.
                                    </p>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-xs-12 center">
                                    <br><br><br>
                                    ......................................................<br>
                                    Firma del Interesado<br><br>
                                </div>
                            </div>
                            <hr class="hr">
                            <div class="row">
                                <div class="col-xs-12 right bold">
                                    FORM: DPA 003-2
                                </div>
                            </div>
                            <br>
                            <div class="row">
                                <div class="col-xs-12 center bold">
                                    AUTORIZACIÓN DE ADMISIÓN ESPECIAL
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-xs-12 justify">
                                    <p>Al cumplir con las precisiones del Reglamento de Admisión Especial, la Dirección de
                                        Planificación Académica de la Universidad Autónoma del Beni “José Ballivián”,
                                        autoriza al (a la)
                                        Sr. (a)<br>
                                        <strong><c:out value="${datosPostulante.nombres}" /> <c:out value="${datosPostulante.paterno}" /> <c:out value="${datosPostulante.materno}" /></strong>
                                        Su Admisión Especial en la Carrera de:
                                        <strong><c:out value="${datosPostulante.programa}" /></strong>
                                        Facultad de
                                        <strong><c:out value="${datosPostulante.facultad}" /></strong>
                                        En el periodo académico <strong><c:out value="${datosPostulante.periodo}"/>/<c:out value="${datosPostulante.gestion}"/></strong> cuya modalidad de Admisión es
                                        <strong style="text-transform: uppercase;">ADMISION ESPECIAL - EXCELENCIA BACHILLER</strong> con un promedio de…….. puntos.
                                    </p>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-xs-12 right">
                                    <br>
                                    Trinidad,..................... de.................................... del año.......................<br>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-xs-12 right">
                                    <br><br><br> 
                                    VoBo. Dirección de Planificación Académica<br><br>
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