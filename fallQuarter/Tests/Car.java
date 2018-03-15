public class Car {

   private String make;
   private String model;
   private int year;
   private String color;
   
   //DVC
   Car() {
      this.make = "";
      this.model = "";
      this.year = 0;
      this.color = "";
   }
   
   //EVC
   Car(String mk, String md, int yr, String clr) {
      this.make = mk;
      this.model = md;
      this.year = yr;
      this.color = clr;
   }
   
   
   public double getValue() {
      double val = 0;
      if (this.make.equals("Ford")) {
         val = 1000;
      }else if (this.make.equals("Chevy")) {
         val = 2000;
      }else {
         val = 3000;
      }
      
      if (this.year < 1960) {
         val = val * 2;
      }else if (this.year < 1990) {
         val = val * .6;
      }else {
         //nothing
      }
      return val;
   }
   
   
   public void setYear(int yr) {
      if (yr >= 1900 && yr < 2018) {
      this.year = yr;
      }
   }
   
   public int getYear() {
      return this.year;
   }
   
   
   @Override
   public String toString() {
      return "Car: \nMake: " + this.make + " Model: " + this.model + " \nYear: " + this.year + " Color: " + this.color;
   }

}