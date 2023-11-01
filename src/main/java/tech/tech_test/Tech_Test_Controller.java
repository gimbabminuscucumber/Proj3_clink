package tech.tech_test;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import path.ProjectPath;

@Controller
public class Tech_Test_Controller implements ProjectPath{
	private Tech_Test_Service tech_test_service;
	
	public Tech_Test_Controller(Tech_Test_Service tech_test_service) {
		this.tech_test_service = tech_test_service;
	}
	
	@RequestMapping("tech_test")
	public String goMain(Model m) {
		List<Map<String,Object>> techList = tech_test_service.getList();
 
		m.addAttribute("techList",techList);
		return TECH_TEST+"mainTech.jsp";
	}
}
