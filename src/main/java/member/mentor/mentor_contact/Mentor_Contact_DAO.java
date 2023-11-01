package member.mentor.mentor_contact;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Mentor_Contact_DAO {
	private SqlSession sqlsession;
	
	public Mentor_Contact_DAO(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}
	
	public int Mentor_Request(Mentor_Contact_DTO dto) {
		return sqlsession.insert("Mentor_Contact.Mentor_Request",dto);
	}
	
	public List<Map<String,Object>> selectRequest(String member_id){
		return sqlsession.selectList("Mentor_Contact.selectRequest",member_id);
	}
	
	public int delete(int no) {
		return sqlsession.delete("Mentor_Contact.delete",no);
	}
	
	public int accept(int no) {
		return sqlsession.update("Mentor_Contact.accept",no);
	}
	
	public List<Map<String,Object>> getMyMentors(String member_id){
		return sqlsession.selectList("Mentor_Contact.getMyMentors",member_id);
	}

	public List<Map<String,Object>> getMyMentees(String member_id){
		return sqlsession.selectList("Mentor_Contact.getMyMentees",member_id);
	}
	
	public int disconnect(int cn) {
		return sqlsession.update("Mentor_Contact.disconnect",cn);
	}
	
}
