package member.member;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Member_DAO {
	private SqlSession sqlsession;
	
	public Member_DAO(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}
	
	public Member_DTO imsi() {
		return sqlsession.selectOne("Member.imsi");
	}
	
	public Member_DTO getdata(Member_DTO dto) {
		return sqlsession.selectOne("Member.getdata",dto);
	}
	
	public int updateMember(String member_id) {
		return sqlsession.update("Member.updateMentor",member_id);
	}
	
	public List<Map<String,Object>> getList(Map<String,Object> map){
		return sqlsession.selectList("Member.getList",map);
	}
	
	public int checkLogin(Member_DTO dto) {
		
		int no = 0;
		
		try {
			no = sqlsession.selectOne("member.checkLogin", dto);
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		return no;
	}
	
	public String findId(Member_DTO dto) {
		return sqlsession.selectOne("member.findId",dto);
	}
	
	public String findPw(Member_DTO dto) {
		return sqlsession.selectOne("member.findPw",dto);
	}
	
	public int insert(Member_DTO dto) {
		return sqlsession.insert("member.insert",dto);
	}
	
	public Member_DTO selectOne(int no) {
		return sqlsession.selectOne("member.selectOne", no);
	}
	
	public int update(Member_DTO dto) {
		return sqlsession.update("member.update",dto);
	}
	
	public int delete(int no) {
		return sqlsession.delete("member.delete",no);
	}
	
	public String checkId(String id) {
		return sqlsession.selectOne("member.checkId",id);
	}
	
	public String seleceUserId(int no) {
		return sqlsession.selectOne("member.checkId",no);
	}
	
//	public int insert(Member_DTO dto) {
//		return sqlSession.insert("user.insert", dto);
//	}
	
	public String getSalt(String email) {
		return sqlsession.selectOne("user.getSalt", email);
	}
	
	public Map<String, Object> login(Member_DTO userVO) {
		return sqlsession.selectOne("user.login", userVO);
	}
	
	public int nextSeq() {
		return sqlsession.selectOne("user.nextSeq");
	}
	
	public Member_DTO getUser(String email) {
		return sqlsession.selectOne("user.getUser", email);
	}
	
}
