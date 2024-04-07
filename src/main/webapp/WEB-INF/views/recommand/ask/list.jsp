<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>	<!-- date탸입 칼럼의 sysdate을 원하는 날짜 형태로 출력 -->
<style>
	#list{
		margin: 0 auto;
	}
</style>

<script type="text/javascript">		// 무한 스크롤 적용 예정
	<!-- 채용공고 검색 -->
	function check(f){
		if(f.type.value == "title"){
			var num_pattern = /^[0-9]{1,20}$/;
			
			if(f.word.value == "" || !num_pattern.test(f.word.value)){
				alert("채용공고 제목을 입력하세요");
				return false;
			}
		}else if(f.word.value == ""){
			alert("검색어를 입력하세요")
			return false;
		}else if(f.word.value == "locate"){
			var num_pattern = /^[0-9]{1,20}$/;
			
			if(f.word.value == "" || !num_pattern.test(f.word.value)){
				alert("근무지를 입력하세요");
				return false;
			}
		}
		return true;
	}
</script>
<%@ include file="/WEB-INF/views/cLayout/header.jsp" %>
	
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
		</aside>
	</div><!-- sidebar -->

						
	<div class="col-lg-6">
	<div class="central-meta">
	<div class="editing-info">
	
		<h5 class="f-title"><i class="ti-info-alt"></i>추천서 요청 리스트 (나 > 수신인)</h5>
			<div>
				<table>
					<c:choose>						
						<c:when test="${alist == null }">	<!-- controller에서 list의 데이터를 뽑아 쓰기 위해 사용하는 코드 -->
							<tr>
								<td colspan="11">
									<span style="font-weight: bold;">요청한 추천서가 없다요</span>
								</td>
							</tr>
						</c:when>
						<c:otherwise>
							<c:forEach var="vo" items="${alist }">					
								<tr>
									<td><strong>수신인</strong></td>
									<td>${vo.TO_MEMBER } ( ${vo.RELATION } )</td>
								</tr>
								<tr>	
									<!-- 특정 길이 이후는 짤리게 출력 -->
									<td><strong>요청 사항</strong></td>											
									<td><a href="${pageContext.request.contextPath }/recommand/ask_content?no=${vo.REC_ASK_ID }">${vo.CONTENT }</a></td>
								</tr>
								<tr>			
									<td><strong>요청일</strong></td>
									<td><fmt:formatDate value="${vo.ASK_DATE }" pattern="yyyy-MM-dd"/></td> 
								</tr>
								<td>
									<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/recommand/ask_updateform?no=${vo.REC_ASK_ID }'">
									<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/recommand/ask_delete?no=${vo.REC_ASK_ID  }'">
								</td>
							</c:forEach>
						</c:otherwise>
					</c:choose>
				</table>
			</div>
			<br>
			<br>
	
	<h5 class="f-title"><i class="ti-info-alt"></i>추천서 완료 리스트 (수신인 > 나)</h5>
		<div>
			<table>
			<c:choose>						
				<c:when test="${flist == null }">	<!-- controller에서 list의 데이터를 뽑아 쓰기 위해 사용하는 코드 -->
					<tr>
						<td colspan="11">
							<span style="font-weight: bold;">완료된 추천서가 없습니다</span>
						</td>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach var="vo" items="${flist }">					
						<tr>
							<td><strong>작성자</strong></td>
							<td>${vo.TO_MEMBER } (${vo.RELATION })</td>
						</tr>
						<tr>
							<td><strong>요청 사항</strong></td>
							<td>${vo.CONTENT}</td>
						</tr>
						<tr>												
							<!-- 특정 길이 이후는 짤리게 출력 -->
							<td><strong>추천 내용</strong></td>
							<td><a href="${pageContext.request.contextPath }/recommand/form_content?no=${vo.REC_FORM_ID }">${vo.DETAIL }</a></td>
						</tr>
						<tr>
							<td><strong>요청일</strong></td>
							<td><fmt:formatDate value="${vo.FORM_DATE }" pattern="yyyy-MM-dd"/></td> 
						</tr>
						<td>
							<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/recommand/form_delete?no=${vo.REC_FORM_ID  }'">
						</td>
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</table>
		</div>
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
		</aside>
	</div><!-- sidebar -->
	</div>	
	</div>
	</div>
	</div>
	</div>	
</section>

<%@ include file="/WEB-INF/views/layout/footer.jsp" %>	