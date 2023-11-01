package business.bpf;

import java.sql.Date;

public class Bpf_DTO {
	private int no;
	private String bpf_id;
	private String bmember_id;
	private String bm_stat_id;
	private String logo;
	private int hit;
	private Date updated;
	private String content;
	private int empl_cnt;
	private String expert;
	private String hp;
	private Date extb;
	private String detail;
	
	public Bpf_DTO() {}
	
	public Bpf_DTO(String bpf_id, String bmember_id, String logo, int hit, String content,
			int empl_cnt, String expert, String hp, Date extb, String detail) {
		super();
		this.bpf_id = bpf_id;
		this.bmember_id = bmember_id;
		this.logo = logo;
		this.hit = hit;
		this.content = content;
		this.empl_cnt = empl_cnt;
		this.expert = expert;
		this.hp = hp;
		this.extb = extb;
		this.detail = detail;
	}
	
	public Bpf_DTO(int no, String bpf_id, String bmember_id, String logo, int hit, Date updated, String content,
			int empl_cnt, String expert, String hp, Date extb, String detail) {
		super();
		this.no = no;
		this.bpf_id = bpf_id;
		this.bmember_id = bmember_id;
		this.logo = logo;
		this.hit = hit;
		this.updated = updated;
		this.content = content;
		this.empl_cnt = empl_cnt;
		this.expert = expert;
		this.hp = hp;
		this.extb = extb;
		this.detail = detail;
	}

	public String getBm_stat_id() {
		return bm_stat_id;
	}

	public void setBm_stat_id(String bm_stat_id) {
		this.bm_stat_id = bm_stat_id;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getBpf_id() {
		return bpf_id;
	}

	public void setBpf_id(String bpf_id) {
		this.bpf_id = bpf_id;
	}

	public String getBmember_id() {
		return bmember_id;
	}

	public void setBmember_id(String bmember_id) {
		this.bmember_id = bmember_id;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getEmpl_cnt() {
		return empl_cnt;
	}

	public void setEmpl_cnt(int empl_cnt) {
		this.empl_cnt = empl_cnt;
	}

	public String getExpert() {
		return expert;
	}

	public void setExpert(String expert) {
		this.expert = expert;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public Date getExtb() {
		return extb;
	}

	public void setExtb(Date extb) {
		this.extb = extb;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	
	
	
	
}
