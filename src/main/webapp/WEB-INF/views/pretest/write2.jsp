<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/layout/header.jsp" %>
<hr>
<script>
    let oCnt = 0;
    const add_box = () => {							// const add_box = function(){  와 동일한 형태 (화살표 함수)
        const box = document.getElementById("box");
        const newP = document.createElement('p');
 		oCnt ++;
		if(oCnt < 3){
	        newP.innerHTML = "보기 ${oCnt} <input type='text' name='opt' size=50 placeholder='오답을 입력하세요.'><input type='button' value='보기 삭제' onclick='remove(this)'>";
 			box.appendChild(newP);
		}else{
			alert('보기는 최대 3개까지만 생성할 수 있습니다.');
		}    	
    }
    const remove = (obj) => {
        document.getElementById('box').removeChild(obj.parentNode);
    }
</script>


<div>
	<form action="${pageContext.request.contextPath }/pretest/write" method="post" name="apply_pretest">
		<table>
			<tr>
				<th>평가 문제 제출방식</th>
				<td>
					<select name="classify">
						<option value="">[필수]제출방식을 선택하세요</option>
						<optgroup label="-----------"></optgroup>
						<option value="0">사이트 양식 사용</option>
						<option value="1">자사 맞춤 문제 작성</option>
					</select>
				</td>
			</tr>
			<tr>
				<th>사전 평가 문제 ${qCnt}</th>
				<td><input type="text" name="question" size=70 placeholder="ex)   "><input type="button" value="문제 추가" onclick="add_question()"></td>
			</tr>
			<tr>
				<th>보기 ${oCnt}</th>
				<td><input type="text" name="opt" size=70 placeholder="정답을 입력하세요.   "><input type="button" value="보기 추가" onclick="add_box()"></td>
			</tr>
			
			<tr id="question"></tr>
			
			<tr>
				<th><td><input type="submit" value="사전평가 등록하기"></td>
			</tr>
		</table>	
	</form>
</div>
