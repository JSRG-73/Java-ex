package battle;

public class Main {
	
	public Creature round(Creature attacker, Creature defender) {
		int randomNum = (int)(Math.random() * (attacker.skill + defender.skill));
		if (randomNum<=attacker.skill) return attacker;
		else return defender;
	}
	
	public boolean dodge(Creature c) {
		int randomNum = (int)(Math.random() * 101);
		if (randomNum>=c.speed) return false;
		else return true;
	}

	public static void main(String[] args) {

		Creature c1 = new Creature("dragon","d1",100,30,72,10);

	}

}
