package member.apply.apply_list;

import java.util.List;
import java.util.Map;

public class Apply_List_Service {

	private Apply_List_DAO apply_list_dao;
	
	public Apply_List_Service(Apply_List_DAO apply_list_dao) {
		this.apply_list_dao = apply_list_dao;
	}
	
	
	public List<Apply_List_DTO> selectList(Map<String, Object> map){
		
		List<Apply_List_DTO> list = apply_list_dao.selectList(map);

		if(list.isEmpty()) {
			list = null;
		}
		
		return list;
	}
	
	public Map<String, Object> selectOne(String no){
		
		return apply_list_dao.selectOne(no);
		
	}
	
	public int insert(Apply_List_DTO dto) {
		return apply_list_dao.insert(dto);
	}
	
	public int update(Apply_List_DTO dto) {
		return apply_list_dao.update(dto);
	}
	
	public int hidden(String no) {
		return apply_list_dao.hidden(no);
	}
	
	
	
}
