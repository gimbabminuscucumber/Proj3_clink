<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/layout/header.jsp" %>
<script type="text/javascript">
	function checkWrite(){
		if(document.write.name.value == ""){
			alert("'수료증'란을 채워주세요");
		}else if(document.write.posi.value == ""){
			alert("'직책''란을 채워주세요");
		}else if(document.write.text.value == ""){
			alert("'설명''란을 채워주세요");
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
	<form action="${pageContext.request.contextPath }/profile/inscert_write" method="post" name="write">
		<input type="hidden" value="${vo.ORG_NO }" name="org_no">
		<table>			
			<tr>
				<th>사회활동</th>
				<tr><td>
				 	<select name="socialact_cno">
						<c:forEach var="i" items="${slist }">
							<option value="${i.socialact_cno }">${i.name }</option>
						</c:forEach>
					</select>
				</td>
			</tr>											
			<tr>
				<th>단체명</th>
				<tr><td><input type="text" name="name"></td>
			</tr>
			<tr>
				<th>직책</th>
				<tr><td><input type="text" name="posi"></td>
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
				<th>설명</th>
				<tr><td><textarea rows="15" cols="65" name="text"></textarea></td>
			</tr>
		</table>	
	</form>
	<div class="btn">
		<input type="button" value="회원 프로필 업데이트" onclick="javascript:checkWrite()">
	</div>
</div>
<%@ include file="/WEB-INF/views/layout/footer.jsp" %>
