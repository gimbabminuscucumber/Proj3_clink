package tech.tech_test;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Tech_Test_DAO {
	private SqlSession sqlsession;
	
	public Tech_Test_DAO(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}
	
	public List<Map<String,Object>> getList(){
		return sqlsession.selectList("Tech_Test.getList");
	}
}
