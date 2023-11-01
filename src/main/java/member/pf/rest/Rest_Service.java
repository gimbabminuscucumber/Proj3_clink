package member.pf.rest;

import java.util.List;
import java.util.Map;

public class Rest_Service {

	private Rest_DAO rest_dao;
	
	public Rest_Service(Rest_DAO rest_dao) {
		this.rest_dao = rest_dao;
	}
	
	public int insert(Rest_DTO dto) {
		return rest_dao.insert(dto);
	}
	
	public int update(Rest_DTO dto) {
		return rest_dao.update(dto);
	}
	
	public int delete(String no) {
		return rest_dao.delete(no);
	}

	public List<Rest_DTO> selectList(Map<String, Object> map){
		return rest_dao.selectList(map);
	}
	
	public Map<String, Object> selectOne(String no){
		return rest_dao.selectOne(no);
	}
	
	public List<Map<String, Object>> restList(){
		return rest_dao.restList();
	}
	
}
