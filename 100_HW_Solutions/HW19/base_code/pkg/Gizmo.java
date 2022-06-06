package pkg;

public class Gizmo
{ 
   String maker;
   boolean isEl;
   double cost;
   
   public Gizmo() {
      maker = "apple";
      isEl = true;
      cost = 29.99;
   }
   
   public Gizmo(String maker, boolean isEl) {
      this.maker = maker;
      this.isEl = isEl;
      cost = 29.99;
   }
   public Gizmo(String maker, boolean isEl, double cost) {
      this.maker = maker;
      this.isEl = isEl;
      this.cost = cost;
   }
   
   public String toString()
   {
   	return "" + this.getMaker() + " " + this.isElectronic() + " " + this.cost;
   }
   
   public boolean isElectronic() {
      return this.isEl;
   }
   public String getMaker() {
      return maker;
   }
   
   public double getPrice() {
      return cost;
   }
}
