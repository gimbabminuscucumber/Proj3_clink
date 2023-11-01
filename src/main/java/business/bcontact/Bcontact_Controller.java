package business.bcontact;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import business.bmember.Bmember_DTO;
import path.ProjectPath;

@Controller
public class Bcontact_Controller implements ProjectPath {
	private Bcontact_Service bcontact_service;
	
	public Bcontact_Controller(Bcontact_Service bcontact_service) {
		this.bcontact_service = bcontact_service;
	}
	
	
	@RequestMapping("bctIn")
	public String BcontactUp(HttpServletRequest req) {
		String type = req.getParameter("type");
		String contact = req.getParameter("contact");
		
		Bcontact_DTO dto = new Bcontact_DTO(((Bmember_DTO)req.getSession().getAttribute("login")).getBmember_id(),Integer.parseInt(type), contact);
		
		int su = bcontact_service.insert(dto);
		
		req.setAttribute("str", su == 1 ? "등록 완료" : "등록 실패");
		req.setAttribute("url", "showBpf");
		return PUBLIC+"alim.jsp";
	}
	
	@RequestMapping("bcdel")
	public String delete(int cd, Model m) {
		int su = bcontact_service.deleteContact(cd);
		m.addAttribute("str", su == 1 ? "삭제 되었습니다" : "삭제에 실패했습니다");
		m.addAttribute("url", "showBpf");
		return PUBLIC+"alim.jsp";
	}
	
	@RequestMapping("bctUp")
	public String Update(HttpServletRequest req) {
		String[] noList = req.getParameterValues("no");
		String[] typeList = req.getParameterValues("type");
		String[] ctList = req.getParameterValues("contact");
		
		int su = 0;
		for(int i = 0; i < noList.length; i++) {
			Bcontact_DTO dto = new Bcontact_DTO(Integer.parseInt(noList[i]),null,Integer.parseInt(typeList[i]), ctList[i]);
			su = bcontact_service.updateAll(dto);
		}
		
		req.setAttribute("str", su == 1 ? "업데이트 완료" : "업데이트 실패");
		req.setAttribute("url", "showBpf");
		return PUBLIC+"alim.jsp";
	}
	
}
