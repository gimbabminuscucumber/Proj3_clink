package cat.worktime_c;

import java.util.List;

public class Worktime_C_Service {

	private Worktime_C_DAO worktime_c_dao;
	
	public Worktime_C_Service(Worktime_C_DAO worktime_c_dao) {
		this.worktime_c_dao = worktime_c_dao;
	}
	
	public List<Worktime_C_DTO> selectList(){
		
		List<Worktime_C_DTO> list = worktime_c_dao.selectList();
		
		if(list.isEmpty()) {
			list = null;
		}
		
		return list;
	}
	
}
