package jpost;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import cat.empl_type_c.Empl_Type_C_Service;
import cat.jarea_c.Jarea_C_Service;
import cat.lv_c.Lv_C_Service;
import cat.posi_c.Posi_C_Service;
import cat.school_c.School_C_Service;
import cat.worktime_c.Worktime_C_Service;
import common.ViewPath;
import jpost.jpost.Jpost_DTO;
import jpost.jpost.Jpost_Service;
import jpost.jpost_detail.Jpost_Detail_DTO;
import jpost.jpost_detail.Jpost_Detail_Service;
import member.apply.apply.Apply_Service;

@Controller
public class Jpost_Controller {

	private Jpost_Service jpost_service;
	private Jpost_Detail_Service jpost_detail_service;
	private Empl_Type_C_Service empl_type_c_service;
	private Jarea_C_Service jarea_c_service;
	private Worktime_C_Service worktime_c_service;
	private Lv_C_Service lv_c_service;
	private School_C_Service school_c_service;
	private Posi_C_Service posi_c_service;
	private Apply_Service apply_service;
	
	public Jpost_Controller(Jpost_Service jpost_service, Jpost_Detail_Service jpost_detail_service, Empl_Type_C_Service empl_type_c_service, Worktime_C_Service worktime_c_service, Jarea_C_Service jarea_c_service, Lv_C_Service lv_c_service, School_C_Service school_c_service, Posi_C_Service posi_c_service, Apply_Service apply_service) {
		this.jpost_service = jpost_service;
		this.jpost_detail_service = jpost_detail_service;
		this.empl_type_c_service = empl_type_c_service;
		this.worktime_c_service = worktime_c_service;
		this.jarea_c_service = jarea_c_service;
		this.lv_c_service = lv_c_service;
		this.school_c_service = school_c_service;
		this.posi_c_service = posi_c_service;
		this.apply_service = apply_service;
	}
	
	// 페이징 처리는 안함 > 무한 스크롤로 대체
	@RequestMapping("/jpost/list")
	public String list(Model model, String type,String word) {
		
		// 채용공고 데이터 불러오기
		List<Map<String, Object>> all_list = jpost_service.all_list();		
	
//		// 채용공고 마감일 출력
//		// - 참고 자료 1 : https://m.blog.naver.com/sosow0212/222582155275
//		// - 참고 자료 2 : https://chobopark.tistory.com/202
//		// - 참고 자료 3 : https://coding-factory.tistory.com/737
//		List<Jpost_VO> jpostTime = jpost_service.jpostTimeList();
//		
//		System.out.println("jpostTimeList = " + jpost_service.jpostTimeList());	
//		
//		// 현재 날짜
//		LocalDate now = LocalDate.now();
//		// 포멧 정의
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");	// DateTimeFormatter : 날짜, 시간 개체를 처리하도록도와주는 formatter 클래스
//																					// - 의 패턴을 "yyyy-MM-dd"로 하겠다
//		//LocalDate now = LocalDate.now();											// LocalDate : 현재 날짜 정보 출력
//		
//		for(Jpost_VO v: jpostTime) {
//			
//		//DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");					// 날짜 형식을 String 혹은 String을 날짜 형식으로 변환하기 위한 메소드
//			
//			Date deadLine = v.getEnd_date();			// 채용공고 종료일
//			String today = now.format(formatter);		// 오늘 날짜
//			
//			try {
//				Date deadLineDate = deadLine;
//				Date todayDate = (Date) formatter.parse(today);
//				
//				long dayLeft = (deadLineDate.getTime() - todayDate.getTime()) / (24*60*60*1000);
//				int lastDay = (int)dayLeft;
//			
//				if(lastDay < 0) {
//					lastDay = 0;				// 잔여 일수가 0일 미만이면 0일로 표기
//				}
//			
//				v.setD_day(lastDay);			// 잔여일수
//		
//				System.out.println("list에서 deadLineDate = " + deadLineDate);
//				System.out.println("list에서 today = " + today);
//				System.out.println("list에서 todayDate = " + todayDate);
//				System.out.println("list에서 lastDay = " + lastDay);
//			
//			}catch(ParseException e) {
//				e.printStackTrace();
//			}
//		}
//		
////		request.setAttribute("d_day", jpost_service.jpostTimeList());	
//		model.addAttribute("d_day", jpost_service.jpostTimeList());
		
		// 검색 기능	
		// - 작동 안됨!!!!!!!!!!!!!!!!!
		HashMap<String, Object> mapSearch = new HashMap<String, Object>();
		
		if(type != null && type.equals("")) {
			type = null;
			word = null;
		}
		
		mapSearch.put("type", type);
		mapSearch.put("word", word);

		List<Jpost_DTO> list = jpost_service.selectList(mapSearch);
		
		model.addAttribute("all_list", all_list);	
		model.addAttribute("list", list);	

		//	all_list 메소드로 대체 됨
//		Map<String, Object> map = new HashMap<String, Object>();
//		List<Jpost_VO> list = jpost_service.selectList(map);
//		model.addAttribute("list", list);						// "list"는 model을 통해 날릴 변수이고, list는 jpost_service.selectList(map)을 담은 변수의 key값
		
		return ViewPath.JPOST + "list.jsp";
	}
	
	
	@RequestMapping("/jpost/writeform")
	public String writeform(Model model) {
		
		// 공통 테이블 데이터 불러오기 - 근무형태
		List<cat.empl_type_c.Empl_Type_C_DTO> elist = empl_type_c_service.selectList();	
		
		// 공통 테이블 데이터 불러오기 - 근무시간
		List<cat.worktime_c.Worktime_C_DTO> wlist = worktime_c_service.selectList();	
		
		// 공통 테이블 데이터 불러오기 - 직군
		List<cat.jarea_c.Jarea_C_DTO> jlist = jarea_c_service.selectList();	
		
		// 공통 테이블 데이터 불러오기 - 경력
		List<cat.lv_c.Lv_C_DTO> llist = lv_c_service.selectList();
		
		// 공통 테이블 데이터 불러오기 - 교육
		List<cat.school_c.School_C_DTO> slist = school_c_service.selectList();	
		
		// 공통 테이블 데이터 불러오기 - 직급
		List<cat.posi_c.Posi_C_DTO> plist = posi_c_service.selectList();	
		
		model.addAttribute("elist", elist);
		model.addAttribute("wlist", wlist);
		model.addAttribute("jlist", jlist);
		model.addAttribute("llist", llist);
		model.addAttribute("slist", slist);
		model.addAttribute("plist", plist);
		
		return ViewPath.JPOST + "write.jsp";
	}
	
