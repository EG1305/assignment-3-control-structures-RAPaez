// Ricardo Paez Assignment 2, Challenge 10: CoinToss

import java.util.Scanner;
import java.util.Random;
public class CoinToss {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int tosses; // User enters amount of tosses
		boolean isHeads; // The coin 
		int heads = 0; // Number of heads
		int tails = 0; // Number of tails
		
		// Prompting the user to enter the number of coin tosses
		System.out.println("How many coin tosses do you need?");
		tosses = input.nextInt();
		
		System.out.println("Now I will toss the coin " + tosses + " times.");
		
		
		// Flips the coin the amount user specified 
		for (int i=0; i<tosses; i++) {
			isHeads = random.nextBoolean(); // Randomly assigns a boolean value
			if (isHeads) {
				System.out.println("Toss: heads");
				heads++; // Adds to the heads value
			}
			else {
				System.out.println("Toss: tails");
				tails++; // Adds to the tails value
			}
		}
		// Prints the amount of heads and tails gotten
		System.out.println("Heads facing up: " + heads);
		System.out.println("Tails facing up: " + tails);
		
		input.close();
		
		
	}
}
