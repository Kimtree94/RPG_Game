package View;

import java.util.ArrayList;
import java.util.Scanner;

import Controller.Member_Controller;
import Model.Dao.MemberDao;
import Model.Dto.CharacterDto;
import Model.Dto.MemberDto;
import Model.Dto.SearchDto;

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
		if( input == 1 ) {
			login();
			//mypage_user();
			mypage_character();
		}

		else if (input == 2) {
			singup();

		} // else if 종료
		else if (input== 3) {
			view.userout();
			view.first_view();
		} // else if 종료 [회원탈퇴 김원종 ]

	} // first view E
		// - 회원탈퇴 완
		// - 회원수정 미완
		// - 내 캐릭터 목록보기

	
	
	//임시 마을
	public void select() {
		view.character();System.out.println();
		System.out.println("1.캐릭터생성 2.회원정보수정");
		int ch=scanner.nextInt();
		if(ch==1) {}
		if(ch==2) {
			view.usercorrection();
		}
	}
	
	
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
    
	
	// 회원정보수정 (김원종) [ 2022 - 10 -07 ] 
	boolean usercorrection() {
		
		System.out.println("회원님의 현재 비밀번호를 입력해주요.");
		String pw = scanner.next();
		System.out.println("수정할 아이디를 입력해주세요.");
		String reid = scanner.next();
		System.out.println("수정할 비밀번호를 입력해주요.");
		String repw = scanner.next();
		System.out.println("수정할 핸드폰번호를 입력해주요.");
		String rephone = scanner.next();
		System.out.println("수정할 이메일을 입력해주요.");
		String reemail = scanner.next();

	
		
		boolean result = Member_Controller.getInstance().usercorrection(pw, reid, repw, rephone, reemail);
		if(result) {
			System.out.println("회원정보를 수정했습니다.");
			return result;}
		else {return false;}
	}
	//내 캐릭터 목록 보기 (김원종) [ 2022 - 10 -09 ]
	void character() {
		ArrayList<CharacterDto> list = Member_Controller.getInstance().character();
		System.out.println("회원님의 캐릭터 목록입니다.");
		for(CharacterDto dto :list) {
			System.out.println("캐릭터이름\t|캐릭터성별");
			System.out.print(dto.getNick_name()+"\t|"+dto.getX());
		}
	}
	
	
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
	
	
	
} // class E
