package member.ilchon;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import member.member.Member_DTO;
import member.mentor.mentor_contact.Mentor_Contact_Service;
import path.Encry;
import path.ProjectPath;

@Controller
public class Ilchon_Controller implements ProjectPath{
	private Ilchon_Service ilchon_service;
	private Mentor_Contact_Service mentor_contact_service;
	
	public Ilchon_Controller(Ilchon_Service ilchon_service,Mentor_Contact_Service mentor_contact_service) {
		this.ilchon_service = ilchon_service;
		this.mentor_contact_service = mentor_contact_service;
	}
	
	@RequestMapping("personconnection")
	public String connect(HttpServletRequest req) {
		Member_DTO dto = (Member_DTO)req.getSession().getAttribute("login");
		String member_id = dto.getMember_id();

		int cnt = ilchon_service.getAskedCnt(member_id);
		List<Map<String,Object>> ilchonList = ilchon_service.getIlchonList(member_id);
		List<Map<String,Object>> myMentors = mentor_contact_service.getMyMentors(member_id);
		if(dto.getMentor() == 1) {
			List<Map<String,Object>> myMentees = mentor_contact_service.getMyMentees(member_id);
			req.setAttribute("menteeList", myMentees);
		}
		
		req.setAttribute("mentorList", myMentors);
		
		req.setAttribute("ilchonList", ilchonList);
		req.setAttribute("askedcnt", cnt);
		return 인맥+"index.jsp";
	}
	
	@RequestMapping("sentIlchon")
	public String sent(HttpServletRequest req) {
		String member_id = Encry.getUsrId(req.getSession());
		String email = req.getParameter("email");
		int nextGno = ilchon_service.getNextGroupNo();
		
		Ilchon_DTO id1dto = new Ilchon_DTO(member_id,email,1,nextGno);
		int id1su = ilchon_service.sentIlchon(id1dto);
		Ilchon_DTO id2dto = new Ilchon_DTO(email,member_id,0,nextGno);
		int id2su = ilchon_service.sentIlchon(id2dto);
		
		req.setAttribute("str", id1su == 1 && id2su == 1 ? "요청을 보냈습니다" : "요청을 보내는데 실패했습니다");
		req.setAttribute("url", "personconnect");
		return PUBLIC+"alim.jsp";
	}
	
	@RequestMapping("showMyIlchon")
	public String getIlchon(HttpServletRequest req) {
		String member_id = Encry.getUsrId(req.getSession());
		List<Map<String, Object>> sentList = ilchon_service.getSentList(member_id);
		List<Map<String, Object>> askedList = ilchon_service.getAskedList(member_id);
		req.setAttribute("sentList", sentList);
		req.setAttribute("askedList", askedList);
		return ILCHON+"myconnectionList.jsp";
	}
	
	@RequestMapping("checkMail")
	@ResponseBody
	public int check(String mail,HttpSession session) {
		String member_id = Encry.getUsrId(session);
		Ilchon_DTO dto =  ilchon_service.checkMail(member_id , mail);
		
		int su = 0;
		if(dto != null) {
			if(dto.getStat() == 1) {
				su = 1;
			}else if(dto.getType() == 0) {
				su = 2;
			}else if(dto.getType() == 1) {
				su = 3;
			}
		}
		return su;
	}
	
	
	@RequestMapping("IlchonAccept")
	@ResponseBody
	public String accept(int gno,int type) {
		if(type == 0) {
			ilchon_service.updateAt(gno);			
		}else if(type == 1) {
			ilchon_service.delete(gno);
		}
			
		return "showMyIlchon";
	}
	
	@RequestMapping("ilchondestroy")
	public String destroy(int in,Model m) {
		
		int su = ilchon_service.destroy(in);
		System.out.println(su);
		m.addAttribute("str",su != 0 ? "삭제되었습니다":"삭제에 실패했습니다");
		m.addAttribute("url","personconnection");
		return PUBLIC+"alim.jsp";
	}
	
	
	
	
}
