package Model.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDao {

	// 현재 페이지 객체 선언
	private static MemberDao memberDao = new MemberDao();
	// 싱글톤 메소드
	public static MemberDao getInstance() {
		return memberDao;
	}
	
	
	
	//필드
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	//생성자 
		
	 private MemberDao() {
		try {
			con= DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/RPG_GAME_DB", 
					"root", 
					"1234");
			System.out.println("DB연동성공");
		}//try E
		catch (Exception e) {System.out.println("오류발생"+e);}//catch E
		
	}
	
	//회원가입 메소드(허혜영)
	
	
	
	
	//로그인 메소드 (김원종)
	
	 
	 
	 
	
	
} // class e
