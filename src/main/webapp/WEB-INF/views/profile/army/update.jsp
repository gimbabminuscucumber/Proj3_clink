<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/layout/header.jsp" %>
<script type="text/javascript">
	function checkWrite(){
		if(document.update.opt.value == ""){
			alert("'병역'란을 채워주세요");
		}else if(document.update.type.value == ""){
			alert("'병역 구분'란을 채워주세요");
		}else if(document.update.disch.value == ""){
			alert("'제대계급'란을 채워주세요");
		}else if(document.update.termStat.value == 0){
			alert("'민감 정보 동의 여부'를 동의해주세요");
		}else{
			document.update.submit();
		}
	}
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
	<form action="${pageContext.request.contextPath }/profile/army_update" method="post" name="update">
		<input type="hidden" value="${vo.ARMY_NO }" name="army_no">
		
		<table>														
			<tr>
				<th>병역</th>
				<tr><td>
					<select name="opt">
						<option value="">[필수]병역을 선택하세요</option>
						<optgroup label="-----------"></optgroup>
						<option value="0">해당없음</option>
						<option value="1">군필</option>
						<option value="2">미필</option>
						<option value="3">면제</option>
					</select>
				</td>
				<td>'군필' 누르면 활성화 되게끔 </td>
			</tr>
			<tr>
				<th>병역 구분</th>
				<tr><td>
					<select name="type">
						<option value="">[필수]병역 구분을 선택하세요</option>
						<optgroup label="-----------"></optgroup>
						<option value="0">육군</option>
						<option value="1">해군</option>
						<option value="2">공군</option>
						<option value="3">해병</option>
						<option value="4">의경</option>
						<option value="5">공익</option>
						<option value="6">기타</option>
					</select>
				</td>
			</tr>
			<tr>
				<th>제대계급</th>
				<tr><td>
					<select name="disch">
						<option value="">[필수]제대계급을 선택하세요</option>
						<optgroup label="-----------"></optgroup>
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
				</td>
			</tr>
			<tr>
				<th>사유</th>
				<tr><td><input type="text" name="rsn" value="${vo.RSN }"></td>
				<td>'병역', '병역구분' 중에 어떤 내용에 대한걸 쓸지?</td>
			</tr>
			<tr>
				<th>입영일</th>
				<tr><td><input type="date" name="start_date"></td>
			</tr>
			<tr>
				<th>제대일</th>
				<tr><td><input type="date" name="end_date"></td>
			</tr>
			<tr>
				<th>민감 정보 동의 여부</th>
				<tr>
					<td>
						<input type="radio" name="termStat" value="1" id="term">동의
						<input type="radio" name="termStat" value="0" id="term">비동의
					</td>
					<td><-동의 해야만 넘어갈 수 있게</td>
			</tr>
		</table>	
	</form>
	<div class="btn">
		<input type="button" value="회원 프로필 업데이트" onclick="javascript:checkWrite()">
	</div>
</div>
<%@ include file="/WEB-INF/views/layout/footer.jsp" %>
