package battle;

public class Main {
	
	public Creature round(Creature attacker, Creature defender) {
		if(attacker.getAttack()>defender.getDefense())	return attacker;	
		else return defender;
	}
	
	public boolean dodge(Creature c) {
		int randomNum = (int)(Math.random() * 101);
		if (randomNum>=c.speed) return false;
		else return true;
	}

	public static void main(String[] args) {

		

	}

}
