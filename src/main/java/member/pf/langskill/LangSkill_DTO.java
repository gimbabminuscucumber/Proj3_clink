package member.pf.langskill;

public class LangSkill_DTO {
	
	private String lang_skill_no;
	private String pf_no;
	private String member_no;
	private String lang_cno;
	private int lv;
	
	public LangSkill_DTO() {
		super();
	}

	public LangSkill_DTO(String lang_skill_no, String pf_no, String member_no, String lang_cno, int lv) {
		this.lang_skill_no = lang_skill_no;
		this.pf_no = pf_no;
		this.member_no = member_no;
		this.lang_cno = lang_cno;
		this.lv = lv;
	}

	public String getLang_skill_no() {
		return lang_skill_no;
	}

	public void setLang_skill_no(String lang_skill_no) {
		this.lang_skill_no = lang_skill_no;
	}

	public String getPf_no() {
		return pf_no;
	}

	public void setPf_no(String pf_no) {
		this.pf_no = pf_no;
	}

	public String getMember_no() {
		return member_no;
	}

	public void setMember_no(String member_no) {
		this.member_no = member_no;
	}

	public String getLang_cno() {
		return lang_cno;
	}

	public void setLang_cno(String lang_cno) {
		this.lang_cno = lang_cno;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}
}
