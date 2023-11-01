package member.pf.award;

import java.util.List;
import java.util.Map;

public class Award_Service {

	private Award_DAO award_dao;
	
	public Award_Service(Award_DAO award_dao) {
		this.award_dao = award_dao;
	}
	
	public int insert(Award_DTO dto) {
		return award_dao.insert(dto);
	}
	
	public int update(Award_DTO dto) {
		return award_dao.update(dto);
	}
	
	public int delete(String no) {
		return award_dao.delete(no);
	}
	
	public List<Award_DTO> selectList(Map<String, Object> map){
		return award_dao.selectList(map);
	}
	
	public Map<String, Object> selectOne(String no){
		return award_dao.selectOne(no);
	}
	
	public List<Map<String, Object>> awardList(){
		return award_dao.awardList();
	}
}
