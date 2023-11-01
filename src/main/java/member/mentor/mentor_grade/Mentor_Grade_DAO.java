package member.mentor.mentor_grade;

import org.apache.ibatis.session.SqlSession;

public class Mentor_Grade_DAO {
	private SqlSession sqlsession;
	
	public Mentor_Grade_DAO(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}
	
	public int createGrade(String member_id) {
		return sqlsession.insert("Mentor_Grade.createGrade",member_id);
	}
	
	public Mentor_Grade_DTO getMenteeGrade(String member_id) {
		return sqlsession.selectOne("Mentor_Grade.getMenteeGrade",member_id);
	}
	
	public int update(Mentor_Grade_DTO dto) {
		return sqlsession.update("Mentor_Grade.update",dto);
	}
}
