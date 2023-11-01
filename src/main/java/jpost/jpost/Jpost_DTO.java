package jpost.jpost;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

public class Jpost_DTO {

	private int jpost_no;
	private String jpost_id;
	private String bmember_id;
	private int howto;
	private String title;
	private String detail;
	private Date start_date;
	private Date end_date;
//	private int d_day;
	private String locate;
	private Date post_date;
	private int stat;
	private String url;
	private String file_name;
	private int hit;
	private int vision;
	
	// 파일 업로드
	private MultipartFile jpost_upload;
	
	// 디폴트 생성자
	public Jpost_DTO() {
		super();
	}

	// Controller에서 받아야하는 데이터 생성자
	public Jpost_DTO(int howto, String title, String detail, Date start_date, Date end_date, /*int d_day,*/ String locate, String url, String file_name) {
		this.howto=howto;
		this.title=title;
		this.detail=detail;
		this.start_date=start_date;
		this.end_date=end_date;
//		this.d_day = d_day;
		this.locate=locate;
		this.url=url;
		this.file_name=file_name;
	}

	public Jpost_DTO(String jpost_id, int howto, String title, String detail, Date start_date, Date end_date,/* int d_day,*/ String locate, String url, String file_name) {
		this.jpost_id = jpost_id;
		this.howto=howto;
		this.title=title;
		this.detail=detail;
		this.start_date=start_date;
		this.end_date=end_date;
//		this.d_day = d_day;
		this.locate=locate;
		this.url=url;
		this.file_name=file_name;
	}
	
	public Jpost_DTO(int jpost_no, String jpost_id, String bmember_id, int howto, String title, String detail, Date start_date, Date end_date, /*int d_day,*/ String locate, Date post_date, int stat, String url, String file_name, int hit, int vision) {
		this.jpost_no=jpost_no;
		this.jpost_id=jpost_id;
		this.bmember_id=bmember_id;
		this.howto=howto;
		this.title=title;
		this.detail=detail;
		this.start_date=start_date;
		this.end_date=end_date;
//		this.d_day = d_day;
		this.locate=locate;
		this.post_date=post_date;
		this.stat=stat;
		this.url=url;
		this.file_name=file_name;
		this.hit=hit;
		this.vision=vision;
	}


	public MultipartFile getJpost_upload() {
		return jpost_upload;
	}

	public void setJpost_upload(MultipartFile jpost_upload) {
		this.jpost_upload = jpost_upload;
	}

//	public int getD_day() {
//		return d_day;
//	}
//
//	public void setD_day(int d_day) {
//		this.d_day = d_day;
//	}

	public int getVision() {
		return vision;
	}

	public void setVision(int vision) {
		this.vision = vision;
	}

	public int getJpost_no() {
		return jpost_no;
	}

	public void setJpost_no(int jpost_no) {
		this.jpost_no = jpost_no;
	}
	
	public String getJpost_id() {
		return jpost_id;
	}

	public void setJpost_id(String jpost_id) {
		this.jpost_id = jpost_id;
	}

	public String getbmember_id() {
		return bmember_id;
	}

	public void setbmember_id(String bmember_id) {
		this.bmember_id = bmember_id;
	}

	public int getHowto() {
		return howto;
	}

	public void setHowto(int howto) {
		this.howto = howto;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public String getLocate() {
		return locate;
	}

	public void setLocate(String locate) {
		this.locate = locate;
	}

	public Date getPost_date() {
		return post_date;
	}

	public void setPost_date(Date post_date) {
		this.post_date = post_date;
	}

	public int getStat() {
		return stat;
	}

	public void setStat(int stat) {
		this.stat = stat;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getFile_name() {
		return file_name;
	}

	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}
	
	
	
	
}
