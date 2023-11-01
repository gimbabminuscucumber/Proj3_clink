package member.recommand.rec_ask;

import java.util.List;
import java.util.Map;

public class Rec_Ask_Service {

	private Rec_Ask_DAO rec_ask_dao;
	
	public Rec_Ask_Service(Rec_Ask_DAO rec_ask_dao) {
		this.rec_ask_dao = rec_ask_dao;
	}
	
	public int insert(Rec_Ask_DTO dto) {
		return rec_ask_dao.insert(dto);
	}
	
	public int update(Rec_Ask_DTO dto) {
		return rec_ask_dao.update(dto);
	}
	
	public int delete(String no) {
		return rec_ask_dao.delete(no);
	}
	
	public List<Rec_Ask_DTO> selectList(Map<String, Object> map){
		return rec_ask_dao.selectList(map);
	}
	
	public Map<String, Object> selectOne(String no){
		return rec_ask_dao.selectOne(no);
	}
	
	public Map<String, Object> content(String no) {
		return rec_ask_dao.content(no);
	}
	
	public List<Map<String, Object>> rec_askList(){
		return rec_ask_dao.rec_askList();
	}

}
