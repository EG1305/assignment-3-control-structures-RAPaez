// Ricardo Paez Assignment 2, Challenge 11: Guess The Number

import java.util.Scanner;
public class GuessTheNumber {
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in); 
		int random = (int)(Math.random() * 101); // Makes a number between 1 and 100
		int guess; // Users guess
		int count = 0; // Counter for number of guesses
		
		// Do while loop to have at least one user input
		do {
			System.out.println("Guess a number between 1 and 100");
			guess = input.nextInt();
			
			// When they guess the right number
			if (guess == random) {
				System.out.println("Yes, the number is " + random);
				count++;
			}
			// If the guess is greater than the number
			else if (guess > random) {
				System.out.println("Your guess is too high ");
				count++;
			}
			// If the guess is less than the number
			else {
				System.out.println("Your guess is too low");
				count++;
			}
		} while (guess != random); // While the users guess doesn't equal the random guess
		System.out.println();
		System.out.println("You guessed the correct number in " + count + " guesses ");
		input.close();
	}
}
