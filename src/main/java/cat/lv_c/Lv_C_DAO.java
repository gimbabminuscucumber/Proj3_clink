package cat.lv_c;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class Lv_C_DAO {

	private SqlSession sqlSession;
	
	public Lv_C_DAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public List<Lv_C_DTO> selectList(){
		return sqlSession.selectList("lv_c.selectList");
	}
	
	public int insert(Lv_C_DTO vo) {
		return sqlSession.insert("lv_c.insert", vo);
	}
	
	public int update(Lv_C_DTO vo) {
		return sqlSession.update("lv_c.update", vo);
	}
	
	public int delete(int lv_cno) {
		return sqlSession.delete("lv_c.delete", lv_cno);
	}
	
	
}
