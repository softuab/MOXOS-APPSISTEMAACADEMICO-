<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page isELIgnored="false" %>

<html>
    <head>

        <link rel="stylesheet" href="<c:url value='/js/menu1/template_css.css'/>" type="text/css" />
        <link rel="stylesheet" href="<c:url value='/js/menu1/ThemeOffice/theme.css'/>" type="text/css" />
        <link rel="stylesheet" href="<c:url value='/principal.css'/>" type="text/css">
        <style>
            .print:link, .print:visited {
                background-color: #EEEEEE;
                color: black;
                padding: 0px 10px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
            }
            .print:hover, .print:active {
                background-color: #9CDCFE;
            } 
        </style>
        <script type="text/javascript" src="<c:url value='/js/menu1/JSCookMenu_mini.js'/>"></script>
        <script type="text/javascript" src="<c:url value='/js/menu1/ThemeOffice/theme.js'/>"></script>
        <script type="text/javascript" src="<c:url value='/js/menu1/joomla.javascript.js'/>"></script>
    </head>
</html>