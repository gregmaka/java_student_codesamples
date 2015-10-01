/* Greg Maka
   CIS163AA - Java Programming: Level I - Class # 14239
   MEID: GRE2150350
*/

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MadLib {

	public static void main(String[] args) {
   
   int doOver;
   
		do{
      
      String word1;
		String word2;
		String word3;
		String word4;
		String word5;
      String word6;      
		
		Scanner word = new Scanner(System.in);
		
		System.out.print("Enter a noun: ");
		word1 = word.next();
		System.out.print("Enter another noun: ");
		word2 = word.next();
		System.out.print("Enter a color: ");
		word3 = word.next();
		System.out.print("Enter yet another noun: ");
		word4 = word.next();
		System.out.print("Enter one more noun: ");
		word5 = word.next();
      System.out.print("Enter one more noun: ");
		word6 = word.next();
		
		System.out.println("\nMary had a little " + word1);
		System.out.println("Its " + word2 + " was " + word3 + " as snow");
		System.out.println("And everywhere that Mary " + word4);
		System.out.println("The " + word5 + " was sure to go.");
            
    doOver = JOptionPane.showConfirmDialog(null, "Do you want to play again?","Continue?",JOptionPane.YES_NO_OPTION);
         
      
      }while(doOver == JOptionPane.YES_OPTION);
	}  
 }