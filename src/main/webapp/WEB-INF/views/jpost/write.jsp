<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/cLayout/header.jsp" %>
<script type="text/javascript">
	function checkWrite(){
		if(document.jpost_write.title.value == ""){
			alert("'채용공고 제목'란을 채워주세요");
			<!-- date 타입은 어떻게 체크하는지?? -->
		}else if(document.jpost_write.howto.value == ""){
			alert("'링크'란을 채워주세요");
		}else if(document.jpost_write.jarea_cno.value == 0){
			alert("'고용 직군'란을 채워주세요");
		}else if(document.jpost_write.worktime_cno.value == 0){
			alert("'근무 시간'란을 채워주세요");
		}else if(document.jpost_write.empl_type_cno.value == 0){
			alert("'고용 형태'란을 채워주세요");
		}else if(document.jpost_write.posi_cno.value == 0){
			alert("'고용 직급'란을 채워주세요");
		}else if(document.jpost_write.lv_cno.value == 0){
			alert("'경력'란을 채워주세요");
		}else if(document.jpost_write.school_cno.value == 0){
			alert("'교육'란을 채워주세요");
		}else if(document.jpost_write.type.value == ""){
			alert("'근무 형태'란을 채워주세요");
		}else if(document.jpost_write.task.value == ""){
			alert("'모집 주요 업무'란을 채워주세요");
		}else if(document.jpost_write.salary.value == ""){
			alert("'연봉'란을 채워주세요");
		}else if(document.jpost_write.locate.value == ""){
			alert("'근무지'란을 채워주세요");
		}else if(document.jpost_write.detail.value == ""){
			alert("'상세 내용'란을 채워주세요");
		}else{
			document.jpost_write.submit();
		}
	}
	
	function showUrl(t){ // 이벤트 발동조건 셀렉터의 값이 1인 경우에...디스 플레이 논 해제
		//var action = $("#selectHow option:selected").val();
		console.log(t.value);
		// = 	대입 연산자
		// ==	비교 연산자
		if(t.value == 1){
			console.log('1입니다.');
			document.querySelector("#imUrl").style.display = '';
		}else{
			console.log('1이 아닙니다');
			document.querySelector("#imUrl").style.display = 'none';
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
									</div><!-- Shortcuts -->
									<div class="widget">
										<h4 class="widget-title">Recent Activity</h4>
										<ul class="activitiez">
											<li>
												<div class="activity-meta">
													<i>10 hours Ago</i>
													<span><a href="#" title="">Commented on Video posted </a></span>
													<h6>by <a href="time-line.html">black demon.</a></h6>
												</div>
											</li>
											<li>
												<div class="activity-meta">
													<i>30 Days Ago</i>
													<span><a href="#" title="">Posted your status. “Hello guys, how are you?”</a></span>
												</div>
											</li>
											<li>
												<div class="activity-meta">
													<i>2 Years Ago</i>
													<span><a href="#" title="">Share a video on her timeline.</a></span>
													<h6>"<a href="#">you are so funny mr.been.</a>"</h6>
												</div>
											</li>
										</ul>
									</div><!-- recent activites -->
									<div class="widget stick-widget">
										<h4 class="widget-title">Who's follownig</h4>
										<ul class="followers">
											<li>
												<figure><img src="resources/images/resources/friend-avatar2.jpg" alt=""></figure>
												<div class="friend-meta">
													<h4><a href="time-line.html" title="">Kelly Bill</a></h4>
													<a href="#" title="" class="underline">Add Friend</a>
												</div>
											</li>
											<li>
												<figure><img src="resources/images/resources/friend-avatar4.jpg" alt=""></figure>
												<div class="friend-meta">
													<h4><a href="time-line.html" title="">Issabel</a></h4>
													<a href="#" title="" class="underline">Add Friend</a>
												</div>
											</li>
											<li>
												<figure><img src="resources/images/resources/friend-avatar6.jpg" alt=""></figure>
												<div class="friend-meta">
													<h4><a href="time-line.html" title="">Andrew</a></h4>
													<a href="#" title="" class="underline">Add Friend</a>
												</div>
											</li>
											<li>
												<figure><img src="resources/images/resources/friend-avatar8.jpg" alt=""></figure>
												<div class="friend-meta">
													<h4><a href="time-line.html" title="">Sophia</a></h4>
													<a href="#" title="" class="underline">Add Friend</a>
												</div>
											</li>
											<li>
												<figure><img src="resources/images/resources/friend-avatar3.jpg" alt=""></figure>
												<div class="friend-meta">
													<h4><a href="time-line.html" title="">Allen</a></h4>
													<a href="#" title="" class="underline">Add Friend</a>
												</div>
											</li>
										</ul>
									</div><!-- who's following -->
								</aside>
							</div><!-- sidebar -->
							<div class="col-lg-6">
								<div class="central-meta">
									<div class="editing-info">
										<h5 class="f-title"><i class="ti-info-alt"></i> 채용공고</h5>
										<form action="${pageContext.request.contextPath }/jpost/write" method="post" name="jpost_write">
											<div class="form-group">	
												<input type="text" name="title" required="required"/>
												<label class="control-label" for="input">채용 공고 제목</label><i class="mtrl-select"></i>
											</div>
											<div class="form-group half">	
<!-- 											<input type="text" id="input" required="required"/> -->
											  	<select name="howto" id="selectHow" onchange="showUrl(this)">
													<option value="" selected disabled>지원자 접수 방법</option>	
													<option value="0">즉시지원</option>
													<option value="1">홈페이지 지원</option>	<!-- 홈페이지 지원일 경우, 기업 HP의 채용 페이지 기입 -->
												</select>									<!-- ㄴ 유저가 해당 채용공고의 '홈페이지 지원' 클릭시, 기업 HP의 채용 페이지로 이동 -->
											</div>
											<div class="form-group" id="imUrl" style="display: none">	 
											  	<input type="url" name="url">
											  	<label class="control-label" for="input">링크 >> 입력한 데이터가 고정이 안됨</label><i class="mtrl-select"></i>
											</div>
											
											<div class="form-group">	
											  	<input type="date" name="start_date" required="required"/>
											  	<label class="control-label" for="input">지원 시작일</label><i class="mtrl-select"></i>		<!-- D-5 구현 -->
											</div>
											<div class="form-group">	
											  	<input type="date" name="end_date" required="required"/>
											  	<label class="control-label" for="input">지원 종료일</label><i class="mtrl-select"></i>		<!-- 종료일은 시작일보다 빠를 수 없게 -->
											</div>			
											<!-- 고용직군 -->
											<div class="form-group">
												<select name="jarea_cno" required="required">
													<c:forEach var="i" items="${jlist }">
														<option value="${i.jarea_cno }">${i.jarea_type }</option>
													</c:forEach>
												</select>
												<label class="control-label" for="input">고용 직군</label><i class="mtrl-select"></i>
											</div>
											<!-- 근무 시간 -->
											<div class="form-group">	
												<select name="worktime_cno">
													<c:forEach var="i" items="${wlist }">
														<option value="${i.worktime_cno }">${i.worktime_type }</option>
													</c:forEach>
												</select>
												<label class="control-label" for="input">근무 시간</label><i class="mtrl-select"></i>
											</div>
 											<!-- 고용 형태 -->
											<div class="form-group">	
												<select name="empl_type_cno">
												<c:forEach var="i" items="${elist }">
														<option value="${i.empl_type_cno }">${i.empl_type }</option>
													</c:forEach>
												</select>
												<label class="control-label" for="input">고용 형태</label><i class="mtrl-select"></i>
											</div>
											<!-- 고용 직급 -->
											<div class="form-group">	
												<select name="posi_cno">
												<c:forEach var="i" items="${plist }">
														<option value="${i.posi_cno }">${i.posi_type }</option>
													</c:forEach>
												</select>
												<label class="control-label" for="input">고용 직급</label><i class="mtrl-select"></i>
											</div>
											<!-- 경력 -->
											<div class="form-group">	
												<select name="lv_cno">
												<c:forEach var="i" items="${llist }">
														<option value="${i.lv_cno }">${i.lv_type }</option>
													</c:forEach>
												</select>
												<label class="control-label" for="input">경력</label><i class="mtrl-select"></i>
											</div>
											<!-- 교육 -->
											<div class="form-group">	
												<select name="school_cno">
												<c:forEach var="i" items="${slist }">
														<option value="${i.school_cno }">${i.school_type }</option>
													</c:forEach>
												</select>
												<label class="control-label" for="input">교육</label><i class="mtrl-select"></i>
											</div>
											<!-- 근무 형태 -->
											<div class="form-group half">	
											  	<select name="type">
													<option value="" selected disabled>근무 형태를 선택하세요</option>
													<option value="1">대면</option>
													<option value="2">비대면</option>
													<option value="3">복합</option>
												</select>
												<label class="control-label" for="input">근무 형태</label><i class="mtrl-select"></i>
											</div>
											<div class="form-group">	
											  	<input type="text" name="task" required="required"/>
											  	<label class="control-label" for="input">주요 업무</label><i class="mtrl-select"></i>
											</div>
											<div class="form-group">	
											  	<input type="text" name="salary" required="required"/>
											  	<label class="control-label" for="input">연봉</label><i class="mtrl-select"></i>
											</div>
											<div class="form-group">	
												<input type="text" name="locate" required="required"/>
											 	<label class="control-label" for="input">근무지</label><i class="mtrl-select"></i>
											</div>
											<div class="form-group">	
											  	<textarea rows="4" id="textarea" name="detail" required="required"></textarea>
											  	<label class="control-label" for="textarea">상세 내용</label><i class="mtrl-select"></i>
											</div>
											<div class="form-group">	
											  	<input type="file" name="file_name"/>
											  	<label class="control-label" for="input">첨부파일</label><i class="mtrl-select"></i>
											</div>

											
											<h5 class="f-title ext-margin"><i class="ti-share"></i> SNS 계정</h5>
											<div class="form-group">	
											  <input type="text" required="required"/>
											  <label class="control-label" for="input"><i class="fa fa-facebook-square"></i> Facebook</label><i class="mtrl-select"></i>
											</div>
											<div class="form-group">	
											  <input type="text" required="required"/>
											  <label class="control-label" for="input"><i class="fa fa-twitter-square"></i> Twitter</label><i class="mtrl-select"></i>
											</div>
											<div class="form-group">	
											  <input type="text" required="required"/>
											  <label class="control-label" for="input"><i class="fa fa-google-plus-square"></i> Google Plus</label><i class="mtrl-select"></i>
											</div>
											<div class="form-group">	
											  <input type="text" required="required"/>
											  <label class="control-label" for="input"><i class="fa fa-rss-square"></i> RSS</label><i class="mtrl-select"></i>
											</div>
											<div class="form-group">	
											  <input type="text" required="required"/>
											  <label class="control-label" for="input"><i class="fa fa-instagram"></i> Instagram</label><i class="mtrl-select"></i>
											</div>
											
											<div class="submit-btns">
												<button type="button" class="mtr-btn"><span>Cancel</span></button>
												<button type="button" class="mtr-btn" onclick="javascript:checkWrite()"><span>Save</span></button>
											</div>
										</form>
									</div>
								</div>	
							</div><!-- centerl meta -->
							<div class="col-lg-3">
								<aside class="sidebar static">
									<div class="widget">
										<h4 class="widget-title">Your page</h4>	
										<div class="your-page">
											<figure>
												<a href="#" title=""><img src="resources/images/resources/friend-avatar9.jpg" alt=""></a>
											</figure>
											<div class="page-meta">
												<a href="#" title="" class="underline">My page</a>
												<span><i class="ti-comment"></i><a href="insight.html" title="">Messages <em>9</em></a></span>
												<span><i class="ti-bell"></i><a href="insight.html" title="">Notifications <em>2</em></a></span>
											</div>
											<div class="page-likes">
												<ul class="nav nav-tabs likes-btn">
													<li class="nav-item"><a class="active" href="#link1" data-toggle="tab">likes</a></li>
													 <li class="nav-item"><a class="" href="#link2" data-toggle="tab">views</a></li>
												</ul>
												<!-- Tab panes -->
												<div class="tab-content">
												  <div class="tab-pane active fade show " id="link1" >
													<span><i class="ti-heart"></i>884</span>
													  <a href="#" title="weekly-likes">35 new likes this week</a>
													  <div class="users-thumb-list">
														<a href="#" title="Anderw" data-toggle="tooltip">
															<img src="resources/images/resources/userlist-1.jpg" alt="">  
														</a>
														<a href="#" title="frank" data-toggle="tooltip">
															<img src="resources/images/resources/userlist-2.jpg" alt="">  
														</a>
														<a href="#" title="Sara" data-toggle="tooltip">
															<img src="resources/images/resources/userlist-3.jpg" alt="">  
														</a>
														<a href="#" title="Amy" data-toggle="tooltip">
															<img src="resources/images/resources/userlist-4.jpg" alt="">  
														</a>
														<a href="#" title="Ema" data-toggle="tooltip">
															<img src="resources/images/resources/userlist-5.jpg" alt="">  
														</a>
														<a href="#" title="Sophie" data-toggle="tooltip">
															<img src="resources/images/resources/userlist-6.jpg" alt="">  
														</a>
														<a href="#" title="Maria" data-toggle="tooltip">
															<img src="resources/images/resources/userlist-7.jpg" alt="">  
														</a>  
													  </div>
												  </div>
												  <div class="tab-pane fade" id="link2" >
													  <span><i class="ti-eye"></i>440</span>
													  <a href="#" title="weekly-likes">440 new views this week</a>
													  <div class="users-thumb-list">
														<a href="#" title="Anderw" data-toggle="tooltip">
															<img src="resources/images/resources/userlist-1.jpg" alt="">  
														</a>
														<a href="#" title="frank" data-toggle="tooltip">
															<img src="resources/images/resources/userlist-2.jpg" alt="">  
														</a>
														<a href="#" title="Sara" data-toggle="tooltip">
															<img src="resources/images/resources/userlist-3.jpg" alt="">  
														</a>
														<a href="#" title="Amy" data-toggle="tooltip">
															<img src="resources/images/resources/userlist-4.jpg" alt="">  
														</a>
														<a href="#" title="Ema" data-toggle="tooltip">
															<img src="resources/images/resources/userlist-5.jpg" alt="">  
														</a>
														<a href="#" title="Sophie" data-toggle="tooltip">
															<img src="resources/images/resources/userlist-6.jpg" alt="">  
														</a>
														<a href="#" title="Maria" data-toggle="tooltip">
															<img src="resources/images/resources/userlist-7.jpg" alt="">  
														</a>  
													  </div>
												  </div>
												</div>
											</div>
										</div>
									</div><!-- page like widget -->
									<div class="widget">
										<div class="banner medium-opacity bluesh">
											<div class="bg-image" style="background-image: url(resources/images/resources/baner-widgetbg.jpg)"></div>
											<div class="baner-top">
												<span><img alt="" src="resources/images/book-icon.png"></span>
												<i class="fa fa-ellipsis-h"></i>
											</div>
											<div class="banermeta">
												<p>
													create your own favourit page.
												</p>
												<span>like them all</span>
												<a data-ripple="" title="" href="#">start now!</a>
											</div>
										</div>											
									</div>
									<div class="widget friend-list stick-widget">
										<h4 class="widget-title">Friends</h4>
										<div id="searchDir"></div>
										<ul id="people-list" class="friendz-list">
											<li>
												<figure>
													<img src="resources/images/resources/friend-avatar.jpg" alt="">
													<span class="status f-online"></span>
												</figure>
												<div class="friendz-meta">
													<a href="time-line.html">bucky barnes</a>
													<i><a href="https://wpkixx.com/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="f2859b9c869780819d9e969780b2959f939b9edc919d9f">[email&#160;protected]</a></i>
												</div>
											</li>
											<li>
												<figure>
													<img src="resources/images/resources/friend-avatar2.jpg" alt="">
													<span class="status f-away"></span>
												</figure>
												<div class="friendz-meta">
													<a href="time-line.html">Sarah Loren</a>
													<i><a href="https://wpkixx.com/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="ea888b98848f99aa8d878b8386c4898587">[email&#160;protected]</a></i>
												</div>
											</li>
											<li>
												<figure>
													<img src="resources/images/resources/friend-avatar3.jpg" alt="">
													<span class="status f-off"></span>
												</figure>
												<div class="friendz-meta">
													<a href="time-line.html">jason borne</a>
													<i><a href="https://wpkixx.com/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="2d474c5e42434f6d4a404c4441034e4240">[email&#160;protected]</a></i>
												</div>
											</li>
											<li>
												<figure>
													<img src="resources/images/resources/friend-avatar4.jpg" alt="">
													<span class="status f-off"></span>
												</figure>
												<div class="friendz-meta">
													<a href="time-line.html">Cameron diaz</a>
													<i><a href="https://wpkixx.com/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="6802091b07060a280f05090104460b0705">[email&#160;protected]</a></i>
												</div>
											</li>
											<li>
												
												<figure>
													<img src="resources/images/resources/friend-avatar5.jpg" alt="">
													<span class="status f-online"></span>
												</figure>
												<div class="friendz-meta">
													<a href="time-line.html">daniel warber</a>
													<i><a href="https://wpkixx.com/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="4e242f3d21202c0e29232f2722602d2123">[email&#160;protected]</a></i>
												</div>
											</li>
											<li>
												
												<figure>
													<img src="resources/images/resources/friend-avatar6.jpg" alt="">
													<span class="status f-away"></span>
												</figure>
												<div class="friendz-meta">
													<a href="time-line.html">andrew</a>
													<i><a href="https://wpkixx.com/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="1872796b77767a587f75797174367b7775">[email&#160;protected]</a></i>
												</div>
											</li>
											<li>
												
												<figure>
													<img src="resources/images/resources/friend-avatar7.jpg" alt="">
													<span class="status f-off"></span>
												</figure>
												<div class="friendz-meta">
													<a href="time-line.html">amy watson</a>
													<i><a href="https://wpkixx.com/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="711b10021e1f1331161c10181d5f121e1c">[email&#160;protected]</a></i>
												</div>
											</li>
											<li>
												
												<figure>
													<img src="resources/images/resources/friend-avatar5.jpg" alt="">
													<span class="status f-online"></span>
												</figure>
												<div class="friendz-meta">
													<a href="time-line.html">daniel warber</a>
													<i><a href="https://wpkixx.com/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="234942504c4d4163444e424a4f0d404c4e">[email&#160;protected]</a></i>
												</div>
											</li>
											<li>
												
												<figure>
													<img src="resources/images/resources/friend-avatar2.jpg" alt="">
													<span class="status f-away"></span>
												</figure>
												<div class="friendz-meta">
													<a href="time-line.html">Sarah Loren</a>
													<i><a href="https://wpkixx.com/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="d5b7b4a7bbb0a695b2b8b4bcb9fbb6bab8">[email&#160;protected]</a></i>
												</div>
											</li>
										</ul>
										
									</div><!-- friends list sidebar -->
								</aside>
							</div><!-- sidebar -->
						</div>	
					</div>
				</div>
			</div>
		</div>	
	</section>
</div>
<%@ include file = "/WEB-INF/views/cLayout/footer.jsp" %>