package business.bpf_sns;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import path.Encry;
import path.ProjectPath;

@Controller
public class Bpf_SNS_Controller implements ProjectPath {
	
	private Bpf_SNS_Service bpf_sns_service;
	
	public Bpf_SNS_Controller(Bpf_SNS_Service bpf_sns_service) {
		this.bpf_sns_service = bpf_sns_service;
	}
	
	@RequestMapping("bsnIn")
	public String insert(Bpf_SNS_DTO dto,HttpServletRequest req) {
		String bmember_id = Encry.getUsrId(req.getSession());
		dto.setBmember_id(bmember_id);
		
		int su = bpf_sns_service.insert(dto);
		
		
		req.setAttribute("str", su == 1 ? "업데이트 완료" : "업데이트 실패");
		req.setAttribute("url", "showBpf");
		return PUBLIC+"alim.jsp";
	}
	
	@RequestMapping("bsndel")
	public String delete(int cd,Model m) {
		int su = bpf_sns_service.delete(cd);
		
		m.addAttribute("str", su == 1 ? "업데이트 완료" : "업데이트 실패");
		m.addAttribute("url", "showBpf");
		return PUBLIC+"alim.jsp";
	}
	
	@RequestMapping("bsnUp")
	public String update(HttpServletRequest req) {
		String[] noList = req.getParameterValues("no");
		String[] accList = req.getParameterValues("account");
		String[] stList = req.getParameterValues("sns_cno");
		
		int su = 0;
		for(int i = 0; i < noList.length; i++) {
			Bpf_SNS_DTO dto = new Bpf_SNS_DTO();
			dto.setBpf_sns_no(Integer.parseInt(noList[i]));
			dto.setAccount(accList[i]);
			dto.setSns_cno(Integer.parseInt(stList[i]));
			su = bpf_sns_service.update(dto);
		}
		
		req.setAttribute("str", su == 1 ? "업데이트 완료" : "업데이트 실패");
		req.setAttribute("url", "showBpf");
		return PUBLIC+"alim.jsp";
	}
	
	
}
