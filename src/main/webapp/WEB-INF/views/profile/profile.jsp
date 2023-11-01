<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>	<!-- date탸입 칼럼의 sysdate을 원하는 날짜 형태로 출력 -->
<%@ page import="java.util.Date" %>									
<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>		<!-- jquery -->
<%@ include file="/WEB-INF/views/layout/header.jsp"%>
<style>
	#pf {
	  width : 40%;
	  border: 1px solid gray;
	}
</style>
<script>


</script>
<hr>

<!-- 프로필 출력 화면 -->
<!--  CAREER  CAREER  CAREER  CAREER  CAREER  CAREER  CAREER  CAREER  CAREER  CAREER  CAREER  CAREER  CAREER  CAREER  CAREER  -->
<c:set var="cpath" value="${pageContext.request.contextPath	}"/>
	<div align="left" id="pf">
		<p style="font-weight: bold; font-size: 20px;">경력 사항</p>
		<table id="career">
			<c:choose>
				<c:when test="${careerList == null }">
					<tr>
						<th colspan="11">
							작성된 <span style="color: blue">경력 사항</span>이 없다요
						</th>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach var="vo" items="${careerList }">
						<tr>
							<td>${vo.COMPANY} (${vo.CTNAME}) • ${vo.EMPL_TYPE}</td></tr>
						<tr>
							<td>
								<fmt:formatDate value="${vo.START_DATE }" pattern="yyyy-MM"/> ~ <fmt:formatDate value="${vo.END_DATE }" pattern="yyyy-MM"/>
								${vo.END_DATE == null ? '현재' : ''} 
							</td>	
							<td style="display:none">
								<fmt:formatDate value="${vo.START_DATE }" pattern="yyyyMM" var="strt"/>
								<fmt:formatDate value="${vo.END_DATE }" pattern="yyyyMM" var="end"/>
							<td>
							<td>
								(${end-strt }개월)
							</td>	
							<td>	
								<c:if test="${vo.STAT == 0 }"> • 퇴사</c:if> 
								<c:if test="${vo.STAT == 1 }"> • 재직중</c:if> 
							</td>
							<td>
								<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/profile/career_updateform?no=${vo.CAREER_NO }'">
								<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/profile/career_delete?no=${vo.CAREER_NO }'">
							</td>
						</tr>
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</table>
	</div>

<!--  EDU  EDU  EDU  EDU  EDU  EDU  EDU  EDU  EDU  EDU  EDU  EDU  EDU  EDU  EDU  EDU  EDU  EDU  EDU  EDU  EDU  EDU  EDU  EDU  -->
<c:set var="cpath" value="${pageContext.request.contextPath	}"/>
	<div align="left" id="pf">
		<p style="font-weight: bold; font-size: 20px;">학력 사항</p>
		<table id="edu">
			<c:choose>
				<c:when test="${eduList == null }">
					<tr>
						<th colspan="11">
							작성된 <span style="color: blue">학력 사항</span>이 없다요
						</th>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach var="vo" items="${eduList }">
						<tr><td>${vo.SCHOOL }</td></tr>
						<tr>
							<td>${vo.MAJOR } • 
							<c:if test="${vo.DEGREE == 0}">전문학사</c:if>
							<c:if test="${vo.DEGREE == 1}">학사</c:if>
							<c:if test="${vo.DEGREE == 2}">전문석사</c:if>
							<c:if test="${vo.DEGREE == 3}">석사</c:if>
							<c:if test="${vo.DEGREE == 4}">전문박사</c:if>
							<c:if test="${vo.DEGREE == 5}">박사</c:if>
							</td>
						</tr>
						<tr>
							<td>
								<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/profile/edu_updateform?no=${vo.EDU_NO }'">
								<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/profile/edu_delete?no=${vo.EDU_NO }'">
							</td>
						</tr>	
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</table>
	</div>
	
