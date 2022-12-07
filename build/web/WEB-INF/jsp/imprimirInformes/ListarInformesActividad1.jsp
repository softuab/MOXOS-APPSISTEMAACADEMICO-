<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8">
        <title>Sistema Integrado - Siringuero</title>
        <link rel="stylesheet" href="./pagina.css" type="text/css">
        <link rel="stylesheet" href="../pagina.css" type="text/css">
        <script language='JavaScript' SRC="./funciones.js"></script>
        <script language='JavaScript' SRC="../funciones.js"></script>
        <meta content="text/html; charset=iso8859-15" http-equiv="Content-Type" />
        <META HTTP-EQUIV="Cache-Control" CONTENT="max-age=0">
        <META HTTP-EQUIV="Cache-Control" CONTENT="no-cache">
        <META http-equiv="expires" content="0">
        <META HTTP-EQUIV="Expires" CONTENT="Tue, 01 Jan 1980 1:00:00 GMT">
        <META HTTP-EQUIV="Pragma" CONTENT="no-cache">
    </head> 
    <body> 
        <div  id="contenido" style="width: 100%">
            ${contenido}
        </div> 
    </body>
</html>