package tech.extest_opt;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class ExTest_Opt_DAO {
	private SqlSession sqlsession;
	
	public ExTest_Opt_DAO(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}
	
	public List<ExTest_Opt_DTO> getList(int no){
		return sqlsession.selectList("ExTest_Opt.getList",no);
	}
}
