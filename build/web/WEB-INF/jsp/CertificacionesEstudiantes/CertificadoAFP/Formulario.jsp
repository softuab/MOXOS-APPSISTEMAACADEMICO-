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
                                    CERTIFICADO DE INSCRIPCION
                                </div>
                            </div>
                            <hr>
                            <div class="row">
                                <div class="col-xs-12 center bold">
                                    El Suscrito Responsable de Admisiones y Registros
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-xs-12 left bold">
                                    <h2>CERTIFICA QUE:</h2>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-xs-4 left bold">
                                    Registro Universitario:
                                </div>
                                <div class="col-xs-8 left upper">
                                    <c:out value="${estudiante.id_estudiante}"/>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-xs-4 left bold">
                                    Carnet de Identidad: 
                                </div>
                                <div class="col-xs-8 left upper">
                                    <c:out value="${estudiante.dip}"/>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-xs-4 left bold">
                                    Nombres:
                                </div>
                                <div class="col-xs-8 left upper">
                                    <c:out value="${estudiante.nombre_completo}"/>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-xs-4 left bold">
                                    Facultad:
                                </div>
                                <div class="col-xs-8 left upper">
                                    <c:out value="${estudiante.facultad}"/>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-xs-4 left bold">
                                    Carrera:
                                </div>
                                <div class="col-xs-8 left upper">
                                    <c:out value="${estudiante.programa}"/>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-xs-4 left bold">
                                    Tipo de sistema:
                                </div>
                                <div class="col-xs-8 left upper">
                                    <c:out value="${estudiante.tipo_materia}"/>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-xs-4 left bold">
                                    Ubicacion aula:
                                </div>
                                <div class="col-xs-8 left upper">
                                    <c:out value="${estudiante.sede_desconcentrada}"/>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-xs-4 left bold">
                                    Periodo Académico:
                                </div>
                                <div class="col-xs-8 left upper">
                                    <c:out value="${periodo}"/>/<c:out value="${gestion}"/>
                                </div>
                            </div> 
                            <div class="row">
                                <div class="col-xs-4 left bold">
                                    Inicio y Finalización del 
                                    periodo Académico según   
                                    <c:out value="${calendario.nro_resolucion}"/>:
                                </div>
                                <div class="col-xs-8 left upper">
                                    Del <c:out value="${inicio}"/> al <c:out value="${fin}"/>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-xs-4 left bold">
                                    Fecha de Impresión:
                                </div>
                                <div class="col-xs-8 left upper">
                                    <fmt:formatDate value="${now}" pattern="${formatoFecha}"/>
                                </div>
                            </div>
                            <br> 
                            <div class="row">
                                <div class="col-xs-12 right">
                                    Es todo cuanto certifico para fines consiguientes que convengan al interesado
                                </div>
                            </div>
                            <br> 
                            <br> 
                            <br> 
                            <div class="row">
                                <div class="col-xs-6 center bold">
                                    ..........................................<br>
                                    Sello y firma<br>
                                    Admisiones y Registros
                                </div>
                                <div class="col-xs-6 center bold">
                                    ..........................................<br>
                                    Sello y firma<br>
                                    Director Planificación Académica 
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
