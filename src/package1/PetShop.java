package package1;
import java.util.Scanner;

public class PetShop {
	// Pet Shop variables
	private String name;
	private int balance;
	private int size;
	private Pet[] pets;
	
	// Constant variables
	public final static int MAX_SIZE = 10;
	public final static int INITIAL_BALANCE = 1000;
	
	// Constructor
	public PetShop(String name, int balance) {
		this.name = name;
		this.balance = balance;
		this.pets = new Pet[MAX_SIZE];
		this.size = 0;
	}
	
	// view state method
	public void viewState() {
		System.out.println(this.name + " Ledger:");
		System.out.println(" - Balance: " + this.balance);
		System.out.println(" - Pets in the shop: " + this.size + "\n");
		
		System.out.println("*=========================================||");
		for(int i = 0; i < this.size; i++) {
			System.out.println("ID: " + i);
			this.pets[i].viewState();
			System.out.println("*=========================================||");
		}
	}
	
	// buy method
	public void buy(Scanner sc) {
		if (this.size == MAX_SIZE) {
			System.out.println("The pet shop is full. cannot take in another pet.");
			return;
		}
		
		String species;
		
		System.out.println("Species List: \n - dog\n - cat\n - rabbit");
		System.out.print("Enter species: ");
		species = sc.next();
		sc.nextLine();
		
		if (species.equals("dog")) {
			String name, breed;
			int cost;
			
			System.out.print("Enter dog name: ");
			name = sc.nextLine();
			System.out.print("Enter dog breed: ");
			breed = sc.nextLine();
			System.out.print("Enter dog cost: ");
			cost = sc.nextInt();
			
			Pet new_dog = new Dog(name, breed, cost);
			
			this.pets[size] = new_dog;
			this.balance -= new_dog.cost;
			this.size++;
			System.out.println(this.pets[size-1].name + " is now included in " + this.name + "!");
		} else if (species.equals("cat")) {
			String name, color;
			int cost;
			
			System.out.print("Enter cat name: ");
			name = sc.nextLine();
			System.out.print("Enter cat color: ");
			color = sc.nextLine();
			System.out.print("Enter cat cost: ");
			cost = sc.nextInt();
			
			Pet new_cat = new Cat(name, color, cost);
			
			this.pets[size] = new_cat;
			this.balance -= new_cat.cost;
			this.size++;
			System.out.println(this.pets[size-1].name + " is now included in " + this.name + "!");
		} else if (species.equals("rabbit")) {
			String name, sz;
			int cost;
			
			System.out.print("Enter rabbit name: ");
			name = sc.nextLine();
			System.out.print("Enter rabbit size: ");
			sz = sc.nextLine();
			System.out.print("Enter rabbit cost: ");
			cost = sc.nextInt();
			
			Pet new_rabbit = new Rabbit(name, sz, cost);
			
			this.pets[size] = new_rabbit;
			this.balance -= new_rabbit.cost;
			this.size++;
			System.out.println(this.pets[size-1].name + " is now included in " + this.name + "!");
		} else {
			System.out.println("Invalid input!");
		}
	}
	
	// Sell method
	public void sell(int i) {
		if (pets[i] == null) {
			System.out.println("Invalid ID!");
			return;
		}
		
		int price = this.pets[i].cost;
		String name = this.pets[i].name;
		
		this.balance += price + (price * 0.05);
		for(int j = 0; j < size-1; j++) {
			this.pets[j] = this.pets[j+1];
		}

		this.pets[size - 1] = null;
		size--;
		System.out.println(name + " has been sold to its new owner!");
		
		
	}
}
