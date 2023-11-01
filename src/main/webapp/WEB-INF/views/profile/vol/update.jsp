<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/layout/header.jsp" %>
<script type="text/javascript">
	function checkWrite(){
		if(document.write.org.value == ""){
			alert("'단체명'란을 채워주세요");
		}else if(document.write.content.value == ""){
			alert("'활동 내용'란을 채워주세요");
		}else if(document.write.stat.value == ""){
			alert("'현재 활동 여부'란을 체크해주세요");
		}else if(document.write.detail.value == ""){
			alert("'설명'란을 채워주세요");
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
	<form action="${pageContext.request.contextPath }/profile/vol_write" method="post" name="write">
	<input type="hidden" value="${vo.VOL_NO }" name="vol_no">
		<table>			
			<tr>
				<th>단체명</th>
				<tr><td><input type="text" name="org" value="${vo.ORG }"></td>
			</tr>
			<tr>
				<th>활동 내용</th>
				<tr><td><input type="text" name="content" value="${vo.CONTENT }"></td>
			</tr>
			<tr>
				<th>현재 활동 여부</th>
				<tr>
					<td>
						<input type="radio" name="stat" value="1" id="term">활동
						<input type="radio" name="stat" value="0" id="term">비활동
					</td>
			</tr>
			<tr>
				<th>시작일</th>
				<tr><td><input type="date" name="start_date"></td>
			</tr>
			<tr>
				<th>종료일</th>
				<tr><td><input type="date" name="end_date"></td>
			</tr>
			<tr>
				<th>설명</th>
				<tr><td><textarea rows="15" cols="65" name="text">${vo.TEXT }</textarea></td>
			</tr>
		</table>	
	</form>
	<div class="btn">
		<input type="button" value="회원 프로필 업데이트" onclick="javascript:checkWrite()">
	</div>
</div>
<%@ include file="/WEB-INF/views/layout/footer.jsp" %>
