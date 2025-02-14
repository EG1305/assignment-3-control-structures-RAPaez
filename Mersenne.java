// Ricardo Paez Assignment 2, Challenge 17: Mersenne

import java.util.ArrayList;
import java.util.Scanner;
public class Mersenne {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int number; // Will hold the user entered number
		ArrayList<Integer> allPrimes = new ArrayList<>(); // Creates an ArrayList to easily hold all the prime numbers less than the number
		int count = 0; // Counter for the number of primes, initialized at zero
		
		// Prompts the user to enter a number
		System.out.println("Enter a number. The System will find all Mersenne primes smaller than this number.");
		number = scanner.nextInt();
		
		for (int i = 2; Math.pow(2, i) -1 < number; i++) { // Loop for checking possible Mersenne Primes
			int mersenne = (int) Math.pow(2,i) -1; // Holds the possible Mersenne prime to check
			if (isPrime(mersenne)) { // If the number is prime
				allPrimes.add(mersenne); // Add to the list
				count++; // Add to the count
			}
		}
		
		for (int i = 0; i<allPrimes.size(); i++) { // Prints out the primes in the list
			System.out.print(allPrimes.get(i) + "\t"); // Gives each number space
			if (i % 10 == 0 && i != 0) { // Makes Columns of ten numbers each row
				System.out.println();
			}
		}
		
		System.out.println("\nThere are a total of " + count + " Mersenne prime numbers"); // Prints out the total number of primes
		
		scanner.close();
		
	}
	
	public static boolean isPrime(int num) { // Method for checking if the number given is prime
		if (num <= 2) { // edge case for 2
			return false;
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
