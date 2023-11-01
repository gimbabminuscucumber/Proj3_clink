<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		사진:${vo.filename }<br>
		대체 텍스트:${vo.altText }<br>
		<input type="hidden" name="postNo" value="${vo.postNo}"><br>
		<img src="resources/upload/${vo.filename }" width="200px"><br>
		<a href="insertForm">다시 등록</a>
	</div>
	
</div>
</body>
<script>
	console.log(${list})
</script>
</html>