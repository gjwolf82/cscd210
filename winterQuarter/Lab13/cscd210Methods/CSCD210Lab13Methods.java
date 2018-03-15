package cscd210Methods;

import java.util.Scanner;
import java.io.PrintStream;
import cscd210Classes.Fish;

public class CSCD210Lab13Methods{
   
   //Method for Fill Array
   public static Fish[] fillArray(final Scanner fin, final int total, final int linesPer){
      if(fin == null || total <= 0 || linesPer <= 0)
         throw new IllegalArgumentException("Error in multiple parameters");
         
      Fish[] array = new Fish[total];
      for(int x = 0; x < array.length; x++){
         String temp = fin.nextLine();
         int index = temp.indexOf(',');
         String name = temp.substring(0, index);
         double weight = Double.parseDouble(temp.substring(index+2));
         array[x] = new Fish(name, weight);
      }
      return array;
   }
   
   //Method for Print Array
   public static void printArray(final Fish[] myFish, final PrintStream output){
      if(myFish == null || myFish.length <= 0 || output == null)
         throw new IllegalArgumentException("Error in one or more parameters");
         
      for(int x = 0; x < myFish.length; x++){
         output.println(myFish[x].toString());
      }
   }
   
   //Method for read Index
   public static int readIndex(final int startIndex, final int endIndex, final Scanner kb){
      if(startIndex < 0 || endIndex < 0 || endIndex < startIndex || kb == null)
         throw new IllegalArgumentException("Error in one or more parameters");
      
      int index;
      do{
         System.out.print("Enter a index number: ");
         index = kb.nextInt();
         kb.nextLine();
      }while(index <= startIndex && index >= endIndex);
      
      return index;
   }

   //Method for Menu
   public static int menu(final Scanner kb){
      if(kb == null)
         throw new IllegalArgumentException("Error in Scanner");
        
      int choice; 
      do{
         System.out.println("1)Print the array to the screen");
         System.out.println("2)Print the array to an output file");
         System.out.println("3)Read and index and check for equality");
         System.out.println("4)Quit");
         System.out.print("Enter a choice: ");
         choice = kb.nextInt();
         kb.nextLine();
      }while(choice <= 1 && choice >= 4);
      
     return choice;
   }
   
   //Method for Read Output File Name
   public static String readOutputFileName(final Scanner kb){
      if(kb == null)
         throw new IllegalArgumentException("Error in Scanner");
      
      String name;
      do{
         System.out.print("Enter a filename: ");
         name = kb.nextLine();
      }while(name.isEmpty());
      
      return name;
   }

}