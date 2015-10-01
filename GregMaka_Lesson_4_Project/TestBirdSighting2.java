// Greg Maka CIS163AA 

class TestBirdSighting2
	{
		public static void main(String[] args)
			{
				BirdSighting2 test003 = new BirdSighting2(2015, 6, 1);
				System.out.println("Bird Species:  " + test003.getBirdSeen());
				System.out.println("Number Seen:  " + test003.getNumberSeen());
				test003.getDateSeen();
				System.out.println("Day Of Year Seen:  " + test003.getDateSeen());
			}
	}