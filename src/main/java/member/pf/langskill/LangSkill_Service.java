package member.pf.langskill;

import java.util.List;
import java.util.Map;


public class LangSkill_Service {

	private LangSkill_DAO langSkill_dao;
	
	public LangSkill_Service(LangSkill_DAO langSkill_dao) {
		this.langSkill_dao = langSkill_dao;
	}
	
	public int insert(LangSkill_DTO dto) {
		return langSkill_dao.insert(dto);
	}
	
	public int update(LangSkill_DTO dto) {
		return langSkill_dao.update(dto);
	}
	
	public int delete(String no) {
		return langSkill_dao.delete(no);
	}
	
	public List<LangSkill_DTO> selectList(Map<String, Object> map){
		return langSkill_dao.selectList(map);
	}
	
	public Map<String, Object> selectOne(String no){
		return langSkill_dao.selectOne(no);
	}
	
	public List<Map<String, Object>> langskillList(){
		return langSkill_dao.langskillList();
	}
	
}
