package member.apply.apply_stat;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Apply_Stat_DAO {

	private SqlSession sqlSession;
	
	public Apply_Stat_DAO(SqlSession sqlSession) {
		this.sqlSession	= sqlSession;
	}
	
	public int insert(Apply_Stat_DTO dto) {
		return sqlSession.insert("apply_stat.insert", dto);
	}
	
	public int update(Apply_Stat_DTO dto) {
		return sqlSession.update("apply_stat.update", dto);
	}
	
	public int hidden(String no) {
		return sqlSession.update("apply_stat.hidden", no);
	}
	
	public List<Apply_Stat_DTO> selectList(Map<String, Object> map){
		return sqlSession.selectList("apply_stat.selectList", map);
	}
	
	
}
