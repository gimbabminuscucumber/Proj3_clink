package tech.extest_opt;

import java.util.List;

public class ExTest_Opt_Service {
	private ExTest_Opt_DAO extest_opt_dao;
	
	public ExTest_Opt_Service(ExTest_Opt_DAO extest_opt_dao) {
		this.extest_opt_dao = extest_opt_dao;
	}
	
	public List<ExTest_Opt_DTO> getList(int no){
		return extest_opt_dao.getList(no);
	}
}
