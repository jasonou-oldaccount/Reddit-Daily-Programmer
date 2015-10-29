/**
 * Reddit [Easy] Challenge #1
 * https://www.reddit.com/r/dailyprogrammer/comments/pih8x/easy_challenge_1/
 *
 * create a program that will ask the users name, age, and reddit username. 
 * Have it tell them the information back.
 */
 
import java.util.Scanner;

class Easy1 {
	
	public static void main(String[] args) {
		// In java you strings and ints must be scanned in separately
		Scanner askString = new Scanner(System.in);
		Scanner askInt = new Scanner(System.in);
		
		// Asks user their name and stores it
		System.out.print("What is your name? : ");
		String name = askString.nextLine();
		
		// Asks user their age and stores it
		System.out.print("What is your age? : ");
		int age = askInt.nextInt();
		
		// Asks user their Reddit username and stores it
		System.out.print("What is your Reddit username? : ");
		String redditu = askString.nextLine();
		
		// Prints out their info
		System.out.printf("\nYour name is %s, you are %d years old, and your Reddit username is %s.\n", name, age, redditu);
	}
	
}