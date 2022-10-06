package Model.Dto;

public class MonsterDto {

	// 임시
	private String monster;		// 몬스터
	private int mon_level;		// 레벨
	private int mon_hp;		// 레벨
	private int mon_damage;	// 유저 데미지
		
	private String dungeon;		// 던전
	
	// 빈생성자
	public MonsterDto() {
		
	}
	
	// 풀생성자
	public MonsterDto(String monster, int mon_level, int mon_hp, int mon_damage, String dungeon) {
		super();
		this.monster = monster;
		this.mon_level = mon_level;
		this.mon_hp = mon_hp;
		this.mon_damage = mon_damage;
		this.dungeon = dungeon;
	}

	// geters seters
	public String getMonster() {
		return monster;
	}

	public void setMonster(String monster) {
		this.monster = monster;
	}

	public int getMon_level() {
		return mon_level;
	}

	public void setMon_level(int mon_level) {
		this.mon_level = mon_level;
	}

	public int getMon_hp() {
		return mon_hp;
	}

	public void setMon_hp(int mon_hp) {
		this.mon_hp = mon_hp;
	}

	public int getMon_damage() {
		return mon_damage;
	}

	public void setMon_damage(int mon_damage) {
		this.mon_damage = mon_damage;
	}

	public String getDungeon() {
		return dungeon;
	}

	public void setDungeon(String dungeon) {
		this.dungeon = dungeon;
	}
	
	
	
	
}
