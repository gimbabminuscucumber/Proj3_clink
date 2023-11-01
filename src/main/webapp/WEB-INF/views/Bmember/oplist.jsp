<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.0/jquery.min.js" integrity="sha512-3gJwYpMe3QewGELv8k/BX9vcqhryRdzRMxVfq6ngyWXwo03GFEzjsUm8Q7RZcHPHksttq7/GFoxjCVUjkjvPdw==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<table border="1">
			<c:forEach var="list" items="${list }">
				<tr>
					<td>${list.createo_mng_id }</td>
					<td><input type = "button" value="수정" onclick="document.location.href='opupdate?id=${list.createo_mng_id }'"></td>
					<td><input type = "button" value="삭제" onclick="if(confirm('정말 삭제하시겠습니까?'))$.ajax({url:'opdel',data:{id:'${list.createo_mng_id }'},type:'post',success: function sc(s){ let str = s == 1 ? '삭제가 완료되엇습니다' : '삭제에 실패했습니다'; alert(str); location.reload(true)}})"></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>																																																					