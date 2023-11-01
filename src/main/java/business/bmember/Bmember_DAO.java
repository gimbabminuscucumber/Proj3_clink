package business.bmember;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Bmember_DAO {
	
	private SqlSession sqlsession;
	
	public Bmember_DAO(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}
	
	public int insertUser(Bmember_DTO dto) {
		return sqlsession.insert("Bmember.insertUser",dto);
	}
	
	public Bmember_DTO  getUserData(String id) {
		return sqlsession.selectOne("Bmember.getUserData", id);
	}
	
	public Bmember_DTO  getUserData2(String id) {
		return sqlsession.selectOne("Bmember.getUserData2", id);
	}
	
	public int updateUser(Bmember_DTO dto) {
		return sqlsession.update("Bmember.updateUser",dto);
	}
	
	public String rgck(String no) {
		return sqlsession.selectOne("Bmember.rgck",no);
	}
	
}
