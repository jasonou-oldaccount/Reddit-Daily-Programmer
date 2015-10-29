/**
 * Reddit [Easy] Challenge #1
 * https://www.reddit.com/r/dailyprogrammer/comments/pih8x/easy_challenge_1/
 *
 * create a program that will ask the users name, age, and reddit username. 
 * Have it tell them the information back.
 */
 
import java.util.Scanner;
import java.util.InputMismatchException;

class Easy1 {
	
	// Asks the user for their info and prints it out
	public static void AskUser() {
		// In java you strings and ints must be scanned in separately
		Scanner askString = new Scanner(System.in);
		
		// Asks user their name and stores it
		System.out.print("What is your name? : ");
		String name = askString.nextLine();
		
		// Asks user their age and stores it
		int age = 0;
		for(;;) {
			// Int scanner must be separated from String
			Scanner askInt = new Scanner(System.in);
			// Checks if the user inputs a string or int
			try {
				System.out.print("What is your age? : ");
				age = askInt.nextInt();			
			} catch (InputMismatchException e) {
				// Scanning in a string outputs an error
				System.out.println("Invalid Input, Usage: [Integer].");
				continue;
			}
			// if user inputs a successful int, it breaks out the loop
			break;
		}
		
		// Asks user their Reddit username and stores it
		System.out.print("What is your Reddit username? : ");
		String redditu = askString.nextLine();
		
		// Prints out their info
		System.out.printf("\nYour name is %s, you are %d years old, and your Reddit username is %s.\n", name, age, redditu);
	}
	
	public static void main(String[] args) {
		// Calls function AskUser()
		AskUser();
	}
	
}