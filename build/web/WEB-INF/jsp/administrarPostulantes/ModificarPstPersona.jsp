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
            <div class="titulo">Administrar Datos Pst Personas</div>
        </c:if>
        <c:if test="${!empty titulo}">
            <div class="titulo"><c:out value="${titulo}"/></div>
        </c:if>
        <br>
        <form name="fvolver" action="<c:url value='/pst_personas/entrada.fautapo'/>" method="post">
            <input type="hidden" name="titulo" value="<c:out value='${titulo}'/>">
            <div> <a class="volver" href="javascript:document.fvolver.submit();"> Volver</a> </div>
        </form>
        <br>
        <form  name=forma action="<c:url value="/pst_personas/registrarPrsPostulante.fautapo"/>" method="POST"> 
            <table class="formulario" aria-describedby="formulario de registro de etudiante">
                <thead>
                    <tr>
                        <th  class="titulo-tabla">
                            INTRODUZCA LOS DATOS
                        </th>
                    </tr>
                </thead>
                <tbody>  
                    <tr>
                        <td class="titulo-tabla"> DATOS GENERALES </td> 
                    </tr>  
                    <tr>
                        <td style="vertical-align:top">
                            <table class="tabla" aria-describedby="datos de postulante"> 
                                <thead class="invisible"><tr><th colspan="3"></th></tr></thead>
                                <tbody>
                                    <tr>
                                        <td>
                                            <div class="group-form">
                                                <label>Paterno</label>
                                                <input type="text" name="paterno" size="20" title="Apellido Paterno"   onkeyup="fmayus();" value='<c:out value="${datosPstPersona.paterno}"/>' />
                                            </div>
                                        </td>	
                                        <td >
                                            <div class="group-form">
                                                <label>Materno</label>
                                                <input type="text" name="materno" size="20" title="Apellido Materno" onkeyup="fmayus();" value='<c:out value="${datosPstPersona.materno}"/>'  />
                                            </div>
                                        </td>	
                                        <td>
                                            <div class="group-form">
                                                <label>Nombres <span class="obligatorio">(*)</span></label>
                                                <input type="text" name="nombres" size="20" title="Nombres"  onkeyup="fmayus();"  value='<c:out value="${datosPstPersona.nombres}"/>' />
                                            </div>
                                        </td> 
                                    </tr>   
                                    <tr> 
                                        <td>
                                            <div class="group-form">
                                                <label class="label"> DIP <span class="obligatorio">(*)</span></label>
                                                <input type="text"  name="dip" title="DIP" size="10"  value='<c:out value="${datosPstPersona.dip}"/>'/>
                                            </div>
                                        </td>
                                        <td>
                                            <div class="group-form">
                                                <label>Sexo <span class="obligatorio">(*)</span></label>
                                                <select name="id_tipo_sexo">
                                                    <option value="-1">-- Seleccione --</option>
                                                    <c:forEach var="lista" items="${lTiposSexos}" >
                                                        <option value='<c:out value="${lista.id_tipo_sexo}"/>' <c:if test="${lista.id_tipo_sexo == datosPstPersona.id_tipo_sexo}">selected</c:if> >
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
                                                        <option value='<c:out value="${lista.id_tipo_estado_civil}"/>' <c:if test="${lista.id_tipo_estado_civil == datosPstPersona.id_tipo_estado_civil}">selected</c:if> >
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
                                                <textarea  name="direccion"  title="Direccion"  rows="1" column="20"/><c:out value="${datosPstPersona.direccion}"/></textarea>
                                            </div>
                                        </td>
                                        <td>
                                            <div class="group-form">
                                                <label>Tel&eacute;fono</label>
                                                <input type="text"  name="telefono"  title="Telefono" size="10"   value='<c:out value="${datosPstPersona.telefono}"/>' />
                                            </div>
                                        </td>
                                        <td>
                                            <div class="group-form">
                                                <label>Correo</label>
                                                <input type="text"  name="correo"  title="correo" size="20"  value='<c:out value="${datosPstPersona.correo}"/>'/>
                                            </div>
                                        </td>
                                    </tr> 
                                    <tr> 
                                        <td>
                                            <div class="group-form">
                                                <label>Celular</label>
                                                <input type="text"  name="celular"  title="Nro.Celular" size="10"  value='<c:out value="${datosPstPersona.celular}"/>'/>
                                            </div>
                                        </td>
                                        <td>
                                            <div class="group-form">
                                                <label>Empresa Telef&oacute;nica <span class="obligatorio">(*)</span></label>
                                                <select name="id_tipo_empresa_telefonica">
                                                    <option value="-1">-- Seleccione --</option>
                                                    <c:forEach var="listaE" items="${lTiposEmpresasTelefonicas}" >
                                                        <option value='<c:out value="${listaE.id_tipo_empresa_telefonica}"/>' <c:if test="${listaE.id_tipo_empresa_telefonica == datosPstPersona.id_tipo_empresa_telefonica}">selected</c:if> >
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
                                                        <option value='<c:out value="${item.id_pais}"/>' <c:if test="${item.id_pais ==  datosPstPersona.id_pais}"> selected </c:if>>
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
                                                        <input type="text" name='fec_nacimiento' value='<fmt:formatDate value="${datosPstPersona.fec_nacimiento2}" pattern="dd/MM/yyyy"/>' maxlength='10' size='10' title="Fecha de nacimiento" />
                                                    </div>
                                                    <div  class="item2">
                                                        <small> <a href="javascript:showCal('fec_nacimiento')"> <img src="../imagenes/dibRap/calendario.jpeg"/></a></small>
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
                                                        <option value='<c:out value="${item.id_tipo_institucion}"/>' <c:if test="${item.id_tipo_institucion ==  datosColegio.id_tipo_institucion}"> selected </c:if>>
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
                                                        <option value='<c:out value="${item.id_tipo_turno}"/>' <c:if test="${item.id_tipo_turno ==  datosColegio.id_tipo_turno}"> selected </c:if>>
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
                                                <input type="text"  name="anio_egreso"  placeholder="Anio Egreso" value="<c:out value='${datosColegio.anio_egreso}'/>"/>
                                            </div>
                                        </td>  
                                    </tr>
                                </tbody>
                            </table>
                        </td> 
                    </tr>
                    <tr>
                        <td colspan="2">
                            <button onClick="fguardar()" type='button' id="btnenviar"  role="button"  class="btn">Guardar</button> 
                            <input type="hidden" name="id_persona" value="<c:out value='${id_persona}'/>">
                            <input type="hidden" name="id_postulante" value="<c:out value='${id_postulante}'/>">
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
                                var lDepartamentos =${lDepartamentos};
                                var lProvincia =${lProvincias};
                                var lLocalidad =${lLocalidades};
                                var lColegios =${lColegiosTipoInst};

                                var idPais =${datosPstPersona.id_pais};
                                var idDepartamento =${datosPstPersona.id_departamento};
                                var idProvincia =${datosPstPersona.id_provincia};
                                var idLocalidad =${datosPstPersona.id_localidad};
                                var idTipoInstitucion =${datosColegio.id_tipo_institucion};
                                var idColegio =${datosColegio.id_colegio};

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
                                    document.getElementById('id_departamento_n').innerHTML = optionscollection(lDepartamentos, idPais, idDepartamento);
                                    document.getElementById('id_provincia_n').innerHTML = optionscollection(lProvincia, idDepartamento, idProvincia);
                                    document.getElementById('id_localidad_n').innerHTML = optionscollection(lLocalidad, idProvincia, idLocalidad);
                                    document.getElementById('id_colegio').innerHTML = optionscollection(lColegios, idTipoInstitucion, idColegio);
                                }
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
                                const fmayus = () => {
                                    document.forma.paterno.value = document.forma.paterno.value.toUpperCase();
                                    document.forma.materno.value = document.forma.materno.value.toUpperCase();
                                    document.forma.nombres.value = document.forma.nombres.value.toUpperCase();
                                };
                                const fguardar = () =>
                                {

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
                                    if (document.forma.anio_egreso.value === "") {
                                        alert("Debe introducir el tipo de estudiante");
                                        return;
                                    }
                                    document.getElementById('btnenviar').disabled = true;
                                    document.getElementById('btnenviar').innerHTML = '<i class="fa fa-spinner fa-spin"></i>  Registrando';
                                    document.forma.submit();
                                };
        </script>
    </body>
</html>
