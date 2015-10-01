// Greg Maka CIS163AA 

import javax.swing.*;

public class InchesToFeetInteractive
	{
		public static void main(String[] args)
			{
				int inches;
				int feet = 12;
				String length;
				length = JOptionPane.showInputDialog(null, "Enther inches", "TOTAL INCHES", JOptionPane.QUESTION_MESSAGE);
				inches = Integer.parseInt(length);
				int totalFeet = inches / feet;
				int totalInches = inches % feet;
				JOptionPane.showMessageDialog(null, inches + " inches is " + totalFeet + " feet " + "and " + totalInches + " inches.", "TOTAL FEET AND INCHES", JOptionPane.PLAIN_MESSAGE);
			}
	}