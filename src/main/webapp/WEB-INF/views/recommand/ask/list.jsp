<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="/WEB-INF/views/layout/header.jsp"%>
<style>
	#rec {
	  width : 40%;
	  height: 40%;
	  border: 1px solid gray;
	}
</style>
<hr>
<!-- 추천서 요청 리스트 -->
<div align="left">
	<p style="font-weight: bold; font-size: 20px;">추천서 요청 리스트 <!-- 수신인(to_member)한테 양식 생성되게 -->
	<div id="rec">
		<table>
			<c:choose>						
				<c:when test="${alist == null }">	<!-- controller에서 list의 데이터를 뽑아 쓰기 위해 사용하는 코드 -->
					<tr>
						<td colspan="11">
							<span style="font-weight: bold;">요청한 추천서가 없다요</span>
						</td>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach var="vo" items="${alist }">					
						<tr>
							<td><strong>수신인</strong></td>
							<td>${vo.TO_MEMBER } ( ${vo.RELATION } )</td>
						</tr>
						<tr>	
							<!-- 특정 길이 이후는 짤리게 출력 -->
							<td><strong>요청 사항</strong></td>											
							<td><a href="${pageContext.request.contextPath }/recommand/ask_content?no=${vo.REC_ASK_ID }">${vo.CONTENT }</a></td>
						</tr>
						<tr>			
							<td><strong>요청일</strong></td>
							<td><fmt:formatDate value="${vo.ASK_DATE }" pattern="yyyy-MM-dd"/> -> 수정하면 수정한 시간으로 변경??</td> 
						</tr>
						<td>
							<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/recommand/ask_updateform?no=${vo.REC_ASK_ID }'">
							<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/recommand/ask_delete?no=${vo.REC_ASK_ID  }'">
						</td>
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</table>
	</div>
</div>

<!-- 추천서 완료 리스트 (수신자가 작성 완료해서 받게되는 최종 형태의 추천서) -->
<div align="left">
	<p style="font-weight: bold; font-size: 20px;">추천서 완료 리스트 <!-- 수신자가 작성완료한 추천서 -->
	<div id="rec">
		<table>
			<c:choose>						
				<c:when test="${flist == null }">	<!-- controller에서 list의 데이터를 뽑아 쓰기 위해 사용하는 코드 -->
					<tr>
						<td colspan="11">
							<span style="font-weight: bold;">완료된 추천서가 없다요</span>
						</td>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach var="vo" items="${flist }">					
						<tr>
							<td><strong>작성자</strong></td>
							<td>${vo.TO_MEMBER } (${vo.RELATION })</td>
						</tr>
						<tr>
							<td><strong>요청 사항</strong></td>
							<td>${vo.CONTENT}</td>
						</tr>
						<tr>												
							<!-- 특정 길이 이후는 짤리게 출력 -->
							<td><strong>추천 내용</strong></td>
							<td><a href="${pageContext.request.contextPath }/recommand/form_content?no=${vo.REC_FORM_ID }">${vo.DETAIL }</a></td>
						</tr>
						<tr>
							<td><strong>요청일</strong></td>
							<td><fmt:formatDate value="${vo.FORM_DATE }" pattern="yyyy-MM-dd"/></td> 
						</tr>
						<td>
							<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/recommand/form_delete?no=${vo.REC_FORM_ID  }'">
						</td>
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</table>
	</div>
</div>
<%@ include file="/WEB-INF/views/layout/footer.jsp" %>	