<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:if test="${t != 'm' }">
<div id = "d" style="margin-top:10%; right: 0; position: absolute; padding: 0.5%;	box-shadow: 1px 1px gray; width: 13%; height: 350px">
	<div id = "list">
		<div id = "lhead" style=" margin-bottom: 2%;">조직도 
			<input type = "button" value = "부서추가" onclick="dplus(din)" style="float: right;">
			<img onclick="updateF(list,dupdate)" style="width: 25px; float: right;" alt="" src="data:image/png;base64,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">
		</div>
	<div id = "din" style="display: none;">
		<form action="depinsert">
		부서명<input name = "name" type = "text"><input onclick="dsub(this.form)" type = "button" value = "생성"><input onclick="dcansle(din)" type = "button"value = "취소">
		</form>
	</div>
		<!-- 리스트 -->
		<c:choose>
			<c:when test="${fn:length(dlist) != 0 }">
				<c:forEach var="dlist" items="${dlist }">
					<div>
						<div style="margin-bottom: 2%;">
							${dlist.name} 
							<input onclick="opend(d${dlist.depart_mng_no },this)" type = "button" value = "펼치기" style="float: right;">
						</div>
						<div id="d${dlist.depart_mng_no }" style="margin-left: 20%; display: none;">
							<div>
								<input onclick="dplus(form${dlist.depart_mng_no })" type = "button" value = "직책 추가" style="float: right;">
							</div>
							<div id = "form${dlist.depart_mng_no }" style="display: none;">
								<form action="posiinsert">
									<input name = "depart_mng_no" value = "${dlist.depart_mng_no}" type = "hidden" >
									직책명<input name = "name" type = "text"><input onclick="dsub(this.form)" type = "button" value = "생성">
									<input onclick="dcansle(form${dlist.depart_mng_no })" type = "button"value = "취소">
								</form>
							</div>
							<c:choose>
								<c:when test="${fn:length(pMap[dlist.depart_mng_no]) != 0 }">
								<c:forEach var="plist" items="${pMap[dlist.depart_mng_no] }" >
									<div style="clear: both;">
									${plist.name }
									</div> 
								</c:forEach>
								</c:when>
								<c:otherwise>
									<div style="clear: both;">
										직책이 비었습니다
									</div>
								</c:otherwise>
							</c:choose>
						</div> 
					</div>
				</c:forEach>
			</c:when>
			<c:otherwise>
				아직 부서가 없습니다
			</c:otherwise>
		</c:choose>
	</div>
	<!--  업데이트를 위한 폼 -->
	<div id = "dupdate" style="display:  none">
		<form id = "dup" action="departUp">
		<div id = "uphead">
			<a onclick="dup.submit()">✔️</a><a onclick="updateF(list,dupdate)">❌</a>
		</div>
		<c:forEach var="dlist" items="${dlist }">
			<div>
				<div style="margin-bottom: 2%;">
					<input name = "departNo" type = "hidden" value = "${dlist.depart_mng_no }">
					<input name = "departName" size="10" type = "text" value = "${dlist.name}">
					<input onclick="opend(dd${dlist.depart_mng_no },this)" type = "button" value = "펼치기" style="float: right;">
					<a onclick="ddel('${dlist.depart_mng_no }')" style="float: right;">✖️</a>
				</div>
				<div id="dd${dlist.depart_mng_no }" style="margin-left: 20%; display: none;">
					<c:choose>
						<c:when test="${fn:length(pMap[dlist.depart_mng_no]) != 0 }">
							<c:forEach var="plist" items="${pMap[dlist.depart_mng_no] }" >
								<div style="clear: both;">
									<input name = "psNo" type = "hidden" value = "${plist.posi_mng_no }">
									<input name = "psName" type = "text" value = "${plist.name }">
									<a onclick="pdel('${plist.posi_mng_no }')" style="float: right;">✖️</a>
								</div> 
							</c:forEach>
							</c:when>
							<c:otherwise>
								<div style="clear: both;">
									직책이 비었습니다
								</div>
							</c:otherwise>
						</c:choose>
					</div>
				</div>
		</c:forEach>
		</form>
	</div>
</div>
</c:if>
<script>
	function dplus(t) {
		t.style.display = "";
	}
	function dcansle(t) {
		t.style.display = "none";
	}
	
	function dsub(f) {
		f.submit();
	}
	function opend(td,t) {
		let tf = td.style.display == "none";
		td.style.display = tf ? "" : "none";
		t.value = tf ? "접기" : "펼치기";
	}
	function opendd(td,t) {
		let tf = td.style.display == "none";
		td.style.display = tf ? "" : "none";
		t.value = tf ? "접기" : "펼치기";
	}
	function updateF(t1,t2) {
		let tf = t2.style.display == "none";
		t1.style.display = tf ? "none" : "";
		t2.style.display = tf ? "" : "none";
	}
	
	
	
	function ddel(no) {
		if(confirm("삭제하시겠습니까?"))
			document.location.href='departdel?url='+no;
	}
	
	function pdel(no) {
		if(confirm("삭제하시겠습니까?"))
			document.location.href='psdel?url='+no;
	}
</script>