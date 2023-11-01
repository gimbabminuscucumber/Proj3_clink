package cat.jstat_c;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class Jstat_C_DAO {

	private SqlSession sqlSession;
	
	public Jstat_C_DAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public int insert(Jstat_C_DTO vo) {
		return sqlSession.insert("jstat_c.insert", vo);
	}
	
	public int update(Jstat_C_DTO vo) {
		return sqlSession.update("jstat_c.update", vo);
	}
	
	public int delete(String no) {
		return sqlSession.delete("jstat_c.delete", no);
	}
	
	public List<Jstat_C_DTO> selectList(){
		return sqlSession.selectList("jstat_c");
	}
	
}
