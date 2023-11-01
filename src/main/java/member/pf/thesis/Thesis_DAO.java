package member.pf.thesis;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Thesis_DAO {

	private SqlSession sqlSession;
	
	public Thesis_DAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public int insert(Thesis_DTO dto) {
		return sqlSession.insert("thesis.insert", dto);
	}
	
	public int update(Thesis_DTO dto) {
		return sqlSession.update("thesis.insert", dto);
	}

	public int delete(String no) {
		return sqlSession.delete("thesis.delete", no);
	}
	
	public List<Thesis_DTO> selectList(Map<String, Object> map){
		return sqlSession.selectList("thesis.selectList", map);
	}
	
	public Map<String, Object> selectOne(String no){
		return sqlSession.selectOne("thesis,selectOne", no);
	}
	
	public List<Map<String, Object>> thesisList(){
		return sqlSession.selectList("thesis.thesisList"); 
	}
	
}
