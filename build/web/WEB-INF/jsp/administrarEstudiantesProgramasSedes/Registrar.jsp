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
    <body>
        <div class="titulo">Estudiantes Programas Sede</div>
        <br>
        <form name="fvolver" action="<c:url value="/entradaEstudiante/ProgramaSede.fautapo"/>" method="post"> 
            <div> <a class="volver" href="javascript:document.fvolver.submit();"> Volver</a> </div>
        </form>
        <br> 
        <div class="nota">Los campos con <span class="obligatorio">(*)</span>, son obligatorios.</div> 

        <table class="tabla">
            <tr>
                <th>RU</th>
                <th>ESTUDIANTE</th>
                <th>PROGRAMA</th>
            </tr>
            <tr>
                <td><c:out value="${datosEstudiante.id_estudiante}"/></td>
                <td>
                    <c:out value="${datosEstudiante2.nombres}"/> &nbsp; 
                    <c:out value="${datosEstudiante2.paterno}"/> &nbsp;
                    <c:out value="${datosEstudiante2.materno}"/>
                </td>
                <td><c:out value="${programa.programa}"/>
            </tr>
        </table> 
        <form name="forma" method="post" action="<c:url value="registrarSedeProgramaEstudiante.fautapo"/>">
            <input type="hidden" name="id_estudiante" value='<c:out value="${id_estudiante}"/>'>
            <input type="hidden" name="id_programa" value='<c:out value="${programa.id_programa}"/>'>
            <input type="hidden" name="accion" value="Nuevo"/>
            <table class="formulario" aria-describedby="formulario de registro de sede">
                <thead>
                    <tr>
                        <th class="titulo-tabla">INTRODUZCA LOS DATOS</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>
                            <div class="container-grid">
                                <div class="row">
                                    <div class="col-xs-4 right">
                                        <label>SEDE::<span class="obligatorio">(*)</span></label>
                                    </div>
                                    <div class="col-xs-8">
                                        <select id="id_desconcentrado" name="id_desconcentrado">
                                            <option value="-1">Elija una opci&oacute;n...</option>
                                            <c:forEach var="lista" items="${lProgramasFacDescocentrados}">
                                                <option value="<c:out value="${lista.id_desconcentrado}"/>"><c:out value="${lista.sede_desconcentrada}"/></option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-xs-4 right">
                                        <label>Nota::<span class="obligatorio">(*)</span></label>
                                    </div>
                                    <div class="col-xs-8">
                                        <textarea  id="numb" class="form-control" name="nota" rows="3" ></textarea>
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
                </tbody>  
            </table> 
        </form> 
        <script>
            const fguardar = () => {
                if (document.forma.id_desconcentrado.value === "-1") {
                    alert("Debe seleccionar la Sede");
                    return;
                }
                document.getElementById('btnenviar').disabled = true;
                document.getElementById('btnenviar').innerHTML = '<i class="fa fa-spinner fa-spin"></i>  Registrando';
                document.forma.submit();
            }
        </script>
    </body>
</html>
