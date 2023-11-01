<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/cLayout/setting.jsp" %> 
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="" />
    <meta name="keywords" content="" />
	<title>Clink we linked career</title>
	<c:set var="finalPath" value="http://${pageContext.request.serverName }:${pageContext.request.serverPort }${pageContext.request.contextPath }/"></c:set>
    <link rel="icon" href="images/fav.png" type="image/png" sizes="16x16"> 
    <link rel="stylesheet" href="${finalPath }resources/css/main.min.css">
    <link rel="stylesheet" href="${finalPath }resources/css/style.css">
    <link rel="stylesheet" href="${finalPath }resources/css/color.css"> 
    <link rel="stylesheet" href="${finalPath }resources/css/responsive.css">
</head>
<body>
<!--<div class="se-pre-con"></div>-->
<div class="theme-layout">
	<div class="responsive-header">
		<div class="mh-head first Sticky">
			<span class="mh-btns-left">
				<a class="" href="#menu"><i class="fa fa-align-justify"></i></a>
			</span>
			<span class="mh-text">
				<a href="newsfeed.html" title=""><img src="${finalPath}resources/images/logo2.png" alt=""></a>
			</span>
			<span class="mh-btns-right">
				<a class="fa fa-sliders" href="#shoppingbag"></a>
			</span>
		</div>
		<div class="mh-head second">
			<form class="mh-form">
				<input placeholder="search" />
				<a href="#/" class="fa fa-search"></a>
			</form>
		</div>
		<nav id="menu" class="res-menu">
			<ul>
				<li><span>기업명</span>
					<ul>
						<li><a href="#" title="">비즈니스 프로필</a></li>
						<li><a href="#" title="">담당자 등록</a></li>
						<li><a href="#" title="">부서 및 직책 관리</a></li>
						<li><a href="#" title="">기업 계정 활동로그</a></li>
					</ul>
				</li>
				<li><span>채용공고</span>
					<ul>
						<li><a href="#" title="">채용공고 등록</a></li>
						<li><a href="#" title="">사전평가 등록</a></li>
						<li><a href="#" title="">채용공고 관리</a></li>
						<li><a href="#" title="">사전평가 관리</a></li>	
						<li><a href="#" title="">자기소개서 양식 관리</a></li>		
					</ul>
				</li>
				<li><span>뉴스레터</span>
					<ul>
						<li><a href="#" title="">뉴스레터 발행</a></li>
						<li><a href="#" title="">뉴스레터 관리</a></li>
					</ul>
				</li>
				<li><span>More pages</span>
					<ul>
						<li><a href="#" title="">회사소개</a></li>
						<li><a href="#" title="">회사 상품 판매</a></li>
					</ul>
				</li>
			</ul>
		</nav>
		<nav id="shoppingbag">
			<div>
				<div class="">
					<form method="post">
						<div class="setting-row">
							<span>use night mode</span>
							<input type="checkbox" id="nightmode"/> 
							<label for="nightmode" data-on-label="ON" data-off-label="OFF"></label>
						</div>
						<div class="setting-row">
							<span>Notifications</span>
							<input type="checkbox" id="switch2"/> 
							<label for="switch2" data-on-label="ON" data-off-label="OFF"></label>
						</div>
						<div class="setting-row">
							<span>Notification sound</span>
							<input type="checkbox" id="switch3"/> 
							<label for="switch3" data-on-label="ON" data-off-label="OFF"></label>
						</div>
						<div class="setting-row">
							<span>My profile</span>
							<input type="checkbox" id="switch4"/> 
							<label for="switch4" data-on-label="ON" data-off-label="OFF"></label>
						</div>
						<div class="setting-row">
							<span>Show profile</span>
							<input type="checkbox" id="switch5"/> 
							<label for="switch5" data-on-label="ON" data-off-label="OFF"></label>
						</div>
					</form>
					<h4 class="panel-title">Account Setting</h4>
					<form method="post">
						<div class="setting-row">
							<span>Sub users</span>
							<input type="checkbox" id="switch6" /> 
							<label for="switch6" data-on-label="ON" data-off-label="OFF"></label>
						</div>
						<div class="setting-row">
							<span>personal account</span>
							<input type="checkbox" id="switch7" /> 
							<label for="switch7" data-on-label="ON" data-off-label="OFF"></label>
						</div>
						<div class="setting-row">
							<span>Business account</span>
							<input type="checkbox" id="switch8" /> 
							<label for="switch8" data-on-label="ON" data-off-label="OFF"></label>
						</div>
						<div class="setting-row">
							<span>Show me online</span>
							<input type="checkbox" id="switch9" /> 
							<label for="switch9" data-on-label="ON" data-off-label="OFF"></label>
						</div>
						<div class="setting-row">
							<span>Delete history</span>
							<input type="checkbox" id="switch10" /> 
							<label for="switch10" data-on-label="ON" data-off-label="OFF"></label>
						</div>
						<div class="setting-row">
							<span>Expose author name</span>
							<input type="checkbox" id="switch11" /> 
							<label for="switch11" data-on-label="ON" data-off-label="OFF"></label>
						</div>
					</form>
				</div>
			</div>
		</nav>
	</div><!-- responsive header -->
	
	<div class="topbar stick">
		<div class="logo">
			<a title="" href="newsfeed.html"><img src="${finalPath}resources//images/logo.png" alt=""></a>
		</div>
		<div class="top-area">
			<ul class="main-menu">
				<li><span>기업명</span>
					<ul><!-- project2/showBpf -->
						<li><a href="${finalPath }${t != 'm' ? 'profile/showBpf' : 'profile/profile'	}" title="">비즈니스 프로필</a></li>
						<li><a href="OpJoinForm" title="">담당자 등록</a></li>
						<li><a href="#" title="">부서 및 직책 관리</a></li>
						<li><a href="#" title="">기업 계정 활동로그</a></li>
					</ul>
				</li>
				<li><span>채용공고</span>
					<ul>
						<li><a href="${finalPath }jpost/writeform" title="">채용공고 등록</a></li>
						<li><a href="#" title="">사전평가 등록</a></li>
						<li><a href="${finalPath }jpost/list" title="">채용공고 관리</a></li>
						<li><a href="#" title="">사전평가 관리</a></li>	
						<li><a href="#" title="">자기소개서 양식 관리</a></li>		
					</ul>
				</li>
				<li><span>뉴스레터</span>
					<ul>
						<li><a href="#" title="">뉴스레터 발행</a></li>
						<li><a href="#" title="">뉴스레터 관리</a></li>
					</ul>
				</li>
				<li><span>More pages</span>
					<ul>
						<li><a href="#" title="">회사소개</a></li>
						<li><a href="#" title="">회사 상품 판매</a></li>
					</ul>
				</li>
			</ul>
			<ul class="setting-area">
				<li>
					<a href="#" title="Home" data-ripple=""><i class="ti-search"></i></a>
					<div class="searched">
						<form method="post" class="form-search">
							<input type="text" placeholder="Search Friend">
							<button data-ripple><i class="ti-search"></i></button>
						</form>
					</div>
				</li>
				<li><a href="newsfeed.html" title="Home" data-ripple=""><i class="ti-home"></i></a></li>
			<!-- 	<li>
					<a href="#" title="Notification" data-ripple="">
						<i class="ti-bell"></i><span>20</span>
					</a>
					<div class="dropdowns">
						<span>4 New Notifications</span>
						<ul class="drops-menu">
							<li>
								<a href="notifications.html" title="">
									<img src="resources/images/resources/thumb-1.jpg" alt="">
									<div class="mesg-meta">
										<h6>sarah Loren</h6>
										<span>Hi, how r u dear ...?</span>
										<i>2 min ago</i>
									</div>
								</a>
								<span class="tag green">New</span>
							</li>
							<li>
								<a href="notifications.html" title="">
									<img src="resources/images/resources/thumb-2.jpg" alt="">
									<div class="mesg-meta">
										<h6>Jhon doe</h6>
										<span>Hi, how r u dear ...?</span>
										<i>2 min ago</i>
									</div>
								</a>
								<span class="tag red">Reply</span>
							</li>
							<li>
								<a href="notifications.html" title="">
									<img src="resources/images/resources/thumb-3.jpg" alt="">
									<div class="mesg-meta">
										<h6>Andrew</h6>
										<span>Hi, how r u dear ...?</span>
										<i>2 min ago</i>
									</div>
								</a>
								<span class="tag blue">Unseen</span>
							</li>
							<li>
								<a href="notifications.html" title="">
									<img src="resources/images/resources/thumb-4.jpg" alt="">
									<div class="mesg-meta">
										<h6>Tom cruse</h6>
										<span>Hi, how r u dear ...?</span>
										<i>2 min ago</i>
									</div>
								</a>
								<span class="tag">New</span>
							</li>
							<li>
								<a href="notifications.html" title="">
									<img src="resources/images/resources/thumb-5.jpg" alt="">
									<div class="mesg-meta">
										<h6>Amy</h6>
										<span>Hi, how r u dear ...?</span>
										<i>2 min ago</i>
									</div>
								</a>
								<span class="tag">New</span>
							</li>
						</ul>
						<a href="notifications.html" title="" class="more-mesg">view more</a>
					</div>
				</li> -->
				<li>
					<a href="#" title="Messages" data-ripple=""><i class="ti-comment"></i><span></span></a>
					<div class="dropdowns">
						<span></span>
						<ul class="drops-menu">
						
						</ul>
						<a href="messages.html" title="" class="more-mesg">view more</a>
					</div>
				</li>
				<li><a href="#" title="Languages" data-ripple=""><i class="fa fa-globe"></i></a>
					<div class="dropdowns languages">
						<a href="#" title=""><i class="ti-check"></i>English</a>
						<a href="#" title="">Arabic</a>
						<a href="#" title="">Dutch</a>
						<a href="#" title="">French</a>
					</div>
				</li>
			</ul>
			<div class="user-img">
				<img style="width: 45px; height: 45px;" src="${finalPath}/resources/profilePicture/${my.logo}" alt="">
				<span class="status f-online"></span>
				<div class="user-setting">
					<a href="#" title=""><span class="status f-online"></span>online</a>
					<a href="#" title=""><span class="status f-away"></span>away</a>
					<a href="#" title=""><span class="status f-off"></span>offline</a>
					<a onclick = "document.location.href='${finalPath }${t != 'm' ? 'project2/showBpf' : 'ppfList'	}'" title=""><i class="ti-user"></i> view profile</a>
					<a href="#" title=""><i class="ti-pencil-alt"></i>edit profile</a>
					<a href="#" title=""><i class="ti-target"></i>activity log</a>
					<a href="#" title=""><i class="ti-settings"></i>account setting</a>
					<a onclick="document.location.href ='${finalPath }logout'" title=""><i class="ti-power-off"></i>log out</a>
				</div>
			</div>
			<span class="ti-menu main-menu" data-ripple=""></span>
		</div>
	</div><!-- topbar -->
