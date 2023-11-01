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
	<div id = "writeForm" align="center" style="background-color: white; display:none; position: absolute;  transform: translate(-50%, -50%); top: 30%; right: 50%; left: 50%; width: 30%;">
		<form id = "mainForm" action="writeReview">
			<input type = "hidden" name = "member_id" value = "">
			<input type = "hidden" name = "mentor_contact_no" value = "">
			<table>
				<tr>
					<td>점수</td>
					<td><input type = "number" value="0" name = "score"></td>
				</tr>
				<tr>
					<td>평가</td>
					<td><input type = "text" name = "content"></td>
				</tr>
			</table>
			<input type = "submit" value = "작성">
			<input type = "button" value = "취소" onclick="writeForm.style.display = 'none';">
		</form>
	</div>
	<div align="center">
		<c:forEach var="menteeList" items="${menteeReview }">
			<div>${menteeList.NAME } 시작날짜 : ${menteeList.START_DATE }<input type = "button" value ="리뷰작성" onclick="a(mainForm,${menteeList.MENTOR_CONTACT_NO},'${menteeList.MENTOR }')"></div>
		</c:forEach>
	</div>
<script type="text/javascript">
	function a(t,num,id) {
		t.mentor_contact_no.value = num; 
		t.member_id.value = id;
		console.log(t.member_id.value)
		writeForm.style.display = ''; 
	}
</script>
</body>
</html>