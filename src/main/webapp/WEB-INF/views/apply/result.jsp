<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="msg">
	<c:choose>
		<c:when test="${status == 'write' }">지원서 작성</c:when>
		<c:when test="${status == 'hidden' }">지원서 삭제</c:when>
		<c:when test="${status == 'update' }">지원서 수정</c:when>
		<c:when test="${status == 'submit' }">지원서 제출</c:when>
	</c:choose>
</c:set>

<c:choose>
	<c:when test="${su != 0 }">
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