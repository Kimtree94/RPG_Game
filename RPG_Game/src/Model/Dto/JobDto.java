package Model.Dto;

public class JobDto {

	private String job;			// 직업
	private int job_damage;		// 데미지
	private String skill;		// 스킬
	private String warrior;		// 전사
	private String wizard;		// 마법사
	private String archer;		// 궁수
	private String change_jobs;	// 전직
	
	
	// 빈생성자
	public JobDto() {
		
	}
	// 풀생성자
	public JobDto(String job, int job_damage, String skill, String warrior, String wizard, String archer,
			String change_jobs) {
		super();
		this.job = job;
		this.job_damage = job_damage;
		this.skill = skill;
		this.warrior = warrior;
		this.wizard = wizard;
		this.archer = archer;
		this.change_jobs = change_jobs;
	}
	
	// geters seters
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getJob_damage() {
		return job_damage;
	}
	public void setJob_damage(int job_damage) {
		this.job_damage = job_damage;
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
	public String getChange_jobs() {
		return change_jobs;
	}
	public void setChange_jobs(String change_jobs) {
		this.change_jobs = change_jobs;
	}
	

	
	
	
	
	
	
	
	
}
