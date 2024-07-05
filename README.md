## 프로젝트 설명
- ‘Clink’는 딱딱하고 어렵게 느껴질 수 있는 채용 플랫폼에 커뮤니케이션과 엔터테인 요소를 결합하여 편의성과 즐거움을 담았으며, 채용담당자와 구직자 모두의 입장에서 효율적이고 실용적인 기능을 추가한 채용 플랫폼 사이트입니다.



## 환경
- macOS
- jdk 1.7
- tomcat 9.0
- sts tool
- oracleDB
- 인코딩 utf-8


## 테이블
```sql
create table sns_c(
	sns_cno number constraint sns_c_pk primary key,
	icon varchar2(100) not null,
	name varchar2(60)
);

create table jstat_c(
	jstat_cno number constraint jstat_c_pk primary key,
	jstat_stat varchar2(50) not null
);

create table city_c(
	city_cno number constraint city_c_pk primary key,
	ntcode varchar2(50) not null,
	ctcode varchar2(50) not null,
	ctname varchar2(50) not null
);

create table socialact_c(
	socialact_cno number constraint socialact_c_pk primary key,
	socialact_name varchar2(50) not null
);

create table jarea_c(
	jarea_cno number constraint jarea_c_pk primary key,
	jarea_type varchar2(50) not null
);

create table tech_name_c(
	tech_name_cno number constraint tech_name_c_pk primary key,
	--tech_bot_cno varchar2(50), 기술 카테고리 아직 안됨
	--jarea_cno varchar2(50), 업계 아직 안됨
	name varchar2(300) not null,
	text varchar2(1500) not null
);

create table empl_type_c(
	empl_type_cno number constraint empl_type_c_pk primary key,
	empl_type varchar2(40) not null
);

create table worktime_c(
	worktime_cno number constraint worktime_c_pk primary key,
	worktime_type varchar2(50) not null
);

create table lv_c(
	lv_cno number constraint lv_c_pk primary key,
	lv_type varchar2(50) not null
);

create table school_c(
	school_cno number constraint school_c_pk primary key,
	school_type varchar2(50) not null
);

create table posi_c(
	posi_cno number constraint posi_c_pk primary key,
	posi_type varchar2(50) not null
);

create table ptype_c(
	ptype_cno number constraint ptype_c_pk primary key,
	typecode varchar2(30),
	type varchar2(30)
);

CREATE TABLE admin(	
	adminNo varchar2(50) constraint admin_pk primary key,
	adminId varchar2(50),
	adminPw varchar2(50),
	adminEmail varchar2(50),
	adminPhone varchar2(50),
	adminName varchar2(50),
	adminTeam varchar2(50),
	adminPosition varchar2(50)
);

CREATE TABLE MEMBER(	
	MEMBER_NO NUMBER, 
	MEMBER_ID VARCHAR(50),
	FIRST_NAME VARCHAR2(30), 
	LAST_NAME VARCHAR2(30), 
	EMAIL VARCHAR2(30), 
	SECRET_PW VARCHAR2(200), 
	SALT VARCHAR2(100), 
	JOIN_DATE DATE DEFAULT SYSDATE, 
	BIRTH DATE,
	DECL_CNT number,
	MENTOR number,
	MENTEE number,
	CONSTRAINT MEMBER_PK PRIMARY KEY (MEMBER_NO)
);

CREATE TABLE LOGIN_LOG(	
	LOGIN_LOG_NO NUMBER, 
	MEMBER_NO NUMBER, 
	UPDATED DATE, 
	IP VARCHAR2(100), 
	FAIL_CNT NUMBER DEFAULT 0 NOT NULL ENABLE, 
	STAT NUMBER DEFAULT 0 NOT NULL ENABLE, 
	CONSTRAINT LOGINLOG_PK PRIMARY KEY (LOGIN_LOG_NO)
);

CREATE TABLE ACT_LOG(	
	ACT_LOG_NO NUMBER, 
	MEMBER_NO NUMBER, 
	FEATURE_NO NUMBER, 
	TARGET_NO NUMBER, 
	ACT_DATE DATE DEFAULT SYSDATE, 
	CONSTRAINT ACT_PK PRIMARY KEY (ACT_LOG_NO)
);

CREATE TABLE ACT_CATE(	
	ACT_CATE_NO NUMBER, 
	UUID VARCHAR2(10), 
	SUMMARY VARCHAR2(100), 
	BIGCATE NUMBER, 
	CONSTRAINT ACTCATE_PK PRIMARY KEY (ACT_CATE_NO)
);

CREATE TABLE BIG_CATE(	
	BIG_CATE_NO NUMBER, 
	SUMMARY VARCHAR2(100), 
	CONSTRAINT BITCATE_PK PRIMARY KEY (BIG_CATE_NO)
);

CREATE TABLE STATUS(	
	STATUS_NO NUMBER, 
	STATUS_NAME VARCHAR2(50),
	CONSTRAINT status_PK PRIMARY KEY (STATUS_NO)
);

create table pf(
	no number,
	pf_no varchar2(50) constraint pf_pk primary key,
	member_id varchar2(50) not null,
	bg_img varchar2(100),
	main_img varchar2(100),
	hit number,
	updated date,
	content varchar2(300),
	nickname varchar2(30),
	posi varchar2(90)
);

create table career(
	career_no varchar2(50) constraint career_pk primary key,
	pf_no varchar2(50) not null, 
	member_no varchar2(50) not null,
	company varchar2(60) not null,
	posi varchar2(30) not null,
	task varchar2(30) not null,
	empl_type_cno number not null,
	city_cno number not null,
	stat number not null,
	jarea_cno number not null,
	start_date date not null,
	end_date date
	-- constraint career_fk1 foreign key(pf_no) references pf(pf_no),
	-- constraint career_fk2 foreign key(member_no) references member(member_id)
);

create table edu(
	edu_no varchar2(50) constraint edu_pk primary key,
	pf_no varchar2(50) not null, 
	member_no varchar2(50) not null,
	school varchar2(300) not null,
	stat number not null,
	degree varchar2(300) not null,
	major varchar2(300) not null,
	gpa varchar2(30) not null
	-- constraint edu_fk1 foreign key(pf_no) references pf(pf_no),
	-- constraint edu_fk2 foreign key(member_no) references member(member_id)	
);

create table rest(
	rest_no varchar2(50) constraint rest_pk primary key,
	pf_no varchar2(50) not null, 
	member_no varchar2(50) not null,
	rest_rsn_no number not null,
	stat number not null,
	start_date date not null,
	end_date date not null,
	text varchar2(300) not null
	-- constraint rest_fk1 foreign key(pf_no) references pf(pf_no),
	-- constraint rest_fk2 foreign key(member_no) references member(member_id)
	-- constraint rest_fk3 foreign key(rest_rsn_no) references rest_rsn(rest_rsn_no)
);

create table rest_rsn(
	rest_rsn_no number constraint rest_rsn_pk primary key,
	rsn varchar2(300) not null
);

create table cert(
	cert_no varchar2(50) constraint cert_pk primary key,
	pf_no varchar2(50) not null, 
	member_no varchar2(50) not null,
	name varchar2(60) not null,
	author varchar2(600) not null
	-- constraint cert_fk1 foreign key(pf_no) references pf(pf_no),
	-- constraint cert_fk2 foreign key(member_no) references member(member_id)	
);

create table inscert(
	inscert_no varchar2(50) constraint inscert_pk primary key,
	pf_no varchar2(50) not null, 
	member_no varchar2(50) not null,
	name varchar2(60) not null,
	author varchar2(60) not null,
	inscert_date date not null
	-- constraint inscert_fk1 foreign key(pf_no) references pf(pf_no),
	-- constraint inscert_fk2 foreign key(member_no) references member(member_id)
);

create table proj(
	proj_no varchar2(50) constraint proj_pk primary key,
	pf_no varchar2(50) not null, 
	member_no varchar2(50) not null,
	name varchar2(300) not null,
	stat number
	-- constraint proj_fk1 foreign key(pf_no) references pf(pf_no),
	-- constraint proj_fk2 foreign key(member_no) references member(member_id)
);

create table proj_entry(
	proj_entry_no varchar2(50) constraint proj_entry_pk primary key,
	proj_no varchar2(50) not null, 
	member_no varchar2(50) not null
	-- constraint proj_entry_fk1 foreign key(member_no) references member(member_id)
	-- constraint proj_entry_fk2 foreign key(proj_no) references proj(proj_no)
);

create table army(
	army_no varchar2(50) constraint army_pk primary key,
	pf_no varchar2(50) not null,
	member_no varchar2(50) not null,
	opt number,
	type number,
	disch number,
	rsn varchar2(300),
	start_date date,
	end_date date,
	termStat number not null
	-- constraint army_fk1 foreign key(pf_no) references pf(pf_no),
	-- constraint army_fk2 foreign key(member_no) references member(member_id)	
);

create table rec_ask(
    	rec_ask_no number not null,
    	rec_ask_id varchar2(50) constraint rec_ask_pk primary key,
    	member_no varchar2(50) not null,
    	to_member varchar2(50) not null,
    	content varchar2(300) not null,
	ask_date date not null, 
	relation_no number  not null
	-- constraint rec_ask_fk1 foreign key(member_no) references member(member_id),
	-- constraint rec_ask_fk2 foreign key(relation_no) references relation(relation_no)
);

create table rec_form(
	rec_form_no number not null,
    	rec_form_id varchar2(50) constraint rec_form_pk primary key,
    	pf_no varchar2(50) not null,
    	rec_ask_id varchar2(50) not null,
    	member_no varchar2(50) not null,
    	detail varchar2(4000) not null,
   	form_date date not null
	-- constraint rec_form_fk1 foreign key(rec_ask_id) references rec_ask(rec_ask_id)
	-- constraint rec_form_fk2 foreign key(member_no) references member(member_id),
	-- constraint rec_form_fk3 foreign key(pf_no) references pf(pf_no)
);

create table relation(
    	relation_no number constraint relation_pk primary key,
   	relation varchar2(50)
);

create table ilchon(
	ilchon_no number constraint ilchon_pk primary key,
	id1 varchar2(50) not null, 		
	id2 varchar2(50) not null,		
	stat number default 0 constraint ilchon_ck check(stat in(0,1)) not null,
	sent_date date default sysdate not null,
	accepted date,
	type number check(type in(0,1)) not null,
	groupno number not null
	--constraint ilchon_fk1 foreign key(id1) references Member(member_id),
	--constraint ilchon_fk2 foreign key(id2) references Member(member_id)
);

create table Follow(
	follow_no number constraint Follow_pk primary key,
	from_usr varchar2(50) not null,
	to_usr varchar2(50) not null
	--constraint Follow_fk1 foreign key(from_usr) references Member(member_id),
	--constraint Follow_fk1 foreign key(to_usr) references Member(member_id)
);

create table Mentor_Apply(
	mentor_apply_no number constraint Mentor_Apply_pk primary key,
	member_id varchar2(50) not null,
	email number check(email in(0,1)) not null,
	bus_card varchar2(100)
	--constraint Mentor_Apply_fk1 foreign key(member_id) references Member(member_id)
);

create table Mentor_Contact(
	mentor_contact_no number constraint Mentor_Contact_pk primary key,
	mentor varchar2(50) not null,
	mentee varchar2(50) not null,
	sent_date date default sysdate not null,
	stat number check(stat in(0,1)) not null,
	start_date date,
	end_date date
	--constraint Mentor_Contact_fk1 foreign key(mentor) references Member(member_id),
	--constraint Mentor_Contact_fk2 foreign key(mentee) references Member(member_id)
);

create table Mentor_Review(
	mentor_review_no number constraint Mentor_Review_pk primary key,
	mentor_contact_no number,
	mentor_id varchar2(50) not null,
	review_date date,
	content varchar2(300),
	score number
);

create table Mentor_Grade_Mng(
	mentor_grade_mng_no number constraint Mentor_Grade_Mng_pk primary key,
	name varchar2(30) not null,
	img varchar2(100) not null,
	score number not null
);

create table Mentor_Grade(
	mentor_grade_no number constraint Mentor_Grade_pk primary key,
	member_id varchar2(50) not null,
	mentor_grade_mng_no number not null,
	score number default 0 not null
	--constraint Mentor_Grade_fk1 foreign key(member_id) references Member(member_id),
	--constraint Mentor_Grade_fk2 foreign key(mentor_grade_mng_no) references Mentor_Grade_Mng(mentor_grade_mng_no)
);

create table Chat_Room(
	chat_room_no number constraint Chat_Room_pk primary key,
	title varchar2(100),
	chat_room_perm number not null,
	type number not null
);

create table Chat(
	chat_no number constraint Chat_pk primary key,
	chat_other_no number not null,
	report number not null,
	block number not null,
	stat number not null,
	detail varchar2(4000),
	receive date,
	sent date not null,
	chat_file varchar2(100),
	del number
	--constraint Chat_fk1 foreign key(chat_other_no) references Chat_Other(chat_other_no)
);

create table Chat_Other(
	chat_other_no number constraint Chat_Other_pk primary key,
	chat_room_no number not null,
	usr_id varchar2(50) not null
	--constraint Chat_Other_fk1 foreign key(chat_room_no) references Chat_Room(chat_room_no)
);

create table apply(
	apply_id varchar2(50) constraint apply_pk primary key,
	member_id varchar2(50) not null,
	apply_stat_no number not null,
	apply_form_id varchar2(50) not null,
	apply_date date not null
	--constraint apply_fk1 foreign key(member_id) references member(member_id)
	--constraint apply_fk2 foreign key(apply_stat_no) references apply_stat(apply_stat_no),
	--constraint apply_fk3 foreign key(apply_form_id) references apply_form(apply_form_id)	
);

create table apply_form(
	apply_form_id varchar2(50) constraint apply_form_pk primary key,
	member_id varchar2(50) not null,	-- 불필요 칼럼
	title varchar2(300) not null,
	detail varchar2(4000) not null
	--constraint apply_form_fk1 foreign key(member_id) references member(member_id)
);

create table apply_list(
	apply_list_id varchar2(50) constraint apply_list_pk primary key,
	apply_stat_no number not null,		-- 불필요 칼럼
	apply_id varchar2(50) not null,	
	jpost_id varchar2(50) not null
	--constraint apply_list_fk1 foreign key(apply_stat_no) references apply_stat(apply_stat_no),
	--constraint apply_list_fk2 foreign key(apply_id) references apply(apply_id),
	--constraint apply_list_fk3 foreign key(jpost_id) references jpost(jpost_id)
);

create table apply_stat(
	apply_stat_no number constraint apply_stat_pk primary key,
	name varchar2(50) not null
);

create table Bmember(
        bmember_no number not null,
        bmember_id varchar2(50) constraint Memberb_pk primary key,
        bm_stat_no number not null,
        --city_cno number not null,
        --actstat_mng_id varchar2(50) not null,
        name varchar2(90) not null,
        en_Name varchar2(90) not null,
        email varchar2(30) not null,
        pw varchar2(100) not null,
        salt varchar2(100) not null,
        join_date date default sysdate not null,
        regi_Number varchar2(100) not null,
        group_Name varchar2(90)
        --constraint Bmember_fk1 foreign key(bm_stat_no) references Bm_stat(bm_stat_no)
        --constraint Join_Bus_fk2 foreign key(country_id) references 
        --constraint Join_Bus_fk3 foreign key(actstat_mng_id) references 
);

create table Bm_stat(
	bm_stat_no number constraint Bm_stat_pk primary key,
	stat varchar2(30)
);

create table Bcontact_Type(
	bcontact_type_no number constraint Bcontact_Type_pk primary key,
	type varchar2(50)
);

create table Bcontact(
	bcontact_no number constraint Bcontact_pk primary key,
	bmember_id varchar2(50) not null,
	bcontact_type_no number not null,
	contact varchar2(30) not null
	--constraint Bcontact_fk1 foreign key(bmember_id) references Bmember(bmember_id),
	--constraint Bcontact_fk2 foreign key(bcontact_type_no) references Bcontact_Type(bcontact_type_no)
);

create table Bpf(
	bpf_no varchar2(50) constraint PF_bus_pk primary key,
	-- jarea_cno number 업계 아직
	-- city_cno number 국가 코드 아직
	-- location_no varchar2(50) 소재지 아직
	bmember_id varchar2(50) not null,
	logo varchar2(100),
	hit number default 0 not null,
	updated date default sysdate not null,
	content varchar2(300),
	empl_cnt number,
	expert varchar2(300),
	hp varchar2(90),
	extb date,
	detail varchar2(4000)
	--constraint BPF_fk4 foreign key(bmember_id) references Bmember(bmember_id)
);

create table Bpf_Url(
	bpf_url_no number constraint Bpf_Url_pk primary key,
	homepg_type_cno number not null,
	bmember_id varchar2(50) not null,
	url varchar2(100) not null,
	name varchar2(50) not null
	--constraint Bpf_Url_fk1 foreign key(bmember_id) references Bmember(bmember_id),
	--constraint Bpf_Url_fk2 foreign key(homepg_type_cno) references Homepg_Type_C(homepg_type_cno)
);

create table Bpf_SNS(
	bpf_sns_no number constraint Bpf_SNS_pk primary key,
	bmember_id varchar2(50) not null,
	sns_cno number not null,
	account varchar2(30),
	constraint Bpf_SNS_fk1 foreign key(bmember_id) references Bmember(bmember_id),
	constraint Bpf_SNS_fk2 foreign key(sns_cno) references SNS_C(sns_cno)
);

create table CreateO_Mng(
	createo_mng_no number not null,
	createo_mng_id varchar2(50) constraint OpCreate_bus_pk primary key,
	bmember_id varchar2(50) not null,
	posi_mng_no number not null,
	name varchar2(50) not null,
	id varchar2(30) not null,
	pw varchar2(100) not null,
	salt varchar2(100) not null
	--constraint createo_mng_fk1 foreign key(bmember_id) references Bmember(bmember_id),
	--constraint createo_mng_fk3 foreign key(posi_mng_no) references Posi_Mng(posi_mng_no)
);

create table Depart_Mng(
	depart_mng_no number constraint Depart_Mng_pk primary key,
	bmember_id varchar2(50) not null,
	name varchar2(30) not null,
	constraint Depart_Mng_fk1 foreign key(bmember_id) references Bmember(bmember_id)
);

create table posi_Mng(
	posi_mng_no number constraint posi_Mng_pk primary key,
	depart_mng_no number not null,
	name varchar2(30) not null,
	constraint posi_Mng_fk1 foreign key(depart_mng_no) references Depart_Mng(depart_mng_no)
);

create table GradeO_Mng(
	gradeo_mng_no number constraint GradeO_Mng_pk primary key,
	createo_mng_id varchar2(50) not null,
	grade1 number not null,
	grade2 number not null,
	grade3 number not null,
	grade4 number not null,
	constraint GradeO_Mng_fk1 foreign key(createo_mng_id) references CreateO_Mng(createo_mng_id)
);

create table jpost(
	jpost_no number not null,
	jpost_id varchar2(50) constraint jpost_pk primary key,
	bmember_id varchar2(50) not null, 
	howto number not null,
	title varchar2(90) not null,
	detail CLOB not null,
	start_date date not null,
	end_date date not null,
	locate varchar2(100) not null,
	post_date date default sysdate,
	stat number default 1,
	url varchar2(200), 
	file_name varchar2(100),
	hit number default 0,
	vision number default 1
);

create table jpost_detail(
	jpost_detail_no number not null,
	jpost_detail_id varchar2(50) constraint jpost_detail_pk primary key,
	jpost_id varchar2(50) not null, 
	jarea_cno number not null,
	worktime_cno number not null,
	empl_type_cno number not null,
	posi_cno number not null,
	task varchar2(100) not null,
	lv_cno number not null,
	salary varchar2(100) not null,
	school_cno number not null,
	type number not null
);

create table apply_mng(
	apply_mng_no number constraint apply_mng_pk primary key,
	jpost_id varchar2(50) not null, 
	apply_id varchar2(50) not null,
	fit number
);

create table pretest(
	pretest_no number not null,
	pretest_id varchar2(50) constraint pretest_pk primary key,
	jpost_id varchar2(50) not null,
	classify number not null,
	stat number not null
);

create table pretest_q(
	pretest_q_no number not null,
	pretest_q_id varchar2(50) constraint pretest_q_pk primary key,
	pretest_id varchar2(50) not null,
	question varchar2(2000) not null
);

create table pretest_opt(
	pretest_opt_no number not null,
	pretest_opt_id varchar2(50) constraint pretest_opt_pk primary key,
	pretest_q_id varchar2(50) not null,
	opt varchar2(2000) not null
);
```

