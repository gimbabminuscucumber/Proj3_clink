package cat.actstat_c;

import org.apache.ibatis.session.SqlSession;

public class ActStat_C_DAO {
	private SqlSession sqlsession;
	
	public ActStat_C_DAO(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}
}
