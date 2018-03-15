package cscd210Methods;

import java.util.Scanner;

public class CSCD210Lab9Methods{

   //Method for Read Name
   public static String readName(final Scanner kb){
      if(kb == null) 
         throw new IllegalArgumentException("Scanner object is bad");
      
      String name;
      do{
         System.out.print("Please enter the name of the player: ");
         name = kb.nextLine();
         System.out.println();
      }while(name.isEmpty());
      
      return name;
   }
   
   //Method for Go Again
   public static boolean goAgain(final Scanner kb){
      if(kb == null) 
         throw new IllegalArgumentException("Scanner object is bad");
      
      String again = "";
      do{
         System.out.print("Want to run the program again? ");
         again = kb.nextLine();
         System.out.println();
      }while(!(again.equalsIgnoreCase("yes")) && !(again.equalsIgnoreCase("no")));
      
      return again.equalsIgnoreCase("yes");
   }
   
   //Method for Read Word
   public static String readWord(final Scanner kb,final String name){
      if(kb == null || name == null || name.isEmpty())
         throw new IllegalArgumentException("Error in either Scanner or Name");
      
      String word;  
      do{
         System.out.print("Please enter the word to be guessed: ");
         word = kb.nextLine();
         System.out.println();
      }while(word.length() < 5);
      
      return word;
   }
   
   //Method dor Convert Word to Array
   public static char[] convertWordToArray(final String theWord){
      if(theWord == null || theWord.isEmpty())
         throw new IllegalArgumentException("Error in the word");
         
      int length = theWord.length();
      char[] array = new char[length];
      for(int x = 0; x < array.length; x++){
         array[x] = theWord.charAt(x);
      }
      
      return array;
   }

}