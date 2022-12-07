<%@ include file="../../Superior.jsp" %>
<jsp:useBean id="now" class="java.util.Date" />
<center>
<table width=800  border = 0  align=center >

<tr>
<td align=center>
	<DIV ID="cont1" STYLE="position:center;top:10px;left:50px">
	<IMG src='<c:url value="/"/>imagenes/certificados/uabcdc4.jpg' width=750 height="1050" border=0>
</DIV>
<DIV ID=2"cont1" STYLE="position:absolute;top:10px;left:50x">

<table border =0 width=800 >
<tr>
<td>


<!-- ========================================== TITULO ============================================================== -->
<p><p><p><p><p><p><p><p><p><p>
<table width="100%" border =0>

<!-- 


=== -->
 <td width="0%" align=center>
              <c:if test="${!empty logo}">
                <IMG SRC="<c:url value='${logo}' />" width="100" height="850" border="0" ALT="logo institucion"><br>
              </c:if>
    </td>
        <td  width = "100%"  align="center">
			<p><p><p><p><p><p><p><p><p><p><p><p><p><p><p><p><p><p><p><p><p><p><p><p>
			<table  width="100%" heigth="10%" cellpading ="1" cellspacing ="0" border = 0 >
				<p><p><p><p><p><p><p><p>      
				<tr><p><p><p><p><p><p><p><p><p><p><p><p><p><td  align="center"><p><p><p><p><font size="5">UNIVERSIDAD   BOLIVIANA</font></td><tr>
				<tr><td   align="center"><font size="5">Universidad Autonoma del Beni</font></td><tr>
				<tr><td   align="center"><font size="5">"Jose Ballivian"</font></td><tr>
			</table>
		</td>
</table>

<!-- ================================================================================================================= -->

<center>
<!-- ============================================ TITULO 2 =========================================================== -->
	<table width="100%">
		<br>
		<br>
	</table>
		<table width="100%">
		
		<tr>
		    <tr><b><td   align="center"><font size="3">CALENDARIO ACADEMICO</font></td></tr>
			
		</tr>
	</table>
	<br>
	<br>
<!-- ======================================== CUERPO 1 =============================================================== -->
<table width = "90%" height= "20%" border = 0 >     
 <tr>   
	<br>
	<br>
    CARRERA: <c:out value="${datosPrograma.programa}"/> 
	<br>
	PERIODO: <c:out value="${periodo}"/>/<c:out value="${gestion}"/>
	<tr>
        <td>TIPO EVALUACION::</td>
	  	 
		  <td> <c:if test ="${evaluacion == 1}">REGULAR</c:if> 
		       <c:if test ="${evaluacion == 3}">CURSO DE VERANO</c:if> 
		       <c:if test ="${evaluacion == 4}">EXAMEN DE MESA</c:if> 
		  </td>
		 <tr>  
 </tr>
</table>
<!-- =================================================================================================================== -->

<br>

<!-- =========================================== CUERPO 2 ============================================================== -->
	<table class="tabla" width="100%">
  <thead>
      <tr>
        <th>NRO</th>
	    <th>NIVEL<br>ACADEMICO</th>
        <th>GRUPO</th>
        <th>SIGLA</th>
        <th>MATERIA</th>
	    <th>DOCENTE</th>
		<th>C.I.</th>
	    <th>TIPO DE NOTA</th>
	    <th>NRO. TIPO DE NOTA</th>
	    <th>FECHA LIMITE</th>
	  </tr>
      <c:forEach var="asignacion" items="${lcalificacionCalendario}" varStatus="contador">
        <tr <c:if test="${(contador.count mod 2) == 0}">bgColor="#FFFFD9" %-- Est&acute;tico :( --%</c:if> onMouseOver="this.className='sobreFila'" onmouseout="this.className=''">
	  <td><c:out value="${contador.count}"/></td>
	  <td align="center"><c:out value="${asignacion.nivel_academico}"/></td>
          <td align="center"><c:out value="${asignacion.grupo}"/></td>
          <td><c:out value="${asignacion.sigla}"/></td>
	  <td><c:out value="${asignacion.materia}"/></td>
	  <td><c:out value="${asignacion.paterno}"/>&nbsp;<c:out value="${asignacion.materno}"/>&nbsp;<c:out value="${asignacion.nombres}"/></td>
	  <td><c:out value="${asignacion.dip}"/></td>
	  <td><c:out value="${asignacion.tipo_nota}"/></td>
	  <td><c:out value="${asignacion.nro_tipo_nota}"/></td>
	   <td><c:out value="${asignacion.fecha_limite}"/></td>
	  
      </tr>
    </c:forEach>
	</tbody>
  </table>

<!-- ==================================================================================================================== -->
	
<br>

<!-- ============================================= CUERPO FIRMAS ============================================================ -->

		<tr>
				<td width="100%" align="center"><font size="1">&nbsp;<a href = 'javascript: window.print()'><fmt:formatDate value="${now}" type="date" dateStyle="long"/></font></td>
		</tr>
</table>
</td>

</tr>
</table>

</center>

<%@ include file="../../Inferior.jsp" %>