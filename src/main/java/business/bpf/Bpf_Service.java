package business.bpf;

import java.util.HashMap;
import java.util.Map;

public class Bpf_Service {
	private Bpf_DAO bpf_dao;
	
	public Bpf_Service(Bpf_DAO bpf_dao) {
		this.bpf_dao = bpf_dao;
	}
	
	public Bpf_DTO getOneProfile(String bmemberid) {
		return bpf_dao.getOneProfile(bmemberid);
	}
	
	public int insertProfile(Bpf_DTO dto) {
		return bpf_dao.insertProfile(dto);
	}
	
	public int updateProfile(Bpf_DTO dto) {
		return bpf_dao.updateProfile(dto);
	}
	
	public int updateLogo(String name,String id) {
		Map<String,Object> map = new HashMap<>();
		map.put("logo", name);
		map.put("id",id);
		return bpf_dao.updateLogo(map);
	}
}
