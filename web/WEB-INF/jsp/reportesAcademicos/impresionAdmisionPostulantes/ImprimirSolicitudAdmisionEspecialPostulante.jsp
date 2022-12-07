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
                                    FORMULARIO DE ADMISIÓN ESPECIAL
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-xs-12 justify">
                                    <table>
                                        <tr>
                                            <th class="th-title center" scope="solicitud" colspan="3" class="center">
                                                <h3>SOLICITUD DE ADMISIÓN</h3>
                                            </th>
                                        </tr>
                                        <tbody class="font-10 border-row">
                                            <tr>
                                                <td>
                                                    <strong>POSTULANTE :</strong> <span>
                                                        <c:out value="${datosPostulante.paterno}" />
                                                        <c:out value="${datosPostulante.materno}" />
                                                        <c:out value="${datosPostulante.nombres}" />
                                                    </span>
                                                </td>
                                                <td>
                                                    <strong>R.P. : </strong> <span>
                                                        <c:out value="${datosPostulante.id_postulante}" />
                                                    </span>
                                                </td>
                                                <td> <strong>Fecha : </strong> <span>
                                                        <fmt:formatDate value="${datosPostulante.fec_registro}"
                                                                        pattern="${formatoFecha}" />
                                                    </span></td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <strong>FACULTAD : </strong> <span>
                                                        <c:out value="${datosPostulante.facultad}" />
                                                    </span>
                                                </td>
                                                <td colspan="2"> <strong>CARRERA : </strong> <span>
                                                        <c:out value="${datosPostulante.programa}" />
                                                    </span>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td colspan="3"> <strong>MODALIDAD DE ADMISION : </strong> <span>
                                                        <c:out value="${datosPostulante.tipo_admision}" />
                                                    </span> </td>
                                            </tr>
                                            <tr>
                                                <td colspan="3"> <strong>DESCRIPCIÓN DE MODALIDAD DE ADMISION : </strong>
                                                    <span>
                                                        <c:out value="${datosPostulante.tipo_admision}" />
                                                    </span>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td colspan="3">
                                                    <p>Que estando comprendido en el Reglamento General de R&eacute;gimen
                                                        Estudiantil de la Universidad Aut&oacute;noma del Beni "José
                                                        Ballivián", solicito la admisi&oacute;n a la U.A.B. en la presente gesti&oacute;n
                                                        dentro de la modalidad de admisi&oacute;n especial.</p>
                                                    <br><br><br><br>
                                                    <div class="center">
                                                        _________________________<br>
                                                        Firma Interesado
                                                    </div>
                                                </td>
                                            </tr>
                                            <tr>
                                                <th scope="informe" colspan="3" class="th-title center">
                                                    <h3>INFORME DE PLAZA CARRERA SOLICITADA</h3>
                                                </th>
                                            </tr>
                                            <tr>
                                                <td colspan="3"> <strong>LA SECCIÓN DE REGISTROS E INSCRIPCIONES : </strong>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td style="width: 65%" colspan="2">
                                                    <p class="justify">Informa que de acuerdo a resoluci&oacute;n del H.C.U. en relaci&oacute;n de cantidad de estudiantes que la Carrera. acepta para la presente gesti&oacute;n, se ha verificado la disponibilidad de plaza al programa solicitado.</p>
                                                    <br><br><br>
                                                    <strong>Fecha :
                                                        <fmt:formatDate value="${datosPostulante.fec_registro}"
                                                                        pattern="${formatoFecha}" />
                                                    </strong>
                                                </td>
                                                <td style="width: 35%"><br><br><br><br><br><br><br><br><br><br><br>
                                                    <div class="center">
                                                        _______________________<br>
                                                        Firma Registros e Inscripciones
                                                    </div>
                                                </td>

                                            </tr>
                                            <tr>
                                                <th scope="autorizacion" colspan="3" class="th-title">
                                                    <h3>AUTORIZACION DE ADMISION ESPECIAL</h3>
                                                </th>
                                            </tr>
                                            <tr>
                                                <td colspan="3"> <strong>LA DIRECCION DE PLANIFICACIÓN ACADÉMICA :</strong>
                                                    <span>
                                                        <c:out value="" />
                                                    </span>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td style="width: 65%" colspan="2">
                                                    <p>Autoriza al (a la) solicitante la admisi&oacute;n especial bajo la modalidad de :</p>
                                                    <p> <strong>
                                                            <c:out value="${datosPostulante.tipo_admision}" />
                                                        </strong></p>
                                                    <p>por lo tanto puede registrarse como estudiante regular a la</p>
                                                    <p> a la Carrera Solicitada:</p>

                                                    <p> <strong>
                                                            <c:out value="${datosPostulante.programa}" />
                                                        </strong>
                                                        <br><br><br>
                                                        <strong>Fecha : ............/............/............ </strong>
                                                </td>
                                                <td style="width: 35%"><br><br><br><br><br><br><br><br><br><br><br><br>
                                                    <div class="center">
                                                        _______________________<br>
                                                        Firma
                                                    </div>
                                                </td>

                                            </tr>
                                        </tbody>
                                    </table>
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