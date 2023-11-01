package business.bpf_url;

import java.util.List;
import java.util.Map;

public class Bpf_Url_Service {
	
	private Bpf_Url_DAO bpf_url_dao;
	
	public Bpf_Url_Service(Bpf_Url_DAO bpf_url_dao) {
		this.bpf_url_dao = bpf_url_dao;
	}
	
	public List<Map<String,Object>> getUrlList(String id){
		return bpf_url_dao.getUrlList(id);
	}
	
	public int insertUrl(Bpf_Url_DTO dto) {
		return bpf_url_dao.insertUrl(dto);
	}
	
	public int update(Bpf_Url_DTO dto) {
		return bpf_url_dao.update(dto);
	}
	
	public int deleteOne(int no) {
		return bpf_url_dao.deleteOne(no);
	}
	
}
