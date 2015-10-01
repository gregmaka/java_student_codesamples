// Greg Maka CIS163AA 

class TestBirdSighting
	{
		public static void main(String[] args)
			{
				BirdSighting test001 = new BirdSighting();
				System.out.println("Bird Species:  " + test001.getBirdSeen());
				System.out.println("Number Seen:  " + test001.getNumberSeen());
				test001.getDateSeen();
				System.out.println("Day Of Year Seen:  " + test001.getDateSeen());
				BirdSighting test002 = new BirdSighting("Blue Jay", 6, 2014, 6, 20);
				System.out.println("Bird Species:  " + test002.getBirdSeen());
				System.out.println("Number Seen:  " + test002.getNumberSeen());
				test001.getDateSeen();
				System.out.println("Day Of Year Seen:  " + test002.getDateSeen());
			}
	}