	@Autowired
	private ServletContext application;	// 파일업로드에 필요(application)
	
	@RequestMapping("/jpost/write")
	//HttpServletRequest 사용
	public String write(HttpServletRequest request, Jpost_DTO vo) {			// model 쓰는 이유 : addAttribute 쓰려고
																			// vo를 파라미터 값을 받아 올 수 없어서 request를 사용 
																			// >> 특징 : 일회성 데이터들이기 때문에 저장할 수 있도록 String howto = request.getParameter를 쓰고 new 생성자로 해당 데이터들을 받아와서 저장해야함
																			// >> 장점 : 분산돼 있는 여러 vo들을 한번에 사용할 수 있음

//		request.getParameter("title");							// 받아오는 데이터를 일회성으로 저장하지 않고 request의 getParameter로 보내는 용도
																// - 데이터들을 DB에 저장하기 위해선 하기 내용 처럼 데이터 받아와야함
		
		// Jpost 테이블 칼럼
		String jpost_id = ViewPath.getUUID("JPXX");
		String howto = request.getParameter("howto");			// 반환 타입에 맞는 형태로 값을 받아줘야함 / getParameter가 String 타입이라서 맨 앞에 String으로 타입을 맞춰준다
		String title = request.getParameter("title");			// - 사용자에게 입력 받을 값들만 파라미터로 기입
		String detail = request.getParameter("detail");			// Service에서 CLOB을 String 으로 형변환
		String start_date = request.getParameter("start_date");		
		String end_date = request.getParameter("end_date");		
//		String d_day = request.getParameter("d_day");
		String locate = request.getParameter("locate");		
		String url = request.getParameter("url");		
		String file_name = request.getParameter("file_name");
		
		// empl_type 테이블 칼럼
		String empl_type_cno = request.getParameter("empl_type_cno");

		// jarea 테이블 칼럼
		String jarea_cno = request.getParameter("jarea_cno");

		// worktime 테이블 칼럼
		String worktime_cno = request.getParameter("worktime_cno");
		
		// school 테이블 칼럼
		String school_cno = request.getParameter("school_cno");
		
		// lv 테이블 칼럼
		String lv_cno = request.getParameter("lv_cno");

		// posi 테이블 칼럼
		String posi_cno = request.getParameter("posi_cno");
		
		// Jpost_detail 테이블 칼럼
		String jpost_detail_id = ViewPath.getUUID("JPDX");
		String task = request.getParameter("task");
		String salary = request.getParameter("salary");
		String type = request.getParameter("type");
		
		// String을 Date 타입으로 형변환하는 메소
		Date sstart_date  = Jpost_Service.getSQLDate(start_date);
		Date send_date  = Jpost_Service.getSQLDate(end_date);
		
//		// d_day 칼럼에 null 값 넣기
//		System.out.println("String d_day 1 = " + d_day);
//		if(d_day == null) {
//			d_day = null;
//		}
//		
//		System.out.println("String d_day 2 = " + d_day);
		
		// 파일 업로드
		String savePath = application.getRealPath("/resources/upload");
		String filename = null;
		
		// Jpost_VO 관련		>>> request로 넘기려면 어떻게??
		MultipartFile fileupload = vo.getJpost_upload();
		
		if(fileupload != null && !fileupload.isEmpty()) {
			filename = fileupload.getOriginalFilename();
			
			File saveFile = new File(savePath, filename);
			
			if(!saveFile.exists()) {
				saveFile.mkdirs();
			}else {
				long time = System.currentTimeMillis();
				filename = String.format("%s%d%s", filename.substring(0, filename.lastIndexOf(".")), time, filename.substring(filename.lastIndexOf(".")));
			
				saveFile = new File(savePath, filename);
			}
			
			try {
				fileupload.transferTo(saveFile);
			}catch(IllegalStateException | IOException e) {
				e.printStackTrace();
			}
			vo.setFile_name(filename);
		
		}else {
			vo.setFile_name("no_file");
		}
		
		// 두 개의 다른 테이블을 Join해서 쓰기 때문에 각각 생성자 생성
		// - int를 String 타입으로 형변환하는 방법 : 파라미터 값에 Integer.parseInt(howto)로 입력
		// - 사용자에게 입력 받을 값들만 파라미터로 기입
		// - vo에 생성자와 일치시켜야함
		Jpost_DTO jvo = new Jpost_DTO(
				jpost_id
				, Integer.parseInt(howto)
				, title, detail
				, sstart_date
				, send_date
//				, Integer.parseInt(d_day)
				, locate
				, url
				, file_name
		);
		System.out.println(" 오류 확인 1 ");
		Jpost_Detail_DTO dvo = new Jpost_Detail_DTO(
				jpost_detail_id
				, jpost_id
				, Integer.parseInt(jarea_cno)
				, Integer.parseInt(worktime_cno)
				, Integer.parseInt(empl_type_cno)
				, Integer.parseInt(posi_cno)
				, task
				, Integer.parseInt(lv_cno)
				, salary
				, Integer.parseInt(school_cno)
				, Integer.parseInt(type)
		);
		System.out.println(" 오류 확인 2 ");
		
		// jpost.xml / jpost_detail.xml 의 insert에 각각의 데이터 저장
		// - 위에 생성한 new 생성자를 파라미터에 담음
		int su = jpost_service.insert(jvo);							
		jpost_detail_service.insert(dvo);	
		
		request.setAttribute("su", su);					
		request.setAttribute("status","write");					
		request.setAttribute("url","/clink/jpost/list");			
		
		return ViewPath.JPOST + "result.jsp";
	}
	
	
	@RequestMapping("/jpost/content")
	public String content(Model model, String no) {		

		System.out.println("jpost/content 에서 no = " + no);
		
		// apply 테이블 데이터 >> jpost_content 에서 사용
		Map<String,Object> map = jpost_service.getContent(no);
		List<Map<String, Object>> applyList = apply_service.applyList();
		List<Jpost_DTO> jpostList = jpost_service.jpostList(no);
		
		model.addAttribute("vo", map);								// "vo" 는 @RequestMapping("/jpost/write") 에서 생성한 vo 객체
		//"apply_vo", applyList
		model.addAttribute("applyList", applyList);					// 얘 보내는 목적이 뭐임???
		//"jvo", jpostList
		model.addAttribute("jList", jpostList);						

		return ViewPath.JPOST + "content.jsp";
	}
	
