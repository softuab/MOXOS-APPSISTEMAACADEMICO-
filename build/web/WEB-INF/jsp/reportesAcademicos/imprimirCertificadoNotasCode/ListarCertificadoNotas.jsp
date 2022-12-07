<%@ include file="../../Superior.jsp" %>
  <jsp:useBean id="now" class="java.util.Date" />

  <center>

    <table width=800 border=0>
      <tr>
        <td>

          <!--<DIV ID="cont1" STYLE="position:center;top:10px;left:50px">
<IMG src='<c:url value="/"/>imagenes/certificados/uabcdc4.jpg' width=800 height="1030" border=0>
</DIV>
<DIV ID=2"cont1" STYLE="position:absolute;top:10px;left:50x">-->

          <table border=0 width=800>
            <tr>
              <td>

                <!-- ========================================== TITULO ============================================================== -->
                <p>
                  <p>
                    <p>
                      <p>
                        <p>
                          <p>
                            <p>
                              <p>
                                <p>
                                  <p>
                                    <table width="100%">



                                      <!-- <td  width = "85%"  align="center">
  <p><p><p><p><p><p><p><p><p><p><p><p><p><p><p><p><p><p><p><p><p><p><p><p>
  <table  width="100%" heigth="40%" cellpading ="2" cellspacing ="0" >
          <p><p><p><p><p><p><p><p>      
      <tr><p><p><p><p><p><p><p><p><p><p><p><p><p><td  align="center"><p><p><p><p><font size="6">UNIVERSIDAD   BOLIVIANA </font></td><tr>
      <tr><td   align="center"><font size="5">Universidad Aut�noma del Beni</font></td><tr>
      <tr><td   align="center"><font size="5">"Jos� Ballivi�n"</font></td><tr>
  </table>
  </form>
</td>-->

                                    </table>
                                    <!-- ================================================================================================================= -->

                                    <!-- ============================================ LINEA DE VOLVER =========================================================== -->
                                    <!--<table align="center" >
<tr align= "center"><td align="center" colspan="1" width="50%"> <a href="javascript:document.fvolver.submit();"><a href="javascript:document.fvolver.submit();">
_______________________________________________________________________________________________________________________________________________________
</td></tr>
</table>
 ================================================================================================================= -->

                                    <center>

                                      <!-- ============================================ TITULO 2 =========================================================== -->
                                      <table width=700>
                                        <td width="80%" align="right">
                                          <font size="5">PREVISUALIZACI�N CERTIFICADO</font>
                                        </td>
                                        <td width="22%" align="left">
                                          <table border="1" cellspacing=0 cellpading=2>
                                            <!--<td ><font size="3">Nro.<c:out value="${periodo}"/>/<c:out value="${gestion}"/></font></td>-->
                                          </table>
                                        </td>
                                      </table>
                                      <!-- ================================================================================================================= -->

                                      <!-- ======================================== CUERPO 1 =============================================================== -->
                                      <table width="90%">
                                        <tr>
                                          <td>
                                            <b>
                                              <font size="2">
                                                <br>Facultad</font>
                                            </b>
                                          </td>
                                          <td>
                                            <font size="2">
                                              <c:out value="${datosFacultad.facultad}" />
                                            </font>
                                          </td>

                                          <th>
                                            <td>
                                              <b>
                                                <font size="2">
                                                  <br>N� Recibo</font>
                                              </b>
                                            </td>
                                            <td>
                                              <font size="2">
                                                <c:out value="${nrocertificado}" />
                                              </font>
                                            </td>
                                        </tr>
                                        <tr>
                                          <td>
                                            <b>
                                              <font size="2">Carrera</font>
                                            </b>
                                          </td>
                                          <td colspan="2">
                                            <font size="2">
                                              <c:out value="${datosPrograma.programa}" />
                                            </font>
                                          </td>
                                          <td>
                                            <b>
                                              <font size="2">Nivel</font>
                                            </b>
                                          </td>
                                          <td>
                                            <font size="2">
                                              <c:out value="${datosGrados.grado_academico}" />
                                            </font>
                                          </td>

                                        </tr>
                                        <tr>
                                          <td>
                                            <b>
                                              <font size="2">Apellidos y Nombres</font>
                                            </b>
                                          </td>
                                          <td colspan="2">
                                            <font size="2">
                                              <c:out value="${datosEstudiante2.paterno}" />&nbsp;
                                              <c:out value="${datosEstudiante2.materno}" />&nbsp;
                                              <c:out value="${datosEstudiante2.nombres}" />
                                            </font>
                                          </td>

                                          <td>
                                            <b>
                                              <font size="2">Plan</font>
                                            </b>
                                          </td>
                                          <td>
                                            <font size="2">
                                              <c:out value="${datosEstudiante2.id_plan}" />
                                            </font>
                                          </td>
                                        </tr>
                                        <tr>
                                          <td>
                                            <b>
                                              <font size="2">C.I. </font>
                                            </b>
                                          </td>
                                          <td colspan="2">
                                            <font size="2">
                                              <c:out value="${datosEstudiante2.dip}" />
                                            </font>
                                          </td>

                                          <c:if test="${todas=='Si'}">
                                            <c:if test="${datosPrograma.id_periodo==1}">
                                              <td>
                                                <b>
                                                  <font size="2">Periodo Ac�demico</font>
                                                </b>
                                              </td>
                                              <td>
                                                <font size="2">
                                                  <c:out value="${periodo}" />/
                                                  <c:out value="${gestion}" /> </font>
                                              </td>
                                            </c:if>
                                            <c:if test="${datosPrograma.id_periodo==2}">
                                              <td>
                                                <b>
                                                  <font size="2">Gesti�n Ac�demica</font>
                                                </b>
                                              </td>
                                              <td>
                                                <font size="2">
                                                  <c:out value="${gestion}" />
                                                </font>
                                              </td>
                                            </c:if>
                                          </c:if>
                                          <c:if test="${todas=='No'}">
                                            <td>
                                              <b>
                                                <font size="2">Periodo Ac�demico</font>
                                              </b>
                                            </td>
                                            <td>
                                              <font size="2">
                                                <c:out value="${gestion}" />
                                              </font>
                                            </td>
                                            <tr>
                                              <td>
                                                <td>
                                                  <td>
                                                    <td>
                                                      <b>
                                                        <font size="2">Curso de Verano</font>
                                                      </b>
                                                    </td>
                                                  </td>
                                                </td>
                                              </td>
                                            </tr>
                                          </c:if>


                                        </tr>
                                      </table>
                                      <!-- =================================================================================================================== -->

                                      <br>

                                      <!-- ============================================ CUERPO 2 ============================================================= -->
                                      <!--<table width = "90%" >
