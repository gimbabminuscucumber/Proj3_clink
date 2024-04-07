<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
	
		<h5 class="f-title"><i class="ti-info-alt"></i>작성한 이력서</h5>
		<div class="apply-bttons">	
			<a href="${pageContext.request.contextPath}/apply/writeform" title=""> 이력서 작성 </a>
		</div>
		<form action="${pageContext.request.contextPath }/jpost/write" method="post" name="jpost_write">
			<c:set var="cpath" value="${pageContext.request.contextPath	}"/>
			<div>
				<table>
					<c:choose>	
						<c:when test="${applyList == null }">	<!-- controller에서 list의 데이터를 뽑아 쓰기 위해 사용하는 코드 -->
							<tr>
								<td colspan="11">
									<span style="font-weight: bold;">작성한 이력서가 없다요</span>
								</td>
							</tr>
						</c:when>
						
						<c:otherwise>
							<c:forEach var="vo" items="${applyList }">					
								<tr>												
									<th>지원서 제목</th>
									<td><a href="${pageContext.request.contextPath }/apply/content?no=${vo.APPLY_ID }">${vo.TITLE }</a></td>
								</tr>
								<tr>												
									<th>지원서 내용</th>
									<td>${vo.DETAIL }</td>
								</tr>
								<tr>
									<th>작성일</th>
									<td><fmt:formatDate value="${vo.APPLY_DATE }" pattern="yyyy-MM-dd"/></td> 
								</tr>
								<table>
									<tr>
										<th>
											<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/apply/updateform?no=${vo.APPLY_ID }'">
											<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/apply/hidden?no=${vo.APPLY_ID }'">
											<input type="button" value="PDF로 받기">
										</th>
									<tr>
								</table>
							</c:forEach>
						</c:otherwise>
					</c:choose>
				</table>
			</div>
		</form>
	</div>
	</div>	
	</div>
	
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