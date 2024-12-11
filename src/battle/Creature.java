package battle;

public class Creature {

	String name, type;
	int health, attack, defense, speed;
	
	
	public Creature(int health, int attack, int defense, int speed, String name, String type) {
		
		this.name = name;
		this.health = health;
		this.attack = attack;
		this.speed = speed;
		this.defense = defense;
		this.type = type;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public int getAttack() {
		return attack;
	}


	public void setAttack(int attack) {
		this.attack = attack;
	}


	public int getDefense() {
		return defense;
	}


	public void setDefense(int defense) {
		this.defense = defense;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
