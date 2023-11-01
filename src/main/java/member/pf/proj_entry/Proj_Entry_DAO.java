package member.pf.proj_entry;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Proj_Entry_DAO {

	private SqlSession sqlSession;
	
	public Proj_Entry_DAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public int insert(Proj_Entry_DTO dto) {
		return sqlSession.insert("proj_entry.insert", dto);
	}
	
	public int update(Proj_Entry_DTO dto) {
		return sqlSession.update("proj_entry.update", dto);
	}
	
	public int delete(String no) {
		return sqlSession.delete("proj_entry.delete", no);
	}
	
	public List<Proj_Entry_DTO> selectList(Map<String, Object> map){
		return sqlSession.selectList("proj_entry.selectList", map);
	}
	
	public Map<String, Object> selectOne(String no){
		return sqlSession.selectOne("porj_entry.selectOne", no);
	}
}
