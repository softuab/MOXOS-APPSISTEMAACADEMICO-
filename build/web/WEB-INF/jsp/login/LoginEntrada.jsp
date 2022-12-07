<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page isELIgnored="false" %>
<jsp:useBean id="now" class="java.util.Date"/>
<!doctype html>
<html>
    <head>
        <meta charset="utf-8"/>
        <meta name="description" content="Resumen del contenido de la p�gina">   
        <title>Inicio de sesion</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="<c:url value="/css/login.css"/>" rel="stylesheet" type="text/css"/>
        <link href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" rel="stylesheet" type="text/css"/>
        <link href="https://use.fontawesome.com/releases/v5.2.0/css/fontawesome.css" rel="stylesheet" type="text/css"/>
    </head>

    <body onload="inicio(document.forma.apodo<fmt:formatDate value="${now}" pattern="yyyyMMddhhmmss" />)">
        <div class="container">
            <div class="screen">
                <div class="screen__content">
                    <form class="login" name='forma' action='<c:url value="/buscarConexion.fautapo"/>' method='post'>
                        <input type="hidden" name="hora" value='<fmt:formatDate value="${now}" pattern="yyyyMMddhhmmss" />' />
                        <div class="login__field">
                            <i class="login__icon fas fa-user"></i>
                            <input name='apodo<fmt:formatDate value="${now}" pattern="yyyyMMddhhmmss" />' type="password" onBlur='validar(this, "A9")'  value=""  class="login__input" placeholder="Usuario">
                        </div>
                        <div class="login__field">
                            <i class="login__icon fas fa-lock"></i>
                            <input name='clave<fmt:formatDate value="${now}" pattern="yyyyMMddhhmmss" />'  type="password" class="login__input" placeholder="Contrase�a">
                        </div>
                        <button class="button login__submit">
                            <span class="button__text">Iniciar sesi�n</span>
                            <i class="button__icon fas fa-chevron-right"></i>
                        </button>
                    </form>
                    <div class="social-login"> 
                        <div class="social-icons">
                            <img class="social-login__icon" style=" width:100px; " src="<c:url value="/imagenes/logos/logominiatura.png"/>" alt=""/>
                        </div>
                    </div>
                </div>
                <div class="screen__background"> 
                    <span class="screen__background__shape screen__background__shape4"></span>
                    <span class="screen__background__shape screen__background__shape3"></span>
                    <span class="screen__background__shape screen__background__shape2"></span>
                    <span class="screen__background__shape screen__background__shape1"></span>
                </div>
            </div>
        </div>
    </body>
</html>