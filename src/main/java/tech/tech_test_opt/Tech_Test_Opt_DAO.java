package tech.tech_test_opt;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class Tech_Test_Opt_DAO {
	private SqlSession sqlsession;
	
	public Tech_Test_Opt_DAO(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}
	
	public List<Tech_Test_Opt_DTO> getList(int no){
		return sqlsession.selectList("Tech_Test_Opt.getList",no);
	}
}
