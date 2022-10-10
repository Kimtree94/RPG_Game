package Model.Dto;

public class MemberDto {

	// 1. 필드
	private String name;		// 이름 
	private String ID;			// 아이디
	private String pw;			// 비밀번호
	private String phone;		// 전화번호
	private int ssn;			// 생년월일
	private String email;		// 이메일
	private String date;		// 가입일자
	
	private String nick_name;	// 캐릭터 이름
	private String x;			// 캐릭터 성별
	

	// 빈생성자
	public MemberDto() {
		super();
	}
	

	// 로그인 생성자
	public MemberDto(String ID, String pw) {
		super();
		this.ID = ID;
		this.pw = pw;
	}
	
	// 비밀번호 찾기 생성자 - 허혜영
	public MemberDto(String pw) {
		this.pw = pw;
	}


	// 회원가입 생성자 - 허혜영
	public MemberDto(String name, String ID, String pw, String phone, int ssn, String email) {
		this.name = name;
		this.ID = ID;
		this.pw = pw;
		this.phone = phone;
		this.ssn = ssn;
		this.email = email;
	}

	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public int getSsn() {
		return ssn;
	}


	public void setSsn(int ssn) {
		this.ssn = ssn;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getNick_name() {
		return nick_name;
	}


	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}


	public String getX() {
		return x;
	}


	public void setX(String x) {
		this.x = x;
	}

	
	
}
	
