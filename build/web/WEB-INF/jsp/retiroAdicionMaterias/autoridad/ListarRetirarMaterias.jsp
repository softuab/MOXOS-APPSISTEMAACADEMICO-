<%@ include file="../../Superior.jsp" %>

<script language='JavaScript' SRC="../validar.js">  </script>

<div class="titulo">Retiro y adici&oacute;n de materias</div>
<div class="volver"><a href="javascript:history.back();">Volver</a></div>
<br>
<form method=post action=<c:url value="/retiroAdicionMaterias/confirmarAccionProgramacionMaterias.fautapo"/> >

<table class="tabla">
<tr>
  <th>RU</th>
  <th>NOMBRES</th>
  <th>PLAN</th>
  <th>CARRERA</th>
  <th class=colh>TIPO PROGRAMACION</th>
  <th class=colh>TIPO EVALUACION</th>
  <th class=colh>GESTION</th>
  <th class=colh>PERIODO</th>
<tr>
  <td class=colb><c:out value="${datosEstudiante.id_estudiante}"/></td>
  <td class=colb><c:out value="${datosPersona.paterno}"/> &nbsp; <c:out value="${datosPersona.materno}"/> &nbsp; <c:out value="${datosPersona.nombres}"/></td>
  <td class=colb><c:out value="${datosEstudiante.id_plan}"/></td>
  <td class=colb><c:out value="${datosPrograma.programa}"/></td>
  <td class=colb align="center"> 
    <c:forEach var="parametro" items="${lParametros}" >
     <c:out value="${parametro.tipo_programacion}"/><br>
    </c:forEach>
  </td>
  <td class=colb><c:out value="${datosTipoEval.tipo_evaluacion}"/></td>
  <td class=colb><c:out value="${gestion}"/> </td>
  <td class=colb><c:out value="${periodo}"/> </td>
</table>
<br>

<table class="tabla">
<tr align=center>
  <th colspan="7">RETIRO DE MATERIAS</th> 
</tr>
<tr align=center>
  <th>ELEGIR</th>
  <th>NIVEL</th>
  <th>SIGLA</th>
  <th>MATERIA</th>
  <th>GRUPO</th>
  <th>TIPO EVALUACION</th>
  <th>DOCENTE <br> ASIGNADO</th>
<c:set var="nombremateria" value=""/>  
<c:forEach var="materias" items="${lMateriasRetiro}" varStatus="contador">
<c:if test="${materias.id_modelo_ahorro > 0}">
  <c:if test="${materias.materia != nombremateria}">
  <!-- ********** Esto es para el efecto ************ -->
  <tr <c:if test="${(contador.count mod 2) == 0}">bgColor="#FFFFD9" %-- Est&acute;tico :( --%</c:if> onMouseOver="this.className='sobreFila'" onmouseout="this.className=''">
  <!-- ********** Fin  efecto ************ -->    
    <td></td>
    <td align="center"><b><c:out value="${materias.nivel_academico}"/></b></td>
    <td align="center"><b><c:out value="${materias.sigla}"/></b></td>
    <td><b><c:out value="${materias.materia}"/></b></td>
    <td> </td>
    <td> </td>
    <c:set var="nombremateria" value="${materias.materia}"/>
   </tr>
   </c:if>
</c:if>
  <!-- ********** Esto es para el efecto ************ -->
  <tr <c:if test="${(contador.count mod 2) == 0}">bgColor="#FFFFD9" %-- Est&acute;tico :( --%</c:if> onMouseOver="this.className='sobreFila'" onmouseout="this.className=''">
  <!-- ********** Fin  efecto ************ -->   
    <td  align=center>
      <input type=checkbox name='materia' VALUE="<c:out value="${materias.id_programacion}"/>:<c:out value="${materias.id_materia}"/>:<c:out value="${materias.id_modelo_ahorro}"/>:<c:out value="${materias.id_grupo}"/>" >
    </td>
    
    <c:if test="${materias.id_modelo_ahorro > 0}">
    <td class="colb" align=center> --
    </td>
    <td class="colb" align=center> --
    </td>  
    <td class="colb">
      <c:out value="${materias.modelo_ahorro}"/>
    </td>
    <td class="colb" align=center>
      <c:out value="${materias.grupo}"/>
    </td>
    <td class="colb" align=center>
      <c:out value="${materias.nombres}"/>
    </td>  
    </c:if>
    <c:if test="${ materias.id_modelo_ahorro <= 0}">
    <td align=center>
      <b><c:out value="${materias.nivel_academico}"/></b>
    </td>
    <td align=center>
      <b><c:out value="${materias.sigla}"/></b>
    </td>
    <td>
      <b><c:out value="${materias.materia}"/></b>
    </td>
    <td align=center>
      <b><c:out value="${materias.grupo}"/></b>
    </td>  
    <td align=center>
      <b><c:out value="${materias.tipo_evaluacion}"/></b>
    </td>  
    <td align=center>
      <b><c:out value="${materias.nombres}"/></b>
    </td>  
    </c:if>
    </td>
    
  </tr>
</c:forEach>
<tr>
  <td colspan="7" align="center">
    <input class="aceptar" type=submit value="Aceptar">
  </td>
</tr>
</table>
<input type=hidden name="id_tipo_periodo"    value=<c:out value="${id_tipo_periodo}"/> >
<input type=hidden name="id_estudiante"      value=<c:out value="${datosEstudiante.id_estudiante}"/> >
<input type=hidden name="gestion"            value=<c:out value="${gestion}"/> >
<input type=hidden name="periodo"            value=<c:out value="${periodo}"/> >
<input type=hidden name=accion               value='<c:out value="${accion}"/>' >
<input type=hidden name=total_materias       value="0">
<input type=hidden name="id_tipo_evaluacion" value=<c:out value="${id_tipo_evaluacion}"/> >
</form>

<%@ include file="../../Inferior.jsp" %>