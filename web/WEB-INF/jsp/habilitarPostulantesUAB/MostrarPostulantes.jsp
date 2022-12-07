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
        <link href="imagenes\principal\aureliox.ico" rel="shortcut icon" type="image/x-icon">
        <META HTTP-EQUIV="Cache-Control" CONTENT="max-age='0'" />
        <META HTTP-EQUIV="Cache-Control" CONTENT="no-cache" />
        <META http-equiv="expires" content="0" />
        <META HTTP-EQUIV="Expires" CONTENT="Tue, 01 Jan 1980 1:00:00 GMT" />
        <META HTTP-EQUIV="Pragma" CONTENT="no-cache" />
        <title>Moxos - Academico</title>
    </head>
    <body>
        <div class="titulo">Habilitar  Postulante</div>
        <br>
        <table>
            <tr>
                <td>
                    <form name="fvolver" action="<c:url value='/habilitarPstUAB/listarPostulantes.fautapo'/>" method="post">
                        <input type="hidden" name="gestion" value="<c:out value='${gestion}'/>">
                        <input type="hidden" name="periodo"  value="<c:out value='${periodo}'/>">
                        <input type="hidden" name="id_programa" value="<c:out value='${id_programa}'/>">
                        <input type="hidden" name="id_facultad" value="<c:out value='${id_facultad}'/>">
                        <div> <a class="volver" href="javascript:document.fvolver.submit();"> Volver</a> </div>
                    </form>
                </td>
            </tr>
        </table> 
        <br>
        <div class="container"> 
            <div class="table-content">
                <form id="forma" name="forma" action="<c:url value="/habilitarPstUAB/habilitarPostulante.fautapo"/>" method="POST">
                    <table class="table" id="table" aria-describedby="lista de postulantes">
                        <thead> 
                            <tr>
                                <th scope="confirmar" colspan="7"> CONFIRMAR HABILITAR</th>
                            </tr> 
                            <tr>
                                <th scope="?">?</th> 
                                <th scope="Nro.">Nro.</th>
                                <th scope="Nombres">NOMBRES</th>
                                <th scope="C.I.">C.I.</th>
                                <th scope="Programas">Programa<br>(Carrera)</th>
                                <th scope="Gestion">Gesti&oacute;n</th>
                                <th scope="Periodo">Periodo</th>
                            </tr> 
                        </thead>
                        <tbody>
                            <c:forEach var="lista" items="${lPostulantesSelec}" varStatus="contador">
                                <tr>
                                    <td><c:out value="${contador.count}"/></td>
                                    <td> <input type="checkbox" name="id_postulante_hab"  id="id_postulante_hab<c:out value='${lista.id_postulante}'/>"  value="<c:out value='${lista.id_postulante}'/>"  checked>  </td> 
                                    <td><c:out value="${lista.paterno}"/>&nbsp;<c:out value="${lista.materno}"/>&nbsp;<c:out value="${lista.nombres}"/></td>
                                    <td><c:out value="${lista.dip}"/></td>
                                    <td><c:out value="${lista.programa}"/></td>
                                    <td><c:out value="${lista.gestion}"/></td>
                                    <td><c:out value="${lista.periodo}"/></td>
                                </tr>
                            </c:forEach>
                            <tr>
                                <td colspan="11">
                                    <button onClick="enviarSolicitud('forma')" type='button' id="btnenviar"  role="button"  class="btn">Siguiente</button> 
                                    <input type="hidden" name="id_programa"  value="<c:out value="${id_programa}"/>">
                                    <input type="hidden" name="gestion" value="<c:out value='${gestion}'/>">
                                    <input type="hidden" name="periodo"  value="<c:out value='${periodo}'/>">
                                    <input type="hidden" name="id_facultad" value="<c:out value='${id_facultad}'/>">
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </form>
                <div class="nota">Los campos con <span class="obligatorio">(*)</span>, son obligatorios.</div>   
            </div>
        </div>
        <div id="loader" class="modal"> 
            <div class="modal-content"> 
                <span class="loader"></span>
                <span>Enviando solicitud...</span>
            </div>
        </div> 
        <script type="text/javascript" src="<c:url value='/js/funciones.js'/>"></script>
        <script type="text/javascript" src="<c:url value='/js/herramientas.js'/>"></script>
        <script type="text/javascript" src="<c:url value='/js/ajax.js'/>"></script>
        <script type="text/javascript" src="<c:url value='/js/sistema/operaciones.js'/>"></script> 
        <script src="<c:url value='/js/main.js'/>" type="text/javascript"></script>
        <script>
                                        var modal = document.getElementById("loader");
                                        const enviarSolicitud = (formulario) => {
                                            modal.style.display = "block";
                                            document.getElementById(formulario).submit();
                                        }
        </script>
    </body>
</html>
