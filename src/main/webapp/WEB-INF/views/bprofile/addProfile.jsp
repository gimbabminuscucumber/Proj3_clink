<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/layout/header.jsp" %>
<hr>
<div align="center">
	<a href="${pageContext.request.contextPath}/profile/careerform">경력사항 등록</a><br>
	<a href="${pageContext.request.contextPath}/profile/eduform">학력사항 등록</a><br>
	<a href="${pageContext.request.contextPath}/profile/restform">경력 휴식기 입력</a><br>
	<a href="${pageContext.request.contextPath}/profile/certform">자격증 등록</a><br>
	<a href="${pageContext.request.contextPath}/profile/inscertform">수료증 등록</a><br>
	<a href="${pageContext.request.contextPath}/profile/projform">프로젝트 등록</a><br>
</div>
<%@ include file="/WEB-INF/views/layout/footer.jsp" %>
