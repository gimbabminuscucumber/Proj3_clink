package business.createo_mng;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class CreateO_Mng_DAO {
	
	private SqlSession sqlsession;
	
	public CreateO_Mng_DAO(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}
	
	public int createOpUser(CreateO_Mng_DTO dto) {
		return sqlsession.insert("CreateO_Mng.insertUser",dto);
	}
	
	public CreateO_Mng_DTO getUserData(String id) {
		return sqlsession.selectOne("CreateO_Mng.getUserData",id);
	}
	
	public List<Map<String,Object>> getAllList(Map<String,Object> id){
		return sqlsession.selectList("CreateO_Mng.getAllList",id);
	}
	
	public int oneDelete(String id) {
		int a = sqlsession.delete("CreateO_Mng.oneDelete",id);
		return a;
	}
}
