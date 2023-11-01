<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	
</style>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.0/jquery.min.js" integrity="sha512-3gJwYpMe3QewGELv8k/BX9vcqhryRdzRMxVfq6ngyWXwo03GFEzjsUm8Q7RZcHPHksttq7/GFoxjCVUjkjvPdw==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<div id = "BForm" style="position: absolute;  background-color: white; display: none; right: 50%; left: 50%; margin: 150px 0px 0px -200px; width: 20%; box-shadow: 1px 1px gray;">
			<form id = "Bmp" action="${pageContext.request.contextPath }/bmpUp" method="post" style="display: none;">
				<table>
					<tr>
						<td>회사명</td>
						<td><input name = "name" type = "text" value="${bdto.name }"></td>
					</tr>
					<tr>
						<td>영명</td>
						<td><input name = "eNname" type = "text" value="${bdto.eNname }"></td>
					</tr>
					<tr>
						<td>한줄 소개</td>
						<td><input name = "content" type = "text" value="${profile.content }"></td>
					</tr>
					<tr>
						<td>직원 수</td>
						<td><input name = "empl_cnt" type = "text" value="${profile.empl_cnt }"></td>
					</tr>
					<tr>
						<td>본사</td>
						<td><input name = "hp" type = "text" value="${profile.hp }"></td>
					</tr>
					<tr>
						<td>설립일</td>
						<td><input name = "extb" type = "date" value=${profile.extb }></td>
					</tr>
					<tr>
						<td>전문분야</td>
						<td><input name = "expert" type = "text" value=${profile.expert }></td>
					</tr>
					<tr>
						<td>자세한설명</td>
						<td><textarea rows="" cols="" name = "detail">${profile.detail }</textarea></td>
					</tr>
				</table>
				<input type = "button" value = "취소" onclick="csForm()" style="margin-top: 2%; float: right;">
				<input type = "submit" value = "수정하기" style="margin-top: 2%; margin-right: 2%; float: right;">
			</form>
			<form id = "Bct" action="${pageContext.request.contextPath }/bctIn" method="post" style="display: none;">
				<div>
					<select name = "type">
						<c:forEach var="btList" items="${bcontact_Type }">
							<option value="${btList.bcontact_type_no }">${btList.type }</option>
						</c:forEach>
					</select>
					<input name = "contact" type = "text">
				</div>
				<input type = "button" value = "취소" onclick="csForm()" style="margin-top: 2%; float: right;">
				<input type = "submit" value = "등록" style="margin-top: 2%; margin-right: 2%; float: right;">
			</form>
			<form id = "Bur" action="${pageContext.request.contextPath }/burIn" method="post" style="display: none;">
				<div>
				<table>
					<tr>
						<td><select name = "homepg_type_cno">
								<c:forEach var="list" items="${homepage_Type }">
									<option value="${list.homepg_type_cno }">${list.name }</option>
								</c:forEach>
						</select></td>
						<td>URL: <input name = "url" type = "text"></td>
					</tr>
					<tr>
						<td colspan="2" style="padding-left: 4%;">홈페이지 명: <input name = "name" type = "text"></td>
					</tr>
				</table>
				</div>
				<input type = "button" value = "취소" onclick="csForm()" style="margin-top: 2%; float: right;">
				<input type = "submit" value = "등록" style="margin-top: 2%; margin-right: 2%; float: right;">
			</form>
			<form id = "Bsn" action="${pageContext.request.contextPath }/bsnIn" method="post" style="display: none;">
				<div>
				<table>
					<tr>
						<td><select name = "sns_cno">
								<c:forEach var="list" items="${sns_Type}">
									<option value = "${list.sns_cno }">${list.name}</option>
								</c:forEach>
						</select></td>
						<td>계정명 <input name = "account" type = "text"></td>
					</tr>
				</table>
				</div>
				<input type = "button" value = "취소" onclick="csForm()" style="margin-top: 2%; float: right;">
				<input type = "submit" value = "등록" style="margin-top: 2%; margin-right: 2%; float: right;">
			</form>
		</div>
		<div id = "Bcontact" style="position: absolute; right: 0; margin: 5%; width: 20%; height: 15%;">
			<!-- 연락처 부분 -->
			<form action="bctUp" method="Post">
				<table>
					<c:choose>
						<c:when test="${fn:length(bcontact) != 0}">
							<tbody id = "clistBody" >
							<c:forEach var="clist" items="${bcontact}">
									<tr>
										<td>${clist.TYPE }</td>
										<td>${clist.CONTACT }</td>
									</tr>
							</c:forEach>
							</tbody>
							<tbody id = "cUpdateBody" style="display: none;">
								<c:forEach var="clist" items="${bcontact}">
									<input type = "hidden" name = "no" value = "${clist.BCONTACT_NO}">
									<tr>
										<td><select name = "type">
											<c:forEach var="btList" items="${bcontact_Type }">
												<option value="${btList.bcontact_type_no }" ${clist.BCONTACT_TYPE_NO == btList.bcontact_type_no ? 'selected' : ''}>${btList.type }</option>
											</c:forEach>
										</select></td>
										<td><input name = "contact" type = "text" value = "${clist.CONTACT }"></td>
										<td><img alt="" onclick="if(confirm('정말 삭제하시겠습니까?'))document.location.href='bcdel?cd=${clist.BCONTACT_NO}'" style="width: 30px;;" src="data:image/png;base64,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"></td>
									</tr>							
								</c:forEach>
							</tbody>
						</c:when>
					</c:choose>
				</table>
				<c:if test="${fn:length(bcontact) < 3}">
					<tr>
						<td colspan="2"><a style="color: blue; cursor: pointer;" onclick="onForm(1)">연락처를 등록해보세요</a></td>
					</tr>
				</c:if>
				<div>
					<c:if test="${fn:length(bcontact) != 0}"><input id = "cUpb" type = "button" onclick="ctUp(this)" value = "연락처수정" style="margin-top: 2%;"></c:if>
					<input id = "cUps" type = "button" onclick="ctSub(this.form)" value = "수정" style="margin-top: 2%; display: none;">
				</div>
			</form>
			<!-- /연락처 부분 -->
			<!-- 홈페이지URL 부분 -->
			<form action = "burUp">
			<table style=" margin-top: 4%;">
					<c:choose>
						<c:when test="${fn:length(bpf_url) != 0}">
							<tbody id = "urlistBody" >
							<c:forEach var="urlist" items="${bpf_url}">
									<input type="hidden" name = "no" value="${urlist.BPF_URL_NO }">
									<tr>
										<td>${urlist.NAME2 }</td>
										<td><a href="${urlist.URL }">${urlist.NAME }</a></td>
									</tr>
							</c:forEach>
							</tbody>
							<tbody id = "urUpdateBody" style="display: none;">
							<c:forEach var="urlist" items="${bpf_url}">
								<tr>
									<th>페이지 유형<select name = "homepg_type_cno">
										<c:forEach var="list" items="${homepage_Type }">
											<option value="${list.homepg_type_cno }" ${list.homepg_type_cno == urlist.HOMEPG_TYPE_CNO ? 'selected' : '' }>${list.name }</option>
										</c:forEach>
									</select></th>						
									<td>URL:<input name = "url" type = "text" value = "${urlist.URL }"></td>
								</tr>
								<tr>		
									<td>NAME:<input size="10" name = "name" type = "text" value = "${urlist.NAME }"></td>		
									<td><img alt="" onclick="if(confirm('정말 삭제하시겠습니까?'))document.location.href='burdel?cd=${urlist.BPF_URL_NO  }'" style="width: 30px;" src="data:image/png;base64,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"></td>
								</tr>
							</c:forEach>
							</tbody>
						</c:when>
					</c:choose>
				</table> 
				<c:if test="${fn:length(bpf_url) < 3}">
					<tr>
						<td colspan="2"><a style="color: blue; cursor: pointer;" onclick="onForm(2)">홈페이지를 등록해보세요</a></td>
					</tr>
				</c:if>
				<div>				
					<c:if test="${fn:length(bpf_url) != 0}"><input id = "urUpb" type = "button" onclick="urUp(this)" value = "연락처수정" style="margin-top: 2%;"></c:if>
					<input id = "urUps" type = "button" onclick="urSub(this.form)" value = "수정" style="margin-top: 2%; display: none;">
				</div>
			</form>
			<!-- /홈페이지URL 부분 -->
			<!-- SNS부분  -->
			<form action="bsnUp">
				<table style ="margin-top: 4%;">
					<c:choose>
						<c:when test="${fn:length(bpf_sns) != 0}">
							<tbody id = "snslistBody" >
							<c:forEach var="snslist" items="${bpf_sns}">
									<input type="hidden" name = "no" value="${snslist.BPF_SNS_NO }">
									<tr>
										<td>${snslist.ICON }</td>
										<td>${snslist.ACCOUNT }</td>
									</tr>
							</c:forEach>
							</tbody>
							<tbody id = "snsUpdateBody" style="display: none;">
							<c:forEach var="snslist" items="${bpf_sns}">
								<tr>
									<td>
									<select name = "sns_cno">
										<c:forEach var="list" items="${sns_Type}">
											<option value = "${list.sns_cno }" ${list.sns_cno == snslist.SNS_CNO ? 'selected' : '' }>${list.name}</option>
										</c:forEach>
									</select>
									</td>
									<td><input name = "account" type = "text" value = "${snslist.ACCOUNT }"></td>		
									<td><img alt="" onclick="if(confirm('정말 삭제하시겠습니까?'))document.location.href='bsndel?cd=${snslist.BPF_SNS_NO}'" style="width: 30px;" src="data:image/png;base64,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"></td>
								</tr>
							</c:forEach>
							</tbody>
						</c:when>
					</c:choose>
				</table>
				<c:if test="${fn:length(bpf_sns) < 3}">
					<tr>
						<td colspan="2"><a style="color: blue; cursor: pointer;" onclick="onForm(3)">SNS를 등록해보세요</a></td>
					</tr>
				</c:if>
				<div>
					<c:if test="${fn:length(bpf_sns) != 0}"><input id = "urUpb" type = "button" onclick="snsUp(this)" value = "SNS수정" style="margin-top: 2%;"></c:if>
					<input id = "snsUps" type = "button" onclick="snsSub(this.form)" value = "수정" style="margin-top: 2%; display: none;">
				</div>
			</form>
			<!-- /SNS부분  -->
		</div>
		<table border="1" style="width: 30%;">
			<tr>
				<th style="background-image: url(https://static.licdn.com/sc/h/55k1z8997gh8dwtihm11aajyq); background-size: cover; background-repeat: no-repeat;"> 
					<div onclick="" style="margin-left: 20%; width: 15%; border: 2px solid;">
						<c:choose >
								<c:when test="${kind == 'bisi' }">
									<c:choose>
										<c:when test="${profile.logo != null }">
										</c:when>
										<c:otherwise>
											<img alt="" src="https://static.licdn.com/sc/h/aajlclc14rr2scznz5qm2rj9u" >
										</c:otherwise>
									</c:choose>
								</c:when>
						</c:choose>
					</div>
				</th>
			</tr>
			<tr>
				<td>${kind == 'bisi' ? bdto.name : ''}<input style="float: right;" type = "button" value ="수정" onclick="onForm(0)"></td>
			</tr>
			<tr>
				<td>업계 및 위치 , 팔로우 , ${profile.empl_cnt }</td>
			</tr>
			<tr>
				<td>${profile.content }</td>
			</tr>
		</table>
	</div>
	
