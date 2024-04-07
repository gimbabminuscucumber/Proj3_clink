<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="/WEB-INF/views/cLayout/header.jsp" %>
<link rel="stylesheet" href="jpost/resources/css/style.css">
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
	<div class="container-fluid">
	<div class="row">
	<div class="col-lg-12">
	<div class="row" id="page-contents">
	<div class="col-lg-3">

	<aside class="sidebar static">
		<div class="widget">
			<h4 class="widget-title">Shortcuts</h4>
				<ul class="naves">
					<li>
						<i class="ti-clipboard"></i>
						<a href="newsfeed.html" title="">News feed</a>
					</li>
					<li>
						<i class="ti-mouse-alt"></i>
						<a href="inbox.html" title="">Inbox</a>
					</li>
					<li>
						<i class="ti-files"></i>
						<a href="fav-page.html" title="">My pages</a>
					</li>
					<li>
						<i class="ti-user"></i>
						<a href="timeline-friends.html" title="">friends</a>
					</li>
					<li>
						<i class="ti-image"></i>
						<a href="timeline-photos.html" title="">images</a>
					</li>
					<li>
						<i class="ti-video-camera"></i>
						<a href="timeline-videos.html" title="">videos</a>
					</li>
					<li>
						<i class="ti-comments-smiley"></i>
						<a href="messages.html" title="">Messages</a>
					</li>
					<li>
						<i class="ti-bell"></i>
						<a href="notifications.html" title="">Notifications</a>
					</li>
					<li>
						<i class="ti-share"></i>
						<a href="people-nearby.html" title="">People Nearby</a>
					</li>
					<li>
						<i class="fa fa-bar-chart-o"></i>
						<a href="insights.html" title="">insights</a>
					</li>
					<li>
						<i class="ti-power-off"></i>
						<a href="landing.html" title="">Logout</a>
					</li>
				</ul>
			</div><!-- Shortcuts -->
		</aside>
	</div><!-- sidebar -->
	
	
	<div class="col-lg-6">
	<div class="central-meta">
	<div class="editing-info">
	
		<h5 class="f-title"><i class="ti-info-alt"></i>프로필</h5>
		<hr>
			<c:set var="cpath" value="${pageContext.request.contextPath	}"/>
				<br>
				<div id="career">
				<h5>경력사항</h5>
					<table id="career">
						<c:choose>
							<c:when test="${careerList.isEmpty() == true}">
								<table>
									<td><span>작성된 내역이 없습니다. 항목을 추가해보세요!</span></td>
									<tr><td><input type="button" value="추가" onclick="location.href='${pageContext.request.contextPath}/profile/careerform'"></td></tr>
								</table>
							</c:when>
							<c:otherwise>
								<c:forEach var="vo" items="${careerList }">
									<table>
										<tr>
											<td width=15%px>${vo.COMPANY} (${vo.CTNAME})  •  ${vo.EMPL_TYPE}</td>
										</tr>
										<tr>	
											<td>
												<fmt:formatDate value="${vo.START_DATE }" pattern="yyyy-MM"/> ~ <fmt:formatDate value="${vo.END_DATE }" pattern="yyyy-MM"/>	
												(${end-strt + 1 }개월)
												<c:if test="${vo.STAT == 0 }"> • 퇴사</c:if> 
												<c:if test="${vo.STAT == 1 }"> • 재직중</c:if> 
											</td>
										</tr>
										<tr>	
											<td>
												<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/profile/career_updateform?no=${vo.CAREER_NO }'">
												<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/profile/career_delete?no=${vo.CAREER_NO }'">
											</td>
										</tr>
									</table>
								</c:forEach>
							</c:otherwise>
						</c:choose>
					</table>
				</div>
				
				<br>
				<div id="pf">
				<h5>학력 사항</h5>
					<table id="edu">
						<c:choose>
							<c:when test="${eduList.isEmpty() == true}">
								<table>
									<td><span>작성된 내역이 없습니다. 항목을 추가해보세요!</span></td>
									<tr><td><input type="button" value="추가" onclick="location.href='${pageContext.request.contextPath}/profile/eduform'"></td></tr>
								</table>
							</c:when>
							<c:otherwise>
								<c:forEach var="vo" items="${eduList }">
									<tr><td>${vo.SCHOOL }</td></tr>
									<tr>
										<td>${vo.MAJOR } • 
										<c:if test="${vo.DEGREE == 0}">전문학사</c:if>
										<c:if test="${vo.DEGREE == 1}">학사</c:if>
										<c:if test="${vo.DEGREE == 2}">전문석사</c:if>
										<c:if test="${vo.DEGREE == 3}">석사</c:if>
										<c:if test="${vo.DEGREE == 4}">전문박사</c:if>
										<c:if test="${vo.DEGREE == 5}">박사</c:if>
										</td>
										<td>
									</tr>	
									<tr>
										<td>
											<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/profile/edu_updateform?no=${vo.EDU_NO }'">
											<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/profile/edu_delete?no=${vo.EDU_NO }'">
										</td>
									</tr>	
								</c:forEach>
							</c:otherwise>
						</c:choose>
					</table>
				</div>
					
				<br>
				<div id="pf">
				<h5>휴식기</h5>
					<table id="rest">
						<c:choose>
							<c:when test="${restList.isEmpty() == true}">
								<table>
									<td><span>작성된 내역이 없습니다. 항목을 추가해보세요!</span></td>
									<tr><td><input type="button" value="추가" onclick="location.href='${pageContext.request.contextPath}/profile/restform'"></td></tr>
								</table>
							</c:when>
							<c:otherwise>
								<c:forEach var="vo" items="${restList }">
									<tr><td>${vo.RSN }</td></tr>
									<tr>
										<td>
											<fmt:formatDate value="${vo.START_DATE }" pattern="yyyy-MM"/> ~ <fmt:formatDate value="${vo.END_DATE }" pattern="yyyy-MM"/>
											${vo.END_DATE == null ? '현재' : ''} 
										</td>	
										<td style="display:none">
											<fmt:formatDate value="${vo.START_DATE }" pattern="yyyyMM" var="strt"/>
											<fmt:formatDate value="${vo.END_DATE }" pattern="yyyyMM" var="end"/>
										<td>
										<td>
											(${end-strt }개월)
										</td>	
									</tr>
									<tr>
										<td>
											<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/profile/rest_updateform?no=${vo.REST_NO }'">
											<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/profile/rest_delete?no=${vo.REST_NO }'">
										</td>
									</tr>	
								</c:forEach>
							</c:otherwise>
						</c:choose>	
					</table>
				</div>
				
				<br>	
				<div id="pf">
				<h5>자격증</h5>
					<table id="cert">
						<c:choose>
							<c:when test="${certList.isEmpty() == true}">
								<table>
									<td><span>작성된 내역이 없습니다. 항목을 추가해보세요!</span></td>
									<tr><td><input type="button" value="추가" onclick="location.href='${pageContext.request.contextPath}/profile/certform'"></td></tr>
								</table>
							</c:when>			
							<c:otherwise>
								<c:forEach var="vo" items="${certList }">
									<tr><td>${vo.NAME }</td></tr>
									<tr><td>${vo.AUTHOR }</td></tr>
									<tr>
										<td>
											<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/profile/cert_updateform?no=${vo.CERT_NO }'">
											<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/profile/cert_delete?no=${vo.CERT_NO }'">
										</td>
									</tr>	
								</c:forEach>
							</c:otherwise>
						</c:choose>
					</table>
				</div>	

