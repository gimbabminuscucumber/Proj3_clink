package member.recommand.relation;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class Relation_DAO {

	private SqlSession sqlSession;
	
	public Relation_DAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public List<Relation_DTO> selectList(){
		return sqlSession.selectList("relation.selectList");
	}
	
}
