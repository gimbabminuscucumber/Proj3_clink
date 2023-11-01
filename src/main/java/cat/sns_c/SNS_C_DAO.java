package cat.sns_c;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class SNS_C_DAO {
	
	private SqlSession sqlsession;
	
	public SNS_C_DAO(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}
	
	public List<SNS_C_DTO> getList(){
		return sqlsession.selectList("SNS_C.getList");
	}
}
