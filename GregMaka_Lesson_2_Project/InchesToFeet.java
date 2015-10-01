// Greg Maka CIS163AA 

public class InchesToFeet
	{
		public static void main(String[] args)
			{
				int inches = 500;
				int feet = 12;
				int totalFeet = inches / feet;
				int totalInches = inches % feet;
				System.out.println(inches + " inches is " + totalFeet + " feet " + "and " + totalInches + " inches.");
			}
	}