	@RequestMapping("/jpost/updateform")							// DB에 저장된 데이터를 불러와서 update.jsp로 해당 데이터를 보내는 역할
	public String updateform(HttpServletRequest request, String no) {
		
		// 기존에 작성했던 데이터 가져오기
		Map<String, Object> map = jpost_service.getContent(no);		// DB에 저장했던 채용공고 불러오기
		List<Map<String, Object>> all_list = jpost_service.all_list();		// 채용공고에 들어가는 모든 데이터들 불러오기 (jpost, jpost_detail, empl_type_c)

		request.setAttribute("vo", map);							// jpost의 데이터(map)들을 "vo"라는 임의의 변수에 담아서 보내기
		request.setAttribute("all_list", all_list);					// 채용공고에 들어가는 모든 데이터들 all_list에 담아서 보내기
		
		// 공통 테이블 데이터 불러오기
		List<cat.empl_type_c.Empl_Type_C_DTO> elist = empl_type_c_service.selectList();	// empl_type의 고용형태 불러오기
		List<cat.jarea_c.Jarea_C_DTO> jlist = jarea_c_service.selectList();	
		List<cat.worktime_c.Worktime_C_DTO> wlist = worktime_c_service.selectList();	
		List<cat.school_c.School_C_DTO> slist = school_c_service.selectList();	
		List<cat.posi_c.Posi_C_DTO> plist = posi_c_service.selectList();	
		List<cat.lv_c.Lv_C_DTO> llist = lv_c_service.selectList();	
		
		request.setAttribute("elist", elist);						// empl_type의 고용형태(elist)를 "elist"에 담아서 보내기
		request.setAttribute("jlist", jlist);
		request.setAttribute("wlist", wlist);
		request.setAttribute("slist", slist);
		request.setAttribute("llist", llist);
		request.setAttribute("plist", plist);
			
		return ViewPath.JPOST + "update.jsp";
	}

