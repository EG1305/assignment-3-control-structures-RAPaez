// Ricardo Paez Assignment 2 - Speed Detector 2

import javax.swing.JOptionPane;

public class SpeedDetector2 {
	public static void main(String[] args) {

		// Assigning variables
		String input;
		int speed;

		// Getting the users speed through the input dialog
		input = JOptionPane.showInputDialog("Please enter your speed:");
		speed = (Integer.parseInt(input));

		// Printing out the users speed
		JOptionPane.showMessageDialog(null, "Your speed is " + speed);

		// Shows a warning message only if the speed is greater than 60
		if (speed > 60) {
			JOptionPane.showMessageDialog(null, "Slow down! drive safe.", "Ticket Warning",
					JOptionPane.WARNING_MESSAGE);
		}
		// Congratulates the driver if they are going at least 60 or below 
		else {
			JOptionPane.showMessageDialog(null, "Congratulations! You are a safe driver.");
		}

	}
}
