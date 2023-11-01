package member.pf.thesis;


public class Thesis_DTO {

	private String thesis_no;
	private String pf_no;
	private String member_no;
	private String title;
	private String publisher;
	private String writer;
	
	public Thesis_DTO() {
		super();
	}
	
	public Thesis_DTO(String thesis_no, String pf_no, String member_no, String title, String publisher, String writer) {
		this.thesis_no = thesis_no;
		this.pf_no = pf_no;
		this.member_no = member_no;
		this.title = title;
		this.publisher = publisher;
		this.writer = writer;
	}

	public String getThesis_no() {
		return thesis_no;
	}

	public void setThesis_no(String thesis_no) {
		this.thesis_no = thesis_no;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
}
