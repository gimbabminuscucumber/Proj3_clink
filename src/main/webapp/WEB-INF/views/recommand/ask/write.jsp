<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/cLayout/header.jsp" %>
<script type="text/javascript">
	function checkWrite(){
		if(document.write.content.value == ""){
			alert("'요청 사항'란을 채워주세요");
		}else if(document.write.to_member.value == ""){
			alert("'요청하실 인물'란을 채워주세요");
		}else{
			document.write.submit();
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
		<h5 class="f-title"><i class="ti-info-alt"></i>추천서 요청</h5>
		<form action="${pageContext.request.contextPath }/recommand/ask_write" method="post" name="write">
			<div>
				<div class="form-group">
					<input type="text" name="content" required="required"/>
					<label class="control-label" for="input">부탁하는 말 남기기</label><i class="mtrl-select"></i>
				</div>	
				<div class="form-group">
					<input type="text" name="to_member" required="required"/>
					<label class="control-label" for="input">누구에게 부탁하시겠어요?</label><i class="mtrl-select"></i>
				</div>	
				<div class="form-group">
					<label class="control-label"for="input"></label><i class="mtrl-select"></i>
					<select name="relation_no">
						<c:forEach var="i" items="${rlist }">
							<option value="${i.relation_no }">${i.relation }</option>
						</c:forEach>
					</select>
				</div>	
			</div>
		</form>
		<div id="box">
			<button type="submit" class="btn btn-default"onclick="javascript:checkWrite()">요청하기</button>	
		</div>
	</div>
	</div>
	</div>
	</div>
	</div>	
	</div>
	</div>
	</div>
</section>

<%@ include file="/WEB-INF/views/layout/footer.jsp" %>