package member.recommand.rec_ask;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Rec_Ask_DAO {

	private SqlSession sqlSession;
	
	public Rec_Ask_DAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public int insert(Rec_Ask_DTO dto) {
		return sqlSession.insert("rec_ask.insert", dto);
	}
	
	public int update(Rec_Ask_DTO dto) {
		return sqlSession.update("rec_ask.update", dto);
	}
	
	public int delete(String no) {
		return sqlSession.update("rec_ask.delete", no);
	}
	
	public List<Rec_Ask_DTO> selectList(Map<String, Object> map){
		return sqlSession.selectList("rec_ask.selectList", map);
	}
	
	public Map<String, Object> selectOne(String no){
		return sqlSession.selectOne("rec_ask.selectOne", no);
	}
	
	public List<Map<String, Object>> rec_askList(){
		return sqlSession.selectList("rec_ask.rec_asklist");
	}

	public Map<String, Object> content(String no) {
		return sqlSession.selectOne("rec_ask.content", no);
	}
	
}
