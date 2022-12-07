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
        <title>Moxos - Academico</title>
        <style>
            .head {
                width: 90%;
                font-family: Arial, Helvetica, sans-serif;
                text-align: center;
                display: grid;
                padding-top: 50px;
                padding-left: 20px;
                grid-template-columns: 15% 70% 15%;
            }

            .head .grid-item {
                text-align: center;
                padding-top: 10px;
            }

            .head .grid-item img {
                width: 70px;
            }

            .head .titulo {
                font-size: 14px;
                font-weight: bold;
                text-align: center;
                position: relative;
                top: 30%;
            }

            .table {
                text-align: left;
                border-collapse: collapse;
                border: 0px;
                width: 100%;
            }
            .descripcion{
                font-weight: lighter;
            }
            .fecha{
                width: 90%;
                font-family: Arial, Helvetica, sans-serif;
                font-size: 12px;
                text-align: right;
                padding-top: 60px;
            }
            .firma{
                width: 90%;
                font-family: Arial, Helvetica, sans-serif;
                font-size: 14px;
                text-align: center;
                padding-top: 100px;
            }
        </style>
    </head>
    <body>
        <div id="sidebar">
            <div id="outline"></div>
        </div>
        <div id="page-container">
            <div id="pf1" class="pf w0 h0" data-page-no="1">
                <div class="head"> 
                    <div class="grid-item"><img src='<c:url value="/imagenes/logos/logominiatura.png"/>' alt="" /></div>
                    <div class="titulo">
                        UNIVERSIDAD AUTONOMA DEL BENI JOSE<br />
                        BALLIVIAN<br />
                        <c:out value='${datosInstitucion.localidad}'/> - <c:out value='${datosInstitucion.departamento}'/> - <c:out value='${datosInstitucion.pais}'/><br>
                        <c:out value='${datosInstitucion.actividad}'/>
                    </div>
                    <div class="grid-item"><img src="data:image/png;base64,${qr}" alt="" /></div>
                </div>
                <div class="head">
                    <div class="grid-item"></div>
                    <div class="titulo">
                        MATRICULACION ESTUDIANTE NUEVO
                    </div>
                    <div class="grid-item"></div>
                </div> 
                <div class="head">
                    <div class="grid-item"></div>
                    <div class="titulo">
                        <table class="table">
                            <thead>
                            <th colspan="6"></th>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>Estudiante</td>
                                    <td colspan="3" class="descripcion"><c:out value="${datosEst.nombres}"/> <c:out value="${datosEst.paterno}"/> <c:out value="${datosEst.materno}"/></td> 
                                    <td>R.U.:</td>
                                    <td class="descripcion"><c:out value="${datosEst.id_estudiante}"/></td>
                                </tr>
                                <tr>
                                    <td>Facultad:</td>
                                    <td colspan="5" class="descripcion"><c:out value="${datosEst.facultad}"/></td>
                                </tr>
                                <tr>
                                    <td>Carrera:</td>
                                    <td colspan="5" class="descripcion"><c:out value="${datosEst.programa}"/></td>
                                </tr>
                                <tr>
                                    <td>Localidad:</td>
                                    <td colspan="5" class="descripcion"><c:out value="${datosEst.sede_desconcentrada}"/></td>
                                </tr>
                                <tr>
                                    <td colspan="6" class="descripcion">
                                        Estudiante habilitado para matricularse en la:
                                        <strong>Gesti&oacute;n :</strong> <c:out value="${gestion_matricula}"/> y <b>Periodo:</b> <c:out value="${periodo_matricula}"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Prorroga:</td>
                                    <td colspan="5" class="descripcion"><c:if test="${prorroga == true }">SI </c:if> <c:if test="${prorroga == false }">NO </c:if></td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                    <div class="grid-item"></div>
                </div>
                <div class="fecha"><strong>Fecha:</strong>  <fmt:formatDate value="${now}" pattern="${formatoFecha}"/></div>
                                    <div class="firma">................................................. <br/> <c:out value="${usuario}"/><br/>Usuario</div>
            </div>
        </div>
        <script src="<c:url value='/js/impresion/script.js'/>" type="text/javascript"></script>
        <script src="<c:url value='/js/impresion/script2.js'/>" type="text/javascript"></script>
        <script src="<c:url value='/js/impresion/script3.js'/>" type="text/javascript"></script>
    </body>
</html>

