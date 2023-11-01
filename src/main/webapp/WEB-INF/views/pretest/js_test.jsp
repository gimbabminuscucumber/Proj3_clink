<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">

	function hasCola(str){
		
		if(str.indexOf("콜라") > -1){			// indexOf 함수는 찾는 문잦열이 없으면 -1을 리턴, 
			console.log("금칙어가 있습니다");	
		}else{
			console.log("통과")
		}
	}

	hasCola("와 사이다가 짱이야!");	// index = -1
	hasCola("콜라가 짱이야");		// index = 0
	hasCola("콜라");				// index = 0
	
	
	const strd = "abcde";
	
	document.writeln(strd.indexOf('ab'));
	document.writeln(strd.indexOf('ba'));
	document.writeln(strd.indexOf('abc'));
	document.writeln(strd.indexOf('AB'));
	
	console.log(strd.indexOf('ab'));	// 0	>> 해당하는 문자가 있으니까
	console.log(strd.indexOf('ba'));	// -1	>> 해당하는 문자가 없어서
	console.log(strd.indexOf('abc'));	// 0
	console.log(strd.indexOf('AB'));	// -1
	
</script>
<body>
</body>
</html>