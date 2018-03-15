package cscd210Methods;

import java.util.Scanner;

public class CSCD210Lab8Methods {

   public static int readNum(final Scanner kb){
      if(kb == null){
         throw new IllegalArgumentException("Scanner error");
      }
      
      int num;
      do{
         System.out.print("Enter a positive integer: ");
         num = kb.nextInt();
      }while(num < 0);
      kb.nextLine();
      return num;
   }
   
   public static int menu(final Scanner kb) {
      if(kb == null) {
         throw new IllegalArgumentException("Scanner error");
      }  
      
      int choice;
      do{
         System.out.println("Menu choice are: ");
         System.out.println("1) Add a value to the array");
         System.out.println("2) Delete a value from the array (by value)");
         System.out.println("3) Delete a value from the array (by location)");
         System.out.println("4) Display the array");
         System.out.println("5) Compute the mean of the array");
         System.out.println("6) Compute the median of the array");
         System.out.println("7) Compute the midpoint of the array");
         System.out.println("8) Compute the standard deviation of the array");
         System.out.println("9) Quit");
         System.out.print("Enter your choice: ");
         choice = kb.nextInt();
      }while(choice < 1 || choice > 9);
      
      return choice;
   }

}