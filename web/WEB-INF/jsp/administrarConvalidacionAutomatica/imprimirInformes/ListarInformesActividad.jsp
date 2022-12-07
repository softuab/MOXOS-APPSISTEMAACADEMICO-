<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Sistema Integrado - Moxos</title> 
        <link rel="stylesheet" href="<c:url value='/pagina.css'/>" type="text/css">
        <link rel="stylesheet" href="<c:url value='/basico.css'/>" type="text/css">
        <link rel="stylesheet" href="<c:url value='/principal.css'/>" type="text/css">
        <link href="imagenes\principal\aureliox.ico" rel="shortcut icon" type="image/x-icon">
        <script type="text/javascript" src="<c:url value='/js/funciones.js'/>"></script>
        <script type="text/javascript" src="<c:url value='/js/herramientas.js'/>"></script>
        <script type="text/javascript" src="<c:url value='/js/ajax.js'/>"></script> 
        <META HTTP-EQUIV="Cache-Control" CONTENT="max-age='0'" />
        <META HTTP-EQUIV="Cache-Control" CONTENT="no-cache" />
        <META http-equiv="expires" content="0" />
        <META HTTP-EQUIV="Expires" CONTENT="Tue, 01 Jan 1980 1:00:00 GMT" />
        <META HTTP-EQUIV="Pragma" CONTENT="no-cache" />
    </head>
    <c:if test="${cantInformes == 0}">
        <body onload="document.forma.submit()">
            <c:if test='${empty fechainicio && empty fechafin  && empty fechadellunes && empty id_estado}'>
                <form name=forma method="POST" action='<c:url value="/listarMisPendientes.fautapo"/>'>
                    <input type="hidden" name="nro_pagina_actual" value=<c:out value="${nro_pagina_actual}"/> >
                    <input type="hidden" name="fechainicio"       value='<c:out value="${fechainicio}"/>' >  <!--AQUI 4-->
                    <input type="hidden" name="fechafin"          value='<c:out value="${fechafin}"/>' >
                    <input type="hidden" name="fechadellunes"     value='<c:out value="${fechadellunes}"/>' >
                    <input type="hidden" name="id_estado"         value='<c:out value="${id_estado}"/>' >
                    <input type="hidden" name="id_tipo_proceso"   value=<c:out value="${id_tipo_proceso}"/> >
                    <input type="hidden" name="nombre_informe"    value='<c:out value="${nombre_informe}"/>' >
                    <input type="hidden" name="aplicacion"        value='<c:out value="${aplicacion}"/>' >
                    <input type="hidden" name="nro_pagina"        value='<c:out value="${nro_pagina}"/>' >
                    <input type="hidden" name="nro_filtro"        value='<c:out value="${nro_filtro}"/>' >
                    <input type="hidden" name="_botoncillo"       value='<c:out value="${_botoncillo}"/>' >
                </form>
            </c:if> 

            <!--VOLVER PARA AGRUPADOS--> 
            <c:if test='${!empty fechainicio  || !empty fechafin  || !empty fechadellunes || !empty id_estado}'>
                <form name=forma method="POST" action='<c:url value="/listarMisPendientesAgrupadosPorEstado.fautapo"/>'>
                    <input type="hidden" name="nro_pagina_actual" value=<c:out value="${nro_pagina_actual}"/> >
                    <input type="hidden" name="fechainicio"       value='<c:out value="${fechainicio}"/>' >  <!--AQUI 4-->
                    <input type="hidden" name="fechafin"          value='<c:out value="${fechafin}"/>' >
                    <input type="hidden" name="fechadellunes"     value='<c:out value="${fechadellunes}"/>' >
                    <input type="hidden" name="id_estado"         value='<c:out value="${id_estado}"/>' >
                    <input type="hidden" name="id_tipo_proceso"   value=<c:out value="${id_tipo_proceso}"/> >
                    <input type="hidden" name="nombre_informe"    value='<c:out value="${nombre_informe}"/>' >
                    <input type="hidden" name="aplicacion"        value='<c:out value="${aplicacion}"/>' >
                    <input type="hidden" name="nro_pagina"        value='<c:out value="${nro_pagina}"/>' >
                    <input type="hidden" name="nro_filtro"        value='<c:out value="${nro_filtro}"/>' >
                    <input type="hidden" name="_botoncillo"       value='<c:out value="${_botoncillo}"/>' >
                </form>
            </c:if> 
            <!--Fin-->    	      
        </body>
    </c:if>

    <c:if test="${cantInformes == 1}">
        <body onload="document.forma.submit()">
            <form name=forma method="POST" action='<c:url value="/listarInformesActividad1.fautapo"/>'>
                <c:forEach var="lista" items="${lInformes}">
                    <input type="hidden" name="id_tramite"        value='<c:out value="${datosTramite.id_tramite}"/>'>
                    <input type="hidden" name="id_proceso"        value='<c:out value="${lista.id_proceso}"/>'>
                    <input type="hidden" name="id_informe"        value='<c:out value="${lista.id_informe}"/>'>
                    <input type="hidden" name="id_actividad"      value='<c:out value="${lista.id_actividad}"/>'>
                    <input type="hidden" name="cantInformes"      value='<c:out value="${cantInformes}"/>'>
                    <input type="hidden" name="nro_pagina_actual" value='<c:out value="${nro_pagina_actual}"/>'>
                    <input type="hidden" name="fechainicio"       value='<c:out value="${fechainicio}"/>' >  <!--AQUI 4-->
                    <input type="hidden" name="fechafin"          value='<c:out value="${fechafin}"/>' >
                    <input type="hidden" name="fechadellunes"     value='<c:out value="${fechadellunes}"/>' >
                    <input type="hidden" name="id_estado"         value='<c:out value="${id_estado}"/>' >
                    <input type="hidden" name="id_tipo_proceso"   value='<c:out value="${id_tipo_proceso}"/>' >
                    <input type="hidden" name="nombre_informe"    value='<c:out value="${nombre_informe}"/>' >
                    <input type="hidden" name="aplicacion"        value='<c:out value="${aplicacion}"/>' >
                    <input type="hidden" name="nro_pagina"        value='<c:out value="${nro_pagina}"/>' >
                    <input type="hidden" name="nro_filtro"        value='<c:out value="${nro_filtro}"/>' >
                    <input type="hidden" name="_botoncillo"       value='<c:out value="${_botoncillo}"/>' >
                </c:forEach>
            </form>
        </body>
    </c:if>
    <c:if test="${cantInformes != '1' && cantInformes != '0'}">
        <body>
            <h3>Informes generados</h3>
            <table>
                <tr>
                    <td>
                        <c:if test='${empty fechainicio  && empty fechafin  && empty fechadellunes && empty id_estado }'>
                            <div><a class="volver" href="<c:url value="/listarMisPendientes.fautapo?nro_pagina=${nro_pagina}"/>" target="cuerpo">Volver</a></div>
                        </c:if>  
                        <!--VOLVER PARA AGRUPADOS--> 
                        <c:if test='${!empty fechainicio  || !empty fechafin  || !empty fechadellunes || !empty id_estado }'>
                            <div><a class="volver" href="<c:url value="/listarMisPendientesAgrupadosPorEstado.fautapo"><c:param name="fechainicio" value="${fechainicio}"/><c:param name="fechafin" value="${fechafin}"/><c:param name="fechadellunes" value="${fechadellunes}"/><c:param name="id_estado" value="${id_estado}"/></c:url>" target="cuerpo">Volver</a></div>
                        </c:if>
                        <!--Fin-->
                    </td>
                </tr>
            </table>
            <hr>

            <form name=forma method="POST">
                <table class="tabla">
                    <tr>
                        <th> INFORME </th>
                        <th> DESCRIPCION </th>
                        <th> VER </th>
                    </tr>
                    <c:forEach var="lista" items="${lInformes}">
                        <tr>
                            <td><c:out value="${lista.informe}"/></td>
                            <td><c:out value="${lista.descripcion}"/></td>
                            <td align="center">
                                <c:if test='${empty fechainicio  && empty fechafin  && empty fechadellunes && empty id_estado }'>
                                    <a href="<c:url value="/listarInformesActividad1.fautapo"><c:param name="id_tramite" value="${datosTramite.id_tramite}"/>&<c:param name="id_proceso" value="${lista.id_proceso}"/>&<c:param name="id_actividad" value="${lista.id_actividad}"/>&<c:param name="id_informe" value="${lista.id_informe}"/>&<c:param name="aplicacion" value="${aplicacion}"/>&<c:param name="nro_pagina" value="${nro_pagina}"/>&<c:param name="nro_pagina" value="${nro_pagina}"/>&<c:param name="nro_filtro" value="${nro_filtro}"/>&<c:param name="_bontoncillo" value="${_botoncillo}"/></c:url>"> 
                                            <img src="./imagenes/formularios/printer.gif" border=0/></a>
                                    </c:if>  
                                <!--MANDANDO PARAMETROS VOLVER PARA AGRUPADOS--> 
                                <c:if test='${!empty fechainicio  || !empty fechafin  || !empty fechadellunes || !empty id_estado }'>
                                    <a href="<c:url value="/listarInformesActividad1.fautapo"><c:param name="id_tramite" value="${datosTramite.id_tramite}"/>&<c:param name="id_proceso" value="${lista.id_proceso}"/>&<c:param name="id_actividad" value="${lista.id_actividad}"/>&<c:param name="id_informe" value="${lista.id_informe}"/>&<c:param name="aplicacion" value="${aplicacion}"/><c:param name="fechainicio" value="${fechainicio}"/><c:param name="fechafin" value="${fechafin}"/><c:param name="fechadellunes" value="${fechadellunes}"/><c:param name="id_estado" value="${id_estado}"/><c:param name="nro_filtro" value="${nro_filtro}"/>&<c:param name="_bontoncillo" value="${_botoncillo}"/></c:url>">
                                            <img src="./imagenes/formularios/printer.gif" border=0/></a> 
                                    </c:if>
                                <!--Fin-->
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </form>
        </body>
    </c:if> 
</html>
