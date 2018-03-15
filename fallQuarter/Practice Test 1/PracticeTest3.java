import java.util.*;

public class PracticeTest3{

   public static void main(String[] args) {

      Scanner kb = new Scanner(System.in);
      int num;
      
      System.out.print("Enter a number: ");
      num = kb.nextInt();
      
      if (num%2 == 0) {
         System.out.print(num+ " is a even number.");
      }else {
         System.out.print(num + " is a odd number.");
      }

   }
}