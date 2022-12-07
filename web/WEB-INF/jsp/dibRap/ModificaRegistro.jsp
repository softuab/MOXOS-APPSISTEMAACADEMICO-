<%@ include file="../Superior.jsp" %>

<div class="titulo">Modificando <c:out value="${tabla.etiqueta}" /></div>
<div class="volver"><a href="javascript:history.back();">Volver</a></div>

<body onLoad="iniciar(); inicio(document.forma._foqueame);">
<form name='forma' method='post' action="<c:url value='/dibRap/confirmarModificacion.fautapo'/>">

<table class="formulario">
  <tr>
    <th colspan="3">VERIFIQUE LOS DATOS
      <input type="text" name="_foqueame" readonly="readonly" style="position:absolute; left:-100px; top:-100px">
    </th>
  </tr>
  <c:forEach var="listaCampos" items="${listaCampos}" varStatus="contador">
    <c:if test="${listaCampos.x == 1}" >
      <tr>
    </c:if>
      <td class="etiqueta"><c:out value="${listaCampos.etiqueta}"/>
        <c:if test='${fn:indexOf(listaCampos.permiso, "o") > -1}'><font color='red'>(*)</font></c:if>
      </td>
      <td class="etiqueta">::</td>
      <td>


        <!--  INICIO JOJO  -->
        <c:if test="${(!empty listaCampos.combo) and (listaCampos.id_componente == 1)}">
         <table>
            <tr>
              <td>
          <SELECT id='<c:out value="${listaCampos.campo}"/>' NAME='<c:out value="${listaCampos.campo}"/><c:if test="${fn:indexOf(listaCampos.permiso, 'm') == -1}">xxx</c:if>'
	    size='<c:out value="${listaCampos.filas}"/>' onChange="poblar('<c:out value='${listaCampos.campo}'/>', this.options[this.selectedIndex].value )"
            <c:if test='${fn:indexOf(listaCampos.permiso, "m") == -1}'>
	      style="display : none"> </SELECT>
              <c:if test="${!empty listaCampos.combo}">
                <c:out value="${listaCampos.combo[1].campo}"/>
                <input type="hidden" name="<c:out value='${listaCampos.campo}'/>" value="<c:out value='${listaCampos.combo[1].campo}' />"
              </c:if>
            </c:if>
	  />
          </td>
          <td>
            <div id="div_<c:out value='${listaCampos.id_campo}'/>" style="position:absolute; visibility:hidden; background-color:#FFFFCC; z-index:5" >
                 <table border='1'>
                   <tr><td>
                       <input type="text" id="condicion_<c:out value='${listaCampos.id_campo}'/>" >
                     </td><td>
                       <a href='javascript:llamarAjax("<c:out value='${listaCampos.id_campo}'/>","1",document.getElementById("condicion_<c:out value='${listaCampos.id_campo}'/>").value,document.getElementById("estatico_<c:out value='${listaCampos.id_campo}'/>").value);muestra_valor("<c:out value='${listaCampos.id_campo}'/>");cerrarVentana("div_<c:out value='${listaCampos.id_campo}'/>"); iniciar_pagina("pagina_<c:out value='${listaCampos.id_campo}'/>",document.getElementById("estatico_<c:out value='${listaCampos.id_campo}'/>").value);limpiarHijo("<c:out value='${listaCampos.campo}'/>");'>Filtrar</a>
                     </td>
                   </tr>
                 </table>
               </div>
                 <a href='javascript: abrirVentana("div_<c:out value='${listaCampos.id_campo}'/>")'>Buscar</a>::<div id="busca_<c:out value='${listaCampos.id_campo}'/>"></div>
             </td>
          </tr>
          <tr>
            <td colspan='2' align='center'>
                <input type='hidden' id="estatico_<c:out value='${listaCampos.id_campo}'/>" value="" >
                <input type='hidden' id="pagina_<c:out value='${listaCampos.id_campo}'/>" value="<c:out value='${listaCampos.pagina}'/>" >
                <a id="ant_<c:out value='${listaCampos.id_campo}'/>" href='javascript:pagina_ant("pagina_<c:out value='${listaCampos.id_campo}'/>"); llamarAjax("<c:out value='${listaCampos.id_campo}'/>",document.getElementById("pagina_<c:out value='${listaCampos.id_campo}'/>").value,document.getElementById("condicion_<c:out value='${listaCampos.id_campo}'/>").value,document.getElementById("estatico_<c:out value='${listaCampos.id_campo}'/>").value); limpiarHijo("<c:out value='${listaCampos.campo}'/>");' >&lsaquo; Anterior</a>
                <a id="sig_<c:out value='${listaCampos.id_campo}'/>" href='javascript:pagina_sig("pagina_<c:out value='${listaCampos.id_campo}'/>"); llamarAjax("<c:out value='${listaCampos.id_campo}'/>",document.getElementById("pagina_<c:out value='${listaCampos.id_campo}'/>").value,document.getElementById("condicion_<c:out value='${listaCampos.id_campo}'/>").value,document.getElementById("estatico_<c:out value='${listaCampos.id_campo}'/>").value); limpiarHijo("<c:out value='${listaCampos.campo}'/>")' >Siguiente &rsaquo;</a>
              </td>
            </tr>
          </table>
        </c:if>
  
    <c:if test='${fn:indexOf(listaCampos.permiso, "m") == -1}'>
          <c:if test="${empty listaCampos.combo}">
            <c:out value="${matrizDatos[contador.index]}" />
            <input type="hidden" name="<c:out value='${listaCampos.campo}'/>" value="<c:out value='${matrizDatos[contador.index]}' />" >
          </c:if>
	</c:if>

        <c:if test='${fn:indexOf(listaCampos.permiso, "m") > -1}'>
          <c:set var="fin" value="1" />
          <c:if test="${!empty listaCampos.combo}">
            <c:set var="fin" value="${fn:length(listaCampos.combo) - 1}" />
          </c:if>
  
          <c:forEach var="_i" begin="1" end="${fin}">
            <c:set var="valores" value="${matrizDatos[contador.index]}" />
            <c:if test="${!empty listaCampos.combo}">
              <c:set var="id_valor" value="${listaCampos.combo[_i].id_campo}" />
              <c:set var="valores" value="${listaCampos.combo[_i].campo}" />
            </c:if>

            <!-- fmt:formatDate value="${valores}" pattern="dd-MM-yyyy"/ -->
	    <c:choose>
              <c:when test="${(empty listaCampos.combo) and (listaCampos.id_componente == 1)}">
                <input type="text" name='<c:out value="${listaCampos.campo}"/>' value='<c:out value="${valores}"/>' maxlength='<c:out value="${listaCampos.caracteres}"/>' size='<c:out value="${listaCampos.columnas}"/>'/> <br>
              </c:when>
              <c:when test="${listaCampos.id_componente == 2}">
                <textarea name='<c:out value="${listaCampos.campo}"/>' cols='<c:out value="${listaCampos.columnas}"/>' rows='<c:out value="${listaCampos.filas}"/>'><c:out value="${valores}"/></textarea> <br>
              </c:when>
              <c:when test="${listaCampos.id_componente == 3}">
                <input type="text" name='<c:out value="${listaCampos.campo}"/>' value='<c:out value="${valores}"/>' maxlength='<c:out value="${listaCampos.caracteres}"/>' size='<c:out value="${listaCampos.columnas}"/>'/><a href="javascript:showCal('<c:out value="${listaCampos.campo}"/>')"><img src="../imagenes/dibRap/calendario.jpeg" border="0" /></a>
              </c:when>
              <c:when test="${listaCampos.id_componente == 4}">
                <input type="radio" name='<c:out value="${listaCampos.campo}"/>' value="true" <c:if test="${valores == 'Verdadero'}">checked</c:if> />S� &nbsp; <input type="radio" name='<c:out value="${listaCampos.campo}"/>' value="false" <c:if test="${valores == 'Falso'}">checked</c:if> />No <br>
              </c:when>
              <c:when test="${listaCampos.id_componente == 5}">
                <input type="radio" name='<c:out value="${listaCampos.campo}"/>' value='<c:out value="${id_valor}" />' /><c:out value="${valores}"/> <br>
              </c:when>
            </c:choose>
          </c:forEach>
          <c:forEach var="combo" items="${listaCampos.combo}">
            <input type="hidden" name='<c:out value="${listaCampos.campo}" /><c:out value="${combo.id_campo}" />' value='<c:out value="${combo.campo}" />' >
          </c:forEach>
	</c:if>
        <!--  FIN JOJO  -->
      </td>
    <!-- /tr -->
  </c:forEach>
