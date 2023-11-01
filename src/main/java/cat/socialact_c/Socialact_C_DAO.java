package cat.socialact_c;

import java.util.List;
import org.apache.ibatis.session.SqlSession;

public class Socialact_C_DAO {

	private SqlSession sqlSession;
	
	public Socialact_C_DAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public int insert(Socialact_C_DTO vo) {
		return sqlSession.insert("socialact_c.insert", vo);
	}
	
	public int update(Socialact_C_DTO vo) {
		return sqlSession.update("socialact_c.update", vo);
	}
	
	public int delete(String no) {
		return sqlSession.delete("social_c.delete", no);
	}
	
	public List<Socialact_C_DTO> selectList(){
		return sqlSession.selectList("socialact_c.selectList");
	}
	
}
