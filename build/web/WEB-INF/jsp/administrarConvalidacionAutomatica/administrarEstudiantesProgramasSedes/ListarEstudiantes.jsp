<%@ include file="../Superior.jsp" %>

<div class="titulo">Buscar Estudiantes</div>
<div class="volver"><a href='<c:url value="/entradaEstudiante/ProgramaSede.fautapo"/>'>Volver</a></div>
<br>

<table class="tabla" border="1">
    <tr>
        <th>Nro.</th>
        <th>RU</th>
        <th>DIP</th>
        <th>NOMBRES</th>
        <th>PROGRAMA</th> 
        <th>PLAN</th>
        <th>REGISTRAR</th>
        <th>MODIFICAR</th>
        <th>ELIMINAR</th>
        <th>DETALLE</th>
    </tr>    
    <c:forEach var="datos" items="${lEstudiantes}" varStatus="contador">
        <tr <c:if test="${(contador.count mod 2) == 0}">bgColor="#FFFFD9" %-- Est&acute;tico :( --%</c:if> onMouseOver="this.className = 'sobreFila'" onmouseout="this.className = ''">
            <td><c:out value="${contador.count}"/></td>
            <td><c:out value="${datos.id_estudiante}"/></td>
            <td><c:out value="${datos.dip}"/></td>        
            <td><c:out value="${datos.nombre_completo}"/></td>
            <td><c:out value="${datos.programa}"/></td>
            <td><c:out value="${datos.id_plan}"/></td>
            <td>
                <form name=formaregistrar<c:out value="${contador.count}"/> method="POST" action='<c:url value="/entradaEstudiante/registarEstudiantesProgramaSede.fautapo"/>'>
                    <input type="hidden" name="id_estudiante" value="<c:out value="${datos.id_estudiante}"/>"/>
                    <input type="hidden" name="id_programa" value="<c:out value="${datos.id_programa}"/>"/>
                </form>
                <a class="agregar" href="javascript: document.formaregistrar<c:out value="${contador.count}"/>.submit()">Registrar</a>
            </td>
            <td>
                <form name=formamodificar<c:out value="${contador.count}"/> method="POST" action='<c:url value="/entradaEstudiante/ModificarEstudianteProgramaSede.fautapo"/>'>
                    <input type="hidden" name="id_estudiante" value="<c:out value="${datos.id_estudiante}"/>"/>
                    <input type="hidden" name="id_programa" value="<c:out value="${datos.id_programa}"/>"/>
                    <input type="hidden" name="accion" value="Modificar"/>
                </form>
                <a class="modificar" href="javascript: document.formamodificar<c:out value="${contador.count}"/>.submit()">Modificar</a>
            </td>
            <td>
                <form name=formaeliminar<c:out value="${contador.count}"/> method="POST" action='<c:url value="/entradaEstudiante/DetalleEstudianteProgramaSede.fautapo"/>'>
                    <input type="hidden" name="id_estudiante" value="<c:out value="${datos.id_estudiante}"/>"/>
                    <input type="hidden" name="id_programa" value="<c:out value="${datos.id_programa}"/>"/>
                </form>
                <a class="eliminar" href="javascript: document.formaeliminar<c:out value="${contador.count}"/>.submit()">Eliminar</a>
            </td>
            <td>
                <form name=formadetalle<c:out value="${contador.count}"/> method="POST" action='<c:url value="/entradaEstudiante/DetalleEstudianteProgramaSede.fautapo"/>'>
                    <input type="hidden" name="id_estudiante" value="<c:out value="${datos.id_estudiante}"/>"/>
                    <input type="hidden" name="id_programa" value="<c:out value="${datos.id_programa}"/>"/>
                </form>
                <a class="modificar" href="javascript: document.formadetalle<c:out value="${contador.count}"/>.submit()">Ver</a>
            </td>
        </tr>
    </form>
</c:forEach>
</tr>    
</table>  
<%@ include file="../Inferior.jsp" %>