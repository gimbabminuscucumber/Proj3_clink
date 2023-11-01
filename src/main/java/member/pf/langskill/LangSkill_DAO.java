package member.pf.langskill;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class LangSkill_DAO {

	private SqlSession sqlSession;
	
	public LangSkill_DAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public int insert(LangSkill_DTO dto) {
		return sqlSession.insert("langskill.insert", dto);
	}
	
	public int update(LangSkill_DTO dto) {
		return sqlSession.update("langskill.insert", dto);
	}

	public int delete(String no) {
		return sqlSession.delete("langskill.delete", no);
	}
	
	public List<LangSkill_DTO> selectList(Map<String, Object> map){
		return sqlSession.selectList("langskill.selectList", map);
	}
	
	public Map<String, Object> selectOne(String no){
		return sqlSession.selectOne("langskill,selectOne", no);
	}
	
	public List<Map<String, Object>> langskillList(){
		return sqlSession.selectList("langskill.langskillList"); 
	}
	
}
