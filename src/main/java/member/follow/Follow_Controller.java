package member.follow;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import path.ProjectPath;

@Controller
public class Follow_Controller implements ProjectPath {
	
	private Follow_Service follow_service;
	
	public Follow_Controller(Follow_Service follow_service) {
		this.follow_service = follow_service;
	}
	
	@RequestMapping("followpage")
	public String page() {
		
		return FOLLOW+"follow.jsp";
	}
}
