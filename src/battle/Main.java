package battle;

public class Main {
	
	public String round(Creature attacker, Creature defender) {
		if(Main.dodge(defender)) return defender.name;
		int randomNum = (int)(Math.random() * (attacker.skill + defender.skill));
		if (randomNum<=attacker.skill) return attacker.name;
		else return defender.name;
	}
	
	public static boolean dodge(Creature c) {
		int randomNum = (int)(Math.random() * 101);
		if (randomNum>=c.speed) return false;
		else return true;
	}

	public static void main(String[] args) {

		Creature c1 = new Creature("dragon","d1",100,30,72,10);
		Creature c2 = new Creature("dragon","d2",100,30,72,10);
		
		Main m = new Main();

		System.out.println(m.round(c1, c2));
		System.out.println(m.dodge(c2));

	}

}
