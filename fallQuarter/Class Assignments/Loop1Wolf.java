//Gabrielle Wolf
//CSCD 210
//Uses loops to print out different number lines
import java.util.*;

public class Loop1Wolf {

   public static void main(String[] args) {
   
      for (int num = 0; num<=10; num++) {//Prints out the number 0-10
         System.out.println(num);
      }
      
      System.out.println();
      
      for (int num = 10; num<=20; num+=3) {//Prints out the numbers 10-20 by 3's
         System.out.println(num);
      }
      
      System.out.println();
      
      for (int num = 20; num>=10; num-=2) {//Prints out the numbers 20-10 by 2's
         System.out.println(num);
      }
      
      System.out.println();
      
      for (int num = 1; num<=100; num++) {//Prints out the numbers 1-100 divisible by 11
         if(num%11==0) {
            System.out.println(num);
         }
      }   
   }
}