// Ricardo Paez Assignment 2, Challenge 8: Summation

import java.util.Scanner;
public class Summation {
	public static void main(String[] args) {
		
		// Creating a Scanner object to read user input
		Scanner input = new Scanner(System.in);
		int sum = 0; // Keeps the added total
		int number; // Keeps the user input
		
		System.out.println("This program will add all the numbers you enter");
		System.out.println("Enter 0 for me to stop adding");
		
		do {
			// Prompts the user for a number
			number = input.nextInt();
			
			// Adds the number to the sum
			sum += number;
			
			// Displaying the entered number and total
			System.out.println("You entered " + number);
			System.out.println("The sum is " + sum);
		} while (number != 0); // Continues until the user enters 0
		
		// Displays the total
		System.out.println("The sum of all the numbers you entered is " + sum);
		input.close();
	}
}
