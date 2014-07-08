package gotop.mark;

public class Magician extends Role{
	Magician(String name, int level, int blood) {
		super(name, level, blood);
	}
	public void fight() {
		System.out.println("魔法攻擊");
	}
	
	public void cure() {
		System.out.println("魔法治癒");
	}
}
