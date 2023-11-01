<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<link rel="stylesheet" href="http://${pageContext.request.serverName }:${pageContext.request.serverPort }${pageContext.request.contextPath }/resources/css/main.min.css">
<link rel="stylesheet" href="http://${pageContext.request.serverName }:${pageContext.request.serverPort }${pageContext.request.contextPath }/resources/css/style.css">
<link rel="stylesheet" href="http://${pageContext.request.serverName }:${pageContext.request.serverPort }${pageContext.request.contextPath }/resources/css/color.css"> 
<link rel="stylesheet" href="http://${pageContext.request.serverName }:${pageContext.request.serverPort }${pageContext.request.contextPath }/resources/css/responsive.css">
<style>
	#company_name{
		color: blue;
		font-weight: bold;
	}
	
	#jpost_title{
		font-size: 20px;
	}
	
	#apply_top{
		width: 80%;
		text-align: left;
		margin: auto;
	}

	#apply_body{
		width: 80%;
		border: 1px solid blue;
		text-align: left;
		margin: auto;
	}
	
	#apply_bottom{
		width: 80%;
		text-align: left;
		margin: auto;
	}
	
</style>

<div align="center">
	<div id="apply_top">
		<div id="company_name" style="height: 40px;">지원하려는 회사명</div>				
		<div id="jpost_title">지원하려는 회사의 채용공고 제목</div>	
	</div>
	<section>
		<div class="gap gray-bg">
			<div id="apply_body">
<%-- 				<input type="hidden" value="${jvo.JPOST_ID }" name="jpost_id"> 	<!-- jpost_id 보내기 위한 코드 --> --%>
				<c:choose>						
					<c:when test="${apply_vo == null }">	<!-- controller에서 list의 데이터를 뽑아 쓰기 위해 사용하는 코드 -->
						<tr>
							<td>
								<a href="${pageContext.request.contextPath }/apply/writeform" title="">
									<span style="font-weight: bold;">자기소개서 작성하기</span>
								</a>
							</td>
						</tr>
					</c:when>
					<c:otherwise>
						<c:forEach var="avo" items="${apply_vo }" varStatus="i">	
							<form action="${pageContext.request.contextPath }/apply/submit" method="post" name="submitform">
								<table>
									<tr>												
										<td><strong>지원이력서</strong></td>
										<td><a href="${pageContext.request.contextPath }/apply/content?no=${avo.APPLY_ID }">${avo.TITLE }</a></td>
									</tr>
									<tr>
										<td><strong>작성일</strong></td>
										<td><fmt:formatDate value="${avo.APPLY_DATE }" pattern="yyyy-MM-dd"/></td> 
									</tr>
								</table>
							</form>
						</c:forEach>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
	</section>
	<section>
		<div id="apply_bottom">
		* 개인정보보호를 위해 개인정보가 포함된 파일은 사전동의 없이 삭제될 수 있습니다.<br>
		* 제출서류는 채용 마감 후 90일까지 지원기업에게 제공됩니다.<br>
		제출에 동의할 경우에만 [제출하기] 버튼을 클릭해 주세요.<br>
		동의하지 않을 경우 입사지원이 불가능합니다.<br><br>
		</div>
		<div>
			<input type="submit" value="제출하기" onclick="document.submitform.submit()">
		</div>
	</section>
</div>
	
<%@ include file="/WEB-INF/views/layout/footer.jsp" %>	