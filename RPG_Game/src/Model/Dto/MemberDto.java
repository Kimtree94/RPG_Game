package Model.Dto;

public class MemberDto {

	// 1. 필드
	
	private String name;		// 이름 
	private String ID;			// 아이디
	private String pw;			// 비밀번호
	private String phone;		// 전화번호
	private int ssn;			// 생년월일
	private String email;		// 이메일
	private int date;			// 가입일자
	
	

	// 빈생성자
	public MemberDto() {
		
	}

	// 풀생성자
	public MemberDto(String name, String iD, String pw, String phone, int ssn, String email, int date) {
		super();
		this.name = name;
		ID = iD;
		this.pw = pw;
		this.phone = phone;
		this.ssn = ssn;
		this.email = email;
		this.date = date;
	}

	
	// 로그인 생성자
	public MemberDto(String iD, String pw) {
		super();
		ID = iD;
		this.pw = pw;
	}
	
	// 회원가입 생성자
	public MemberDto(String name, String pw, String phone, int ssn, String email) {
		super();
		this.name = name;
		this.pw = pw;
		this.phone = phone;
		this.ssn = ssn;
		this.email = email;
	}

	// geters seters
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

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}
	
	
	
	
}
	
