<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0//EN">
<html>
    <head>
        <title>Sistema Integrado - Moxos</title>

        <link rel="stylesheet" href="<c:url value='/pagina.css'/>" type="text/css">
        <link rel="stylesheet" href="<c:url value='/basico.css'/>" type="text/css">
        <link rel="stylesheet" href="<c:url value='/principal.css'/>" type="text/css">
        <link href="imagenes\principal\aureliox.ico" rel="shortcut icon" type="image/x-icon">
        <script type="text/javascript" src="<c:url value='/js/funciones.js'/>"></script>
        <script type="text/javascript" src="<c:url value='/js/herramientas.js'/>"></script>
        <script type="text/javascript" src="<c:url value='/js/ajax.js'/>"></script>

        <META HTTP-EQUIV="Cache-Control" CONTENT="max-age='0'" />
        <META HTTP-EQUIV="Cache-Control" CONTENT="no-cache" />
        <META http-equiv="expires" content="0" />
        <META HTTP-EQUIV="Expires" CONTENT="Tue, 01 Jan 1980 1:00:00 GMT" />
        <META HTTP-EQUIV="Pragma" CONTENT="no-cache" />
    </head>
    <body>
        <div class="titulo">Buscar Estudiantes</div>
    <br>
    <form name=forma method="POST" action='<c:url value="/entradaEstudiante/ProgramaSede.fautapo"/>'>
        <table class="formulario">
            <tr>
                <td>
                    <table width="100%">
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
                        <tr>
                            <td>
                                <fieldset>
                                    <legend>Introduzca C&eacute;dula de Identidad</legend>
                                    <table align=right>
                                        <tr>
                                            <td class="etiqueta">CI</td>
                                            <td class="etiqueta">::</td>	
                                            <td><input type=text name="ci" maxlength=35 onblur='validar(this, "A9")'></td>
                                            <td><input type=submit name="buscar" value='Buscar' class="buscar"></td>
                                        </tr>
                                    </table>
                                </fieldset>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <fieldset>
                                    <legend>Introduzca un Nombre</legend>
                                    <table align=right>
                                        <tr>
                                            <td class="etiqueta">Nombres</td>
                                            <td class="etiqueta">::</td>	
                                            <td><input type=text name="nombres" maxlength=35 onblur='validar(this, "A9")'></td>
                                            <td><input type=submit name="buscar" value='Buscar' class="buscar"></td>
                                        </tr>
                                    </table>
                                </fieldset>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
