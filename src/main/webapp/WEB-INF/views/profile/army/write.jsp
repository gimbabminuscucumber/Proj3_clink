<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/layout/header.jsp" %>
<script type="text/javascript">
	function checkWrite(){
		if(document.write.opt.value == ""){
			alert("'병역'란을 채워주세요");
		}else if(document.write.type.value == ""){
			alert("'병역 구분'란을 채워주세요");
		}else if(document.write.disch.value == ""){
			alert("'제대계급'란을 채워주세요");
		}else if(document.write.termStat.value == ""){
			alert("'민감 정보 동의 여부'를 채워주세요");
		}else{
			document.write.submit();
		}
	}
	
	function hideOthers(t){
		if(t.value == 1){
			console.log("군필");
			document.querySelector("#imType").style.display='block';
			document.querySelector("#imDisch").style.display='block';
			document.querySelector("#imStart").style.display='block';
			document.querySelector("#imEnd").style.display='block';
			document.querySelector("#imRsn").style.display='none';
		}else if(t.value == 0){
			console.log("해당없음");
			document.querySelector("#imRsn").style.display="block";
			document.querySelector("#imType").style.display='none';
			document.querySelector("#imDisch").style.display='none';
			document.querySelector("#imStart").style.display='none';
			document.querySelector("#imEnd").style.display='none';
		}else if(t.value == 3){
			console.log("면제");
			document.querySelector("#imRsn").style.display="block";
			document.querySelector("#imType").style.display='none';
			document.querySelector("#imDisch").style.display='none';
			document.querySelector("#imStart").style.display='none';
			document.querySelector("#imEnd").style.display='none';
		}else{
			console.log("미필");
			document.querySelector("#imType").style.display='none';
			document.querySelector("#imDisch").style.display='none';
			document.querySelector("#imStart").style.display='none';
			document.querySelector("#imEnd").style.display='none';
			document.querySelector("#imRsn").style.display='none';
		}
	}
	
	$(function(){
		if($("#term").is(":checked")){
		    console.log("병역동의 체크 됨");
		    
		}else{
		    console.log("is 체크 안됨");
		    
		}
	});

	
</script>
<style>
	th{
		text-align: left;
	}
	
	td{
		border: 1px solid;
	}
</style>
<hr>
<div align="center">
	<form action="${pageContext.request.contextPath }/profile/army_write" method="post" name="write">
		<div>
		병역
			<select name="opt" id="selectOpt" onchange="hideOthers(this)">
				<option value="" selected disabled>병역을 선택하세요</option>
				<option value="0">해당없음</option>
				<option value="1">군필</option>
				<option value="2">미필</option>
				<option value="3">면제</option>
			</select>
		</div>
		<div style="display:none" id="imType">
		병역 구분
			<select name="type">
				<option value="" selected disabled>병역 구분을 선택하세요</option>
				<option value="0">육군</option>
				<option value="1">해군</option>
				<option value="2">공군</option>
				<option value="3">해병</option>
				<option value="4">의경</option>
				<option value="5">공익</option>
				<option value="6">기타</option>
			</select>
		</div>
		<div style="display:none" id="imDisch">
		제대계급
			<select name="disch">
				<option value="" selected disabled>제대계급을 선택하세요</option>
				<option value="0">이병</option>
				<option value="1">일병</option>
				<option value="2">상병</option>
				<option value="3">병장</option>
				<option value="4">하사</option>
				<option value="5">중사</option>
				<option value="6">상사</option>
				<option value="7">원사</option>
				<option value="8">준위</option>
				<option value="9">소위</option>
				<option value="10">중위</option>
				<option value="11">대위</option>
				<option value="12">소령</option>
				<option value="13">중령</option>
				<option value="14">대령</option>
				<option value="15">준장</option>
				<option value="16">소장</option>
				<option value="17">중장</option>
				<option value="18">대장</option>
				<option value="19">기타</option>
			</select>
		</div>
		<div style="display:none" id="imRsn">
		사유
			<input type="text" name="rsn" placeholder="최대 100자까지 입력">
		</div>
		<div style="display:none" id="imStart">
		입영일
			<input type="date" name="start_date">
		</div>	
		<div style="display:none" id="imEnd">
		제대일
			<input type="date" name="end_date">
		</div>
		<div>
		민감 정보 동의 여부
			<input type="radio" name="termStat" value="1" id="term">동의
			<input type="radio" name="termStat" value="0" id="term">비동의
		</div>
	</form>

	<div class="btn">
		<input type="button" value="회원 프로필 업데이트" onclick="javascript:checkWrite()">
	</div>
</div>
<%@ include file="/WEB-INF/views/layout/footer.jsp" %>