<%-- 				<br>									
				<div id="pf">
				<h5>수료증</h5>
					<table id="inscert">
						<c:choose>
							<c:when test="${incertList.isEmpty() == true}">
								<table>
									<td><span>작성된 내역이 없습니다. 항목을 추가해보세요!</span></td>
									<tr><td><input type="button" value="추가" onclick="location.href='${pageContext.request.contextPath}/profile/career_updateform?no=${vo.CAREER_NO }'"></td></tr>
								</table>
							</c:when>	
							<c:otherwise>
								<c:forEach var="vo" items="${inscertList }">
									<tr><td>${vo.NAME }</td></tr>
									<tr><td>${vo.AUTHOR }</td></tr>
									<tr>
										<td>
											<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/profile/inscert_updateform?no=${vo.INSCERT_NO }'">
											<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/profile/inscert_delete?no=${vo.INSCERT_NO }'">
										</td>
									</tr>	
								</c:forEach>
							</c:otherwise>
						</c:choose>
					</table>
				</div>	 --%>
					
				<br>	
				<div id="pf">
				<h5>프로젝트</h5>
					<table id="proj">
						<c:choose>
							<c:when test="${projList.isEmpty() == true}">
								<table>
									<td><span>작성된 내역이 없습니다. 항목을 추가해보세요!</span></td>
									<tr><td><input type="button" value="추가" onclick="location.href='${pageContext.request.contextPath}/profile/projform'"></td></tr>
								</table>
							</c:when>
							<c:otherwise>
								<c:forEach var="vo" items="${projList }">
									<tr>
										<td>${vo.NAME } • 
										<c:if test="${vo.STAT == 0 }">완료</c:if>
										<c:if test="${vo.STAT == 1 }">진행중</c:if>
										</td>
									</tr>	
									<tr>
										<td>
											<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/profile/proj_updateform?no=${vo.PROJ_NO }'">
											<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/profile/proj_delete?no=${vo.PROJ_NO }'">
										</td>
									</tr>	
								</c:forEach>
							</c:otherwise>
						</c:choose>
					</table>
				</div>	
					
				<br>	
				<div id="pf">
				<h5>병역</h5>	
					<table id="army">
						<c:choose>
							<c:when test="${armyList.isEmpty() == true}">
								<table>
									<td><span>작성된 내역이 없습니다. 항목을 추가해보세요!</span></td>
									<tr><td><input type="button" value="추가" onclick="location.href='${pageContext.request.contextPath}/profile/armyform'"></td></tr>
								</table>
							</c:when>
							<c:otherwise>
								<c:forEach var="vo" items="${armyList }">
									<tr>
										<td>
											<c:if test="${vo.OPT == 0 }">해당없음</c:if>
											<c:if test="${vo.OPT == 1 }">군필</c:if>
											<c:if test="${vo.OPT == 2 }">미필</c:if>
											<c:if test="${vo.OPT == 3 }">면제</c:if>
										</td>
									</tr>		
									<tr>
										<td>
											<!-- 병역구분 -->
											<c:if test="${vo.TYPE == 0 }">육군 (</c:if>
											<c:if test="${vo.TYPE == 1 }">해군 (</c:if>
											<c:if test="${vo.TYPE == 2 }">공군 (</c:if>
											<c:if test="${vo.TYPE == 3 }">해병 (</c:if>
											<c:if test="${vo.TYPE == 4 }">의경 (</c:if>
											<c:if test="${vo.TYPE == 5 }">공익 (</c:if>
											<c:if test="${vo.TYPE == 6 }">기타 (</c:if>
										
											<!-- 제대계급 -->
											<c:if test="${vo.DISCH == 0 }">이병 )</c:if>
											<c:if test="${vo.DISCH == 1 }">일병 )</c:if>
											<c:if test="${vo.DISCH == 2 }">상병 )</c:if>
											<c:if test="${vo.DISCH == 3 }">병장 )</c:if>
											<c:if test="${vo.DISCH == 4 }">하사 )</c:if>
											<c:if test="${vo.DISCH == 5 }">중사 )</c:if>
											<c:if test="${vo.DISCH == 6 }">상사 )</c:if>
											<c:if test="${vo.DISCH == 7 }">원사 )</c:if>
											<c:if test="${vo.DISCH == 8 }">준위 )</c:if>
											<c:if test="${vo.DISCH == 9 }">소위 )</c:if>
											<c:if test="${vo.DISCH == 10 }">중위 )</c:if>
											<c:if test="${vo.DISCH == 11 }">대위 )</c:if>
											<c:if test="${vo.DISCH == 12 }">소령 )</c:if>
											<c:if test="${vo.DISCH == 13 }">중령 )</c:if>
											<c:if test="${vo.DISCH == 14 }">대령 )</c:if>
											<c:if test="${vo.DISCH == 15 }">준장 )</c:if>
											<c:if test="${vo.DISCH == 16 }">소장 )</c:if>
											<c:if test="${vo.DISCH == 17 }">중장 )</c:if>
											<c:if test="${vo.DISCH == 18 }">대장 )</c:if>
											<c:if test="${vo.DISCH == 19 }">기타 )</c:if>
										</td>
									</tr>		
									<tr>
										<c:choose>
											<c:when test="${RSN eq null }"></c:when>
											<c:otherwise>
												<td>${vo.RSN }</td>
											</c:otherwise>
										</c:choose>
									</tr>		
									<tr>
										<td>
											<fmt:formatDate value="${vo.START_DATE }" pattern="yyyy-MM"/> ~ <fmt:formatDate value="${vo.END_DATE }" pattern="yyyy-MM"/>
											${vo.END_DATE == null ? '현재' : ''} 
										</td>	
										<td style="display:none">
											<fmt:formatDate value="${vo.START_DATE }" pattern="yyyyMM" var="strt"/>
											<fmt:formatDate value="${vo.END_DATE }" pattern="yyyyMM" var="end"/>
										<td>
										<td>
											(${end-strt }개월)
										</td>	
									</tr>
									<tr>
										<td>
											<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/profile/army_updateform?no=${vo.AMRY_NO }'">
											<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/profile/army_delete?no=${vo.ARMY_NO }'">
										</td>
									</tr>	
								</c:forEach>
							</c:otherwise>
						</c:choose>
					</table>
				</div>	
					
				<br>		
				<div id="pf">
				<h5>봉사활동</h5>	
					<table id="vol">
						<c:choose>
							<c:when test="${volList.isEmpty() == true}">
								<table>
									<td><span>작성된 내역이 없습니다. 항목을 추가해보세요!</span></td>
									<tr><td><input type="button" value="추가" onclick="location.href='${pageContext.request.contextPath}/profile/volform'"></td></tr>
								</table>
							</c:when>
							<c:otherwise>
								<c:forEach var="vo" items="${volList }">
									<tr>
										<td>${vo.ORG } • 
											<c:if test="${vo.STAT == 0 }">비활동</c:if>
											<c:if test="${vo.STAT == 1 }">활동중</c:if>
										</td>
									</tr>	
									<tr>
										<td>${vo.CONTENT }</td>
									</tr>
									<tr>
										<td>
											<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/profile/vol_updateform?no=${vo.VOL_NO }'">
											<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/profile/vol_delete?no=${vo.VOL_NO }'">
										</td>
									</tr>	
								</c:forEach>
							</c:otherwise>
						</c:choose>
					</table>
				</div>		
	
				<br>									
				<div id="pf" >
				<h5>논문/저자</h5>
					<table id="thesis">
						<c:choose>
							<c:when test="${thesisList.isEmpty() == true}">
								<table>
									<td><span>작성된 내역이 없습니다. 항목을 추가해보세요!</span></td>
									<tr><td><input type="button" value="추가" onclick="location.href='${pageContext.request.contextPath}/profile/thesisform'"></td></tr>
								</table>
							</c:when>
							<c:otherwise>
								<c:forEach var="vo" items="${thesisList }">
									<tr>
										<td>${vo.TITLE }</td>
									</tr>	
									<tr>
										<td>${vo.PUBLISHER }</td>
									</tr>	
									<tr>
										<td>
											<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/profile/thesis_updateform?no=${vo.THESIS_NO }'">
											<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/profile/thesis_delete?no=${vo.THESIS_NO }'">
										</td>
									</tr>	
								</c:forEach>
							</c:otherwise>
						</c:choose>
					</table>
				</div>		
				
