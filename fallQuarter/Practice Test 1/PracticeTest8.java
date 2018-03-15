import java.util.*;

public class PracticeTest8 {

   public static void main(String[] args) {

      double num1;
      double num2;
      double num3;
      double num4;
      Scanner kb = new Scanner(System.in);
      
      System.out.print("Enter a number: ");
      num1 = kb.nextDouble();
      System.out.print("Enter a second number: ");
      num2 = kb.nextDouble();
      System.out.print("Enter a third number: ");
      num3 = kb.nextDouble();
      System.out.print("Enter a fourth number: ");
      num4 = kb.nextDouble();
      
      if (num1<num2 && num1<num3 && num1<num4) {
         System.out.println(num1);
      }
      if (num2<num1 && num2<num3 && num2<num4) {
         System.out.println(num2);
      }
      if (num3<num2 && num3<num1 && num3<num4) {
         System.out.println(num3);
      }
      if (num4<num2 && num4<num3 && num4<num1) {
         System.out.println(num4);
      }

   }
}