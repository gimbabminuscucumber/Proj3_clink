<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/cLayout/header.jsp" %>
<script type="text/javascript">
	var cnt = 0;

	const addForm = () => {
		const box = document.getElementById("box");
		const newP = document.createElement('p');
		
		if(cnt < 4){
			/* newP.innerHTML = "<div>자기소개서 제목<input type='text' name='title' placeholder='최대 100자까지 입력가능'></div><div>자기소개서 내용<textarea rows='15' cols='65' name='detail' placeholder='최대 1,333자까지 입력가능'></textarea></div><input type='button' value='삭제' onclick='remove(this)'>" */
			
			newP.innerHTML = "<div id='resume'><table><tr><th>제목</th><td><input type='text' name='title' placeholder='최대 100자까지 입력가능'></tr><tr><th>내용</th><td><textarea rows='5' cols='65' name='detail' placeholder='최대 1,333자까지 입력가능'></textarea></tr></table></div><div><input type='button' value='삭제' onclick='remove(this)'></div>"
			
			
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

	function checkWrite(){
		if(document.apply.title.value == ""){
			alert("'제목'란을 채워주세요");
		}else if(document.apply.detail.value == ""){
			alert("'내용'란을 채워주세요");
		}else{
			document.apply.submit();
		}
	}
</script>
<div align="center">
	<form action="${pageContext.request.contextPath }/apply/write" method="post" name="apply">
	<p style="font-weight: bold; font-size: 20px;">이력서 작성
	<div id="resume">
		<table>
			<tr>
				<th>제목</th>
					<td><input type="text" name="title" placeholder="최대 100자까지 입력가능">
			</tr>
			<tr>
				<th>내용</th>
					<td><textarea rows="5" cols="65" name="detail" placeholder="최대 1,333자까지 입력가능"></textarea>
			</tr>
		</table>
	</div>
	<div id="box">
		<input type="button" value="추가" onclick="addForm()">
		<input type="button" value="저장"	 onclick="javascript:checkWrite()">
	</div>
		
			<!-- 
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
			-->
	</form>
</div>

<%@ include file="/WEB-INF/views/layout/footer.jsp" %>
