package cat.empl_type_c;

import java.util.List;

public class Empl_Type_C_Service {

	private Empl_Type_C_DAO empl_type_c_dao;
	
	public Empl_Type_C_Service(Empl_Type_C_DAO empl_type_c_dao) {
		this.empl_type_c_dao = empl_type_c_dao;
	}
	
	public List<Empl_Type_C_DTO> selectList(){
		
		List<Empl_Type_C_DTO> list = empl_type_c_dao.selectList();
		
		if(list.isEmpty()) {
			list = null;
		}
		return list;
	}
	
}
