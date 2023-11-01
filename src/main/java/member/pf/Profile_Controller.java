package member.pf;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cat.city_c.City_C_DTO;
import cat.city_c.City_C_Service;
import cat.empl_type_c.Empl_Type_C_DTO;
import cat.empl_type_c.Empl_Type_C_Service;
import cat.jarea_c.Jarea_C_DTO;
import cat.jarea_c.Jarea_C_Service;
import cat.jstat_c.Jstat_C_DTO;
import cat.jstat_c.Jstat_C_Service;
import cat.socialact_c.Socialact_C_DTO;
import cat.socialact_c.Socialact_C_Service;
import member.pf.army.Army_DTO;
import member.pf.army.Army_Service;
import member.pf.award.Award_Service;
import member.pf.career.Career_DTO;
import member.pf.career.Career_Service;
import member.pf.cert.Cert_DTO;
import member.pf.cert.Cert_Service;
import member.pf.edu.Edu_DTO;
import member.pf.edu.Edu_Service;
import member.pf.exam.Exam_Service;
import member.pf.inscert.Inscert_DTO;
import member.pf.inscert.Inscert_Service;
import member.pf.jstat.Jstat_DTO;
import member.pf.jstat.Jstat_Service;
import member.pf.langskill.LangSkill_DTO;
import member.pf.langskill.LangSkill_Service;
import member.pf.org.Org_DTO;
import member.pf.org.Org_Service;
import member.pf.proj.Proj_DTO;
import member.pf.proj.Proj_Service;
import member.pf.proj_entry.Proj_Entry_DTO;
import member.pf.proj_entry.Proj_Entry_Service;
import member.pf.rest.Rest_DTO;
import member.pf.rest.Rest_Service;
import member.pf.rest_rsn.Rest_Rsn_DTO;
import member.pf.rest_rsn.Rest_Rsn_Service;
import member.pf.thesis.Thesis_DTO;
import member.pf.thesis.Thesis_Service;
import member.pf.vol.Vol_DTO;
import member.pf.vol.Vol_Service;
import path.Encry;
import path.ProjectPath;

@Controller
public class Profile_Controller implements ProjectPath{

	private Career_Service career_service;
	private Edu_Service edu_service;
	private Rest_Service rest_service;
	private Rest_Rsn_Service rest_rsn_service;
	private Cert_Service cert_service;
	private Inscert_Service inscert_service;
	private Proj_Service proj_service;
	private Proj_Entry_Service proj_entry_service;
	private Army_Service army_service;
	private Vol_Service vol_service;
	private Thesis_Service thesis_service;
	private LangSkill_Service langskill_service;
	private Org_Service	org_service;
	private Jstat_Service jstat_service;
	private Exam_Service exam_service;
	private Award_Service award_service;
	
	private Empl_Type_C_Service empl_type_c_service;
	private City_C_Service city_c_service;
	private Jarea_C_Service jarea_c_service;
	private Socialact_C_Service	socialact_c_service;
	private Jstat_C_Service	jstat_c_service;
	
	
	public Profile_Controller(Career_Service career_service, Edu_Service edu_service, Rest_Service rest_service, Rest_Rsn_Service rest_rsn_service, Cert_Service cert_service, Inscert_Service inscert_service, Proj_Service proj_service, Proj_Entry_Service proj_entry_service, Army_Service army_service, Empl_Type_C_Service empl_type_c_service, City_C_Service city_c_service, Jarea_C_Service jarea_c_service, Vol_Service vol_service, Thesis_Service thesis_service, LangSkill_Service langskill_service, Org_Service org_service, Jstat_Service jstat_service, Socialact_C_Service socialact_c_service, Jstat_C_Service jstat_c_service, Exam_Service exam_service, Award_Service award_service) {
		this.career_service = career_service;
		this.edu_service = edu_service;
		this.rest_service = rest_service;
		this.rest_rsn_service = rest_rsn_service;
		this.cert_service = cert_service;
		this.inscert_service = inscert_service;
		this.proj_service = proj_service;
		this.proj_entry_service = proj_entry_service;
		this.army_service = army_service;
		this.empl_type_c_service = empl_type_c_service;
		this.city_c_service = city_c_service; 
		this.jarea_c_service = jarea_c_service;
		this.vol_service = vol_service;
		this.thesis_service = thesis_service;
		this.langskill_service = langskill_service;
		this.org_service = org_service;
		this.jstat_service = jstat_service;
		this.socialact_c_service = socialact_c_service;
		this.jstat_c_service = jstat_c_service;
		this.exam_service = exam_service;
		this.award_service = award_service;
	}
	
