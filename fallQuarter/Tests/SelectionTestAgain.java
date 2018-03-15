import java.util.*;

public class SelectionTestAgain {

   public static void main(String[] args) {
     
     int sum = 0;
     int counter = 1;
     while (counter <= 1000) {
         if (counter % 5 ==0 || counter % 7 == 0) {
            sum = sum+counter;
         }
         counter++;
     }
     System.out.println(sum);
     
     
     
     
     
     
     
      /*double total = 0;
      int den = 1;
      int sign = 1;
      for (int num=1; num<=10000000; num++) {
         total += 4.0/den*sign;
         den += 2;
         sign *= -1;
      }
      System.out.println(total);*/
   }
}