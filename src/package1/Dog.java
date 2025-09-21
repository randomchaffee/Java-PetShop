package package1;

public class Dog extends Pet {
	// Dog specific variables
	protected String breed;
	
	// Constructor
	public Dog(String name, String breed, int cost) {
		super(name, cost);
		this.breed = breed;
	}
	
	// abstract methods from superclass (growl and viewState)
	@Override
	public void growl() {
		System.out.println(this.name + " says: Woof!");
	}
	
	@Override
	public void viewState() {
		System.out.println("Name: " + this.name);
		System.out.println("Species: Dog");
		System.out.println("Breed: " + this.breed);
		System.out.println("Cost: " + this.cost);
	}
	
	// fetch method (dog specific)
	public void play() {
		System.out.println(this.name + " is playing fetch!");
	}
	
	
}
