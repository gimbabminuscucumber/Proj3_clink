package member.pf.jstat;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Jstat_DAO {

	private SqlSession sqlSession;
	
	public Jstat_DAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public int insert(Jstat_DTO dto) {
		return sqlSession.insert("jstat.insert", dto);
	}
	
	public int update(Jstat_DTO dto) {
		return sqlSession.update("jstat.insert", dto);
	}

	public int delete(String no) {
		return sqlSession.delete("jstat.delete", no);
	}
	
	public List<Jstat_DTO> selectList(Map<String, Object> map){
		return sqlSession.selectList("jstat.selectList", map);
	}
	
	public Map<String, Object> selectOne(String no){
		return sqlSession.selectOne("jstat.selectOne", no);
	}
	
	public List<Map<String, Object>> jstatList(){
		return sqlSession.selectList("jstat.jstatList"); 
	}
	
}
