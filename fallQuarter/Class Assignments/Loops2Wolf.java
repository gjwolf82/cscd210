//Gabrielle Wolf
//CSCD 210
//This program will use different while loops to print out different number patterns

import java.util.*;

public class Loops2Wolf {
   
   public static void main(String[] args) {
      
      
      int num1 = 0;
      while (num1 <= 10) {//This will print out the numbers from 0-10
         System.out.println(num1);
         num1 = num1+1;
      }
      
      
      System.out.println();
      
      
      int num2 = 10;
      while (num2 <= 20) {//This will print out the numbers from 10-20 by 3's
         System.out.println(num2);
         num2 = num2+3;
      }
      
      
      System.out.println();
      
      
      int num3 = 20;
      while (num3 >= 10) {//This will print out the munbers from 20-10 by 2's
         System.out.println(num3);
         num3 = num3-2;
      }
      
      System.out.println();
      
      
      int num4 = 1;
      while (num4 <=100) {//This will print out the numbers 1-100 by 11's
         if (num4%11==0) {
            System.out.println(num4);
         }
         num4++;
      }
      
   }
}