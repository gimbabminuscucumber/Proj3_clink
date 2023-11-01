package business.depart_mng;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class Depart_Mng_DAO {
	private SqlSession sqlsession;
	
	public Depart_Mng_DAO(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}
	
	public List<Depart_Mng_DTO> getList(String id){
		return sqlsession.selectList("Depart_Mng.getList", id);
	}
	
	public int insert(Depart_Mng_DTO dto) {
		return sqlsession.insert("Depart_Mng.insert", dto);
	}
	
	public int update(Depart_Mng_DTO dto) {
		return sqlsession.update("Depart_Mng.update",dto);
	}
	
	public int delete(int no) {
		return sqlsession.delete("Depart_Mng.delete",no);
	}
	
}
