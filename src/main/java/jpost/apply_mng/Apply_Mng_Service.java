package jpost.apply_mng;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

public class Apply_Mng_Service {

	private Apply_Mng_DAO apply_mng_dao;
	
	public Apply_Mng_Service(Apply_Mng_DAO apply_mng_dao) {
		this.apply_mng_dao = apply_mng_dao;
	}
	
	public List<Apply_Mng_DTO> selectList(Map<String, Object> map){
		
		List<Apply_Mng_DTO> list = apply_mng_dao.selectList(map);
		
		if(list.isEmpty()) {
			list = null;
		}
		
		return list;
	}
	
	// 지원서 클릭시, 회원 프로필 및 자기소개 등 정보 표시
	public Map<String, Object> apply_usr(String no){
		
		return apply_mng_dao.apply_usr(no);
	}
	
	
	// 채용공고 전체 리스트
	public List<Map<String, Object>> apply_all(){
	
		List<Map<String, Object>> apply_all = apply_mng_dao.apply_all();
		
		return apply_all;
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

	// CRUD	
	public int insert(Apply_Mng_DTO dto) {
		return apply_mng_dao.insert(dto);
	}

}
