<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/layout/header.jsp" %>
<hr>
<script src="https://code.jquery.com/jquery-latest.min.js"></script>

<style>
/* 	.qDiv{ */
/* 		margin: 0 auto; */
/* 		test_align: left; */
/* 		border: 1px solid; */
/* 		width: 20%; */
/* 	} */
</style>
<div id = 'main'>
    문제 : <span id="qIdx"></span> / 3
    <input type="button" id="qBtn" onclick="question()" value="문제 추가하기"><br> 
    보기 : <span id="optIdx"></span> / 5
    
    
<!-- js 구현 예시 -->
<!-- 	<div class="qDiv"> -->
<!-- 		<div class="qForm"> -->
<!-- 			<input id="qInput">문제1 -->
<!-- 			<div class="optFormList"> -->
<!-- 				<div id="optInput">보기1</div> -->
<!-- 				<div id="optInput">보기2</div> -->
<!-- 			</div> -->
<!--     	</div> -->
<!-- 	</div> -->
	

</div>

<script>

	var qForm = null;
	var qIdx = 0
	
	function optAdd(t) {
		
		if(optIdx == 5){
			alert("문제는 5개까지만 생성됩니다")
			return
		}

		var optInput = document.createElement("input")		// input 생성
		optInput.setAttribute("id", "optInput" + optIdx)
		optInput.setAttribute("type", "text")
		optInput.setAttribute("value", "보기")
		
// 		console.log(Array.from(qForm.children).length)
// 		console.log(Array.from(qForm.children))

		let newbr = document.createElement('br');
		
		t.parentElement.querySelector('.optFormList').append(optInput)
		t.parentElement.querySelector('.optFormList').append(newbr);

	
		optIdx += 1 
	}
	
	function optRemove(){
		
	}
	
	function question(){
		
		if(qIdx == 3){
			alert("문제는 3개까지만 생성됩니다")
			return
		}
		var qDiv = document.createElement("div")		// qdiv, div생성
		qDiv.setAttribute("class", "qDiv")
		
		qForm = document.createElement("div")			// qForm, div 생성
		qForm.setAttribute("class", "qForm")

		var qInput = document.createElement("input")	// input 생성
		qInput.setAttribute("id", "qInput" + qIdx)
		qInput.setAttribute("type", "text")
		qInput.setAttribute("value", "문제" + (qIdx+1))
		
		var optFormList = document.createElement("div")		// optFormList, div 생성
		optFormList.setAttribute("class", "optFormList")
		
		var add = document.createElement("input") 
		add.setAttribute("id", "add")
		add.setAttribute("type", "button")
		add.setAttribute("value", "+")
		add.setAttribute("onclick", "optAdd(this)")
		
		var remove = document.createElement("input")
		remove.setAttribute("id", "remove")
		remove.setAttribute("type", "button")
		remove.setAttribute("value", "-")
		remove.setAttribute("onclick", "optRemove(this)")
		
		qForm.append(qInput)
		qForm.append(add)
		qForm.append(remove)
		qForm.append(optFormList)
		qDiv.append(qForm)
		main.append(qDiv)
		
		qIdx += 1
		$("#qIdx").text(qIdx)
		optAdd(add)
	}

	$("#qIdx").text(qIdx)
		
</script>