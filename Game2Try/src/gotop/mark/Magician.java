package gotop.mark;

public class Magician extends Role{
	Magician(String name, int level, int blood) {
		super(name, level, blood);
	}
	public void fight() {
		System.out.println("�]�k����");
	}
	
	public void cure() {
		System.out.println("�]�k�v��");
	}
}
