//Greg Maka

public class Purchase
{

	int invoiceNum = 0;
	double salePrice = 0.00;
	double tax;
	
	
	public void setInvoiceNum(int invoice)
	{
		invoiceNum = invoice;
	}
	
	public void setSalePrice(double saleAmount)
	{
		salePrice = saleAmount;
		tax = (saleAmount * .05);
	}
	
	
	public void showSale()
	{
		System.out.println("Your invoice number is: " + invoiceNum);
		System.out.println("The price of the item is: $" + salePrice);
		System.out.println("Taxes on your item is: $" + tax);
	}
}