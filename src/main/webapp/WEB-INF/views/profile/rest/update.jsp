<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/layout/header.jsp" %>
<script type="text/javascript">
	function checkWrite(){
		if(document.update.text.value == ""){
			alert("'휴식기 내용'란을 채워주세요");
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
	<form action="${pageContext.request.contextPath }/profile/rest_update" method="post" name="update">
		<input type="hidden" value="${vo.REST_NO }" name="rest_no">
		<table>														
			<tr>
				<th>휴직상태</th>
				<tr><td>
					<input type="radio" value="0" name="stat">휴직 중
					<input type="radio" value="1" name="stat" checked>재직 중
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
				<th>휴식사유</th>
				<tr><td>
				 	<select name="rsn">
						<c:forEach var="i" items="${rrlist }">
							<option value="${i.rest_rsn_no }">${i.rsn }</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<th>휴식기 내용</th>
				<tr><td><textarea rows="15" cols="65" name="text" placeholder="ex) 업종 변경을 위해 해당 전문교육을 수료"></textarea></td>
			</tr>
		</table>	
	</form>
	<div class="btn">
		<input type="button" value="회원 프로필 업데이트" onclick="javascript:checkWrite()">
	</div>
</div>
<%@ include file="/WEB-INF/views/layout/footer.jsp" %>