</table>
<center>
  <input type='button' value='Siguiente' class="siguiente" onClick='obligar(document.forma, "<c:out value='${obligatorios}'/>")' onBlur="inicio(document.forma._foqueame);">
      <input type="text" name="_foqueame2" readonly="readonly" style="position:absolute; left:-100px; top:-100px">
</center>
<input type="hidden" name="t" value='<c:out value="${tabla.id_tabla}"/>' >
<input type="hidden" name="e" value='<c:out value="${id_enlace}"/>' >
<input type="hidden" name="c" value='<c:out value="${valoresPrimarios}"/>' >
<input type="hidden" name="p" value="<c:out value='${permiso}' />">
<input type="hidden" name="f" value="<c:out value='${condicion}' />">
<input type="hidden" name="a" value="<c:out value='${id_actividad}' />">
<input type="hidden" id='urlRecibir' value="<c:url value='/herramientas/combos/recargarCombos.fautapo' />" >

<div class="nota">Los campos con <font color='red'>(*)</font>, son obligatorios.</div>
</form>

<script language="JavaScript">

<!--
var calFormat = "<c:out value='${formatoFecha}' />";

//----------------
  var padre_hijo = new Array();
  h = 0;
    <c:forEach var="listaCampos" items="${listaCampos}" varStatus="contador">
      <c:if test="${(!empty listaCampos.combo) and (listaCampos.id_componente != 5)}">
        padre_hijo[h] =new Array("<c:out value='${listaCampos.campo}'/>", "<c:out value='${listaCampos.campo_padre}' escapeXml='false' />","<c:out value='${listaCampos.id_campo}'/>" ,"<c:out value='${matrizDatos[contador.index]}'/>");
        h++;
      </c:if>
    </c:forEach>
