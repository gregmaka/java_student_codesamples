// Greg Maka CIS163AA 

// Also formatted totalCost to display number 2 decimal places

import javax.swing.*;
import java.util.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;


public class DogBoarding
	{
		public static void main(String[] args)
			{
				double costPerPound = .50;
				int weight;
				int totalDays;
				Scanner enter = new Scanner(System.in);
				System.out.println("Dogs weight? >> ");
				weight = enter.nextInt();
				enter.nextLine();
				System.out.println("How many days will your dog stay?   ");
				totalDays = enter.nextInt();
				enter.nextLine();
				double dailyCost = costPerPound * weight;
				double totalCost = dailyCost * totalDays;
            

				JOptionPane.showMessageDialog(null, "Total cost will be $" + String.format( "%.2f", totalCost ) + " Dollars");
			}
	}