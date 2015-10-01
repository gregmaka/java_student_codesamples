// Greg Maka CIS163AA 

public class TestSandwich
   {
   
		public static void main(String[] args)
			{
            Sandwich initValues = new Sandwich();
            System.out.println("initially, The bread type was " + initValues.getBreadType());
            System.out.println("Initially, The main ingredient was " + initValues.getMainIngredient());
            System.out.println("Initially, The price was " + initValues.getSandwichPrice());
				Sandwich test001 = new Sandwich();
				test001.setBreadType("White");
				test001.setMainIngredient("Tuna");
				test001.setSandwichPrice(3.33);
				System.out.println("Bread type is " + test001.getBreadType());
				System.out.println("Main ingredient is " + test001.getMainIngredient());
				System.out.println("Price of sandwich is " + test001.getSandwichPrice());
			}
	}