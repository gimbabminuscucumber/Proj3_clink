package member.recommand;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import common.ViewPath;
import member.recommand.rec_ask.Rec_Ask_DTO;
import member.recommand.rec_ask.Rec_Ask_Service;
import member.recommand.rec_form.Rec_Form_DTO;
import member.recommand.rec_form.Rec_Form_Service;
import member.recommand.relation.Relation_DTO;
import member.recommand.relation.Relation_Service;

@Controller
public class Rec_Controller {

	private Rec_Form_Service rec_form_service; 
	private Rec_Ask_Service rec_ask_service; 
	private Relation_Service relation_service;
	
	public Rec_Controller(Rec_Form_Service rec_form_service, Rec_Ask_Service rec_ask_service, Relation_Service relation_service) {
		this.rec_form_service = rec_form_service;
		this.rec_ask_service = rec_ask_service;
		this.relation_service = relation_service;
	}

	
	// WRITE ====================================================================================================================
	@RequestMapping("/recommand/ask_writeform")
	public String ask_writeform(Model model) {
		
		// 타 테이블 데이터 불러오기
		// - DB에 insert문으로 넣었으면 commit 하는 습관
		List<Relation_DTO> rlist = relation_service.selectList();
		
		model.addAttribute("rlist", rlist);

		return ViewPath.RECOMMAND + "/ask/write.jsp";
	}

	@RequestMapping("/recommand/ask_write")
	public String ask_write(Model model, Rec_Ask_DTO vo) {
		
		vo.setRec_ask_id("REAX");
		
		int su = rec_ask_service.insert(vo);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "request");
		model.addAttribute("url", "/clink/recommand/ask_list");
		
		return ViewPath.RECOMMAND + "result.jsp";
	}
	
	@RequestMapping("/recommand/form_writeform")
	public String form_write(Model model, String no) {
		
		// 타 테이블 데이터 불러오기
		// - rec_ask 의 특정 데이터 가져오기
		Map<String, Object> content = rec_ask_service.content(no);
		
		model.addAttribute("ask_list", content);
		
		return ViewPath.RECOMMAND + "/form/write.jsp";
	}
	
	@RequestMapping("/recommand/form_write")
	public String form_write(Model model, Rec_Form_DTO vo) {
		
		vo.setRec_ask_id("REFX");
		
		int su = rec_form_service.insert(vo);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "write");
		model.addAttribute("url", "/clink/recommand/form_list");
		
		return ViewPath.RECOMMAND + "result.jsp";
	}
	
	// UPDATE ===================================================================================================================
	@RequestMapping("/recommand/ask_updateform")
	public String ask_updateform(Model model, String no) {
		
		Map<String, Object> content = rec_ask_service.content(no);
		List<Relation_DTO> rlist = relation_service.selectList();

		model.addAttribute("vo", content);
		model.addAttribute("rlist", rlist);
		
		return ViewPath.RECOMMAND + "/ask/update.jsp";
	}

	@RequestMapping("/recommand/ask_update")
	public String ask_update(Model model, Rec_Ask_DTO vo) {
		
		int su = rec_ask_service.update(vo);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "update");
		model.addAttribute("url", "/clink/recommand/ask_list");

		return ViewPath.RECOMMAND + "result.jsp";
	}
	
	@RequestMapping("/recommand/form_updateform")
	public String form_updateform(Model model, String no) {
		
		Map<String, Object> content = rec_form_service.content(no);
		
		model.addAttribute("vo", content);
		
		return ViewPath.RECOMMAND + "/form/update.jsp";
	}
	
	
	@RequestMapping("/recommand/form_update")
	public String form_update(Model model, Rec_Form_DTO vo) {
		
		int su = rec_form_service.update(vo);

		model.addAttribute("su", su);
		model.addAttribute("status", "update");
		model.addAttribute("url", "/clink/recommand/form_list");
		
		return ViewPath.RECOMMAND + "result.jsp";
	}
	
	
	// LIST =====================================================================================================================
	@RequestMapping("/recommand/ask_list")
	public String ask_list(Model model) {
	
		// 추천서 작성 요청 리스트
		List<Map<String, Object>> rec_askList = rec_ask_service.rec_askList();
		
		// 추천서 작성 완료 리스트
		List<Map<String, Object>> rec_formList = rec_form_service.rec_formList();
		
		model.addAttribute("alist", rec_askList);
		model.addAttribute("flist", rec_formList);
	
		return ViewPath.RECOMMAND + "/ask/list.jsp";
	}
	
	@RequestMapping("/recommand/form_list")
	public String form_list(Model model, String no) {
		
		// 추천서 작성 대기 리스트
		List<Map<String, Object>> rec_askList = rec_ask_service.rec_askList();
		
		// 추천서 작성 완료 리스트
		List<Map<String, Object>> rec_formList = rec_form_service.rec_formList();
		
		model.addAttribute("alist", rec_askList);
		model.addAttribute("flist", rec_formList);
		
		return ViewPath.RECOMMAND + "/form/list.jsp";
	}
	
	
	// CONTENT =====================================================================================================================
	@RequestMapping("/recommand/ask_content")
	public String ask_content(Model model, String no) {
		
		Map<String, Object> content = rec_ask_service.content(no);
		
		model.addAttribute("vo", content);
		
		return ViewPath.RECOMMAND + "/ask/content.jsp";
	}
	
	@RequestMapping("/recommand/form_content")
	public String form_content(Model model, String no) {
		
		Map<String, Object> content = rec_form_service.content(no);
		
		model.addAttribute("vo", content);
		
		return ViewPath.RECOMMAND + "/form/content.jsp";
	}
	
	// DELETE =====================================================================================================================
	@RequestMapping("/recommand/ask_delete")
	public String ask_delete(Model model, String no) {
		
		int su = rec_ask_service.delete(no);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "delete");
		model.addAttribute("url", "/clink/recommand/ask_list");
		
		return ViewPath.RECOMMAND + "result.jsp";
	}
	
	@RequestMapping("/recommand/form_delete")
	public String form_delete(Model model, String no) {
		
		int su = rec_form_service.delete(no);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "delete");
		model.addAttribute("url", "/clink/recommand/form_list");
		
		return ViewPath.RECOMMAND + "result.jsp";
	}
	
}


