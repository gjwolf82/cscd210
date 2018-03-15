import java.util.*;

public class PracticeTest6 {

   public static void main(String[] args) {

      Scanner kb = new Scanner(System.in);
      int radius;
      
      System.out.print("Enter a radius: ");
      radius = kb.nextInt();
      
      double area = 3.14*(radius*radius);
      
      System.out.println(radius + " is your radius " + area + " is your area");

   }
}