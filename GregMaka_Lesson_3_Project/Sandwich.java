// Greg Maka CIS163AA 

public class Sandwich
	{
		private String mainIngredient;
		private String breadType;
		private double sandwichPrice;
      
      Sandwich()
      {
         mainIngredient = "Turkey";
         breadType = "Rye";
         sandwichPrice = 5.99;
      }
      
		public void setMainIngredient(String ingredient)
			{
				mainIngredient = ingredient;
			}
         
		public String getMainIngredient()
			{
				return mainIngredient;
			}
         
		public void setBreadType(String bread)
			{
				this.breadType = bread;
			}
         
		public String getBreadType()
			{
				return breadType;
			}
         
		public void setSandwichPrice(double price)
			{
				this.sandwichPrice = price;
			}
         
		public double getSandwichPrice()
			{
				return sandwichPrice;
			}
         
	}