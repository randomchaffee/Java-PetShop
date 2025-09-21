package package1;

public class Rabbit extends Pet {
	// Rabbit-specific variables
	protected String size;
	
	// Constructor
	public Rabbit(String name, String size, int cost) {
		super(name, cost);
		this.size = size;
	}
	
	// abstract methods from superclass (growl and viewState)
	@Override
	public void growl() {
		System.out.println(this.name + " says: Oink!");
	}
	
	@Override
	public void viewState() {
		System.out.println("Name: " + this.name);
		System.out.println("Species: Rabbit");
		System.out.println("Size: " + this.size);
		System.out.println("Cost: " + this.cost);
	}
	
	// dig method (rabbit-specific)
	public void play() {
		System.out.println(this.name + " started digging on the ground!");
	}
	
}
