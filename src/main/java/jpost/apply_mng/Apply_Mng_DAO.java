package jpost.apply_mng;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Apply_Mng_DAO {

	private SqlSession sqlSession;
	
	public Apply_Mng_DAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public List<Apply_Mng_DTO> selectList(Map<String, Object> map){
		return sqlSession.selectList("apply_mng.selectList", map);
	}
	
	public Map<String, Object> apply_usr(String no){
		return sqlSession.selectOne("apply_mng.apply_usr", no);
	}
	
	public List<Map<String, Object>> apply_all(){
		return sqlSession.selectList("apply_mng.apply_all");
	}
	
	public int apply_no() {
		return sqlSession.selectOne("apply_mng.apply_no");
	}

	// CRUD
	public int insert(Apply_Mng_DTO dto) {
		return sqlSession.insert("apply_mng.insert", dto);
	}

	
	
}
