<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	.chat-list{
		float: left;
		width: 36%;
		height: 100%; 
	}
	.chat-list-header{
		font-weight: bold;
		padding: 4px;
	}
	.chat-list-footer{
		height: 100%; 
	}
	
	.chat-box{ 
		float: right;
		width: 64%;
		height: 100%;
	} 
	.chat-box-header{
		padding: 4px;
	}
	.chat-box-chat{
		border: 1px solid;
		height: 100%;
		
	}
	.chat-box-send{
		margin-bottom : 2%;
		position: absolute;
		bottom: 0;
	}
	
	.st-box{
		position: absolute;
		background-color: 
	}
	.chat-bean{
		padding-top: 3%; 
		padding-bottom: 3%; 
		cursor: pointer;
	}
	
				
</style>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.0/jquery.min.js" integrity="sha512-3gJwYpMe3QewGELv8k/BX9vcqhryRdzRMxVfq6ngyWXwo03GFEzjsUm8Q7RZcHPHksttq7/GFoxjCVUjkjvPdw==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/sockjs-client/1.1.5/sockjs.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<div style="bottom: 0; position: absolute; margin-left: 30%; width: 40%; height: 80%; border: 1px gray solid;">
			<div class="chat-list">
				<div class="chat-list-header">메세지<input onclick="pindUsr()" type = "button" value = "메세지쓰기"></div>
				<div class="chat-list-middle"><input type = "text" placeholder="메세지 검색"></div>
				<div class="chat-list-footer">
					<c:forEach var="list" items="${ChatList }">
						<div id = "Room${list.CHAT_ROOM_NO}" class="chat-bean" onclick="join(this)">
							<div>
								${list.TITLE }
							</div>
							<div>${list.NAME } : ${list.DETAIL} ${list.STAT == 0 ? '❗' : ''}</div>
							<div>${list.SENT }</div>
						</div>
					</c:forEach>
				</div> 
			</div>
			<div class="chat-box"> 
				<div id = "usr" class="chat-box-header">
					메신저
					<div id = "personprofile">
					</div>
				</div>
				<div id = "usrselect" class="chat-box-header" style="display: none">
					메세지 쓰기
					<div>
						<input id = "keywordF" type = "text" onkeyup="seUsr(this)">
						<div id = "stbox" class="st-box" style="background-color: #F3F2EF; border-radius: 6px;">
						</div>
					</div>
				</div>
				<div class="chat-box-chat">
					<div id = "chatDetail" style="height: 600px; overflow: auto;">
					</div>
					<div class="chat-box-send">
						<input type="text" id="message"/>
						<input type = "button" onclick="on()" value="send">
					</div>
				</div>
			</div>
		</div>
	</div>
