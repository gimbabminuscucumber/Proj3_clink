package member.mentor.mentor_apply;

import java.util.List;
import java.util.Map;

public class Mentor_Apply_Service {
	private Mentor_Apply_DAO mentor_apply_dao;
	
	public Mentor_Apply_Service(Mentor_Apply_DAO mentor_apply_dao) {
		this.mentor_apply_dao = mentor_apply_dao;
	}
	
	
	public int insert(Mentor_Apply_DTO dto) {
		return mentor_apply_dao.insert(dto);
	}
	
	public List<Map<String,Object>> getMentorList(String member_id){
		return mentor_apply_dao.getMentorList(member_id);
	}
}
