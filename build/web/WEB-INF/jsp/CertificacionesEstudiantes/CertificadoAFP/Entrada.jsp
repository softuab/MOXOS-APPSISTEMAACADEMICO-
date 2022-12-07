<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<jsp:useBean id="now" class="java.util.Date"/>  
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="<c:url value='/pagina.css'/>" type="text/css">
        <link rel="stylesheet" href="<c:url value='/basico.css'/>" type="text/css">
        <link rel="stylesheet" href="<c:url value='/principal.css'/>" type="text/css">
        <link rel="stylesheet" href="<c:url value='/css/font-awesome.min.css'/>" type="text/css">  
        <link rel="stylesheet" href="<c:url value='/css/grid.css'/>" type="text/css">
        <title>Moxos - Academico</title>
    </head>
    <body>
        <div class="titulo">Buscar Estudiantes</div>
        <br>
        <form id="forma" action="<c:url value='/certificaciones/afp/ImpresionCertificadoAFP.fautapo'/>" method="get">
            <table class="formulario" aria-describedby="entrada ver datos">
                <thead>
                    <tr>
                        <th colspan="3"> EMITIR CERTIFICADO </th>
                    </tr> 
                </thead>
                <tbody>
                    <tr>
                        <td colspan="3">
                            <fieldset>
                                <legend>Parametros Informe</legend> 
                                <input type="hidden" name="id_estudiante"        value="<c:out value='${id_estudiante}'/>">
                                <div class="container-grid">
                                    <div class="row">
                                        <div class="col-xs-4">
                                            Nombre Completo::
                                        </div>
                                        <div class="col-xs-8">
                                            <c:out value='${nombre_completo}'/>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-xs-4">
                                            Programa::
                                        </div>
                                        <div class="col-xs-8">
                                            <c:out value='${programa}'/>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-xs-4">
                                            Gestion::
                                        </div>
                                        <div class="col-xs-8">
                                            <input type="number" id="gestion" name="gestion" value="<c:out value='${gestion}'/>">
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-xs-4">
                                            Periodo::
                                        </div>
                                        <div class="col-xs-8">
                                            <input type="number" id="periodo" name="periodo" value="<c:out value='${periodo}'/>">
                                        </div>
                                    </div>
                                </div>
                            </fieldset>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <button onClick="enviarSolicitud('forma')" type='button' id="btnenviar"  role="button"  class="btn">Generar informe</button> 
                        </td>
                    </tr>
                </tbody>
            </table>
        </form> 
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
