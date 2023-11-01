package member.apply.apply_stat;

public class Apply_Stat_Service {

	private Apply_Stat_DAO apply_stat_dao;
	
	public Apply_Stat_Service(Apply_Stat_DAO apply_stat_dao) {
		this.apply_stat_dao = apply_stat_dao;
	}
	
	public int insert(Apply_Stat_DTO dto) {
		return apply_stat_dao.insert(dto);
	}
	
	public int update(Apply_Stat_DTO dto) {
		return apply_stat_dao.update(dto);
	}
	
	public int hidden(String no) {
		return apply_stat_dao.hidden(no);
	}
	
}
