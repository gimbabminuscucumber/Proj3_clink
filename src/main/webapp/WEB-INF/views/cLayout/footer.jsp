<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <div class="chat-box">
	<div class="chat-head">
		<span class="status f-online"></span>
		<h6>Bucky Barnes</h6>
		<div class="more">
			<span><i class="ti-more-alt"></i></span>
			<span class="close-mesage"><i class="ti-close"></i></span>
		</div>
	</div>
	<div class="chat-list">
		<ul>
			
		</ul>
		<form class="text-box">
			<textarea id = "send-box" placeholder="Post enter to post..." onkeyup="if(event.keyCode == 13)on()"></textarea>
			<div class="add-smiles">
				<span title="add icon" class="em em-expressionless"></span>
			</div>
			<div class="smiles-bunch" draggable="true">
				<i class="em em---1"></i>
				<i class="em em-smiley"></i>
				<i class="em em-anguished"></i>
				<i class="em em-laughing"></i>
				<i class="em em-angry"></i>
				<i class="em em-astonished"></i>
				<i class="em em-blush"></i>
				<i class="em em-disappointed"></i>
				<i class="em em-worried"></i>
				<i class="em em-kissing_heart"></i>
				<i class="em em-rage"></i>
				<i class="em em-stuck_out_tongue"></i>
			</div>
			<button type="submit"></button>
		</form>
	</div>
</div>
<footer>
	<div class="container">
		<div class="row">
			<div class="col-lg-4 col-md-4">
				<div class="widget">
					<div class="foot-logo">
						<div class="logo">
							<a href="index-2.html" title=""><img src="${finalPath}resources/images/logo.png" alt=""></a>
						</div>	
						<p>
							The trio took this simple idea and built it into the world’s leading carpooling platform.
						</p>
					</div>
					<ul class="location">
						<li>
							<i class="ti-map-alt"></i>
							<p>33 new montgomery st.750 san francisco, CA USA 94105.</p>
						</li>
						<li>
							<i class="ti-mobile"></i>
							<p>+1-56-346 345</p>
						</li>
					</ul>
				</div>
			</div>
			<div class="col-lg-2 col-md-4">
				<div class="widget">
					<div class="widget-title"><h4>follow</h4></div>
					<ul class="list-style">
						<li><i class="fa fa-facebook-square"></i> <a href="https://web.facebook.com/shopcircut/" title="">facebook</a></li>
						<li><i class="fa fa-twitter-square"></i><a href="https://twitter.com/login?lang=en" title="">twitter</a></li>
						<li><i class="fa fa-instagram"></i><a href="https://www.instagram.com/?hl=en" title="">instagram</a></li>
						<li><i class="fa fa-google-plus-square"></i> <a href="https://plus.google.com/discover" title="">Google+</a></li>
						<li><i class="fa fa-pinterest-square"></i> <a href="https://www.pinterest.com/" title="">Pintrest</a></li>
					</ul>
				</div>
			</div>
			<div class="col-lg-2 col-md-4">
				<div class="widget">
					<div class="widget-title"><h4>Navigate</h4></div>
					<ul class="list-style">
						<li><a href="about.html" title="">about us</a></li>
						<li><a href="contact.html" title="">contact us</a></li>
						<li><a href="terms.html" title="">terms & Conditions</a></li>
						<li><a href="#" title="">RSS syndication</a></li>
						<li><a href="sitemap.html" title="">Sitemap</a></li>
					</ul>
				</div>
			</div>
			<div class="col-lg-2 col-md-4">
				<div class="widget">
					<div class="widget-title"><h4>useful links</h4></div>
					<ul class="list-style">
						<li><a href="#" title="">leasing</a></li>
						<li><a href="#" title="">submit route</a></li>
						<li><a href="#" title="">how does it work?</a></li>
						<li><a href="#" title="">agent listings</a></li>
						<li><a href="#" title="">view All</a></li>
					</ul>
				</div>
			</div>
			<div class="col-lg-2 col-md-4">
				<div class="widget">
					<div class="widget-title"><h4>download apps</h4></div>
					<ul class="colla-apps">
						<li><a href="https://play.google.com/store?hl=en" title=""><i class="fa fa-android"></i>android</a></li>
						<li><a href="https://www.apple.com/lae/ios/app-store/" title=""><i class="ti-apple"></i>iPhone</a></li>
						<li><a href="https://www.microsoft.com/store/apps" title=""><i class="fa fa-windows"></i>Windows</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</footer>
