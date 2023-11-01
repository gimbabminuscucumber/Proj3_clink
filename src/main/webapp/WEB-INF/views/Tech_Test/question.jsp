<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<form id ="f">
			<table>
				<tr style="height: 80px;">
					<td id = "ques"></td>
				</tr>
				<tbody id = "opts">
				</tbody>
			</table>
			<input name = "sub" type = "button" value = "제출" onclick="examination(this.form)">
			<input name = "next" disabled type = "button" value = "다음" onclick="quesIndex()">
		</form>
		<div id = "timer"><a id = "mm">1</a> : <a id = "sd">30</a>
		</div>
	</div>
<script type="text/javascript">
	let jsonList = ${question};
	let index = 0; 
	let optList = null;
	let answer = 0;
	let thisTr = null
	
	let minute = 1;
	let seconde = 30;

	quesIndex();
	
	
	setInterval(function() { //이걸 와일문이라고 봐도 될거같은데
		mm.innerText = minute;
		sd.innerText = seconde;
		
		if(minute == 0 && seconde == 0){
			alert('시간 종료')
			document.location.href = '${pageContext.request.contextPath}/';
		}
		
		if(seconde == 0){
			minute--;
			seconde = 60;
		}else{
			seconde--;
		}
		
	}, 1000)
	
	
	
	
	function quesIndex() {
		if(jsonList.length  == index)return;
		
		ques.innerText = jsonList[index].question;
		optList = jsonList[index].opts;
		opts.innerHTML = '';
		
		let i = 1;
		optList.forEach(o => {
			if(o.ex_correct == 1 || o.tech_correct == 1)answer = i;
			let newTr = document.createElement('tr');
			newTr.setAttribute("id", i);
			newTr.innerHTML = '<td>'+o.detail+'</td><td><input name = "ck" type = "radio" onclick="thisTr = '+i+'"></td>'
			opts.appendChild(newTr);
			i++;
		})
		f.sub.disabled = false;
		f.next.disabled = true; 
		console.log(answer);
		
		minute = 1;
		seconde = 30;
		
	}
	
	
	function examination(id) {
		let checkR = Array.from(id.ck)
		let check  = true;
		
		checkR.forEach(r => {
			if(r.checked)check = false;
		})
		
		if(check){
			alert('하나를 체크해야합니다')
			return 
		}else{
			checkR.forEach(r => {
				r.disabled = true;
			})
			id.sub.disabled = true;
		}
		
		
		if(thisTr == answer){
			alert('정답');
		}else{
			alert('땡');
		}
		
		index += 1;
		id.next.disabled = false;
		
	}
</script>
</body>
</html>