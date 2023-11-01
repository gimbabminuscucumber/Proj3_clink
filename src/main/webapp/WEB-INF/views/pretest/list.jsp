<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/views/layout/header.jsp"%>
<hr>
<div align="left">
	<table>
			<tr><th><td><strong>====사전 문제 관리하는 영역 (채용팀, 슈퍼계정 전용)====</strong></td></th></tr>
			<c:forEach var="vo" items="${pretest_all_vo }">
				<tr>								
					<td><strong>회사명</strong></td>
					<td></td>
				</tr>
				<tr>								
					<td><strong>채용공고</strong></td>
					<td></td>
				</tr>
				<tr>
					<td><strong>평가 문제 제출방식</strong></td>
					<td>
						<c:if test="${vo.CLASSIFY == 0 }">사이트 양식 사용</c:if>
						<c:if test="${vo.CLASSIFY == 1 }">자사 맞춤 문제 작성</c:if>
					</td>	
				</tr>
				<tr>								
					<td><strong>사전평가 문제</strong></td>
					<td>${vo.QUESTION }</td>
				</tr>
				<tbody>
				<tr>
					<td><strong>사전평가 보기</strong></td>
					<td>${vo.OPT }</td>
				</tr>
				<tr>
					<th><td>
						<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/pretest/updateform?no=${vo.PRETEST_ID }'">
						<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/pretest/hidden?no=${vo.PRETEST_ID }'">
					</td>
				</tr>	
			</c:forEach>
		</tbody>
	</table>
</div>
<%@ include file="/WEB-INF/views/layout/footer.jsp" %>	