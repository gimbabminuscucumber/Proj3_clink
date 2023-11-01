package cat.lv_c;

import java.util.List;

public class Lv_C_Service {

	private Lv_C_DAO lv_c_dao;
	
	public Lv_C_Service(Lv_C_DAO lv_c_dao) {
		this.lv_c_dao = lv_c_dao;
	}
	
	public List<Lv_C_DTO> selectList(){
		
		List<Lv_C_DTO> list = lv_c_dao.selectList();
		
		if(list.isEmpty()) {
			list = null;
		}
		
		return list;
	}
	
}