<!-- REST  REST  REST  REST  REST  REST  REST  REST  REST  REST  REST  REST  REST  REST  REST  REST  REST  REST  REST  REST  REST -->
<c:set var="cpath" value="${pageContext.request.contextPath	}"/>
	<div align="left" id="pf">
		<p style="font-weight: bold; font-size: 20px;">휴식기</p>
		<table id="rest">
			<c:choose>
				<c:when test="${restList == null }">
					<tr>
						<th colspan="11">
							작성된 <span style="color: blue">휴식기 내역</span>이 없다요
						</th>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach var="vo" items="${restList }">
						<tr><td>${vo.RSN }</td></tr>
						<tr>
							<td>
								<fmt:formatDate value="${vo.START_DATE }" pattern="yyyy-MM"/> ~ <fmt:formatDate value="${vo.END_DATE }" pattern="yyyy-MM"/>
								${vo.END_DATE == null ? '현재' : ''} 
							</td>	
							<td style="display:none">
								<fmt:formatDate value="${vo.START_DATE }" pattern="yyyyMM" var="strt"/>
								<fmt:formatDate value="${vo.END_DATE }" pattern="yyyyMM" var="end"/>
							<td>
							<td>
								(${end-strt }개월)
							</td>	
						</tr>
						<tr>
							<td>
								<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/profile/rest_updateform?no=${vo.REST_NO }'">
								<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/profile/rest_delete?no=${vo.REST_NO }'">
							</td>
						</tr>	
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</table>
	</div>

<!-- CERT  CERT  CERT  CERT  CERT  CERT  CERT  CERT  CERT  CERT  CERT  CERT  CERT  CERT  CERT  CERT  CERT  CERT  CERT  CERT  CERT -->
<c:set var="cpath" value="${pageContext.request.contextPath	}"/>
	<div align="left" id="pf">
		<p style="font-weight: bold; font-size: 20px;">자격증</p>
		<table id="cert">
			<c:choose>
				<c:when test="${certList == null }">
					<tr>
						<th colspan="11">
							작성된 <span style="color: blue">자격증</span>이 없다요
						</th>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach var="vo" items="${certList }">
						<tr><td>${vo.NAME }</td></tr>
						<tr><td>${vo.AUTHOR }</td></tr>
						<tr>
							<td>
								<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/profile/cert_updateform?no=${vo.CERT_NO }'">
								<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/profile/cert_delete?no=${vo.CERT_NO }'">
							</td>
						</tr>	
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</table>
	</div>
	
<!-- INSCERT  INSCERT  INSCERT  INSCERT  INSCERT  INSCERT  INSCERT  INSCERT  INSCERT  INSCERT  INSCERT  INSCERT  INSCERT  INSCERT -->
<c:set var="cpath" value="${pageContext.request.contextPath	}"/>
	<div align="left" id="pf">
		<p style="font-weight: bold; font-size: 20px;">수료증</p>
		<table id="inscert">
			<c:choose>
				<c:when test="${inscertList == null }">
					<tr>
						<th colspan="11">
							작성된 <span style="color: blue">자격증</span>이 없다요
						</th>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach var="vo" items="${inscertList }">
						<tr><td>${vo.NAME }</td></tr>
						<tr><td>${vo.AUTHOR }</td></tr>
						<tr>
							<td>
								<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/profile/inscert_updateform?no=${vo.INSCERT_NO }'">
								<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/profile/inscert_delete?no=${vo.INSCERT_NO }'">
							</td>
						</tr>	
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</table>
	</div>
	
<!-- PROJ  PROJ  PROJ  PROJ  PROJ  PROJ  PROJ  PROJ  PROJ  PROJ  PROJ  PROJ  PROJ  PROJ  PROJ  PROJ  PROJ  PROJ  PROJ  PROJ  PROJ -->
<c:set var="cpath" value="${pageContext.request.contextPath	}"/>
	<div align="left" id="pf">
		<p style="font-weight: bold; font-size: 20px;">프로젝트</p>
		<table id="proj">
			<c:choose>
				<c:when test="${projList == null }">
					<tr>
						<th colspan="11">
							작성된 <span style="color: blue">프로젝트</span>가 없다요
						</th>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach var="vo" items="${projList }">
						<tr>
							<td>${vo.NAME } • 
							<c:if test="${vo.STAT == 0 }">완료</c:if>
							<c:if test="${vo.STAT == 1 }">진행중</c:if>
							</td>
						</tr>	
						<tr>
							<td>
								<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/profile/proj_updateform?no=${vo.PROJ_NO }'">
								<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/profile/proj_delete?no=${vo.PROJ_NO }'">
							</td>
						</tr>	
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</table>
	</div>
	
