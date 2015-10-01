/* Greg Maka
   CIS163AA - Java Programming: Level I - Class # 14239
   MEID: GRE2150350
*/

public class Service
{
   String description;
   double price;
   int minutes;
   
   public Service(String d, double p, int m)
   {
      description = d;
      price = p;
      minutes = m;
   }
   
   public String getDescription()
   {
      return description;
   }
   
   public double getPrice()
   {
      return price;
   }
   
   public int getMinutes()
   {
      return minutes;
   }
}