package pkg;
import java.util.ArrayList;


public class OnlinePurchaseManager
{
   public OnlinePurchaseManager() {
      
   }
   private ArrayList <Gizmo> purchases;
   

   
   public Gizmo getCheapestGizmoByMaker( String mkr )
   {
   	
   }
   
   public boolean hasAdjacentEqualPair() {
      
   }
   
   public int countElectronicsByMaker(String mkr) {
      int count = 0;
      for (int y = 0; y < purchases.size(); y++) {
         if (purchases.getMaker().equals(mkr) && purchases.isElectronic() == true) {
            count++;
         }
      }
      return count;
   }
   
   public String toString()
   {
   	return "" + purchases;
   }
}
