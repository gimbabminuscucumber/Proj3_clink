package member.pf.edu;

import java.util.List;
import java.util.Map;

public class Edu_Service {

	private Edu_DAO edu_dao;
	
	public Edu_Service(Edu_DAO edu_dao) {
		this.edu_dao = edu_dao;
	}
	
	public int insert(Edu_DTO dto) {
		return edu_dao.insert(dto); 
	}
	
	public int update(Edu_DTO dto) {
		return edu_dao.update(dto);
	}
	
	public int delete(String no) {
		return edu_dao.delete(no);
	}
	
	public List<Edu_DTO> selectList(Map<String, Object> map){
		return edu_dao.selectList(map);
	}
	
	public Map<String, Object> selectOne(String no){
		return edu_dao.selectOne(no);
	}
	
	public List<Map<String, Object>> eduList(){
		return edu_dao.eduList();
	}
	
}
