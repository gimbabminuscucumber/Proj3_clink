<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/layout/header.jsp" %>
<script type="text/javascript">
	function checkWrite(){
		if(document.write.company.value == ""){
			alert("'회사명'란을 채워주세요");
		}else if(document.write.posi.value == ""){
			alert("'직책'란을 채워주세요");
		}else if(document.write.task.value == ""){
			alert("'직무'란을 채워주세요");
		}else if(document.write.empl_type_cno.value == 0){
			alert("'고용 형태'란을 채워주세요");
		}else if(document.write.city_cno.value == 0){
			alert("'근무 국가/도시'란을 채워주세요");
		}else if(document.write.jarea_cno.value == 0){
			alert("'고용직군'란을 채워주세요");
		}else{
			document.write.submit();
		}
	}
	
	function showDate(check){
		if(check.checked == true){
			console.log('체크');
			document.querySelector("#imDate").style.display = 'none';			// 숨김처리
		}
		if(check.checked == false){
			console.log('체크 해제');
			document.querySelector("#imDate").style.display = 'block';
			
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
<form action="${pageContext.request.contextPath }/profile/career_write" method="post" name="write">
	<div align="center">
		<div>회사명
			<input type="text" name="company" value="${vo.COMPANY }">
		</div><br>
		<div>직책
			<input type="text" name="posi" value="${vo.POSI }">json 데이터 활용 예정
		</div><br>
		<div>직무
			<input type="text" name="task" value="${vo.TASK }">json 데이터 활용 예정
		</div><br>
		<div>고용형태
			<select name="empl_type_cno">
				<c:forEach var="i" items="${elist }">
					<option value="${i.empl_type_cno }">${i.empl_type }</option>
				</c:forEach>
			</select>
		</div><br>
		<div>근무 국가/도시
			<select name="city_cno">
				<c:forEach var="i" items="${clist }">
					<option value="${i.city_cno }">${i.ctname }</option>
				</c:forEach>
			</select>
		</div><br>
		<div>고용직군
			<select name="jarea_cno">
				<c:forEach var="i" items="${jlist }">
					<option value="${i.jarea_cno }">${i.jarea_type }</option>
				</c:forEach>
			</select>
		</div><br>
		<div>
			
			<input type="checkbox" name="stat" id="checkStat" onchange="showDate(this)" >현재 이 업무로 근무 중
<!-- 		<input type="radio" value="0" name="stat">퇴사 -->
<!-- 		<input type="radio" value="1" name="stat" checked>재직중 -->
		</div><br>
		<div>
			시작일
			<input type="date" name="start_date">
		</div><br>
		<div style="display: block;" id="imDate">
			종료일
			<input type="date" name="end_date" id="end_date" >
		</div><br>
	</div>
</form>

<div class="btn" align="center">
	<input type="button" value="회원 프로필 업데이트" onclick="javascript:checkWrite()">
</div>
<%@ include file="/WEB-INF/views/layout/footer.jsp" %>
