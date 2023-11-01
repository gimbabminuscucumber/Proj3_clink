package headerController;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import path.ProjectPath;

@Controller
public class HomeController implements ProjectPath{
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class); //logger이란 뭘까?

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, HttpServletRequest req) {
		System.out.println("컨트롤러 실행");
		return  "/WEB-INF/views/home.jsp"; //PROFILE+"business.jsp"; //"/WEB-INF/views/cLayout/header.jsp";
	}
	
	
	
//	@RequestMapping("like")
//	@ResponseBody
//	public void dd(String alim,HttpSession session) {
//		System.out.println(alim);
//		if(alim != null) {
//			session.setAttribute("ALIM", alim);			
//		}
//	}

}
