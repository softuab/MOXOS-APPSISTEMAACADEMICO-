<%@ include file="../../Superior.jsp" %>
<script language='JavaScript' SRC="./validar.js">  </script>

<div class="titulo"> Cambio clave(PIN) </div>
<br>
<tabla>
  <form name=formavolver<c:out value="${contador.count}"/> method=post action='<c:url value="/cambioPinEstudiante/entrada.fautapo"/>'>
    <td>
      <div><a class="volver" href="javascript:document.formavolver<c:out value="${contador.count}"/>.submit();"> volver</a></div>
      <input type="hidden" name="bandera"     value='1'>
    </td>
  </form>
</table>

<form action="<c:url value="/cambioPinEstudiante/recomendaciones.fautapo"/>" method="POST">
  <table class="formulario">
    <tr>
      <th class="colh">Atenci&oacute;n se?or(a) estudiante: <c:out value="${nombres}"/></th>
    </tr>
    <tr>
      <th>RECOMENDACIONES:</th>
    </tr>
    <tr>
      <td class="colb"> <b>* Digite un m&aacute;ximo de 10 caracteres y un m&iacute;nimo de 6.</b></td>
    </tr>
    <tr>
      <td class="colb"> <b>* Utilize caracteres validos [A-Z],[a-z] y [1-9].</b></td>
    </tr>
    <tr>
      <td class="colb"> <b> * No utilize palabras del diccionario ni nombres propios.</b></td>
    </tr>
    <tr>
      <td class="colb"> <b> * Invente una palabra que pueda recordar.</b></td>
    </tr>
    <tr>
      <td class="colb"> <b> * Componga palabras e inserte n?meros.</b></td>
    </tr>
    <tr>
      <td align="center"><input class="aceptar" type=submit value="Buscar"></td> 
      <input type="hidden" name="id_estudiante" value="<c:out value="${id_estudiante}"/>" >    
      <input type="hidden" name="bandera"       value="<c:out value="${bandera}"/>" >    
    </tr>       
  </table>
</form>      

<%@ include file="../../Inferior.jsp" %>
  
  
  
  
  
  
  
  