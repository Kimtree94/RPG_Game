package View;

import java.util.Scanner;

import Controller.Controller;
import Model.Dao.MemberDao;
import Model.Dto.MemberDto;

public class view {

	// 현재 페이지 객체 선언
	private static view view = new view();
	// 빈생성자
	public view() {	}
	// 싱글톤 메소드
	public static view getInstance() {
		return view;
	}
	

	Scanner scanner = new Scanner(System.in);
	
	public void first_view() {
		System.out.println(" ⚔⚔⚔⚔⚔⚔⚔자바죽이기⚔⚔⚔⚔⚔⚔⚔⚔\n⚔\t\t\t\t  ⚔\r\n" + "⚔\t　　ｏ\t\t\t  ⚔\r\n" + "⚔\t　　°\t\t\t  ⚔\r\n"
				+ "⚔\t　┳┳ ∩∩\t\t\t  ⚔\r\n" + "⚔\t　┃┃(･∀･)　☆　　★\t\t  ⚔\r\n" + "⚔\t┏┻┻┷━Ｏ ┏┷┓┏┷┓\t\t  ⚔\r\n"
				+ "⚔\t┃Welcome┠┨★┠┨☆┃\t  ⚔\r\n" + "⚔\t┗©━━©┛ ┗©┛┗©┛\t\t  ⚔ \n ⚔⚔⚔ RPG게임에 오신것을 환영합니다 ⚔⚔⚔");
		System.out.println("\t1.로그인 2.회원가입 ");
		int input = scanner.nextInt();
		if( input == 1 ) {
			
		}
		
		else if( input == 2 ) {
			singup();
			
		} // else if 종료
	} //first view E
		
	
	//회원가입
	public void singup() {
	
		System.out.println("     ◾ ◾ ◾ ◾ 회 원 가 입 ◾ ◾ ◾ ◾ \n");
		System.out.println("\t ◦ 이름 : ");
		String name = scanner.next();
		System.out.println("\t ◦ 비밀번호 : ");
		String pw = scanner.next();
		System.out.println("\t ◦ 전화번호 : ");
		String phone = scanner.next();
		System.out.println("\t ◦ 생년월일 : ");
		int ssn = scanner.nextInt();
		System.out.println("\t ◦ 이메일 : ");
		String email = scanner.next();
		

		boolean result = Controller.getInstance().singup(name, pw, phone, ssn, email);
		if ( result ) {
			System.out.println("\t🎉 회원가입 완료 🎉");
		}
		else {
			System.out.println("\t😥 회원가입 실패 😥");
		}
	} // singup 메소드 종료	

	boolean login() {
		System.out.println("ID를 입력하세요");
		String ID = scanner.next();
		System.out.println("PW를 입력하세요");
		String PW = scanner.next();
		boolean result = Controller.getInstance().login(ID, PW);
		if(result==true) {
			return true;
		}else {
			return false;
		}
	
	}

	
	
	
	
    
    
	
	
} //class E
