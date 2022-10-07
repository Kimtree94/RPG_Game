
-- 데이터 베이스
drop database if exists RPG_GAME_DB;
create database RPG_GAME_DB;
use RPG_GAME_DB;

-- 회원가입 테이블
create table user(

	user_no int primary key auto_increment not null ,			-- 회원번호
	name varchar(10) ,											-- 이름 
	id varchar(20) ,											-- 아이디
	pw varchar(20) ,											-- 비밀번호
	phone varchar(15) ,											-- 전화번호
	ssn int ,													-- 생년월일
	email varchar(30) , 										-- 이메일
	date TIMESTAMP												-- 가입일자	
	
	-- timestamp : 생성시간 자동생성 기능, 컬럼명 TIMESTAMP DEFAULT NOW() 와 사용할 것
	
);

-- 캐릭터 테이블
create table create_character (
	character_no int primary key auto_increment not null ,   	-- 캐릭터 번호
    nick_name varchar(20) ,		 			 					-- 닉네임
    x char(2) , 												-- 성별
    user_no int ,												-- 회원번호 FK
    -- 직업 fk 받아오기
    foreign key ( user_no ) references user ( user_no )
);

-- CREATE TABLE Test DATETIME DEFAULT CURRENT_TIMESTAMP();



insert into user values(null,'홍길동','1234','010-1234-1234','941011','mdm@naver.com',now());

select*from user;


select name, phone, email, date from user where id = "전사다";
select nick_name, x from create_character where user_no = "1";

select * from user where (id, pw) =  ("전사다" , "1234");


