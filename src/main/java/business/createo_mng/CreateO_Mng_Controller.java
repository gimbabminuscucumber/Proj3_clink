package business.createo_mng;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import business.depart_mng.Depart_Mng_DTO;
import business.depart_mng.Depart_Mng_Service;
import business.gradeo_mng.GradeO_Mng_DTO;
import business.gradeo_mng.GradeO_Mng_Service;
import path.Encry;
import path.ProjectPath;

@Controller
public class CreateO_Mng_Controller implements ProjectPath{
	private CreateO_Mng_Service createo_mng_service;
	private Depart_Mng_Service depart_mng_service;
	private GradeO_Mng_Service gradeo_mng_service;
	
	public CreateO_Mng_Controller(CreateO_Mng_Service createo_mng_service, Depart_Mng_Service depart_mng_service
			,GradeO_Mng_Service gradeo_mng_service) {
		this.createo_mng_service = createo_mng_service;
		this.depart_mng_service = depart_mng_service; 
		this.gradeo_mng_service = gradeo_mng_service;
	}
	
	
	
	@RequestMapping("OpJoinForm")
	public String joinForm(HttpServletRequest req) {
		String bmember_id = Encry.getUsrId(req.getSession());
		List<Depart_Mng_DTO> List = depart_mng_service.getList(bmember_id);
			
		req.setAttribute("dpList", List);
		return CREATEO_MNG+"joinForm.jsp";
	}
	
	@RequestMapping("OpCreate") 
	public String createUser(HttpServletRequest req) {
		//유저 부분
		String id = req.getParameter("opCreate_bus_usrId");
		String pw = req.getParameter("opCreate_bus_usrPw");
		String salt = Encry.getSalt();
		String saltpw = Encry.encry(pw, salt);
		
		String bmember_id = Encry.getUsrId(req.getSession());
		
		//직책번호
		int psNo = Integer.parseInt(req.getParameter("posi_mng_no"));
		String CMUUID = Encry.getUUID("BCRMX");
		CreateO_Mng_DTO dto = new CreateO_Mng_DTO(CMUUID, bmember_id, psNo , null,id, saltpw,salt);
		int csu = createo_mng_service.createOpUser(dto);
		
		//권한 부분
		int g1 = req.getParameter("grade1") == null ? 0 : 1;
		int g2 = req.getParameter("grade2") == null ? 0 : 1;
		int g3 = req.getParameter("grade3") == null ? 0 : 1;
		int g4 = req.getParameter("grade4") == null ? 0 : 1;
		GradeO_Mng_DTO gdto = new GradeO_Mng_DTO(CMUUID,g1, g2, g3, g4);
		int gsu = gradeo_mng_service.insert(gdto);
		
		req.setAttribute("str", csu != 0 && gsu != 0 ? "생성완료" : "생성실패");
		req.setAttribute("url", "index");
		return PUBLIC+"alim.jsp";
	}
	
	@RequestMapping("opupdate")
	public String oneUpdate() {
		return VIEWS+"index";
	}
	 
	@RequestMapping("opdel")
	@ResponseBody
	public int opdelete(String id) {
		int a = createo_mng_service.oneDelete(id);
		return a;
	}
	
}
