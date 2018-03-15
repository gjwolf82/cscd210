//Gabrielle Wolf
//CSCD 210
//This program uses do while loops and prints out numbers with different circumstances

import java.util.*;

public class Loops3Wolf {

   public static void main(String[] args) {
   
   
      int num1 = 100;
      
      do{//Go from 100-1 by 11's
         System.out.println(num1);
         num1-=11;
      }while (num1>1);
      
      
      System.out.println();
      
      
      int num2 = 1;
      
      do{//Go from 1 to the square root of 144
         System.out.println(num2);
         num2++;
      }while (num2<=Math.sqrt(144));
      
      
      System.out.println();
      
      
      int num3 = 1;
      
      int square = num3*num3;
      
      do{//Go from 1 to 200 by square roots
         System.out.println(square);
         num3++;
         square = num3*num3;
      }while (square<=200); 
      
   }
}