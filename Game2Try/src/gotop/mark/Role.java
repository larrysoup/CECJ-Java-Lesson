package gotop.mark;

public class Role {
	private String name;
	private int level;
	private int blood;
	Role(String name, int level, int blood) {
		this.name = name;
		this.level = level;
		this.blood = blood;
	}
	
	public int getBlood() {
		return blood;
	}
	
	public void setBlood (int blood) {
		this.blood = blood;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void showBlood(Role role) {	//寫在Role中成為實例方法
		System.out.printf("%s 血量 %d%n", role.getName(), role.getBlood());
	}
}
