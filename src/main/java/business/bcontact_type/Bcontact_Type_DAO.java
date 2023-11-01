package business.bcontact_type;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class Bcontact_Type_DAO {
	private SqlSession sqlsession;
	
	public Bcontact_Type_DAO(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}
	
	public List<Bcontact_Type_DTO> getTypeList(){
		return sqlsession.selectList("Bcontact_Type.getTypeList");
	}
	
}
