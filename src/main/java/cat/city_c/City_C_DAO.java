package cat.city_c;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class City_C_DAO {

	private SqlSession sqlSession;
	
	public City_C_DAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public List<City_C_DTO> selectList(){
		return sqlSession.selectList("city_c.selectList");
	}
	
	public Map<String, Object> selectOne(Map<String, Object> map){
		return sqlSession.selectOne("city_c.selectOne", map);
	}
}
