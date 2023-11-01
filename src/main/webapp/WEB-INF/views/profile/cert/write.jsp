<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/layout/header.jsp" %>
<script type="text/javascript">
	function checkWrite(){
		if(document.write.name.value == ""){
			alert("'자격증'란을 채워주세요");
		}else if(document.write.author.value == ""){
			alert("'발행기관'란을 채워주세요");
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
	<form action="${pageContext.request.contextPath }/profile/cert_write" method="post" name="write">
		<table>														
			<tr>
				<th>자격증</th>
				<tr><td><input type="text" name="name" placeholder="ex) 한식 조리 기능사"></td>
			</tr>
			<tr>
				<th>발행기관</th>
				<tr><td><input type="text" name="author" placeholder="ex) 식품의학약품안전처"></td>
			</tr>
		</table>	
	</form>
	<div class="btn">
		<input type="button" value="회원 프로필 업데이트" onclick="javascript:checkWrite()">
	</div>
</div>
<%@ include file="/WEB-INF/views/layout/footer.jsp" %>
