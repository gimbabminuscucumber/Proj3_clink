package member.pf.org;

import java.util.List;
import java.util.Map;

public class Org_Service {

	private Org_DAO org_dao;
	
	public Org_Service(Org_DAO org_dao) {
		this.org_dao = org_dao;
	}
	
	public int insert(Org_DTO dto) {
		return org_dao.insert(dto);
	}
	
	public int update(Org_DTO dto) {
		return org_dao.update(dto);
	}
	
	public int delete(String no) {
		return org_dao.delete(no);
	}
	
	public List<Org_DTO> selectList(Map<String, Object> map){
		return org_dao.selectList(map);
	}
	
	public Map<String, Object> selectOne(String no){
		return org_dao.selectOne(no);
	}
	
	public List<Map<String, Object>> orgList(){
		return org_dao.orgList();
	}
	
}
