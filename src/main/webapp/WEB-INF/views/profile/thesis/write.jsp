<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/layout/header.jsp" %>
<script type="text/javascript">
	function checkWrite(){
		if(document.write.title.value == ""){
			alert("'제목'란을 채워주세요");
		}else if(document.write.publisher.value == ""){
			alert("'발행인, 출판사'란을 채워주세요");
		}else if(document.write.writer.value == ""){
			alert("'저자'란을 채워주세요");
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
	<form action="${pageContext.request.contextPath }/profile/thesis_write" method="post" name="write">
		<table>														
			<tr>
				<th>제목</th>
				<tr><td><input type="text" name="title" placeholder="ex) 소셜미디어 이용정도가 사회자본에 미치는 영향"></td>
			</tr>
			<tr>
				<th>발행인, 출판사</th>
				<tr><td><input type="text" name="publisher"></td>
			</tr>
			<tr>
				<th>저자</th>
				<tr><td><input type="text" name="writer"></td>
			</tr>
		</table>	
	</form>
	<div class="btn">
		<input type="button" value="회원 프로필 업데이트" onclick="javascript:checkWrite()">
	</div>
</div>
<%@ include file="/WEB-INF/views/layout/footer.jsp" %>
