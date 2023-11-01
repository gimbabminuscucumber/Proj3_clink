package member.apply.apply;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Apply_DAO {
	
	private SqlSession sqlSession;
	
	public Apply_DAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public Apply_DAO() {
		super();
	}
	
	public List<Apply_DTO> selectList(){
		return sqlSession.selectList("apply.selectList");
	}
	
	public Map<String, Object> selectOne(String no){
		return sqlSession.selectOne("apply.selectOne", no);
	}
	
	public List<Map<String, Object>> getContent(String no){
		return sqlSession.selectOne("apply.getContent", no);
	}
	
	// apply / apply_form 칼럼들 사용
	public List<Map<String, Object>> applyList(){
		return sqlSession.selectList("apply.applyList");
		
	}
	
	public int insert(Apply_DTO dto) {
		return sqlSession.insert("apply.insert", dto);
	}
	
	public int update(Apply_DTO dto) {
		return sqlSession.update("apply.update", dto);
	}
	
	public int hidden(String no) {
		return sqlSession.update("apply.hidden", no);
	}
	
	
}
