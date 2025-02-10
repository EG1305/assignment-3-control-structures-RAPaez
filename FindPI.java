// Ricardo Paez Assignment 2, Challenge 13: Find PI

import java.util.Scanner;
public class FindPI {
	public static void main(String[] args) {
		
		long timeNow; // Will be used to track the amount of time spent on the calculation
		Scanner scanner = new Scanner(System.in);
		int iterations; // User input of the iterations
		boolean symbol = true; // Plus or minus switch
		int denominator = 2; // Adding 2 to each operation after the first
		double pi = 0.0; // Will hold the value of pi/4
		
		// Promts the user to enter a int for the amount of iterations
		System.out.println("This program will iteatively find the digits of PI using the Leibniz formula");
		System.out.println("How many iterations should we use? Please enter an integer");
		iterations = scanner.nextInt();
		
		timeNow = System.currentTimeMillis(); // Current time before calculation
		for (int i = 0; i < iterations; i++) { // Goes the amount the user specifies
			if (symbol) { // If positive, add
				pi += 1.0/ (denominator * i + 1);
			}
			else { // If negative, subtract
				pi -= 1.0/ (denominator * i +1);
			}
			symbol = !symbol; // Changes the symbol each iteration
		}
		pi *=4; // Multiplies to PI
		System.out.println("PI = " + pi);
		System.out.println("After " +  iterations + " iterations");
		System.out.println("This operation took " + (((double)System.currentTimeMillis() - timeNow) / 1000.0) +" seconds.");
		scanner.close();
	}
}
