package business.bcontact_type;

import java.util.List;

public class Bcontact_Type_Service {
	
	private Bcontact_Type_DAO bcontact_type_dao;
	
	public Bcontact_Type_Service(Bcontact_Type_DAO bcontact_type_dao) {
		this.bcontact_type_dao = bcontact_type_dao;
	}
	
	public List<Bcontact_Type_DTO> getTypeList(){
		return bcontact_type_dao.getTypeList();
	}
	
}
