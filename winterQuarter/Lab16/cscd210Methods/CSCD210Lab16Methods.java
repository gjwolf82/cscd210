package cscd210Methods;

import java.util.Scanner;
import cscd210Enums.*;

public class CSCD210Lab16Methods {

   //Method for fill array
   public static Month[] fillArray(final Scanner fin, final int total){
      if(fin == null || total < 1)
         throw new IllegalArgumentException("Error in Scanner or Total");
         
      Month[] array = new Month[total];
      for(int x = 0; x < array.length; x++){
         String res = fin.nextLine();
         array[x] = Month.valueOf(res.substring(0,3).toUpperCase());
      }
      return array;
   }
   
   //Method for Print Array
   public static void printArray(final Month[] array){
      if(array == null || array.length < 1)
         throw new IllegalArgumentException("Error in array");
         
      for(int x = 0; x < array.length; x++){
         System.out.print(array[x] + ",");
      }
      System.out.println(array[array.length - 1] + "\n");
   }
   
   //Method for getMonth
   public static Month getMonth(final String str){
      if(str == null || str.isEmpty())
         throw new IllegalArgumentException("Error in String");
         
      return Month.valueOf(str);
   }
   
   //Method for the menu
   public static int menu(final Scanner kb){
      if(kb == null)
         throw new IllegalArgumentException("Error in Scanner");
         
      int choice;
      do{
         System.out.println("1)Print the array to the screen");
         System.out.println("2)Sort the array by Natural Order");
         System.out.println("3)Sort the array by Total Order based on days");
         System.out.println("4)Quit");
         System.out.print("Enter a choice: ");
         choice = kb.nextInt();
         kb.nextLine();
      }while(choice < 1 || choice > 4);
      return choice;
   }
}