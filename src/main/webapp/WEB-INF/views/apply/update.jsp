<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<hr>
<script type="text/javascript">

</script>
	
<script>
	var textarea = document.getElementById('#detail');

</script>	
	
<%@ include file="/WEB-INF/views/layout/header.jsp" %>
<hr>
<div align="center">
	<form action="${pageContext.request.contextPath }/apply/update" method="post" name="apply_write">
		<input type="hidden" value="${vo.APPLY_ID }" name="apply_id">
		<input type="hidden" value="${vo.APPLY_FORM_ID }" name="apply_form_id">

		<div>회원 프로필 정보 가져오기 (수정 가능한 폼으로)</div>
		<div>
			<div>자기소개서 제목
				<input type="text" name="title" value="${vo.TITLE }" >
			</div>
			<div>자기소개서 내용
				<textarea rows="15" cols="65" name="detail">${vo.DETAIL}</textarea>
			</div>
			<div>입력하는 length를 실시간으로 표기 '14/1,333'</div>
		</div>
		<div>
			<input type="submit" value="지원서 수정하기">
		</div>
	</form>
</div>
<%@ include file="/WEB-INF/views/layout/footer.jsp" %>