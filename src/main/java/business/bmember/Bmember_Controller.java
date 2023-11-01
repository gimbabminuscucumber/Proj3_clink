package business.bmember;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import business.bpf.Bpf_DTO;
import business.bpf.Bpf_Service;
import business.createo_mng.CreateO_Mng_DTO;
import business.createo_mng.CreateO_Mng_Service;
import business.depart_mng.Depart_Mng_DTO;
import business.depart_mng.Depart_Mng_Service;
import business.posi_mng.Posi_Mng_DTO;
import business.posi_mng.Posi_Mng_Service;
import path.Encry;
import path.ProjectPath;

@Controller
public class Bmember_Controller implements ProjectPath {
	private Bmember_Service bmember_service;
	private CreateO_Mng_Service createo_mng_service;
	private Depart_Mng_Service depart_mng_service;
	private Posi_Mng_Service posi_mng_service;
	private Bpf_Service bpf_service;
	
	public Bmember_Controller(Bmember_Service bmember_service , CreateO_Mng_Service createo_mng_service,Depart_Mng_Service depart_mng_service,
			Posi_Mng_Service posi_mng_service,Bpf_Service bpf_service) {
		this.bmember_service = bmember_service;
		this.createo_mng_service = createo_mng_service;
		this.depart_mng_service = depart_mng_service;
		this.posi_mng_service = posi_mng_service;
		this.bpf_service = bpf_service;
	}
	
	
	@RequestMapping("binsertForm")
	public String createUser() {
		return BMEMBER+"BjoinForm.jsp";
	}
	@RequestMapping("binsert") 	
	public String insert(Bmember_DTO dto) {
		String pw = dto.getPw();
		String salt = Encry.getSalt();
		String saltpw = Encry.encry(pw, salt);
		
		
		dto.setBmember_id(Encry.getUUID("BBMXX"));
		dto.setSalt(salt);;
		dto.setPw(saltpw);;
		bmember_service.insertUser(dto);
		return VIEWS+"home.jsp";
	}
	
	
	@RequestMapping("blogin")
	public java.lang.String login(HttpServletRequest req) {
		String id = req.getParameter("id");
		boolean check = false;
		String path = VIEWS+"/login/fail.jsp";
		
		CreateO_Mng_DTO odto = createo_mng_service.getUserData(id);
		if(odto != null) {
			String pw = req.getParameter("pw");
			String salt = odto.getSalt();
			System.out.println(Encry.encry(pw, salt).equals(odto.getPw()));
			if(Encry.encry(pw, salt).equals(odto.getPw())) {
				req.getSession().setAttribute("login", odto);
				req.getSession().setAttribute("t", "c");
				check = true;
			}
		}else {			
			Bmember_DTO jdto = bmember_service.getUserData(id);
			Bpf_DTO my = bpf_service.getOneProfile(jdto.getBmember_id());
			if(jdto != null) {
				String pw = req.getParameter("pw");
				String salt = jdto.getSalt();
				if(Encry.encry(pw, salt).equals(jdto.getPw())) {
					req.getSession().setAttribute("login", jdto);
					req.getSession().setAttribute("my",my);
					req.getSession().setAttribute("t", "b");
					check = true;
				}
			}
		}
		
		
		if(check) {
			path = "index";
		}
		
		return path;
	}
	
	@RequestMapping("logout")
	public String logout(HttpServletRequest req) {
		req.getSession().invalidate();
		return VIEWS+"home.jsp";
	}
	
	@RequestMapping("index")
	public String indexpage(HttpServletRequest req) {
		
		String type = (String)req.getSession().getAttribute("t");
		if(!type.equals("m")) {	
			String bmember_id = Encry.getUsrId(req.getSession());
			List<Depart_Mng_DTO> list = depart_mng_service.getList(bmember_id);
			Map<Integer,List<Posi_Mng_DTO>> posiList = new HashMap<Integer, List<Posi_Mng_DTO>>();
			
			if(list.size() != 0) {
				for(Depart_Mng_DTO dto : list) {
					posiList.put(dto.getDepart_mng_no(), posi_mng_service.getNoList(dto.getDepart_mng_no()));
				}
			}
			req.setAttribute("dlist", list);
			req.setAttribute("pMap", posiList);
		}
		
		return VIEWS+"index.jsp";
	}
	
	@RequestMapping("oplist")
	public String oplist(HttpServletRequest req) {
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("id",Encry.getBmember_id(req.getSession()));
		List<Map<String,Object>> list = createo_mng_service.getAllList(map); 
		req.setAttribute("list",list);
		return BMEMBER+"oplist.jsp";
	}
	
	
	@RequestMapping("setting")
	public String setting() {
		
		return "/WEB-INF/views/setting/setting.jsp";
	}
	
	@RequestMapping("departUp")
	public String departUp(HttpServletRequest req) {
		String[] depart = req.getParameterValues("departName");
		String[] deNo = req.getParameterValues("departNo");
		
		String[] ps = req.getParameterValues("psName");
		String[] psNo = req.getParameterValues("psNo");
		
		int desu = 0;
		for(int i = 0; i < depart.length; i++) {
			Depart_Mng_DTO dto = new Depart_Mng_DTO(Integer.parseInt(deNo[i]), depart[i]);
			desu = depart_mng_service.update(dto);
		}
		int pssu = 0;
		for(int i = 0; i < depart.length; i++) {
			Posi_Mng_DTO dto = new Posi_Mng_DTO(Integer.parseInt(psNo[i]), ps[i]);
			pssu = posi_mng_service.update(dto);
		}
		
		
		req.setAttribute("str", (desu == 1 && pssu == 1 ? "업데이트 성공" : "업데이트 실패"));
		req.setAttribute("url", "index");
		return PUBLIC+"alim.jsp";
	}
	
	
	@RequestMapping("rgck")
	@ResponseBody
	public int rgck(String num) {
		return bmember_service.rgck(num) != null ? 0 : 1;
	}
	
	
	
}
