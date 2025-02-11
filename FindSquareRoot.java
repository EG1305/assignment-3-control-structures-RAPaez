// Ricardo Paez Assignment 2, Challenge 14: Find Square Root

import java.util.Scanner;
public class FindSquareRoot {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int number; // Number user enters to be rooted
		double lastGuess = 1.0; // Last number to compare to 
		double nextGuess = 1.0; // Next number to compare to last number
		int iterations = 0; // Number of iterations the loop will go through
		
		
		// Prompting the user to enter the number that we will find the square root of
		System.out.println("The program will find the square root of a number");
		System.out.println("Enter a positive integer");
		number = scanner.nextInt(); // Takes the next int value from user
		
		// Runs at least once
		do {
			lastGuess = nextGuess; // Makes the last guess the previous guess
			nextGuess = (lastGuess + number / lastGuess) / 2; // Finds the square root of a number
			iterations++; // Adds to the iteration
			
		} while (Math.abs(nextGuess - lastGuess) > .000001); // While the absolute difference between nextGuess and lastGuess is greater than .000001
		
		// Prints out the finished root, with the number of iterations
		System.out.println("The square root of " + number + " is " + nextGuess);
		System.out.println("The program found the result in " + iterations + " iterations");
		scanner.close(); // Closing the scanner
	}
}
