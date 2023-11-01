package member.pf.proj_entry;

import java.util.List;
import java.util.Map;

public class Proj_Entry_Service {

	private Proj_Entry_DAO proj_entry_dao;
	
	public Proj_Entry_Service(Proj_Entry_DAO proj_entry_dao) {
		this.proj_entry_dao = proj_entry_dao;
	}
	
	public int insert(Proj_Entry_DTO dto) {
		return proj_entry_dao.insert(dto);
	}
	
	public int udpate(Proj_Entry_DTO dto) {
		return proj_entry_dao.update(dto);
	}
	
	public int delete(String no) {
		return proj_entry_dao.delete(no);
	}
	
	public List<Proj_Entry_DTO> selectList(Map<String, Object> map){
		return proj_entry_dao.selectList(map);
	}

	public Map<String, Object> selectOne(String no){
		return proj_entry_dao.selectOne(no);
	}
	
}
