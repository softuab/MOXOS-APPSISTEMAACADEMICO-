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
        <link href="<c:url value='/css/impresion/stylereport.css'/>?v=23487990" rel="stylesheet" type="text/css"/> 
        <link href="<c:url value='/css/grid.css'/>" rel="stylesheet" type="text/css"/>  
        <title>Moxos - Academico</title> 
        <style>
            .center-table{
                width: 450px; 
                margin: 0 auto; 
            }
            @media print {
                .center-table{
                    width: 550pt; 
                    margin: 0 auto; 
                }
            }
        </style>
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
                    <div class="content-report">
                        <div class="container-grid">
                            <div class="row">
                                <div class="col-xs-1"><img class="logo-escudo" src='<c:url value="/imagenes/logos/logominiatura.png"/>' alt="" /> </div>
                                <div class="col-xs-10">
                                    <div class="h2-title">
                                        UNIVERSIDAD AUTONOMA DEL BENI "JOSE BALLIVIAN"<br>
                                        <span class="span-subtitle">DIRECCION DE PLANIFICACIÓN ACADEMICA</span><br>
                                        <span class="span-subtitle">DEPARTAMENTO DE ADMISION Y REGISTRO</span>
                                    </div>
                                </div>
                                <div class="col-xs-1 right">
                                    <img class="logoqr" src="${qr}" alt="" /> 
                                </div>
                            </div>
                        </div> 
                        <div class="container-grid">
                            <br>
                            <div class="row">
                                <div class="col-xs-12 center bold">
                                    CERTIFICADO DE INSCRIPCIÓN
                                </div>
                            </div>
                            <hr>
                            <div class="row">
                                <div class="col-xs-12 center bold">
                                    El Suscrito Responsable de Admision y Registro
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-xs-12">
                                    <div style="width: 100%" class="center-group">
                                        <table  class="center-table">
                                            <tr>
                                                <td colspan="2">
                                                    <h3>CERTIFICA QUE:</h3>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td><strong>Registro Universitario:</strong></td>
                                                <td><c:out value="${datosEst.id_estudiante}"/></td>
                                            </tr>
                                            <tr>
                                                <td><strong>Carnet de Identidad: </strong></td>
                                                <td><c:out value="${datosEst.dip}"/></td>
                                            </tr>
                                            <tr>
                                                <td><strong>Nombres:</strong></td>
                                                <td><c:out value="${datosEst.nombres}"/> <c:out value="${datosEst.paterno}"/> <c:out value="${datosEst.materno}"/></td>
                                            </tr>
                                            <tr>
                                                <td><strong>Facultad:</strong></td>
                                                <td><c:out value="${datosEst.facultad}"/></td>
                                            </tr>
                                            <tr>
                                                <td><strong>Carrera:</strong></td>
                                                <td><c:out value="${sCarreracortada}"/></td>
                                            </tr>
                                            <tr>
                                                <td><strong>Nivel:</strong></td>
                                                <td><c:out value="${datosGrados.grado_academico}"/></td>
                                            </tr>
                                            <tr>
                                                <td><strong>Fecha  de Registro a la U.A.B.:</strong></td>
                                                <td><fmt:formatDate value="${ingresoU.fec_ingreso}" pattern="${formatoFecha}"/></td>
                                            </tr>
                                            <tr>
                                                <td colspan="2"><br><strong>Por tanto es alumno inscrito en:</strong></td>
                                            </tr>
                                            <tr>
                                                <td><br><strong>Periodo Acad&eacute;mico:</strong></td>
                                                <td><br>
                                                    <c:if test="${id_periodo == 2}">
                                                        1   
                                                    </c:if>
                                                    <c:if test="${id_periodo == 1}">
                                                        <c:out value="${periodo}"/> 
                                                    </c:if>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td><strong>Gesti&oacute;n Acad&eacute;mica:</strong></td>
                                                <td><c:out value="${gestion}"/></td>
                                            </tr>
                                            <tr>
                                                <td><strong>Fecha de Impresión:</strong></td>
                                                <td><fmt:formatDate value="${now}" pattern="${formatoFecha}"/></td>
                                            </tr> 
                                        </table>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-xs-12 left">
                                    <br>Es todo cuanto certifico para fines consiguientes que convengan al interesado.
                                </div>
                            </div>
                            <br>
                            <br>
                            <br>
                            <br>
                            <br>
                            <br>                            
                            <br>
                            <div class="row">
                                <div class="col-xs-6 font-10 center bold"> 
                                    ..........................................<br>
                                    Sello y Firma<br>
                                    Jefe de Departamento de Admision y Registro
                                </div> 
                                <div class="col-xs-6 font-10 center bold">
                                    ..........................................<br>
                                    Vo.Bo. Sello y firma<br>
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

