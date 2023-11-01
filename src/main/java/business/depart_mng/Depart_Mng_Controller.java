package business.depart_mng;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import business.posi_mng.Posi_Mng_Service;
import path.Encry;
import path.ProjectPath;

@Controller
public class Depart_Mng_Controller implements ProjectPath{
	private Depart_Mng_Service depart_mng_service;
	private Posi_Mng_Service posi_mng_service;
	
	public Depart_Mng_Controller(Depart_Mng_Service depart_mng_service,Posi_Mng_Service posi_mng_service) {
		this.depart_mng_service = depart_mng_service;
		this.posi_mng_service = posi_mng_service;
	}
	
	
	@RequestMapping("depinsert")
	public String getList(HttpServletRequest req){
		String bmember_id = Encry.getUsrId(req.getSession());
		String name = req.getParameter("name");
		Depart_Mng_DTO dto = new Depart_Mng_DTO();
		dto.setBmember_id(bmember_id);
		dto.setName(name);
		int su = depart_mng_service.insert(dto);
		req.setAttribute("str", su == 0 ? "추가 실패" : "추가 성공");
		req.setAttribute("url", "index");
		
		return PUBLIC+"alim.jsp";
	}
	
	@RequestMapping("departdel")
	public String delete(int url,HttpServletRequest req) {

		int psu = posi_mng_service.deleteDp(url);
		int su = depart_mng_service.delete(url);
		
		
		req.setAttribute("str", su == 0 && psu == 0 ? "삭제 실패" : "삭제 성공");
		req.setAttribute("url", "index");
		return PUBLIC+"alim.jsp";
	}
	
	
	
}
