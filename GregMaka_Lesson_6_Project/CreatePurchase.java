//Greg Maka

import java.util.Scanner;

public class CreatePurchase
{
	
	public static void main(String[] args)
	{
		int invoice;
		double saleAmount;
		
		invoice = 0;
		saleAmount = 0.00;
		
		Purchase sold = new Purchase();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your invoice number");
		invoice = input.nextInt();
		
		
		while ((invoice < 1000) || (invoice > 8000))
		{
			System.out.println("You entered an invalid number.");
			System.out.println("Please enter a number between 1000 and 8000");
			invoice = input.nextInt();
		
		}
		
		System.out.println("Please enter the sale amount: ");
		saleAmount = input.nextDouble();
		
		while (saleAmount < 0)
      {
         System.out.println("You entered an invalid number."); 
         System.out.println("Please enter a number greater than 0.");
         saleAmount = input.nextDouble();
			
			
      }
		  
		sold.setInvoiceNum(invoice);
        	sold.setSalePrice(saleAmount);
        	sold.showSale();
		
	}

}