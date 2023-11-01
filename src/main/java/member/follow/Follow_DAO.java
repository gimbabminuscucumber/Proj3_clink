package member.follow;

import org.apache.ibatis.session.SqlSession;

public class Follow_DAO {
	private SqlSession sqlsession;
	
	public Follow_DAO(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}
}
