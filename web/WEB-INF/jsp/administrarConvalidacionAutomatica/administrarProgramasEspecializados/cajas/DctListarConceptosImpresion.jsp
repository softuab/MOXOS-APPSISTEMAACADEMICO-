<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page isELIgnored="false" %>
<jsp:useBean id="now" class="java.util.Date" />
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8"/>
        <meta name="generator" content="pdf2htmlEX"/>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
        <link rel="stylesheet" href='<c:url value="/css/impresionwaika/style.css"/>' type="text/css">
        <link rel="stylesheet" href='<c:url value="/css/impresionwaika/style2.css"/>' type="text/css">
        <link rel="stylesheet" href='<c:url value="/css/impresionwaika/style3.css"/>' type="text/css">
        <script src="<c:url value="/js/impresionwaika/script.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/js/impresionwaika/script2.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/js/impresionwaika/script3.js"/>" type="text/javascript"></script>
        <title>Impresion de boleta</title>
    </head>
    <body>
        <div id="sidebar">
            <div id="outline">
            </div>
        </div>
        <div id="page-container">
            <div id="pf1" class="pf w0 h0" data-page-no="1"> 
                <div class="c x1 y1 w2 h2">
                    <div class="t m0 x0 h4 y3 ff1 fs1 fc0 sc0 ls2 ws2"><img class="logo" src="<c:url value='/imagenes/logo/logo.png'/>" alt=""/></div>
                </div>
                <div class="c x3 y1 w3 h2">
                    <div class="t m0 x4 h4 y3 ff1 fs1 fc0 sc0 ls2 ws2">UNIVERSIDAD AUTONOMA DEL BENI JOSE BALLIVIAN </div>
                    <div class="t m0 x5 h5 y4 ff1 fs2 fc0 sc0 ls2 ws2"><c:out value='${datosInstitucion.localidad}'/> - <c:out value='${datosInstitucion.departamento}'/> - <c:out value='${datosInstitucion.pais}'/></div>
                    <div class="t m0 x6 h6 y5 ff3 fs3 fc0 sc0 ls2 ws2">RECIBO &nbsp; <c:out value="${datosTransaccion.nro_recibo}"/></div>
                </div>
                <div class="qr1">
                    <img class="logoqr" src="${qr}" alt=""/> 
                </div>
                <div class="div">
                    <table class="table">
                        <tbody>
                            <tr><td class="header" colspan="5"><strong><c:out value="${datosPerfil.perfil}"/></strong></td></tr>
                            <tr>
                                <td class="header"><strong>Concepto</strong></td>
                                <td class="header"><strong>Precio/Unit. (Bs.)</strong></td>
                                <td class="header"><strong>Cantidad</strong></td>
                                <td class="header"><strong>Descuento</strong></td>
                                <td class="header"><strong>Monto (Bs.)</strong></td>
                            </tr>
                            <c:forEach var="lista" items="${lDetalles}" varStatus="contador">
                                <tr>
                                    <td class="detail1"><c:out value="${lista.concepto}"/></td>
                                    <td class="detail"><c:out value="${lista.costo}"/></td>
                                    <td class="detail"><c:out value="${lista.cantidad}"/></td>
                                    <td class="detail"><c:out value="${lista.descuento}"/></td>
                                    <td class="detail"><c:out value="${lista.pagado}"/></td>
                                </tr>
                            </c:forEach>
                            <tr>
                                <td class="detail1" colspan="4"><strong>Son:: <c:out value="${literal}"/></strong></td>
                                <td class="detail"> <strong><c:out value="${datosTransaccion.pagado}"/></strong></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <div class="c x0 y2 wc h0">
                    <div class="t m0 x1c ha y15 ff4 fs4 fc0 sc0 ls2 ws2">Fecha: <fmt:formatDate value="${now}" pattern="${formatoFecha}"/></div>
                    <div class="t m0 x1 ha y16 ff5 fs2 fc0 sc0 ls2 ws2"> </div>
                    <div class="t m0 x1d h3 y17 ff4 fs0 fc0 sc0 ls1 ws2">............................................... </div>
                    <div class="t m0 x1e h3 y18 ff4 fs0 fc0 sc0 ls2 ws2"><c:out value="${datosTransaccion.nombres}"/></div>
                    <div class="t m0 x1f ha y19 ff1 fs0 fc0 sc0 ls2 ws2">Encargado(a) de cajas</div>
                </div>
                <div class="c x1 y1a wd h8">
                    <div class="t m0 x13 h3 ya ff1 fs0 fc0 sc0 ls2 ws2">Nombre </div>
                </div>
                <div class="c x20 y1a we h8">
                    <div class="t m0 x13 h3 ya ff4 fs0 fc0 sc0 ls2 ws2"><c:out value="${docente.nombres}"/> <c:out value="${docente.paterno}"/> <c:out value="${docente.materno}"/></div>
                </div>
                <div class="c x1 y1b wd h8">
                    <div class="t m0 x13 h3 ya ff1 fs0 fc0 sc0 ls2 ws2">Gestión </div>
                </div>
                <div class="c x20 y1b wf h8">
                    <div class="t m0 x13 h3 ya ff4 fs0 fc0 sc0 ls2 ws2"><c:out value="${periodo}"/>-<c:out value="${gestion}"/></div>
                </div>
                <div class="c x1f y1b w10 h8">
                    <div class="t m0 x13 h3 ya ff1 fs0 fc0 sc0 ls2 ws2">Fecha pago</div>
                </div>
                <div class="c x21 y1b w11 h8">
                    <div class="t m0 x13 h3 ya ff4 fs0 fc0 sc0 ls2 ws2"><fmt:formatDate value="${datosTransaccion.fec_pago}" pattern="${formatoFecha} ${formatoHora}"/></div>
                </div>
                <c:if test="${!empty descuento}">
                    <div class="c x1 y1c wd h7">
                        <div class="t m0 x13 h3 y8 ff1 fs0 fc0 sc0 ls2 ws2">Tipo de descuento </div>
                    </div>
                    <div class="c x20 y1c we h7">
                        <div class="t m0 x13 h3 y8 ff4 fs0 fc0 sc0 ls2 ws2"><c:out value="${descuento.tipo_descuento}"/></div>
                    </div>
                </c:if>
            </div>
            <div class="pi" data-data='{"ctm":[1.000000,0.000000,0.000000,1.000000,0.000000,0.000000]}'></div>
        </div>
    </div>
    <div class="loading-indicator">
        <img alt="" src="data:image/png;base64,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"/>
    </div>
</body>
</html>
