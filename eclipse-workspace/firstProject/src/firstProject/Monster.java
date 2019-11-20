package firstProject;

public class Monster {
	public final String TOMBSTONE = "RIP";
	private int health = 500;
	private int attack = 20;
	private int movement = 2;
	private int xPos, yPos = 0;
	private boolean alive = true;

	public String name = "Monster1";
	
	public int getAttack() {
		return attack;
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getMovement() {
		return movement;
	}
	
	public int getXPos() {
		return xPos;
	}
	
	public int getYPos() {
		return yPos;
	}
	
	public boolean getAlive() {
		return alive;
	}
	
	public void setHealth(int decreaseHealth) {
		health = health-decreaseHealth;
		if(health<=0) {
			alive = false;
		}
	}
	
	public void setHealth(double decreaseHealth) {
		health = health - (int)decreaseHealth;
		if(health<=0) {
			alive = false;
		}
	}
	
	//CONSTRUCTOR
	
	public Monster(int health, int attack, int movement) {
		this.health = health;
		this.attack=attack;
		this.movement=movement;
		
	}
	
	public Monster() {
		
	}
	
	public static void main(String[] args) {
		Monster Test = new Monster();
		
		System.out.println(Test.attack);
	}
}
