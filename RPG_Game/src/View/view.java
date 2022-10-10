package View;

import java.util.ArrayList;
import java.util.Scanner;

import Controller.Controller;
import Controller.SearchController;
import Model.Dao.MemberDao;
import Model.Dto.CharacterDto;
import Model.Dto.MemberDto;
import Model.Dto.SearchDto;

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
			login();
			//mypage_user();
			mypage_character();
		}
		
		else if( input == 2 ) {
			singup();
			
		} // else if 종료
	} //first view E
		
	
	// 회원가입 - 허혜영
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
		

		boolean result = Controller.getInstance().singup(name, id, pw, phone, ssn, email);
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
			mypage_user();
			return true;
		}else {
			return false;
		}
	
	}

	// 아이디 찾기 - 허혜영
	public void id_search() {
		// 이름, 연락처
		System.out.println("     ◾ ◾ ◾ ◾ 아이디 찾기 ◾ ◾ ◾ ◾ ");
		System.out.println("\t ◦ 이름을 입력하세요");
		String name = scanner.next();
		System.out.println("\t ◦ 연락처를 입력하세요");
		String phone = scanner.next();
		SearchController.getInstance().id_search( name, phone );
		
		SearchDto sdto = SearchController.getInstance().id_search(name, phone);
		System.out.println("\t ◦ 당신의 아이디는 [ " + sdto.getID() + " ] 입니다!");

		
		
	} // id_search 메소드 종료
	
	// 비밀번호 찾기 - 허혜영	
	public void pw_search() {
		// 아이디, 연락처
		System.out.println("     ◾ ◾ ◾ ◾ 비밀번호 찾기 ◾ ◾ ◾ ◾ ");
		System.out.println("\t ◦ 아이디를 입력하세요");
		String id = scanner.next();
		System.out.println("\t ◦ 생년월일을 입력하세요");
		int ssn = scanner.nextInt();
		
		MemberDto mdto = SearchController.getInstance().pw_search( id, ssn );
		System.out.println("\t ◦ 당신의 아이디는 [ " + mdto.getPw() + " ] 입니다!");
		
	} // pw_search 메소드 종료
    
	
	// 내 정보 보기(유저) - 허혜영 22.10.10
	public void mypage_user() {
		SearchDto sdto = SearchController.getInstance().mypage_user();
		System.out.println(" — [ 유저 정보 ] —————————————————————————— ");
		System.out.println(" ◦ 이 름	: " + sdto.getName());
		System.out.println(" ◦ 연락처 : " + sdto.getPhone());
		System.out.println(" ◦ 메일주소 : " + sdto.getEmail());
		System.out.println(" ◦ 가입일자 : " + sdto.getDate());
		System.out.println(" ——————————————————————————————————————— ");
	} // mypage_user 메소드 종료
    
	
	// 내 정보 보기(캐릭터) - 허혜영 22.10.10
	public void mypage_character() {
		CharacterDto cdto = SearchController.getInstance().mypage_character();
		System.out.println();
		System.out.println(" — [ 캐릭터 정보 ] ————————————————————————— ");
		System.out.println(" ◦ 닉네임 : " + cdto.getNick_name());
		System.out.println(" ◦ 성 별	: " + cdto.getX());
		System.out.println(" ———————————————————————————————————————— ");
	} // mypage_character 메소드 종료
	
} //class E
