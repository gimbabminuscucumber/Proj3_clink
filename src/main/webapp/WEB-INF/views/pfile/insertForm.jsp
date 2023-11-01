<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div align="center">
		<!-- 파일업로드를 위해서는 반드시 POST타입으로 전송해야 하며, enctype이 필요하다 -->
		<form action="${pageContext.request.contextPath }/pfile/upload" method="POST" enctype="multipart/form-data">
	
			사진:<input type="file" name="file"><br>
			<input type="hidden" name="filename"><br>
			대체 텍스트:<input type="text" name="altText"><br>
			<input type="hidden" name="postNo"><br>
			<input type="submit" value="전송">
		</form>
	</div>
	
</body>
</html>