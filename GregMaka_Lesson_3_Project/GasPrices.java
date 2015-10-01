// Greg Maka CIS163AA 

// Also formatted to display number 2 decimal places

import javax.swing.*;
import java.util.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;


public class GasPrices
	{
		public static void main(String[] args)
			{
				Scanner enter = new Scanner(System.in);
				System.out.println("Please enter the price of gas per barrel");
				int pricePerBarrel = enter.nextInt();
				calculateMinPricePerGallon(pricePerBarrel);
			}
		public static void calculateMinPricePerGallon(int pricePerBarrel)
			{
				double MIN = (float) (pricePerBarrel * 0.035);
				double MAX = (float) (pricePerBarrel * 0.040);
				System.out.println("If gas is " + pricePerBarrel + " dollars per barrel. The minimum at the pump " +
				                   "would be " + String.format( "%.2f", MIN ) + " per gallon and the maximum would be "
				                   + String.format( "%.2f", MAX ) + " per gallon.");
			}
	}