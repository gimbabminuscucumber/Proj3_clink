<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/layout/header.jsp" %>
<script type="text/javascript">
	function checkWrite(){
		if(document.career_write.company.value == ""){
			alert("'회사명'란을 채워주세요");
		}else if(document.career_write.posi.value == ""){
			alert("'직책'란을 채워주세요");
		}else if(document.career_write.task.value == ""){
			alert("'직무'란을 채워주세요");
		}else{
			document.career_write.submit();
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
	<form action="${pageContext.request.contextPath }/profile/career_write" method="post" name="career_write">
		<table>														
			<tr>
				<th>회사명</th>
				<tr><td><input type="text" name="company" placeholder="ex) 네이버"></td>
			</tr>
			<tr>
				<th>직책</th>
				<tr><td><input type="text" name="posi" placeholder="ex) 팀장">json 데이터 활용 예정</td>
			</tr>
			<tr>
				<th>직무</th>
				<tr><td><input type="text" name="task" placeholder="ex) 웹디자이너">json 데이터 활용 예정</td>
			</tr>
			<tr>
				<th>고용형태</th>
				<tr><td>
				 	<select name="empl_no">
						<c:forEach var="i" items="${elist }">
							<option value="${i.empl_type_cno }">${i.empl_type }</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<th>근무 국가/도시</th>
				<tr><td>
				 	<select name="city_no">
						<c:forEach var="i" items="${clist }">
							<option value="${i.city_cno }">${i.ctname }</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<th>재직상태</th>
				<tr><td>
					<input type="radio" value="0" name="stat">퇴사
					<input type="radio" value="1" name="stat" checked>재직중
				</td>
			</tr>
			<tr>
				<th>업계</th>
				<tr><td>
				 	<select name="jarea_no">
						<c:forEach var="i" items="${jlist }">
							<option value="${i.jarea_cno }">${i.jarea_type }</option>
						</c:forEach>
					</select>
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
		</table>	
	</form>
	<div class="btn">
		<input type="button" value="회원 프로필 업데이트" onclick="javascript:checkWrite()">
	</div>
</div>
<%@ include file="/WEB-INF/views/layout/footer.jsp" %>
