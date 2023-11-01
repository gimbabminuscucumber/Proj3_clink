package member.pf.thesis;

import java.util.List;
import java.util.Map;

public class Thesis_Service {

	private Thesis_DAO thesis_dao;
	
	public Thesis_Service(Thesis_DAO thesis_dao) {
		this.thesis_dao = thesis_dao;
	}
	
	public int insert(Thesis_DTO dto) {
		return thesis_dao.insert(dto);
	}
	
	public int update(Thesis_DTO dto) {
		return thesis_dao.update(dto);
	}
	
	public int delete(String no) {
		return thesis_dao.delete(no);
	}
	
	public List<Thesis_DTO> selectList(Map<String, Object> map){
		return thesis_dao.selectList(map);
	}
	
	public Map<String, Object> selectOne(String no){
		return thesis_dao.selectOne(no);
	}
	
	public List<Map<String, Object>> thesisList(){
		return thesis_dao.thesisList();
	}
	
}