	@RequestMapping("/jpost/update")										
	public String update(HttpServletRequest request, String no) {		// model과 request는 같이 쓸 필요없음
		
		// update.jsp 에서 수정한 데이터를 가져오기
		// Map<String, Object> map = jpost_service.getContent(no);		// DB에 저장된 데이터를 불러오는거임... 수정된거 가져오는거 아님

		// Jpost 테이블 칼럼
		String howto = request.getParameter("howto");			
		String title = request.getParameter("title");			
		String detail = request.getParameter("detail");			
		String start_date = request.getParameter("start_date");	
		String end_date = request.getParameter("end_date");	
//		String d_day = request.getParameter("d_day");
		String locate = request.getParameter("locate");		
		String url = request.getParameter("url");		
		String file_name = request.getParameter("file_name");
		
		// Jpost_detail 테이블 칼럼
		String task = request.getParameter("task");
		String salary = request.getParameter("salary");
		String type = request.getParameter("type");
		
		// jarea 테이블 칼럼
		String jarea_cno = request.getParameter("jarea_cno");
		
		// worktime 테이블 칼럼
		String worktime_cno = request.getParameter("worktime_cno");
		
		// empl_type 테이블 칼럼
		String empl_type_cno = request.getParameter("empl_type_cno");	
		
		// lv_c 테이블 칼럼
		String lv_cno = request.getParameter("lv_cno");
		
		// school_c 테이블 칼럼
		String school_cno = request.getParameter("school_cno");
		
		// posi_c 테이블 칼럼
		String posi_cno = request.getParameter("posi_cno");
		
		// String을 Date 타입으로 형변환
		Date sstart_date  = Jpost_Service.getSQLDate(start_date);
		Date send_date  = Jpost_Service.getSQLDate(end_date);
		
		
		// Join할 테이블의 생성자 (수정된 데이터가 들어갈 칼럼 기입)
		// - int는 Integer로 형변환
		Jpost_DTO vo = new Jpost_DTO(Integer.parseInt(howto), title, detail, sstart_date, send_date, /*Integer.parseInt(d_day),*/ locate, url, file_name);
		Jpost_Detail_DTO dvo = new Jpost_Detail_DTO(Integer.parseInt(jarea_cno), Integer.parseInt(worktime_cno), Integer.parseInt(empl_type_cno), Integer.parseInt(posi_cno), task, Integer.parseInt(lv_cno), salary, Integer.parseInt(school_cno), Integer.parseInt(type));

		
		// DB에 수정된 내용 저장
		int su = jpost_service.update(vo);
		jpost_detail_service.update(dvo);
		
		request.setAttribute("su", su);
		request.setAttribute("status", "update");
		request.setAttribute("url", "/clink/jpost/content?no=" + vo.getJpost_id());

		return ViewPath.JPOST + "result.jsp";
	}
	
	@RequestMapping("/jpost/hidden")
	public String hidden(HttpServletRequest request, String no) {
		
		int su = jpost_service.hidden(no);				// 삭제버튼 클릭시 숨김처리
		
		request.setAttribute("su", su);
		request.setAttribute("status", "hidden");
		request.setAttribute("url", "/clink/jpost/list");

		return ViewPath.JPOST + "result.jsp";
	}
	
	
}
