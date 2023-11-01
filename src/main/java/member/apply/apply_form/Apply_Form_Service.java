package member.apply.apply_form;

import java.util.List;
import java.util.Map;

public class Apply_Form_Service {

	private Apply_Form_DAO apply_form_dao;
	
	public Apply_Form_Service(Apply_Form_DAO apply_form_dao) {
		this.apply_form_dao = apply_form_dao;
	}
	
	public List<Apply_Form_DTO> selectList(){
		return apply_form_dao.selectList();
	}
	
	public int insert(Apply_Form_DTO dto) {
		return apply_form_dao.insert(dto);
	}
	
	public int update(Apply_Form_DTO dto) {
		return apply_form_dao.update(dto);
	}
	
	public int hidden(String no) {
		return apply_form_dao.hidden(no);
	}
	
	public Map<String, Object> getContent(String no){
		
		Map<String, Object> map = apply_form_dao.getContent(no);
		
		return map;
		
	}
	
}
