package package1;

public class Cat extends Pet {
	// Cat-specific variables
	protected String color;
	
	// Constructor
	public Cat(String name, String color, int cost) {
		super(name, cost);
		this.color = color;
	}
	
	// abstract methods from superclass (growl and viewState)
	@Override
	public void growl() {
		System.out.println(this.name + " says: Meow!");
	}
	
	@Override
	public void viewState() {
		System.out.println("Name: " + this.name);
		System.out.println("Species: Cat");
		System.out.println("Color: " + this.color);
		System.out.println("Cost: " + this.cost);
	}
	
	// hunt method (Cat-specific)
	public void play() {
		System.out.println(this.name + " started hunting.");
	}

}
