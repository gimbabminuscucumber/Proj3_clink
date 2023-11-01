package member.apply.apply_form;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Apply_Form_DAO {

	private SqlSession sqlSession;
	
	public Apply_Form_DAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public List<Apply_Form_DTO> selectList(){
		return sqlSession.selectList("apply_form.selectList");
	}

	public Map<String, Object> selectOne(String no){
		return sqlSession.selectOne("apply_form.selectOne", no);
	}

	// CRUD (회원 본인이 쓴 지원서)
	public int insert(Apply_Form_DTO dto) {
		return sqlSession.insert("apply_form.insert", dto);
	}
	
	public int update(Apply_Form_DTO dto) {
		return sqlSession.update("apply_form.update", dto);
	}
	
	public int hidden(String no) {
		return sqlSession.update("apply_form.hidden", no);
	}
	
	// 회원이 작성한 지원서
	public Map<String, Object> getContent(String no){
		return sqlSession.selectOne("apply.getContent", no);
	}
	
}
