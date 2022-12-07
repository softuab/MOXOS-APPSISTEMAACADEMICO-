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
                        ESTUDIANTES PROGRAMA SEDE
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
                                    <td><strong>Estudiante:</strong></td>
                                    <td colspan="6" class="descripcion"><c:out value="${datosPersona.paterno}"/>&nbsp;<c:out value="${datosPersona.materno}"/>&nbsp;&nbsp;<c:out value="${datosPersona.nombres}"/> </td>
                                    <td>R.U.:</td>
                                    <td class="descripcion"> <c:out value="${datosEstudiante.id_estudiante}"/> </td>
                                </tr>
                                <tr>
                                    <td><strong>Facultad:</strong></td>
                                    <td colspan="6" class="descripcion"> <c:out value="${datosFacultad.facultad}"/></td>
                                    <td>CI:</td>
                                    <td class="descripcion"><c:out value="${datosPersona.dip}"/></td>
                                </tr>
                                <tr>
                                    <td>Carrera:</td>
                                    <td colspan="9" class="descripcion"><c:out value="${datosPrograma.programa}"/></td>
                                </tr>
                                <tr>
                                    <td>Sede:</td>
                                    <td>
                                        <c:forEach var="lista" items="${sede}">
                                            <c:out value="${lista.sede_desconcentrada}"/>
                                        </c:forEach> 
                                    </td>
                                </tr>
                                <tr>
                                    <td>Nota</td>
                                    <td colspan="3"><c:out value="${nota}"/></td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                    <div class="grid-item"></div>
                </div>
                <div class="fecha"><strong>Fecha:</strong>  <fmt:formatDate value="${now}" pattern="${formatoFecha}"/></div>
                <div class="firma">................................................. <br/> <c:out value="${usuario}"/><br/><strong>Usuario</strong></div>
            </div>
        </div>
        <script src="<c:url value='/js/impresion/script.js'/>" type="text/javascript"></script>
        <script src="<c:url value='/js/impresion/script2.js'/>" type="text/javascript"></script>
        <script src="<c:url value='/js/impresion/script3.js'/>" type="text/javascript"></script>
    </body>
</html>




