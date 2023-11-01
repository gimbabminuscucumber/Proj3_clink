package business.bpf;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import business.bcontact.Bcontact_Service;
import business.bcontact_type.Bcontact_Type_DTO;
import business.bcontact_type.Bcontact_Type_Service;
import business.bmember.Bmember_DTO;
import business.bmember.Bmember_Service;
import business.bpf_sns.Bpf_SNS_Service;
import business.bpf_url.Bpf_Url_Service;
import business.createo_mng.CreateO_Mng_Service;
import cat.homepg_type_c.Homepg_Type_C_DTO;
import cat.homepg_type_c.Homepg_Type_C_Service;
import cat.sns_c.SNS_C_DTO;
import cat.sns_c.SNS_C_Service;
import path.Encry;
import path.ProjectPath;

@Controller
public class Bpf_Controller implements ProjectPath{
	// 각자 테이블의 리스트를 가져오기위해 서비스 객체들 의존성 주입
	private Bpf_Service bpf_service;
	private Bmember_Service bmember_service;
	private Bcontact_Service bcontact_service;
	private Bcontact_Type_Service bcontact_type_service;
	private Bpf_Url_Service bpf_url_service;
	private Bpf_SNS_Service bpf_sns_service;
	private Homepg_Type_C_Service homepg_type_c_service;
	private SNS_C_Service sns_c_service;
	private CreateO_Mng_Service createo_mng_service;
	
	@Autowired
	private ServletContext application;
	
	public Bpf_Controller(Bpf_Service bpf_service,Bmember_Service bmember_service,Bcontact_Service bcontact_service,
			Bcontact_Type_Service bcontact_type_service,Bpf_Url_Service bpf_url_service,Bpf_SNS_Service bpf_sns_service,
			Homepg_Type_C_Service homepg_type_c_service, SNS_C_Service sns_c_service,CreateO_Mng_Service createo_mng_service) {
		this.bpf_service = bpf_service;
		this.bmember_service = bmember_service;
		this.bcontact_service = bcontact_service;
		this.bcontact_type_service = bcontact_type_service;
		this.bpf_url_service = bpf_url_service;
		this.bpf_sns_service = bpf_sns_service;
		this.homepg_type_c_service = homepg_type_c_service;
		this.sns_c_service = sns_c_service;
		this.createo_mng_service = createo_mng_service;
	}
	// /각자 테이블의 리스트를 가져오기위해 서비스 객체들 의존성 주입
	
	@RequestMapping("profile/showBpf")
	public String getProfile(HttpServletRequest req) {
		String bmember_id = Encry.getBmember_id(req.getSession());
		Bmember_DTO bdto = bmember_service.getUserData2(bmember_id);
		Bpf_DTO profile = bpf_service.getOneProfile(bmember_id);
		
		Map<String,Object> map = new HashMap<>();
		map.put("id", bmember_id);
		if(!Encry.whatDTO(req.getSession())) {
			String createId = Encry.getUsrId(req.getSession());
			map.put("my", createId );
		}
		
		// 나의 데이터
		List<Map<String,Object>> bcontact_List = bcontact_service.getOneBcontact(bmember_id);
		List<Map<String,Object>> bpf_url_List = bpf_url_service.getUrlList(bmember_id);
		List<Map<String,Object>> bpf_sns_List = bpf_sns_service.getSNSList(bmember_id);
		List<Map<String,Object>> createO_List = createo_mng_service.getAllList(map);
		// 테이터 각자의 타입
		List<Bcontact_Type_DTO> bcontact_type_List = bcontact_type_service.getTypeList();
		List<Homepg_Type_C_DTO> homepgList = homepg_type_c_service.getList();
		List<SNS_C_DTO> SNS_type_List = sns_c_service.getList();
		
		//이거는 유저 프로필이냐  비즈니스 프로필이냐 처리를 위해 넘기는 값 근대 다른 방식 생각중 무시해도 되요
		req.setAttribute("kind", "bisi");
		
		req.setAttribute("bdto", bdto);
		req.setAttribute("profile", profile);
		req.setAttribute("bcontact", bcontact_List);
		req.setAttribute("bpf_url", bpf_url_List);
		req.setAttribute("bpf_sns", bpf_sns_List);
		req.setAttribute("createo", createO_List);
		
		req.setAttribute("bcontact_Type", bcontact_type_List);
		req.setAttribute("homepage_Type", homepgList);
		req.setAttribute("sns_Type", SNS_type_List);
		
		return PROFILE+"business.jsp";
	}
	
	//프로필 업데이트
	@RequestMapping("/bmpUp")
	public String memberAndProfileUpdate(HttpServletRequest req) {
		String name = req.getParameter("name");
		String eNname = req.getParameter("eNname");
		String content = req.getParameter("content");
		String empl_cnt = req.getParameter("empl_cnt").equals("") ? "0" : req.getParameter("empl_cnt");
		String hp = req.getParameter("hp");
		String mextb = req.getParameter("extb");
		java.sql.Date extb = !mextb.equals("") ? Encry.getSQLDate(mextb) : null;
		String expert = req.getParameter("expert");
		String detail = req.getParameter("detail");
		
		Bmember_DTO mdto = ((Bmember_DTO)req.getSession().getAttribute("login"));
		mdto.setName(name);
		mdto.seteNname(eNname);
		Bpf_DTO pdto = bpf_service.getOneProfile(mdto.getBmember_id());
		
		
		int msu = bmember_service.updateUser(mdto);
		int su = 0;
		
		if(pdto == null) {
			pdto = new Bpf_DTO(Encry.getUUID("BBPXX"), mdto.getBmember_id(), null, 0,content, Integer.parseInt(empl_cnt), expert, hp, extb, detail);
			su = bpf_service.insertProfile(pdto);
		}else {
			pdto.setContent(content);
			pdto.setEmpl_cnt(Integer.parseInt(empl_cnt));
			pdto.setHp(hp);
			pdto.setExtb(extb);
			pdto.setExpert(expert);
			pdto.setDetail(detail);;
			su = bpf_service.updateProfile(pdto);
		}
		
		req.setAttribute("str", (su == 1 && msu == 1 ? "업데이트 성공" : "업데이트 실패"));
		req.setAttribute("url", "showBpf");
		return PUBLIC+"alim.jsp";
	}
	
	@RequestMapping("logo")
	@ResponseBody
	public void updateLogo(MultipartFile file,HttpServletRequest req) {
		System.out.println(file.getOriginalFilename());
		
		String savePath = application.getRealPath("/resources/profilePicture");
		String fileName = file.getOriginalFilename();
		String bmember_id = Encry.getBmember_id(req.getSession());
		File saveFile = new File(savePath, fileName);
		
		if(!saveFile.exists()) {
			saveFile.mkdir();
		}else {//이름변경 작업
			long time = System.currentTimeMillis();
			
			fileName = String.format("%s%d%s", fileName.substring(0, fileName.lastIndexOf(".")),time,fileName.substring(fileName.lastIndexOf(".")));//중간에 시간을 넣기 위한 작업
		
			saveFile = new File(savePath,fileName);
		}
		
		try {
			file.transferTo(saveFile);//이름 바꾸기?
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		bpf_service.updateLogo(fileName,bmember_id);
		((Bpf_DTO)req.getSession().getAttribute("my")).setLogo(fileName);
	}
	
}
