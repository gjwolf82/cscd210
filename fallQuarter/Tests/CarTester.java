public class CarTester {

   public static void main(String[] args) {
      Car auto = new Car("Chevy", "Corvette", 2012, "Red");
      auto.setYear(2014);
      System.out.println(auto.getValue());
   
      Car auto2 = new Car("Ford", "F-250", 1978, "Dirt");
      System.out.println(auto2.getValue());
   
   }


}