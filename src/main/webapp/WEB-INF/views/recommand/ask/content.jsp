<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layout/header.jsp"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>	<!-- date탸입 칼럼의 sysdate을 원하는 날짜 형태로 출력 -->
<style>
	th{
		text-align: left;
	}
	
	td{
		border: 1px solid;
	}
</style>
<hr>
<div align="center">
	<table class="">
		<tr>
			<th>수신인</th>
			<tr><td>${vo.TO_MEMBER } (${vo.RELATION })</td>
		</tr>
		<tr>
			<!-- 100자 제한 ajax로 구현 -->
			<th>요청 내용</th>
			<tr><td>${vo.CONTENT }</td>	
		</tr>
		<tr>
			<th>요청 일자</th>
			<tr><td><fmt:formatDate value="${vo.ASK_DATE }" pattern="yyyy-MM-dd"/></td> 
		</tr>
		<tr>
	</table>
	<div>
		<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/recommand/ask_updateform?no=${vo.REC_ASK_ID }'">
		<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/recommand/ask_delete?no=${vo.REC_ASK_ID }'">
		<input type="button" value="목록" onclick="location.href='${pageContext.request.contextPath}/recommand/ask_list'">
	</div>
	
</div>