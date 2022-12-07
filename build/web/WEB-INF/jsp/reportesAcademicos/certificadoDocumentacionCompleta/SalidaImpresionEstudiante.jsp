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
            .center-table-documentos{
                width: 350px; 
                margin: 0 auto;
            }
            @media print {
                .center-table{
                    width: 550pt; 
                    margin: 0 auto; 
                }
                .center-table-documentos{
                    width: 450pt; 
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
                                    <img class="logoqr" src="data:image/png;base64,${qr}" alt="" /> 
                                </div>
                            </div>
                        </div> 
                        <div class="container-grid">
                            <br>
                            <div class="row">
                                <div class="col-xs-12 center bold">
                                    CERTIFICADO DE DOCUMENTACIÓN
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
                                                <td><strong>Carnet de Identidad:</strong></td>
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
                                                <td><c:out value="${datosEst.programa}"/></td>
                                            </tr>
                                            <tr>
                                                <td><strong>Nivel:</strong></td>
                                                <td><c:out value="${datosGrados.grado_academico}"/></td>
                                            </tr>
                                            <tr>
                                                <td><strong>Fecha de Impresi&oacute;n:</strong></td>
                                                <td><fmt:formatDate value="${now}" pattern="${formatoFecha}"/></td>
                                            </tr>
                                        </table>
                                    </div>
                                </div>
                            </div>  
                            <br>
                            <div class="row">
                                <div class="col-xs-12 justify">
                                    Cuenta con toda documentaci&oacute;n de admisi&oacute;n en Archivos y registrado en el Sistema de Informaci&oacute;n Acad&eacute;mico.<br>
                                    Es todo cuanto certifico para fines consiguientes que convengan al interesado.
                                </div>
                            </div>
                            <br>
                            <div class="row">
                                <div class="col-xs-12 center bold">
                                    DOCUMENTOS PRESENTADOS
                                </div>
                            </div> 
                            <div class="row">
                                <div class="col-xs-12 center">
                                    <table  class="center-table-documentos" border="1">
                                        <tr>
                                            <th>Nro.</th>
                                            <th>TIPO DOCUMENTO</th>
                                            <th>PRESENT&Oacute; </th> 
                                        </tr>
                                        <c:forEach var="lDocumento" items="${lPrsDocumentosTodo}" varStatus="contadorClas">
                                            <tr>
                                                <td class="center"><c:out value='${contadorClas.count}'/> </td> 
                                                <td class="left"> 
                                                    <c:out value='${lDocumento.tipo_documento}'/>
                                                </td> 
                                                <td class="center">
                                                    <c:if test="${lDocumento.presento == true}"> Si</c:if>
                                                    <c:if test="${lDocumento.presento == false}"> No</c:if> 
                                                    </td>
                                                </tr>
                                        </c:forEach>
                                    </table>
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
