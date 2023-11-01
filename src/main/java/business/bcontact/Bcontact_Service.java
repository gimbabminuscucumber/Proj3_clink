package business.bcontact;

import java.util.List;
import java.util.Map;

public class Bcontact_Service {
	private Bcontact_DAO bcontact_dao;
	
	public Bcontact_Service(Bcontact_DAO bcontact_dao) {
		this.bcontact_dao = bcontact_dao;
	}
	
	public List<Map<String,Object>> getOneBcontact(String id){
		return bcontact_dao.getOneBcontact(id);
	}
	
	public int insert(Bcontact_DTO dto) {
		return bcontact_dao.insert(dto);
	}
	
	public int deleteContact(int no) {
		return bcontact_dao.deleteContact(no);
	}
	
	public int updateAll(Bcontact_DTO dto) {
		return bcontact_dao.updateAll(dto);
	}
	
}
