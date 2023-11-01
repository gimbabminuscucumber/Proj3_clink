package member.mentor.mentor_apply;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import member.member.Member_DTO;
import member.member.Member_Service;
import member.mentor.mentor_grade.Mentor_Grade_Service;
import path.ProjectPath;

@Controller
public class Mentor_Apply_Controller implements ProjectPath{
	private Mentor_Apply_Service mentor_apply_service;
	private Member_Service member_service;
	private Mentor_Grade_Service mentor_grade_service;
	
	public Mentor_Apply_Controller(Mentor_Apply_Service mentor_apply_service, Member_Service member_service,
			Mentor_Grade_Service mentor_grade_service) {
		this.mentor_apply_service = mentor_apply_service;
		this.member_service = member_service;
		this.mentor_grade_service = mentor_grade_service;
	}
	
	@RequestMapping("upmentor")
	public String insert(HttpServletRequest req) {
		String member_id = ((Member_DTO)req.getSession().getAttribute("login")).getMember_id();
		String email = req.getParameter("email");
		int mail = email != null ? 1 : 0;
		String bus_card = req.getParameter("fileName");
		Mentor_Apply_DTO dto = new Mentor_Apply_DTO(member_id, mail, bus_card);
		
		int su = mentor_apply_service.insert(dto);
		int msu = member_service.updateMember(member_id);
		int mgsu = mentor_grade_service.createGrade(member_id);
		
		req.setAttribute("str", su == 1 && msu == 1 && mgsu == 1 ? "등록 완료" : "등록 실패");
		req.setAttribute("url", "index");
		return PUBLIC+"alim.jsp";
	}
}
