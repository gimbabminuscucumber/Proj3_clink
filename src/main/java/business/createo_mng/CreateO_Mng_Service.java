package business.createo_mng;

import java.util.List;
import java.util.Map;

public class CreateO_Mng_Service {
	private CreateO_Mng_DAO createo_mng_dao;
	
	public CreateO_Mng_Service(CreateO_Mng_DAO createo_mng_dao) {
		this.createo_mng_dao = createo_mng_dao;
	}
	
	
	public int createOpUser(CreateO_Mng_DTO dto) {
		return createo_mng_dao.createOpUser(dto);
	}
	
	public CreateO_Mng_DTO getUserData(String id) {
		return createo_mng_dao.getUserData(id);
	}
	
	public List<Map<String,Object>> getAllList(Map<String,Object> id){
		return createo_mng_dao.getAllList(id);
	}
	
	public int oneDelete(String id) {
		return createo_mng_dao.oneDelete(id);
	}
	
	
}
