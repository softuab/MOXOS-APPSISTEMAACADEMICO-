<%@ include file="../../Superior.jsp" %>

<div class="titulo"> Buscar proceso de negocio</div>
<br>
<center><h1>*** CONFIDENCIAL ***</h1></center>
<br>

<form name="forma" method="POST" action='<c:url value="/listarDetalleTramiteEjecutivo.fautapo"/>' >
  <table class="formulario">
    <tr>
      <th colspan="3">INTRODUZCA LOS DATOS</th>
    </tr>
    <tr>
      <td class="etiqueta">Gesti&oacute;n  <font color='red'>(*)</font> </td>
      <td class="etiqueta">::</td>
      <td><input type="text" name="gestion" value="<c:out value="${gestion}"/>" onblur='validar(this,"9")' size="10"></td>
    </tr>
    <tr>  
      <td class="etiqueta">N&uacute;mero de proceso <font color='red'>(*)</font> </td>
      <td class="etiqueta">::</td>
      <td><input type="text" name="correlativo" size="10"></td>
    </tr>
  </table>
  <center>
    <input type="submit" class="buscar" name="boton" value="Buscar">
  </center>
  <input type=hidden name="aplicacion" value='<c:url value="/"/>' >
</form>

<div class="nota">Los campos con <font color='red'>(*)</font>, son obligatorios.</div>

<%@ include file="../../Inferior.jsp" %>