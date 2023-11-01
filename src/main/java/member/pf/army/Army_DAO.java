package member.pf.army;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Army_DAO {

	private SqlSession sqlSession;
	
	public Army_DAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public int insert(Army_DTO dto) {
		return sqlSession.insert("army.insert", dto);
	}
	
	public int update(Army_DTO dto) {
		return sqlSession.update("army.update", dto);
	}
	
	public int delete(String no) {
		return sqlSession.delete("army.delete", no);
	}

	public List<Army_DTO> selectList(){
		return sqlSession.selectList("army.selectList");
	}
	
	public Map<String, Object> selectOne(String no){
		return sqlSession.selectOne("army.selectOne", no);
	}

	public List<Map<String, Object>> armyList(){
		return sqlSession.selectList("army.armyList");
	}
}
