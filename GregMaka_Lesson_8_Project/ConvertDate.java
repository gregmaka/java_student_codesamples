//Greg Maka

import javax.swing.*;
import java.util.*;
public class ConvertDate
{
	public static void main(String[] args)
	{
		//JOptionPane.showInputDialog(null,"")
		String date = "";
		String monthNum = "";
		String monthDay = "";
		String year = "";
		int one;
		int two;
		int m; //month
		int d; //day
		int y; //year
		int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		
		date = JOptionPane.showInputDialog(null, "Please enter the date");
		
		one = date.indexOf("/");
		
		monthNum = date.substring(0, one);
		date = date.substring(one + 1,  date.length() - one + 1);
		one = date.indexOf("/");
		monthDay = date.substring(0, one);
		year = date.substring(one + 1, date.length());
		
		m = Integer.parseInt(monthNum);
		d = Integer.parseInt(monthDay);
		y = Integer.parseInt(year);
		
		
		if ((m >= 1) && (m < 12))
		{
			
			if ((d > 1) && (d <= daysInMonth[m-1]))
			{
				GregorianCalendar calendar = new GregorianCalendar(y, m-1, d);
				
		
		
				int dayOfYear = calendar.get(GregorianCalendar.DAY_OF_YEAR);
		
				JOptionPane.showMessageDialog(null,"Date is " + month[m-1] + " " + d + ", " + y + "\nDay in the year is: " + dayOfYear);
			}
			else 
			{
				System.out.println("Please enter a valid date");
			}
			
		}
		
		else 
		{
			System.out.println("Please enter a valid date");
		}
	
		
	}
}