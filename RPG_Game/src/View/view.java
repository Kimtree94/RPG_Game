package View;

import java.util.Scanner;

import Controller.Member_Controller;
import Model.Dao.MemberDao;
import Model.Dto.MemberDto;

public class view {

	// 현재 페이지 객체 선언
	private static view view = new view();

	// 빈생성자
	public view() {
	}

	// 싱글톤 메소드
	public static view getInstance() {
		return view;
	}

	Scanner scanner = new Scanner(System.in);

	public void first_view() {
		System.out.println(" ⚔⚔⚔⚔⚔⚔⚔자바죽이기⚔⚔⚔⚔⚔⚔⚔⚔\n⚔\t\t\t\t  ⚔\r\n" + "⚔\t　　ｏ\t\t\t  ⚔\r\n" + "⚔\t　　°\t\t\t  ⚔\r\n"
				+ "⚔\t　┳┳ ∩∩\t\t\t  ⚔\r\n" + "⚔\t　┃┃(･∀･)　☆　　★\t\t  ⚔\r\n" + "⚔\t┏┻┻┷━Ｏ ┏┷┓┏┷┓\t\t  ⚔\r\n"
				+ "⚔\t┃Welcome┠┨★┠┨☆┃\t  ⚔\r\n" + "⚔\t┗©━━©┛ ┗©┛┗©┛\t\t  ⚔ \n ⚔⚔⚔ RPG게임에 오신것을 환영합니다 ⚔⚔⚔");
		System.out.println("\t1.로그인 2.회원가입 3.회원탈퇴");
		int input = scanner.nextInt();
		if (input == 1) {
			view.login();
			view.first_view();
		}

		else if (input == 2) {
			singup();

		} // else if 종료
		else if (input == 3) {
			view.userout();
			view.first_view();
		} // else if 종료 [회원탈퇴 김원종 ]

	} // first view E
		// - 회원탈퇴 완
		// - 회원수정 
		// - 내 캐릭터 목록보기

	// 회원가입
	public void singup() {

		System.out.println("     ◾ ◾ ◾ ◾ 회 원 가 입 ◾ ◾ ◾ ◾ \n");
		System.out.println("\t ◦ 이름 : ");
		String name = scanner.next();
		System.out.println("\t ◦ 아이디 : ");
		String id = scanner.next();
		System.out.println("\t ◦ 비밀번호 : ");
		String pw = scanner.next();
		System.out.println("\t ◦ 전화번호 : ");
		String phone = scanner.next();
		System.out.println("\t ◦ 생년월일 : ");
		int ssn = scanner.nextInt();
		System.out.println("\t ◦ 이메일 : ");
		String email = scanner.next();

		boolean result = Member_Controller.getInstance().singup(name, id, pw, phone, ssn, email);
		if (result) {
			System.out.println("\t🎉 회원가입 완료 🎉");
		} else {
			System.out.println("\t😥 회원가입 실패 😥");
		}
	} // singup 메소드 종료

	// 로그인 김원종
	boolean login() {
		boolean check = true;
		while (check) {
			System.out.println("ID를 입력하세요");
			String ID = scanner.next();
			System.out.println("PW를 입력하세요");
			String PW = scanner.next();
			boolean result = Member_Controller.getInstance().login(ID, PW);
			if (result == true) {
				System.out.println("로그인성공!");
				return true;
			}
		}
		System.out.println("로그인실패ㅠㅠ");
		return false;
	}

	// 회원탈퇴 (김원종) [ 2022-10-06 ]
	boolean userout() {
		boolean check = true;
		while (check) {
			System.out.println("아이디를 입력해주세요.");
			String id = scanner.next();
			System.out.println("비밀번호를 입력해주요.");
			String pw = scanner.next();

			boolean result = Member_Controller.getInstance().userout(id, pw);
			if (result) {
				System.out.println("회원탈퇴성공");
			view.first_view();
			}
		}
		System.out.println("회원정보가 일치하지 않습니다.");
		return false;
	}
	
	

} // class E
