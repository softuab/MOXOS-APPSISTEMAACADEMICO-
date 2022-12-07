<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>
<html>
    <head>
        <title>Sistema Integrado - Moxos</title>
        <link rel="stylesheet" href="<c:url value='/pagina.css'/>" type="text/css">
        <link rel="stylesheet" href="<c:url value='/basico.css'/>" type="text/css">  
        <script language="javascript" src="<c:url value='/js/ajax.js'/>"></script>
        <script language="JavaScript" src="<c:url value='/js/datepicker.js'/>"></script>
        <script language="javascript" src="<c:url value='/js/combos.js'/>"></script>
    </head>
    <body>
        <div class="titulo">Estudiantes Programas Sede</div>
        <div class="volver"><a href='<c:url value="/entradaEstudiante/ProgramaSede.fautapo"/>'>Volver</a></div>
        <table class="tabla">
            <tr>
                <th>RU</th>
                <td class="colb"><c:out value="${id_estudiante}"/></td>
                <th>Estudiante</th>
                <td class="colb">
                    <c:out value="${datosEstudiante2.nombres}"/> &nbsp; 
                    <c:out value="${datosEstudiante2.paterno}"/> &nbsp;
                    <c:out value="${datosEstudiante2.materno}"/>
                </td>
                <th>Programa</th>
                <td class="colb"><c:out value="${datosPrograma.programa}"/>
            </tr>
        </table>
        <br>
        <form name="forma" method="post" action="<c:url value="/entradaEstudiante/registrarSedeProgramaEstudiante.fautapo"/>">
            <input type="hidden" name="id_estudiante" value='<c:out value="${id_estudiante}"/>'>
            <input type="hidden" name="id_programa" value='<c:out value="${id_programa}"/>'>
            <input type="hidden" name="Modificar" value="Modificar"/>
            <table class="formulario">  
                <tr>
                    <th colspan="3">INTRODUZCA LOS DATOS</th>
                </tr>              
                <tr>
                    <td class="etiqueta">SEDE::</td>
                    <td class="etiqueta">::<font color='red'>(*)</font></td>
                    <td>
                        <select id="id_desconcentrado" name="id_desconcentrado">
                            <option value="-1">Elija una opci&oacute;n...</option>
                            <c:forEach var="lista" items="${lProgramasFacDescocentrados}">
                                <option value="<c:out value="${lista.id_desconcentrado}"/>" <c:if test="${lista.id_desconcentrado==datosEstudiantes.id_desconcentrado}">selected="true"</c:if>><c:out value="${lista.sede_desconcentrada}"/></option>
                            </c:forEach>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td class="etiqueta">Nota</td>
                    <td class="etiqueta">::<font color='red'>(*)</font></td>
                    <td><textarea  name="nota" rows="3"><c:out value="${datosEstudiantes.nota}"/></textarea></td>
                </tr>
            </table>
            <center>
                <input  type="submit" value="Siguiente" class="siguiente">
            </center>
        </form>
    </body>
</html>