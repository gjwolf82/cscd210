// 2/1 * 2/3 * 4/3 * 4/5 * 6/5 * 6/7

import java.util.*;

public class ClassExample {

   public static void main(String[] args) {
      
      double total = 1;
      for (int num = 2; num <= 10000000; num+=2) {
         double factor1 = num/(num-1.0);
         double factor2 = num/(num+1.0);
         total *= factor1 * factor2;
      }
      System.out.println(total*2);


   }
}