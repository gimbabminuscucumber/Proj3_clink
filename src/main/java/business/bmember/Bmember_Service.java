package business.bmember;

public class Bmember_Service {
	
	private Bmember_DAO bmember_dao;
	
	public Bmember_Service(Bmember_DAO bmember_dao) {
		this.bmember_dao = bmember_dao;
	}
	
	public int insertUser(Bmember_DTO dto) {
		return bmember_dao.insertUser(dto);
	}
	
	public Bmember_DTO getUserData(String id) {
		return bmember_dao.getUserData(id);
	}
	
	public Bmember_DTO getUserData2(String id) {
		return bmember_dao.getUserData2(id);
	}
	
	public int updateUser(Bmember_DTO dto) {
		return bmember_dao.updateUser(dto);
	}
	
	public String rgck(String no) {
		return bmember_dao.rgck(no);
	}
	
}
