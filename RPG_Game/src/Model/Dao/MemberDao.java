package Model.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Dto.MemberDto;

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

	public boolean singup( MemberDto dto ) {
	
		String sql = "insert into user values( null, ?, ?, ?, ?, ?, now() )";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getPw());
			ps.setString(3, dto.getPhone());
			ps.setInt(4, dto.getSsn());
			ps.setString(5, dto.getEmail());
			ps.executeUpdate();
			
			return true;
			
		} catch (Exception e) {
			System.out.println( "회원가입 오류 : " + e );
		}
		return false;
		
	} // singup 메소드 종료
	
	
	
	
	//로그인 메소드 (김원종)
	
	 
	 
	 
	
	
} // class e
