<%@ include file="../../Superior.jsp" %>
<body onload='inicio(document.forma.gestion)'>

<script language='JavaScript' SRC="./validar.js"></script>
<body onload='inicio(document.forma.clave)'>
  <div class="titulo">Estudiantes Matriculados Por Programa</div>
  <br>
  <form name=forma action="<c:url value="/matriculadosPorPrograma/ListarProgramasPlanes.fautapo"/>" method="POST">
    <table class="formulario">
      <tr>
        <th colspan="3" align="center">INTRODUZCA LOS DATOS</th>
      </tr>
      <tr>
        <td class="etiqueta">Usuario</td>
        <td class="etiqueta">::</td>
        <td><c:out value="${usuario}" /></td>
      </tr>
      <tr>
        <td class="etiqueta">Gesti&oacute;n</td>
        <td class="etiqueta">::</td>
        <td><input type="text" name="gestion" value='<c:out value="${gestion}" />' onblur='validar(gestion,"9")' size="4" maxlength="4"></td>
      </tr>
      <tr>
        <td class="etiqueta">Periodo</td>
        <td class="etiqueta">::</td>
        <td><input type="text" name="periodo" value='<c:out value="${periodo}" />' onblur='validar(periodo,"9")' size="1" maxlength="1"> </td>
      </tr>
      <tr>
        <td colspan="3" align="center"><input class="siguiente" type="submit" value="Buscar"></td>
	<input type="hidden" name="nombres"  value="<c:out value='${usuario}'/>">
      </tr>
    </table>
  </form>
</body>

<%@ include file="../../Inferior.jsp" %>