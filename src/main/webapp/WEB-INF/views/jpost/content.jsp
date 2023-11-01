<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="/WEB-INF/views/cLayout/header.jsp" %>
<link rel="stylesheet" href="jpost/resources/css/style.css">

<script type="text/javascript"> 
//     //var a = true; 
//     function doDisplay(){ 	
//         var b = document.getElementById("myDIV"); 	
        
//         if(b.style.display== 'none'){ 		
//             b.style.display = 'block'; 	
//         }else{ 		
//             b.style.display = 'none'; 	
//         } 
//     } 

// var를 이용해 전역변수를 만들면 window객체에 key와 value로 추가되지만,
// let이나 const를 이용해 전역변수를 만들면 window 객체에 추가되지는 않는다.
// WINDOW는 브라우저 창이고, DOCUMENT는 브라우저 창 내의 HTML 문서 객체

	function showApply(){
		var newWindow = window.open("/clink/apply/submitform?no=${vo.JPOST_ID}" , "MyApply", "width = 500, height = 700, menubar = yes, location = yes, resizable = yes, scrollbars = yes, status = yes");
		newWindow.addEventListener("beforeunload", () => {
			console.log('종료')
		})
	}														<!-- 자바 = server 언어 / js = client 언어 >> el로 통일을 시킨다-->

	function closeApply(){
		//window.close();
	}

</script> 
<style>
	.parent{
		position: relative;
		top: auto;
		left: auto;
		bottom: auto;
		right: auto;
	
	}
	
	.child{
		position: fixed;
		top: 100px;
		left: 20%;
		width: 30%;
		background: white;
		box-shadow: 0px 0px 20px #000;
	}
	
</style>
<div class="parent">
	<section>
		<div class="gap gray-bg">
			<div class="container">
				<div class="row" id="page-contents">
					<div class="col-lg-6">
						<div class="employer-info">
							<i>search job</i>
							<h2>${vo.TITLE }</h2>
							<ul>
								<li><span>Industry:</span> <i>${vo.JAREA_TYPE }</i></li>
								<li><span>Position:</span> <i>${vo.POSI_TYPE } / ${vo.EMPL_TYPE }</i></li>
								<li><span>Career:</span> <i>${vo.LV_TYPE }</i></li>
								<li><span>Task:</span> <i>${vo.TASK }</i></li>
								<li><span>Work Time:</span> <i>${vo.WORKTIME_TYPE }</i></li>
								<li><span>Education:</span> <i>${vo.SCHOOL_TYPE }</i></li>
								<li><span>Location:</span> <i>${vo.LOCATE }</i></li>
								<li><span>Closing Date:</span> 
									<i>
										<fmt:formatDate value="${vo.END_DATE }" pattern="yyyy-MM-dd"/> / 
										<c:if test="${vo.STAT == 0 }">마감</c:if>
										<c:if test="${vo.STAT == 1 }">진행중</c:if>
									</i>
								</li>
							</ul>
						</div>
					</div>
					<div class="col-lg-6">
						<div class="salary-area">
							<h4>₩ ${vo.SALARY }</h4>
							<span>min salary</span>
							<ul class="sociaz-media">
								<li>
									<a title="" href="#" class="facebook"><i class="fa fa-facebook-square"></i> facebook</a>
								</li>
								<li>
									<a title="" href="#" class="google"><i class="fa fa-google-plus-square"></i> Google+</a>
								</li>
								<li>
									<a title="" href="#" class="pinterest"><i class="fa fa-pinterest-square"></i> Pinterest</a>
								</li>
								<li>
									<a title="" href="#" class="twitter"><i class="fa fa-twitter-square"></i> Twitter</a>
								</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	
	<section>
		<div class="gap">
			<div class="container">
				<div class="row">
					<div class="col-lg-8">
						<div class="job-detail">
							<h3>Opportunity Detail</h3>
							<p>${vo.DETAIL }</p>
							<h5>Qualification & Requirements  >> 업무에 필요한 능력을 적을까? 어떻게??</h5>
							<ul>
								<li>
									<i class="fa fa-check"></i>
									<span>Undergraduate degree in addition to a Master's degree or 1 - 3 years of work experience after completing an undergraduate degree</span>
								</li>
								<li>
									<i class="fa fa-check"></i>
									<span>Outstanding record of academic achievement</span>
								</li>
								<li>
									<i class="fa fa-check"></i>
									<span>Demonstrated aptitude for analytics</span>
								</li>
								<li>
									<i class="fa fa-check"></i>
									<span>Proven record of leadership in a work setting and/or through extracurricular activities</span>
								</li>
								<li>
									<i class="fa fa-check"></i>
									<span>Exceptional analytical and quantitative problem-solving skills</span>
								</li>
								<li>
									<i class="fa fa-check"></i>
									<span>Ability to work collaboratively in a team environment and effectively with people at all levels in an organization</span>
								</li>
								<li>
									<i class="fa fa-check"></i>
									<span>Ability to communicate complex ideas effectively - both verbally and in writing - in English and the local language</span>
								</li>
							</ul>
							<div class="apply-bttons">
