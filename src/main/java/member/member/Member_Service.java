package member.member;

import java.util.List;
import java.util.Map;

public class Member_Service {
	private Member_DAO member_dao;
	
	public Member_Service(Member_DAO member_dao) {
		this.member_dao = member_dao;
	}
	
	public Member_DTO imsi() {
		return member_dao.imsi();
	}
	
	public Member_DTO getdata(Member_DTO dto) {
		return member_dao.getdata(dto);
	}
	
	public Member_DTO selectOne(int no) {
		return member_dao.selectOne(no);
	}

	public int updateMember(String member_id) {
		return member_dao.updateMember(member_id);
	}
	
	public List<Map<String,Object>> getList(Map<String,Object> map){
		return member_dao.getList(map);
	}
	
	public int insert(Member_DTO dto) {
		return member_dao.insert(dto);
	}
	
	public int update(Member_DTO dto) {
		return member_dao.update(dto);
	}
	
	public int delete(int no) {
		return member_dao.delete(no);
	}
	
	public boolean checkId(String id) {
		return member_dao.checkId(id) != null;
	}
	
	public String seleceUserId(int no) {
		return member_dao.seleceUserId(no);
	}
	
	
}
