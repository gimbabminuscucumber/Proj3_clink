package cat.posi_c;

import java.util.List;

public class Posi_C_Service {

	private Posi_C_DAO posi_c_dao;
	
	public Posi_C_Service(Posi_C_DAO posi_c_dao) {
		this.posi_c_dao = posi_c_dao;
	}
	
	public List<Posi_C_DTO> selectList(){
		
		List<Posi_C_DTO> list = posi_c_dao.selectList();
		
		if(list.isEmpty()) {
			list = null;
		}
		return list;
	}
	
	
	
}
