//Greg Maka

import java.util.Scanner;


public class Schedule {

	public static void main(String[] args) {

		String[][] courses = {
				{"CIS 110", "3:30pm","Mondays"},
				{"COM 101", "12pm","Tuesdays"},
				{"CSC 140", "8am","Wednesdays"},
				{"CSC 240", "5pm","Thurdays"},
				{"MTH 150", "10:30a","Fridays"} 	};
		
		boolean found = false;
		
		do {

			Scanner input = new Scanner(System.in);
			System.out.print("Enter a course (case-sensitive): ");
			String courseName = input.nextLine();
						
			for (int row = 0; row < courses.length; row++) {

				if (courseName.equals(courses[row][0])) {
					System.out.println("\n" + courses[row][0] + " is held weekly at " + courses[row][1] + " on " + courses[row][2]);
					found = true;
				} 
			}
			

			if (!found) {

					System.out.println("Error: course does not exist.\n");
				}
		} while (!found); 
	}
}