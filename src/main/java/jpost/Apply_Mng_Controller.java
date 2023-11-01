package jpost;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import common.ViewPath;
import jpost.apply_mng.Apply_Mng_DTO;
import jpost.apply_mng.Apply_Mng_Service;

@Controller
public class Apply_Mng_Controller {

	private Apply_Mng_Service apply_mng_service;
	
	public Apply_Mng_Controller(Apply_Mng_Service apply_mng_service) {
		this.apply_mng_service = apply_mng_service;
	}
	
	@RequestMapping("/apply_mng/list")
	public String list(Model model) {
		
		List<Map<String, Object>> apply_all = apply_mng_service.apply_all();

		model.addAttribute("apply_all", apply_all);
		
		return ViewPath.APPLYMNG + "list.jsp";
	}
	
	@RequestMapping("apply_mng/write")
	public String write(Model model, Apply_Mng_DTO dto) {
		
		dto.setApply_mng_no("APMX");
		
		int su = apply_mng_service.insert(dto);
		
		model.addAttribute("su", su);
		model.addAttribute("status", "write");
		model.addAttribute("url", "/clink/apply_mng/list");
		
		return ViewPath.APPLYMNG + "result.jsp";
	}
	
	
}
