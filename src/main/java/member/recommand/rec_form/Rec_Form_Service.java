package member.recommand.rec_form;

import java.util.List;
import java.util.Map;

public class Rec_Form_Service {

	private Rec_Form_DAO rec_form_dao;
	
	public Rec_Form_Service(Rec_Form_DAO rec_form_dao) {
		this.rec_form_dao = rec_form_dao;
	}
	
	public int insert(Rec_Form_DTO dto) {
		return rec_form_dao.insert(dto);
	}
	
	public int update(Rec_Form_DTO dto) {
		return rec_form_dao.update(dto);
	}
	
	public int delete(String no) {
		return rec_form_dao.delete(no);
	}
	
	public List<Rec_Form_DTO> selectList(String no){
		return rec_form_dao.selectList(no);
	}
	
	public Map<String, Object> selectOne(String no){
		return rec_form_dao.selectOne(no);
	}
	
	public Map<String, Object> content(String no){
		return rec_form_dao.content(no);
	}
	
	public List<Map<String, Object>> rec_formList(){
		return rec_form_dao.rec_formList();
	}
	
	public List<Map<String, Object>> rec_all(String no){
		return rec_form_dao.rec_all(no);
	}
	
}
