// Greg Maka CIS163AA 

// with modification

import java.util.*;
import javax.swing.*;


public class Dollars
	{
		public static void main(String[] args)
			{
            double money;
		      String input;
		
		      input = JOptionPane.showInputDialog("Enter the total amount of cash you have ","ENTER MONEY");
		      money = Double.parseDouble(input);
				int noTwenty = (int) money / 20;
				System.out.println("You have " + noTwenty + " twenty dollar bill(s).");
				double balanceAfterTwenty = money - (noTwenty * 20);
				int noTen = (int) balanceAfterTwenty / 10;
				System.out.println("You have " + noTen + " ten dollar bill(s).");
				double balanceAfterTen = money - ((noTwenty * 20) + (noTen * 10));
				int noFive = (int) balanceAfterTen / 5;
				System.out.println("You have " + noFive + " five dollar bill(s).");
				double balanceAfterFive = money - ((noTwenty * 20) + (noTen * 10) + (noFive * 5));
				int noOne = (int) (balanceAfterFive / 1);
				System.out.println("You have " + noOne + " one dollar bills.");
			}
	}