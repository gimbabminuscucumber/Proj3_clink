<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="/WEB-INF/views/layout/header.jsp"%>
<hr>
<c:set var="cpath" value="${pageContext.request.contextPath	}"/>
	<div align="left">
		<div>====특정 유저가 작성한 자소서만 나오게=====</div>
		<table>
			<c:choose>						
				<c:when test="${apply_vo == null }">	<!-- controller에서 list의 데이터를 뽑아 쓰기 위해 사용하는 코드 -->
					<tr>
						<td colspan="11">
							<span style="font-weight: bold;">작성한 자기소개서가 없다요</span>
						</td>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach var="vo" items="${apply_vo }">					
						<tr>												
							<td><strong>지원서 제목</strong></td>
							<td><a href="${pageContext.request.contextPath }/apply/content?no=${vo.APPLY_ID }">${vo.TITLE }</a></td>
						</tr>
						<tr>												
							<td><strong>지원서 내용</strong></td>
							<td>${vo.DETAIL }</td>
						</tr>
						<tr>
							<td><strong>작성일</strong></td>
							<td><fmt:formatDate value="${vo.APPLY_DATE }" pattern="yyyy-MM-dd"/></td> 
						</tr>
						<th>
							<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/apply/updateform?no=${vo.APPLY_ID }'">
							<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/apply/hidden?no=${vo.APPLY_ID }'">
							<input type="button" value="PDF로 받기">
						</th>
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</table>
	</div>
	
<%@ include file="/WEB-INF/views/layout/footer.jsp" %>	