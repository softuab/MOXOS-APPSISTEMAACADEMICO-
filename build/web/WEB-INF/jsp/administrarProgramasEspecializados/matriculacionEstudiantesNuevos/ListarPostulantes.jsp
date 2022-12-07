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
        <c:if test="${empty titulo}">
            <div class="titulo">Administrar Estudiante Nuevo</div>
        </c:if>
        <c:if test="${!empty titulo}">
            <div class="titulo"><c:out value="${titulo}"/></div>
        </c:if>

        <br>
        <table>
            <tr>
                <td>
                    <form name="fvolver" action="<c:url value='/estudianteNuevo/entrada.fautapo'/>" method="post">
                        <input type="hidden" name="id_proceso"                 value="<c:out value='${id_proceso}'/>">
                        <input type="hidden" name="id_tramite"                 value="<c:out value='${id_tramite}'/>">
                        <input type="hidden" name="titulo"                     value="<c:out value='${titulo}'/>">
                        <input type="hidden" name="gestion"                    value="<c:out value='${gestion}'/>">
                        <input type="hidden" name="periodo"                    value="<c:out value='${periodo}'/>">
                        <input type="hidden" name="dip"                        value="<c:out value='${dip}'/>">
                        <input type="hidden" name="nombre"                     value="<c:out value='${nombre}'/>">
                        <input type="hidden" name="id_tipo_admision_entrada"   value="<c:out value='${id_tipo_admision_entrad}'/>">
                        <div> <a class="volver" href="javascript:document.fvolver.submit();"> Volver</a> </div>
                    </form>
                </td>
            </tr>
        </table>
        <table class="tabla">
            <tr>
                <th>GESTION</th>
                <th>PERIODO</th>
                <th>TIPO DE <br>ADMISION</th>
            </tr>
            <tr>
                <td><c:out  value="${gestion}"/></td>
                <td><c:out  value="${periodo}"/></td>
                <td><c:out  value="${datosTipoAdm.tipo_admision}"/></td>
            </tr>
        </table>
        <br>
        <div class="container">
            <div class="search-content">
                <input type="text" onkeyup="filter(this, 'table')" id="search" class="search"  placeholder="Buscar por nombres.." title="Type in a name"> 
            </div>
            <div class="table-content">
                <table class="table" id="table" aria-describedby="lista de postulantes">
                    <thead> 
                        <tr>
                            <th  scope="informacion" colspan="11" headers="informacion de postulantes">INFORMACION ENCONTRADA DE POSTULANTES</th>
                        </tr> 
                        <tr>
                            <th>Nro.</th>
                            <th>R.P.</th>
                            <th>Nombres</th>
                            <th>C.I.</th>
                            <th>Facultad</th>
                            <th>Programa<br>(Carrera)</th>
                            <th>Gesti&oacute;n</th>
                            <th>Periodo</th>
                            <th>Registrar</th>
                        </tr> 
                    </thead>
                    <tbody>
                        <c:forEach var="lista" items="${lPostulantes}" varStatus="contador">
                            <tr class="filter">
                                <td><c:out value="${contador.count}"/></td>
                                <td><c:out value="${lista.id_postulante}"/></td>
                                <td><c:out value="${lista.paterno}"/> <c:out value="${lista.materno}"/> <c:out value="${lista.nombres}"/></td>
                                <td><c:out value="${lista.dip}"/></td>
                                <td><c:out value="${lista.facultad}"/></td>
                                <td><c:out value="${lista.programa}"/></td>
                                <td><c:out value="${lista.gestion}"/></td>
                                <td><c:out value="${lista.periodo}"/></td>
                                <td>
                                    <c:if test="${lista.id_estado == 'A'}">
                                        <form id="fnuevo<c:out value='${contador.count}'/>" action="<c:url value='/estudianteNuevo/nuevoEstudiante.fautapo'/>" method="post">
                                            <input type="hidden" name="id_proceso"                value="<c:out value='${id_proceso}'/>">
                                            <input type="hidden" name="id_tramite"                value="<c:out value='${id_tramite}'/>">
                                            <input type="hidden" name="titulo"                    value="<c:out value='${titulo}'/>">
                                            <input type="hidden" name="id_postulante"             value="<c:out value='${lista.id_postulante}'/>">
                                            <input type="hidden" name="gestion"                   value="<c:out value='${gestion}'/>">
                                            <input type="hidden" name="periodo"                   value="<c:out value='${periodo}'/>">
                                            <input type="hidden" name="id_tipo_admision_entrada"  value="<c:out value='${id_tipo_admision_entrada}'/>">
                                            <div> <a class="agregar" href="javascript:enviarSolicitud('fnuevo<c:out value='${contador.count}'/>');"> Registrar</a> </div>
                                        </form>
                                    </c:if>
                                    <c:if test="${lista.id_estado == 'E'}">
                                        <span class="obligatorio"> Matriculado </span>
                                    </c:if>
                                    <c:if test="${lista.id_estado == 'P'}">
                                        <span class="obligatorio"> No Habilitado </span>
                                    </c:if>
                                </td> 
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
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
