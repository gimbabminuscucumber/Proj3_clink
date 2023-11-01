package cat.school_c;

import java.util.List;

public class School_C_Service {

	private School_C_DAO school_c_dao;
	
	public School_C_Service(School_C_DAO school_c_dao) {
		this.school_c_dao = school_c_dao;
	}
	
	public List<School_C_DTO> selectList(){
		
		List<School_C_DTO> list = school_c_dao.selectList();
		
		if(list.isEmpty()) {
			list = null;
		}
		return list;
	}
	
	
	
}
