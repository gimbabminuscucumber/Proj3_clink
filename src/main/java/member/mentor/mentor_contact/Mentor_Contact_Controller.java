package member.mentor.mentor_contact;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import member.member.Member_DTO;
import member.mentor.mentor_apply.Mentor_Apply_Service;
import path.Encry;
import path.ProjectPath;

@Controller
public class Mentor_Contact_Controller implements ProjectPath{
	private Mentor_Contact_Service mentor_contact_service;
	private Mentor_Apply_Service mentor_apply_service;
	
	public Mentor_Contact_Controller(Mentor_Contact_Service mentor_contact_service,
			Mentor_Apply_Service mentor_apply_service) {
		this.mentor_contact_service = mentor_contact_service;
		this.mentor_apply_service = mentor_apply_service;
	}
	
	
	@RequestMapping("mentorOrmentee")
	public String mentorPage(HttpServletRequest req) {
		String member_id = Encry.getUsrId(req.getSession());
		List<Map<String,Object>> mentoList = mentor_apply_service.getMentorList(member_id);
		List<Map<String,Object>> requestList = mentor_contact_service.selectRequest(member_id);
		req.setAttribute("MentorList",mentoList);
		req.setAttribute("requestList", requestList);
		return MENTOR+"mentorOrmenteePage.jsp";
	}
	
	@RequestMapping("Mentor_request")
	@ResponseBody
	public int Mentor(String response_id,HttpSession session) {
		String request_id = ((Member_DTO)session.getAttribute("login")).getMember_id();
		Mentor_Contact_DTO dto = new Mentor_Contact_DTO();
		dto.setMentee(request_id);
		dto.setMentor(response_id);
		int su = mentor_contact_service.Mentor_Request(dto);
		return su;
	}
	
	@RequestMapping("Mentor_Refusal")
	@ResponseBody
	public int delete(int no) {
		int su = mentor_contact_service.delete(no);
		return su;
	}
	
	@RequestMapping("Mentor_Accept")
	@ResponseBody
	public int accept(int no) {
		int su = mentor_contact_service.accept(no);
		
		return su;
	}
	
	@RequestMapping("mentordisconnect")
	public String disconnect(int cn,Model m) {
		int su = mentor_contact_service.disconnect(cn);
		m.addAttribute("str", su != 0 ? "삭제완료" : "삭제 실패");
		m.addAttribute("url","personconnection");
		return PUBLIC+"alim.jsp";
	}
	
	
}
