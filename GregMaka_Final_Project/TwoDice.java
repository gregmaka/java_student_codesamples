/* Greg Maka
   CIS163AA - Java Programming: Level I - Class # 14239
   MEID: GRE2150350
*/

public class TwoDice {
    public static void main(String[ ] args) { 

        Die firstDie = new Die( );
        Die secondDie = new Die( );

        System.out.println("First die is " + firstDie.getValue( ));
        System.out.println("Second die is " + secondDie.getValue( ));
    }
}