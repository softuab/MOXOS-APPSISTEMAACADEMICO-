<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page isELIgnored="false" %>
<jsp:useBean id="now" class="java.util.Date" />
<!DOCTYPE html>
<html lang="Es">
    <head>
        <meta charset="utf-8"/>
        <meta name="generator" content="pdf2htmlEX"/>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
        <link rel="stylesheet" href='<c:url value="/css/impresion/style.css"/>' type="text/css">
        <link rel="stylesheet" href='<c:url value="/css/impresion/style2.css"/>' type="text/css"> 
        <link rel="stylesheet" href='<c:url value="/css/impresionwaika/paginamediacarta.css"/>?=v32' type="text/css">
        <link rel="stylesheet" href='<c:url value="/css/impresionwaika/impresionwaika.css"/>' type="text/css">
        <link rel="stylesheet" href='<c:url value="/css/grid.css"/>' type="text/css"> 
        <title>Impresion de boleta</title>
    </head>
    <body>    
        <div id="sidebar">
            <div id="outline">
            </div>
        </div>
        <div id="page-container">
            <div id="pf1" class="pf w0 h0" data-page-no="1"> 
                <div class="content-report">
                    <div class="container-grid">
                        <div class="row">
                            <div class="col-xs-1">
                                <img class="logo-escudo" src="<c:url value='/imagenes/logo/logo.png'/>" alt=""/>
                            </div>
                            <div class="col-xs-10">
                                <div class="center">
                                    <span class="h1-title">UNIVERSIDAD AUTONOMA DEL BENI "JOSE BALLIVIAN"</span> <br>
                                    <span class="span-subtitle"><c:out value='${datosInstitucionsede.localidad}'/> - <c:out value='${datosInstitucionsede.departamento}'/> - <c:out value='${datosInstitucionsede.pais}'/></span><br>
                                    <span class="h2-title">RECIBO <c:out value="${datosTransaccion.nro_recibo}"/></span>
                                </div>
                            </div>
                            <div class="col-xs-1 right">
                                <img class="logoqr" src="${qr}" alt=""/> 
                            </div>
                        </div>
                    </div>
                    <div class="container-grid">
                        <div class="row">
                            <div class="col-xs-12">
                                <table class="left font-10">
                                    <thead>
                                        <tr>
                                            <th colspan="4"></th> 
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td colspan="4"><strong>Nombre</strong> <c:out value="${postulante.nombres}"/> <c:out value="${postulante.paterno}"/> <c:out value="${postulante.materno}"/></td> 
                                        </tr>
                                        <tr>
                                            <td colspan="2"><strong>Gestion:</strong> <c:out value="${periodo}"/>-<c:out value="${gestion}"/></td>
                                            <td colspan="2"><strong>Fecha pago</strong> <fmt:formatDate value="${datosTransaccion.fec_pago}" pattern="${formatoFecha} ${formatoHora}"/></td>
                                        </tr>
                                        <c:if test="${!empty descuento}">
                                            <tr>
                                                <td colspan="4" ><strong>Tipo de descuento</strong> <c:out value="${descuento.tipo_descuento}"/></td> 
                                            </tr>
                                        </c:if>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-12">
                                <table class="table-report font-10">
                                    <thead>
                                        <tr>
                                            <th colspan="5"><strong><c:out value="${datosPerfil.perfil}"/></strong></th> 
                                        </tr>
                                        <tr>
                                            <td><strong>Concepto</strong></td>
                                            <td><strong>Precio/Unit. (Bs.)</strong></td>
                                            <td><strong>Cantidad</strong></td>
                                            <td><strong>Descuento</strong></td>
                                            <td><strong>Monto (Bs.)</strong></td>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="lista" items="${lDetalles}" varStatus="contador">
                                            <tr>
                                                <td><c:out value="${lista.concepto}"/></td>
                                                <td class="right"><c:out value="${lista.costo}"/></td>
                                                <td class="right"><c:out value="${lista.cantidad}"/></td>
                                                <td class="right"><c:out value="${lista.descuento}"/></td>
                                                <td class="right"><c:out value="${lista.pagado}"/></td>
                                            </tr>
                                        </c:forEach>
                                        <tr>
                                            <td class="detail1" colspan="4"><strong>Son:: <c:out value="${literal}"/></strong></td>
                                            <td class="detail"> <strong><c:out value="${datosTransaccion.pagado}"/></strong></td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <div class="col-xs-12 right bold">
                                Fecha: <fmt:formatDate value="${now}" pattern="${formatoFecha}"/>
                            </div>
                        </div> 
                        <div class="row">
                            <div class="col-xs-12 center">
                                .................................................<br>
                                <c:out value="${datosTransaccion.nombres}"/><br>Encargado(a) de cajas
                            </div>
                        </div>   
                    </div>
                </div> 
            </div>
            <div class="pi" data-data='{"ctm":[1.000000,0.000000,0.000000,1.000000,0.000000,0.000000]}'></div>
        </div> 
    </body>
</html>
