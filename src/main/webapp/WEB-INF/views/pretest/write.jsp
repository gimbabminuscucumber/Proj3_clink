<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/layout/header.jsp" %>
<hr>
<script src="https://code.jquery.com/jquery-latest.min.js"></script>

<script>
    $(document).ready(function (){
    // $(function(){});	로 줄여서 쓸 수 있음
    
        var testForm = $("#testForm")
        var idx = 0

        $("#insertButton").on("click", function (){
            if(idx == 5){
                alert("5개 까지만 됩니다.")
                return false;
            }

            var newDiv = document.createElement("div")				// "div"라는 요소를 생성하는 newDiv라는 변수
            newDiv.setAttribute("class", "newDiv")					// setAttribute = 태그 속성 추가
            														// - "class"속성은 "newDiv"
            
			var newInput = document.createElement("input")			// document.createElement(태그이름)	: 엘리먼트 생성
            newInput.setAttribute("id", "newInput"+idx)				// "id" 속성은 "newInput" + idx
            newInput.setAttribute("type", "text")
            //newInput.setAttribute("value", newInput.id)			// "value" 속성은 newInput.id
            // 대체 or 변경
            //newInput.setAttribute("value", newInput.attr("id"))	// 오류로 불가
            newInput.setAttribute("value", "문제" + (idx + 1))		// 가능
            
            var removeInput = document.createElement("span")		// span : 문장 단위로 텍스트 영역을 지정 / 태그명으로 사용됨
																	// div	: 문단 단위의 영역을 지정
            removeInput.setAttribute("class", "removeInput")
            removeInput.textContent = "지우자"						// removeInput의 텍스트는 "지우자"
            
            // 결과물
//          <div class="newDiv">
//  	        <input type="text" id="newInput" value="newInput.id">
//  	        <span class="removeInput"> "지우자" 
//          </div>

            newDiv.append(newInput)									// newDiv라는 부모노드 안에 newInput이라는 자식노드를 추가
            newDiv.append(removeInput)
            testForm.append(newDiv)									// testForm이라는 부모노드 안에 newDiv라는 자식노드를 추가

           	idx+=1
            $("#showidx").text(idx)									// "showidx"라는 id 값의 text에 idx넣어서 불러오기($) - jQuery 사용

        })

        $(document).on("click", ".removeInput", function () {		// "removeInput"클래스 클릭시, function() 함수 실행
        //$(".removeInput").on("click", function () {				// - 위 코드와 동일
            $(this).parent(".newDiv").remove()						// 해당 함수의 부모인 "newDiv"의 remove() 실행
            resetidx()												// - resetidx() 실행 
        })

        function resetidx(){
        	idx = 0
            testForm.children('div').each(function (){					// tesetForm의 자식노드('div')의 각각의 기능 실행
                var target = $(this).children(idx, 'input[type=text]')	// target 변수에 해당 함수에서 자식노드의 idx에 input type은 text
                target.attr("id", "newInput"+idx)						// target 변수의 "id"는 "newInput" + idx
                //target.attr("value", target.attr("id"))					
                target.attr("value", "문제" + (idx + 1))					
                idx+=1
            })
            $("#showidx").text(idx)
        }

        $("#readInputs").on("click", function () {
            var result = ""
            testForm.children('div').each(function (){
                var target = $(this).children(idx, 'input[type=text]')
                result+=target.attr("id")+":"+target.val()+", "
            })
            alert(result)
        })

        $("#insertButton").trigger("click")
        $("#showidx").text(idx)

    });

</script>
<div>
    총 갯수 : <span id="showidx"></span> / 5
    <input type="button" id="insertButton" value="추가하기">
    <input type="button" id="readInputs" value="읽기">
    <form id="testForm">
    
    </form>
    
<!--     <span id="insertButton" style="font-size: larger">복사하기</span> -->
<!--     <span id="readInputs" style="font-size: larger">읽기</span> -->
<!--     <form id="testForm"> -->
<!--     </form> -->
</div>
