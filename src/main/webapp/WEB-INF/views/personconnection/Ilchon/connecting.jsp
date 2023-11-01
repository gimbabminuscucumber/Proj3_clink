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
	<div style="position: absolute; right: 0;  box-shadow: 1px 1px gray; width: 200px;">
		친구 목록
		<div id = "list">
			<c:forEach var="list" items="${ilchonList }">
				<div>
					${list.ID1}ddd<span>ddd
					<input type = "button" value = "●" onclick="">
						<span style = "position: absolute;">
						<a>메세지보내기</a><br>
						<a>프로필보기</a><br>
						<a>친구삭제</a><br>
						</span>
					</span>
				</div>
			</c:forEach>
		</div>
	</div>
	<div align="center">
		<div style="width: 500px; height: 50px; box	shadow: 1px 1px gray">
			<c:choose>
				<c:when test="${askedcnt != 0 }">
					대기중인 1촌 신청이 ${askedcnt}개 있습니다
				</c:when>
				<c:otherwise>
					대기 중인 1촌 신청 없음
				</c:otherwise>
			</c:choose>
			<a onclick="document.location.href='showMyIlchon'" style="float: right; margin-right: 2%; font-weight: bold;">관리</a>
		</div>
		<form action = "sentIlchon">
			<table>
				<tr>
					<th>친구맺기를 원하는 이메일을 입력해주세요</th>
				</tr>
				<tr>
					<th><input name = "email" type = "text"></th>
				</tr>
			</table>
			<input onclick="sentMail(this.form)" type = "button" value="전송">
		</form>	
	</div>
<script type="text/javascript">
	function sentMail(f) {
		$.ajax({
			url:"${pageContext.request.contextPath}/checkMail",
			data:{mail:f.email.value},
			type:"POST",
			success: function sc(num) {
				let str = null;
				switch (num) {
				case 0:
		/* 			$.ajax({
						url:,
						type:,
						data:,
						success:
					}) */
					f.submit()
					break;
				case 1:
					str = "이미 친구입니다";
					break;
				case 2:
					str = "이미 요청이왔습니다";
					break;	
				case 3:
					str = "이미 요청을 보냈습니다";
					break;				
				}
			}
		})
	}
</script>
</body>
</html>