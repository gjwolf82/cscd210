public class Triangle {

   private double height;
   private double base;

   Triangle() {
      this.height = 1;
      this.base = 1;
   }
   
   Triangle(double h, double b) {
      this.height = h;
      this.base = b;
   
   }
   
   Triangle(double h) {
      this.height = h;
      this.base = 1;
   }
   
   public double getHeight() {
      return this.height;
   }
   
   public void setHeight(double h) {
      this.height = h;
   }
   
   public double getBase() {
      return this.base;
   }
   
   public void setBase(double b) {
      this.base = b;
   }
   
   public double getArea() {
      double area = this.height * this.base /2;
      return area;
   }
   
   @Override 
   public String toString() {
      return "Triangle \nBase: " + this.base + "\nHeight: " + this.height + "\nArea: " + this.getArea();
   }

}