//-------------------
   function pagina_sig(pag) {
     var pagi = document.getElementById(pag);
     pagi.value=parseFloat(pagi.value) + 1;
   }

   function pagina_ant(pag) { 
     var pagi = document.getElementById(pag);
     pagi.value=parseFloat(pagi.value) - 1;
   }

   function iniciar_pagina(pag) { 
     var pagi = document.getElementById(pag);
     pagi.value="1";
   }

   function abrirVentana(obj) {
     if (document.getElementById(obj).style.visibility == 'hidden') {
       document.getElementById(obj).style.visibility="visible"; 
     }
   }

   function cerrarVentana(obj) {
     document.getElementById(obj).style.visibility="hidden";    
   }
  
  var nav4 = window.Event ? true : false;
  function aceptaNumeros(evt) {
    var key = nav4 ? evt.which : evt.keyCode;
    return (key <= 13 || (key >= 48 && key <= 57));
  }

  function muestra_valor(valor) {
      condi = document.getElementById("condicion_" + valor);
      muest = document.getElementById("busca_" + valor);    
      muest.style.visibility='hidden';
      muest.innerHTML = condi.value;
      muest.style.visibility='visible';
  }

  function buscarHijo(padre) {
    var hijo = new Array();
    k = 0;
    for (i=0;i<padre_hijo.length;i++){
      if (padre_hijo[i][1]==padre) {
        hijo[k] = new Array(padre_hijo[i][0],padre_hijo[i][2]);
        k++;
      }
    }
    return hijo;
  }

  function poblar(nombre, filtro) {
    var hijos = buscarHijo(nombre);
    for (j=0;j<hijos.length;j++) {
      est = document.getElementById("estatico_" + hijos[j][1]);
      est.value = filtro;
      cond  = document.getElementById("condicion_" + hijos[j][1]).value;
      llamarAjax(hijos[j][1],"1",cond,filtro);
      limpiarHijo(hijos[j][0]);
    }
  }

  function limpiarHijo(nombre) {
    var hijos1 = buscarHijo(nombre);
    for (j=0;j<hijos1.length;j++) {
      objeto = document.getElementById(hijos1[j][0])
      for (m=objeto.options.length-1;m>0;m--) {
        objeto.options[m]=null;
      }
      objeto.options[0]= new Option("- Elija una opcion -","0");
      limpiarHijo(hijos1[j][0]);
    }
  }

//  aurelio.vicepresidencia.com.bo

  function ponerEstatico(nombre,valor) {
    var hijos1 = buscarHijo(nombre);
    for (j=0;j<hijos1.length;j++) {
      var objeto = document.getElementById('estatico_' + hijos1[j][1]);
      objeto.value = valor;
    }
  }

  function iniciar() {
    for (hh=0;hh<padre_hijo.length;hh++) {
      var combito = document.getElementById(padre_hijo[hh][0]);
      estatico = "\'\'";
      if (padre_hijo[hh][1]!="\'\'")
        estatico = document.getElementById("estatico_" + padre_hijo[hh][2]).value;
      setTimeout("llamarAjaxModificacion("+padre_hijo[hh][2]+ "," + padre_hijo[hh][3]+"," + estatico + ");",hh*700);
      ponerEstatico(padre_hijo[hh][0],padre_hijo[hh][3]);
      //  alert(padre_hijo[hh][0] + "--" + document.getElementById("pagina_" + padre_hijo[hh][2]).value);
    }
  }
-->
</script>
</body>
<%@ include file="../Inferior.jsp" %>