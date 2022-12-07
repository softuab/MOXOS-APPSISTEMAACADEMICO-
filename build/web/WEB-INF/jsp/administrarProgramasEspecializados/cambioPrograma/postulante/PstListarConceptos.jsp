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
        <link rel="stylesheet" href="<c:url value='/css/grid.css'/>" type="text/css">   
        <title>Moxos - academico</title>
    </head>
    <body onload="init()">
        <div class="titulo"><c:out value="${proceso.proceso}"/></div>
        <div class="volver"><a href="javascript:history.back();">Volver</a></div>
        <br>
        <table class="tabla">
            <thead>
            <th colspan="6">DATOS POSTULANTE</th>
        </thead>
        <tbody>
            <tr>
                <td>postulante</td>
                <td>
                    <c:out value="${postulante.nombres}"/> <c:out value="${postulante.paterno}"/> <c:out value="${postulante.materno}"/>
                </td>
                <td>RU</td>
                <td><c:out value="${postulante.id_postulante}"/></td>
                <td>Gesti&oacute;n</th>
                <td><c:out value="${periodo}"/>-<c:out value="${gestion}"/></td>
            </tr>
            <tr>
                <td>Programa</td>
                <td><c:out value="${postulante.programa}"/>
                <td>Plan</td>
                <td><c:out value="${postulante.id_plan}"/>
                <td>Fecha</td>
                <td><fmt:formatDate value="${now}" pattern="${formatoFecha}"/></td>
            </tr>
        </tbody>
    </table>
    <br>
    <form name="forma" id="forma" method="post" action="pstRegistrarPrograma.fautapo" >
        <input type="hidden" name="id_tramite" value="<c:out value='${id_tramite}'/>">
        <input type="hidden" name="id_proceso" value="<c:out value='${proceso.id_proceso}'/>">
        <input type="hidden" name="programa" id="programa" value="">
        <input type="hidden" name="plan" id="plan" value="">
        <table class="formulario">
            <tr>
                <th>Cambiar al programa</th>
            </tr>
            <tr>
                <td>
                    <div class="container-grid">
                        <div class="row">
                            <div class="col-xs-4 right"><label>Facultad::</label></div>
                            <div class="col-xs-4">
                                <select id='id_facultad' name='id_facultad' onchange="cambiarprograma(this);">
                                    <option value="-1">-- Seleccione --</option>
                                    <c:forEach var="item" items="${lFacultades}" >
                                        <option value='${item.id}' <c:if test="${item.id == id_facultad}">selected</c:if> >
                                            <c:out value="${item.value}"/> 
                                        </option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-4 right"><label>Programa<span class="obligatorio">(*)</span>::</label></div>
                            <div class="col-xs-4"> 
                                <select id='id_programa' name='id_programa' onchange="cambiarplanes(this);"> </select>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-4 right"><label>Plan<span class="obligatorio">(*)</span>::</label></div>
                            <div class="col-xs-4"> 
                                <select id='id_plan' name='id_plan'> </select>
                            </div>
                        </div>
                    </div>
                </td>
            </tr>
            <tr> 
                <td>
                    <button onClick="fguardar()" type='button' id="btnenviar"  role="button"  class="btn">Guardar</button> 
                </td>
            </tr> 
        </table>
    </form> 
    <div class="nota">Los campos con <span class="obligatorio">(*)</span>, son obligatorios.</div>
    <script type="text/javascript" src="<c:url value='/js/sistema/operaciones.js'/>"></script> 
    <script>
                        //lista de objetos
                        var lprogramas =${lProgramas};
                        var lPlanes =${lPlanes};

                        var idFacultad =${id_facultad};
                        var idPrograma =${id_programa};

                        const init = () => {
                            document.getElementById('id_programa').innerHTML = optionscollection(lprogramas, idFacultad, idPrograma);
                            document.getElementById('id_plan').innerHTML = optionscollection(lPlanes, idPrograma, -1);
                        }
                        const cambiarprograma = (e) => {
                            document.getElementById('id_programa').innerHTML = optionscollection(lprogramas, parseInt(e.value), idPrograma);
                        };
                        const cambiarplanes = (e) => {
                            document.getElementById('id_plan').innerHTML = optionscollection(lPlanes, parseInt(e.value), -1);
                        };
                        const fguardar = () =>
                        {
                            if (document.forma.id_facultad.value === "-1") {
                                alert("Debe seleccionar la facultad");
                                return;
                            }

                            if (document.forma.id_programa.value === "-1") {
                                alert("Debe seleccionar el programa");
                                return;
                            }

                            if (document.forma.id_plan.value === "") {
                                alert("Debe seleccionar el plan");
                                return;
                            }
                            document.getElementById("programa").value = document.getElementById("id_programa").options[document.getElementById("id_programa").selectedIndex].innerHTML;
                            document.getElementById("plan").value = document.getElementById("id_plan").options[document.getElementById("id_plan").selectedIndex].innerHTML;
                            document.getElementById('btnenviar').disabled = true;
                            document.getElementById('btnenviar').innerHTML = '<i class="fa fa-spinner fa-spin"></i>  Registrando';
                            document.forma.submit();
                        };
    </script>
</body>
</html>
