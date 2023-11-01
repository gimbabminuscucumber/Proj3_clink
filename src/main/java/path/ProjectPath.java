package path;

public interface ProjectPath {
	String VIEWS = "/WEB-INF/views/";
	String BMEMBER = VIEWS+"Bmember/";
	String CREATEO_MNG = VIEWS+"CreateO_Mng/";
	String PROFILE = VIEWS+"profile/";
	String PUBLIC = VIEWS+"public/";
	
	//인맥관련 경로만 묶어둠
	String 인맥 = VIEWS+"personconnection/";	// 인맥 = personconnection
	String ILCHON = 인맥+"Ilchon/";
	String FOLLOW = 인맥+"Follow/";
	
	//멘토
	String MENTOR = 인맥+"Mentor/";
	
	String RECOMMAND = "/WEB-INF/views/recommand/";
	//채팅
	String CHAT = VIEWS+"Chat/";
	
	//기술 평가
	String TECH_TEST = VIEWS+"Tech_Test/";
	
	String INDEX = "/WEB-INF/views/layout/";
	String JPOST = "/WEB-INF/views/jpost/";

	String APPLY = "/WEB-INF/views/apply/";
	String APPLYMNG = "/WEB-INF/views/applymng/";
	String PRETEST = "/WEB-INF/views/pretest/";		

	
	String PF = "/WEB-INF/views/pf/";
	String VOL = "/WEB-INF/views/pf/vol/";
	String THESIS = "/WEB-INF/views/pf/thesis/";
	String ORG = "/WEB-INF/views/pf/org/";
	String LANG = "/WEB-INF/views/pf/lang/";
	String JSTAT = "/WEB-INF/views/pf/jstat/";
	String EXAM = "/WEB-INF/views/pf/exam/";
	String AWARD = "/WEB-INF/views/pf/award/";
	
	String LOGIN = "/WEB-INF/views/login/";
	String HOME = "/WEB-INF/views/home.jsp";
	
	
}
