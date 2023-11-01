 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/cLayout/setting.jsp" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="" />
    <meta name="keywords" content="" />
	<title>Clink</title>
    <link rel="icon" href="images/fav.png" type="image/png" sizes="16x16"> 
    
    <link rel="stylesheet" href="resources/css/main.min.css">
    <link rel="stylesheet" href="resources/css/style.css">
    <link rel="stylesheet" href="resources/css/color.css">
    <link rel="stylesheet" href="resources/css/responsive.css">

</head>
<body>
<div class="se-pre-con"></div>
<div class="theme-layout">
	<div class="container-fluid pdng0">
		<div class="row merged">
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
				<div class="land-featurearea">
					<div class="land-meta">
						<h1>Clink</h1>
						<p>
							We linked career.
						</p>
						<div class="friend-logo">
							<span><img src="resources/images/clink.png" alt="clink-logo" id="loginlogoimg"></span>
						</div>
						<a href="#" title="" class="folow-me">Follow Us on</a>
					</div>	
				</div>
			</div>
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
				<div class="login-reg-bg">
					<div class="log-reg-area sign">
						<h2 class="log-title">Login</h2>
							<p>
								Don’t use Clink Yet? <a href="#" title="">Take the tour</a> or <a href="#" title="">Join now</a>
							</p>
						<form method="post">
							<div class="form-group">	
							  <input name = "id" type="text" id="input" required="required" onkeyup="if(event.keyCode == 13)login(this.form)"/>
							  <label class="control-label" for="input">Username</label><i class="mtrl-select"></i>
							</div>
							<div class="form-group">	
							  <input name = "pw" type="password" required="required" onkeyup="if(event.keyCode == 13)login(this.form)"/>
							  <label class="control-label" for="input">Password</label><i class="mtrl-select"></i>
							</div>
							<div class="checkbox">
							  <label>
								<input type="checkbox"/><i class="check-box"></i>Always Remember Me.
							  </label>
							</div>
							<a href="#" title="" class="forgot-pwd">Forgot Password?</a>
							<div class="submit-btns">
								<button class="mtr-btn signin" type="button" onclick="login(this.form)"><span>Login</span></button>
								<button class="mtr-btn signup" type="button" onclick="document.location.href = 'binsertForm'"><span>Register</span></button>
							</div>
						</form>  
					</div>
					<div class="log-reg-area reg"> 
						<h2 class="log-title">Register</h2>
							<p>
								Don’t use Clink Yet? <a href="#" title="">Take the tour</a> or <a href="#" title="">Join now</a>
							</p>
						<form method="post">
							<div class="form-group">	
							  <input type="text" required="required"/>
							  <label class="control-label" for="input">First & Last Name</label><i class="mtrl-select"></i>
							</div>
							<div class="form-group">	
							  <input type="text" required="required"/>
							  <label class="control-label" for="input">User Name</label><i class="mtrl-select"></i>
							</div>
							<div class="form-group">	
							  <input type="password" required="required"/>
							  <label class="control-label" for="input">Password</label><i class="mtrl-select"></i>
							</div>
							<div class="form-radio">
							  <div class="radio">
								<label>
								  <input type="radio" name="radio" checked="checked"/><i class="check-box"></i>Male
								</label>
							  </div>
							  <div class="radio">
								<label>
								  <input type="radio" name="radio"/><i class="check-box"></i>Female
								</label>
							  </div>
							</div>
							<div class="form-group">	
							  <input type="text" required="required"/>
							  <label class="control-label" for="input"><a href="https://wpkixx.com/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="6c29010d05002c">[email&#160;protected]</a></label><i class="mtrl-select"></i>
							</div>
							<div class="checkbox">
							  <label>
								<input type="checkbox" checked="checked"/><i class="check-box"></i>Accept Terms & Conditions ?
							  </label>
							</div>
							<a href="#" title="" class="already-have">Already have an account</a>
							<div class="submit-btns">
								<button class="mtr-btn signup" type="button"><span>Register</span></button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
	
	<script src="resources/js/script.js"></script>
	<script type="text/javascript">
	
	function enterLogin(e) {
		console.log(e);
	}
	
	function login(f) {
			let id = f.id.value;
			let pw = f.pw.value;
			

			
			
			f.action = "${pageContext.request.contextPath}/blogin";
			f.submit();
			//console.log('[id ='+id+' pw = '+pw+']')
	}
	</script>

</body>	

</html>

<%@ include file="/WEB-INF/views/public/alimScript.jsp" %>
<script type="text/javascript">
	 
	function projectJoin(f,c) {
		f.action = c.checked ? 'blogin' : 'mlogin'; 
		join.value = (c.checked ? '비즈니스 회원가입' : '회원가입');
		join.setAttribute('onclick',c.checked ?  'document.location.href="binsertForm"' : 'document.location.href="join"'); 
	}
 
	
	function like2(f) {
		d.name = d.name == 1 ? 0 : 1;
		alimJSON('like',idx.value,d.name);
	}

	
	setInterval(function() {
		idx.value = Math.floor((Math.random()*50)+1);
		idxd = Math.floor((Math.random()*50)+1)+'';
	}, 5000);

	
</script>

</body> 