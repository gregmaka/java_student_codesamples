/* Greg Maka
   CIS163AA - Java Programming: Level I - Class # 14239
   MEID: GRE2150350
*/

public class FiveDice
{
	private static final int LOWEST_DIE_VALUE = 1;
	private static final int HIGHEST_DIE_VALUE = 6;
	
	public int getDieValue()
	{
	int roll = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
	return roll;
	}
	public static void main(String[] args)
	{
	FiveDice roller = new FiveDice();
   
   //computer rolls
   
      System.out.println("Computer:\n");
   
	
		int[] compRoll = new int[7];
         for (int i = 1; i < compRoll.length; i++) {
             compRoll[i] = roller.getDieValue();
             System.out.println("Die " + i + " rolled a " + compRoll[i]); 
        }
        
     //computer rolls
   
      System.out.println("\nPlayer:\n");
        
      int[] playRoll = new int[7];
         for (int i = 1; i < playRoll.length; i++) {
             playRoll[i] = roller.getDieValue();
             System.out.println("Die " + i + " rolled a " + playRoll[i]); 
        }
        
			}
}