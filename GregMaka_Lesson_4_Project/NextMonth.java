// Greg Maka CIS163AA 

import java.util.Calendar;
import java.util.GregorianCalendar;

public class NextMonth
	{
		public static void main(String[] args)
			{
				GregorianCalendar calendar = new GregorianCalendar();
				int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
				System.out.println("Today is the " + currentDay + "th day of the month.");
				System.out.println("There are " + ((calendar.get(Calendar.DAY_OF_MONTH) + 1) 
              - (calendar.getActualMaximum(Calendar.MONTH))) + " days left in the month.");
              
                           
              
            if(calendar.get(Calendar.DAY_OF_YEAR) > 172){
            
            int daysRemaining = 172 + (365 - calendar.get(Calendar.DAY_OF_YEAR));
            
            System.out.println("It's past June 21st " + calendar.get(Calendar.YEAR) + ", there are " + daysRemaining + " days until June 21st " + (calendar.get(Calendar.YEAR)+1));
            }
 			}
	}