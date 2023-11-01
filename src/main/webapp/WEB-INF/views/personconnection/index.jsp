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
	<div style="position: absolute; left: 0;  box-shadow: 1px 1px gray; width: 200px;">
		<div><input type = "button" value = "1촌"></div>	
		<div><input type = "button" value = "팔로우중 및 팔로워" onclick="document.location.href='followpage'"></div>	
		<div><input type = "button" value = "멘토" onclick="document.location.href='mentorOrmentee'"></div>			
	</div>
	<div style="position: absolute; right: 0;  box-shadow: 1px 1px gray; width: 300px;">
		친구 목록
		<c:choose>
			<c:when test="${fn:length(ilchonList) !=0 }">
				<div id = "ilchonlist" style="margin-bottom: 3%;">
					<c:forEach var="list" items="${ilchonList }" varStatus="i" >
						<div>
							${list.ID1 }
							<span>
							<input type = "button" value = "●" onclick="i${i.index}.style.display == 'none' ? i${i.index}.style.display = '' : i${i.index}.style.display = 'none'">
							<span id = "i${i.index}" style = "position: absolute; background-color: white; display: none" >
								<a href="sendChat">메세지보내기</a><br>
								<a>프로필보기</a><br>
								<a href= '${pageContext.request.contextPath }/ilchondestroy?in=${list.GROUPNO}'>친구삭제</a><br>
								</span>
							</span>
						</div>
					</c:forEach>
				</div>
			</c:when>
			<c:otherwise>
				<div>1촌을 등록하세요!</div>
			</c:otherwise>
		</c:choose>
		<c:if test="${fn:length(mentorList) !=0 }">
			멘토 목록
			<c:forEach var = "mentolist" items="${mentorList }">
				<div style="margin-top: 2%;">
				<a>${mentolist.NAME }</a>
					<div style="position: absolute; background-color: white">
						<a>메시지 보내기</a><br>	
						<a href="${pageContext.request.contextPath }/mentordisconnect?cn=${mentolist.MENTOR_CONTACT_NO}">관계 끝내기</a>	
					</div>
				</div>
			</c:forEach>
		</c:if>
		<c:if test="${ login.mentor == 1 &&  fn:length(menteeList) !=0 }">
			멘티 목록
			<c:forEach var = "mentolist" items="${menteeList }">
				<div style="margin-top: 2%;">${mentolist.NAME }</div>
			</c:forEach>
		</c:if>
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