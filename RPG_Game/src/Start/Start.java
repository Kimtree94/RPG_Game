package Start;

import Model.Dao.MemberDao;
import View.view;

public class Start {
	public static void main(String[] args) {
		
		Start start = new Start();
		// start.pw_search();
		// start.id_search();
		// start.first_view();
		 start.mypage_user();
		 start.mypage_character();
		
	} // main 종료
	
	
	public void first_view() {
		view.getInstance().first_view();
	}
	
	public void singup() {
		view.getInstance().singup();		
	}
	
	public void id_search() {
		view.getInstance().id_search();
		
	}
	
	public void pw_search() {
		view.getInstance().pw_search();
		
	}
	
	public void mypage_user() {
		view.getInstance().mypage_user();
	}
	
	public void mypage_character() {
		view.getInstance().mypage_character();
	}
	
}
