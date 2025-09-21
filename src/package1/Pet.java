package package1;

public abstract class Pet {
	// Pet variables
	protected String name;
	protected int cost;
	
	// constructor
	public Pet(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}
	
	// Methods
	public void pet(Pet pet) {
		System.out.println(pet.name + " is being petted.");
	}
	
	// Abstract methods
	public abstract void growl();
	
	public abstract void viewState();

	protected abstract void play();
	
}
