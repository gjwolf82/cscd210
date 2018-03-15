package cscd210Methods;

import java.util.Scanner;
import java.io.*;

public class CSCD210Lab10Methods{

   //Method for Fill Array
   public static String[] fillArray(final Scanner fin, final int total){
      if(fin == null || total <= 0)
         throw new IllegalArgumentException("Error in Scanner or Total");
         
      String[] arr = new String[total];
      
      for(int x =0; x < arr.length; x++){
         arr[x] = fin.nextLine();
      }
      
      return arr;
   }

   //Method for Print Array
   public static void printArray(final String[] words, final PrintStream fout){
      if(words == null || words.length <= 0 || fout == null)
         throw new IllegalArgumentException("Array or PrintStream error");
         
      for(String s: words){
         fout.println(s);
      }
   }

}