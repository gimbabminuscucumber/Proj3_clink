package business.posi_mng;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import path.ProjectPath;

@Controller
public class Posi_Mng_Controller implements ProjectPath{
	
	private Posi_Mng_Service posi_mng_service;
	
	public Posi_Mng_Controller(Posi_Mng_Service posi_mng_service) {
		this.posi_mng_service = posi_mng_service;
	}
	
	@RequestMapping("posiinsert")
	public String insert(Posi_Mng_DTO dto,Model m) {
		
		int su = posi_mng_service.insert(dto);
		m.addAttribute("str", su == 0 ? "추가 실패" : "추가 성공");
		m.addAttribute("url", "index");
		
		return PUBLIC+"alim.jsp";
	}
	
	@RequestMapping("psdel")
	public String delete(int url,Model m) {
		int su = posi_mng_service.delete(url);
		
		
		m.addAttribute("str", su == 0 ? "삭제 실패" : "삭제 성공");
		m.addAttribute("url", "index");
		return PUBLIC+"alim.jsp";
	}
	
	@RequestMapping("selectPosiList")
	@ResponseBody
	public List<Posi_Mng_DTO> selectList(int departNo){
		List<Posi_Mng_DTO> list = posi_mng_service.getNoList(departNo);
		
		return list;
	}
	
}
