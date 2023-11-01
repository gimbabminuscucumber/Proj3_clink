package tech.tech_test_opt;

import java.util.List;

public class Tech_Test_Opt_Service {
	private Tech_Test_Opt_DAO tech_test_opt_dao;
	
	public Tech_Test_Opt_Service(Tech_Test_Opt_DAO tech_test_opt_dao) {
		this.tech_test_opt_dao = tech_test_opt_dao;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
	}
	
	public List<Tech_Test_Opt_DTO> getList(int no){
		return tech_test_opt_dao.getList(no);
	}
}
