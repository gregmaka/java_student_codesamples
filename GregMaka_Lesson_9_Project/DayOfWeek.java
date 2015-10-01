//GReg Maka

import java.util.Scanner;

public class DayOfWeek {
	private DaysOfTheWeek days;	
	
	enum DaysOfTheWeek {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	};

	public static void main(String[] args) {
		int d = -1;
		
		do {
		System.out.println("Choose a day of the week to get our business hours: ");
		for (DaysOfTheWeek days : DaysOfTheWeek.values()) {
			System.out.print(days + " ");
		}
		
		Scanner input = new Scanner(System.in);
		String day = "";
				
		System.out.println();
		day = input.nextLine().toUpperCase();
		
		for (DaysOfTheWeek days : DaysOfTheWeek.values()) {
			if (day.equals(days.toString()))
				d = days.ordinal();
		} 
		
		String hours = "\nBusiness hours are from ";

		if (d == 0) {
			System.out.println(hours + "11am to 5pm.");
		} 
		else if (d > 0 && d < 6) {
			System.out.println(hours + "9am to 9pm.");
		} 
		else if (d == 6) {
			System.out.println(hours + "10am to 6pm.");
		} 
		else {
			System.out.println("Invalid day. Please choose one of the seven days.\n");
		}
		} while (d < 0 || d > 6);
		
	}

}