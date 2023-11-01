package business.posi_mng;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class Posi_Mng_DAO {
	private SqlSession sqlsession;
	
	public Posi_Mng_DAO(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}
	
	public List<Posi_Mng_DTO> getNoList(int no){
		return sqlsession.selectList("Posi_Mng.getNoList",no);
	}
	
	public int insert(Posi_Mng_DTO dto) {
		return sqlsession.insert("Posi_Mng.insert", dto);
	}
	
	public int update(Posi_Mng_DTO dto) {
		return sqlsession.update("Posi_Mng.update",dto);
	}
	
	public int deleteDp(int no) {
		return sqlsession.delete("Posi_Mng.deleteDp",no);
	}
	
	public int delete(int no) {
		return sqlsession.delete("Posi_Mng.delete",no);
	}
}
