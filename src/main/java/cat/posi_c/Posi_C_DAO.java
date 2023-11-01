package cat.posi_c;

import java.util.List;

import org.apache.ibatis.session.SqlSession;


public class Posi_C_DAO {

	private SqlSession sqlSession;
	
	public Posi_C_DAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public List<Posi_C_DTO> selectList(){
		return sqlSession.selectList("posi_c.selectList");
	}
	
	public int insert(Posi_C_DTO vo) {
		return sqlSession.insert("posi_c.insert", vo);
	}
	
	public int update(Posi_C_DTO vo) {
		return sqlSession.update("posi_c.update", vo);
	}
	
	public int delete(int posi_cno) {
		return sqlSession.delete("posi_c.delete", posi_cno);
	}
	
	
}
