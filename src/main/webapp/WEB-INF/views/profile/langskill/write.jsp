<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/layout/header.jsp" %>
<script type="text/javascript">
	function checkWrite(){
		if(document.write.lang_no.value == ""){
			alert("'외국어'란을 채워주세요");
		}else if(document.write.lv.value == ""){
			alert("'수준'란을 채워주세요");
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
	<form action="${pageContext.request.contextPath }/profile/langskill_write" method="post" name="write">
		<table>														
			<tr>
				<th>외국어</th>
				<tr><td>
				 	<select name="lang_cno">
						<c:forEach var="i" items="${llist }">
							<option value="${i.lang_cno }">${i.name }</option>
						</c:forEach>
					</select>
					</td>
			</tr>			
			<tr>
				<th>수준</th>
				<tr><td>
					<select name="lv">
						<option value="">[필수]외국어 수준을 선택하세요</option>
						<optgroup label="-----------"></optgroup>
						<option value="0">초급</option>
						<option value="1">중급</option>
						<option value="2">상급</option>
						<option value="3">고급</option>
						<option value="4">원어민</option>
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
