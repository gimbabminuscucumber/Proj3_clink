<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.0/jquery.min.js" integrity="sha512-3gJwYpMe3QewGELv8k/BX9vcqhryRdzRMxVfq6ngyWXwo03GFEzjsUm8Q7RZcHPHksttq7/GFoxjCVUjkjvPdw==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="OpCreate" method="post">
	<div style="position: absolute; left: 50%; right: 50%; margin: 0px 0px 0px -200px; width: 200px; box-shadow: 1px 1px gray">
		<table>
			<tr>
				<th>권한</th>
			</tr>
			<tr>
				<td>프로필및 게시글<input name = "grade1" type = "checkbox"></td>
			</tr>
			<tr>
				<td>채용공고<input name = "grade2" type = "checkbox"></td>
			</tr>
			<tr>
				<td>계정생성<input name = "grade3" type = "checkbox"></td>
			</tr>
			<tr>
				<td>비용처리<input name = "grade4" type = "checkbox"></td>
			</tr>
		</table>
	</div>
	<div>
		<table>
			<tr>
				<td>부서:
					<select name = "dp" onchange="onch(this,sl2)">
						<c:choose>
							<c:when test="${fn:length(dpList) != 0}">
									<option value = "null">없음</option>
									<c:forEach var="list" items="${dpList }">
									<option value="${list.depart_mng_no }">${list.name }</option>
									</c:forEach>
							</c:when>
							<c:otherwise>
								<option>부서를생성하세요</option>
							</c:otherwise>
						</c:choose>
					</select>
				</td>
				<td>직책:<select id= "sl2" name = "posi_mng_no" disabled>
					<option value = "null">부서를 선택해주세요</option>
				</select>
				</td>
			</tr>
			<tr>
				<td>id</td>
				<td><input name = "opCreate_bus_usrId" type = "text"></td>
			</tr>
			<tr>
				<td>password</td>
				<td><input name = "opCreate_bus_usrPw" type = "password"></td>
			</tr>
		</table>
		<input type = "submit" value="생성">
	</div>
	</form>
<script type="text/javascript">
	function onch(t,s2) {
		if(t.value != 'null'){
			s2.disabled = false;
			s2.innerHTML = "";
			$.ajax({
				url:"selectPosiList",
				data:{departNo : t.value},
				type:"post",
				success: function sc(s) {
					if(s.length != 0){
						s.forEach(p => {
							let newOt = document.createElement('option');
							newOt.setAttribute("value",p.posi_mng_no);
							newOt.innerText = p.name;
							s2.appendChild(newOt);
						})		
					}else{
							let newOt = document.createElement('option');
							newOt.setAttribute("value",'null');
							newOt.innerText = "직책이 비었습니다";
							s2.appendChild(newOt);							
					}
				}
			}) 
		}else{
			s2.disabled = true;
			s2.innerHTML = "";
			let newOt = document.createElement('option');
			newOt.setAttribute("value",'null');
			newOt.innerText = "부서를 선택해주세요";
			s2.appendChild(newOt);					
		}
	}
</script>
</body>
</html>