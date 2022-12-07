<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<jsp:useBean id="now" class="java.util.Date"/> 
<!DOCTYPE html>
<html lang="es">
    <head>
        <fmt:formatDate var="current" value="${now}" pattern="yyyyMMddHHmmss" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value='/css/impresion/style.css'/>" rel="stylesheet" type="text/css"/>
        <link href="<c:url value='/css/impresion/style2.css'/>" rel="stylesheet" type="text/css"/>
        <link href="<c:url value='/css/impresion/style3.css'/>" rel="stylesheet" type="text/css"/>
        <link href="<c:url value='/css/impresion/stylereport.css'/>?v=${current}" rel="stylesheet" type="text/css"/> 
        <link href="<c:url value='/css/grid.css'/>" rel="stylesheet" type="text/css"/>  
        <link href="<c:url value='/css/loader.css'/>" rel="stylesheet" type="text/css"/>  
        <title>Moxos - Academico</title> 
    </head>
    <body>
        <div id="sidebar">
            <div id="outline"></div>
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
                                        <span class="span-subtitle"><c:out value='${datosInstitucion.localidad}'/> - <c:out value='${datosInstitucion.departamento}'/> - <c:out value='${datosInstitucion.pais}'/></span><br>
                                        <span class="span-subtitle"><c:out value='${datosInstitucion.actividad}'/></span>
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
                                    CAMBIO DE SEDE DE AULA
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-xs-12"> 
                                    <table>
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
                                                <td colspan="9" class="descripcion"><c:out value="${datosEstudiante.sede_desconcentrada}"/></td>
                                            </tr>
                                            <tr>
                                                <td>Nota</td>
                                                <td colspan="3"><c:out value="${datosEstudiante.nota}"/></td>
                                            </tr>
                                        </tbody>
                                    </table> 
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-xs-12 right">
                                    <strong>Fecha:</strong>  <fmt:formatDate value="${now}" pattern="${formatoFecha}"/>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-xs-12 center">
                                    <br/><br/><br/>
                                    ................................................. <br/> <c:out value="${usuario}"/><br/>Usuario
                                </div>
                            </div>
                        </div>
                    </div>
                </div>    
            </div>
        </div>
        <div id="loader" class="modal"> 
            <div class="modal-content"> 
                <span class="loader"></span>
                <span>Enviando solicitud...</span>
            </div>
        </div> 
        <script>
            var modal = document.getElementById("loader");
            const enviarSolicitud = (formulario) => {
                modal.style.display = "block";
                document.getElementById(formulario).submit();
            }
        </script>
    </body>
</html>