<tr> <td align = "left"><font size="3">Por Tanto:</font></td></tr>
<tr> <td align = "left"><font size="3">De acuerdo al Plan de Estudios vigente curso las siguientes materias</font></td></tr>
</table>
 =================================================================================================================== -->

                                      <!-- =========================================== CUERPO 3 ============================================================== -->
    
									<table class="tabla" width="90%">
									<c:if test="${x=='42'}">
                                        <tr>
											<th><small>NIVEL</small></th>
											<th><small>SIGLA</small></th>
											<th><small>NOMBRE DE LA ASIGNATURA</small></th>
											<th><small>H.T.</small></th>
											<th><small>H.P.</small></th>
											<th><small>T.H.</small></th>
											<th><small>PRE-REQUISITO</small></th>
										</tr>
										-------------------
										<c:set var="id_mencion_ant" value="0"/>
										<c:set var="id_nivel_ant" value="0"/>
										<c:forEach var="lista" items="${lPlanDeEstudios}" varStatus="contador">
										  <c:if test="${(id_mencion_ant != lista.id_mencion) && (lista.id_mencion != 0)}">
											<tr>
											  <th colspan="5">MENCION :: <c:out value="${lista.mencion}"/></th>
											</tr>
										  </c:if>
										  <c:if test="${id_nivel_ant != lista.nivel_academico}">
											<tr>
											  <td>NIVEL :: <c:out value="${lista.nivel_academico}"/></td>
											  <td colspan="4"></td>
											</tr>
										  </c:if>
										  <td></td>
										  <td valign="top"><c:out value="${lista.sigla}"/></td>
										  <td valign="top"><c:out value="${lista.materia}"/></td>
										  <td valign="top"><c:out value="${lista.hrs_teoricas}"/></td>
										  <td valign="top"><c:out value="${lista.hrs_practicas}"/></td>
										  <td valign="top"><c:out value="${lista.hrs_practicas+lista.hrs_teoricas}"/></td>
										  <td valign="top"><c:out value="${lista.materias_anteriores}" /></td>
										</tr>
										<c:set var="id_mencion_ant" value="${lista.id_mencion}"/>
										<c:set var="id_nivel_ant" value="${lista.nivel_academico}"/>
									  </c:forEach>
										-------------------
									</c:if>	
									
									<c:if test="${x=='31' || x=='27'}">
                                        <tr>
                                          <th>
                                            <font size="2">SIGLA</font>
                                          </th>
                                          <th>
                                            <font size="2">NIVEL</font>
                                          </th>
                                          <th>
                                            <font size="2">ASIGNATURA</font>
                                          </th>
                                          <th>
                                            <font size="2">NUMERAL</font>
                                          </th>
                                          <th>
                                            <font size="2">LITERAL</font>
                                          </th>
                                          <th>
                                            <font size="2">OBSERVACION</font>
                                          </th>
                                        </tr>
                                        <c:forEach var="lista" items="${lMateriasNotas}" varStatus="contador">
                                          <tr>
                                            <td>
                                              <font size="2">
                                                <c:out value="${lista.sigla}" />
                                              </font>
                                            </td>
                                            <td align="center">
                                              <font size="2">
                                                <c:out value="${lista.nivel_academico}" />
                                              </font>
                                            </td>
                                            <td>
                                              <font size="2">
                                                <c:out value="${lista.materia}" />
                                              </font>
                                            </td>
                                            <td align="center">
                                              <font size="2">
                                                <fmt:formatNumber value="${lista.nota}" pattern="#" />
                                              </font>
                                            </td>
                                            <td>
                                              <font size="2">
                                                <c:out value="${lista.literal}" />
                                              </font>
                                            </td>
                                            <c:if test="${lista.id_estado=='A'}">
                                              <td>
                                                <font size="2">Aprobado</font>
                                              </td>
                                            </c:if>
                                            <c:if test="${lista.id_estado=='C'}">
                                              <td>
                                                <font size="2">Comvalidado</font>
                                              </td>
                                            </c:if>
                                            <c:if test="${lista.id_estado=='D'}">
                                              <td>
                                                <font size="2">Abandono</font>
                                              </td>
                                            </c:if>
                                            <c:if test="${lista.id_estado=='R'}">
                                              <td>
                                                <font size="2">Reprobado</font>
                                              </td>
                                            </c:if>
                                            <c:if test="${lista.id_estado==null}">
                                              <td>
                                                <font size="2">Ninguno</font>
                                              </td>
                                            </c:if>
                                          </tr>
                                        </c:forEach>
									</c:if>	
                                    </table>
	
                                      <!-- ==================================================================================================================== -->
                                      <table>
                                        <form action="registrarCertificadoNotas.fautapo" method="post">
                                          <input type="hidden" name="id_programa" value="<c:out value='${datosPrograma.id_programa}'/>">
                                          <input type="hidden" name="gestion" value="<c:out value='${gestion}'/>">
                                          <input type="hidden" name="periodo" value="<c:out value='${periodo}'/>">
                                          <input type="hidden" name="todas" value="<c:out value='${todas}'/>">
                                          <input type="hidden" name="nrocertificado" value="<c:out value='${nrocertificado}'/>">
                                          <input type="hidden" name="observacion" value="<c:out value='${observacion}'/>">
                                          <input type="hidden" name="id_estudiante" value="<c:out value='${id_estudiante}'/>">
                                          <input type="hidden" name="nombres" value="<c:out value='${datosEstudiante2.nombres}'/>">
                                          <input type="hidden" name="paterno" value="<c:out value='${datosEstudiante2.paterno}'/>">
                                          <input type="hidden" name="materno" value="<c:out value='${datosEstudiante2.materno}'/>">
                                          <input type="hidden" name="ci" value="<c:out value='${datosEstudiante2.dip}'/>">
                                          <input type="hidden" name="facultad" value="<c:out value='${datosFacultad.facultad}'/>">
                                          <input type="hidden" name="programa" value="<c:out value='${datosPrograma.programa}'/>">
                                          <input type="hidden" name="gradoAcademico" value="<c:out value='${datosGrados.grado_academico}'/>">
                                          <input type="hidden" name="plan" value="<c:out value='${datosEstudiante2.id_plan}'/>">
                                          <input type="hidden" name="x" value='<c:out value="${x}"/>'>
                                          <input type='submit' value='Guardar' class='Guardar'>

                                        </form>
                                      </table>

              </td>
            </tr>
          </table>

          </div>
        </td>
      </tr>
    </table>

    </center>

    <%@ include file="../../Inferior.jsp" %>