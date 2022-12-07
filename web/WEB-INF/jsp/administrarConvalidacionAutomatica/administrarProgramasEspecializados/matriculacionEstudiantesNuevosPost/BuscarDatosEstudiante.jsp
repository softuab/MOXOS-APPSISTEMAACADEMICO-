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
            <div class="titulo">Registrar Nuevo Estudiante</div>
        </c:if>
        <c:if test="${!empty titulo}">
            <div class="titulo"><c:out value="${titulo}"/></div>
        </c:if>
        <br>
        <form name="fvolver" action="<c:url value='/estudianteNuevoPost/listarPostulantes.fautapo'/>" method="post">
            <input type="hidden" name="id_proceso"                value="<c:out value='${id_proceso}'/>">
            <input type="hidden" name="id_tramite"                value="<c:out value='${id_tramite}'/>">
            <input type="hidden" name="titulo"                    value="<c:out value='${titulo}'/>">
            <input type="hidden" name="gestion"                   value="<c:out value='${gestion}'/>">
            <input type="hidden" name="periodo"                   value="<c:out value='${periodo}'/>">
            <input type="hidden" name="dip"                       value="<c:out value='${dip}'/>">
            <input type="hidden" name="nombre"                    value="<c:out value='${nombre}'/>">
            <input type="hidden" name="id_tipo_admision_entrada"  value="<c:out value='${id_tipo_admision_entrada}'/>">
            <div> <a class="volver" href="javascript:document.fvolver.submit();"> Volver</a> </div>
        </form>
        <br>
        <form  name=forma action="<c:url value="/estudianteNuevoPost/registrarPrsEstAdmisionEspecial.fautapo"/>" method="POST">
            <input type="hidden" name="gestion" value="<c:out value='${gestion}'/>">
            <input type="hidden" name="periodo" value="<c:out value='${periodo}'/>">
            <table class="formulario" aria-describedby="formulario de registro de etudiante">
                <thead>
                <th colspan="2" class="titulo-tabla">
                    INTRODUZCA LOS DATOS DE ESTUDIANTE DE AMDISION ESPECIAL
                </th>
                </thead>
                <tbody>
                    <tr>
                        <td class="etiqueta4">Gesti&oacute;n de Matriculaci&oacute;n ::</td>
                        <td>
                            <c:out value="${gestion}"/>
                            <input type="hidden" name="gestion" value="<c:out value="${gestion}"/>">
                        </td>
                    </tr>
                    <tr>
                        <td class="etiqueta4">Periodo  de Matriculaci&oacute;n ::</td>
                        <td>
                            <c:out value="${periodo}"/>
                            <input type="hidden" name="periodo" value="<c:out value="${periodo}"/>">
                        </td>
                    </tr>
                    <tr>
                        <td class="etiqueta4">Fecha de Inscripci&oacute;n ::</td>
                        <td>
                            <fmt:formatDate value="${now}" pattern="yyyy-MM-dd"/>
                            <input type="hidden" name='fec_inscripcion'  value='<fmt:formatDate value="${now}" pattern="yyyy-MM-dd"/>' >
                        </td>
                    </tr>
                    <tr>
                        <td class="titulo-tabla"> DATOS GENERALES </td>
                        <td class="titulo-tabla"> DATOS PROGRAMA </td>
                    </tr>  
                    <tr>
                        <td style="vertical-align:top">
                            <table class="tabla" aria-describedby="datos de etudiante"> 
                                <thead><tr><th colspan="3"></th></tr></thead>
                                <tbody>
                                    <tr>
                                        <td>
                                            <div class="group-form">
                                                <label>1er. Apellido</label>
                                                <input type="text" name="paterno" onkeyup="fmayus();" style="background-color:pink" value="<c:out value='${datosPrs.paterno}'/>" readonly />
                                            </div>
                                        </td>	
                                        <td >
                                            <div class="group-form">
                                                <label>2do. Apellido</label>
                                                <input type="text" name="materno" onkeyup="fmayus();" style="background-color:pink" value="<c:out value='${datosPrs.materno}'/>" readonly />
                                            </div>
                                        </td>	
                                        <td>
                                            <div class="group-form">
                                                <label>Nombres <span class="obligatorio">(*)</span></label>
                                                <input type="text" name="nombres" size="20" title="Nombres"  onkeyup="fmayus();" style="background-color:pink" value="<c:out value='${datosPrs.nombres}'/>" readonly />
                                            </div>
                                        </td> 
                                    </tr>   
                                    <tr> 
                                        <td>
                                            <div class="group-form">
                                                <label class="label"> DIP <span class="obligatorio">(*)</span></label>
                                                <input type="text"  name="dip"  style="background-color:pink" value="<c:out value='${datosPrs.dip}'/>" readonly />
                                            </div>
                                        </td>
                                        <td>
                                            <div class="group-form">
                                                <label>Sexo <span class="obligatorio">(*)</span></label>
                                                <select name="id_tipo_sexo">
                                                    <option value="-1">-- Seleccione --</option>
                                                    <c:forEach var="lista" items="${lTiposSexos}" >
                                                        <option value='<c:out value="${lista.id_tipo_sexo}"/>' <c:if test="${lista.id_tipo_sexo == datosPrs.id_tipo_sexo}">selected</c:if> >
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
                                                        <option value='<c:out value="${lista.id_tipo_estado_civil}"/>' <c:if test="${lista.id_tipo_estado_civil == datosPrs.id_tipo_estado_civil}">selected</c:if> >
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
                                                <textarea  name="direccion"  title="Direccion"  rows="1" column="20"/><c:out value='${datosPrs.direccion}'/></textarea>
                                            </div>
                                        </td>
                                        <td>
                                            <div class="group-form">
                                                <label>Tel&eacute;fono</label>
                                                <input type="text"  name="telefono" value="<c:out value='${datosPrs.telefono}'/>"/>
                                            </div>
                                        </td>
                                        <td>
                                            <div class="group-form">
                                                <label>Correo</label>
                                                <input type="text"  name="correo"  value="<c:out value='${datosPrs.correo}'/>"/>
                                            </div>
                                        </td>
                                    </tr> 
                                    <tr> 
                                        <td>
                                            <div class="group-form">
                                                <label>Celular</label>
                                                <input type="text"  name="celular" value="<c:out value='${datosPrs.celular}'/>"/>
                                            </div>
                                        </td>
                                        <td>
                                            <div class="group-form">
                                                <label>Empresa Telef&oacute;nica <span class="obligatorio">(*)</span></label>
                                                <select name="id_tipo_empresa_telefonica">
                                                    <option value="-1">-- Seleccione --</option>
                                                    <c:forEach var="listaE" items="${lTiposEmpresasTelefonicas}" >
                                                        <option value='<c:out value="${listaE.id_tipo_empresa_telefonica}"/>' <c:if test="${listaE.id_tipo_empresa_telefonica == datosPrs.id_tipo_empresa_telefonica}">selected</c:if> >
                                                            <c:out value="${listaE.tipo_empresa_telefonica}"/> 
                                                        </option>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                        </td>
                                        <td> 
                                            <div class="group-form">
                                                <label>Grupo Sanguineo</label>
                                                <input type="text"  name="tipo_sanguineo" value="<c:out value="${datosPrs.tipo_sanguineo}"/>"/>
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
                                                        <option value='<c:out value="${item.id_pais}"/>' <c:if test="${item.id_pais ==  datosPrs.id_pais}"> selected </c:if>>
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
                                        </td>B
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
                                                        <input type="text" name='fec_nacimiento'  value='<fmt:formatDate value="${bPst.fec_nacimiento2}" pattern="${formatoFecha}"/>' maxlength='10' size='10' placeholder="Fecha de nacimiento" /> 
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
                                    <tr>
                                        <td>
                                            <div class="group-form">
                                                <label>Tipo Instituci&oacute;n <span class="obligatorio">(*)</span></label>
                                                <select id = 'id_tipo_institucion' name = 'id_tipo_institucion'   onChange = "cambiarcolegios(this)">
                                                    <option value="-1">-- Seleccione --</option>
                                                    <c:forEach var="item" items="${lTiposInstituciones}" >
                                                        <option value='<c:out value="${item.id_tipo_institucion}"/>' <c:if test="${item.id_tipo_institucion ==  bEstColegio.id_tipo_institucion}"> selected </c:if>>
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
                                                        <option value='<c:out value="${item.id_tipo_turno}"/>' <c:if test="${item.id_tipo_turno ==  bEstColegio.id_tipo_turno}"> selected </c:if>>
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
                                                <input type="text"  name="anio_titulacion"  placeholder="Anio Egreso" value="<c:out value='${datosPrs.anio_titulacion}'/>"/>
                                            </div>
                                        </td>  
                                    </tr> 
                                    <tr>
                                        <td class="titulo-tabla" colspan="3"> 
                                            Datos Profesionales
                                        </td>
                                    </tr>   
                                    <tr> 
                                        <td>
                                            <div class="group-form">
                                                <label>Titulo Adquirido</label>
                                                <input type="text"  name="titulo" value="<c:out value="${datosPrs.titulo}"/>"/>
                                            </div> 
                                        </td>
                                        <td colspan="2">
                                            <div class="group-form">
                                                <label>Universidad</label>
                                                <input type="text"  name="nro_seguro_medico" value="<c:out value="${datosPrs.nro_seguro_medico}"/>"/>
                                            </div> 
                                        </td> 
                                    </tr> 
                                    <tr>
                                        <td class="titulo-tabla" colspan="3"> 
                                            Datos Adicionales
                                        </td>
                                    </tr>   
                                    <tr> 
                                        <td>
                                            <div class="group-form">
                                                <label>Nro. Hijos</label>
                                                <input type="text"  name="nro_hijos" value="<c:out value='${datosPrs.nro_hijos}'/>"/>
                                            </div>
                                        </td>
                                        <td colspan="2">
                                            <div class="group-form">
                                                <label>Nro. Dependientes</label>
                                                <input type="text"  name="nro_dependientes" value="<c:out value='${datosPrs.nro_dependientes}'/>"/>
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
                                        <td class="etiqueta4">Tipo Grado <span class="obligatorio">(*)</span></td> 
                                        <td> <c:out value="${datoPlan.tipo_grado}"/>
                                            <input type="hidden" name='id_tipo_grado'  value='<c:out value="${datoPlan.id_tipo_grado}"/>'>
                                        </td>
                                    </tr> 
                                    <tr>
                                        <td class="etiqueta4">Tipo de Estudiante <span class="obligatorio">(*)</span>
                                        </td> 
                                        <td> <c:out value="${tipoEst.tipo_estudiante}"/>
                                            <input type="hidden" name='id_tipo_estudiante'  value='<c:out value="${tipoEst.id_tipo_estudiante}"/>'>
                                        </td>
                                    </tr> 
                                    <tr>
                                        <td class="etiqueta4">Tipo Admision <span class="obligatorio">(*)</span> </td> 
                                        <td> <c:out value="${datosTipodm.tipo_admision}"/>
                                            <input type="hidden" name='id_tipo_admision'  value='<c:out value="${datosTipodm.id_tipo_admision}"/>'>
                                        </td>
                                    </tr>     
                                    <tr>
                                        <td class="etiqueta4">Facultad<span class="obligatorio">(*)</span> </td>
                                        <td>
                                            <select  id='id_facultad' name='id_facultad' onchange="cambiarprograma(this)">
                                                <option value="-1">-- Seleccione --</option>
                                                <c:forEach var="item" items="${lFacultades}" >
                                                    <option value='<c:out value="${item.id}"/>' <c:if test="${item.id == id_facultad}">selected</c:if> >
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
                                    <tr id="displaydesconcentrado">
                                        <td class="etiqueta4">Sede Area Desconcentrada de Programa <span class="obligatorio">(*)</span> </td>
                                        <td>
                                            <select id='id_desconcentrado' name='id_desconcentrado'> 
                                            </select>
                                        </td> 
                                    </tr>
                                    <tr>
                                        <td class="etiqueta4">
                                            Plan <span class="obligatorio">(*)</span> 
                                        </td>	
                                        <td>
                                            <select id ='id_prg_plan' name ='id_prg_plan'>
                                            </select>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="etiqueta4">Tipo Clasificaci&oacute;n <span class="obligatorio">(*)</span>
                                        </td> 
                                        <td>
                                            <select name="id_tipo_clasificacion">
                                                <option value="-1">-- Elija una opci&oacute;n --</option>
                                                <c:forEach var="listaC" items="${lTiposClasificaciones}" >
                                                    <option value='<c:out value="${listaC.id_tipo_clasificacion}"/>' <c:if test="${bPst.id_tipo_clasificacion ==  listaC.id_tipo_clasificacion}"> selected </c:if>>
                                                        <c:out value="${listaC.tipo_clasificacion}"/>
                                                    </option>
                                                </c:forEach>
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
                        <td colspan="2">
                            <button onClick="fguardar()" type='button' id="btnenviar"  role="button"  class="btn">Guardar</button> 
                            <input type="hidden" name="id_proceso" value="<c:out value='${id_proceso}'/>">
                            <input type="hidden" name="id_tramite" value="<c:out value='${id_tramite}'/>">
                            <input type="hidden" name="id_persona" value="<c:out value='${buscarEst.id_persona}'/>">
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
                                var idFacultad =${id_facultad};
                                var lprogramas =${lProgramas};
                                var lPlanes =${lPlanesActual};
                                var lSedes =${lDesconcentrado};
                                var lDepartamentos =${lDepartamentos};
                                var lProvincia =${lProvincias};
                                var lLocalidad =${lLocalidades};
                                var lColegios =${lColegiosTipoInst};

                                var idPrograma =${id_programa};
                                var idPais =${datosPrs.id_pais};
                                var idDepartamento =${datosPrs.id_departamento};
                                var idProvincia =${datosPrs.id_provincia};
                                var idLocalidad =${datosPrs.id_localidad};
                                var idTipoInstitucion =${bEstColegio.id_tipo_institucion};
                                var idColegio =${bEstColegio.id_colegio};

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
                                    document.getElementById('id_prg_plan').innerHTML = optionscollection(lPlanes, idPrograma, -1);
                                    document.getElementById('id_desconcentrado').innerHTML = optionscollectioncomplete(lSedes, idPrograma, -1);
                                    document.getElementById('id_departamento_n').innerHTML = optionscollection(lDepartamentos, idPais, idDepartamento);
                                    document.getElementById('id_provincia_n').innerHTML = optionscollection(lProvincia, idDepartamento, idProvincia);
                                    document.getElementById('id_localidad_n').innerHTML = optionscollection(lLocalidad, idProvincia, idLocalidad);
                                    document.getElementById('id_colegio').innerHTML = optionscollection(lColegios, idTipoInstitucion, idColegio);

                                }
                                const cambiarprograma = (e) => {
                                    document.getElementById('id_programa').innerHTML = optionscollection(lprogramas, parseInt(e.value), idPrograma);
                                };
                                const cambiarplanes = (e) => {
                                    document.getElementById('id_prg_plan').innerHTML = optionscollection(lPlanes, parseInt(e.value), -1);
                                    document.getElementById('id_desconcentrado').innerHTML = optionscollectioncomplete(lSedes, parseInt(e.value), -1);
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
                                    if (document.forma.id_prg_plan.value === "-1") {
                                        alert("Debe seleccionar el plan de estudio");
                                        return;
                                    }

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
                                    if (document.forma.id_tipo_grado.value === "-1") {
                                        alert("Debe introducir el tipo de grado");
                                        return;
                                    }
                                    if (document.forma.id_tipo_admision.value === "-1") {
                                        alert("Debe introducir el tipo de admision");
                                        return;
                                    }
                                    if (document.forma.id_tipo_clasificacion.value === "-1") {
                                        alert("Debe introducir el tipo de clasificacion de estudiante");
                                        return;
                                    }
                                    if (document.forma.id_tipo_estudiante.value === "-1") {
                                        alert("Debe introducir el tipo de estudiante");
                                        return;
                                    }
                                    if (document.forma.anio_titulacion.value === "") {
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
