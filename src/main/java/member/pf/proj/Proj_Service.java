package member.pf.proj;

import java.util.List;
import java.util.Map;

public class Proj_Service {

	private Proj_DAO proj_dao;
	
	public Proj_Service(Proj_DAO proj_dao) {
		this.proj_dao = proj_dao;
	}
	
	public int insert(Proj_DTO dto) {
		return proj_dao.insert(dto);
	}
	
	public int update(Proj_DTO dto) {
		return proj_dao.update(dto);
	}
	
	public int delete(String no) {
		return proj_dao.delete(no);
	}
	
	public List<Proj_DTO> selectList(Map<String, Object> map){
		return proj_dao.selectList(map);
	}
	
	public Map<String, Object> selectOne(String no){
		return proj_dao.selectOne(no);
	}
	
	public List<Map<String, Object>> projList(){
		return proj_dao.projList();
	}
	
}
