<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript">
	var cnt = 0;
	
	const addForm = () => {
		const box = document.getElementById("box");
		const newP = document.createElement('p');
		
		if(cnt < 4){
			newP.innerHTML = "<div>자기소개서 제목<input type='text' name='title' placeholder='최대 100자까지 입력가능'></div><div>자기소개서 내용<textarea rows='15' cols='65' name='detail' placeholder='최대 1,333자까지 입력가능'></textarea></div><input type='button' value='삭제' onclick='remove(this)'>"
			box.appendChild(newP);
			cnt += 1;
			console.log(cnt);
		}else{
			console.log("5개 이상 생성할 수 없습니다.");
			alert("5개 이상 생성할 수 없습니다.");
			return false;
			
		}
	}
	const remove = (obj) =>{
		document.getElementById('box').removeChild(obj.parentNode);
		cnt -=1;
		console.log(cnt);
	}
	

</script>
<%@ include file="/WEB-INF/views/layout/header.jsp" %>
<hr>
<div align="center">
	<form action="${pageContext.request.contextPath }/apply/write" method="post" name="apply_write">
		<div>회원 프로필 정보 가져오기 (수정 가능한 폼으로)</div>
		<div>
			<div>자기소개서 제목
				<input type="text" name="title" placeholder="최대 100자까지 입력가능">
			</div>
			<div>자기소개서 내용
				<textarea rows="15" cols="65" name="detail" placeholder="최대 1,333자까지 입력가능"></textarea>
			</div>
			<div id="box">
				<input type="button" value="추가" onclick="addForm()">
				<input type="submit" value="저장하기">
			</div>
			<div>입력하는 length를 실시간으로 표기 '14/1,333'</div>
		</div>
	</form>
</div>

<%@ include file="/WEB-INF/views/layout/footer.jsp" %>
