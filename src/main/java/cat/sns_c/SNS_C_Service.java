package cat.sns_c;

import java.util.List;

public class SNS_C_Service {
	private SNS_C_DAO sns_c_dao;
	
	public SNS_C_Service(SNS_C_DAO sns_c_dao) {
		this.sns_c_dao = sns_c_dao;
	}
	
	public List<SNS_C_DTO> getList(){
		return sns_c_dao.getList();
	}
	
}
