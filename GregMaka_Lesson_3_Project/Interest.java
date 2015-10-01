// Greg Maka CIS163AA 

// Also formatted to display number 2 decimal places

import javax.swing.*;
import java.util.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;


public class Interest
	{
		private static double initialCash;
		public static void main(String[] args)
			{
				setInitialCash();
				getInitialCash();
				calculateInterest(initialCash);
				System.out.println("Initial Investment of " + initialCash + " dollars.");
				System.out.println("Interest earned on initial investment will" +
				                   " yield " + calculateInterest(initialCash) + " dollars interest.");
			}
		public static void setInitialCash()
			{
				System.out.println("What is your initial investment?");
				Scanner enter = new Scanner(System.in);
				initialCash = enter.nextDouble();
			}
		public static double getInitialCash()
			{
				return initialCash;
			}
		public static double calculateInterest(double initialCash)
			{
				final double RATE = 0.05;
				final int TERM = 1;
				return ((initialCash * RATE) * TERM);
			}
	}