<div class="bottombar">
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<span class="copyright"><a target="_blank" href="https://www.templateshub.net">Templates Hub</a></span>
				<i><img src="${finalPath}resources/images/credit-cards.png" alt=""></i>
				</div>
			</div>
		</div>
	</div>
</div>
	<div class="side-panel">
			<h4 class="panel-title">General Setting</h4>
			<form method="post">
				<div class="setting-row">
					<span>use night mode</span>
					<input type="checkbox" id="nightmode1"/> 
					<label for="nightmode1" data-on-label="ON" data-off-label="OFF"></label>
				</div>
				<div class="setting-row">
					<span>Notifications</span>
					<input type="checkbox" id="switch22" /> 
					<label for="switch22" data-on-label="ON" data-off-label="OFF"></label>
				</div>
				<div class="setting-row">
					<span>Notification sound</span>
					<input type="checkbox" id="switch33" /> 
					<label for="switch33" data-on-label="ON" data-off-label="OFF"></label>
				</div>
				<div class="setting-row">
					<span>My profile</span>
					<input type="checkbox" id="switch44" /> 
					<label for="switch44" data-on-label="ON" data-off-label="OFF"></label>
				</div>
				<div class="setting-row">
					<span>Show profile</span>
					<input type="checkbox" id="switch55" /> 
					<label for="switch55" data-on-label="ON" data-off-label="OFF"></label>
				</div>
			</form>
			<h4 class="panel-title">Account Setting</h4>
			<form method="post">
				<div class="setting-row">
					<span>Sub users</span>
					<input type="checkbox" id="switch66" /> 
					<label for="switch66" data-on-label="ON" data-off-label="OFF"></label>
				</div>
				<div class="setting-row">
					<span>personal account</span>
					<input type="checkbox" id="switch77" /> 
					<label for="switch77" data-on-label="ON" data-off-label="OFF"></label>
				</div>
				<div class="setting-row">
					<span>Business account</span>
					<input type="checkbox" id="switch88" /> 
					<label for="switch88" data-on-label="ON" data-off-label="OFF"></label>
				</div>
				<div class="setting-row">
					<span>Show me online</span>
					<input type="checkbox" id="switch99" /> 
					<label for="switch99" data-on-label="ON" data-off-label="OFF"></label>
				</div>
				<div class="setting-row">
					<span>Delete history</span>
					<input type="checkbox" id="switch101" /> 
					<label for="switch101" data-on-label="ON" data-off-label="OFF"></label>
				</div>
				<div class="setting-row">
					<span>Expose author name</span>
					<input type="checkbox" id="switch111" /> 
					<label for="switch111" data-on-label="ON" data-off-label="OFF"></label>
				</div>
			</form>
		</div><!-- side panel -->
	<form id = "file" action="updateLogo">
		<input name = "file" style="display: none" type = "file" onchange="sc()"> 
	</form>
<!-- <script data-cfasync="false" src="../../cdn-cgi/scripts/5c5dd728/cloudflare-static/email-decode.min.js">-->
<script  src="${finalPath}resources/js/main.min.js"></script> 
<script src="${finalPath}resources/js/script.js"></script>
<%-- <%@ include file="/resources/js/socket.jsp" %> --%>
<%-- <%@ include file="/resources/js/chatHeader.jsp" %> --%>
<script type="text/javascript">
	document.querySelector('.ti-pencil-alt').parentElement.addEventListener("click", function(e) {
		file.file.click();
	})
	function sc() {
		let dt = file.file.files[0];
		
		let data = new FormData();
		data.append("file",dt);
		
		
		$.ajax({
			url:"${pageContext.request.contextPath}/logo",
			type:"POST",
			contentType:false, // 파일을 넘길때는 false   비동기 파일을 넘길때는 두가지가 필수
			processData:false, //  폼 데이터를 &변수=값&변수=값... 형식으로 변경되는 것을 막음
			data:data,
			success: function () {
				location.reload();
			}
		}) 
	}
</script>
	<!-- <script src="resources/js/map-init.js"></script> 
	<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyA8c55_YHLvDHGACkQscgbGLtLRdxBDCfI"></script> --> 
</body>	

</html>