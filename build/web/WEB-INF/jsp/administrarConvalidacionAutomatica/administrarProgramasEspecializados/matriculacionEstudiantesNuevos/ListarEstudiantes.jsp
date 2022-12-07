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
        <table class="table">
            <tr>
                <th>GESTION</th>
                <th>PERIODO</th>
                <th>TIPO DE <br>ADMISION</th>
            </tr>
            <td><c:out  value="${gestion}"/></td>
            <td><c:out  value="${periodo}"/></td>
            <td><c:out  value="${datosTipoAdm.tipo_admision}"/></td>
        </tr>
    </table>
    <br>
    <table>
        <tr>
            <td>
                <form name="fvolver" action="<c:url value='/estudianteNuevo/entrada.fautapo'/>" method="post">
                    <input type="hidden" name="id_proceso"                value="<c:out value='${id_proceso}'/>">
                    <input type="hidden" name="id_tramite"                value="<c:out value='${id_tramite}'/>">
                    <input type="hidden" name="titulo"                    value="<c:out value='${titulo}'/>">
                    <input type="hidden" name="gestion"                   value="<c:out value='${gestion}'/>">
                    <input type="hidden" name="periodo"                   value="<c:out value='${periodo}'/>">
                    <input type="hidden" name="dip"                       value="<c:out value='${dip}'/>">
                    <input type="hidden" name="nombre"                    value="<c:out value='${nombre}'/>">
                    <input type="hidden" name="id_tipo_admision_entrada"  value="<c:out value='${datosTipoAdm.id_tipo_admision}'/>">
                    <div> <a class="volver" href="javascript:document.fvolver.submit();"> Volver</a> </div>
                </form>
            </td>
        </tr>
    </table>
    <div class="container">
        <div>
            <input type="text" id="search" class="search"  placeholder="Buscar por nombres.." title="Type in a name">
        </div>
        <div>
            <table class="tabla">
                <tr>
                    <th scope="informacion" colspan="11">INFORMACION ENCONTRADA EN ESTUDIANTES</th>
                </tr>
                <tr>
                    <th  scope="nro">Nro.</th>
                    <th  scope="ru">R.U.</th>
                    <th  scope="nombres">Nombres</th>
                    <th  scope="dip">DIP</th>
                    <th  scope="programa">Programa<br>(Carrera)</th>
                    <th  scope="fecha">Fecha de Insripci&oacute;n</th>
                    <th  scope="estado">Estado</th>
                    <th  scope="registrar">Registrar</th>
                </tr>
                <c:forEach var="lista" items="${lEstudiantes}" varStatus="contador">
                    <tr <c:if test="${(contador.count mod 2) == 0}">bgColor="#FFFFD9" %-- Est&acute;tico :( --%</c:if> onMouseOver="this.className = 'sobreFila'" onmouseout="this.className = ''">
                        <td><c:out value="${contador.count}"/></td>
                        <td><c:out value="${lista.id_estudiante}"/></td>
                        <td><c:out value="${lista.paterno}"/>&nbsp;<c:out value="${lista.materno}"/>&nbsp;<c:out value="${lista.nombres}"/></td>
                        <td><c:out value="${lista.dip}"/></td>
                        <td><c:out value="${lista.programa}"/></td>
                        <td><fmt:formatDate value="${lista.fec_inscripcion}" pattern="dd/MM/yyyy"/></td>
                        <td>
                            <c:if test="${lista.id_estado == 'A'}"> Activo</c:if>
                            <c:if test="${lista.id_estado == 'B'}"><font color="red">Bloqueado</font></c:if>
                            </td>
                            <td>
                                <form name="fnuevo<c:out value='${contador.count}'/>" action="<c:url value='/estudianteNuevo/nuevoEstudianteAdmisionEspecial.fautapo'/>" method="post">
                                <input type="hidden" name="id_proceso"                value="<c:out value='${id_proceso}'/>">
                                <input type="hidden" name="id_tramite"                value="<c:out value='${id_tramite}'/>">
                                <input type="hidden" name="titulo"                    value="<c:out value='${titulo}'/>">
                                <input type="hidden" name="id_estudiante"             value="<c:out value='${lista.id_estudiante}'/>">
                                <input type="hidden" name="gestion"                   value="<c:out value='${gestion}'/>">
                                <input type="hidden" name="periodo"                   value="<c:out value='${periodo}'/>">
                                <input type="hidden" name="id_tipo_admision_entrada"  value="<c:out value='${datosTipoAdm.id_tipo_admision}'/>">
                                <div> <a class="agregar" href="javascript:document.fnuevo<c:out value='${contador.count}'/>.submit();"> Registrar</a> </div>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
    <script type="text/javascript" src="<c:url value='/js/funciones.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/js/herramientas.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/js/ajax.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/js/sistema/operaciones.js'/>"></script> 
    <script src="<c:url value='/js/main.js'/>" type="text/javascript"></script> 
</body>
</html>
