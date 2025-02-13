// Ricardo Paez Assignment 2, Challenge 15: Prime Check

import java.util.Scanner;
public class PrimeCheck {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int number; // User enters number
		
		System.out.println("This program will tell you if the number you enter is prime or not");
		System.out.println("You can enter 0 anytime to stop the program");
		
		do {
			// Prompts the user to enter a number 
			System.out.println("Please enter a number");
			number = scanner.nextInt();
			
			// Will only stop if number equals zero
			if (number == 0 ) {
				System.out.println("0 is not prime");
				break;
			}
			else if (isPrime(number)) { // Calls the boolean Method
				System.out.println(number + " is prime");
			}
			else {
				System.out.println(number + " is not prime");
			}
		} while (number != 0); // Runs until broken by User
		scanner.close();
	}
	
	public static boolean isPrime(int num) { // Method for checking primes
		if (num <= 1) { // any number equal to or less than one is not a prime
			return false;
		}
		else if (num == 2) {
			return true; // 2 is a prime number
		}
		else if (num % 2 == 0) {
			return false; // Gets rid of even numbers
		}
		for (int i = 3; i <= Math.sqrt(num); i+=2) { // Checks odd numbers
			if (num % i == 0) {
				return false;
			}
		}
		return true; // If it gets to this point it is a prime number
	}
	
}