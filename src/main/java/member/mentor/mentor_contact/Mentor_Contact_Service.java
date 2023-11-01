package member.mentor.mentor_contact;

import java.util.List;
import java.util.Map;

public class Mentor_Contact_Service {
	private Mentor_Contact_DAO mentor_contact_dao;
	
	public Mentor_Contact_Service(Mentor_Contact_DAO mentor_contact_dao) {
		this.mentor_contact_dao = mentor_contact_dao;
	}
	
	public int Mentor_Request(Mentor_Contact_DTO dto) {
		return mentor_contact_dao.Mentor_Request(dto);
	}
	
	public List<Map<String,Object>> selectRequest(String member_id){
		return mentor_contact_dao.selectRequest(member_id);
	}
	
	public int delete(int no) {
		return mentor_contact_dao.delete(no);
	}
	
	public int accept(int no) {
		return mentor_contact_dao.accept(no);
	}
	
	public List<Map<String,Object>> getMyMentors(String member_id){
		return mentor_contact_dao.getMyMentors(member_id);
	}

	public List<Map<String,Object>> getMyMentees(String member_id){
		return mentor_contact_dao.getMyMentees(member_id);
	}
	
	public int disconnect(int no) {
		return mentor_contact_dao.disconnect(no);
	}
}
