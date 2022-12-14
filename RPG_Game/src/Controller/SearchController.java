package Controller;

import java.util.ArrayList;

import Model.Dao.SearchDao;
import Model.Dto.CharacterDto;
import Model.Dto.MemberDto;
import Model.Dto.SearchDto;

public class SearchController {

	
	// 현재 페이지 객체 선언
	public static SearchController scon = new SearchController();
	// 빈생성자
	public SearchController() { }
	// 싱글톤 메소드
	public static SearchController getInstance() {
		return scon;
	}

	// 아이디 찾기 - 허혜영
	public SearchDto id_search( String name, String phone ) {
		return SearchDao.getInstance().id_search( name, phone );
		
	} // id_search 메소드 종료
	
	// 비밀번호 찾기 - 허혜영	
	public MemberDto pw_search( String id, int ssn ) {
		return SearchDao.getInstance().pw_search( id, ssn );
		
	} // pw_search 메소드 종료
	
	// 내 정보 보기(유저) - 허혜영
	public SearchDto mypage_user() {
		return SearchDao.getInstance().mypage_user();
		
	}
	
	// 내 정보 보기(캐릭터) - 허혜영
	public CharacterDto mypage_character() {
		return SearchDao.getInstance().mypage_character();
		
	}
}

