package business.bpf_url;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import path.Encry;
import path.ProjectPath;

@Controller
public class Bpf_Url_Controller implements ProjectPath{
	
	private Bpf_Url_Service bpf_url_service;
	
	public Bpf_Url_Controller(Bpf_Url_Service bpf_url_service) {
		this.bpf_url_service = bpf_url_service;
	}
	
	@RequestMapping("/burIn")
	public String insertUrl(Bpf_Url_DTO dto,HttpServletRequest req) {
		String bmember_id = Encry.getUsrId(req.getSession());
		dto.setBmember_id(bmember_id);
		int su = bpf_url_service.insertUrl(dto);
		
		req.setAttribute("str", su == 1 ? "업데이트 완료" : "업데이트 실패");
		req.setAttribute("url", "showBpf");
		return PUBLIC+"alim.jsp";
	}
	
	@RequestMapping("/burUp")
	public String update(HttpServletRequest req) {
		String[] noList = req.getParameterValues("no");
		String[] urlList = req.getParameterValues("url");
		String[] htList = req.getParameterValues("homepg_type_cno");
		String[] nameList = req.getParameterValues("name");
		int su = 0;
		for(int i = 0; i < noList.length; i++) {
			System.out.println(htList[i]);
			int no = Integer.parseInt(noList[i]);
			int htno = Integer.parseInt(htList[i]);
			Bpf_Url_DTO dto = new Bpf_Url_DTO(no,htno,null, urlList[i], nameList[i]); 
			su = bpf_url_service.update(dto);
		}
		
		req.setAttribute("str", su == 1 ? "업데이트 완료" : "업데이트 실패");
		req.setAttribute("url", "showBpf");
		return PUBLIC+"alim.jsp";
	}
	
	@RequestMapping("burdel")
	public String delete(int cd,Model m) {
		System.out.println(cd);
		int su = bpf_url_service.deleteOne(cd);
		
		m.addAttribute("str", su == 1 ? "삭제 완료" : "삭제 실패");
		m.addAttribute("url", "showBpf");
		return PUBLIC+"alim.jsp";
	}
	
	
	
}
