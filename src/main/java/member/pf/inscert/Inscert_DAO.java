package member.pf.inscert;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Inscert_DAO {

	private SqlSession sqlSession;
	
	public Inscert_DAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public int insert(Inscert_DTO dto) {
		return sqlSession.insert("inscert.insert", dto);
	}

	public int update(Inscert_DTO dto) {
		return sqlSession.update("inscert.update", dto);
	}
	
	public int delete(String no) {
		return sqlSession.delete("inscert.delete", no);
	}
	
	public List<Inscert_DTO> selectList(Map<String, Object> map){
		return sqlSession.selectList("inscert.selectList", map);
	}
	
	public Map<String, Object> selectOne(String no){
		return sqlSession.selectOne("inscert.selectOne", no);
	}
	
	public List<Map<String, Object>> inscertList(){
		return sqlSession.selectList("inscert.inscertList");
	}
	
}
	
	
