<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="msg">
	<c:choose>
		<c:when test="${status == 'write' }">사전평가 작성</c:when>
		<c:when test="${status == 'hidden' }">사전평가 삭제</c:when>
		<c:when test="${status == 'update' }">사전평가 수정</c:when>
	</c:choose>
</c:set>

<c:choose>
	<c:when test="${vop != 0 && voq != 0 && voo != 0}">
		<script type="text/javascript">
			alert("${msg} 완료");
			document.location.href = '${url}';
		</script>
	</c:when>
	<c:otherwise>
		<script type="text/javascript">
			alert("${msg} 실패");
			history.back();
		</script>
	</c:otherwise>
</c:choose>