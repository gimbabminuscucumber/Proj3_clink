<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
			<input type="button" value="회원 프로필 추가" onclick="location.href='${pageContext.request.contextPath}/profile/addProfile'">
			<input type="button" value="회원 프로필" onclick="location.href='${pageContext.request.contextPath}/profile/profile'">

			<input type="button" value="JS 테스트" onclick="location.href='${pageContext.request.contextPath}/pretest/js_test'">
			<input type="button" value="사전평가 문제 테스트" onclick="location.href='${pageContext.request.contextPath}/pretest/test'">
			<input type="button" value="사전평가 문제 출제" onclick="location.href='${pageContext.request.contextPath}/pretest/writeform'">
			<input type="button" value="사전평가 문제 리스트" onclick="location.href='${pageContext.request.contextPath}/pretest/list'">

			<input type="button" value="채용공고 작성" onclick="location.href='${pageContext.request.contextPath}/jpost/writeform'">
			<input type="button" value="채용공고 리스트" onclick="location.href='${pageContext.request.contextPath}/jpost/list'">

			<input type="button" value="지원서 작성" onclick="location.href='${pageContext.request.contextPath}/apply/writeform'">
			<input type="button" value="지원서 리스트" onclick="location.href='${pageContext.request.contextPath}/apply/list'">

			<input type="button" value="추천서 요청" onclick="location.href='${pageContext.request.contextPath}/recommand/ask_writeform'">		<!-- 추천서 요청 발송 -->
			<input type="button" value="추천서 요청 리스트" onclick="location.href='${pageContext.request.contextPath}/recommand/ask_list'">		<!-- 요청된 발송자가 수신자한테 확인 -->
			<input type="button" value="추천서 작성 리스트" onclick="location.href='${pageContext.request.contextPath}/recommand/form_list'">	<!-- 수신자가 작성 -->
	</div>
<div>