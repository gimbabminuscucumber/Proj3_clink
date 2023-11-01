package common;

import java.util.UUID;

public interface ViewPath {

	public static final String INDEX = "/WEB-INF/views/layout/";
	public static final String JPOST = "/WEB-INF/views/jpost/";
	public static final String JPOST_APPLY = "/WEB-INF/views/jpost_apply/";
	public static final String BMEMBER = "/WEB-INF/views/bmember/";

	public static final String APPLY = "/WEB-INF/views/apply/";
	public static final String APPLYMNG = "/WEB-INF/views/applymng/";
	public static final String PRETEST = "/WEB-INF/views/pretest/";
	
	public static final String PROFILE = "/WEB-INF/views/profile/";

	public static final String RECOMMAND = "/WEB-INF/views/recommand/";
	
	// UUID 생성 메소드
	// - ViewPath에 메소드 작성 > Controller에서 insert에 UUID로 변경
	public static String getUUID(String type) {
	      return type+"-"+UUID.randomUUID().toString();
	   }
	
}
