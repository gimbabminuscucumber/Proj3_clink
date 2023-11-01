<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/views/layout/header.jsp"%>
<hr>
	<div align="left">
	<table>
		<tbody>
			<c:choose>
				<c:when test="${apply_all == null }">
					<tr>
						<td>
							<span style="font-weight: bold;">제출된 지원서들이 없습니다.</span>
						</td>				
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach var="vo" items="${apply_all }">
						<tr>
							<td><strong>지원서 번호</strong></td>
							<td>${vo.APPLY_NO }</td>
						</tr>
						<tr>
							<td><strong>지원자 이름</strong></td>
							<td><a href="${pageContext.request.contextPath }/apply/content?no=${vo.APPLY_ID}">${vo.LAST_NAME } ${vo.FIRST_NAME}</a></td> <!-- 지원자 이름 클릭시,해당 유저의 지원서로 연결 -->
						</tr>
						<tr>
							<td><strong>적합 등급</strong></td>
							<td>${vo.FIT }</td>
						</tr>
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</tbody>
	</table>
	</div>
<%@ include file="/WEB-INF/views/layout/footer.jsp" %>