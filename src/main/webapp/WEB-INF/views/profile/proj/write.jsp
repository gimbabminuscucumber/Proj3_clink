<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/layout/header.jsp" %>
<script type="text/javascript">
	function checkWrite(){
		if(document.write.name.value == ""){
			alert("'프로젝트 명'란을 채워주세요");
		}else if(document.write.stat.value == ""){
			alert("'진행 상태'란을 채워주세요");
		}else{
			document.write.submit();
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
	<form action="${pageContext.request.contextPath }/profile/proj_write" method="post" name="write">
		<table>														
			<tr>
				<th>프로젝트 명</th>
				<tr><td><input type="text" name="name" placeholder="ex) 모빌리티 SW 성능 개선"></td>
			</tr>
			<tr>
				<th>프로젝트 참가자</th>
				<tr><td><input type="text" name="member_no" placeholder="ex) 함께 진행한 사람의 이름 작성"></td>
			</tr>
			<tr>
				<th>진행 상태</th>
				<tr><td>
					<select name="stat">
						<option value="" selected disabled>진행 상태를 선택하세요</option>
						<option value="0">완료</option>
						<option value="1">진행 중</option>
					</select>
				</td>
			</tr>
		</table>	
	</form>
	<div class="btn">
		<input type="button" value="회원 프로필 업데이트" onclick="javascript:checkWrite()">
	</div>
</div>
<%@ include file="/WEB-INF/views/layout/footer.jsp" %>