<script type="text/javascript">
	const formList = ['Bmp','Bct','Bur','Bsn']
	
	function onForm(index) {
		formList.forEach(f => {
			$('#'+f).css("display","none");
		})
		$('#'+formList[index]).css("display", "");
		$("#BForm").css("display", "");	
	}
	
	function csForm() {
		formList.forEach(f => {
			$('#'+f).css("display","none");
		})
		$("#BForm").css("display", "none");
	}
	
	function ctUp(t) {
		let tf = document.querySelector("#clistBody").style.display == "";
		t.value = tf ? "취소" : "연락처수정"; 
		$("#clistBody").css("display", tf ? "none" : "");
		$("#cUps").css("display", tf ? "" : "none");
		$("#cUpdateBody").css("display",tf ? "" : "none");
	}
	
	function urUp(t) {
		let tf = document.querySelector("#urlistBody").style.display == "";
		t.value = tf ? "취소" : "URL수정"; 
		$("#urlistBody").css("display", tf ? "none" : "");
		$("#urUps").css("display", tf ? "" : "none");
		$("#urUpdateBody").css("display",tf ? "" : "none");
	}
	
	function snsUp(t) {
		let tf = document.querySelector("#snslistBody").style.display == "";
		t.value = tf ? "취소" : "SNS수정"; 
		$("#snslistBody").css("display", tf ? "none" : "");
		$("#snsUps").css("display", tf ? "" : "none");
		$("#snsUpdateBody").css("display",tf ? "" : "none");
	}
	//나중에 유효성 검사를 위한 
	function ctSub(f){
		f.submit();
	}
	
	function urSub(f){
		f.submit();
	}
	
	function snsSub(f){
		f.submit();
	}
</script>		
</body>
</html>