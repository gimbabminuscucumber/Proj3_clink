package business.bcontact;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Bcontact_DAO {
	private SqlSession sqlsession;
	
	public Bcontact_DAO(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}
	
	public List<Map<String,Object>> getOneBcontact(String id){
		return sqlsession.selectList("Bcontact.getOneBcontact", id);
	}
	
	public int insert(Bcontact_DTO dto) {
		return sqlsession.insert("Bcontact.insert",dto);
	}
	
	public int deleteContact(int no) {
		return sqlsession.delete("Bcontact.deleteContact",no);
	}
	
	public int updateAll(Bcontact_DTO dto) {
		return sqlsession.update("Bcontact.update", dto);
	}
	
}
