package gotop.mark;

public class RPG {
//	public static void showBlood(Role role) {
//		System.out.printf("%s 血量 %d%n", role.getName(), role.getBlood());
//	}
	
	public static void main(String[] args) {
//		SwordsMan swordman = new SwordsMan("Justin", 1, 200);
//		Magician magician = new Magician("Monica", 1, 100);
		
//		showBlood(swordman);
//		showBlood(magician);
		
//		swordman.showBlood(swordman);
//		magician.showBlood(magician);
		
		/* 使用多形寫法 */
		Role swordman = new SwordsMan("Justin", 1, 200);
		Role magician = new Magician("Monica", 1, 100);
		
		swordman.showBlood(swordman);
		magician.showBlood(magician);
		/* test */
		

	}

}