## 시퀀스
```sql
create sequence actstat_c_seq nocache;
create sequence homepg_type_c_seq nocache;
create sequence sns_c_seq nocache;
create sequence tech_name_c_seq nocache;
create sequence city_c_seq;
create sequence empl_type_c_seq;
create sequence jarea_c_seq;
create sequence jstat_c_seq;
create sequence lv_c_seq;
create sequence posi_c_seq;
create sequence school_c_seq;
create sequence socialact_c_seq;
create sequence worktime_c_seq;
create sequence hash_mng_c_seq;
create sequence ptype_c_seq;
create sequence admin_seq;
CREATE SEQUENCE MEMBER_SEQ NOCACHE;
CREATE SEQUENCE LOGIN_LOG_SEQ NOCACHE;
CREATE SEQUENCE ACT_CATE_SEQ NOCACHE;
CREATE SEQUENCE ACT_LOG_SEQ NOCACHE;
CREATE SEQUENCE BIG_CATE_SEQ NOCACHE;
CREATE SEQUENCE STATUS_SEQ NOCACHE;
create sequence pf_seq;
create sequence career_seq;
create sequence edu_seq;
create sequence cert_seq;
create sequence inscert_seq;
create sequence army_seq;
create sequence rest_seq;
create sequence rest_rsn_seq;
create sequence proj_seq;
create sequence proj_entry_seq;
create sequence rec_ask_seq;
create sequence rec_form_seq;
create sequence relation_seq;
create sequence ilchon_seq nocache;
create sequence ilchon_groupno_seq nocache;
create sequence Follow_seq nocache;
create sequence Mentor_Apply_seq nocache;
create sequence Mentor_Contact_seq nocache;
create sequence Mentor_Review_seq nocache;
create sequence Mentor_Grade_Mng_seq nocache;
create sequence Mentor_Grade_seq nocache;
create sequence Chat_Room_seq nocache;
create sequence Chat_Other_seq nocache;
create sequence Chat_seq nocache;
create sequence apply_seq;
create sequence apply_form_seq;	
create sequence apply_list_seq;
create sequence apply_stat_seq;	
create sequence Bm_stat_seq nocache;
create sequence Bcontact_Type_seq nocache;
create sequence Bmember_seq nocache;
create sequence BPF_seq nocache;
create sequence Bcontact_seq nocache;
create sequence Bpf_Url_seq nocache;
create sequence Bpf_SNS_seq nocache;
create sequence Depart_Mng_seq nocache;
create sequence posi_Mng_seq nocache;
create sequence CreateO_Mng_seq nocache;
create sequence GradeO_Mng_seq nocache;
create sequence jpost_seq;
create sequence jpost_detail_seq;
create sequence apply_mng_seq;
create sequence pretest_seq;
create sequence pretest_q_seq;
create sequence pretest_opt_seq;
```


