package Start;

import Model.Dao.MemberDao;
import View.view;

public class Start {
	public static void main(String[] args) {
		
		Start start = new Start();
		// start.pw_search();
		start.id_search();
		// start.first_view();
		
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
	
	
	
}
