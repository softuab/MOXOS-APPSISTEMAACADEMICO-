<%@ include file="../../Superior.jsp" %>
<jsp:useBean id="now" class="java.util.Date" />

<center>
<form method=post action=<c:url value="/convalidacionManual/registrarMateriasConvalidar.fautapo"/> >
<table width=800  border = 0  align=center >

<tr>
<td>
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
				<tr><p><p><p><p><p><p><p><p><p><p><p><p><p><td  align="center"><p><p><p><p><font size="5">UNIVERSIDAD   BOLIVIANA </font></td><tr>
				<tr><td   align="center"><font size="5">Universidad Autónoma del Beni</font></td><tr>
				<tr><td   align="center"><font size="5">"José Ballivián"</font></td><tr>
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
		    <tr><b><td   align="center"><font size="3">CERTIFICADO DE CONVALIDACIÓN</font></td></tr>
			
		</tr>
		<tr>
		    <tr><b><td   align="center"><font size="3">
			<c:if test="${buscarTipoConv.id_tipo_convalidacion ==1}" >
			Por: Traspaso
			</c:if>
			<c:if test="${buscarTipoConv.id_tipo_convalidacion ==2}" >
			Por: Cambio Carrera
			</c:if>
			<c:if test="${buscarTipoConv.id_tipo_convalidacion ==3}" >
			De: Plan a Plan
			</c:if></font></td></tr>
		</tr>
	</table>
	
	<br>
<!-- ======================================== CUERPO 1 =============================================================== -->
<table width = "90%" height= "20%" border = 0>
 <tr>
    <td P ALIGN= justify><font size="2">La carrera de <c:out value="${datosEstudiante.programa}"/> de la Universidad Autónoma del Beni 
	"José Ballivián", certifica que: La(s) asignatura(s) ha(n) sido convalidada(s) en el periodo <c:out value="${periodo}"/>/<c:out value="${gestion}"/>
	mediante Resolucion de Carrera Nº<c:out value="${resolucion}"/> a favor 
	de <c:out value="${datosEstudiante.paterno}"/>&nbsp; <c:out value="${datosEstudiante.materno}"/>&nbsp; <c:out value="${datosEstudiante.nombres}"/> 
	procedente <c:if test="${buscarTipoConv.id_tipo_convalidacion ==1}" >
	 de la <c:out value="${datosUniv.universidad}"/>.
	</c:if>
	<c:if test="${buscarTipoConv.id_tipo_convalidacion ==2}" >
    de la Carrera Origen <c:out value="${datosPrograma.programa}"/>.
	 </c:if>
	<c:if test="${buscarTipoConv.id_tipo_convalidacion ==3}" >
    del Plan Origen <c:out value="${plan_origen}"/>.
	 </c:if>
    </td>
    
 </tr>
</table>
<!-- =================================================================================================================== -->

<br>

<!-- =========================================== CUERPO 2 ============================================================== -->
<table class="tabla" width="100%" border = 1 align="center">

  <tr>
    <th><font size="2">Nº</font></th>
    <th><font size="2">Sigla Origen</font></th>
    <th><font size="2">Nombre Materia Origen</font></th>
	<th><font size="2">Nota</font></th> 
	<th><font size="2">Sigla</font></th>	
    <th><font size="2">Convalidada Por</font></th>
    <th><font size="2">Porcentaje</font></th>
	<th><font size="2">Modalidad</font></th>
  </tr>
  <c:forEach var="lista" items="${lMateriasSeleccionadas}" varStatus="contador">
        <tr>
			<td align="center"><c:out value="${contador.count}"/></td>
			<td><c:out value="${lista.sigla_origen}"/><input type="hidden" name="nota_origen<c:out value="${lista.id_materia}"/>" value="<c:out value='${lista.nota_origen}'/>">
	     	<td><c:out value="${lista.materia_origen}"/><input type="hidden" name="materia_origen<c:out value="${lista.id_materia}"/>" value="<c:out value="${lista.materia_origen}"/>"></td>
			<td align="center"><c:out value='${lista.nota_origen}'/><input type="hidden" name="nota_origen<c:out value="${lista.id_materia}"/>" value="<c:out value='${lista.nota_origen}'/>">
			<td><c:out value="${lista.sigla}"/><input type="hidden" name="sigla_origen<c:out value="${lista.id_materia}"/>" value="<c:out value="${lista.sigla_origen}"/>"></td>
			<td><c:out value="${lista.materia}"/><input type="hidden" name="materia_origen<c:out value="${lista.id_materia}"/>" value="<c:out value="${lista.materia_origen}"/>"></td>
			<td align="center"><c:out value='${lista.similitud}'/><input type="hidden" name="nota_origen<c:out value="${lista.id_materia}"/>" value="<c:out value='${lista.nota_origen}'/>">%</td>
			
			<c:if test="${lista.id_tipo_materia ==1}" >
				<td>SEMESTRAL</td>
			</c:if>
			<c:if test="${lista.id_tipo_materia ==2}" >
				<td>ANUAL</td>
			</c:if>
			<c:if test="${lista.id_tipo_materia ==3}" >
				<td>VESTIBULAR</td>
			</c:if>
	  </tr>
   </c:forEach>
</table>
<!-- ==================================================================================================================== -->
	
<br>

<!-- =========================================== CUERPO FECHAS ========================================================== -->
<table width="90%" align="center" border=0>
  <tr>
   
</tr>
  </table>

<!-- ======================================================================================================================== -->

<!-- ============================================= CUERPO FIRMAS ============================================================ -->
<table border = 0 width=100%>


		
			<tr>
				<td colspan="3"><br><br><br><br><br></td>
			</tr>
			<tr>
				<th align="center" width="35%">_____________________________________</td>
			    <th align="center" width="35%">____________________________________</td>
				</tr>
				<tr>
				<th align="center"  width="35%">Director de Carrera</td> 
				<th align="center"  width="35%">Vice-Rector de Pregrado</td> 
			</tr>
		
			
		
</table>

		<tr>
				<td width="100%" align="center"><font size="1">&nbsp;<a href = 'javascript: window.print()'><fmt:formatDate value="${now}" type="date" dateStyle="long"/></font></td>
		</tr>
</table>
</td>

</tr>
</table>

</center>

<%@ include file="../../Inferior.jsp" %>