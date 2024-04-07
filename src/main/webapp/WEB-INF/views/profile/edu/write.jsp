<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/cLayout/header.jsp" %>
<script type="text/javascript">
	function checkWrite(){
		if(document.write.school.value == ""){
			alert("'학교명'란을 채워주세요");
		}else if(document.write.stat.value == ""){
			alert("'재학 상태'란을 채워주세요");
		}else if(document.write.degree.value == ""){
			alert("'학위'란을 채워주세요");
		}else if(document.write.major.value == ""){
			alert("'전공'란을 채워주세요");
		}else if(document.write.gpa.value == ""){
			alert("'학점'란을 채워주세요");
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
		<h5 class="f-title"><i class="ti-info-alt"></i> 학력 작성</h5>
		<form action="${pageContext.request.contextPath }/profile/edu_write" method="post" name="write">
			<div id="edu">
				<div class="form-group">
					<input type="text" name="school" required="required"/>
					<label class="control-label" for="input">학교명</label><i class="mtrl-select"></i>
				</div>	
				<div class="form-group">
					<label class="control-label" for="input"></label><i class="mtrl-select"></i>
					<select name="stat" required="required" >
						<option value="" selected disabled>재학 상태를 선택하세요</option>
						<option value="0">재학</option>
						<option value="1">휴학</option>
						<option value="2">졸업</option>
					</select>
				</div>	
				<div class="form-group">
					<label class="control-label" for="input"></label><i class="mtrl-select"></i>
					<select name="degree" required="required" >
						<option value="" selected disabled>학위를 선택하세요</option>
						<option value="0">전문학사</option>
						<option value="1">학사</option>
						<option value="2">전문석사</option>
						<option value="3">석사</option>
						<option value="4">전문박사</option>
						<option value="5">박사</option>
					</select>
				</div>
				<div class="form-group">
					<input type="text" name="major" required="required"/>
					<label class="control-label" for="input">전공(학/학과)</label><i class="mtrl-select"></i>
				</div>	
				<div class="form-group">
					<input type="text" name="gpa" required="required"/>
					<label class="control-label" for="input">학점</label><i class="mtrl-select"></i>
				</div>	
				
					
			</div>
		</form>
		<div id="box">
			<input type="button" value="저장"	 onclick="javascript:checkWrite()">
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
