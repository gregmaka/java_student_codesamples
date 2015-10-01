//Greg Maka

import javax.swing.*;
public class ConstructID
{
	public static void main(String[] args)
	{
		String name = "";
		String userId = "";
		String address = "";
		
		int x; //length
		int y; //
		char c;
		
		name = JOptionPane.showInputDialog(null, "Please enter your full name");
		address = JOptionPane.showInputDialog(null, "Please enter your address");
		x = 0;
		y = 0;
		userId += Character.toUpperCase(name.charAt(x));
		
		while(x < name.length())
		{	
			
			if(name.charAt(x) == ' ')
			{
				
				userId += Character.toUpperCase(name.charAt(x + 1));
			}
			++x;
		}
		
		while(Character.isDigit(address.charAt(y)))
		{
			
			userId += address.charAt(y);
			y++;
		}
		
		JOptionPane.showMessageDialog(null,"Your new ID is: " + userId);
		
	}
}