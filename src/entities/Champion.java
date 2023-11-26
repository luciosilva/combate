package entities;

public class Champion {

	private String name;
	private int life;
	private int attack;
	private int armor;
	
	public Champion(String name, int life, int damage, int armor) {
		super();
		this.name = name;
		this.life = life;
		this.attack = damage;
		this.armor = armor;
	}
	
	public void takeDamage(Champion other)
	{
		if(other.getAttack() < this.getArmor())
			this.setLife(this.getLife() - 1);
		else
			this.setLife(this.getLife() - (other.getAttack() - this.getArmor()));
	}
	
	public String status()
	{
		return this.getLife() > 0 ? 
				this.getName() + ": " + this.getLife() + " de vida" : 
				this.getName() + ": 0 de vida (morreu)";
	}

	public String getName() {
		return name;
	}

	public int getLife() {
		return life;
	}

	private void setLife(int life) {
		this.life = life;
	}

	public int getAttack() {
		return attack;
	}

	public int getArmor() {
		return armor;
	}	
	
}
