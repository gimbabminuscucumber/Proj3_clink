package member.pf.edu;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Edu_DAO {
	
	private SqlSession sqlSession;
	
	public Edu_DAO(SqlSession sqlSession) {
		this.sqlSession	= sqlSession;
	}
	
	public int insert(Edu_DTO dto) {
		return sqlSession.insert("edu.insert", dto);
	}
	
	public int update(Edu_DTO dto) {
		return sqlSession.update("edu.update", dto);
	}
	
	public int delete(String no) {
		return sqlSession.delete("edu.delete", no);
	}
	
	public List<Edu_DTO> selectList(Map<String, Object>map){
		return sqlSession.selectList("edu.selectList", map);
	}
	
	public Map<String, Object> selectOne(String no){
		return sqlSession.selectOne("edu.selectOne", no);
	}
	
	public List<Map<String, Object>> eduList(){
		return sqlSession.selectList("edu.eduList");
	}
	
}
