
public class Gorilla extends Mammal{
	
	
	public void throwSomething() {
		System.out.print("the Gorilla throw Something!");
	     
	     super.energy = super.energy - 5;
	}
	
public void eatBananas() {
	System.out.print("gorilla's satisfaction and increase its energy by 10");
    
    super.energy = super.energy + 10;
		
	}

public void climb() {
	
System.out.print("gorilla has climbed a tree and decrease its energy by 10");
    
    super.energy = super.energy - 10;
	
}

}
