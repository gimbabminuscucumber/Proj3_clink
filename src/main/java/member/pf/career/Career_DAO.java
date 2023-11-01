package member.pf.career;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Career_DAO {

	private SqlSession sqlSession;
	
	public Career_DAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public int insert(Career_DTO dto) {
		return sqlSession.insert("career.insert", dto);
	}
	
	public int update(Career_DTO dto) {
		return sqlSession.update("career.update", dto);
	}
	
	public int delete(String no) {
		return sqlSession.delete("career.delete", no);
	}
	
	public List<Career_DTO> selectList(Map<String, Object> map){
		return sqlSession.selectList("career.selectList",map);
	}
	
	public Map<String, Object> selectOne(String no){
		return sqlSession.selectOne("career.selectOne", no);
	}
	
	public List<Map<String, Object>> careerList(){
		return sqlSession.selectList("career.careerList");
	}
	
}
