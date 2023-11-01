<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.0/jquery.min.js" integrity="sha512-3gJwYpMe3QewGELv8k/BX9vcqhryRdzRMxVfq6ngyWXwo03GFEzjsUm8Q7RZcHPHksttq7/GFoxjCVUjkjvPdw==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="margin-top: 5%" align="center">
		<form action="binsert" method="post">	
			<table border="1">
				<tr>
					<td>사업자등록번호</td><!-- 중복 확인 -->
					<td><input name = "regi_Number" type = "text"></td>
					<td><input onclick="rgck(this.form)" type = "button" value = "중복확인"></td> 
				</tr>
				<tr>
					<td>회사명</td>
					<td colspan="2"><input name = "name" type = "text"></td>
				</tr>
				<tr>
					<td>회사명영어</td>
					<td colspan="2"><input name = "eNname" type = "text"></td>
				</tr>
				<tr>
					<td>그룹명 혹은 모회사명</td>
					<td colspan="2"><input name = "group_Name" type = "text"></td>
				</tr>
				<tr>
					<td>회사이메일</td><!-- 중복 확인 -->
					<td><input name = "email" type = "text"></td>
					<td><input onclick="mailsender(this.form)" type = "button" value = "메일인증"></td> 
				</tr>
				<tr>
					<td>비밀번호</td>
					<td colspan="2"><input name = "pw" type = "password"></td>
				</tr>
			</table>
			<input style="margin-top: 2%" type = "button" value="비즈니스 등록" onclick="ffsub(this.form)">
			<div id = "fale" style="color: red"></div>
		</form>
	</div>
	
<script type="text/javascript">
	
	let rg = 0;
	
	function rgck(f){
		if(f.regi_Number.value == "")return;
		$.ajax({
			url:"${pageContext.request.contextPath}/rgck",
			type:"POST",
			data:{num: f.regi_Number.value},
			success: function sc(num) {
				rg = num;
			}
		})
		
	}
	
	
	function mailsender(f) {
		if(f.email.value == "")return;
		$.ajax({
			url:"${pageContext.request.contextPath}/mailsender",
			type:"POST",
			data:{email:f.email.value},
			success: function rannum(n) {
				console.log(n)
			}
		})
	}
	
	
	
	function ffsub(f) {
		const email_p = /^[a-z0-9A-Z]{1,15}@[a-z]{1,6}[.][a-z]{1,3}$/;
		
		
		
		
		if(f.regi_Number.value == ""){
			divtext("사업자 번호를 확인해주세요");
			return;
		}
		if(f.name.value == ""){
			divtext("회사명을 입력해 주세요");
			return;
		}
		if(f.eNname.value == ""){
			divtext("영어명을 입력해주세요");
			return;
		}
/* 		if(f.join_bus_groupName.vlue == ""){
			divtext();
			return;
		} */
		if(f.email.value == ""){
			divtext("이메일을 입력해 주세요");
			return;
		}else if(!email_p.test(f.email.value)){
			divtext("올바른 형식이 아닙니다");
			return;
		}
		console.log(f.pw.value)
		if(f.pw.value == ""){
			divtext("비밀번호를 입력해주세요");
			return;
		}else if(f.pw.value.length < 6){
			divtext("비밀번호는 6자리 이상이여야 합니다");
			return;
		}
		
		f.submit();
		
	}
	
 	function divtext(str) {
		$('#fale').text(str)
	} 


</script>
</body>
</html>