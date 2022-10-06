package Model.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Dto.MemberDto;

import Model.Dto.MemberDto;

public class MemberDao {

	// 현재 페이지 객체 선언
	private static MemberDao memberDao = new MemberDao();

	// 필드
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
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/RPG_GAME_DB", "root", "1234");
		} // try E
		catch (Exception e) {
			System.out.println("오류발생" + e);
		} // catch E

	}

	// 회원가입 메소드(허혜영)

	public boolean singup(MemberDto dto) {

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

} // class e
