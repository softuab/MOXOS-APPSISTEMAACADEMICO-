<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<jsp:useBean id="now" class="java.util.Date"/> 
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value='/css/impresion/style.css'/>" rel="stylesheet" type="text/css"/>
        <link href="<c:url value='/css/impresion/style2.css'/>" rel="stylesheet" type="text/css"/>
        <link href="<c:url value='/css/impresion/style3.css'/>" rel="stylesheet" type="text/css"/>
        <link href="<c:url value='/css/impresion/stylereport.css?'/>" rel="stylesheet" type="text/css"/>
        <link href="<c:url value='/css/loader.css'/>" rel="stylesheet" type="text/css"/>
        <title>Moxos - Academico</title> 
    </head>
    <body>
        <div id="sidebar">
            <div id="outline"></div>
        </div>
        <div id="page-container">
            <div id="pf1" class="pf w0 h0" data-page-no="1">
                <div class="head"> 
                    <div class="grid-item">
                        <img src='<c:url value="/imagenes/logos/logominiatura.png"/>' alt="" />
                    </div>
                    <div class="titulo">
                        UNIVERSIDAD AUTONOMA DEL BENI JOSE<br />
                        BALLIVIAN<br />
                        <c:out value='${datosInstitucion.localidad}'/> - <c:out value='${datosInstitucion.departamento}'/> - <c:out value='${datosInstitucion.pais}'/><br>
                        <c:out value='${datosInstitucion.actividad}'/>
                    </div>
                    <div class="grid-item"><img src="data:image/png;base64,${qr}" alt="" /></div>
                </div>
                <div class="head">
                    <div class="grid-item"></div>
                    <div class="titulo">
                        REGISTRO DE POSTULANTE
                    </div>
                    <div class="grid-item"></div>
                </div> 
                <div class="body"> 
                    <div class="titulo">
                        <table class="table">
                            <thead>
                            <th colspan="4"></th>
                            </thead>
                            <tbody>
                                <tr>
                                    <td class="titulo-tabla" colspan="2">DATOS PERSONA</td>
                                    <td class="titulo-tabla" colspan="2">DATOS BACHILLERATO</td>
                                </tr>
                                <tr>
                                    <td><strong>Nro. DIP:</strong></td>
                                    <td><c:out value="${datosPst.dip}"/></td>
                                    <td><strong>Colegio::</strong></td>
                                    <td><c:out value="${datosColegio.colegio}"/></td> 
                                </tr> 
                                <tr>
                                    <td><strong>Nombres ::</strong></td>
                                    <td><c:out value="${datosPst.paterno}"/>&nbsp;<c:out value="${datosPst.materno}"/>&nbsp;<c:out value="${datosPst.nombres}"/></td>
                                    <td><strong>Turno ::</strong></td>
                                    <td><c:out value="${datosColegio.tipo_turno}"/></td> 
                                </tr>
                                <tr>
                                    <td><strong>Sexo ::</strong></td>
                                    <td><c:out value="${datosPst.tipo_sexo}"/></td>
                                    <td><strong>Tipo Institución ::</strong></td>
                                    <td><c:out value="${datosColegio.tipo_institucion}"/></td> 
                                </tr>
                                <tr>
                                    <td><strong>Fecha de Nacimiento ::	</strong></td>
                                    <td><fmt:formatDate value="${datosPst.fec_nacimiento2}" pattern="dd/MM/yyyy"/></td>
                                    <td><strong>País de Egreso ::</strong></td>
                                    <td><c:out value="${datosColegio.pais}"/></td> 
                                </tr>
                                <tr>
                                    <td><strong>País de Nac. ::	</strong></td>
                                    <td><c:out value="${datosPst.pais}"/></td>
                                    <td><strong>Departamento de Egreso ::</strong></td>
                                    <td><c:out value="${datosColegio.departamento}"/></td> 
                                </tr>
                                <tr>
                                    <td><strong>Departamento de Nac. ::</strong></td>
                                    <td><c:out value="${datosPst.departamento}"/></td>
                                    <td><strong>Provincia de Egreso ::</strong></td>
                                    <td><c:out value="${datosColegio.provincia}"/></td> 
                                </tr>
                                <tr>
                                    <td><strong>Provincia de Nac. ::</strong></td>
                                    <td><c:out value="${datosPst.provincia}"/></td>
                                    <td><strong>Localidad de Egreso ::</strong></td>
                                    <td><c:out value="${datosColegio.localidad}"/></td> 
                                </tr>
                                <tr>
                                    <td><strong>Localidad de Nac. ::</strong></td>
                                    <td><c:out value="${datosPst.localidad}"/></td>
                                    <td><strong>Año de Egreso ::</strong></td>
                                    <td><c:out value="${datosColegio.anio_egreso}"/></td> 
                                </tr>
                                <tr>
                                    <td><strong>Dirección ::</strong></td>
                                    <td colspan="3" ><c:out value="${datosPst.direccion}"/></td> 
                                </tr>
                                <tr>
                                    <td><strong>Teléfono ::</strong></td>
                                    <td colspan="3" ><c:out value="${datosPst.telefono}"/></td> 
                                </tr>
                                <tr>
                                    <td><strong>Celular ::</strong></td>
                                    <td colspan="3" ><c:out value="${datosPst.celular}"/></td> 
                                </tr>
                                <tr>
                                    <td><strong>Correo ::</strong></td>
                                    <td colspan="3" ><c:out value="${datosPst.correo}"/></td> 
                                </tr>
                                <tr>
                                    <td class="titulo-tabla" colspan="4">DATOS DE POSTULANTE</td> 
                                </tr>
                                <tr>
                                    <td><strong>R.P. ::</strong></td>
                                    <td colspan="3" ><c:out value="${datosPst.id_postulante}"/></td> 
                                </tr>
                                <tr>
                                    <td><strong>Programa ::</strong></td>
                                    <td colspan="3" ><c:out value="${datosPst.programa}"/></td> 
                                </tr>
                                <tr>
                                    <td><strong>Tipo Clasificación ::</strong></td>
                                    <td colspan="3" ><c:out value="${datosPst.tipo_clasificacion}"/></td> 
                                </tr>
                                <tr>
                                    <td><strong>Tipo Admisión ::</strong></td>
                                    <td colspan="3" ><c:out value="${datosPst.tipo_admision}"/></td> 
                                </tr>
                                <tr>
                                    <td colspan="6">
                                        <form id="formulario" action="<c:url value='/listarMisPendientes.fautapo'/>" method="post">
                                            <input type="hidden" name="aplicacion" value="/" >
                                            <input type="hidden" name="accion"     value='Formularito' >
                                            <button type='button' onclick="enviarSolicitud('formulario')" role="button"  class="btn noprint">Enviar solicitud</button>
                                        </form>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div> 
                </div>
                <div class="fecha"><strong>Fecha:</strong>  <fmt:formatDate value="${now}" pattern="${formatoFecha}"/></div>
                <div class="firma">................................................. <br/> FIRMA<br/><c:out value="${datosPst.paterno}"/>&nbsp;<c:out value="${datosPst.materno}"/>&nbsp;<c:out value="${datosPst.nombres}"/></div>
            </div>
        </div>
        <div id="loader" class="modal"> 
            <div class="modal-content"> 
                <span class="loader"></span>
                <span>Enviando solicitud...</span>
            </div>
        </div> 
        <script src="<c:url value='/js/impresion/script.js'/>" type="text/javascript"></script>
        <script src="<c:url value='/js/impresion/script2.js'/>" type="text/javascript"></script>
        <script src="<c:url value='/js/impresion/script3.js'/>" type="text/javascript"></script>
        <script>
                                                var modal = document.getElementById("loader");
                                                const enviarSolicitud = (formulario) => {
                                                    modal.style.display = "block";
                                                    document.getElementById(formulario).submit();
                                                }
        </script>
    </body>
</html>
