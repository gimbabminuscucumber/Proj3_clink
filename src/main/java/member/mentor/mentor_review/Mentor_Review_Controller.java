package member.mentor.mentor_review;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import member.mentor.mentor_grade.Mentor_Grade_DTO;
import member.mentor.mentor_grade.Mentor_Grade_Service;
import path.Encry;
import path.ProjectPath;

@Controller
public class Mentor_Review_Controller implements ProjectPath{
	private Mentor_Review_Service mentor_review_service;
	private Mentor_Grade_Service mentor_grade_service;
	
	public Mentor_Review_Controller(Mentor_Review_Service mentor_review_service,
			Mentor_Grade_Service mentor_grade_service) {
		this.mentor_review_service = mentor_review_service;
		this.mentor_grade_service = mentor_grade_service;
	}
	
	
	@RequestMapping("MrivewForm")
	public String ReviewForm(HttpServletRequest req) {
		String member_id = Encry.getUsrId(req.getSession());
		List<Map<String,Object>> mentee = mentor_review_service.getMenteeReview(member_id);
		
		req.setAttribute("menteeReview", mentee);
		return MENTOR+"MreviewForm.jsp";
	}
	
	@RequestMapping("writeReview")
	public String writeReview(Mentor_Review_DTO mrdto,String member_id,HttpServletRequest req) {
		String youmember_id = Encry.getUsrId(req.getSession());
		mrdto.setMember_id(youmember_id);
		int su = mentor_review_service.writeReview(mrdto);

		Mentor_Grade_DTO mgdto = mentor_grade_service.getMenteeGrade(member_id);
		if(mrdto.getScore() != 0 && mgdto != null) {
			mgdto.setScore(mgdto.getScore()+mrdto.getScore());
			mentor_grade_service.update(mgdto);
		}
		
		req.setAttribute("str", su != 0 ? "작성완료" : "작성실패");
		req.setAttribute("url","MrivewForm");
		return PUBLIC+"alim.jsp";
	}
}
