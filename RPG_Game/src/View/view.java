package View;

import java.util.Scanner;

import Model.Dao.MemberDao;

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
	
	void first_view() {
		
	System.out.println(" ⚔⚔⚔⚔⚔⚔⚔자바죽이기⚔⚔⚔⚔⚔⚔⚔⚔\n⚔\t\t\t\t  ⚔\r\n" + "⚔\t　　ｏ\t\t\t  ⚔\r\n" + "⚔\t　　°\t\t\t  ⚔\r\n"
			+ "⚔\t　┳┳ ∩∩\t\t\t  ⚔\r\n" + "⚔\t　┃┃(･∀･)　☆　　★\t\t  ⚔\r\n" + "⚔\t┏┻┻┷━Ｏ ┏┷┓┏┷┓\t\t  ⚔\r\n"
			+ "⚔\t┃Welcome┠┨★┠┨☆┃\t  ⚔\r\n" + "⚔\t┗©━━©┛ ┗©┛┗©┛\t\t  ⚔ \n ⚔⚔⚔ RPG게임에 오신것을 환영합니다 ⚔⚔⚔");
	System.out.println("\t1.로그인 2.회원가입 ");
	int input = scanner.nextInt();
	if(input==1) {}
	
	else if(input==2) {}
	
	} //first view E
		
		
		
	
	
	
	
	
	
	
	
} //class E