## SQL 초기 데이터
```sql
insert into Homepg_Type_C values(Homepg_Type_C_seq.nextval,'포트폴리오');
insert into Homepg_Type_C values(Homepg_Type_C_seq.nextval,'개인홈페이지');
insert into Homepg_Type_C values(Homepg_Type_C_seq.nextval,'자사 홈페이지');

insert into hash_mng_c values(hash_mng_c_seq.nextval, '꽃향기');

insert into ActStat_C values(ActStat_C_seq.nextval,'휴면');
insert into ActStat_C values(ActStat_C_seq.nextval,'정상');
insert into ActStat_C values(ActStat_C_seq.nextval,'임시탈퇴');
insert into ActStat_C values(ActStat_C_seq.nextval,'영구탈퇴');

insert into SNS_C values(SNS_C_seq.nextval,'인스타','인스타');
insert into SNS_C values(SNS_C_seq.nextval,'페이스북','페이스북');
insert into SNS_C values(SNS_C_seq.nextval,'트위터','트위터');

insert into jstat_c values(0, '재직상태를 선택하세요');
insert into jstat_c values(1, '재직중');
insert into jstat_c values(2, '퇴사');
insert into jstat_c values(3, '구직중');

insert into city_c values(0, '국가', '도시', '국가와 도시를 선택하세요');
insert into city_c values(1, 'kor', 'seoul', '서울');
insert into city_c values(2, 'jap', 'tokyo', '도쿄');
insert into city_c values(3, 'canada', 'ottawa', '오타와');
insert into city_c values(4, 'us', 'california', '캘리포니아');
insert into city_c values(5, 'uk', 'manchester', '맨체스터');

insert into socialact_c values(0, '카테고리를 선택하세요'); 
insert into socialact_c values(1, '동물 보호'); 
insert into socialact_c values(2, '문화 예술'); 
insert into socialact_c values(3, '아동 복지'); 
insert into socialact_c values(4, '인권과 사회운동'); 
insert into socialact_c values(5, '경제발전'); 
insert into socialact_c values(6, '교육'); 
insert into socialact_c values(7, '환경'); 
insert into socialact_c values(8, '건강'); 
insert into socialact_c values(9, '인권'); 
insert into socialact_c values(10, '구조, 구호'); 
insert into socialact_c values(11, '정치'); 
insert into socialact_c values(12, '빈곤 퇴치'); 
insert into socialact_c values(13, '과학 기술'); 
insert into socialact_c values(14, '사회 봉사'); 
insert into socialact_c values(15, '군필자 지원');

insert into jarea_c values(0, '고용 직군을 선택하세요'); 
insert into jarea_c values(1, 'IT'); 
insert into jarea_c values(2, '경영, 사무'); 
insert into jarea_c values(3, '교육'); 
insert into jarea_c values(4, '보건, 의료'); 
insert into jarea_c values(5, '연구개발'); 

insert into Tech_Name_C values(Tech_Name_C_seq.nextval,'java','자바입니다만');

insert into empl_type_c values(0, '고용 형태를 선택하세요'); 
insert into empl_type_c values(1, '정규직'); 
insert into empl_type_c values(2, '계약직');
insert into empl_type_c values(3, '프리랜서');

insert into worktime_c values(0, '근무 시간을 선택하세요'); 
insert into worktime_c values(1, '풀타임'); 
insert into worktime_c values(2, '파트타임'); 
insert into worktime_c values(3, '프리랜서');

insert into lv_c values(0, '경력을 선택하세요'); 
insert into lv_c values(1, '신입'); 
insert into lv_c values(2, '1년 이상'); 
insert into lv_c values(3, '2년 이상'); 
insert into lv_c values(4, '3년 이상'); 
insert into lv_c values(5, '4년 이상'); 
insert into lv_c values(6, '5년 이상'); 
insert into lv_c values(7, '7년 이상'); 
insert into lv_c values(8, '10년 이상'); 
insert into lv_c values(9, '15년 이상'); 
insert into lv_c values(10, '20년 이상');

insert into school_c values(0, '교육을 선택하세요'); 
insert into school_c values(1, '초졸 이상'); 
insert into school_c values(2, '중졸 이상'); 
insert into school_c values(3, '고졸 이상'); 
insert into school_c values(4, '전문대졸 이상'); 
insert into school_c values(5, '대졸 이상'); 
insert into school_c values(6, '대학원졸 이상');

insert into posi_c values(0, '고용 직급을 선택하세요'); 
insert into posi_c values(1, '주임'); 
insert into posi_c values(2, '대리'); 
insert into posi_c values(3, '과장'); 
insert into posi_c values(4, '차장'); 
insert into posi_c values(5, '이사');

insert into ptype_c values(ptype_c_seq.nextval, 'pp', '일반 게시글');
insert into ptype_c values(ptype_c_seq.nextVal, 'bn', '뉴스레터');
insert into ptype_c values(ptype_c_seq.nextVal, 'bp', '페이지');
insert into ptype_c values(ptype_c_seq.nextVal, 'gp', '모임내 게시글');
insert into ptype_c values(ptype_c_seq.nextVal, 'ba', '광고 게시글');

insert into admin values(admin_seq.nextval, 'gimbabminuscucumber', '123', 'admin01@naver.com', '010-1234-5678', '김동은', '1팀', '개발자');
insert into admin values(admin_seq.nextval, 'heerak', '123', 'admin02@naver.com', '010-1234-5679', '정희락', '2팀', '개발자');
insert into admin values(admin_seq.nextval, 'sinna', '123', 'admin03@naver.com', '010-1234-5678', '박신아', '3팀', '개발자');

INSERT INTO LOGIN_LOG(LOGIN_LOG_NO, MEMBER_NO, UPDATED) VALUES (LOGIN_LOG_SEQ.NEXTVAL, 1, SYSDATE);
INSERT INTO ACT_LOG VALUES(ACT_LOG_SEQ.NEXTVAL, 1, 2, 1, SYSDATE);

insert into relation values(0, '관계를 선택하세요');
insert into relation values(1, '직장 상사');
insert into relation values(2, '클라이언트');
insert into relation values(3, '학교 스승');
insert into relation values(4, '멘토');
insert into relation values(5, '기타');
insert into apply_stat values(0,'숨김');
insert into apply_stat values(1,'저장완료');
insert into apply_stat values(2,'임시저장');

insert into Bm_stat values(Bm_stat_seq.nextval,'대기');
insert into Bm_stat values(Bm_stat_seq.nextval,'승인');
insert into Bm_stat values(Bm_stat_seq.nextval,'반려');

insert into Bcontact_Type values(Bcontact_Type_seq.nextval,'회사연락처');
insert into Bcontact_Type values(Bcontact_Type_seq.nextval,'팩스번호');
```

