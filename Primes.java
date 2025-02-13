// Ricardo Paez Assignment 2, Challenge 16: Primes

import java.util.Scanner;
import java.util.ArrayList;
public class Primes {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int number; // Will hold the user entered number
		ArrayList<Integer> allPrimes = new ArrayList<>(); // Creates an ArrayList to easily hold all the prime numbers less than the number
		int count = 0; // Counter for the number of primes, initialized at zero
		
		// Prompts the user to enter a number
		System.out.println("Enter a number. The System will find all the prime number smaller than this number.");
		number = scanner.nextInt();
		
		for (int i = 2; i < number; i++) { // Loop for checking all the prime numbers, doesn't consider anything under 2
			if (isPrime(i)) { // If the number is prime
				allPrimes.add(i); // Add to the list
				count++; // Add to the count
			}
		}
		
		for (int i = 0; i<allPrimes.size(); i++) { // Prints out the primes in the list
			System.out.print(allPrimes.get(i) + "\t"); // Gives each number space
			if (i % 10 == 0 && i != 0) { // Makes Columns of ten numbers each row
				System.out.println();
			}
		}
		
		System.out.println("\nThere are a total of " + count + " prime numbers"); // Prints out the total number of primes
		
		scanner.close();
	}
	
	public static boolean isPrime(int num) { // Method for checking if the number given is prime
		if (num == 2) { // edge case for 2
			return true;
		}
		if (num % 2 == 0) { // Gets rid of all even numbers
			return false;
		}
		for (int i = 3; i <= Math.sqrt(num); i+=2) { // Checks all the odd numbers
			if (num % i == 0 ) {
				return false;
			}
		}
		return true; // Default case
	}
	
}
