import java.util.*;

public class PracticeTest4 {

   public static void main(String[] args) {

      Scanner kb = new Scanner(System.in);
      int num;
      
      System.out.print("Enter your college grade number: ");
      num = kb.nextInt();
      
      switch (num) {
         case 1:
            System.out.println(num + " Freshman");
            break;
         case 2:
            System.out.println(num + " Sophmore");
            break;
         case 3:
            System.out.println(num + " Junior");
            break;
         case 4:
            System.out.println(num + " Senior");
            break;
         default:
            System.out.println("Graduate Student");
      }

   }
}