// Ricardo Paez Assignment 2, Challenge 3: Rock Paper Scissors

import java.lang.Math;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main (String[] args) {
		
		// Initializing the users input
		Scanner input = new Scanner(System.in);
		// Creating a random number from 0 to 2
		int computer;
		int human;
		

		// Loop to play rock paper scissors 10 times
		for (int i = 0; i < 10; i++)
		{
			computer = (int)(Math.random() * 3);
			// Prompting the user to enter a number
			System.out.println("Enter 0, 1, or 2");
			System.out.println("Scissors (0), Rock (1), Paper (2):");
			// Taking the users input
			human = input.nextInt();
			
			// Tie Case first
			if (human == computer)
			{
				System.out.println("Tie");
			}
			// Human win cases
			else if (human == 0 && computer == 2)
			{
				System.out.println("You Win: Scissors beats Paper");
			}
			else if (human == 1 && computer == 0)
			{
				System.out.println("You win: Rock beats Scissors");
			}
			else if (human == 2 && computer == 1){
				System.out.println("You win: Paper beats Rock");
			}
			// Computer win cases
			else if (human == 2 && computer == 0)
			{
				System.out.println("You Lose: Scissors beats Paper");
			}
			else if (human == 0 && computer == 1)
			{
				System.out.println("You Lose: Rock beats Scissors");
			}
			else if (human == 1 && computer == 2){
				System.out.println("You Lose: Paper beats Rock");
			}
		}
		input.close();
	}
}
