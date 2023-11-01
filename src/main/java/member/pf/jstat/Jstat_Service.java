package member.pf.jstat;

import java.util.List;
import java.util.Map;


public class Jstat_Service {

	private Jstat_DAO jstat_dao;
	
	public Jstat_Service(Jstat_DAO jstat_dao) {
		this.jstat_dao = jstat_dao;
	}
	
	public int insert(Jstat_DTO dto) {
		return jstat_dao.insert(dto);
	}
	
	public int update(Jstat_DTO dto) {
		return jstat_dao.update(dto);
	}
	
	public int delete(String no) {
		return jstat_dao.delete(no);
	}
	
	public List<Jstat_DTO> selectList(Map<String, Object> map){
		return jstat_dao.selectList(map);
	}
	
	public Map<String, Object> selectOne(String no){
		return jstat_dao.selectOne(no);
	}
	
	public List<Map<String, Object>> jstatList(){
		return jstat_dao.jstatList();
	}
	
}
