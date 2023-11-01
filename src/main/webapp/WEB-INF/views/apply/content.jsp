<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<script>
</script>
<%@ include file="/WEB-INF/views/layout/header.jsp"%>
<hr>
<div align="center">
	<table>
		<c:choose>
			<c:when test="${apply_all_vo == null }">
				<tr>
					<td colspan="11">
						<span style="font-weight: bold;">작성한 자소서가 없다요</span>
					</td>
				</tr>
			</c:when>
		<c:otherwise>
			<c:forEach var="vo" items="${apply_all_vo }">
				<tr>
					<th>회원 프로필 내용</th>
					<td></td>
				</tr>
				<tr>
					<th>병역</th>
					<td>
						<c:if test="${vo.OPT == 0 }">해당없음</c:if>
						<c:if test="${vo.OPT == 1 }">군필</c:if>
						<c:if test="${vo.OPT == 2 }">미필</c:if>
						<c:if test="${vo.OPT == 3 }">면제</c:if>
					</td>
				</tr>
				<tr>
					<th>병역 구분</th>
					<td>
						<c:if test="${vo.TYPE == 0 }">육군</c:if>
						<c:if test="${vo.TYPE == 1 }">해군</c:if>
						<c:if test="${vo.TYPE == 2 }">공군</c:if>
						<c:if test="${vo.TYPE == 3 }">해병</c:if>
						<c:if test="${vo.TYPE == 4 }">의경</c:if>
						<c:if test="${vo.TYPE == 5 }">공익</c:if>
						<c:if test="${vo.TYPE == 6 }">기타</c:if>
					</td>
				</tr>
				<tr>
					<th>사유</th>
					<td>${vo.RSN }</td>
				</tr>
				<tr>
					<th>입영일</th>
					<td><fmt:formatDate value="${vo.START_DATE }" pattern="yyyy-MM-dd"/></td> 
				</tr>
				<tr>
					<th>제대일</th>
					<td><fmt:formatDate value="${vo.END_DATE }" pattern="yyyy-MM-dd"/></td> 
				</tr>
				<tr>
					<th>민감 정보 동의 여부</th>
					<td>${vo.TERMSTAT }</td>
				</tr>
					<!-- apply_form -->
				<tr>
					<th>자기소개 제목</th>
					<td>${vo.TITLE }</td>
				</tr>
				<tr>
					<th>자기소개 내용</th>
					<td>${vo.DETAIL }</td>
				</tr>
				<tr>
					<th>
						<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/apply/updateform?no=${vo.APPLY_ID }'">
						<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/apply/hidden?no=${vo.APPLY_ID }'">
					</th>
					<td><- 회원만 보이게</td>
				</tr>
				<tr>
					<th>
						<input type="button" value="PDF로 받기">
						<input type="button" value="목록" onclick="location.href='${pageContext.request.contextPath}/apply_mng/list'">
					</th>
					<td><- 회원 / 채용팀 다 보이게</td>
				</tr>
			</c:forEach>
		</c:otherwise>		
		</c:choose>
	</table>
</div>