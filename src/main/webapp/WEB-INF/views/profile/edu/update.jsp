<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/layout/header.jsp" %>
<script type="text/javascript">
	function checkWrite(){
		if(document.update.school.value == ""){
			alert("'학교명'란을 채워주세요");
		}else if(document.update.stat.value == ""){
			alert("'재학 상태'란을 채워주세요");
		}else if(document.update.degree.value == ""){
			alert("'학위'란을 채워주세요");
		}else if(document.update.major.value == ""){
			alert("'전공'란을 채워주세요");
		}else if(document.update.gpa.value == ""){
			alert("'학점'란을 채워주세요");
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
	<form action="${pageContext.request.contextPath }/profile/edu_update" method="post" name="update">
		<input type="hidden" value="${vo.EDU_NO }" name="edu_no">
		
		<table>														
			<tr>
				<th>학교명</th>
				<tr><td><input type="text" name="school" value="${vo.SCHOOL }"></td>
			</tr>
			<tr>
				<th>재학 상태</th>
				<tr><td>
					<select name="stat">
						<option value="">[필수]재학 상태를 선택하세요</option>
						<optgroup label="-----------"></optgroup>
						<option value="0">재학</option>
						<option value="1">휴학</option>
						<option value="2">졸업</option>
					</select>
				</td></tr>
			<tr>
				<th>학위</th>
				<tr><td>
					<select name="degree">
						<option value="">[필수]학위를 선택하세요</option>
						<optgroup label="-----------"></optgroup>
						<option value="0">전문학사</option>
						<option value="1">학사</option>
						<option value="2">전문석사</option>
						<option value="3">석사</option>
						<option value="4">전문박사</option>
						<option value="5">박사</option>
					</select>
				</td></tr>
			</tr>
			<tr>
				<th>전공(학/학과)</th>
				<tr><td><input type="text" name="major" value="${vo.MAJOR }"></td>
			</tr>
			<tr>
				<th>학점</th>
				<tr><td><input type="text" name="gpa" value="${vo.GPA }">/ 4.5</td>
			</tr>
		</table>	
	</form>
	<div class="btn">
		<input type="button" value="회원 프로필 업데이트" onclick="javascript:checkWrite()">
	</div>
</div>
<%@ include file="/WEB-INF/views/layout/footer.jsp" %>
