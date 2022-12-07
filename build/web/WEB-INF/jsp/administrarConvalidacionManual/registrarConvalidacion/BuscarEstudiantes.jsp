<%@ include file="../../Superior.jsp" %>

<div class="titulo">Convalidaci&oacute;n Manual</div>
<br>
<table>
  <tr>    
    <td>
      <form name="fvolver" action="<c:url value='entrada.fautapo'/>" method="post">
        <input type="hidden" name="gestion" value="<c:out value='${gestion}'/>">
        <input type="hidden" name="periodo" value="<c:out value='${periodo}'/>">
	<input type="hidden" name="id_programa" value="<c:out value='${id_programa}'/>">
      <div> <a class="volver" href="javascript:document.fvolver.submit();"> Volver</a> </div>
    </form>
    </td>
  </tr>
</table>

<table class="tabla">
  <tr>
    <th>GESTION</th>
    <th>PERIODO</th>
    <th>PROGRAMA</th>
  </tr>
 <tr>
    <td><c:out value='${gestion}'/></td>
    <td><c:out value='${periodo}'/></td>
    <td><c:out value='${datosPrograma.programa}'/></td>
  </tr> 
</table>  
<br>
<form name=forma method="POST" action='<c:url value="/convalidacionManual/listarPlanEstudiante.fautapo"/>' >
<table class="formulario">
  <tr>
    <td>
    <table width=100%>
      <tr>
        <td>
        <fieldset>
          <legend>Introduzca Registro Universitario</legend>
	    <table align=right>
    	      <tr>
                <td class="etiqueta">RU</td>
	        <td class="etiqueta">::</td>
                <td><input type=text name="id_estudiante" maxlength=8/></td>
      	        <td><input type=submit name="buscar" value='Buscar' class="buscar"></td>
              </tr>
            </table>
         </fieldset>
         </td>
        </tr>
      </table>
    </td>
  </tr>
  <tr>
    <td>
    <table width=100%>
      <tr>
        <td>
        <fieldset>
          <legend>Introduzca C&eacute;dula de Identidad</legend>
          <table align=right>
            <tr>
              <td class="etiqueta">CI</td>
              <td class="etiqueta">::</td>	
              <td><input type=text name="ci" maxlength=35 onblur='validar(this,"A9")'></td>
    	      <td><input type=submit name="buscar" value='Buscar' class="buscar"></td>
            </tr>
          </table>
        </fieldset>
        </td>
      </tr>
    </table>
    </td>
  </tr>
  <tr>    
    <td>
    <table width=100%>
      <tr>
        <td>
        <fieldset>
          <legend>Introduzca un Nombre</legend>
          <table align=right>
            <tr>
              <td class="etiqueta">Nombres</td>
              <td class="etiqueta">::</td>	
              <td><input type=text name="nombres" maxlength=35 onblur='validar(this,"A9")'></td>
              <td><input type=submit name="buscar" value='Buscar' class="buscar"></td>
            </tr>
          </table>
        </fieldset>
        </td>
      </tr>
    </table>
    </td>
  </tr>
  <input type="hidden" name="gestion" value="<c:out value='${gestion}'/>">
  <input type="hidden" name="periodo" value="<c:out value='${periodo}'/>">
  <input type="hidden" name="id_programa" value="<c:out value='${id_programa}'/>">
</table>
</form>

<%@ include file="../../Inferior.jsp" %>