<%@ include file="../../Superior.jsp" %>
<jsp:useBean id="now" class="java.util.Date" />

<table width="85%" align="center" border = "0">
  <!-- SE REPITE-->
  <tr>
    <td width="100%" align="center" cellspancin="0" cellpading="0">
	<hr>
<table align= "center">
  <tr>
    <td colspan="2" align="center"><font size="6"><b>NO VALIDO PARA TRAMITES</font></b></td>
  </tr>
</table> 
    <hr>
    <table width="100%" align="center">
      <tr>
        <td align="center"><label><h1>PLAN DE ESTUDIOS</h1></label></td>
      </tr>
    </table>
    <table width="97%">
      <tr>
        <th align="right">RU::</th>
        <td><c:out value="${datosEstudiante.id_estudiante}"/></td>
        <th align="right">ESTUDIANTE::</th>
        <td>
          <c:out value="${datosPersona.nombres}"/> &nbsp; 
          <c:out value="${datosPersona.paterno}"/> &nbsp;
          <c:out value="${datosPersona.materno}"/>
        </td>
      </tr>
      <tr>
        <th align="right">CARRERA::</th>
        <td><c:out value="${datosPrograma.programa}"/></td>
        <th align="right">FACULTAD::</th>
        <td><c:out value="${datosFacultad.facultad}"/></td>
      </tr>
      <tr>
        <th align="right">PLAN ::</th>
        <td><c:out value="${datosEstudiante.id_plan}"/></td>
        <th align="right">NIVEL ACADEMICO::</th>
        <td><c:out value="${datosGrados.grado_academico}"/></td>
      </tr>
    </table>
    <br>
    </td>
  </tr>
  <!-- HASTA AQUI SE REPITE-->
  <tr>
    <td>
      <table class="tabla" width="100%">
        <thead>
        <tr>
          <th>NIVEL</th>
          <th>SIGLA</th>
          <th>NOMBRE DE LA ASIGNATURA</th>
          <th>H.T.</th>
		  <th>H.P.</th>
		  <th>T.H.</th>
          <th>PRE-REQUISITO</th>
        </tr>
	</thead>
        <c:set var="id_mencion_ant" value="0"/>
        <c:set var="id_nivel_ant" value="0"/>
        <c:forEach var="lista" items="${lPlanDeEstudios}" varStatus="contador">
          <c:if test="${(id_mencion_ant != lista.id_mencion) && (lista.id_mencion != 0)}">
            <tr>
              <th colspan="5">MENCION :: <c:out value="${lista.mencion}"/></th>
            </tr>
          </c:if>
          <c:if test="${id_nivel_ant != lista.nivel_academico}">
            <tr>
              <td>NIVEL :: <c:out value="${lista.nivel_academico}"/></td>
              <td colspan="4"></td>
            </tr>
          </c:if>
          <td></td>
          <td valign="top"><c:out value="${lista.sigla}"/></td>
          <td valign="top"><c:out value="${lista.materia}"/></td>
          <td valign="top"><c:out value="${lista.hrs_teoricas}"/></td>
		  <td valign="top"><c:out value="${lista.hrs_practicas}"/></td>
		  <td valign="top"><c:out value="${lista.hrs_practicas+lista.hrs_teoricas}"/></td>
          <td valign="top"><c:out value="${lista.materias_anteriores}" /></td>
        </tr>
        <c:set var="id_mencion_ant" value="${lista.id_mencion}"/>
        <c:set var="id_nivel_ant" value="${lista.nivel_academico}"/>
      </c:forEach>
    </table>
    </td>
  </tr>
</table>

<br><br>
<table width="100%">
  <tr>
    <th colspan="3"> <a href='javascript: window.print()'><c:out value='${datosInstitucionsede.localidad}'/>, <fmt:formatDate value="${now}" type="date" dateStyle="long"/></a></th>
  </tr>
  <tr>
    <td colspan="3"><br><br><br><br><br><br></td>
  </tr>

</table>

<%@ include file="../../Inferior.jsp" %>