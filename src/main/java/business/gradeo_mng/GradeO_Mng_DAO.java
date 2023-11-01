package business.gradeo_mng;

import org.apache.ibatis.session.SqlSession;

public class GradeO_Mng_DAO {
	private SqlSession sqlsession;
	
	public GradeO_Mng_DAO(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}
	
	public int insert(GradeO_Mng_DTO dto) {
		return sqlsession.insert("GradeO_Mng.insert",dto);
	}
}
