package Start;

import Model.Dao.MemberDao;
import View.view;

public class Start {
	public static void main(String[] args) {
		
		Start start = new Start();
		start.first_view();
	}
	
	
	public void first_view() {
		view.getInstance().first_view();
	}
	
	public void singup() {
		view.getInstance().singup();		
	}
	
	
	
	
}
