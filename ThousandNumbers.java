// Ricardo Paez Assignment 2, Challenge 4: Thousand Numbers
public class ThousandNumbers {
	public static void main(String[] args) {
		
		int number = 1;
		int numbersPerLine = 10;
		// Stopping the loop at 1000, starting from 1
		while (number <= 1000) {
			
			// Printing the number
			System.out.print(number);
			
			// Formats the output to only have 10 numbers in each line
			if (number % numbersPerLine == 0){
				System.out.println();
			}
			else {
				// Adding space to the numbers for visibility 
				System.out.print(" ");
			}
			// Incrementing the number
			number++;
		}
	}
}