<!-- ARMY  ARMY  ARMY  ARMY  ARMY  ARMY  ARMY  ARMY  ARMY  ARMY  ARMY  ARMY  ARMY  ARMY  ARMY  ARMY  ARMY  ARMY  ARMY  ARMY  ARMY -->
<c:set var="cpath" value="${pageContext.request.contextPath	}"/>
	<div align="left" id="pf">
		<p style="font-weight: bold; font-size: 20px;">병역</p>
		<table id="army">
			<c:choose>
				<c:when test="${armyList == null }">
					<tr>
						<th colspan="11">
							작성된 <span style="color: blue">병역 사항</span>이 없다요
						</th>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach var="vo" items="${armyList }">
						<tr>
							<td>
								<c:if test="${vo.OPT == 0 }">해당없음</c:if>
								<c:if test="${vo.OPT == 1 }">군필</c:if>
								<c:if test="${vo.OPT == 2 }">미필</c:if>
								<c:if test="${vo.OPT == 3 }">면제</c:if>
							</td>
						</tr>		
						<tr>
							<td>
								<!-- 병역구분 -->
								<c:if test="${vo.TYPE == 0 }">육군 (</c:if>
								<c:if test="${vo.TYPE == 1 }">해군 (</c:if>
								<c:if test="${vo.TYPE == 2 }">공군 (</c:if>
								<c:if test="${vo.TYPE == 3 }">해병 (</c:if>
								<c:if test="${vo.TYPE == 4 }">의경 (</c:if>
								<c:if test="${vo.TYPE == 5 }">공익 (</c:if>
								<c:if test="${vo.TYPE == 6 }">기타 (</c:if>
							
								<!-- 제대계급 -->
								<c:if test="${vo.DISCH == 0 }">이병 )</c:if>
								<c:if test="${vo.DISCH == 1 }">일병 )</c:if>
								<c:if test="${vo.DISCH == 2 }">상병 )</c:if>
								<c:if test="${vo.DISCH == 3 }">병장 )</c:if>
								<c:if test="${vo.DISCH == 4 }">하사 )</c:if>
								<c:if test="${vo.DISCH == 5 }">중사 )</c:if>
								<c:if test="${vo.DISCH == 6 }">상사 )</c:if>
								<c:if test="${vo.DISCH == 7 }">원사 )</c:if>
								<c:if test="${vo.DISCH == 8 }">준위 )</c:if>
								<c:if test="${vo.DISCH == 9 }">소위 )</c:if>
								<c:if test="${vo.DISCH == 10 }">중위 )</c:if>
								<c:if test="${vo.DISCH == 11 }">대위 )</c:if>
								<c:if test="${vo.DISCH == 12 }">소령 )</c:if>
								<c:if test="${vo.DISCH == 13 }">중령 )</c:if>
								<c:if test="${vo.DISCH == 14 }">대령 )</c:if>
								<c:if test="${vo.DISCH == 15 }">준장 )</c:if>
								<c:if test="${vo.DISCH == 16 }">소장 )</c:if>
								<c:if test="${vo.DISCH == 17 }">중장 )</c:if>
								<c:if test="${vo.DISCH == 18 }">대장 )</c:if>
								<c:if test="${vo.DISCH == 19 }">기타 )</c:if>
							</td>
						</tr>		
						<tr>
							<c:choose>
								<c:when test="${RSN eq null }"></c:when>
								<c:otherwise>
									<td>${vo.RSN }</td>
								</c:otherwise>
							</c:choose>
						</tr>		
						<tr>
							<td>
								<fmt:formatDate value="${vo.START_DATE }" pattern="yyyy-MM"/> ~ <fmt:formatDate value="${vo.END_DATE }" pattern="yyyy-MM"/>
								${vo.END_DATE == null ? '현재' : ''} 
							</td>	
							<td style="display:none">
								<fmt:formatDate value="${vo.START_DATE }" pattern="yyyyMM" var="strt"/>
								<fmt:formatDate value="${vo.END_DATE }" pattern="yyyyMM" var="end"/>
							<td>
							<td>
								(${end-strt }개월)
							</td>	
						</tr>
						<tr>
							<td>
								<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/profile/army_updateform?no=${vo.AMRY_NO }'">
								<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/profile/army_delete?no=${vo.ARMY_NO }'">
							</td>
						</tr>	
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</table>
	</div>
	
