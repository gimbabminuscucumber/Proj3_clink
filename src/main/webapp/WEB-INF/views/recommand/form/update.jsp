<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/layout/header.jsp" %>
<script type="text/javascript">
	function checkWrite(){
		if(document.update.detail.value == ""){
			alert("'추천 내용'란을 채워주세요");
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
<!-- 요청 추천서-->
<div align="center">
	<p style="font-weight: bold; font-size: 20px;">추천서 수정
	<div id="rec">
		<table>
			<tr>
				<th>요청자</th>
				<tr><td>${vo.TO_MEMBER} (${vo.RELATION })</td>
			</tr>
			<tr>
				<th>요청사항</th>
				<tr><td>${vo.CONTENT }</td>
			</tr>
		</table>
	</div>
</div>
	
<div align="center">
	<form action="${pageContext.request.contextPath }/recommand/form_update" method="post" name="update">
		<input type="hidden" value="${vo.REC_FORM_ID }" name="rec_form_id">
	
		<table>														
			<tr>
				<th>추천 내용</th>
				<tr><td><input type="text" name="detail" value="${vo.DETAIL }"></td>
			</tr>
		</table>
	</form>
	<div class="btn">
		<input type="button" value="추천서 수정완료" onclick="javascript:checkWrite()">
	</div>
</div>
<%@ include file="/WEB-INF/views/layout/footer.jsp" %>
