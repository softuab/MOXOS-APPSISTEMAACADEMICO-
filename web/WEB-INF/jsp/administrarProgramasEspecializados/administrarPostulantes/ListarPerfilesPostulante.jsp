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
    <body> 
        <c:if test="${empty titulo}">
            <div class="titulo">Registrar  Postulantes</div>
        </c:if>
        <c:if test="${!empty titulo}">
            <div class="titulo"><c:out value="${titulo}"/></div>
        </c:if>

        <br>
        <script language='JavaScript' SRC="../ajax.js"></script>

        <form name="fvolver" action="<c:url value='/postulantes/entrada.fautapo'/>" method="post">
            <input type="hidden" name="id_proceso" value="<c:out value='${id_proceso}'/>">
            <input type="hidden" name="id_tramite" value="<c:out value='${id_tramite}'/>">
            <input type="hidden" name="titulo" value="<c:out value='${titulo}'/>">
            <div> <a class="volver" href="javascript:document.fvolver.submit();"> Volver</a> </div>
        </form>
        <br>
        <form id="forma" name=forma action="<c:url value="/postulantes/registrarPerfilPostulante.fautapo"/>" method="POST">
            <table class="formulario">
                <tr>
                    <th colspan="2"> DATOS DEL POSTULANTE </th>
                </tr>  
                <tr>
                    <td class="etiqueta4">Gesti&oacute;n ::</td>
                    <td><c:out value="${datosPostulante.gestion}"/>
                    </td>
                </tr>
                <tr>
                    <td class="etiqueta4">Periodo ::</td>
                    <td><c:out value="${datosPostulante.periodo}"/>
                    </td>
                </tr>
                <tr>
                    <td class="etiqueta4">Nombres ::</td>
                    <td><c:out value="${datosPostulante.paterno}"/>  <c:out value="${datosPostulante.materno}"/>  <c:out value="${datosPostulante.nombres}"/>
                    </td>
                </tr>
                <tr>
                    <td class="etiqueta4">DIP ::</td>
                    <td><c:out value="${datosPostulante.dip}"/>
                    </td>
                </tr>
                <tr>
                    <td class="etiqueta4">Programa ::</td>
                    <td><c:out value="${datosPostulante.programa}"/>
                    </td>
                </tr>
                <tr>
                    <td class="etiqueta4">Plan ::</td>
                    <td><c:out value="${datosPostulante.id_plan}"/>
                    </td>
                </tr>
                <c:if test="${!empty bandera}">
                    <tr >
                        <td colspan="2">
                            <table class="tabla">
                                <tr>
                                    <td class="colh">? </td>
                                    <td class="colh">PERFIL </td>
                                    <td class="colh">TIPO PERFIL </td>
                                </tr>
                                <c:forEach var="lPerfil" items="${lPerfilesProcesos}" varStatus="contador">
                                    <tr>
                                        <td>  <input type="checkbox" name="id_perfil_proceso_p" value="<c:out value='${lPerfil.id_perfil_proceso}'/>"  checked>  </td> 
                                        <td> 
                                            <c:out value='${lPerfil.perfil}'/>
                                        </td> 
                                        <td> <c:out value='${lPerfil.tipo_perfil}'/>
                                        </td> 	
                                    </tr>
                                </c:forEach>
                            </table>
                        </td>
                    </tr>  	
                </c:if>  
                <tr>
                    <td colspan="2" style="text-align: center;">
                        <button onClick="enviarSolicitud('forma')" type='button' id="btnenviar"  role="button"  class="btn">Siguiente</button>  
                        <input type="hidden" name="id_postulante"  value="<c:out value="${id_postulante}"/>">
                        <input type="hidden" name="id_tramite"  value="<c:out value="${id_tramite}"/>">
                        <input type="hidden" name="titulo" value="<c:out value='${titulo}'/>">
                    </td>
                </tr>
            </table>
        </form>
        <div class="nota">Los campos con<span class="obligatorio">(*)</span>, son obligatorios.</div>
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