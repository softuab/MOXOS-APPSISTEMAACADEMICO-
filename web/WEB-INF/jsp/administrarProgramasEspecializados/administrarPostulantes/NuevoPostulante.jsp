<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<jsp:useBean id="now" class="java.util.Date"/> 
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="<c:url value='/pagina.css'/>" type="text/css">
        <link rel="stylesheet" href="<c:url value='/basico.css'/>" type="text/css">
        <link rel="stylesheet" href="<c:url value='/principal.css'/>" type="text/css">
        <link rel="stylesheet" href="<c:url value='/css/font-awesome.min.css'/>" type="text/css"> 
        <link href="imagenes\principal\aureliox.ico" rel="shortcut icon" type="image/x-icon">
        <META HTTP-EQUIV="Cache-Control" CONTENT="max-age='0'" />
        <META HTTP-EQUIV="Cache-Control" CONTENT="no-cache" />
        <META http-equiv="expires" content="0" />
        <META HTTP-EQUIV="Expires" CONTENT="Tue, 01 Jan 1980 1:00:00 GMT" />
        <META HTTP-EQUIV="Pragma" CONTENT="no-cache" />
        <title>Moxos - academico</title>
    </head>
    <body onload="init()">
        <c:if test="${empty titulo}">
            <div class="titulo">Registrar  Postulantes</div>
        </c:if>
        <c:if test="${!empty titulo}">
            <div class="titulo"><c:out value="${titulo}"/></div>
        </c:if>
        <br>
        <form name="fvolver" action="<c:url value='/postulantes/entrada.fautapo'/>" method="post">
            <input type="hidden" name="id_proceso" value="<c:out value='${id_proceso}'/>">
            <input type="hidden" name="id_tramite" value="<c:out value='${id_tramite}'/>">
            <input type="hidden" name="titulo" value="<c:out value='${titulo}'/>">
            <div> <a class="volver" href="javascript:document.fvolver.submit();"> Volver</a> </div>
        </form>
        <br>
        <form  name=forma action="<c:url value="/postulantes/registrarPostulante.fautapo"/>" method="POST">
            <table class="formulario" aria-describedby="formulario de registro de etudiante">
                <thead>
                <th colspan="2" class="titulo-tabla">
                    INTRODUZCA LOS DATOS
                </th>
                </thead>
                <tbody>
                    <tr>
                        <td class="etiqueta4">Gesti&oacute;n::</td>
                        <td>
                            <input type="text" name="gestion" size="4" maxlength="4" value="<c:out value="${gestion}"/>" onblur='validar(this, "9")' >
                        </td>
                    </tr>
                    <tr>
                        <td class="etiqueta4">Periodo::</td>
                        <td>
                            <input type="text" name="periodo" size="2" maxlength="2" value='<c:out value="${periodo}"/>' onblur='validar(this, "9")' >
                        </td>
                    </tr>
                    <tr>
                        <td class="titulo-tabla"> DATOS GENERALES </td>
                        <td class="titulo-tabla"> DATOS PROGRAMA </td>
                    </tr>  
                    <tr>
                        <td style="vertical-align:top">
                            <table class="tabla" aria-describedby="datos de estudiante"> 
                                <thead class="invisible"><tr><th colspan="3"></th></tr></thead>
                                <tbody>
                                    <tr>
                                        <td>
                                            <div class="group-form">
                                                <label>1er. Apellido</label>
                                                <input type="text" name="paterno" onkeyup="fmayus();"  />
                                            </div>
                                        </td>	
                                        <td >
                                            <div class="group-form">
                                                <label>2do. Apellido</label>
                                                <input type="text" name="materno" onkeyup="fmayus();"  />
                                            </div>
                                        </td>	
                                        <td>
                                            <div class="group-form">
                                                <label>Nombres <span class="obligatorio">(*)</span></label>
                                                <input type="text" name="nombres"  onkeyup="fmayus();" />
                                            </div>
                                        </td> 
                                    </tr>   
                                    <tr> 
                                        <td>
                                            <div class="group-form">
                                                <label class="label"> DIP <span class="obligatorio">(*)</span></label>
                                                <input type="text"  name="dip" title="DIP"  />
                                            </div>
                                        </td>
                                        <td>
                                            <div class="group-form">
                                                <label>Sexo <span class="obligatorio">(*)</span></label>
                                                <select name="id_tipo_sexo">
                                                    <option value="-1">-- Seleccione --</option>
                                                    <c:forEach var="lista" items="${lTiposSexos}" >
                                                        <option value='<c:out value="${lista.id_tipo_sexo}"/>'>
                                                            <c:out value="${lista.tipo_sexo}"/> 
                                                        </option>
                                                    </c:forEach>
                                                </select>
                                            </div> 
                                        </td>
                                        <td>
                                            <div class="group-form">
                                                <label>Estado Civil <span class="obligatorio">(*)</span></label>
                                                <select name="id_tipo_estado_civil">
                                                    <option value="-1">-- Seleccione --</option>
                                                    <c:forEach var="lista" items="${lTiposEstadosCiviles}" >
                                                        <option value='<c:out value="${lista.id_tipo_estado_civil}"/>' >
                                                            <c:out value="${lista.tipo_estado_civil}"/> 
                                                        </option>
                                                    </c:forEach>
                                                </select>
                                            </div> 
                                        </td> 
                                    </tr> 
                                    <tr> 
                                        <td>
                                            <div class="group-form">
                                                <label>Domicilio <span class="obligatorio">(*)</span></label>
                                                <textarea  name="direccion"  title="Direccion"  rows="1" column="20"/></textarea>
                                            </div>
                                        </td>
                                        <td>
                                            <div class="group-form">
                                                <label>Tel&eacute;fono</label>
                                                <input type="text"  name="telefono"  title="Telefono" size="10" />
                                            </div>
                                        </td>
                                        <td>
                                            <div class="group-form">
                                                <label>Correo</label>
                                                <input type="text"  name="correo"  title="Telefono" size="20"/>
                                            </div>
                                        </td>
                                    </tr> 
                                    <tr> 
                                        <td>
                                            <div class="group-form">
                                                <label>Celular</label>
                                                <input type="text"  name="celular"  title="Nro.Celular" size="10" value=""/>
                                            </div>
                                        </td>
                                        <td>
                                            <div class="group-form">
                                                <label>Empresa Telef&oacute;nica <span class="obligatorio">(*)</span></label>
                                                <select name="id_tipo_empresa_telefonica">
                                                    <option value="-1">-- Seleccione --</option>
                                                    <c:forEach var="listaE" items="${lTiposEmpresasTelefonicas}" >
                                                        <option value='<c:out value="${listaE.id_tipo_empresa_telefonica}"/>' >
                                                            <c:out value="${listaE.tipo_empresa_telefonica}"/> 
                                                        </option>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                        </td> 
                                    </tr> 
                                    <tr>
                                        <td colspan="3" class="titulo-tabla"> Lugar de Nacimiento </td>
                                    </tr>   	
                                    <tr>
                                        <td>
                                            <div class="group-form">
                                                <label>Pa&iacute;s Nac.<span class="obligatorio">(*)</span></label>
                                                <select id = 'id_pais_n' name = 'id_pais_n'  onChange = "cambiardepartamentos(this)"> 
                                                    <option value="-1">-- Seleccione --</option>
                                                    <c:forEach var="item" items="${lPaises}" >
                                                        <option value='<c:out value="${item.id_pais}"/>'>
                                                            <c:out value="${item.pais}"/>
                                                        </option>
                                                    </c:forEach>
                                                </select>
                                            </div> 
                                        </td>
                                        <td>
                                            <div class="group-form">
                                                <label>Departamento Nac. <span class="obligatorio">(*)</span></label>
                                                <select id = 'id_departamento_n' name = 'id_departamento_n'  onChange = "cambiarprovincias(this)">
                                                </select>
                                            </div> 
                                        </td>
                                        <td>
                                            <div class="group-form">
                                                <label>Provincia Nac. <span class="obligatorio">(*)</span></label>
                                                <select id = 'id_provincia_n' name = 'id_provincia_n' onChange = "cambiarlocalidades(this)">
                                                </select>
                                            </div>
                                        </td>
                                    </tr>
                                    <tr>     
                                        <td>
                                            <div class="group-form">
                                                <label>Localidad Nac.<span class="obligatorio">(*)</span></label>
                                                <select id = 'id_localidad_n' name = 'id_localidad_n'>
                                                </select>
                                            </div> 
                                        </td>	
                                        <td colspan="2">
                                            <div class="group-form">
                                                <label>Fecha de Nacimiento <span class="obligatorio">(*)</span></label>
                                                <div class="date">
                                                    <div  class="item1">
                                                        <input type="text" name='fec_nacimiento'  value='01/01/1980' maxlength='10' size='10' placeholder="Fecha de nacimiento" /> 
                                                    </div>
                                                    <div  class="item2">
                                                        <small> <a href="javascript:showCal('fec_nacimiento')"> <img src="../imagenes/dibRap/calendario.jpeg" alt=""/></a></small>
                                                    </div>
                                                </div>
                                            </div> 
                                        </td> 
                                    </tr>  
                                    <tr>
                                        <td class="titulo-tabla" colspan="3"> 
                                            Datos de Bachillerato
                                        </td>
                                    </tr>  
                                    <tr >
                                        <td>
                                            <div class="group-form">
                                                <label>Tipo Instituci&oacute;n <span class="obligatorio">(*)</span></label>
                                                <select id = 'id_tipo_institucion' name = 'id_tipo_institucion'   onChange = "cambiarcolegios(this)">
                                                    <option value="-1">-- Seleccione --</option>
                                                    <c:forEach var="item" items="${lTiposInstituciones}" >
                                                        <option value='<c:out value="${item.id_tipo_institucion}"/>'>
                                                            <c:out value="${item.tipo_institucion}"/>
                                                        </option>
                                                    </c:forEach>
                                                </select>
                                            </div> 
                                        </td>	
                                        <td>
                                            <div class="group-form">
                                                <label>Colegio <span class="obligatorio">(*)</span></label>
                                                <select id = 'id_colegio' name = 'id_colegio'>
                                                </select>
                                            </div> 
                                        </td>
                                        <td>
                                            <div class="group-form">
                                                <label>Turno <span class="obligatorio">(*)</span></label>
                                                <select id = 'id_tipo_turno' name = 'id_tipo_turno'>
                                                    <option value="-1">-- Seleccione --</option>
                                                    <c:forEach var="item" items="${lTiposTurnos}" >
                                                        <option value='<c:out value="${item.id_tipo_turno}"/>'>
                                                            <c:out value="${item.tipo_turno}"/>
                                                        </option>
                                                    </c:forEach>
                                                </select>
                                            </div> 
                                        </td>
                                    </tr>  	 
                                    <tr> 
                                        <td colspan="3">
                                            <div class="group-form">
                                                <label>A&ntilde;o de Bachiller<span class="obligatorio">(*)</span></label>
                                                <input type="text"  name="anio_egreso"  title="Anio Egreso" size="4" maxlength="4" value="<c:out value='${gestion}'/>"/>
                                            </div>
                                        </td>  
                                    </tr>
                                </tbody>
                            </table>
                        </td>
                        <td style="vertical-align:top">
                            <table class="tabla" aria-describedby="datos de programa">
                                <thead><tr><th colspan="2"></th></tr></thead>
                                <tbody>     
                                    <tr>
                                        <td class="etiqueta4">Facultad<span class="obligatorio">(*)</span> </td>
                                        <td>
                                            <select  id='id_facultad' name='id_facultad' onchange="cambiarprograma(this)">
                                                <option value="-1">-- Seleccione --</option>
                                                <c:forEach var="item" items="${lFacultades}" >
                                                    <option value='<c:out value="${item.id}"/>' >
                                                        <c:out value="${item.value}"/> 
                                                    </option>
                                                </c:forEach>
                                            </select> 
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="etiqueta4">Programa <span class="obligatorio">(*)</span> </td>
                                        <td>
                                            <select id='id_programa' name='id_programa' onChange="cambiarplanes(this)">
                                            </select>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="etiqueta4">Sede Area Desconcentrada de Programa <span class="obligatorio">(*)</span> </td>
                                        <td>
                                            <select id='id_desconcentrado' name='id_desconcentrado'> 
                                            </select>
                                        </td> 
                                    </tr>
                                    <tr>
                                        <td class="etiqueta4">Tipo Admision <span class="obligatorio">(*)</span> </td> 
                                        <td>
                                            <select  id='id_tipo_admision' name='id_tipo_admision'>
                                            </select> 
                                        </td>
                                    </tr> 
                                    <tr>
                                        <td class="etiqueta4">
                                            Tipo de Descuento <span class="obligatorio">(*)</span> 
                                        </td> 
                                        <td>
                                            <select id="id_tipo_descuento" name="id_tipo_descuento" onchange="fdescuento()">
                                                <option value="-1">-- Elija una opci&oacute;n --</option>
                                                <c:forEach var="listaD" items="${lTiposDescuentos}" >
                                                    <option value='<c:out value="${listaD.id_tipo_descuento}"/>' >
                                                        <c:out value="${listaD.tipo_descuento}"/>
                                                    </option>
                                                </c:forEach>
                                            </select>
                                        </td>
                                    </tr> 
                                    <tr>
                                        <td class="etiqueta4"> Descuento (%) <span class="obligatorio">(*)</span></td>
                                        <td><input id="descuento" type="text" name="descuento" value="0"> </td>
                                    </tr> 
                                </tbody>
                            </table> 
                        </td>
                    </tr>
                    <tr>
                        <td class="titulo-tabla"  colspan="2"> DOCUMENTACION </td>
                    </tr>  
                    <tr>
                        <td colspan="2">
                            <table class="tabla" aria-describedby="datos de estudiante">
                                <thead>
                                    <tr>
                                        <th class="colh">? </th>
                                        <th class="colh">TIPO DOCUMENTO </th>
                                        <th class="colh">CANTIDAD </th>
                                        <th class="colh">OBSERVACIONES </th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="lDocumento" items="${lTiposDocumentosClasf}" varStatus="contador">
                                        <tr>
                                            <td> <c:out value='${contador.count}'/>  </td> 
                                            <td> <input type="checkbox" name="id_tipo_documento_p" value="<c:out value='${lDocumento.id_tipo_documento}'/>"> 
                                                <c:out value='${lDocumento.tipo_documento}'/>
                                            </td> 
                                            <td> <input type="text" name="numero<c:out value='${lDocumento.id_tipo_documento}'/>"  value="1" size="1" maxlength="2"> </td> 
                                            <td> <input type="text" name="observacion<c:out value='${lDocumento.id_tipo_documento}'/>" size="20" > </td> 
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <button onClick="fguardar()" type='button' id="btnenviar"  role="button"  class="btn">Guardar</button> 
                            <input type="hidden" name="id_proceso" value="<c:out value='${id_proceso}'/>">
                            <input type="hidden" name="id_tramite" value="<c:out value='${id_tramite}'/>">
                            <input type="hidden" name="titulo" value="<c:out value='${titulo}'/>">
                        </td>
                    </tr>
                </tbody>
            </table>  
        </form>
        <div class="nota">Los campos con <span class="obligatorio">(*)</span>, son obligatorios.</div>   
        <script type="text/javascript" src="<c:url value='/js/funciones.js'/>"></script>
        <script type="text/javascript" src="<c:url value='/js/herramientas.js'/>"></script>
        <script type="text/javascript" src="<c:url value='/js/ajax.js'/>"></script>
        <script type="text/javascript" src="<c:url value='/js/sistema/operaciones.js'/>"></script> 
        <script>
                                //lista de objetos
                                var idFacultad = -1;
                                var lprogramas =${lProgramas};
                                var lSedes =${lDesconcentrado};
                                var lDepartamentos =${lDepartamentos};
                                var lProvincia =${lProvincias};
                                var lLocalidad =${lLocalidades};
                                var lColegios =${lColegiosTipoInst};
                                var lAdmisiones =${lTiposAdmisiones};

                                var idPrograma = -1;
                                var idPais = -1;
                                var idDepartamento = -1;
                                var idProvincia = -1;
                                var idLocalidad = -1;
                                var idTipoInstitucion = -1;
                                var idColegio = -1;

                                //Esto es para el calendario
                                var calFormat = "${formatoFecha}";
                                //Fin para calendario
                                var variables = new Array();
                                h = 0;
            <c:forEach var="lista1" items="${lTiposDescuentos}" varStatus="contador">
                                variables[h] = new Array("<c:out value='${lista1.id_tipo_descuento}'/>", "<c:out value='${lista1.porcentaje_descuento}'/>");
                                h++;
            </c:forEach>
                                const init = () => {
                                    document.getElementById('id_programa').innerHTML = optionscollection(lprogramas, idFacultad, idPrograma);
                                    document.getElementById('id_desconcentrado').innerHTML = optionscollection(lSedes, idPrograma, -1);
                                    document.getElementById('id_tipo_admision').innerHTML = optionscollection(lAdmisiones, idPrograma, -1);
                                    document.getElementById('id_departamento_n').innerHTML = optionscollection(lDepartamentos, idPais, idDepartamento);
                                    document.getElementById('id_provincia_n').innerHTML = optionscollection(lProvincia, idDepartamento, idProvincia);
                                    document.getElementById('id_localidad_n').innerHTML = optionscollection(lLocalidad, idProvincia, idLocalidad);
                                    document.getElementById('id_colegio').innerHTML = optionscollection(lColegios, idTipoInstitucion, idColegio);

                                }
                                const cambiarprograma = (e) => {
                                    document.getElementById('id_programa').innerHTML = optionscollection(lprogramas, parseInt(e.value), idPrograma);
                                };
                                const cambiarplanes = (e) => {
                                    document.getElementById('id_desconcentrado').innerHTML = optionscollection(lSedes, parseInt(e.value), -1);
                                    document.getElementById('id_tipo_admision').innerHTML = optionscollection(lAdmisiones, parseInt(e.value), -1);
                                };
                                const cambiardepartamentos = (e) => {
                                    document.getElementById('id_departamento_n').innerHTML = optionscollection(lDepartamentos, parseInt(e.value), idDepartamento);
                                };
                                const cambiarprovincias = (e) => {
                                    document.getElementById('id_provincia_n').innerHTML = optionscollection(lProvincia, parseInt(e.value), idProvincia);
                                };
                                const cambiarlocalidades = (e) => {
                                    document.getElementById('id_localidad_n').innerHTML = optionscollection(lLocalidad, parseInt(e.value), idLocalidad);
                                };
                                const cambiarcolegios = (e) => {
                                    document.getElementById('id_colegio').innerHTML = optionscollection(lColegios, parseInt(e.value), idColegio);
                                };
                                const fdescuento = () => {
                                    var objeto = document.getElementById("id_tipo_descuento");
                                    var objeto2 = document.getElementById("descuento");
                                    var descuento;
                                    for (k = 0; k < variables.length; k++) {
                                        if (variables[k][0] === objeto.value) {
                                            descuento = variables[k][1];
                                            break;
                                        }
                                    }
                                    objeto2.value = descuento;
                                };
                                const fmayus = () => {
                                    document.forma.paterno.value = document.forma.paterno.value.toUpperCase();
                                    document.forma.materno.value = document.forma.materno.value.toUpperCase();
                                    document.forma.nombres.value = document.forma.nombres.value.toUpperCase();
                                };
                                const fguardar = () =>
                                {
                                   
                                    if (document.forma.id_programa.value === "-1") {
                                        alert("Debe seleccionar el programa");
                                        return;
                                    }

                                    if (document.forma.nombres.value === "") {
                                        alert("Debe introducir el nombre");
                                        return;
                                    }

                                    if (document.forma.dip.value === "") {
                                        alert("Debe introducir el documento de identificacion personal");
                                        return;
                                    }

                                    if (document.forma.direccion.value === "") {
                                        alert("Debe introducir la direccion del estudiante");
                                        return;
                                    }

                                    if (document.forma.fec_nacimiento.value === "") {
                                        alert("Debe introducir el fecha de nacimiento");
                                        return;
                                    }

                                    if (document.forma.id_localidad_n.value === "-1") {
                                        alert("Debe introducir la localidad");
                                        return;
                                    }
                                    if (document.forma.id_departamento_n.value === "-1") {
                                        alert("Debe introducir el departamento");
                                        return;
                                    }
                                    if (document.forma.id_provincia_n.value === "-1") {
                                        alert("Debe introducir la provincia");
                                        return;
                                    }
                                    if (document.forma.id_pais_n.value === "-1") {
                                        alert("Debe introducir el pais");
                                        return;
                                    }
                                    if (document.forma.id_tipo_sexo.value === "-1") {
                                        alert("Debe introducir el sexo del estudiante");
                                        return;
                                    }
                                    if (document.forma.id_tipo_estado_civil.value === "-1") {
                                        alert("Debe introducir el tipo de estado civil");
                                        return;
                                    }
                                    if (document.forma.id_tipo_empresa_telefonica.value === "-1") {
                                        alert("Debe introducir la empresa telefonica");
                                        return;
                                    }
                                    if (document.forma.id_tipo_institucion.value === "-1") {
                                        alert("Debe introducir el tipo de institucion");
                                        return;
                                    }
                                    if (document.forma.id_colegio.value === "-1") {
                                        alert("Debe introducir el tipo de colegio");
                                        return;
                                    }
                                    if (document.forma.id_tipo_turno.value === "-1") {
                                        alert("Debe introducir el turno del colegio");
                                        return;
                                    }
                                    if (document.forma.id_tipo_admision.value === "-1") {
                                        alert("Debe introducir el tipo de admision");
                                        return;
                                    }
                                    if (document.forma.anio_egreso.value === "") {
                                        alert("Debe introducir el tipo de estudiante");
                                        return;
                                    }
                                    if (document.forma.id_tipo_descuento.value === "-1") {
                                        alert("Debe introducir el tipo de descuento");
                                        return;
                                    }
                                    if (document.forma.id_desconcentrado.value === "-1") {
                                        alert("Debe introducir la sede del programa del estudiante");
                                        return;
                                    }
                                    document.getElementById('btnenviar').disabled = true;
                                    document.getElementById('btnenviar').innerHTML = '<i class="fa fa-spinner fa-spin"></i>  Registrando';
                                    document.forma.submit();
                                };
        </script>
    </body>
</html>
