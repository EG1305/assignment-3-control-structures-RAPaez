// Ricardo Paez Assignment 2, Challenge 9: Pin Check

import java.util.Scanner;
public class PINCheck {
	public static void main(String[] args) {
		
		// Creating a Scanner object to read user input
		Scanner input = new Scanner(System.in);
		int originalPIN; // Stores the users real PIN
		int confirmedPIN; // users input of PIN
		
		//Prompt the user to set their PIN
		System.out.println("Please enter your PIN");
		originalPIN = input.nextInt();
		
		// Loop until the user enters the correct PIN
		System.out.println("Please confirm your PIN");
		do {
			confirmedPIN = input.nextInt();
			if (confirmedPIN != originalPIN){
				System.out.println("Incorrect PIN. Try again");
				System.out.println("Enter your PIN");
			}
		} while (confirmedPIN != originalPIN);
		
		// If the correct PIN is entered
		System.out.println("PIN accepted. You can access your account");
		input.close();
	}
}
