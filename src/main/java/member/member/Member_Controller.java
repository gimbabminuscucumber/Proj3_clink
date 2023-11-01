package member.member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import path.Encry;
import path.ProjectPath;

@Controller
public class Member_Controller<T> implements ProjectPath{
	private Member_Service member_service;
	
	public Member_Controller(Member_Service member_service) {
		this.member_service = member_service;
	}
	
	@RequestMapping("mlogin")
	public String login(HttpServletRequest req) {
//		String id = req.getParameter("id");
//		String pw = req.getParameter("pw");
//		Member_DTO dto = new Member_DTO(id, pw);
//		
		Member_DTO dto = member_service.imsi();
//		if(dto != null) {
			req.getSession().setAttribute("login",dto);
			req.getSession().setAttribute("t","m");
			return "index";
//		}
//		return VIEWS+"home.js";
	}
	
	@RequestMapping("usrList")
	@ResponseBody
	public List<Map<String,Object>> usrList(String data,HttpSession session){
		String member_id = Encry.getUsrId(session);
		Map<String,Object> map = new HashMap<>();
		map.put("member_id", member_id);
		map.put("keyword", data);
		List<Map<String,Object>> list = member_service.getList(map);
		
		return list;
	}
	
	

	
	
}
