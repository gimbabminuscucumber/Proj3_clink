package jpost.jpost;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Clob;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

public class Jpost_Service {

	// 객체 생성
	// - Jpost_DAO를 jpost_dao로 사용하겠다
	private Jpost_DAO jpost_dao;

	// 생성자 > context-4 와 연결됨
	public Jpost_Service(Jpost_DAO jpost_dao) {
		this.jpost_dao = jpost_dao;
	}
	
	public List<Jpost_DTO> selectList(Map<String, Object>map){
		
		List<Jpost_DTO> list = jpost_dao.selectList(map);
		
		if(list.isEmpty()) {
			list = null;
		}
		
		return list;
	}
	
	public Map<String, Object> selectOne(String no) {		// 하나의 채용공고 게시글을 클릭했을 때 실행되는 메소드
		
		jpost_dao.hitCnt(no);					// jpost_id에 맞는 콘텐츠 클릭시, 조회수 + 1
		
		return jpost_dao.selectOne(no);			// Jpost_id로 dao에서 리스트를 하나씩 호출해라
	}
	
	// CRUD
	public int insert(Jpost_DTO dto) {			// Jpost_VO를 vo에 담아 int형 insert 변수에 넘기겠다
		return jpost_dao.insert(dto);
	}
	
	public int hidden(String no) {				// 삭제버튼 클릭시, 숨김처리
		return jpost_dao.hidden(no);
	}
	
	public int update(Jpost_DTO dto) {
		return jpost_dao.update(dto);
	}
	
	
	// Controller에서 String을 Date로 형변환 하는 메소드
	public static Date getSQLDate(String date) {
	    SimpleDateFormat spd = new SimpleDateFormat("yyyy-MM-dd");
	      
	    java.util.Date sd = null;
	   
	    try {
	    	sd = spd.parse(date);
	    } catch (java.text.ParseException e) {
	    } 
    
		long d = sd.getTime();
	    Date sqlD = new Date(d);
	    return sqlD;
	}
	
	// Controller에서 CLOB을 String로 형변환 하는 메소드
	public Map<String, Object> getContent(String no){			 		// jpost_id를 파라미터에 담아서 왔음
		
		Map<String, Object> map = jpost_dao.getContent(no);				// jpost_dao.getContent(no)를 map에 담겠다
	
		String str = "";												// 초기화
		
		StringBuffer buf = new StringBuffer();							// 객체 생성

//		Clob clob = (Clob)map.get("vo.DETAIL");							// 왜 파라미터 값으로 vo.DETAIL이 아닌가?
		
		Clob clob = (Clob)map.get("DETAIL");
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(clob.getCharacterStream());
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		try {
			while((str = br.readLine()) != null) {
				buf.append(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		map.put("DETAIL", buf.toString());
		
		jpost_dao.hitCnt(no);					// jpost_id에 맞는 콘텐츠 클릭시, 조회수 + 1

		return map;
	}
	
	// jpost / jpost_detail 칼럼들을 all_list 하나에 다 넣기
	public List<Map<String, Object>> all_list(){
		
		List<Map<String, Object>> all_list = jpost_dao.all_list();
		
		if(all_list.isEmpty()) {
			all_list = null;
		}
		
		return all_list;
	}

	public List<Jpost_DTO> jpostList(String no){
		return jpost_dao.jpostList(no);
	}

	public List<Jpost_DTO> jpostTimeList() {
		return jpost_dao.jpostTimeList();
	}

}
