/*-------------------------------------------
// Course: COMP 155
// Last Name: Singh
// First Name: Rajveer
// Student ID: 300202522
// 
// File: Lab1Question2.java

// Summary: Gets a value for number of miles from the user
 * 			and then outputs the equivalent number of inches,
 * 			feet, and yards
			 
*-------------------------------------------*/
import javax.swing.JOptionPane;

public class Lab1Question2 {

	public static void main(String[] args) {
		
		// Declaring constants to represent a mile in inches, feet, and yards
		final int INCHES_IN_MILE = 63360;
		final int FEET_IN_MILE = 5280;
		final int YARDS_IN_MILE = 1760;
		
		// Getting and storing a user value for number of miles
		// Change this
		String user_input;
		int num_miles;
		
		user_input = JOptionPane.showInputDialog(null, "Enter the number of miles");
		num_miles = Integer.parseInt(user_input);
		
		// Outputting the miles in inches, feet, and yards
		JOptionPane.showMessageDialog(null, num_miles + " miles is equivalent to "
											+ INCHES_IN_MILE * num_miles + " inches, "
											+ FEET_IN_MILE * num_miles + " miles, and "
											+ YARDS_IN_MILE * num_miles + " yards");
	}
}