package tech.tech_test_qna;

import java.util.List;

public class Tech_Test_QnA_Service {
	private Tech_Test_QnA_DAO tech_test_qna_dao;
	
	public Tech_Test_QnA_Service(Tech_Test_QnA_DAO tech_test_qna_dao) {
		this.tech_test_qna_dao = tech_test_qna_dao;
	}
	
	public List<Tech_Test_QnA_DTO> getList(int no){
		return tech_test_qna_dao.getList(no);
	}
}
