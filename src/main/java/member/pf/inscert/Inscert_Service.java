package member.pf.inscert;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

public class Inscert_Service {

	private Inscert_DAO inscert_dao;
	
	public Inscert_Service(Inscert_DAO inscert_dao) {
		this.inscert_dao = inscert_dao;
	}
	
	public int insert(Inscert_DTO dto) {
		return inscert_dao.insert(dto);
	}
	
	public int update(Inscert_DTO dto) {
		return inscert_dao.update(dto);
	}
	
	public int delete(String no) {
		return inscert_dao.delete(no);
	}
	
	public List<Inscert_DTO> selectList(Map<String, Object> map){
		return inscert_dao.selectList(map);
	}
	
	public Map<String, Object> selectOne(String no){
		return inscert_dao.selectOne(no);
	}
	
	public List<Map<String, Object>> inscertList(){
		return inscert_dao.inscertList();
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
}
