package jpost.jpost_detail;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Jpost_Detail_DAO {
	
	private SqlSession sqlSession;
	
	public Jpost_Detail_DAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public List<Jpost_Detail_DTO> selectList(Map<String, Object> map){
		return sqlSession.selectList("jpost_detail.selectList", map);
	}
	
	public Map<String, Object> selectOne(String no) {
		return sqlSession.selectOne("jpost_detail.selectOne", no);
	}
	
	public int insert(Jpost_Detail_DTO dto) {
		return sqlSession.insert("jpost_detail.insert", dto);
	}
	
	public int update(Jpost_Detail_DTO dto) {
		return sqlSession.update("jpost_detail.update", dto);
	}
	
	public int hidden(String no) {
		return sqlSession.update("jpost_detail.hidden", no);
	}
	
	public int getDetail_no() {
		return sqlSession.selectOne("jpost_detail.getDetail_no");
	}
	
	
}

