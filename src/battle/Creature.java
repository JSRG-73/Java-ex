package battle;

public class Creature {

	String name, type;
	int health, attack, skill, speed;
	
	
	public Creature(String type, String name, int health, int attack, int skill, int speed) {
		
		this.name = name;
		this.health = health;
		this.attack = attack;
		this.speed = speed;
		this.skill = skill;
		this.type = type;
	}


	public int getSkill() {
		return skill;
	}


	public void setSkill(int skill) {
		this.skill = skill;
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

	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