	@RequestMapping("/profile/addProfile")
	public String addProfile(Model model) {
		return PROFILE + "addProfile.jsp"; 
	}
	
	@RequestMapping("/profile/profile")
	public String list(Model model) {
		
		// 저장한 데이터 불러오기 (map은 테이블간 join 했을 떄 사용, 하기 코드는 selectList로 하는게 더 맞는 코드인데 일단 사용)
		List<Map<String, Object>> careerList = career_service.careerList();
		List<Map<String, Object>> eduList = edu_service.eduList();
		List<Map<String, Object>> restList = rest_service.restList();
		List<Map<String, Object>> certList = cert_service.certList();
		List<Map<String, Object>> inscertList = inscert_service.inscertList();
		List<Map<String, Object>> projList = proj_service.projList();
		List<Map<String, Object>> armyList = army_service.armyList();
		List<Map<String, Object>> volList = vol_service.volList();
		List<Map<String, Object>> thesisList = thesis_service.thesisList();
		List<Map<String, Object>> langskillList = langskill_service.langskillList();
		List<Map<String, Object>> orgList = org_service.orgList();
		List<Map<String, Object>> jstatList = jstat_service.jstatList();
//		List<Map<String, Object>> examList = exam_service.examList();
//		List<Map<String, Object>> awardList = award_service.awardList();
		
		model.addAttribute("careerList", careerList);
		model.addAttribute("eduList", eduList);
		model.addAttribute("restList", restList);
		model.addAttribute("certList", certList);
		model.addAttribute("inscertList", inscertList);
		model.addAttribute("projList", projList);
		model.addAttribute("armyList", armyList);
		model.addAttribute("volList", volList);
		model.addAttribute("thesisList", thesisList);
		model.addAttribute("langskillList", langskillList);
		model.addAttribute("orgList", orgList);
		model.addAttribute("jstatList", jstatList);
//		model.addAttribute("examList", examList);
//		model.addAttribute("awardList", awardList);
		
		return PROFILE + "profile.jsp";
	}


	
	// WRITE ===========================================================================================================================
	// WRITE WRITE WRITE WRITE WRITE WRITE WRITE WRITE WRITE WRITE WRITE WRITE WRITE WRITE WRITE WRITE WRITE WRITE WRITE WRITE WRITE 
	
	// 경력사항 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/careerform")
	public String cereerform(Model model) {
		
		List<Empl_Type_C_DTO> elist = empl_type_c_service.selectList(); 
		List<City_C_DTO> clist = city_c_service.selectList(); 
		List<Jarea_C_DTO> jlist = jarea_c_service.selectList();

		model.addAttribute("elist", elist);
		model.addAttribute("clist", clist);
		model.addAttribute("jlist", jlist);
		
		return PROFILE + "career/write.jsp";
	}
	
	@RequestMapping("/profile/career_write")
	public String career_write(Model model, Career_DTO vo) {
		
		// UUID 생성
		vo.setCareer_no("CAXX");
		
		int su = career_service.insert(vo);
		
		System.out.println("career UUID" + vo.getCareer_no());
		System.out.println("career_write" + vo);
		System.out.println("career_write" + vo.getStart_date());
		System.out.println("career_write" + vo.getEnd_date());
		System.out.println("career_write" + vo.getStat());
		
		
		model.addAttribute("su", su);
		model.addAttribute("status", "career_write");
		model.addAttribute("url", "/profile/profile");
		return PROFILE + "result.jsp";
	}

	// 학력사항 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/eduform")
	public String eduform(Model model) {
		return PROFILE + "edu/write.jsp";
	}
	
	@RequestMapping("/profile/edu_write")
	public String edu_write(Model model, Edu_DTO vo) {
		
		vo.setEdu_no(Encry.getUUID("EDXX"));
		
		int su = edu_service.insert(vo);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "edu_write");
		model.addAttribute("url", "/profile/profile");
		
