package tech.extest_pract;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class ExTest_Pract_DAO {
	private SqlSession sqlsession;
	
	public ExTest_Pract_DAO(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}
	
	public List<ExTest_Pract_DTO> getList(int key){
		return sqlsession.selectList("ExTest_Pract.getList",key);
	}
}
