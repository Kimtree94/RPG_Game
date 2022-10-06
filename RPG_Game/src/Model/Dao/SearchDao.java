package Model.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Model.Dto.MemberDto;
import Model.Dto.SearchDto;

public class SearchDao {

	private static SearchDao sdao = new SearchDao();
	
	public static SearchDao getInstance() {
		return sdao;
	}
	
	//필드
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	private SearchDao() {
		try {
			con= DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/RPG_GAME_DB", 
					"root", 
					"1234");
			// System.out.println("DB연동성공");
		}//try E
		catch (Exception e) {System.out.println("오류발생"+e);}//catch E
		
	}
	
	// 아이디 찾기 - 허혜영
	public SearchDto id_search( String name, String phone ) {
		String sql = "select id from user where name = ? and phone = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, name );
			ps.setString(2, phone);
			rs = ps.executeQuery();
			if( rs.next()) {
				SearchDto sdto = new SearchDto(rs.getString(1));
				return sdto;
			}
			else {
				System.out.println("입력한 정보가 맞지않습니다.");
			}
		} catch (Exception e) {
			System.out.println( "아이디 찾기 오류 : " + e );
		}
		return null;
	} // id_search 메소드 종료
		
	// 비밀번호 찾기 - 허혜영	
	public MemberDto pw_search( String id, int ssn ) {

			String sql = "select pw from user where id = ? and ssn = ?";
			try {
				ps = con.prepareStatement(sql);
				ps.setString(1, id);
				ps.setInt(2, ssn);
				rs = ps.executeQuery();
				if( rs.next()) {
					MemberDto mdto = new MemberDto(rs.getString(1));
					return mdto;
				}
				else {
					System.out.println("입력한 정보가 맞지않습니다.");
				}
			} catch (Exception e) {
				System.out.println( "아이디 찾기 오류 : " + e );
			}
			return null;
	}	// pw_search 메소드 종료
	
	
	
}