<script type="text/javascript">
	let sock = new SockJS("http://${pageContext.request.serverName }:${pageContext.request.serverPort }${pageContext.request.contextPath }/echo");
	
	let sentId = null; // 
	let stEvent = false; // 처음 보내는 사람이냐
	
	let roomserver = null
	let member = null; //맴더를 다 데이터로 받아오기 뭐하니 맵으로 받아서 처리
	let my_other_no = null; // 보낸 사람이 나냐 판별을 위한
	
	let chatList = document.querySelector('.chat-list-footer');
	
	
	
	
	function on() {
		sendMessage();			
	}
	
	function pindUsr() {
		usr.style.display = 'none'; 
		usrselect.style.display = ''; 
		chatDetail.innerHTML = '';
		roomserver = null;
		member = null;
		my_other_no = null;
	}
	
	function stsending(t,id) {
		usrselect.style.display = 'none'; 
		usr.style.display = '';
		keywordF.value = '';
		stbox.innerHTML = '';
		
		personprofile.innerHTML = '';
		
		sentId = id;
		stEvent = true;
		let newDiv = document.createElement('div');
		newDiv.innerHTML = '<img style="border-radius: 100px" width="60px" alt="" src="https://static.licdn.com/sc/h/1c5u578iilxfi4m4dvc4q810q">'+t.innerText;
		personprofile.appendChild(newDiv);
	}
	
	
	
	
	function seUsr(t) {
		let s = t.value;
		if(s != ""){
			$.ajax({
				url:"${pageContext.request.contextPath}/usrList",
				data:{data:s},
				type:"post",
				success: function sc(su) {
					stbox.innerHTML = '';
					if(su.length != 0){
						su.forEach( s => {
							let newDiv = document.createElement('div');
							let newDivC = document.createElement('div');
							newDiv.setAttribute("onclick","stsending(this,'"+s.MEMBER_ID+"')");
							newDivC.innerText = s.D;
							
							newDiv.appendChild(newDivC);
							stbox.appendChild(newDiv);
							stbox.style.display = "";
						})
							return;
					}
				}
			})
		}
			stbox.style.display = "none";
	}
	
	
 	function join(t) {
 		usrselect.style.display = 'none';
 		no = t.id.substr(4);
 		usr.style.display = '';
 		$.ajax({
 			url:"${pageContext.request.contextPath}/joinRoomNo",
 			type:"post",
 			data:{key:no},
 			success: function sc(s) { 
				my_other_no = s.my_other_no;
				member = s.member;
				roomserver = no;
				
				let chat = s.chat;				
				
				chatDetail.innerHTML = '';
				
				chat.forEach( c => {
					let chatDiv = document.createElement('div');
					chatDiv.innerHTML = '<span><img style="margin-top: 2%; margin-bottom: 2%; border-radius: 100px" width="50px" alt="" src="https://static.licdn.com/sc/h/1c5u578iilxfi4m4dvc4q810q"><b style="vertical-align: top;">'+(c.CHAT_OTHER_NO == my_other_no ? '나' : member[c.CHAT_OTHER_NO])+'</b></span><span>'+(c.DETAIL == undefined ? '' : c.DETAIL)+'</span>'
					chatDetail.appendChild(chatDiv);
				$('#chatDetail').scrollTop($('#chatDetail').prop('scrollHeight'));
				})
			}
 		})
	}  
	
	
	
	
	
	
	
	
	
	
	
	
	function sendMessage() {
		if(roomserver != null || sentId != null){
			if(stEvent){
				$.ajax({
					url:"${pageContext.request.contextPath}/checkIfInsert",
					type:"post",
					data:{id:sentId},
					success: function sc() {
					    sock.send($("#message").val());
					    $('#message').val('');														
					}
				})	
			}else{
			    sock.send($("#message").val());
			    $('#message').val('');			
			}	
		}
		
		
	}
	
	
	
	sock.onmessage = function(e){
		let data = JSON.parse(e.data);
		let who = null;
		let trueServer = data.roomserver == roomserver
		
		if(trueServer){
			let chatDiv = document.createElement('div');
			chatDiv.innerHTML = '<span><img style="margin-top: 2%; margin-bottom: 2%; border-radius: 100px" width="50px" alt="" src="https://static.licdn.com/sc/h/1c5u578iilxfi4m4dvc4q810q"><b style="vertical-align: top;">'+(data.CHAT_OTHER_NO == my_other_no ? '나' : member[data.CHAT_OTHER_NO])+'</b></span><span>'+(data.DETAIL == undefined ? '' : data.DETAIL)+'</span>'
			chatDetail.appendChild(chatDiv);
				let chatTarget = document.querySelector('#Room'+data.roomserver);
				
				if(chatTarget != null){
					chatTarget.children[1].innerText = (data.CHAT_OTHER_NO == my_other_no ? '${login.first}${login.last}' : trueServer ? member[data.CHAT_OTHER_NO] : who.NAME)+" : "+data.DETAIL+" "+(trueServer ? '' : '❗');
				}else{
					let chatListDiv = document.createElement('div');
					chatListDiv.setAttribute("id", "Room"+data.roomserver);
					chatListDiv.setAttribute("class", "chat-bean");
					chatListDiv.setAttribute("onclick", "join(this)");
					chatListDiv.innerHTML = '<div>타이틀</div><div>'+who.NAME+' : ❗ </div><div>나중에</div>';
					chatList.appendChild(chatListDiv);
				} 
				     
				$('#chatDetail').scrollTop($('#chatDetail').prop('scrollHeight'));
		}else{
			$.ajax({
				url:"${pageContext.request.contextPath}/getOneOther",
				type:"POST",
				data:{key:data.CHAT_OTHER_NO},
				success: function sc(s) {
					who = s; 
					let chatTarget = document.querySelector('#Room'+data.roomserver);
					
					if(chatTarget != null){
						chatTarget.children[1].innerText = (data.CHAT_OTHER_NO == my_other_no ? '내이름' : trueServer ? member[data.CHAT_OTHER_NO] : who.NAME)+" : "+data.DETAIL+" "+(trueServer ? '' : '❗');
					}else{
						let chatListDiv = document.createElement('div');
						chatListDiv.setAttribute("id", "Room"+data.roomserver);
						chatListDiv.setAttribute("class", "chat-bean");
						chatListDiv.setAttribute("onclick", "join(this)");
						chatListDiv.innerHTML = '<div>타이틀</div><div>'+who.NAME+' : ❗ </div><div>나중에</div>';
						chatList.appendChild(chatListDiv);
					}
					
					$('#chatDetail').scrollTop($('#chatDetail').prop('scrollHeight'));
				}
			})
		}
	}
	
	function callback() {
		
	}
	
	sock.onclose = function(){
		console.log('연결종료')
	}
	
	/* /*<div id = "Room${list.CHAT_ROOM_NO}" class="chat-bean" onclick="join(this)">
							<div>
								${list.TITLE }
							</div>
							<div>${list.NAME } : ${list.DETAIL} ${list.STAT == 0 ? '❗' : ''}</div>
							<div>${list.SENT }</div>
						</div> */

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
</script>
</body>
</html>