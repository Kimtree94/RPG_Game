package Controller;

public class Controller {

	// 현재 페이지 객체 선언
	private static Controller Controller = new Controller();
	// 빈생성자
	public Controller() { }
	// 싱글톤 메소드
	public static Controller getInstance() {
		return Controller;
	}
	
	
	
	
	
} // class e
