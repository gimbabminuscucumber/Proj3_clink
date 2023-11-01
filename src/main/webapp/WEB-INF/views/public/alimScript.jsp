<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.0/jquery.min.js" integrity="sha512-3gJwYpMe3QewGELv8k/BX9vcqhryRdzRMxVfq6ngyWXwo03GFEzjsUm8Q7RZcHPHksttq7/GFoxjCVUjkjvPdw==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<script type="text/javascript">
	let start = false;
	let remainTime = null;
	sessionStorage.setItem("ㅎㅎ",'ㅎㅎ' )
	let item = JSON.parse(localStorage.getItem("알빠"));
	console.log(item);
	
	let alim = {like : [],content:[],remainTime:null}
	
	window.onload = () => {
		window.onpageshow = function (event) {
			if (event.persisted || event.p) {
				start = false;
				window.location.reload();
			}
		};
		
		if(item != null){
			alim = item;
			remainTime = alim['remainTime'];
			
			console.log(remainTime);
			
			if(!start){
				start = true;
				setTimeout(function() {
					start = false;
					console.log('삭제됨')
					localStorage.removeItem("알빠");
				}, remainTime);
				
				let msTime = setInterval(function() {
					remainTime -= 1000;
					console.log(remainTime+'iign')
					if(remainTime == 0)clearInterval(msTime);
				}, 1000)
			}
		}		
	}
	
	function alimJSON(type,no,answer) {
		if(!start){
			start = true;
			remainTime = 120000;
			setTimeout(function() {
				start = false;
				console.log('삭제됨')
				localStorage.removeItem("알빠");
			}, remainTime);
			
			let msTime = setInterval(function() {
				remainTime -= 1000;
				console.log(remainTime+'ing')
				if(remainTime == 0)clearInterval(msTime);
			}, 1000)
		}
	

		let xcheck = false;
		let xObject = null;

		for (var i = 0; i < alim[type].length; i++) {
			if(Object.keys(alim[type][i]) == no){
				xcheck = true;
				xObject = alim[type][i];
				break;
			}				
		}
		if(xcheck){
			xObject[no] = answer;
		}else{
			alim[type].push({[no]:answer});									
		}
	} 
	
	window.addEventListener('beforeunload', event => {
		console.log(sessionStorage.getItem('ㅎㅎ'))
		if(start){
			alim['remainTime'] = remainTime;
		 	localStorage.setItem("알빠", JSON.stringify(alim));
		}
	});
	window.addEventListener('unload', event => {
		console.log(sessionStorage.getItem('ㅎㅎ'))
	});
</script>