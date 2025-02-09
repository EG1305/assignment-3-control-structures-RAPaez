// Ricardo Paez Assignment 2, Challenge 5: Sum Of Numbers
public class MultiplesOfTen {
	public static void main(String[] args) {

		// sets the line point at every 100, or every 10 numbers
		int linePoint = 100;
		// Stopping the loop at 1000, starting from 10, and incrementing by 10
		for (int i = 10; i<=1000; i+= 10){

			// Printing the number
			System.out.print(i);

			// Formats the output to only have 10 numbers in each line
			if (i % linePoint == 0) {
				System.out.println();
			} else {
				// Adding space to the numbers for visibility
				System.out.print(" ");
			}
		}
	}
}
