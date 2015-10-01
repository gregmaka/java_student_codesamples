//Greg Maka

import java.util.Scanner;
import java.text.DecimalFormat;

public class Coffee
	{
		public static int menuSelection;
		public static final int AMERICAN_CODE = 1;
		public static final int EXPRESSO_CODE = 2;
		public static final int LATTE_CODE = 3;
		public static double firstBill = 0;
		public static double secondBill = 0;
		public static double thirdBill = 0;
		public static final double AMERICAN = 1.99;
		public static final double EXPRESSO = 2.50;
		public static final double LATTE = 2.15;
		public static void main(String[] args)
			{
				firstMenuSelection();
				secondMenuSelection();
				thirdMenuSelection();
				System.out.println("Your total bill is $" + String.format("%.2f", firstBill + secondBill + thirdBill));
				System.exit(0);
			}
		public static void displayMenu()
			{
				System.out.println("Please select menu item by number, enter 0 to exit");
				System.out.println("----------------------------------");
				System.out.println("(1) American                 $" + AMERICAN);
				System.out.println("(2) Espresso                 $" + String.format( "%.2f", EXPRESSO));
				System.out.println("(3) Latte                    $" + LATTE);
				System.out.println("----------------------------------");
				Scanner enter = new Scanner(System.in);
				menuSelection = enter.nextInt();
			}
         
         
		public static double firstMenuSelection()
			{
				displayMenu();
            
            switch (menuSelection) {
            case AMERICAN_CODE:
                  firstBill = firstBill + AMERICAN;
                  break;
            case EXPRESSO_CODE: 
                 firstBill = firstBill + EXPRESSO;
                 break;
            case LATTE_CODE:
                 firstBill = firstBill + LATTE;
                 break;
           default:
                 firstBill = 0;
                 break;
                 }
                 
  				System.out.println("Your selection will cost $" + String.format( "%.2f", firstBill));
				return firstBill;
			}
         
         
         
		public static double secondMenuSelection()
			{
				displayMenu();
            
				switch (menuSelection) {
            case AMERICAN_CODE:
                  secondBill = secondBill + AMERICAN;
                  break;
            case EXPRESSO_CODE: 
                 secondBill = secondBill + EXPRESSO;
                 break;
            case LATTE_CODE:
                 secondBill = secondBill + LATTE;
                 break;
           default:
                 secondBill = 0;
                 break;
                 }
                 
				System.out.println("Your selection will cost $" + String.format( "%.2f", secondBill));
				return secondBill;
			}
		public static double thirdMenuSelection()
			{
				displayMenu();
            
            switch (menuSelection) {
            case AMERICAN_CODE:
                  thirdBill = thirdBill + AMERICAN;
                  break;
            case EXPRESSO_CODE: 
                 thirdBill = thirdBill + EXPRESSO;
                 break;
            case LATTE_CODE:
                 thirdBill = thirdBill + LATTE;
                 break;
           default:
                 thirdBill = 0;
                 break;
                 }
                 
            System.out.println("Your selection will cost $" + String.format( "%.2f", thirdBill));
				return thirdBill;
			}
	}
