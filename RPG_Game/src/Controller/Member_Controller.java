package Controller;

import Model.Dao.MemberDao;
import Model.Dto.MemberDto;

public class Member_Controller {

	// 현재 페이지 객체 선언
	public static Member_Controller Controller = new Member_Controller();

	// 빈생성자
	public Member_Controller() {
	}

	// 싱글톤 메소드
	public static Member_Controller getInstance() {
		return Controller;
	}

	// 회원가입
	public boolean singup(String name, String ID, String pw, String phone, int ssn, String email) {
		MemberDto dto = new MemberDto(name, ID, pw, phone, ssn, email);
		return MemberDao.getInstance().singup(dto);

	} // singup 메소드 종료

	// 로그인 메소드 김원종
	public boolean login(String ID, String pw) {
		MemberDto dto = new MemberDto(ID, pw);
		boolean result = MemberDao.getInstance().login(dto);

		if (result == true) {
			return true;
		} else {
			return false;
		}

	}

	// 회원탈퇴 메소드 (김원종) [ 2022-10-06 ]
	public boolean userout(String id, String pw) {
		MemberDto dto = new MemberDto(id, pw);
		boolean result = MemberDao.getInstance().userout(dto);
		if (result) {
			return true;
		} else {
			return false;
		}
	}

} // class e
