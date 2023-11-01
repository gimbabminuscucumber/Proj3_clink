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

<!-- 추천서 요청받은 리스트 -->
<div align="left">
	<p style="font-weight: bold; font-size: 20px;">추천서 작성 대기 리스트 (작성자한테 생성될 양식)
	<div id="rec">
		<table>
			<c:choose>						
				<c:when test="${alist == null }">	
					<tr>
						<td colspan="11">
							<span style="font-weight: bold;">작성한 추천서가 없다요</span>
						</td>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach var="vo" items="${alist }">					
						<tr>
							<td><strong>수신인</strong></td>		
							<td>${vo.TO_MEMBER} ( ${vo.RELATION } )</td> 
						</tr>
						<tr>							
							<!-- 특정 길이 이후는 짤리게 출력 -->					
							<td><strong>요청 사항</strong></td>
							<td><a href="${pageContext.request.contextPath }/recommand/ask_content?no=${vo.REC_FORM_ID }">${vo.CONTENT }</a></td> 
						<td> <- 특정 길이 이후는 짤리게 출력</td>
						</tr>
						<tr>
							<td><strong>작성일</strong></td>
							<td><fmt:formatDate value="${vo.ASK_DATE }" pattern="yyyy-MM-dd"/></td> 
						</tr>
						<td>
							<!-- 작성하면 "작성완료" 문구 띄우기-->
							<input type="button" value="작성하기" onclick="location.href='${pageContext.request.contextPath}/recommand/form_writeform?no=${vo.REC_ASK_ID }'">
						</td>
						<td></td>
						<td>  <- 작성하면 "작성완료" 문구 바뀌게</td>
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</table>
	</div>
</div>
	
<!-- 추천서 작성해준 리스트 -->
<div align="left">
	<p style="font-weight: bold; font-size: 20px;">추천서 작성 완료 리스트
	<div id="rec">
		<table>
			<c:choose>						
				<c:when test="${flist == null }">	
					<tr>
						<td colspan="11">
							<span style="font-weight: bold;">완료된 추천서가 없다요</span>
						</td>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach var="vo" items="${flist }">					
						<tr>
							<td><strong>수신인</strong></td>	
							<td>${vo.TO_MEMBER} ( ${vo.RELATION } )</td> 
						</tr>
						<tr>								
							<!-- 특정 길이 이후는 짤리게 출력 -->				
							<td><strong>요청 사항</strong></td>
							<td>${vo.CONTENT }</td>
						</tr>
						<tr>								
							<!-- 특정 길이 이후는 짤리게 출력 -->				
							<td><strong>추천 내용</strong></td>
							<td><a href="${pageContext.request.contextPath }/recommand/form_content?no=${vo.REC_FORM_ID}">${vo.DETAIL }</a>
						</tr>
						<tr>
							<td><strong>작성일</strong></td>
							<td><fmt:formatDate value="${vo.FORM_DATE }" pattern="yyyy-MM-dd"/></td> 
						</tr>
						<td>
							<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/recommand/form_updateform?no=${vo.REC_FORM_ID }'">
							<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/recommand/form_delete?no=${vo.REC_FORM_ID  }'">
						</td>
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</table>
	</div>
</div>
	
<%@ include file="/WEB-INF/views/layout/footer.jsp" %>	