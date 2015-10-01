//Greg Maka

// with part A and B additional requirments

import java.util.Scanner;
import java.text.DecimalFormat;

public class CondoSales2
	{
		public static final double PARKVIEW_PRICE = 150000.00;
		public static final double GOLFVIEW_PRICE = 170000.00;
		public static final double LAKEVIEW_PRICE = 210000.00;
		public static final double GARAGE = 5000.00;
      public static final double GRANITE = 4000.00;
      public static final double EXPEDITE = 2000.00;
		public static final String park = "You selected the Park View Condo with a sales price of ";
		public static final String golf = "You selected the Golf View Condo with a sales price of ";
		public static final String lake = "You selected the Lake View Condo with a sales price of ";
		public static final String invalidSelection = "You selected an INVALID response, sales price is set to ";
		static int condoSelection;
		static double salesPrice;
		static int parking;
      static int granite;
      static int expedite;
		static double condoAndParking;
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
				if (invalidResponse != true)
					{
						System.out.println("Please select a parking space: \n1 - Garage\n2 - Parking Space: ");
					}
               
				parking = enter.nextInt();
				boolean invalidParking = (parking > 2 || parking < 0);
				if (parking == 1)
					{
						salesPrice = salesPrice + GARAGE;
						System.out.println("The price of condo with garage is " + String.format( "%.2f", salesPrice ));
					}
				else if (parking == 2)
					{
						salesPrice = salesPrice;
						System.out.println("The price of condo with parking space is " + String.format( "%.2f", salesPrice ));
					}
				else if (invalidParking == true)
					{
						System.out.println("You have selected an INVALID response.");
						System.out.println("The price of condo with no garage is " + String.format( "%.2f", salesPrice ));

					}
               if (invalidParking != true)
					{
						System.out.println("Select type of countertops \n1 - Granite\n2 - Non-Granite ");
					}

               
            granite = enter.nextInt();
            
				boolean invalidGranite = (granite > 2 || granite < 0);
				if (granite == 1)
					{
						salesPrice = salesPrice + GRANITE;
						System.out.println("The price of condo with granite is " + String.format( "%.2f", salesPrice ));
					}
				else if (granite == 2)
					{
						salesPrice = salesPrice;
						System.out.println("The price of condo without granite is " + String.format( "%.2f", salesPrice ));
					}
				else if (invalidGranite == true)
					{
						System.out.println("You have selected an INVALID response.");
					}
               
               if (invalidParking != true)
					{
						System.out.println("Expedited construction? \n1 - Yes\n2 - No ");
					}


               
               expedite = enter.nextInt();
            
				boolean invalidExpedite = (granite > 2 || granite < 0);
				if (granite == 1)
					{
						salesPrice = salesPrice + EXPEDITE;
						System.out.println("The price of condo with expedited construction " + String.format( "%.2f", salesPrice ));
					}
				else if (granite == 2)
					{
						salesPrice = salesPrice;
						//System.out.println("" + String.format( "%.2f", salesPrice ));
					}
				else if (invalidGranite == true)
					{
						System.out.println("You have selected an INVALID response.");
					}


               
			}
	}