<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/layout/header.jsp" %>
<hr>
<div align="center">
	<form id="proj" action="${pageContext.request.contextPath }/profile/proj_write" method="post">
		<table>
			<tr>
				<th>프로젝트 명</th>
				<td><input type="text" name="name" placeholder="ex) 모빌리티 안전관리 SW 개발"></td>		
			</tr>
			<tr>
				<th>현재 진행 상태</th>
				<td>
					<select name="stat">
						<option value="">[필수]프로젝트 진행 상태를 선택하세요</option>
						<optgroup label="-----------"></optgroup>
						<option value="0">진행 중</option>		
						<option value="1">완료</option>		
					</select>
				</td>		
			</tr>
			<tr>
				<th>프로젝트 참가자</th>
				<td><input type="text" name=""></td>		
			</tr>
		</table>
	</form>
	<input type="submit" value="회원 프로필 업데이트">
</div>
<%@ include file="/WEB-INF/views/layout/footer.jsp" %>
