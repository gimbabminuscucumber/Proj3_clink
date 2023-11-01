package cat.jstat_c;

import java.util.List;

public class Jstat_C_Service {

	private Jstat_C_DAO jstat_c_dao;
	
	public Jstat_C_Service(Jstat_C_DAO jstat_c_dao) {
		this.jstat_c_dao = jstat_c_dao;
	}
	
	public List<Jstat_C_DTO> selectList(){
		return jstat_c_dao.selectList();
	}
}
	
