
public class Bat extends Mammal {
	
	 
	public Bat() {
		super.energy = 300;
	}

	public void fly() {
		
		System.out.println("clicks");
		super.energy -= 50;
		
	}
	
public void eatHumans() {
	super.energy += 25;
	}

public void attackTown() {
	System.out.println("Town Sound");
	super.energy -= 100;
	
}
	
}
