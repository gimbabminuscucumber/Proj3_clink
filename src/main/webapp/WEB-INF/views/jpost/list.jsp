<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>	<!-- date탸입 칼럼의 sysdate을 원하는 날짜 형태로 출력 -->
<style>
	#list{
		margin: 0 auto;
	}
</style>

<script type="text/javascript">		// 무한 스크롤 적용 예정
	<!-- 채용공고 검색 -->
	function check(f){
		if(f.type.value == "title"){
			var num_pattern = /^[0-9]{1,20}$/;
			
			if(f.word.value == "" || !num_pattern.test(f.word.value)){
				alert("채용공고 제목을 입력하세요");
				return false;
			}
		}else if(f.word.value == ""){
			alert("검색어를 입력하세요")
			return false;
		}else if(f.word.value == "locate"){
			var num_pattern = /^[0-9]{1,20}$/;
			
			if(f.word.value == "" || !num_pattern.test(f.word.value)){
				alert("근무지를 입력하세요");
				return false;
			}
		}
		return true;
	}
	
</script>
<%@ include file="/WEB-INF/views/cLayout/header.jsp" %>
<c:set var="cpath" value="${pageContext.request.contextPath	}"/>
	<div id="list">
		<table>
			<tr>
				<th></th>
				<td> Q) 리스트 순서는 시작일, 종료일 내림차순 중 어떤걸로??</td>
			</tr>
			<c:choose>						
				<c:when test="${all_list == null }">
					<tr>
						<td colspan="11">
							<span style="font-weight: bold;">채용공고 글이 없다요</span>
						</td>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach var="vo" items="${all_list }">			<!-- items는 model이나 request에서 Attribute로 보낸 데이터들과 동일한 변수명을 사용 -->
						<tr>											<!-- - empl_list 만들면서 list형태가 아닌 map형태가 되어 밑에 코드들의 칼럼명은 대문자로 -->
							<td><strong>채용공고 제목</strong></td>
							<td><strong><a href="${pageContext.request.contextPath }/jpost/content?no=${vo.JPOST_ID}">${vo.TITLE }</a></strong></td>	<!-- URL(jpost/content)뒤에 ? 임의의 변수 = / 임의의 변수를 Controller에 있는 jpost/content의 파라미터에 입력 -->
						</tr>
						<tr>
							<td><strong>모집 직군</strong></td>	
							<td>${vo.JAREA_TYPE}</td>
						</tr>
						<tr>
							<td><strong>고용 형태</strong></td>	
							<td>${vo.WORKTIME_TYPE} / ${vo.EMPL_TYPE }</td>
						</tr>
						<tr>
							<td><strong>근무지</strong></td>
							<td>${vo.LOCATE }</td>
						</tr>
						<tr>
							<td><strong>지원 시작일</strong></td> 					<!-- 데이트 피커로 만들기 / 표준시 구분 어떻게? -->
							<td><fmt:formatDate value="${vo.START_DATE }" pattern="yyyy-MM-dd"/></td> 
						</tr>
						<tr>
							<td><strong>지원 종료일</strong></td>
							<td>
								<fmt:formatDate value="${vo.END_DATE }" pattern="yyyy-MM-dd"/>
								<c:if test="${vo.D_DAY > 5 }"></c:if>
								<c:if test="${vo.D_DAY < 6 }">${vo.D_DAY }일 남았습니다.</c:if>
							</td> 
						</tr>
						<tr>
							<td><strong>공고 상태</strong></td>	
							<td>
								<c:if test="${vo.STAT == 0 }">마감</c:if>
								<c:if test="${vo.STAT == 1 }">진행중</c:if>
							</td>
						</tr>
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</table>
		
		<form action="${cpath }/jpost/list" method="get" onsubmit="return check(this)">
			<span style="float: left;">
				<select name="type">
					<option value="title" ${param.type == 'vo.TITLE' ? 'selectd' : '' }>제목으로 검색</option>
					<option value="locate" ${param.type == 'vo.LOCATE' ? 'selectd' : '' }>근무지로 검색</option>
				</select>
				<input type="text" name="word" placeholder="검색어를 입력하세요" value="${param.word }" autocomplete="off">
				<input class="btn" type="submit" value="검색">
			</span>	
		</form>	
	</div>
<%@ include file="/WEB-INF/views/layout/footer.jsp" %>	