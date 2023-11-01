package member.pf.rest;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Rest_DAO {

	private SqlSession sqlSession;
	
	public Rest_DAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public int insert(Rest_DTO dto) {
		return sqlSession.insert("rest.insert", dto);
	}
	
	public int update(Rest_DTO dto) {
		return sqlSession.update("rest.update", dto);
	}
	
	public int delete(String no) {
		return sqlSession.delete("rest.delete", no);
	}
		
	public List<Rest_DTO> selectList(Map<String, Object> map){
		return sqlSession.selectList("rest.selectList", map);
	}
		
	public Map<String, Object> selectOne(String no){
		return sqlSession.selectOne("rest.selectOne", no);
	}
	
	public List<Map<String, Object>> restList(){
		return sqlSession.selectList("rest.restList");
	}
}
