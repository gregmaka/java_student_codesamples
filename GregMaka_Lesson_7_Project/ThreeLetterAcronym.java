//Greg Maka

import javax.swing.*;

public class ThreeLetterAcronym
{
	public static void main(String[] args)
	{
		String word = "";
		String acronym = "";
		
		int x; //length
		int y; //
		char c;
		word = JOptionPane.showInputDialog(null, "Please enter 3 words");
		int count = 1;
		x = 0;
		acronym += Character.toUpperCase(word.charAt(x));
		
		while(x < word.length())
		{	
			
			if(word.charAt(x) == ' ' && count < 3)
			{
				count++;
				acronym += Character.toUpperCase(word.charAt(x + 1));
				
			}
			++x;
			
			
		}
		
		if (count != 3)
		{
			JOptionPane.showMessageDialog(null,"Please use 3 words ");
		}
		else
		{
		JOptionPane.showMessageDialog(null,"Your 3 letter acronym is: " + acronym);
		}
		
	}
}