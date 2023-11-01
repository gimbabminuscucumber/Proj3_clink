package member.pf.proj;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Proj_DAO {

	private SqlSession sqlSession;
	
	public Proj_DAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public int insert(Proj_DTO dto) {
		return sqlSession.insert("proj.insert", dto);
	}
	
	public int update(Proj_DTO dto) {
		return sqlSession.update("proj.update", dto);
	}
	
	public int delete(String no) {
		return sqlSession.delete("proj.delete", no);
	}
	
	public List<Proj_DTO> selectList(Map<String, Object> map){
		return sqlSession.selectList("proj.selectList", map);
	}
	
	public Map<String, Object> selectOne(String no){
		return sqlSession.selectOne("proj.selectOne", no);
	}
	
	public List<Map<String, Object>> projList(){
		return sqlSession.selectList("proj.projList");
	}
	
}
