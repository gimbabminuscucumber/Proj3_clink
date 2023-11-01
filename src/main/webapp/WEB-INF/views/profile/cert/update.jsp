<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/layout/header.jsp" %>
<script type="text/javascript">
	function checkWrite(){
		if(document.update.name.value == ""){
			alert("'자격증'란을 채워주세요");
		}else if(document.update.author.value == ""){
			alert("'발행기관'란을 채워주세요");
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
	<form action="${pageContext.request.contextPath }/profile/cert_update" method="post" name="update">
		<input type="hidden" value="${vo.CERT_NO }" name="cert_no">
	
		<table>														
			<tr>
				<th>자격증</th>
				<tr><td><input type="text" name="name" value="${vo.NAME }"></td>
			</tr>
			<tr>
				<th>발행기관</th>
				<tr><td><input type="text" name="author" value="${vo.AUTHOR }"></td>
			</tr>
		</table>	
	</form>
	<div class="btn">
		<input type="button" value="회원 프로필 업데이트" onclick="javascript:checkWrite()">
	</div>
</div>
<%@ include file="/WEB-INF/views/layout/footer.jsp" %>
