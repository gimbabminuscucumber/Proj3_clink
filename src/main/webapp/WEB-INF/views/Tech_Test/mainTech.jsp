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
		기술평가
		<c:forEach var="list" items="${techList }">
			<div> ${list.NAME }
				<a href = "getExTest_Prack?key=${list.TECH_TEST_NO }">연습문제</a>
				<a href = "getTest_QnA?key=${list.TECH_TEST_NO }">본평가</a>
			</div>
		</c:forEach>
	</div>
</body>
</html>