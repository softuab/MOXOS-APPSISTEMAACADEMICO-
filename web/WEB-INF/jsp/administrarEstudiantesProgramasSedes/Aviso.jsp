<%@ include file="../Superior.jsp"%>

<br/>
<blink>
    <center>
        <div class='cuadroAviso'>
            <div class="titulo">¡Aviso!</div>
            <c:out value="${mensaje}"/>
            <br>
            <br>
            <form name="fvolver" action="<c:url value="/entradaEstudiante/MostrarEstudiantes.fautapo"/>" method="post">
                <input type="hidden" name="id_estudiante" value="<c:out value="${datosEstudios.id_estudiante}"/>">
                <input type="hidden" name="id_programa" value="<c:out value="${datosEstudios.id_programa}"/>">
                <a class="volver" href="javascript:document.fvolver.submit();" >Volver</a></td> 
            </form>
        </div>
    </center>
</blink>

<%@ include file="../Inferior.jsp"%>