<!-- VOL  VOL  VOL  VOL  VOL  VOL  VOL  VOL  VOL  VOL  VOL  VOL  VOL  VOL  VOL  VOL  VOL  VOL  VOL  VOL  VOL  VOL  VOL  VOL  VOL  VOL -->
<c:set var="cpath" value="${pageContext.request.contextPath	}"/>
	<div align="left" id="pf">
		<p style="font-weight: bold; font-size: 20px;">봉사활동</p>
		<table id="vol">
			<c:choose>
				<c:when test="${volList == null }">
					<tr>
						<th colspan="11">
							작성된 <span style="color: blue">봉사활동</span>이가 없다요
						</th>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach var="vo" items="${volList }">
						<tr>
							<td>${vo.ORG } • 
								<c:if test="${vo.STAT == 0 }">비활동</c:if>
								<c:if test="${vo.STAT == 1 }">활동중</c:if>
							</td>
						</tr>	
						<tr>
							<td>${vo.CONTENT }</td>
						</tr>
						<tr>
							<td>
								<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/profile/vol_updateform?no=${vo.VOL_NO }'">
								<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/profile/vol_delete?no=${vo.VOL_NO }'">
							</td>
						</tr>	
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</table>
	</div>

<!-- THESIS  THESIS  THESIS  THESIS  THESIS  THESIS  THESIS  THESIS  THESIS  THESIS  THESIS  THESIS  THESIS  THESIS  THESIS  THESIS -->
<c:set var="cpath" value="${pageContext.request.contextPath	}"/>
	<div align="left" id="pf">
		<p style="font-weight: bold; font-size: 20px;">논문/저자</p>
		<table id="thesis">
			<c:choose>
				<c:when test="${thesisList == null }">
					<tr>
						<th colspan="11">
							작성된 <span style="color: blue">논문/저자</span>가 없다요
						</th>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach var="vo" items="${thesisList }">
						<tr>
							<td>${vo.TITLE }</td>
						</tr>	
						<tr>
							<td>${vo.PUBLISHER }</td>
						</tr>	
						<tr>
							<td>
								<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/profile/thesis_updateform?no=${vo.THESIS_NO }'">
								<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/profile/thesis_delete?no=${vo.THESIS_NO }'">
							</td>
						</tr>	
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</table>
	</div>

<!-- LANGSKILL  LANGSKILL  LANGSKILL  LANGSKILL  LANGSKILL  LANGSKILL  LANGSKILL  LANGSKILL  LANGSKILL  LANGSKILL  LANGSKILL  LANGSKILL -->
<c:set var="cpath" value="${pageContext.request.contextPath	}"/>
	<div align="left" id="pf">
		<p style="font-weight: bold; font-size: 20px;">외국어 능력</p>
		<table id="thesis">
			<c:choose>
				<c:when test="${langskillList == null }">
					<tr>
						<th colspan="11">
							작성된 <span style="color: blue">외국어 능력</span>이가 없다요
						</th>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach var="vo" items="${langskillList }">
						<tr>
							<td>이거 어케..? • ${vo.LV }</td>
						</tr>	
						<tr>
							<td>
								<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/profile/langskill_updateform?no=${vo.LANG_SKILL_NO }'">
								<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/profile/langskill_delete?no=${vo.LANG_SKILL_NO }'">
							</td>
						</tr>	
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</table>
	</div>

<!-- ORG  ORG  ORG  ORG  ORG  ORG  ORG  ORG  ORG  ORG  ORG  ORG  ORG  ORG  ORG  ORG  ORG  ORG  ORG  ORG  ORG  ORG  ORG  ORG  ORG  ORG  ORG -->	
<c:set var="cpath" value="${pageContext.request.contextPath	}"/>
	<div align="left" id="pf">
		<p style="font-weight: bold; font-size: 20px;">단체활동</p>
		<table id="org">
			<c:choose>
				<c:when test="${orgList == null }">
					<tr>
						<th colspan="11">
							작성된 <span style="color: blue">단체활동</span>이가 없다요
						</th>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach var="vo" items="${orgList }">
						<tr>
							<td>
								${vo.NAME} • 
								<c:if test="${vo.STAT == 1 }">활동중</c:if>
								<c:if test="${vo.STAT == 0 }">비활동</c:if>
							</td>	
						</tr>	
						<tr>
							<td>${vo.SOCIALACT_NAME }</td>
						<tr>
							<td>
								<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/profile/org_updateform?no=${vo.ORG_NO }'">
								<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/profile/org_delete?no=${vo.ORG_NO }'">
							</td>
						</tr>	
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</table>
	</div>
	
 

<%@ include file="/WEB-INF/views/layout/footer.jsp" %>	