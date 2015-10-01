//Greg Maka

import javax.swing.*;

public class StudentIDArray
{
	public static void main(String[] args)
	{
		int[] studentID = {0000, 1111, 2222, 3333, 4444, 5555, 6666, 7777, 8888, 9999};
		String[] firstName = {"Jim", "Greg", "Danielle", "Jacob", "Penelope", "Bruce", "Oswald", "Harvey", "Phish", "Edward"};
		double[] gpa = {3.24, 4.00, 2.34, 2.00, 3.12, 1.23, 3.44, 3.89, 2.89, 2.75};
		
		String user = "";
		int id;
		int index = -1;
		boolean found = false;
		while(!found)
		{
		user = JOptionPane.showInputDialog(null, "Please enter Student ID: ");
		id = Integer.parseInt(user);
		
		for (int i=0; i < studentID.length; i++)
		{
			if (studentID[i] == id)
			{
				found = true;
				index = i;
			}
			
			
		}
		
		if(!found)
		{
			JOptionPane.showMessageDialog(null, "You entered ID " + user + "\n" + "Please Enter a Valid ID Number");
		}  
		else
		{
			System.out.println("First Name: " + firstName[index] + "\nStudent ID: " + studentID[index] + " \nGrade Point Average: " + gpa[index]);
		}
		}
	}
}