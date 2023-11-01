package tech.tech_test_qna;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import path.ProjectPath;
import tech.tech_test_opt.Tech_Test_Opt_DTO;
import tech.tech_test_opt.Tech_Test_Opt_Service;

@Controller
public class Tech_Test_QnA_Controller implements ProjectPath{
	private Tech_Test_QnA_Service tech_test_qna_service;
	private Tech_Test_Opt_Service tech_test_opt_service;
	
	public Tech_Test_QnA_Controller(Tech_Test_QnA_Service tech_test_qna_service,
			Tech_Test_Opt_Service tech_test_opt_service) {
		this.tech_test_qna_service = tech_test_qna_service;
		this.tech_test_opt_service = tech_test_opt_service;
	}
	
	@RequestMapping("getTest_QnA")
	public String test(int key,Model m) {
		List<Map<String,Object>> mainPract = new ArrayList<>();
		
		List<Tech_Test_QnA_DTO> getList = tech_test_qna_service.getList(key); // 채용글에 관련된 질문 리스트로
		for(int i = getList.size(); i > 0; i--) {
    		int mainRan = (int)(Math.random()*getList.size()); //리스트 사이즈 랜덤돌려 랜덤 숫자 뽑기
    		Map<String,Object> onePract = new HashMap<String, Object>();//하나의 질문과 선택을 묶기 위한 map
    		onePract.put("question", getList.get(mainRan).getQuestion()); // 일단 질문을 먼저 담고
    		
    		List<Tech_Test_Opt_DTO> optList = tech_test_opt_service.getList(getList.get(mainRan).getTech_test_qna_no());//그 질문에 해당하는 선택지 리스트로
    		List<Tech_Test_Opt_DTO> optListRan = new ArrayList<Tech_Test_Opt_DTO>(); //리스트를 옳겨 담을 List생성
    		for(int j = optList.size(); j > 0; j--) {
    			int subRan = (int)(Math.random()*optList.size()); //리스트도 랜덤 돌려
    			optListRan.add(optList.get(subRan)); //랜덤문제를 옮겨 담음
    			optList.remove(subRan);//지우기 똑같은걸 받지 않게
    		}
    		onePract.put("opts", optListRan);
    		mainPract.add(onePract);
    		getList.remove(mainRan);
    		if(mainPract.size() == 15)break;
    	}
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = null;
		try {
			jsonString = mapper.writeValueAsString(mainPract);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		m.addAttribute("question",jsonString);
		
		return TECH_TEST+"realTest.jsp";
	}
	
	@RequestMapping("end")
	public String end(HttpServletRequest req) {
		System.out.println(req.getParameter("cnt"));
		
		return "index";
	}
}
