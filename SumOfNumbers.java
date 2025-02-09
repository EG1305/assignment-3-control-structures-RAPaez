// Ricardo Paez Assignment 2, Challenge 6: Sum Of Numbers

import java.util.Scanner;
public class SumOfNumbers {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int number;
		int sum = 0;
		
		// Prompts the user to enter a number
		System.out.println("This program will add all the numbers from 1 to the number you enter");
		System.out.println("Please enter a number: ");
		number = input.nextInt();
		// Prints out the number entered
		System.out.println("You entered " + number);
		
		// Finds the sum of 1 to the users entered number
		for (int i = 1; i <= number; i++){
			sum += i;
		}
		
		// Prints out the sum
		System.out.println("The sum of all numbers from 1 to " + number + " is " + sum);
		input.close();
	}
}
