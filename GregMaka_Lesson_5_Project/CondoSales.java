//Greg Maka

import java.util.Scanner;
import java.text.DecimalFormat;

public class CondoSales
	{
		public static final double PARKVIEW_PRICE = 150000.00;
		public static final double GOLFVIEW_PRICE = 170000.00;
		public static final double LAKEVIEW_PRICE = 210000.00;
		public static final String park = "You selected the Park View Condo with a sales price of $";
		public static final String golf = "You selected the Golf View Condo with a sales price of $";
		public static final String lake = "You selected the Lake View Condo with a sales price of $";
		public static final String invalidSelection = "You selected an INVALID response, sales price is set to $";
		static int condoSelection;
		static double salesPrice;
      //String formattedNumber = String.format("%,d", salesPrice);
      
		public static void main(String[] args)
			{
				Scanner enter = new Scanner(System.in);
				System.out.println("Please enter your condominium selection:\n1 - Park View\n2 - Golf " +
				                   "Course View\n3 - Lake View");
				condoSelection = enter.nextInt();
				boolean invalidResponse = (condoSelection > 3 || condoSelection < 0);
            
            
				if (condoSelection == 1)
					{
						salesPrice = PARKVIEW_PRICE;
						System.out.println(park + String.format( "%.2f", salesPrice ));
					}
				else if (condoSelection == 2)
					{
						salesPrice = GOLFVIEW_PRICE;
						System.out.println(golf + String.format( "%.2f", salesPrice ));
					}
				else if (condoSelection == 3)
					{
						salesPrice = LAKEVIEW_PRICE;
						System.out.println(lake + String.format( "%.2f", salesPrice ));
					}
				else if (invalidResponse)
					{
						salesPrice = 0;
						System.out.println(invalidSelection + String.format( "%.2f", salesPrice ));
					}
			}
	}