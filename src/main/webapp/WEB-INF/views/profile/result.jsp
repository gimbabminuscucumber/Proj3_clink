<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="msg">
	<c:choose>
		<c:when test="${status == 'career_write' }">'경력' 정보 작성</c:when>
		<c:when test="${status == 'edu_write' }">'교육' 정보 작성</c:when>
		<c:when test="${status == 'cert_write' }">'자격증' 정보 작성</c:when>
		<c:when test="${status == 'inscert_write' }">'수료증' 정보 작성</c:when>
		<c:when test="${status == 'rest_write' }">'휴식기' 정보 작성</c:when>
		<c:when test="${status == 'proj_write' }">'프로젝트' 정보 작성</c:when>
		<c:when test="${status == 'army_write' }">'병역' 정보 작성</c:when>
		<c:when test="${status == 'vol_write' }">'봉사활동' 정보 작성</c:when>
		<c:when test="${status == 'thesis_write' }">'논문/저서' 정보 작성</c:when>
		<c:when test="${status == 'langskill_write' }">'외국어 능력' 정보 작성</c:when>
		<c:when test="${status == 'org_write' }">'단체활동' 정보 작성</c:when>
		<c:when test="${status == 'jstat_write' }">회원정보 작성</c:when>
		
		
		<c:when test="${status == 'career_update' }">'경력' 정보 수정</c:when>
		<c:when test="${status == 'edu_update' }">'교육' 정보 수정</c:when>
		<c:when test="${status == 'cert_update' }">'자격증' 정보 수정</c:when>
		<c:when test="${status == 'inscert_update' }">'수료증' 정보 수정</c:when>
		<c:when test="${status == 'rest_update' }">'휴식기' 정보 수정</c:when>
		<c:when test="${status == 'proj_update' }">'프로젝트' 정보 수정</c:when>
		<c:when test="${status == 'army_update' }">'병역' 정보 수정</c:when>
		<c:when test="${status == 'vol_update' }">'봉사활동' 정보 수정</c:when>
		<c:when test="${status == 'thesis_update' }">'논문/저서' 정보 수정</c:when>
		<c:when test="${status == 'langskill_update' }">'외국어 능력' 정보 수정</c:when>
		<c:when test="${status == 'org_update' }">'단체활동' 정보 수정</c:when>
		<c:when test="${status == 'jstat_update' }">회원정보 수정</c:when>
		
		
		<c:when test="${status == 'career_delete' }">'경력' 정보 삭제</c:when>
		<c:when test="${status == 'edu_delete' }">'교육' 정보 삭제</c:when>
		<c:when test="${status == 'cert_delete' }">'자격증' 정보 삭제</c:when>
		<c:when test="${status == 'inscert_delete' }">'수료증' 정보 삭제</c:when>
		<c:when test="${status == 'rest_delete' }">'휴식기' 정보 삭제</c:when>
		<c:when test="${status == 'proj_delete' }">'프로젝트' 정보 삭제</c:when>
		<c:when test="${status == 'army_delete' }">'병역' 정보 삭제</c:when>
		<c:when test="${status == 'vol_delete' }">'봉사활동' 정보 삭제</c:when>
		<c:when test="${status == 'thesis_delete' }">'논문/저서' 정보 삭제</c:when>
		<c:when test="${status == 'langskill_delete' }">'외국어 능력' 정보 삭제</c:when>
		<c:when test="${status == 'org_delete' }">'단체활동' 정보 삭제</c:when>
		<c:when test="${status == 'jstat_delete' }">회원정보 삭제</c:when>
	</c:choose>
</c:set>

<c:choose>
	<c:when test="${su != 0 }">
		<script type="text/javascript">
			alert("${msg} 완료");
			document.location.href = '${url}';
		</script>
	</c:when>
	<c:otherwise>
		<script type="text/javascript">
			alert("${msg} 실패");
			history.back();
		</script>
	</c:otherwise>
</c:choose>