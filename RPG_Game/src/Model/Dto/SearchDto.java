package Model.Dto;

public class SearchDto {

	// 1. 필드
	private String name;		// 이름 
	private String ID;			// 아이디
	private String pw;			// 비밀번호
	private String phone;		// 전화번호
	private int ssn;			// 생년월일
	private String email;		// 이메일
	private int date;			// 가입일자
	
	
	
	
	// 아이디 찾기 생성자 - 허혜영 
	public SearchDto(String iD) {
		this.ID = iD;
	}

	// 비밀번호 찾기 생성자 - 허혜영	
	public SearchDto(String iD, int ssn) {
		this.ID = iD;
		this.ssn = ssn;
	}

	// 내 정보 보기 생성자 - 허혜영
	public SearchDto(String name, String phone, String email, int date) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.date = date;
		
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
