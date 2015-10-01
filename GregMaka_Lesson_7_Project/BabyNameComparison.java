//Greg Maka

import java.util.Scanner; 

public class BabyNameComparison { 

public static void main(String[] args){ 

   Scanner userInputScanner = new Scanner(System.in); 
   System.out.print("Enter 1st Name "); 
   String name1 = userInputScanner.nextLine(); 
   System.out.print("Enter 2nd Name "); 
   String name2 = userInputScanner.nextLine(); 
   System.out.print("Enter 3rd Name "); 
   String name3 = userInputScanner.nextLine(); 
   
   System.out.println(name1 + " - " + name2); 
   System.out.println(name1 + " - " + name3); 
   System.out.println(name2 + " - " + name1); 
   System.out.println(name2 + " - " + name3); 
   System.out.println(name3 + " - " + name2);
   System.out.println(name3 + " - " + name1);
   } 
} 
