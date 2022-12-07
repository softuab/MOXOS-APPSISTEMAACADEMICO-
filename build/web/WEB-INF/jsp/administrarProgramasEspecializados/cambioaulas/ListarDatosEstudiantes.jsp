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
        <link rel="stylesheet" href="<c:url value='/css/dropdown.css'/>" type="text/css">
        <title>Moxos - Academico</title>
    </head>
    <body>
        <div class="titulo">Lista de Estudiantes</div>
        <br>
        <table>
            <tr>
                <td>
                    <form id="fvolver" name="fvolver" action="<c:url value="/estudiante/cambioaula/buscarEstudianteEntrada.fautapo"/>" method="get">
                        <div> <a class="volver" href="javascript:enviarSolicitud('fvolver');"> Volver</a> </div>
                    </form>
                </td>
            </tr>
        </table>
        <div class="container">
            <div class="search-content">
                <input type="text" onkeyup="filter(this, 'table')" id="search" class="search"  placeholder="Buscar por nombres.." title="Type in a name"> 
            </div>
            <div class="table-content">
                <table class="table" id="table" aria-describedby="lista de estudiantes">
                    <thead>
                        <tr>
                            <th scope="informacion" colspan="11">INFORMACION ENCONTRADA EN ESTUDIANTES</th>
                        </tr>
                        <tr>
                            <th scope="RU">RU</th>
                            <th scope="DIP">DIP</th>
                            <th scope="NOMBRED">NOMBRES</th>
                            <th scope="PROGRAMA">PROGRAMA</th> 
                            <th scope="VER">CAMBIAR AULA</th> 
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="datos" items="${lEstudiantes}" varStatus="contador">
                            <tr class="filter">
                                <td><c:out value="${datos.id_estudiante}"/></td>
                                <td><c:out value="${datos.dip}"/></td>
                                <td><c:out value="${datos.paterno}"/> <c:out value="${datos.materno}"/> <c:out value="${datos.nombres}"/></td>
                                <td><c:out value="${datos.programa}"/></td> 
                                <td>
                                    <form id="forma<c:out value="${contador.count}"/>" name=forma<c:out value="${contador.count}"/> method="Get" action='<c:url value="/estudiante/cambioaula/cambiarAula.fautapo"/>'>
                                        <input type="hidden" name="id_estudiante" value="<c:out value="${datos.id_estudiante}"/>"/>
                                        <input type="hidden" name="nombre_completo" value="<c:out value="${datos.paterno}"/> <c:out value="${datos.materno}"/> <c:out value="${datos.nombres}"/>"/>
                                        <input type="hidden" name="id_programa" value="<c:out value="${datos.id_programa}"/>"/>
                                        <input type="hidden" name="programa" value="<c:out value="${datos.programa}"/>"/>
                                    </form> 
                                    <a href="javascript:enviarSolicitud('forma<c:out value="${contador.count}"/>');">Cambiar aula</a>
                                </td>
                            </tr> 
                        </c:forEach> 
                    </tbody>
                </table>
            </div>
        </div>       
        <div id="loader" class="modal"> 
            <div class="modal-content"> 
                <span class="loader"></span>
                <span>Enviando solicitud...</span>
            </div>
        </div>  
        <script src="<c:url value='/js/main.js'/>" type="text/javascript"></script> 
        <script>
                    var modal = document.getElementById("loader");
                    const enviarSolicitud = (formulario) => {
                        modal.style.display = "block";
                        document.getElementById(formulario).submit();
                    }
        </script>
    </body>
</html>