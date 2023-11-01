<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>	<!-- date탸입 칼럼의 sysdate을 원하는 날짜 형태로 출력 -->
<%@ include file="/WEB-INF/views/layout/header.jsp"%>
<style>
	#pf {
	  width : 40%;
	  height: 40%;
	  border: 1px solid gray;
	}
</style>
<script>
</script>
<hr>
<c:set var="cpath" value="${pageContext.request.contextPath	}"/>
	<div align="left" id="pf">
		<p style="font-weight: bold; font-size: 20px;">경력 사항
		<table id="career">
			<c:choose>
				<c:when test="${career_vo == null }">
					<tr>
						<th colspan="11">
							작성된 <span style="color: blue">경력 사항</span>이 없다요
						</th>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach var="vo" items="${career_vo }">
						<tr><td>${vo.COMPANY} • {vo.EMPL_TYPE}</td></tr>
						<tr><td><fmt:formatDate value="${vo.START_DATE }" pattern="yyyy-MM"/> ~ <fmt:formatDate value="${vo.END_DATE }" pattern="yyyy-MM"/>( ?? 개월) • {vo.STAT} </td></tr>
						<tr><td>${vo.CTNAME}</td></tr>
						<tr>
							<td>
								<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/profile/updateform?no=${vo.CAREER_NO }'">
								<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/profile/hidden?no=${vo.CAREER_NO }'">
							</td>
						</tr>	
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</table>
	</div>

<c:set var="cpath" value="${pageContext.request.contextPath	}"/>
	<div align="left" id="pf">
		<p style="font-weight: bold; font-size: 20px;">학력 사항
		<table id="edu">
			<c:choose>
				<c:when test="${edu_vo == null }">
					<tr>
						<th colspan="11">
							작성된 <span style="color: blue">학력 사항</span>이 없다요
						</th>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach var="vo" items="${edu_vo }">
						<tr><td>${vo.SCHOOL }</td></tr>
						<tr><td>${vo.MAJOR }</td></tr>
						<tr>
							<td>
								<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/profile/updateform?no=${vo.EDU_NO }'">
								<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/profile/hidden?no=${vo.EDU_NO }'">
							</td>
						</tr>	
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</table>
	</div>

<c:set var="cpath" value="${pageContext.request.contextPath	}"/>
	<div align="left" id="pf">
		<p style="font-weight: bold; font-size: 20px;">휴식기
		<table id="edu">
			<c:choose>
				<c:when test="${rest_vo == null }">
					<tr>
						<th colspan="11">
							작성된 <span style="color: blue">휴식기 내역</span>이 없다요
						</th>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach var="vo" items="${rest_vo }">
						<tr><td>${vo.STAT }</td></tr>
						<tr><td>${vo.RSN }</td></tr>
						<tr><td><fmt:formatDate value="${vo.START_DATE }" pattern="yyyy-MM"/> ~ <fmt:formatDate value="${vo.END_DATE }" pattern="yyyy-MM"/>( ?? 개월) </td></tr>
						<tr>
							<td>
								<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/profile/updateform?no=${vo.REST_NO }'">
								<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/profile/hidden?no=${vo.REST_NO }'">
							</td>
						</tr>	
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</table>
	</div>

<c:set var="cpath" value="${pageContext.request.contextPath	}"/>
	<div align="left" id="pf">
		<p style="font-weight: bold; font-size: 20px;">자격증
		<table id="edu">
			<c:choose>
				<c:when test="${cert_vo == null }">
					<tr>
						<th colspan="11">
							작성된 <span style="color: blue">자격증</span>이 없다요
						</th>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach var="vo" items="${cert_vo }">
						<tr><td>${vo.NAME }</td></tr>
						<tr>
							<td>
								<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/profile/updateform?no=${vo.CERT_NO }'">
								<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/profile/hidden?no=${vo.CERT_NO }'">
							</td>
						</tr>	
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</table>
	</div>
	
<c:set var="cpath" value="${pageContext.request.contextPath	}"/>
	<div align="left" id="pf">
		<p style="font-weight: bold; font-size: 20px;">수료증
		<table id="edu">
			<c:choose>
				<c:when test="${inscert_vo == null }">
					<tr>
						<th colspan="11">
							작성된 <span style="color: blue">자격증</span>이 없다요
						</th>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach var="vo" items="${inscert_vo }">
						<tr><td>${vo.NAME }</td></tr>
						<tr>
							<td>
								<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/profile/updateform?no=${vo.INSCERT_NO }'">
								<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/profile/hidden?no=${vo.INSCERT_NO }'">
							</td>
						</tr>	
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</table>
	</div>


<%@ include file="/WEB-INF/views/layout/footer.jsp" %>	