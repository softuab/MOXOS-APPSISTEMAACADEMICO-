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
    <body>
        <div class="titulo"><c:out value="${titulo}"/></div>
        <br>
        <form name="fvolver" action="<c:url value='/estudianteNuevo/entrada.fautapo'/>" method="post">
            <input type="hidden" name="id_proceso" value="<c:out value='${id_proceso}'/>">
            <input type="hidden" name="id_tramite" value="<c:out value='${id_tramite}'/>">
            <input type="hidden" name="titulo" value="<c:out value='${titulo}'/>">
            <div> <a class="volver" href="javascript:document.fvolver.submit();"> Volver</a> </div>
        </form>
        <br>
        <form  name=forma action="<c:url value="/estudianteNuevo/registrarTiposDocumentosPersona.fautapo"/>" method="POST">
            <table class="formulario" aria-describedby="formulario de requisitos documentos"> 
                <thead><th colspan="2"></th></thead>
                <tbody>
                    <tr>
                        <td>
                            <table class="formulario" aria-describedby="datos estudiante">
                                <thead><th colspan="2"></th></thead>
                                <tbody>
                                    <tr>
                                        <td colspan="2" class="titulo-tabla"> DATOS DEL ESTUDIANTE </td>
                                    </tr>  
                                    <tr>
                                        <td class="etiqueta4">Nombres ::</td>
                                        <td><c:out value="${buscarEst.paterno}"/>  <c:out value="${buscarEst.materno}"/>  <c:out value="${buscarEst.nombres}"/></td>
                                    </tr>
                                    <tr>
                                        <td class="etiqueta4">DIP ::</td>
                                        <td><c:out value="${buscarEst.dip}"/></td>
                                    </tr>
                                    <tr>
                                        <td class="etiqueta4">Programa ::</td>
                                        <td><c:out value="${buscarEst.programa}"/></td>
                                    </tr>
                                    <tr>
                                        <td class="etiqueta4">Sede Area Desconcentrada de Programa::<span class="obligatorio">(*)</span> </td>
                                        <td><c:out value="${buscarEst.sede_desconcentrada}"/></td> 
                                    </tr>
                                    <tr>
                                        <td class="etiqueta4">Plan ::</td>
                                        <td><c:out value="${buscarEst.id_plan}"/></td>
                                    </tr>
                                    <tr>
                                        <td class="etiqueta4">Tipo Clasificaci&oacute;n ::</td>
                                        <td><c:out value="${datosClas.tipo_clasificacion}"/></td>
                                    </tr>
                                    <tr>
                                        <td class="etiqueta4">Tipo Estudiante ::</td>
                                        <td><c:out value="${buscarEst.tipo_estudiante}"/></td>
                                    </tr>
                                    <tr>
                                        <td class="etiqueta4">Tipo Grado ::</td>
                                        <td><c:out value="${buscarEst.tipo_grado}"/></td>
                                    </tr>
                                    <tr>
                                        <td class="titulo-tabla" colspan="2">HABILITAR</td>
                                    </tr>
                                    <tr>
                                        <td class="etiqueta4">Estudiante ::</td>
                                        <td><c:if test="${buscarEst.id_estado == 'B'}"> Bloqueado </c:if><c:if test="${buscarEst.id_estado == 'A'}"> Habilitado </c:if></td>
                                        </tr>
                                    </tbody>
                                </table>
                            </td>
                            <td style="vertical-align:top">  	  
                                <table class="formulario" aria-describedby="datos contable">
                                    <thead><th colspan="2"></th></thead>
                                    <tbody>
                                        <tr><th colspan="2" class="titulo-tabla">DATOS PARA CAJAS</th></tr> 
                                        <tr>
                                            <td colspan="2">
                                                <table class="table" aria-describedby="datos perfil">
                                                    <thead> 
                                                        <tr>
                                                            <th>? </th>
                                                            <th>PERFIL </th>
                                                            <th>TIPO PERFIL </th>
                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                    <c:forEach var="lPerfil" items="${lPerfilesProcesos}" varStatus="contador">
                                                        <tr>
                                                            <td><input type="checkbox" id="id_perfil_prorroga<c:out value='${lPerfil.id_perfil}'/>" name="id_perfil_proceso_p" value="<c:out value='${lPerfil.id_perfil_proceso}'/>" <c:if test="${lPerfil.id_perfil != formatoPerfilProrroga}">checked </c:if> ></td> 
                                                            <td><c:out value='${lPerfil.perfil}'/></td> 
                                                            <td><c:out value='${lPerfil.tipo_perfil}'/> </td> 	
                                                        </tr>
                                                    </c:forEach> 
                                                </tbody>
                                            </table>
                                        </td>
                                    </tr>  
                                </tbody>
                            </table>
                        </td>
                    </tr>

                    <tr>
                        <td colspan="2" class="titulo-tabla">  DOCUMENTACION </td>
                    </tr>   	
                    <tr>
                        <td>  Documentaci&oacute;n Presentada </td>
                        <td>  Pr&oacute;rrogas</td>
                    </tr>   	
                    <tr> 
                        <td  colspan="2">
                            <table class="table" witdh="50%" aria-describedby="datos documentos requisitos">
                                <thead>
                                    <tr>
                                        <th>? </th>
                                        <th>TIPO DOCUMENTO </th>
                                        <th>PRESENT&Oacute; </th>
                                        <th>CANTIDAD </th>
                                        <th>OBS. </th>
                                        <th>HACER <br>PR&Oacute;RROGA? </th>
                                        <th>TIPO COMPROMISO</th>
                                        <th>CAUSA</th>
                                        <th>GESTION<br>PERIODO </th>
                                        <th>FECHA DE VENCIMIENTO </th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="lDocumento" items="${lPrsDocumentosClasificacion}" varStatus="contadorClas">
                                        <tr>
                                            <td> <c:out value='${contadorClas.count}'/> <c:if test="${lDocumento.compromiso == 'f'}"><span class='obligatorio'>(*)</span></c:if></td> 
                                            <td> <c:out value='${lDocumento.tipo_documento}'/> <c:if test="${lDocumento.compromiso=='t'}"></c:if></td> 
                                            <td style="white-space: nowrap;">Si<input type="radio" name="presento<c:out value='${lDocumento.id_tipo_documento}'/>"  value="true" <c:if test="${lDocumento.presento == true}"> checked </c:if> > &nbsp;No<input type="radio" name="presento<c:out value='${lDocumento.id_tipo_documento}'/>"  value="false" <c:if test="${lDocumento.presento == false}"> checked</c:if> ></td>
                                            <td> <input type="text" name="numero<c:out value='${lDocumento.id_tipo_documento}'/>"  value="1" size="1" maxlength="2"> </td> 
                                            <td> <input type="text" name="observacion<c:out value='${lDocumento.id_tipo_documento}'/>" size="20" > </td> 
                                            <td style="white-space: nowrap;">
                                                <c:if test="${lDocumento.compromiso == false}">  No puede  </c:if>
                                                <c:if test="${lDocumento.compromiso == true}">  Si <input type="radio" id="prorroga_si<c:out value='${lDocumento.id_tipo_documento}'/>" name="prorroga<c:out value='${lDocumento.id_tipo_documento}'/>"  value="true"  OnClick="Javascript:fseleccionar();" > &nbsp;No <input type="radio" id="prorroga_no<c:out value='${lDocumento.id_tipo_documento}'/>" name="prorroga<c:out value='${lDocumento.id_tipo_documento}'/>"  value="false" OnClick="Javascript:fdeseleccionar();" checked ></c:if>
                                                </td>
                                            <c:if test="${lDocumento.compromiso == false}">
                                                <td></td>
                                                <td></td>
                                                <td></td>
                                                <td></td>
                                            </c:if>
                                            <c:if test="${lDocumento.compromiso == true}">
                                                <td>
                                                    <select name="id_tipo_compromiso_<c:out value='${lDocumento.id_tipo_documento}'/>">
                                                        <option value="">-- Seleccione --</option>
                                                        <c:forEach var="lista" items="${lTiposCompromisos}" >
                                                            <option value='<c:out value="${lista.id_tipo_compromiso}"/>' >
                                                                <c:out value="${lista.tipo_compromiso}"/> 
                                                            </option>
                                                        </c:forEach>
                                                    </select>
                                                </td>
                                                <td><input type="text" name="observacionCompromiso<c:out value='${lDocumento.id_tipo_documento}'/>" size="20" > </td> 	
                                                <td><c:out value="${gestion}"/>-<c:out value="${periodo}"/>  </td> 
                                                <td style="white-space: nowrap;"> 
                                                    <input type="text" name="fec_vencimiento<c:out value='${lDocumento.id_tipo_documento}'/>"  value='<fmt:formatDate value="${now}" pattern="${formatoFecha}"/>'
                                                           maxlength='10' size='10' title="Fecha de vencimiento" > &nbsp; <small> <a href="javascript:showCal('fec_vencimiento<c:out value='${lDocumento.id_tipo_documento}'/>')"> <img src="../imagenes/dibRap/calendario.jpeg" border="0" title="Seleccione la fecha" /></a></small>
                                                </td> 
                                            </c:if>
                                        </tr>
                                    </c:forEach>
                                    <tr>
                                        <td colspan="10">
                                            <div class="nota">Los documentos con <span class="obligatorio">(*)</span>, son obligatorios para el <c:out value="${datosClas.tipo_clasificacion}"/>.</div>   
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" class="titulo-tabla"> PRORROGAS REALIZADAS </td>
                    </tr>   	
                    <tr>
                        <td style="vertical-align:top">
                            <table class="table" aria-describedby="datos de compromiso">
                                <thead>
                                    <tr>
                                        <th>Nro. </th>
                                        <th>TIPO DOCUMENTO</th>
                                        <th>TIPO COMPROMISO</th>
                                        <th>GESTION<br>DE PRORROGA</th>
                                        <th>DETALLE</th>
                                        <th>FECHA DE VENCIMIENTO</th>
                                    </tr>
                                </thead>
                                <c:forEach var="lCompromisoT" items="${lPrsCompromisosTodo}" varStatus="contadorC">
                                    <tr>
                                        <td><c:out value='${contadorC.count}'/>  </td> 
                                        <td><c:out value='${lCompromisoT.tipo_documento}'/>
                                        <td><c:out value='${lCompromisoT.tipo_compromiso}'/></td> 
                                        <td><c:out value="${gestion}"/> - <c:out value="${periodo}"/>  </td> 
                                        <td> <c:out value='${lCompromisoT.observacion}'/> </td> 
                                        <td> <c:out value='${lCompromisoT.fec_vencimiento}'/>
                                        </td> 
                                    </tr>
                                </c:forEach>
                            </table>
                        </td>
                    </tr>  	  	
                    <tr>
                        <td colspan="2">
                            <button onClick="fguardar()" type='button' id="btnenviar"  role="button"  class="btn">Guardar</button>  
                            <input type="hidden" name="id_estudiante"  value="<c:out value="${buscarEst.id_estudiante}"/>">
                            <input type="hidden" name="id_persona"     value="<c:out value="${buscarEst.id_persona}"/>">
                            <input type="hidden" name="id_tramite"     value="<c:out value="${id_tramite}"/>">
                            <input type="hidden" name="gestion"        value="<c:out value="${gestion}"/>">
                            <input type="hidden" name="periodo"        value="<c:out value="${periodo}"/>">
                            <input type="hidden" name="titulo"         value="<c:out value="${titulo}"/>">
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
        <script src="<c:url value='/js/main.js'/>" type="text/javascript"></script>
        <script language="JavaScript">
                                var documentos = new Array();
                                var h = 0;
            <c:forEach var="lDocumento" items="${lPrsDocumentosClasificacion}">
                <c:if test="${lDocumento.compromiso==true}">
                                documentos[h] = <c:out value='${lDocumento.id_tipo_documento}'/>;
                                h++;
                </c:if>
            </c:forEach>
                                function fguardar()
                                {
                                    if ((document.forma.id_estudiante.value !== 0))
                                    {
                                        document.getElementById('btnenviar').disabled = true;
                                        document.getElementById('btnenviar').innerHTML = '<i class="fa fa-spinner fa-spin"></i>  Registrando';
                                        document.forma.submit();
                                    } else
                                    {
                                        alert("Los documentos con (*), son obligatorios. No puede hacer PRORROGA Y/O COMPROMISO para esos documentos");
                                    }
                                }

                                function fseleccionar() {
                                    objeto = document.getElementById("id_perfil_prorroga" + <c:out value='${formatoPerfilProrroga}'/>);
                                    objeto.checked = 1;
                                }
                                function fdeseleccionar() {
                                    var bandera_si = false;
                                    objeto = document.getElementById("id_perfil_prorroga" + <c:out value='${formatoPerfilProrroga}'/>);
                                    for (i = 0; i < documentos.length; i++) {
                                        var objetos_si = document.getElementById("prorroga_si" + documentos[i]);
                                        if ((objetos_si.checked) && (bandera_si === false)) {
                                            bandera_si = true;
                                        }
                                    }
                                    if (!bandera_si)
                                        objeto.checked = false;
                                }
        </script>
    </body>
</html>
