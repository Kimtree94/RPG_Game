package Model.Dto;

public class CharacterDto {
	
	private String nick_name;	// 캐릭터 이름
	private String x;			// 캐릭터 성별
	private int user_hp;		// 체력
	private int user_mp;		// 마력
	private int user_damage;	// 유저 데미지
	private int user_level;		// 레벨
	
	private int user_exp;		// 경험치
	private int user_gold;		// 골드
	
	// 빈생성자
	public CharacterDto() {
		
	}
	
	public CharacterDto(String nick_name, String x) {
		super();
		this.nick_name = nick_name;
		this.x = x;
	}

	// 풀생성자
	public CharacterDto(String nick_name, String x, int user_hp, int user_mp, int user_damage, int user_level,
			int user_exp, int user_gold) {
		super();
		this.nick_name = nick_name;
		this.x = x;
		this.user_hp = user_hp;
		this.user_mp = user_mp;
		this.user_damage = user_damage;
		this.user_level = user_level;
		this.user_exp = user_exp;
		this.user_gold = user_gold;
	}

	// geters seters
	public String getNick_name() {
		return nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public int getUser_hp() {
		return user_hp;
	}

	public void setUser_hp(int user_hp) {
		this.user_hp = user_hp;
	}

	public int getUser_mp() {
		return user_mp;
	}

	public void setUser_mp(int user_mp) {
		this.user_mp = user_mp;
	}

	public int getUser_damage() {
		return user_damage;
	}

	public void setUser_damage(int user_damage) {
		this.user_damage = user_damage;
	}

	public int getUser_level() {
		return user_level;
	}

	public void setUser_level(int user_level) {
		this.user_level = user_level;
	}

	public int getUser_exp() {
		return user_exp;
	}

	public void setUser_exp(int user_exp) {
		this.user_exp = user_exp;
	}

	public int getUser_gold() {
		return user_gold;
	}

	public void setUser_gold(int user_gold) {
		this.user_gold = user_gold;
	}
	
	
	
	
}
