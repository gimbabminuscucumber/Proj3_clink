package member.pf.rest_rsn;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Rest_Rsn_DAO {

	private SqlSession sqlSession;
	
	public Rest_Rsn_DAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public int insert(Rest_Rsn_DTO dto) {
		return sqlSession.insert("rest_rsn.insert", dto);
	}
	
	public int update(Rest_Rsn_DTO dto) {
		return sqlSession.update("rest_rsn.update", dto);
	}
	
	public int delete(String no) {
		return sqlSession.delete("rest_rsn.delete", no);
	}
	
	public List<Rest_Rsn_DTO> selectList(){
		return sqlSession.selectList("rest_rsn.selectList");
	}
	
	public Map<String, Object> selectOne(String no){
		return sqlSession.selectOne("rest_rsn.selectOne", no);
	}
	
}
