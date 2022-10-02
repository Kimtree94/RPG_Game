package Controller;

import Model.Dao.MemberDao;
import Model.Dto.MemberDto;

public class Controller {

	// 현재 페이지 객체 선언
	private static Controller Controller = new Controller();
	// 빈생성자
	public Controller() { }
	// 싱글톤 메소드
	public static Controller getInstance() {
		return Controller;
	}
	
	// 회원가입
	public boolean singup( String name, String pw, String phone, int ssn, String email ) {
		MemberDto dto = new MemberDto(name, pw, phone, ssn, email);
		return MemberDao.getInstance().singup( dto );
		
	} // singup 메소드 종료
	
	
	
} // class e
