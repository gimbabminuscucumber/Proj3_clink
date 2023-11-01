package tech.tech_test;

import java.util.List;
import java.util.Map;

public class Tech_Test_Service {
	private Tech_Test_DAO tech_test_dao;
	
	public Tech_Test_Service(Tech_Test_DAO tech_test_dao) {
		this.tech_test_dao = tech_test_dao;
	}
	
	public List<Map<String,Object>> getList (){
		return tech_test_dao.getList();
	}
}
