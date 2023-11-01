package business.bpf_sns;

import java.util.List;
import java.util.Map;

public class Bpf_SNS_Service {
	
	private Bpf_SNS_DAO bpf_sns_dao;
	
	public Bpf_SNS_Service(Bpf_SNS_DAO bpf_sns_dao) {
		this.bpf_sns_dao = bpf_sns_dao;
	}
	
	public List<Map<String,Object>> getSNSList(String id){
		return bpf_sns_dao.getSNSList(id);
	}
	
	
	public int insert(Bpf_SNS_DTO dto) {
		return bpf_sns_dao.insert(dto);
	}
	
	
	public int delete(int no) {
		return bpf_sns_dao.delete(no);
	}
	
	public int update(Bpf_SNS_DTO dto) {
		return bpf_sns_dao.update(dto);
	}
	
}
