package member.apply;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import common.ViewPath;
import jpost.apply_mng.Apply_Mng_DTO;
import jpost.apply_mng.Apply_Mng_Service;
import jpost.jpost.Jpost_Service;
import member.apply.apply.Apply_DTO;
import member.apply.apply.Apply_Service;
import member.apply.apply_form.Apply_Form_DTO;
import member.apply.apply_form.Apply_Form_Service;
import member.apply.apply_list.Apply_List_Service;
import member.apply.apply_stat.Apply_Stat_Service;

@Controller
public class Apply_Controller {

	private Apply_Service apply_service;
	private Apply_Form_Service apply_form_service;
	private Apply_List_Service apply_list_service;
	private Apply_Stat_Service apply_stat_service;
	private Apply_Mng_Service apply_mng_service;
	private Jpost_Service jpost_service;
	
	public Apply_Controller(Apply_Service apply_service, Apply_Form_Service apply_form_service, Apply_List_Service apply_list_service, Apply_Stat_Service apply_stat_service, Apply_Mng_Service apply_mng_service, Jpost_Service jpost_service) {
		this.apply_service = apply_service;
		this.apply_form_service = apply_form_service;
		this.apply_list_service = apply_list_service;
		this.apply_stat_service = apply_stat_service;
		this.apply_mng_service = apply_mng_service;
		this.jpost_service = jpost_service;
	}
	
	
	@RequestMapping("/apply/writeform")
	public String writeform(Model model) {
		
		return ViewPath.APPLY + "write.jsp";
	}
	
	@RequestMapping("/apply/write")
	public String write(HttpServletRequest request) {
		
		// Apply 테이블 칼럼
		String apply_id = ViewPath.getUUID("APXX");
		
		// Apply_Form 테이블 칼럼
		String apply_form_id = ViewPath.getUUID("AAPF");
		String title = request.getParameter("title");
		String detail = request.getParameter("detail");
		
		Apply_DTO avo = new Apply_DTO(apply_id, apply_form_id);
		Apply_Form_DTO fvo = new Apply_Form_DTO(apply_form_id, title, detail);

		// mapper에 저장
		int su = apply_service.insert(avo);
		int suu = apply_form_service.insert(fvo);
		
		// 데이터 보내기
		request.setAttribute("su", su);
		request.setAttribute("suu", suu);
		request.setAttribute("status", "write");
		request.setAttribute("url","/clink/apply/list");
		
		return ViewPath.APPLY + "result.jsp"; 
	}

	@RequestMapping("/apply/list")
	public String list(Model model) {
		
		List<Map<String, Object>> applyList = apply_service.applyList();
		
		model.addAttribute("applyList", applyList);
		
		return ViewPath.APPLY + "list.jsp";
	}

	@RequestMapping("/apply/submitform")
	public String submitform(Model model, String no) {
		
		List<Map<String, Object>> applyList = apply_service.applyList();	// 유저가 작성한 지원서들 효출
//		Map<String,Object> map = jpost_service.getContent(no);			// 제출할 지원서

		//model.addAttribute("no", no);
//		model.addAttribute("map", map);
		model.addAttribute("applyList", applyList);
		model.addAttribute("url", "/clilnk/apply/submit?no=" + no);

		return ViewPath.APPLY + "submit.jsp";
	}
	
	@RequestMapping("/apply/submit")
	public String submit(Model model, Apply_Mng_DTO dto, String no) {

		System.out.println("apply/submit 에서 no = " + no);
		
		dto.setApply_mng_no(ViewPath.getUUID("APMX"));
		
		int su = apply_mng_service.insert(dto);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "submit");
		model.addAttribute("url", "/clink/apply/complete");
		
		return ViewPath.APPLY + "result.jsp";
	}
	
	// jpost_id 를 no 로 넘기는 방법
	// 1. session 에 jpost_id를 담아서 넘기기 >> 사용자 행동 변수가 너무 많음
	// 2. no 만 억지로 넘기기
	// 3. 한 페이지에서 처리하기	>> 제일 깔끔   
	
	
	@RequestMapping("/apply/complete")
	public String complete(Model model) {
		return ViewPath.APPLY + "";
	}
	
	@RequestMapping("/apply/content")
	public String getContent(HttpServletRequest request, String no) {
		
		List<Map<String, Object>> getContent = apply_service.getContent(no);
		
		request.setAttribute("getContent", getContent);
		
		// apply_all_vo 메소드 안에 있는 gender 칼럼 데이터 확인
		// System.out.println(apply_all_vo.get(0).get("GENDER") instanceof String);	// 오류 확인 코드

		return ViewPath.APPLY + "content.jsp";
	}
	
	@RequestMapping("/apply/updateform")
	public String updateform(Model model, String no) {
		
		Map<String, Object> map	= apply_service.selectOne(no);

		model.addAttribute("vo", map);
		
		return ViewPath.APPLY + "update.jsp";
	}
	
	@RequestMapping("/apply/update")
	public String update(HttpServletRequest request, String no) {
		
		// 수정된 데이터를 저장할 칼럼
		String title = request.getParameter("title");
		String detail = request.getParameter("detail");
		
		// Join할 테이블의 생성자 (수정된 데이터가 들어갈 칼럼 기입)
		// - int는 Integer로 형변환
		Apply_DTO avo = new Apply_DTO();
		Apply_Form_DTO fvo = new Apply_Form_DTO(title, detail);
		
		// DB에 수정된 내용 저장
		int su = apply_form_service.update(fvo);
		apply_service.update(avo);
		
		request.setAttribute("su", su);
		request.setAttribute("status", "update");
		request.setAttribute("url", "/clink/jpost/content?no=" + avo.getApply_id());
		
		return ViewPath.APPLY + "result.jsp";
	}
	
	
	@RequestMapping("/apply/hidden")
	public String hidden(HttpServletRequest request, String no) {
		
		int su = apply_service.hidden(no);
		
		request.setAttribute("su", su);
		request.setAttribute("status", "hidden");
		request.setAttribute("url","/clink/apply/list");
		
		return ViewPath.APPLY + "result.jsp";
	}
	
	
}
