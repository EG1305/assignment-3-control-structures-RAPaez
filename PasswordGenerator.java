// Ricardo Paez Assignment 2, Challenge 7: Password Generator

import java.util.Scanner;
import java.util.Random;
public class PasswordGenerator {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numDigits;
		int digit;
		
		// Asks the user for the number of digits
		System.out.println("How many digits do you want to use for a numberic password?");
		numDigits = scanner.nextInt();
		
		// Create a Random object to generate random numbers
		Random random = new Random();
		
		// Making the password
		System.out.println("Your password is");
		for (int i = 0; i < numDigits; i++) {
			digit = random.nextInt(10); // Generates a random digit from 0 to 9
			System.out.print(digit + " "); // Prints the digit with a space
		}
		scanner.close();
	}
}
