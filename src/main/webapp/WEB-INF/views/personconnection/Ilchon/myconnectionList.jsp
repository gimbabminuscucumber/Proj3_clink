<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.0/jquery.min.js" integrity="sha512-3gJwYpMe3QewGELv8k/BX9vcqhryRdzRMxVfq6ngyWXwo03GFEzjsUm8Q7RZcHPHksttq7/GFoxjCVUjkjvPdw==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<style type="text/css">
	.List-body{
	width: 50%;
	border: 1px solid;
	height: 500px;
	border-radius: 8px;
	}
	.List-header div{
	border-bottom: 1px solid;
	text-align: left;
	padding-bottom: 2%;
	}
	.List-header a{
	padding:  2%;
	font-weight: bold;
	cursor: pointer;
	}

</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<div class = "List-body">
			<div class = "List-header">
				<h2>1촌신청관리</h2>
				<div>
				<a onclick="opAskLt(asked,send)">받은 1촌 신청</a><a onclick="opSendLt(asked,send)">보낸 1촌 신청</a>
				</div>
			</div>
			<div class = "List-footer">
				<div id = "asked">
					<c:forEach var="list" items="${askedList }">
						<div class = "">
							보낸사람 : ${list.ID2} 보낸시간 : ${list.SENT_DATE }<input id="${list.GROUPNO}" type = "button" value = "수락" onclick="acceptd(this,0)"> <input id="${list.GROUPNO}" onclick="acceptd(this,1)" type = "button" value = "거절">
						</div>
					</c:forEach>
				</div>
				<div id = "send" style="display: none;">
					<c:forEach var="list" items="${sentList }">
						<div class = "">
							받는사람 : ${list.ID2} 보낸시간 : ${list.SENT_DATE}
						</div>
					</c:forEach>
				</div>
			</div>
		</div>
	</div>
<script type="text/javascript">
	function opAskLt(t1,t2) {
		t1.style.display = "";
		t2.style.display = "none";
	}
	
	function opSendLt(t1,t2) {
		t1.style.display = "none";
		t2.style.display = "";
	}
	
	function acceptd(t,n) {
		list = t.parentElement.parentElement
		list.removeChild(t.parentElement);
		console.log(t.id)
		$.ajax({
			url:"${pageContext.request.contextPath}/IlchonAccept",
			type:"POST",
			data:{gno:t.id,type:n},
		})
		
	}
</script>
</body>
</html>