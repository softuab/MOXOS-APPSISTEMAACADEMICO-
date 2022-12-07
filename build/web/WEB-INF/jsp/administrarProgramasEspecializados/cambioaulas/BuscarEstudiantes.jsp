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
        <title>Moxos - Academico</title>
    </head>
    <body>
        <div class="titulo">Buscar Estudiantes</div>
        <br>
        <form id="forma" action="<c:url value='/estudiante/cambioaula/buscarEstudianteEntrada.fautapo'/>" method="get">
            <table class="formulario" aria-describedby="entrada ver datos">
                <thead>
                    <tr>
                        <th colspan="3"> BUSCAR POSTULANTE </th>
                    </tr> 
                </thead>
                <tbody>
                    <tr>
                        <td colspan="3">
                            <fieldset>
                                <legend>Buscar por</legend>
                                <div class="grid-fieldset">
                                    <label style="text-align: right"><strong>R.U. ::</strong></label>
                                    <input type="number" name="id_estudiante" maxlength="8"   />
                                    <input value='Buscar por R.P.' type="Button" class="buscar" onClick="enviarSolicitud('forma')">
                                    <label style="text-align: right"><strong>DIP ::</strong></label>
                                    <input type="text" name="ci"  >
                                    <input value='Buscar por carnet' type="Button" class="buscar" onClick="enviarSolicitud('forma')"> 
                                    <label style="text-align: right"><strong>Nombres ::</strong></label>
                                    <input type=text name="nombres"/>
                                    <input value='Buscar por nombre' type="Button" class="buscar" onClick="enviarSolicitud('forma')">
                                </div>
                            </fieldset>
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
