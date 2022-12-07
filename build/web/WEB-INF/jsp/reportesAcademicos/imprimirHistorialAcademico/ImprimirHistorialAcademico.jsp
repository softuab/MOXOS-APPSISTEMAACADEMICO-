<%@ include file="../../Superior.jsp" %>
<jsp:useBean id="now" class="java.util.Date" />
<table width="85%" align="center" border = "0">
  <!-- SE REPITE-->
  <thead>
  <tr>
 
    <td width="100%" height = "70%" align="center" cellspancin="0" cellpading="0">
<hr>
<table align= "center">
  <tr>
    <td colspan="2" align="center"><font size="6"><b>NO VALIDO PARA TRAMITES</font></b></td>
  </tr>
</table> 
	<hr>
<table align= "center">
  <tr>
    <td colspan="2" align="center"><font size="4"><b>HISTORIAL ACADÉMICO</font></b></td>
  </tr>
</table>
<hr>  
</td>
  </tr>
  
  
  <!-- HASTA AQUI SE REPITE-->
  
  <tr>
    <td> 
	<br>
	<br>
<table width = "100%" border = 0 align= "center"> 
<tr>
    <td><b>Facultad</b></td>
    <td><c:out value="${datosFacultad.facultad}"/></td>
 </tr>
 <tr>
    <td><b>Carrera</b></td>
    <td colspan="3"><c:out value="${datosPrograma.programa}"/></td>

    <td><b>Nivel</b></td>
    <td ><c:out value="${datosGrados.grado_academico}"/></td>
 
 </tr>
 <tr>
    <td><b>Apellidos y Nombres</b></td>
      <td colspan="3">
      <c:out value="${datosPersona.paterno}"/> &nbsp;
      <c:out value="${datosPersona.materno}"/> &nbsp;
      <c:out value="${datosPersona.nombres}"/>
      </td>
      
    <td><b>Plan</b></td>
    <td><c:out value="${datosEstudiante.id_plan}"/></td>
 
  </tr>
  <tr>
     <td><b>C.I.</b></td>
     <td colspan="3"><c:out value="${datosPersona.dip}"/></td>
  </tr>
<tr>
     <td><b>R.U.</b></td>
     <td colspan="3"><c:out value="${datosEstudiante.id_estudiante}"/></td>
  </tr>
</table>

    <br>
    </td>
  </tr>
  </thead>
  <tr>  
    <td align="center" >
    <table class="tabla" width="100%" border = 0 align= "center" >
      <thead>
      <tr>
        <th>NRO.</th>
        <th>SIGLA</th>
        <th>MATERIA</th>
        <th>TIPO EVAL</th>
        <th>GESTION</th>
        <th>NOTA</th>
      </tr>
      </thead>
      <c:set var="nivel_academico_ant" value="0"/>
      <c:forEach var="lista" items="${lMaterias}" varStatus="contador">
      <c:if test="${nivel_academico_ant != lista.nivel_academico}">
        <tr>
          <td colspan="6">NIVEL :: <c:out value="${lista.nivel_academico}"/></td>
        </tr>
      </c:if>
      <tr>
        <td><c:out value="${contador.count}"/></td>
        <td><c:out value="${lista.sigla}"/></td>
        <td><c:out value="${lista.materia}"/></td>
        <td><c:out value="${lista.tipo_evaluacion}"/></td>
        <c:if test="${lista.gestion != 0}">
          <td><c:out value="${lista.periodo}"/>-<c:out value="${lista.gestion}"/></td>
          <td><c:out value="${lista.nota}"/></td>
        </c:if>
        <c:if test="${lista.gestion == 0}">
          <td></td>
          <td></td>
        </c:if>
      </tr>
      <c:set var="nivel_academico_ant" value="${lista.nivel_academico}"/>
      </c:forEach>
    </table>
    </td>
  </tr>  
</table>
<br>
<br>
<br>
<table>
 <tr>
    <td align="center" colspan="3" width="8%">_____________________________________</td>
    <td align="center" width="8%">____________________________________</td>
       <p>
    <p>
    <p>
    <p>
    <p>
    <p>
  </tr>
</table>
 <p><p><p><p> 
 
 

<table width="85%" align="center" border = 0>

 <tr>
 <br><br><br><br>
    <td>TOTAL ASIGNATURAS DEL PLAN : <c:out value="${total_materias_plan}"/></td>
    <td>TOTAL ASIGNATURAS APROBADAS : <c:out value="${total_materias_aprobadas}"/></td>
    <td>PROMEDIO DE CALIFICACIONES : <c:out value="${promedio}"/></td>
  </tr>
  <tr>
    <td colspan="2" algin="right">
      <c:out value='${datosInstitucionsede.localidad}'/>, <a href='javascript: window.print()'><fmt:formatDate value="${now}" type="date" dateStyle="long"/>
    </td>
  </tr>
</table>
<%@ include file="../../Inferior.jsp" %>
