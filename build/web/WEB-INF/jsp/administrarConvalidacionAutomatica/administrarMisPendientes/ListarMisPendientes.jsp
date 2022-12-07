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
        <table style="width: 100%">
            <tr>
                <td style="width: 15%" class="titulo"><c:out value="${institucion}"/></td>
                <td style="width: 85%">
                    <table>
                        <tr>
                        <form name="tramitesrecibidos" method="POST" action='<c:url value="/listarMisPendientes.fautapo"/>'>
                            <td class="etiqueta">
                                <input type="radio" name="id_tipo_proceso" value='1' onchange="javascript:document.tramitesrecibidos.submit();" checked> Tr&aacute;mites Recibidos
                            </td>
                        </form>
                        <form name="tramitesdespachados" method="POST" action='<c:url value="/listarMisPendientesDespachados.fautapo"/>'>
                            <td class="etiqueta">
                                <input type="radio" name="id_tipo_proceso" value='4' onchange="javascript:document.tramitesdespachados.submit();" > Tr&aacute;mites Despachados
                            </td>
                        </form>
                        <form name="corresrecibidas" method="POST" action='<c:url value="/listarMisPendientesCorrespondencias.fautapo"/>'>
                            <td class="etiqueta">
                                <input type="radio" name="id_tipo_proceso" value='2' onchange="javascript:document.corresrecibidas.submit();" > Correspondencias Recibidas
                            </td>
                        </form>
                        <form name="corresdespachadas" method="POST" action='<c:url value="/listarMisPendientesCorrespondenciasDespachadas.fautapo"/>'>
                            <td class="etiqueta">
                                <input type="radio" name="id_tipo_proceso" value='3' onchange="javascript:document.corresdespachadas.submit();" > Correspondencias Despachadas
                            </td>
                        </form>
            </tr>
        </table>
    </td>
</tr>
</table>

<br>
<!-- TRAMITES -->
<form name="forma" id="forma" method='post' action="<c:url value='/listarMisPendientes.fautapo'/>">
    <input type="hidden" name="nro_pagina" value="1" />
    <input type="hidden" name="_botoncillo" value="" />
    <table width="100%" class="formulario">
        <tr>
            <td width="50%">
                <table border="0">
                    <tr>
                        <td> Nro de Tr&aacute;mite :: </td>
                        <td><input type="text" name="nro_filtro"></td>
                        <td><input type="submit" value="Filtrar" onClick="javascript: document.forma.action = ''; document.forma._botoncillo.value = 'filtro'" class="filtro" /></td>
                        <td><input type="submit" value="Todo" onClick="javascript: document.forma.action = ''; document.forma._botoncillo.value = 'todo'" class="filtro" /></td>
                    </tr>
                </table>
            </td>
            <td width="50%" align="right">
                <table border="0" align="right">
                    <tr>
                        <td>
                            <c:if test='${nro_pagina > 1}'>
                                <a href="javascript: document.forma.submit()" OnClick="javascript: document.forma.action = ''; document.forma._botoncillo.value = 'principio'; document.forma.nro_pagina.value = '1';">&laquo; Principio</a>&nbsp;
                                <a href="javascript: document.forma.submit()" OnClick="javascript: document.forma.action = ''; document.forma._botoncillo.value = 'anterior'; document.forma.nro_pagina.value = '<c:out value="${nro_pagina - 1}"/>';">&lsaquo; Anterior</a>
                            </c:if>
                            <b><c:out value="${(paginacion * (nro_pagina - 1)) + 1}"/></b> - <b><c:out value="${(paginacion * (nro_pagina - 1)) + fn:length(lMisPendientes)}"/></b> de <b><c:out value="${totalRegistros}"/></b>
                            <c:if test='${nro_pagina < totalPaginas}'>
                                <a href="javascript: document.forma.submit()" OnClick="javascript: document.forma.action = ''; document.forma._botoncillo.value = 'siguiente'; document.forma.nro_pagina.value = '<c:out value="${nro_pagina + 1}"/>';">Siguiente &rsaquo;</a>&nbsp;
                                <a href="javascript: document.forma.submit()" OnClick="javascript: document.forma.action = ''; document.forma._botoncillo.value = 'final'; document.forma.nro_pagina.value = '<c:out value="${totalPaginas}"/>';">Final &raquo;</a>
                            </c:if>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
