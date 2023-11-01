package member.mentor.mentor_apply;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Mentor_Apply_DAO {
	private SqlSession sqlsession;
	
	public Mentor_Apply_DAO(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}
	
	public int insert(Mentor_Apply_DTO dto) {
		return sqlsession.insert("Mentor_Apply.insert",dto);
	}
	
	public List<Map<String,Object>> getMentorList(String member_id){
		return sqlsession.selectList("Mentor_Apply.getMentorList",member_id);
	}
}
