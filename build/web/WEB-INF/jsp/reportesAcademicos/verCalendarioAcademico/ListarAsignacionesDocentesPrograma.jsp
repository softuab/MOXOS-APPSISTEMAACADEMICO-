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
	PERIODO: <c:out value="${gestion}"/>/<c:out value="${periodo}"/>
 </tr>
</table>
<!-- =================================================================================================================== -->

<br>

<!-- =========================================== CUERPO 2 ============================================================== -->
<table class="tabla" width="100%" border = 1 align="center">
   
    <table class="tabla" border="0">
      <tr>
       <th><font size="2">Tipo evaluacion</font></th>
		<th><font size="2">Tipo nota</font></th>
		<th><font size="2">Nro Tipo nota</font></th>
		<th><font size="2">Fecha inicio</font></th>
		<th><font size="2">Fecha limite</font></th>
		
		</tr>
      <c:forEach var="calificacion" items="${lcalificacionCalendario}" varStatus="contador">
	  <tr>
	  <td><c:out value="${calificacion.tipo_evaluacion}"/></td>
	        <td><c:out value="${calificacion.tipo_nota}"/></td>
			<td align="center"><c:out value="${calificacion.nro_tipo_nota}"/></td>
			<td><c:out value="${calificacion.fecha_inicio}"/></td>
			<td><c:out value="${calificacion.fecha_limite}"/></td>
			
			</tr>
    </c:forEach>

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