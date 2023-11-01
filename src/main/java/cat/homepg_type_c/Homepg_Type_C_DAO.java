package cat.homepg_type_c;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class Homepg_Type_C_DAO {
	private SqlSession sqlsession;
	
	public Homepg_Type_C_DAO(SqlSession sqlsession) {
		System.out.println("dao 실행중");
		this.sqlsession = sqlsession;
	}
	
	public List<Homepg_Type_C_DTO> getList(){
		return sqlsession.selectList("Homepg_Type_C.getList");
	}
}
