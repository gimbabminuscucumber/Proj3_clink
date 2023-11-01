package member.mentor.mentor_review;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Mentor_Review_DAO {
	private SqlSession sqlsession;
	
	public Mentor_Review_DAO(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}
	
	public List<Map<String,Object>> getMenteeReview(String member_id){
		return sqlsession.selectList("Mentor_Review.getMenteeReview",member_id);
	}
	
	public int writeReview(Mentor_Review_DTO dto) {
		return sqlsession.insert("Mentor_Review.writeReview",dto);
	}
}
