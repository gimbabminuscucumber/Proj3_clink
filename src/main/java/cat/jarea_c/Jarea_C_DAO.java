package cat.jarea_c;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class Jarea_C_DAO {

	private SqlSession sqlSession;
	
	public Jarea_C_DAO(SqlSession sqlSession) {
		this.sqlSession	 = sqlSession;
	}
	
	public List<Jarea_C_DTO> selectList(){
		return sqlSession.selectList("jarea_c.selectList");
	}
	
	public int insert(Jarea_C_DTO vo) {
		return sqlSession.insert("jarea_c.insert", vo);
	}
	
	public int update(Jarea_C_DTO vo) {
		return sqlSession.update("jarea_c.updqte", vo);
	}
	
	public int hidden(String no) {
		return sqlSession.update("jarea_c.hidden", no);
	}
	
}
