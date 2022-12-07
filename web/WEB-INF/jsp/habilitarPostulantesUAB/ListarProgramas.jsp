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
        <title>Moxos - academico</title>
    </head>
    <body onload="init()">
        <div class="titulo">Habilitar Postulantes</div>
        <form name="fvolver" method="POST" action='<c:url value="/adminPlanesDeEstudio.fautapo"/>' >
            <div class="volver"><a href='javascript: document.fvolver.submit();' > Volver </a></div>
        </form>
        <form name="forma" action="<c:url value="/habilitarPstUAB/listarPostulantes.fautapo"/>" method="POST">
            <table class="formulario" aria-describedby="formulario de seleccionar programa">
                <thead>
                    <tr>
                        <th colspan="3">INTRODUZCA LOS DATOS</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td class="etiqueta">Gesti&oacute;n</td>
                        <td class="etiqueta">::</td>
                        <td> <c:out value="${gestion}"/><input type="hidden" name="gestion" value='<c:out value="${gestion}"/>' > </td>
                    </tr>
                    <tr>
                        <td class="etiqueta">Periodo</td>
                        <td class="etiqueta">::</td>
                        <td><c:out value="${periodo}"/> <input type="hidden" name="periodo" value='<c:out value="${periodo}"/>'> </td>
                    </tr>
                    <tr>
                        <td class="etiqueta">Facultad <span class="obligatorio">(*)</span> </td>
                        <td class="etiqueta">::</td>
                        <td>
                            <select  id='id_facultad' name='id_facultad' onchange="cambiarprograma(this)">
                                <option value="-1">-- Seleccione --</option>
                                <c:forEach var="item" items="${lFacultades}" >
                                    <option value='<c:out value="${item.id}"/>' >
                                        <c:out value="${item.value}"/> 
                                    </option>
                                </c:forEach>
                            </select> 
                        </td>
                    </tr>

                    <tr>
                        <td class="etiqueta">Programa<span class="obligatorio">(*)</span></td>
                        <td class="etiqueta">::</td>
                        <td>
                            <select id='id_programa' name='id_programa' size='1'>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="3">
                            <button onClick="fguardar()" type='button' id="btnenviar"  role="button"  class="btn">Siguiente</button> 
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
        <script type="text/javascript" src="<c:url value='/js/funciones.js'/>"></script>
        <script type="text/javascript" src="<c:url value='/js/herramientas.js'/>"></script>
        <script type="text/javascript" src="<c:url value='/js/ajax.js'/>"></script>
        <script type="text/javascript" src="<c:url value='/js/sistema/operaciones.js'/>"></script> 
        <script>
                                //lista de objetos
                                var idFacultad = -1;
                                var lprogramas =${lProgramas};
                                var modal = document.getElementById("loader");
                                const init = () => {
                                    document.getElementById('id_programa').innerHTML = optionscollection(lprogramas, idFacultad, -1);
                                }
                                const cambiarprograma = (e) => {
                                    document.getElementById('id_programa').innerHTML = optionscollection(lprogramas, parseInt(e.value), -1);
                                };
                                const fguardar = () =>
                                {
                                    modal.style.display = "block";
                                    document.forma.submit();
                                };
        </script>
    </body>
</html>
