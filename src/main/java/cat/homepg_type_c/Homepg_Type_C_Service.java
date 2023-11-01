package cat.homepg_type_c;

import java.util.List;

public class Homepg_Type_C_Service {
	private Homepg_Type_C_DAO homepg_type_c_dao;
	
	public Homepg_Type_C_Service(Homepg_Type_C_DAO homepg_type_c_dao) {
		this.homepg_type_c_dao = homepg_type_c_dao;
	}
	
	public List<Homepg_Type_C_DTO> getList(){
		return homepg_type_c_dao.getList();
	}
}
