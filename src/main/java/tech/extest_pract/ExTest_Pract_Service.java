package tech.extest_pract;

import java.util.List;

public class ExTest_Pract_Service {
	private ExTest_Pract_DAO extest_pract_dao;
	
	public ExTest_Pract_Service(ExTest_Pract_DAO extest_pract_dao) {
		this.extest_pract_dao = extest_pract_dao;
	}
	
	public List<ExTest_Pract_DTO> getList(int key){
		return extest_pract_dao.getList(key);
	}
	
}
