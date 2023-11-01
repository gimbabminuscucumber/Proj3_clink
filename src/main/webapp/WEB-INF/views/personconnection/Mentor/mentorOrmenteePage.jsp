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
	<input type = "button" value = "멘토 신청" onclick="Mentorf.style.display == 'none' ? Mentorf.style.display = '' : Mentorf.style.display = 'none'">
	<div id = "Mentorf" style="position: absolute; display: none">
		<form action="upmentor">
			<p>멘토 신청조건<br>
			프로필 80% 이상 작성<br>
			경력 한 회사에 24개월 근무시<br>
			<input onclick="mailf.style.display = '';fef.style.display = 'none'" type = "radio" name = "type" checked>회사 메일인증<input onclick="mailf.style.display = 'none';fef.style.display = ''" id="fe" type = "radio" name = "type"> 명함인증
			<div id = "mailf">
				<input name = "email" type = "text"><input type = "button" value = "인증">
			</div>
			<div id = "fef" style="display: none">
				<input name = "fileName" type = "file">
			</div>
			<input type = "submit" value = "가입">
		</form>
	</div> 
	<c:if test="${login.mentor == 1 }">
		<input type = "button" value = "요청함" onclick="requestList.style.display == 'none' ? requestList.style.display = '' : requestList.style.display = 'none'">
		<div id = "requestList" style="position: absolute; display: none">
			요청함
			<table>
				<c:forEach var="list" items="${requestList}">
					<tr>
						<td>${list.MENTEE}</td>
						<td><input type = "button" value = "수락" onclick="Reaction(${list.MENTOR_CONTACT_NO},1,this)"></td>
						<td><input type = "button" value = "거절" onclick="Reaction(${list.MENTOR_CONTACT_NO},0,this)"></td>
					</tr>
				</c:forEach>
			</table>		
		</div>
	</c:if>
	<input type = "button" value = "리뷰작성" onclick="document.location.href='MrivewForm'"> 
	<div align="center">
		<table>
			<c:forEach var="list" items="${MentorList}">
				<tr>
					<td>${list.MEMBER_ID}</td>
					<td><input onclick="request('${list.MEMBER_ID}',this)" type = "button" value = "멘토요청하기"></td>
				</tr>
			</c:forEach>
		</table>
	</div>
<script type="text/javascript">
	function request(response,t) {
		$.ajax({
			url: "${pageContext.request.contextPath}/Mentor_request",
			type:"POST",
			data:{response_id:response},
			success: function sc(s) {
				if(s == 1){
					t.disabled = true;
				}
			}
		})
	}
	
	function Reaction(no,type,t) {
		let path = type == 0 ? "Mentor_Refusal":"Mentor_Accept";
		$.ajax({
			url: "${pageContext.request.contextPath}/"+path,
			type:"POST",
			data:{no:no},
			success: function sc(s) {
				if(s == 1){
					t.parentElement.parentElement.parentElement.parentElement.removeChild(t.parentElement.parentElement.parentElement);
				}
			}
		})
	}

</script>
</body>
</html>