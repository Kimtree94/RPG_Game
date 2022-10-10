package Model.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.Dto.CharacterDto;
import Model.Dto.MemberDto;
import Model.Dto.SearchDto;
import Model.Dto.MemberDto;

public class MemberDao {

	// 현재 페이지 객체 선언
	private static MemberDao memberDao = new MemberDao();


	//필드
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private static MemberDao dao = new MemberDao();
	// 생성자

	// 싱글톤 메소드
	public static MemberDao getInstance() {
		return memberDao;
	}

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
	
	// 회원가입 - 허혜영

	private MemberDao() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/RPG_GAME_DB", "root", "1234");
		} // try E
		catch (Exception e) {
			System.out.println("오류발생" + e);
		} // catch E

	}

	// 회원가입 메소드(허혜영)

	public boolean singup( MemberDto dto ) {
		String sql = "insert into user values( null, ?, ?, ?, ?, ?, ?, now() )";

		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getID());
			ps.setString(3, dto.getPw());
			ps.setString(4, dto.getPhone());
			ps.setInt(5, dto.getSsn());
			ps.setString(6, dto.getEmail());
			ps.executeUpdate();
			return true;

		} catch (Exception e) {
			System.out.println("회원가입 오류 : " + e);
		}
		return false;

	} // singup 메소드 종료

	// 로그인 메소드 (김원종)
	public boolean login(MemberDto dto) {
		String sql = "select * from user where id=? and pw=? ";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getID());
			ps.setString(2, dto.getPw());
			rs = ps.executeQuery();
			if (rs.next()) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			System.out.println("로그인 오류발생" + e);
		}
		return false;

	}

	// 회원탈퇴 메소드 (김원종)[2022-10-06]
	public boolean userout(MemberDto dto) {
		String sql = "delete from user where id=? and pw=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getID());
			ps.setString(2, dto.getPw());
			System.out.println(dto.getID());
			System.out.println(dto.getPw());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			System.out.println("회원탈퇴 오류발생" + e);
		}
		return false;
	}
	
	//회원정보수정 메소드(김원종) [ 2022- 10 -07 ] 
	public boolean usercorrection(MemberDto dto) {
		String sql = "update user SET  id = ?,pw=? ,phone=?,email=? WHERE pw= ? ";
	try {
		ps=con.prepareStatement(sql);
		ps.setString(1, dto.getPw());
		ps.setString(2, dto.getPhone());
		ps.setString(3, dto.getEmail());
		ps.setString(4, dto.getID());
		ps.setString(5, dto.getPw());
		ps.executeUpdate();
		return true;
	} catch (Exception e) {System.out.println(e);}
	return false;
	}
	
	
	// 내 캐릭터 목록보기(김원종) [ 2022 - 10 - 09 ]
	public ArrayList<CharacterDto> character() {
		ArrayList<CharacterDto> list = new ArrayList<>();
		String sql = "select*from  create_character";
		try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				CharacterDto dto = new CharacterDto(rs.getString(2),rs.getString(3));
				list.add(dto);
			}
			return list;
		} catch (Exception e) {System.out.println("캐릭터목록 오류"+e);}
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 
	 
	
	
} // class e
