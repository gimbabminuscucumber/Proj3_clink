package tech.tech_test_qna;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class Tech_Test_QnA_DAO {
	private SqlSession sqlsession;
	
	public Tech_Test_QnA_DAO(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}
	
	public List<Tech_Test_QnA_DTO> getList(int no){
		return sqlsession.selectList("Tech_Test_QnA.getList",no);
	}
}