<%-- 				<br>
				<div id="pf">
				<h5>외국어 능력</h5>
					<table id="thesis">
						<c:choose>
							<c:when test="${langskillList.isEmpty() == true}">
								<table>
									<td><span>작성된 내역이 없습니다. 항목을 추가해보세요!</span></td>
									<tr><td><input type="button" value="추가" onclick="location.href='${pageContext.request.contextPath}/profile/career_updateform?no=${vo.CAREER_NO }'"></td></tr>
								</table>
							</c:when>	
							<c:otherwise>
								<c:forEach var="vo" items="${langskillList }">
									<tr>
										<td>이거 어케..? • ${vo.LV }</td>
									</tr>	
									<tr>
										<td>
											<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/profile/langskill_updateform?no=${vo.LANG_SKILL_NO }'">
											<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/profile/langskill_delete?no=${vo.LANG_SKILL_NO }'">
										</td>
									</tr>	
								</c:forEach>
							</c:otherwise>
						</c:choose>
					</table>
				</div>
				
				<br>
				<div id="pf" >
				<h5>단체활동</h5>
					<table id="org">
						<c:choose>
							<c:when test="${orgList.isEmpty() == true}">
								<table>
									<td><span>작성된 내역이 없습니다. 항목을 추가해보세요!</span></td>
									<tr><td><input type="button" value="추가" onclick="location.href='${pageContext.request.contextPath}/profile/career_updateform?no=${vo.CAREER_NO }'"></td></tr>
								</table>
							</c:when>
							<c:otherwise>
								<c:forEach var="vo" items="${orgList }">
									<tr>
										<td>
											${vo.NAME} • 
											<c:if test="${vo.STAT == 1 }">활동중</c:if>
											<c:if test="${vo.STAT == 0 }">비활동</c:if>
										</td>	
									</tr>	
									<tr>
										<td>${vo.SOCIALACT_NAME }</td>
									<tr>
										<td>
											<input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/profile/org_updateform?no=${vo.ORG_NO }'">
											<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/profile/org_delete?no=${vo.ORG_NO }'">
										</td>
									</tr>	
								</c:forEach>
							</c:otherwise>
						</c:choose>
					</table>
				</div> --%>		
			</div>
			</div>
			</div>
			</div>
		</div>
	</section>
</div>
<%@ include file = "/WEB-INF/views/cLayout/footer.jsp" %>
