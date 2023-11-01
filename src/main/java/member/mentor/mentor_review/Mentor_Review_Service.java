package member.mentor.mentor_review;

import java.util.List;
import java.util.Map;

public class Mentor_Review_Service {
	private Mentor_Review_DAO mentor_review_dao;
	
	public Mentor_Review_Service(Mentor_Review_DAO mentor_review_dao) {
		this.mentor_review_dao = mentor_review_dao;
	}
	
	public List<Map<String,Object>> getMenteeReview(String member_id){
		return mentor_review_dao.getMenteeReview(member_id);
	}
	
	public int writeReview(Mentor_Review_DTO dto) {
		return mentor_review_dao.writeReview(dto);
	}
}
