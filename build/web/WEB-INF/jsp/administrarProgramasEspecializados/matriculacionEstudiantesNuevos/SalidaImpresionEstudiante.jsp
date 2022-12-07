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
                                    MATRICULACION ESTUDIANTE NUEVO
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
                                                <tr>
                                                    <td colspan="6" class="center">
                                                            <form id="formulario" action="<c:url value='/listarMisPendientes.fautapo'/>" method="post">
                                                        <input type="hidden" name="aplicacion" value="/" >
                                                        <input type="hidden" name="accion"     value='Formularito' >
                                                        <button type='button' style="width: 400px" onclick="enviarSolicitud('formulario')" role="button"  class="btn noprint">Enviar solicitud</button>
                                                    </form>
                                                </td>
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