<!-- 방식 1. 새로운 창으로 넘어감	 	<a href="${pageContext.request.contextPath}/apply/submitform?no=${vo.JPOST_ID}" title=""> Apply </a> -->
<!-- 방식 2. display: relative;	<a href="javascript:doDisplay();"> Apply </a>--> 
<!-- 방식 3. window.open()	-->	
								<c:if test="${vo.HOWTO == 0 }">
									<a href="#" onclick="showApply()"> Apply </a>	<!-- 채용공고 id 넘기는 방법은? -->
								</c:if>
								<c:if test="${vo.HOWTO == 1 }">
									<a href="http://${vo.URL }" target=”_blank”> Apply in HomePage</a>	<!-- 채용공고 id 넘기는 방법은? -->
								</c:if>

								<a href="#" title=""> Visit Site </a>
							회원 전용 버튼
							회원만 보임 / 채용팀은 안보임 > 유저로 구분
							</div>
							
							<div class="apply-bttons">	
								<a href="${pageContext.request.contextPath}/jpost/updateform?no=${vo.JPOST_ID }" title=""> Edit </a>
								<a href="${pageContext.request.contextPath}/jpost/hidden?no=${vo.JPOST_ID }" title=""> Delete </a>
								<a href="${pageContext.request.contextPath}/jpost/list" title=""> List </a>
							채용담당자 전용 버튼
							채용팀만 보임 / 회원은 안보임 > 유저로 구분
							</div>
						</div>
					</div>
					<div class="col-lg-4">
						<div class="company-intro">
							<h4>Little about company   >> 회사 소개 끌어오기</h4>
							<figure><img src="images/resources/facebook-office.jpg" alt=""></figure>
							<p>
								I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes,
							</p>
							<a href="#" title="">Read more</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
		
	<div class="child" id="myDIV" style='display:none;'>
		<div>특정 유자가 쓴 자소사만 나오게</div>
		<c:choose>						
			<c:when test="${apply_vo == null }">	<!-- controller에서 list의 데이터를 뽑아 쓰기 위해 사용하는 코드 -->
				<tr>
					<td colspan="11">
						<a href="${pageContext.request.contextPath }/applys/writeform" title="">
							<span style="font-weight: bold;">자기소개서 작성하기</span>
						</a>
					</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach var="vo" items="${apply_vo }" varStatus="i">	
					<form action="${pageContext.request.contextPath }/apply/submit" method="post" name="submit">
	<%-- 						<input type = "hidden" value = "${i.index }" name = no> 				 --%>
						<table>
							<tr>												
								<td><strong>지원서 제목</strong></td>
								<td><a href="${pageContext.request.contextPath }/apply/content?no=${vo.APPLY_ID }">${vo.TITLE }</a></td>
							</tr>
							<tr>
								<td><strong>작성일</strong></td>
								<td><fmt:formatDate value="${vo.APPLY_DATE }" pattern="yyyy-MM-dd"/></td> 
							</tr>
							
							<tr>
							<th>
								<input type="submit" value="제출하기" onclick="document.submit.submit()">
							</th>
							</tr>
						</table>
					</form>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</div>
</div>	
</div>
<%@ include file = "/WEB-INF/views/cLayout/footer.jsp" %>