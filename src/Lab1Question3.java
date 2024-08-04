/*-------------------------------------------
// Course: COMP 155
// Last Name: Singh
// First Name: Rajveer
// Student ID: 300202522
// 
// File: Lab1Question3.java

// Summary: Calculates and outputs the number of gallons and
 * 			quarts needed for a painting job that requires 18
 * 			quarts in total (without amounting for gallons)
			 
*-------------------------------------------*/
import javax.swing.JOptionPane;

public class Lab1Question3 {

	public static void main(String[] args) {
		
		// There are always only 4 quarts in a gallon
		final int QUARTS_IN_GALLON = 4;
		
		// The number of quarts needed for a painting job
		int quartsNeeded = 18;
		
		// Calculating and outputting the number of gallons and quarts needed for the job
		JOptionPane.showMessageDialog(null,"A job that needs 18 quarts requires " + quartsNeeded / 4
						   + " gallons plus " + quartsNeeded % 4 + " quarts");
		
	}
}
