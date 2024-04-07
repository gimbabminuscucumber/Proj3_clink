<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/cLayout/header.jsp" %>
<script type="text/javascript">
	var cnt = 0;

	const addForm = () => {
		const box = document.getElementById("box");
		const newP = document.createElement('p');
		
		if(cnt < 4){
			/* newP.innerHTML = "<div>자기소개서 제목<input type='text' name='title' placeholder='최대 100자까지 입력가능'></div><div>자기소개서 내용<textarea rows='15' cols='65' name='detail' placeholder='최대 1,333자까지 입력가능'></textarea></div><input type='button' value='삭제' onclick='remove(this)'>" */
			
			newP.innerHTML ="<div id='resume'><div class='form-group'><input type='text' name='title' required='required'/><label class='control-label' for='input'>제목</label><i class='mtrl-select'></i></div><div class='form-group'><textarea rows='4' id='textarea' name='detail' required='required'></textarea><label class='control-label' for='textarea'>상세 내용</label><i class='mtrl-select'></i></div></div><input type='button' value='삭제' onclick='remove(this)'>" 
			
			
			box.appendChild(newP);
			cnt += 1;
			console.log(cnt);
		}else{
			console.log("5개 이상 생성할 수 없습니다.");
			alert("5개 이상 생성할 수 없습니다.");
			return false;
		}
	}
	const remove = (obj) =>{
		document.getElementById('box').removeChild(obj.parentNode);
		cnt -=1;
		console.log(cnt);
	}

	function checkWrite(){
		if(document.apply.title.value == ""){
			alert("'제목'란을 채워주세요");
		}else if(document.apply.detail.value == ""){
			alert("'내용'란을 채워주세요");
		}else{
			document.apply.submit();
		}
	}
</script>

<section>
	<div class="gap gray-bg">
	<div class="container-fluid">
	<div class="row">
	<div class="col-lg-12">
	<div class="row" id="page-contents">
		<div class="col-lg-3">
			<aside class="sidebar static">
			<!-- 좌측 SHORTCUTS -->
			<div class="widget">
				<h4 class="widget-title">Shortcuts</h4>
				<ul class="naves">
					<li>
						<i class="ti-clipboard"></i>
						<a href="newsfeed.html" title="">News feed</a>
					</li>
					<li>
						<i class="ti-mouse-alt"></i>
						<a href="inbox.html" title="">Inbox</a>
					</li>
					<li>
						<i class="ti-files"></i>
						<a href="fav-page.html" title="">My pages</a>
					</li>
					<li>
						<i class="ti-user"></i>
						<a href="timeline-friends.html" title="">friends</a>
					</li>
					<li>
						<i class="ti-image"></i>
						<a href="timeline-photos.html" title="">images</a>
					</li>
					<li>
						<i class="ti-video-camera"></i>
						<a href="timeline-videos.html" title="">videos</a>
					</li>
					<li>
						<i class="ti-comments-smiley"></i>
						<a href="messages.html" title="">Messages</a>
					</li>
					<li>
						<i class="ti-bell"></i>
						<a href="notifications.html" title="">Notifications</a>
					</li>
					<li>
						<i class="ti-share"></i>
						<a href="people-nearby.html" title="">People Nearby</a>
					</li>
					<li>
						<i class="fa fa-bar-chart-o"></i>
						<a href="insights.html" title="">insights</a>
					</li>
					<li>
						<i class="ti-power-off"></i>
						<a href="landing.html" title="">Logout</a>
					</li>
				</ul>
			</div>
			<!-- Shortcuts 끝 -->
			</aside>
			<!-- 좌측 sidebar 끝-->
		</div>
		
	<!-- 이력서 작성란 -->						
	<div class="col-lg-6">
	<div class="central-meta">
<!-- 	<div class="editing-info"> -->
		<h5 class="f-title"><i class="ti-info-alt"></i> 이력서 작성</h5>
		
		<form action="${pageContext.request.contextPath }/apply/write" method="post" name="apply">
			<div id="resume">
				<div class="form-group">
					<input type="text" name="title" required="required"/>
					<label class="control-label" for="input">제목</label><i class="mtrl-select"></i>
				</div>	
				<div class="form-group">	
				  	<textarea rows="4" id="textarea" name="detail" required="required"></textarea>
				  	<label class="control-label" for="textarea">상세 내용</label><i class="mtrl-select"></i>
				</div>
			</div>
		</form>
		<div id="box">
			<input type="button" value="추가" onclick="addForm()">
			<input type="button" value="저장"	 onclick="javascript:checkWrite()">
		</div>
	</div>
			<!-- <table>
				<tr>
					<th>제목</th><td><input type="text" name="title" placeholder="최대 100자까지 입력가능">
				</tr>
				<tr>
					<th>내용</th><td><textarea rows="5" cols="65" name="detail" placeholder="최대 1,333자까지 입력가능"></textarea>
				</tr>
			</table> -->
	</div>
	</div>
	</div>
					
					
				<!-- 
				<div>자기소개서 제목
					<input type="text" name="title" placeholder="최대 100자까지 입력가능">
				</div>
				<div>자기소개서 내용
					<textarea rows="15" cols="65" name="detail" placeholder="최대 1,333자까지 입력가능"></textarea>
				</div>
				<div id="box">
					<input type="button" value="추가" onclick="addForm()">
					<input type="submit" value="저장하기">
				</div>
				<div>입력하는 length를 실시간으로 표기 '14/1,333'</div> 
				-->
		
	</div>	
	</div>
	</div>
	</div>
</section>

<%@ include file="/WEB-INF/views/layout/footer.jsp" %>
