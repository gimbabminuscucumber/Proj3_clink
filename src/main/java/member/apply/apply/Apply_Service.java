package member.apply.apply;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

public class Apply_Service {

	private Apply_DAO apply_dao;
	
	public Apply_Service(Apply_DAO apply_dao) {
		this.apply_dao = apply_dao;
	}

	public int insert(Apply_DTO dto) {
		return apply_dao.insert(dto);
	}
	
	public int update(Apply_DTO dto) {
		return apply_dao.update(dto);
	}
	
	public int hidden(String no) {
		return apply_dao.hidden(no);
	}
	
	
	public List<Apply_DTO> selectList(){
		return apply_dao.selectList();
	}
	
	public Map<String, Object> selectOne(String no){
		return apply_dao.selectOne(no);
	}
	
	public List<Map<String, Object>> getContent(String no){
		return apply_dao.getContent(no);
	}
	
	public List<Map<String, Object>> applyList(){
		List<Map<String, Object>> applyList = apply_dao.applyList();
		
		if(applyList.isEmpty()) {
			applyList = null;
		}
		return applyList;
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
