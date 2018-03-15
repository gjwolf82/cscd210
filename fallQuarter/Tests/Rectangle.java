public class Rectangle {

   private double width;
   private double length;
   
   //DVC
   Rectangle() {
      this.width=1;
      this.length=1;
   }
   
   //EVC
   Rectangle(double w, double l) {
      this.width = w;
      this.length = l;
   }

   public double getArea() {
      return this.length * this.width;
   }
   
   public String toString() {
      return "Rectangle of area: " + getArea();
   }
}