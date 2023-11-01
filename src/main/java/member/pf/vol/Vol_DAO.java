package member.pf.vol;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Vol_DAO {

	private SqlSession sqlSession;
	
	public Vol_DAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public int insert(Vol_DTO dto) {
		return sqlSession.insert("vol.insert", dto);
	}
	
	public int update(Vol_DTO dto) {
		return sqlSession.update("vol.insert", dto);
	}

	public int delete(String no) {
		return sqlSession.delete("vol.delete", no);
	}
	
	public List<Vol_DTO> selectList(Map<String, Object> map){
		return sqlSession.selectList("vol.selectList", map);
	}
	
	public Map<String, Object> selectOne(String no){
		return sqlSession.selectOne("vol,selectOne", no);
	}
	
	public List<Map<String, Object>> volList(){
		return sqlSession.selectList("vol.volList"); 
	}
	
}
