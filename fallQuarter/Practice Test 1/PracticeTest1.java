import java.util.*;

public class PracticeTest1 {

   public static void main(String[] args) {

      Scanner kb = new Scanner(System.in);
      int num1;
      int num2;
      int num3;
      
      System.out.print("Enter a number: ");
      num1 = kb.nextInt();
      System.out.print("Enter a second number: ");
      num2 = kb.nextInt();
      System.out.print("Enter a third number: ");
      num3 = kb.nextInt();
      
      if (num1%3 == 0) {
         System.out.println(num1);
      }
      if (num2%3 == 0) {
         System.out.println(num2);
      }
      if (num3%3 == 0) {
         System.out.println(num3);
      }

   }
}