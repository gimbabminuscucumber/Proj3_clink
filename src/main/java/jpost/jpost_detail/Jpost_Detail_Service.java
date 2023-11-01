package jpost.jpost_detail;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

public class Jpost_Detail_Service {

	private Jpost_Detail_DAO jpost_detail_dao;
	
	public Jpost_Detail_Service(Jpost_Detail_DAO jpost_detail_dao) {
		this.jpost_detail_dao = jpost_detail_dao;
	}

	public Map<String, Object> selectOne(String no){
		return jpost_detail_dao.selectOne(no);
	}
	
	public List<Jpost_Detail_DTO> selectList(Map<String, Object>map){
		List<Jpost_Detail_DTO> list = jpost_detail_dao.selectList(map);
		
		if(list.isEmpty()) {
			list = null;
		}
		return list;
	}
	
	// CRUD
	public int insert(Jpost_Detail_DTO dto) {
		return jpost_detail_dao.insert(dto);
	}
	
	public int hidden(String no) {
		return jpost_detail_dao.hidden(no);
	}
	
	public int update(Jpost_Detail_DTO dto) {
		return jpost_detail_dao.update(dto);
	}
	
	
	// Controller에서 String을 Date로 형변환 하는 메소드
	public static Date getSQLDate(String date) {
		SimpleDateFormat spd = new SimpleDateFormat("yyyy-MM-dd");
		
		java.util.Date sd = null;
		
		try {
			sd = spd.parse(date);
		}catch (java.text.ParseException e) {
		}
		
		long d = sd.getTime();
		Date sqlD = new Date(d);
		return sqlD;
	}
	
}
