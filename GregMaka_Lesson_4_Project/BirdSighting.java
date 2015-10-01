// Greg Maka CIS163AA 

import java.util.Calendar;
import java.util.GregorianCalendar;

public class BirdSighting
	{
		private String birdSeen;
		private int numberSeen;
		private GregorianCalendar dateSeen;
		public BirdSighting()
			{
				birdSeen = "Robin";
				numberSeen = 1;
				dateSeen = new GregorianCalendar(0, 12, 1);
			}
		public BirdSighting(String bird, int seen, int year, int month, int dayOfMonth)
			{
				birdSeen = bird;
				numberSeen = seen;
				dateSeen = new GregorianCalendar(year, month, dayOfMonth);
			}
		public int getDateSeen()
			{
				return dateSeen.get(Calendar.DAY_OF_YEAR);
			}
		public String getBirdSeen()
			{
				return birdSeen;
			}
		public int getNumberSeen()
			{
				return numberSeen;
			}
	}