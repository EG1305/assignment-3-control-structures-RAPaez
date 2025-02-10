// Ricardo Paez Assignment 2, Challenge 12: Rice Chessboard

import java.math.BigInteger; // Holds large values 
public class RiceChessboard {
	public static void main(String[] args) {
		
		java.math.BigInteger rice = new java.math.BigInteger("1"); // First rice on square 1;
		for (int i = 1; i <= 64; i++){ // Iterates till the number of squares 
			System.out.println(rice + " rice on square " + i);
			rice = rice.multiply(BigInteger.TWO); // Multiplies the rice by 2 each iteration
		}
	}
}
