package Model.Dto;

public class MemberDto {

	// 1. 필드
	
	private String name;		// 이름 
	private String ID;			// 아이디
	private String pw;			// 비밀번호
	private String phone;		// 전화번호
	private int ssn;			// 생년월일
	private String email;		// 이메일
	private int date;			// 가입일자
	
	private String nick_name;	// 캐릭터 이름
	private String x;			// 캐릭터 성별
	
	
	
	private int user_hp;		// 체력
	private int user_mp;		// 마력
	private int user_damage;	// 유저 데미지
	private int exp;			// 경험치
	private int gold;			// 골드
	private int uesr_level;		// 레벨
	private String job;			// 직업
	private int damage;			// 데미지
	private String skill;		// 스킬
	private String warrior;		// 전사
	private String wizard;		// 마법사
	private String archer;		// 궁수
	private String monster;		// 몬스터
	private String change_jobs;	// 전직
	private int level;			// 레벨
	private String dungeon;		// 던전
	private int attack;
		// 때린 횟수
	

	
	// 빈생성자
	public MemberDto() {
		super();
	}
	



	public MemberDto(String iD, String pw) {
		super();
		ID = iD;
		this.pw = pw;
	}




	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getID() {
		return ID;
	}



	public void setID(String iD) {
		ID = iD;
	}



	public String getPw() {
		return pw;
	}



	public void setPw(String pw) {
		this.pw = pw;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public int getSsn() {
		return ssn;
	}



	public void setSsn(int ssn) {
		this.ssn = ssn;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getDate() {
		return date;
	}



	public void setDate(int date) {
		this.date = date;
	}



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



	public int getExp() {
		return exp;
	}



	public void setExp(int exp) {
		this.exp = exp;
	}



	public int getGold() {
		return gold;
	}



	public void setGold(int gold) {
		this.gold = gold;
	}



	public int getUesr_level() {
		return uesr_level;
	}



	public void setUesr_level(int uesr_level) {
		this.uesr_level = uesr_level;
	}



	public String getJob() {
		return job;
	}



	public void setJob(String job) {
		this.job = job;
	}



	public int getDamage() {
		return damage;
	}



	public void setDamage(int damage) {
		this.damage = damage;
	}



	public String getSkill() {
		return skill;
	}



	public void setSkill(String skill) {
		this.skill = skill;
	}



	public String getWarrior() {
		return warrior;
	}



	public void setWarrior(String warrior) {
		this.warrior = warrior;
	}



	public String getWizard() {
		return wizard;
	}



	public void setWizard(String wizard) {
		this.wizard = wizard;
	}



	public String getArcher() {
		return archer;
	}



	public void setArcher(String archer) {
		this.archer = archer;
	}



	public String getMonster() {
		return monster;
	}



	public void setMonster(String monster) {
		this.monster = monster;
	}



	public String getChange_jobs() {
		return change_jobs;
	}



	public void setChange_jobs(String change_jobs) {
		this.change_jobs = change_jobs;
	}



	public int getLevel() {
		return level;
	}



	public void setLevel(int level) {
		this.level = level;
	}



	public String getDungeon() {
		return dungeon;
	}



	public void setDungeon(String dungeon) {
		this.dungeon = dungeon;
	}



	public int getAttack() {
		return attack;
	}



	public void setAttack(int attack) {
		this.attack = attack;
	}		

}
	