</form>
<br>

<div class="titulo">Mis pendientes</div>
<table class="tabla" style="width: 100%">
    <tr>
        <th>#</th>
        <th>REMITENTE</th>
        <th>REFERENCIAS</th>
        <th>ACTIVIDAD</th>
        <th>FORMULARIO</th>
        <th>RETROCEDER</th>
        <th>AVANZAR</th>
    </tr>
    <c:forEach var="lista" items="${lMisPendientes}" varStatus="contador">
        <!-- ********** Esto es para el efecto ************ -->
        <tr>
            <!-- ********** Fin  efecto ************ -->
            <td class="colb" style="text-align: center"><c:out value="${lista.correlativo2}"/>/<c:out value="${lista.gestion}"/></td>
            <td>
                <form id="recibir<c:out value="${contador.count}"/>" name=recibir<c:out value="${contador.count}"/> method="POST" action='<c:url value="/listarMisPendientes.fautapo"/>' >
                    <input type="hidden" name="id_tramite" value='<c:out value="${lista.id_tramite}"/>' >
                    <input type="hidden" name="accion"     value='Recibir' >
                    <input type="hidden" name="nro_pagina" value='<c:out value="${nro_pagina}"/>' >
                    <input type="hidden" name="nro_filtro"  value='<c:out value="${nro_filtro}"/>' >
                    <input type="hidden" name="_botoncillo" value='<c:out value="${_botoncillo}"/>' >
                    <c:if test="${lista.id_estado == 'P'}">
                        <a href="javascript:enviarSolicitud('recibir<c:out value="${contador.count}"/>');">
                            <img src='./imagenes/procesos/<c:out value="${lista.imagen}"/>' title="<c:out value="${lista.estado}"/>"  border="0"></a>
                        </c:if>
                        <c:if test="${lista.id_estado != 'P'}">
                        <img width='25' height='25' src='./imagenes/procesos/<c:out value="${lista.imagen}"/>' title="<c:out value="${lista.estado}"/>"  border="0">
                    </c:if>
                    <c:out value="${lista.usuario}"/>
                    <br><c:out value="${lista.cargo}"/>
                </form>
            </td>
            <td>
                <c:forEach var="referencias" items="${lista.lista}" >
                    <b><c:out value="${referencias.campo}"/> : </b><c:out value="${referencias.valor}"/><br>
                </c:forEach>
            </td>
            <td><b><c:out value="${lista.actividad}"/></b><br>
                <i><c:out value="${lista.proceso}"/></i>
                <br><b>ROL &nbsp; [<c:out value="${lista.rol}"/>]</b>
            </td>
            <td style="text-align: right">
                <c:if test="${(lista.id_estado == 'A') && lista.ruta != '/dibRap.fautapo'}">
                    <c:if test="${lista.puente == 'true'}">
                        <form id="forma<c:out value="${contador.count}"/>" name=forma<c:out value="${contador.count}"/> method="POST" action='<c:url value="${lista.ruta}"/>' >
                        </c:if>
                        <c:if test="${lista.puente == 'false'}">
                            <form id="forma<c:out value="${contador.count}"/>" name=forma<c:out value="${contador.count}"/> method="POST" action='<c:url value="/registrarTramite.fautapo"/>' >
                            </c:if>
                            <input type="hidden" name="id_tramite"          value='<c:out value="${lista.id_tramite}"/>' >
                            <input type="hidden" name="id_proceso"          value='<c:out value="${lista.id_proceso}"/>' >      
                            <input type="hidden" name="id_actividad_actual" value='<c:out value="${lista.id_actividad_actual}"/>' >
                            <input type="hidden" name="id_form"             value='<c:out value="${lista.id_form}"/>' >
                            <input type="hidden" name="proceso"             value='<c:out value="${lista.proceso}"/>' >
                            <input type="hidden" name="accion"              value='Formulario' >
                            <input type="hidden" name="aplicacion"          value='<c:url value="/"/>' >
                            <input type="hidden" name="nro_pagina"        value='<c:out value="${nro_pagina}"/>' >
                            <input type="hidden" name="nro_filtro"        value='<c:out value="${nro_filtro}"/>' >
                            <input type="hidden" name="_botoncillo"       value='<c:out value="${_botoncillo}"/>' >
                            <a href="javascript:enviarSolicitud('forma<c:out value="${contador.count}"/>');"> Formulario </a>
                        </form>
                    </c:if>
            </td>
            <td style="text-align: right">
                <c:if test="${lista.id_actividad_actual != lista.id_actividad_minima && lista.id_estado == 'A'}">
                    <form id="retroceder<c:out value="${contador.count}"/>" name=retroceder<c:out value="${contador.count}"/> method="POST" action='<c:url value="/listarMisPendientes.fautapo"/>' >
                        <input type="hidden" name="id_tramite"          value='<c:out value="${lista.id_tramite}"/>' >
                        <input type="hidden" name="id_proceso"          value='<c:out value="${lista.id_proceso}"/>' >
                        <input type="hidden" name="id_actividad"        value='<c:out value="${lista.id_actividad_actual}"/>' >
                        <input type="hidden" name="id_form"             value='<c:out value="${lista.id_form}"/>' >
                        <input type="hidden" name="proceso"             value='<c:out value="${lista.proceso}"/>' >
                        <input type="hidden" name="accion"              value='Retroceder' >
                        <input type="hidden" name="nro_pagina"        value='<c:out value="${nro_pagina}"/>' >
                        <a href="javascript:enviarSolicitud('retroceder<c:out value="${contador.count}"/>');" > Retroceder </a>
                    </form>
                </c:if>
            </td>
            <td colspan=2 style="text-align: right">
                <c:if test="${lista.id_estado == 'L' || lista.id_estado == 'A'}">
                    <c:if test="${lista.id_tipo_actuacion != 3}">
                        <form id="avanzar<c:out value="${contador.count}"/>" name=avanzar<c:out value="${contador.count}"/> method="POST" action='<c:url value="/listarMisPendientes.fautapo"/>' >
                            <input type="hidden" name="actuacion"           value='<c:out value="${lista.actuacion}"/>' >
                            <input type="hidden" name="id_tipo_actuacion"   value='<c:out value="${lista.id_tipo_actuacion}"/>' >
                        </c:if>
                        <c:if test="${lista.id_tipo_actuacion == 3}">
                            <form id="avanzar<c:out value="${contador.count}"/>" name=avanzar<c:out value="${contador.count}"/> method="POST" action='<c:url value="/avanzarTramite.fautapo"/>' >
                            </c:if>
                            <input type="hidden" name="id_tramite"          value='<c:out value="${lista.id_tramite}"/>' >
                            <input type="hidden" name="id_proceso"          value='<c:out value="${lista.id_proceso}"/>' >
                            <input type="hidden" name="id_actividad"        value='<c:out value="${lista.id_actividad_actual}"/>' >
                            <input type="hidden" name="id_form"             value='<c:out value="${lista.id_form}"/>' >
                            <input type="hidden" name="proceso"             value='<c:out value="${lista.proceso}"/>' >
                            <input type="hidden" name="accion"              value='Avanzar' >
                            <input type="hidden" name="nro_pagina"        value='<c:out value="${nro_pagina}"/>' >
                            <c:if test="${lista.id_tipo_actuacion != 3}">
                                <c:if test="${lista.filas > 1}">
                                    <select name="para">
                                        <c:forEach var="lista2" items="${lista.usuarios}" >
                                            <option value='<c:out value="${lista2.id_usuario}"/>'><c:out value="${lista2.usuario}"/>
                                            </c:forEach>
                                    </select>
                                </c:if>
                                <c:if test="${lista.filas == 1}">
                                    <c:forEach var="lista2" items="${lista.usuarios}" >
                                        <input type="hidden" name="para" value='<c:out value="${lista2.id_usuario}"/>' >
                                    </c:forEach>
                                </c:if>
                            </c:if>
                            <a href="javascript:enviarSolicitud('avanzar<c:out value="${contador.count}"/>');"> Avanzar </a>
                        </form>
                    </c:if>
            </td>
        </tr>
        <c:set var="contador1" value="${contador.count}"/>
    </c:forEach>
</table>
<div id="loader" class="modal"> 
    <div class="modal-content"> 
        <span class="loader"></span>
        <span>Enviando solicitud...</span>
    </div>
</div> 
<script>
    var modal = document.getElementById("loader");
    const enviarSolicitud = (name) => {
        modal.style.display = "block";
        document.getElementById(name).submit();
    }
</script>
</body>
</html>