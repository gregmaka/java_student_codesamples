// Greg Maka CIS163AA 

import java.util.Calendar;
import java.util.GregorianCalendar;


public class BirdSighting2
	{
		private String birdSeen;
		private int numberSeen;
		private GregorianCalendar dateSeen;
		public BirdSighting2(int year, int month, int dayOfMonth)
			{
				birdSeen = "Robin";
				numberSeen = 1;
				this.dateSeen = new GregorianCalendar(year, month, dayOfMonth);
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