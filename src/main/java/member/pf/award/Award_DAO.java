package member.pf.award;

import java.util.Map;
import java.util.List;

import org.apache.ibatis.session.SqlSession;


public class Award_DAO {

	private SqlSession sqlSession;

	public Award_DAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public int insert(Award_DTO dto) {
		return sqlSession.insert("award.insert", dto);
	}
	
	public int update(Award_DTO dto) {
		return sqlSession.update("award.update", dto);
	}
	
	public int delete(String no) {
		return sqlSession.delete("awawrd.delete", no);
	}
	
	public List<Award_DTO> selectList(Map<String, Object> map){
		return sqlSession.selectList("award.selectList", map);
	}
	
	public Map<String, Object> selectOne(String no){
		return sqlSession.selectOne("award.selectOne", no);
	}
	
	public List<Map<String, Object>> awardList(){
		return sqlSession.selectList("award.awardList");
	}
	
}
