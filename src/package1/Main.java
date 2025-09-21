/*****************************************************************************************
 *	This program simulates a Pet Shop in the form of a CLI-based menu.
 *	The focus of this exercise is on Inheritance. 
 *	Written in: Java
 *
 *	09/18/2025 15:33: TODO:
 *			the program is mostly complete, except in the buy function in PetShop.java
 *			a slight bug where the a user input would skip when there is a whitespace
 *			present in the string.
 *
 *	09/21/2025 22:41:
 *			bug fixed. replaced sc.next() with sc.nextLine().
 * 
 *	@author randomchaffee
 *	@date_created 09/18/2025 13:07
 *****************************************************************************************/

package	package1;
import java.util.Scanner;

public	class	Main	{
	public	static	void	main(String[]	args) {
		PetShop	petshop	=	new	PetShop("ABC Pet Shop", 1000); // pet shop environment initialization
		
		String	choice = "nil"; // placeholder
		Scanner	sc	=	new	Scanner(System.in);
		
		while	(!choice.equals("0")) {
			System.out.println("\nWelcome to the ABC Pet Shop Menu\n");
			System.out.println("[1] Print Shop Information");
			System.out.println("[2] Buy a Pet");
			System.out.println("[3] Sell a Pet");
			System.out.println("[0] Exit Shop");
			System.out.println();
			
			System.out.print("Enter choice: ");
			choice = sc.next();
			
			switch(choice)	{
			case	"1": // view state
				petshop.viewState();
				continue;

			case	"2": // the shop will buy a pet
				petshop.buy(sc);
				continue;
				
			case	"3": // the shop will sell a pet
				int ch;
				System.out.print("Enter Pet ID: ");
				ch = sc.nextInt();
				petshop.sell(ch);
				continue;
				
			case	"0":
				System.out.print("Exiting the pet shop.");
				sc.close();
			}
		}
	}
}