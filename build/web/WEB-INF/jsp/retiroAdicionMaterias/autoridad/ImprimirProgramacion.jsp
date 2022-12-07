<%@ include file="../../Superior.jsp" %>
<jsp:useBean id="now" class="java.util.Date" />

<table width="100%">
  <tr>
    <td width="14%" align="center">
      <form  name="fvolver" method='post' action="<c:url value='/retiroAdicionMaterias/comprobarEntrada.fautapo'/>">
        <input type="hidden" name="gestion"          value="<c:out value='${gestion}'/>" >
        <input type="hidden" name="periodo"          value="<c:out value='${periodo}'/>" >
        <input type=hidden name="id_tipo_evaluacion" value=<c:out value="${id_tipo_evaluacion}"/> >
        <input type=hidden name="id_programa"        value=<c:out value="${id_programa}"/> >
        <a href="javascript:document.fvolver.submit();">
	  <IMG SRC="<c:url value='${datosInstitucion.logo}'/>" border="0" ALT="logo institucion">
	</a>
      </form>
    </td>
    <td width="72%" align="center">
      <table width="100%" heigth="100%" cellpading="2" cellspacing="0" >
        <tr>
          <td align="center"><h1><b><c:out value='${datosInstitucion.institucion}'/></h1></td>
        <tr>
        <tr>
          <td align="center"><font size="3"><b><c:out value='${datosInstitucion.localidad}'/> - <c:out value='${datosInstitucion.departamento}'/> - <c:out value='${datosInstitucion.pais}'/></b></font></td>
        <tr>
        </tr>
          <td align="center"><c:out value='${datosInstitucion.actividad}'/></td>
        </tr>
      </table>
    </td>
    <td width="14%">
      Fecha : <a href='javascript: window.print()'><fmt:formatDate value="${now}" pattern="${formatoFecha}"/></a> 
    </td>
  </tr>
</table>
<hr>
<br>
<center>
<h2>RETIRO DE MATERIAS - ADICION DE MATERIAS</h2>
<h3>Datos del alumno</h3>
<table>
  <tr>
    <th>RU</th>
    <th>::</th>
    <td><c:out value="${datosEstudiante.id_estudiante}"/>
    <th>CI</th>
    <th>::</th>
    <td><c:out value="${datosEstudiante2.dip}"/>
    <th>Estudiante</th>
    <th>::</th>
    <td>
      <c:out value="${datosEstudiante2.nombres}"/> &nbsp;
      <c:out value="${datosEstudiante2.paterno}"/> &nbsp;
      <c:out value="${datosEstudiante2.materno}"/>
    </td>
  </tr>
  <tr>
    <th>Tipo</th>
    <th>::</th>
    <td><c:out value="${datosEstudiante2.tipo_estudiante}"/>
    <th>Plan</th>
    <th>::</th>
    <td><c:out value="${datosEstudiante.id_plan}"/>
    <th>Programa</th>
    <th>::</th>
    <td><c:out value="${datosPrograma.programa}"/>
  </tr>
</table>
<br>

<h3>Materias Programadas </h3>
<h3>Gesti&oacute;n: <c:out value="${periodo}"/>-<c:out value="${gestion}"/></h3>
<table border="1" cellpading="0" cellspacing="0">
  <tr>
    <th>NRO.</th>
    <th>NIVEL</th>
    <th>SIGLA</th>
    <th>MATERIA</th>
    <th>GRUPO</th>
    <th>TIPO EVALUACION</th>
    <th>FECHA</th>
    <th>DOCENTE</th>
  </tr>
  <c:forEach var="lista" items="${lProgramacion}" varStatus="contador">
    <tr>
      <td align="center"><c:out value="${contador.count}"/></td>
      <td align="center"><c:out value="${lista.nivel_academico}"/></td>
      <td><c:out value="${lista.sigla}"/></td>
      <td><c:out value="${lista.materia}"/></td>
      <td align="center"><c:out value="${lista.grupo}"/></td>
      <td align="center"><c:out value="${lista.tipo_evaluacion}"/></td>
      <td><fmt:formatDate value="${lista.fec_modificacion}" pattern="${formatoFecha}"/></td>
      <td><c:out value="${lista.nombres}"/></td>
   </tr>
 </c:forEach>
</table>
</center>

<br><br><br><br><br><br>
<table border="0" width="100%">
  <tr>
    <td align="bottom" align="right">
      <a href='javascript: window.print()'>
        <fmt:formatDate value="${now}" pattern="${formatoFecha} ${formatoHora}"/> &nbsp; [<c:out value="${cliente.nombres}"/>]
      </a>
    </td>
  </tr>
</table>

<%@ include file="../../Inferior.jsp" %>