<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ include file="/WEB-INF/views/cLayout/header.jsp" %>	 



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 조직도 -->
<%-- <%@ include file="/WEB-INF/views/Bmember/Organizationchart.jsp" %>
<%@ include file="/WEB-INF/views/cLayout/footer.jsp" %>	 --%>
<!-- /조직도 -->
 	<c:choose>
		<c:when test="${t != 'm' }">
			<input type = "button" onclick="document.location.href='OpJoinForm'" value="부하계정 만들기">
			<input type = "button" onclick="document.location.href='oplist'" value="직원 관리하기">
			<input type = "button" onclick="document.location.href='${pageContext.request.contextPath}/jpost/writeform'" value="채용공고 작성">
		</c:when>
		<c:when test="${t == 'm'}">
			<input type = "button" onclick="document.location.href='personconnection'" value = "인맥">
			<input type = "button" onclick="document.location.href='tech_test'" value = "사전평가">
		</c:when>
	</c:choose>
	<input type = "button" onclick="document.location.href='${t != 'm' ? 'project2/showBpf' : 'ppfList'	}'" value = "프로필">
	<input type = "button" onclick="document.location.href='chatpage'" value = "메세지">
	<input type = "button" onclick="document.location.href='logout'" value = "로그아웃"> 
<script type="text/javascript">

</script>
</body>
</html>