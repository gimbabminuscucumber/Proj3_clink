<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/layout/header.jsp" %>
<script type="text/javascript">
	function checkWrite(){
		if(document.inscert_write.name.value == ""){
			alert("'수료증'란을 채워주세요");
		}else if(document.inscert_write.author.value == ""){
			alert("'발행기관'란을 채워주세요");
		}else{
			document.inscert_write.submit();
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
	<form action="${pageContext.request.contextPath }/profile/inscert_write" method="post" name="inscert_write">
		<table>														
			<tr>
				<th>수료증</th>
				<tr><td><input type="text" name="name" placeholder="ex) 공연자 안전교육"></td>
			</tr>
			<tr>
				<th>발행기관</th>
				<tr><td><input type="text" name="author" placeholder="ex) 한국산업기술시험원장"></td>
			</tr>
			<tr>
				<th>발행일</th>
				<tr><td><input type="date" name="date"></td>
			</tr>
		</table>	
	</form>
	<div class="btn">
		<input type="button" value="회원 프로필 업데이트" onclick="javascript:checkWrite()">
	</div>
</div>
<%@ include file="/WEB-INF/views/layout/footer.jsp" %>
