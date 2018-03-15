import java.util.*;

public class SelectionTest {
   public static void main(String[] args) {
   
      Scanner kb = new Scanner(System.in);
      
      System.out.print("Enter a number: ");
      int val1 = kb.nextInt();
      
      System.out.print("Enter a second number: ");
      int val2 = kb.nextInt();
      
      System.out.print("Enter a third number: ");
      int val3 = kb.nextInt();
      
      int small = Math.min(val1, val2);
      int reallySmall = Math.min(small, val3);
      System.out.println(reallySmall + " is the smallest.");
      
      /*int reallySmall = Math.min(Math.min(val1, val2), val3);
      System.out.println(reallySmall + " is the smallest.");*/

      
      
     /* if (val1 < val2 && val1 < val3) { 
        System.out.println(val1 + " is the smallest number.");
      } else if (val2 < val1 && val2 < val3) { 
        System.out.println(val2 + " is the smallest number.");
      } else if (val3 < val2 && val3 < val1) { 
        System.out.println(val3 + " is the smallest number.");
      } else if (val1 == val2 && val1 < val3) {
         System.out.print(val1 + " and " + val2 + " are both the smallest number.");
      } else if (val1 == val2 && val1 == val3) {
      
      }*/
      
      /*if (val1 < val2) {
         System.out.println(val1 + " is less than " + val2);
      } else if (val2 < val1) {
         System.out.println(val2 + " is less than " + val1);
      } else {
         System.out.println(val2 + " is the same as " + val1);
      }*/
   } 
}