		return PROFILE + "result.jsp";
	}

	// 휴식기 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/restform")
	public String writeform(Model model) {
		
		// 테이블 데이터 불러오기 - 휴식기 사유
		// - 육아휴직, 이직 등등...
		List<Rest_Rsn_DTO> rrlist = rest_rsn_service.selectList();	
		
		model.addAttribute("rrlist", rrlist);
		
		return PROFILE +"rest/write.jsp";
	}
	
	@RequestMapping("/profile/rest_write")
	public String career_write(Model model, Rest_DTO vo) {
		
		vo.setRest_no(Encry.getUUID("REXX"));

		int su = rest_service.insert(vo);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "rest_write");
		model.addAttribute("url", "/profile/profile");
		
		return PROFILE + "result.jsp";
	}
	
	// 자격증 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/certform")
	public String certform(Model model) {
		return PROFILE + "cert/write.jsp";
	}
	
	@RequestMapping("/profile/cert_write")
	public String edu_write(Model model, Cert_DTO vo) {

		vo.setCert_no(Encry.getUUID("CEXX"));
		
		int su = cert_service.insert(vo);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "cert_write");
		model.addAttribute("url", "/profile/profile");
		
		return PROFILE + "result.jsp";
	}
	
	// 수료증 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/inscertform")
	public String inscertform(Model model) {
		return PROFILE + "inscert/write.jsp";
	}
	
	@RequestMapping("/profile/inscert_write")
	public String inscert_write(Model model, Inscert_DTO vo) {
		
		vo.setInscert_no(Encry.getUUID("INXX"));
		
		int su = inscert_service.insert(vo);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "inscert_write");
		model.addAttribute("url", "/profile/profile");
		
		return PROFILE + "result.jsp";
	}
	
	// 프로젝트 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/projform")
	public String projform(Model model) {
		return PROFILE + "proj/write.jsp";
	}
	
	@RequestMapping("/profile/proj_write")
	public String proj_write(Model model, Proj_DTO pvo, Proj_Entry_DTO evo) {
		
		// 프로젝트 참가자 입력 구현해야함
		
		// UUID 생성
		pvo.setPf_no(Encry.getUUID("PRXX"));
		evo.setProj_entry_no(Encry.getUUID("PREX"));
		
		int su = proj_service.insert(pvo);
		proj_entry_service.insert(evo);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "proj_write");
		model.addAttribute("url", "/profile/profile");
		
		return PROFILE + "result.jsp";
	}
	
	// 병역 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/armyform")
	public String armyform(Model model) {
		return PROFILE + "army/write.jsp";
	}
	
	@RequestMapping("/profile/army_write")
	public String army_write(Model model, Army_DTO vo) {
		
		vo.setArmy_no("ARXX");
		
		int su = army_service.insert(vo);
		
		System.out.println("/profile/write 에서 su = " + su);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "army_write");
		model.addAttribute("url", "/profile/profile");
		
		return PROFILE + "result.jsp";
	}
	
	// 봉사활동 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/volform")
	public String volform(Model model) {
		return PROFILE + "vol/write.jsp";
	}
	
	@RequestMapping("/profile/vol_write")
	public String vol_write(Model model, Vol_DTO vo) {
	
		vo.setVol_no("VOXX");
		
		int su = vol_service.insert(vo);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "write");
		model.addAttribute("url", "/profile/profile");
		
		return PROFILE + "result.jsp";
	}
	
	// 논문/저서 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/thesisform")
	public String thesisform(Model model) {
		return PROFILE + "thesis/write.jsp";
	}
	
	@RequestMapping("/profile/thesis_write")
	public String thesis_write(Model model, Thesis_DTO vo) {
		
		vo.setWriter("THXX");
		
		int su = thesis_service.insert(vo);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "thesis_write");
		model.addAttribute("url", "/profile/profile");
		
		return PROFILE + "result.jsp";
	}
	
	// 외국어 능력 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/langskillform")
	public String langskillform(Model model) {
		
		return PROFILE + "langskill/write.jsp";
	}
	
	@RequestMapping("/profile/langskill_write")
	public String langskill_write(Model model, LangSkill_DTO vo) {
		
		vo.setLang_cno("LASX");
		
		int su = langskill_service.insert(vo);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "langskill_write");
		model.addAttribute("url", "/profile/profile");
		
		return PROFILE + "result.jsp";
	}
	
	// 단체활동 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/orgform")
	public String orgform(Model model) {
		
		List<Socialact_C_DTO> slist = socialact_c_service.selectList(); 

		model.addAttribute("slist", slist);
		
		return PROFILE + "org/write.jsp";
	}
	
	@RequestMapping("/profile/org_write")
	public String org_write(Model model, Org_DTO vo) {
		
		vo.setOrg_no("ORXX");
		
		int su = org_service.insert(vo);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "org_write");
		model.addAttribute("url", "/profile/profile");
		
		return PROFILE + "result.jsp";
	}
	
	// 재직상태 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/jstatform")
	public String jstatform(Model model) {
		
		List<Jstat_C_DTO> jlist = jstat_c_service.selectList(); 
		
		model.addAttribute("jlist", jlist);
		
		return PROFILE + "jstat/write.jsp";
	}
	
	@RequestMapping("/profile/jstat_write")
	public String jstat_write(Model model, Jstat_DTO vo) {
		
		vo.setJstat_no("JSXX");
		
		int su = jstat_service.insert(vo);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "jstat_write");
		model.addAttribute("url", "/profile/profile");
		
		return PROFILE + "result.jsp";
	}
	
	
	// DELETE ==========================================================================================================================
	// DELETE DELETE DELETE DELETE DELETE DELETE DELETE DELETE DELETE DELETE DELETE DELETE DELETE DELETE DELETE DELETE DELETE DELETE 
	
	// 경력사항 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/career_delete")
	public String career_delete(Model model, String no) {
		
		int su = career_service.delete(no);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "career_delete");
		model.addAttribute("url", "/profile/profile");
		
		return PROFILE + "result.jsp";
	}

	// 학력사항 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/edu_delete")
	public String edu_delete(Model model, String no) {
		
		int su = edu_service.delete(no);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "edu_delete");
		model.addAttribute("url", "/profile/profile");
		
		return PROFILE + "result.jsp";
	}

	// 자격증 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/cert_delete")
	public String cert_delete(Model model, String no) {
		
		int su = cert_service.delete(no);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "cert_delete");
		model.addAttribute("url", "/profile/profile");
		
		return PROFILE + "result.jsp";
	}
	// 수료증 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/inscert_delete")
	public String inscert_delete(Model model, String no) {
		
		int su = inscert_service.delete(no);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "inscert_delete");
		model.addAttribute("url", "/profile/profile");
		
		return PROFILE + "result.jsp";
	}

	// 휴식기 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/rest_delete")
	public String rest_delete(Model model, String no) {
		
		int su = rest_service.delete(no);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "rest_delete");
		model.addAttribute("url", "/profile/profile");
		
		return PROFILE + "result.jsp";
	}

	// 프로젝트 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/proj_delete")
	public String proj_delete(Model model, String no) {
		
		int su = proj_service.delete(no);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "proj_delete");
		model.addAttribute("url", "/profile/profile");

		System.out.println("profile/proj_delete 에서 su = " + su);
		System.out.println("profile/proj_delete 에서 no = " + no);
		
		return PROFILE + "result.jsp";
	}

	// 병역 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/army_delete")
	public String army_delete(Model model, String no) {
		
		int su = army_service.delete(no);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "army_delete");
		model.addAttribute("url", "/profile/profile");
		
		return PROFILE + "result.jsp";
	}
	
	// 봉사활동 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/vol_delete")
	public String vol_delete(Model model, String no) {
		
		int su = vol_service.delete(no);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "vol_delete");
		model.addAttribute("url", "/profile/profile");
		
		return PROFILE + "result.jsp";
	}
	
	// 논문/저서 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/thesis_delete")
	public String thesis_delete(Model model, String no) {
		
		int su = thesis_service.delete(no);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "thesis_delete");
		model.addAttribute("url", "/profile/profile");
		
		return PROFILE + "result.jsp";
	}
	
	// 외국어 능력 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/langskill_delete")
	public String langskill_delete(Model model, String no) {
		
		int su = langskill_service.delete(no);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "langskill_delete");
		model.addAttribute("url", "/profile/profile");
		
		return PROFILE + "result.jsp";
	}
	
	// 단체활동 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/org_delete")
	public String org_delete(Model model, String no) {
		
		List<Socialact_C_DTO> slist = socialact_c_service.selectList(); 

		model.addAttribute("slist", slist);
		
		int su = org_service.delete(no);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "org_delete");
		model.addAttribute("url", "/profile/profile");
		
		return PROFILE + "result.jsp";
	}
	
	// 재직상태 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/jstat_delete")
	public String jstat_delete(Model model, String no) {
		
		List<Jstat_C_DTO> jlist = jstat_c_service.selectList(); 
		
		model.addAttribute("jlist", jlist);
		
		int su = jstat_service.delete(no);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "jstat_delete");
		model.addAttribute("url", "/profile/profile");
		
		return PROFILE + "result.jsp";
	}
	
	// UPDATE ==========================================================================================================================
	// UPDATE UPDATE UPDATE UPDATE UPDATE UPDATE UPDATE UPDATE UPDATE UPDATE UPDATE UPDATE UPDATE UPDATE UPDATE UPDATE UPDATE UPDATE 
	
	// 경력사항 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/career_updateform")
	public String career_updateform(Model model, String no) {
		
		// 기존 데이터 불러오기
		Map<String, Object> map = career_service.selectOne(no);
		
		// 타 테이블 데이터 불러오기
		List<Empl_Type_C_DTO> elist = empl_type_c_service.selectList(); 
		List<City_C_DTO> clist = city_c_service.selectList(); 
		List<Jarea_C_DTO> jlist = jarea_c_service.selectList();

		// 데이터 보내기
		model.addAttribute("vo", map);
		model.addAttribute("elist", elist);
		model.addAttribute("clist", clist);
		model.addAttribute("jlist", jlist);
		
		return PROFILE + "/career/update.jsp";
	}
	
	
	@RequestMapping("/profile/career_update")
	public String career_update(Model model, Career_DTO vo) {

		int su = career_service.update(vo);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "career_update");
		model.addAttribute("url", "/profile/profile");

		return PROFILE + "result.jsp";
	}
	
	// 학력사항 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/edu_updateform")
	public String edu_updateform(Model model, String no) {
		
		// 기존 데이터 불러오기
		Map<String, Object> map = edu_service.selectOne(no);
		
		// 데이터 보내기
		model.addAttribute("vo", map);
		
		return PROFILE + "/edu/update.jsp";
	}
	
	
	@RequestMapping("/profile/edu_update")
	public String edu_update(Model model, Edu_DTO vo) {

		int su = edu_service.update(vo);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "edu_update");
		model.addAttribute("url", "/profile/profile");
		
		return PROFILE + "result.jsp";
	}
	
	// 휴식기 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/rest_updateform")
	public String rest_updateform(Model model, String no) {
		
		// 기존 데이터 불러오기
		Map<String, Object> map = rest_service.selectOne(no);
		List<Rest_Rsn_DTO> rrlist = rest_rsn_service.selectList();	
		
		// 데이터 보내기
		model.addAttribute("vo", map);
		model.addAttribute("rrlist", rrlist);
		
		return PROFILE + "/rest/update.jsp";
	}
	
	@RequestMapping("/profile/rest_update")
	public String rest_update(Model model, Rest_DTO vo) {
		
		int su = rest_service.update(vo);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "rest_update");
		model.addAttribute("url", "/profile/profile");
		
		return PROFILE + "result.jsp";
	}
	
	// 자격증 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/cert_updateform")
	public String cert_updateform(Model model, String no) {
		
		System.out.println("cert updateform 까지 왔음"); 

		// 기존 데이터 불러오기
		Map<String, Object> map = cert_service.selectOne(no);
		
		// 데이터 보내기
		model.addAttribute("vo", map);
		
		System.out.println("cert updateform 에서 map = " + map); 
		
		return PROFILE + "/cert/update.jsp";
	}
	
	@RequestMapping("/profile/cert_update")
	public String cert_update(Model model, Cert_DTO vo) {
		
		int su = cert_service.update(vo);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "cert_update");
		model.addAttribute("url", "/profile/profile");
		
		return PROFILE + "result.jsp";
	}
	
	// 수료증 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/inscert_updateform")
	public String inscert_updateform(Model model, String no) {
		
		// 기존 데이터 불러오기
		Map<String, Object> map = inscert_service.selectOne(no);
		
		// 데이터 보내기
		model.addAttribute("vo", map);
		
		return PROFILE + "/inscert/update.jsp";
	}
	
	@RequestMapping("/profile/inscert_update")
	public String inscert_update(Model model, Inscert_DTO vo) {
		
		int su = inscert_service.update(vo);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "inscert_update");
		model.addAttribute("url", "/profile/profile");
		
		return PROFILE + "result.jsp";
	}
	
	// 프로젝트 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/proj_updateform")
	public String proj_updateform(Model model, String no) {
		
		// 기존 데이터 불러오기
		Map<String, Object> map = proj_service.selectOne(no);
		
		System.out.println("proj_updateform 에서 map = " + map);
		System.out.println("proj_updateform 에서 no = " + no);
		
		// 데이터 보내기
		model.addAttribute("vo", map);
		
		return PROFILE + "/proj/update.jsp";
	}
	
	@RequestMapping("/profile/proj_update")
	public String proj_update(Model model, Proj_DTO pvo, Proj_Entry_DTO evo) {
		
		int su = proj_service.update(pvo);
//		proj_entry_service.update(evo);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "proj_update");
		model.addAttribute("url", "/profile/profile");
		
		return PROFILE + "result.jsp";
	}
	
	// 병역 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/army_updateform")
	public String army_updateform(Model model, String no) {
		
		// 기존 데이터 불러오기
		Map<String, Object> map = army_service.selectOne(no);
		
		// 데이터 보내기
		model.addAttribute("vo", map);
		
		return PROFILE + "/army/update.jsp";
	}
	
	@RequestMapping("/profile/army_update")
	public String army_update(Model model, Army_DTO vo) {
		
		int su = army_service.update(vo);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "army_update");
		model.addAttribute("url", "/profile/profile");
		
		return PROFILE + "result.jsp";
	}
	
	// 봉사활동 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/vol_updateform")
	public String vol_updateform(Model model, String no) {
		
		// 기존 데이터 불러오기
		Map<String, Object> map = vol_service.selectOne(no);
		
		// 데이터 보내기
		model.addAttribute("vo", map);
		
		return PROFILE + "/vol/update.jsp";
	}
	
	@RequestMapping("/profile/vol_update")
	public String vol_update(Model model, Vol_DTO vo) {
		
		int su = vol_service.update(vo);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "vol_update");
		model.addAttribute("url", "/profile/profile");
		
		return PROFILE + "result.jsp";
	}
	
	// 논문/저서 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/thesis_updateform")
	public String thesis_updateform(Model model, String no) {
		
		// 기존 데이터 불러오기
		Map<String, Object> map = thesis_service.selectOne(no);
		
		// 데이터 보내기
		model.addAttribute("vo", map);
		
		return PROFILE + "/thesis/update.jsp";
	}
	
	@RequestMapping("/profile/thesis_update")
	public String thesis_update(Model model, Thesis_DTO vo) {
		
		int su = thesis_service.update(vo);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "thesis_update");
		model.addAttribute("url", "/profile/profile");
		
		return PROFILE + "result.jsp";
	}
	
	// 외국어능력 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/langskill_updateform")
	public String langskill_updateform(Model model, String no) {
		
		// 기존 데이터 불러오기
		Map<String, Object> map = langskill_service.selectOne(no);
		
		// 데이터 보내기
		model.addAttribute("vo", map);
		
		return PROFILE + "/langskill/update.jsp";
	}
	
	@RequestMapping("/profile/langskill_update")
	public String langskill_update(Model model, LangSkill_DTO vo) {
		
		int su = langskill_service.update(vo);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "langskill_update");
		model.addAttribute("url", "/profile/profile");
		
		return PROFILE + "result.jsp";
	}
	
	// 단체활동 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/org_updateform")
	public String org_updateform(Model model, String no) {
		
		// 기존 데이터 불러오기
		Map<String, Object> map = org_service.selectOne(no);

		// 공통 데이터 불러오기
		List<Socialact_C_DTO> slist = socialact_c_service.selectList(); 
		
		// 데이터 보내기
		model.addAttribute("vo", map);
		model.addAttribute("slist", slist);
		
		return PROFILE + "/org/update.jsp";
	}
	
	@RequestMapping("/profile/org_update")
	public String org_update(Model model, Org_DTO vo) {
		
		int su = org_service.update(vo);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "org_update");
		model.addAttribute("url", "/profile/profile");
		
		return PROFILE + "result.jsp";
	}
	
	// 재직상태 -------------------------------------------------------------------------------------------------------------------------- 
	@RequestMapping("/profile/jstat_updateform")
	public String jstat_updateform(Model model, String no) {
		
		// 기존 데이터 불러오기
		Map<String, Object> map = jstat_service.selectOne(no);
		
		// 공통 데이터 불러오기
		List<Jstat_C_DTO> jlist = jstat_c_service.selectList(); 
		
		// 데이터 보내기
		model.addAttribute("vo", map);
		model.addAttribute("jlist", jlist);
		
		return PROFILE + "/jstat/update.jsp";
	}
	
	@RequestMapping("/profile/jstat_update")
	public String jstat_update(Model model, Jstat_DTO vo) {
		
		int su = jstat_service.update(vo);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "jstat_update");
		model.addAttribute("url", "/profile/profile");
		
		return PROFILE + "result.jsp";
	}
	
}
