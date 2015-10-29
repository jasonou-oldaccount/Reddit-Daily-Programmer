/**
 * Reddit [Difficult] Challenge #1
 * https://www.reddit.com/r/dailyprogrammer/comments/pii6j/difficult_challenge_1/
 *
 * we all know the classic "guessing game" with higher or lower prompts. 
 * Lets do a role reversal; you create a program that will guess numbers between 1-100, 
 * and respond appropriately based on whether users say that the number is too high or too low
 */
 
import java.util.Scanner;

class Difficult1 {
	
	public static void GuessIt(int low, int high, int guess) {
		
		char useropt;
		// Checks for user input if the user inputs (y), (l), or (h)
		for (;;) {
			Scanner scan = new Scanner(System.in);
			System.out.printf("Is your number %d? (y)es, (l)ower, (h)igher : ", guess);
			// gets user input chars
			useropt = scan.next().charAt(0);
			// checks for valid input
			if (useropt != 'y' && useropt != 'l' && useropt != 'h') {
				System.out.println("Invalid Input, Usage: [y | l | h].");
				continue;
			}
			// if valid input, exits infinite loop
			break;
		}
		
		// if user says y, then exit
		if (useropt == 'y') {
			System.out.printf("Your secret number is %d!\n", guess);
			return;
		} else if (useropt == 'l') {
			// l, creates lower bound
			high = guess - 1;
		} else {
			// h, creates upper bound
			low = guess + 1;
		}
		// Recursively calls itself until guess is correct
		GuessIt(low, high, (high + low)/2);
	}
	
	public static void main(String[] args) {
		System.out.println("Think of a number from 1 - 100!");
		// initial guess is 50 from the range of 1 - 100
		GuessIt(1, 100, 50);
	}
	
}