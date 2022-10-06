package Controller;

import Model.Dao.MemberDao;
import Model.Dto.MemberDto;

public class Controller {

	// 현재 페이지 객체 선언
	public static Controller Controller = new Controller();
	// 빈생성자
	public Controller() { }
	// 싱글톤 메소드
	public static Controller getInstance() {
		return Controller;
	}
	

	// 회원가입
	public boolean singup( String name, String ID, String pw, String phone, int ssn, String email ) {
		MemberDto dto = new MemberDto(name, ID, pw, phone, ssn, email);
		return MemberDao.getInstance().singup( dto );
		
	} // singup 메소드 종료

	
	//로그인 메소드
	public boolean login(String ID , String pw) {
		MemberDto dto = new MemberDto(ID, pw);
		boolean result = MemberDao.getInstance().login(dto);
		
		if(result==true) {
			return true;
		}
		else {
			return false;
		}
	
	}	

	
	
	
} // class e
