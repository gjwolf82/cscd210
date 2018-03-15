package cscd210Utils;

import java.io.*;
import java.util.Scanner;

public class FileUtils{

   //Method for count Records
   public static int countRecords(final Scanner fin, final int linesPer){
      if(fin == null || linesPer <= 0)
         throw new IllegalArgumentException("Error in Scanner or Lines per Record");
         
      int count = 0;
      while(fin.hasNextLine()){
         fin.nextLine();
         count++;
      }
      
      if(count == 0 || count%linesPer!=0){
         throw new RuntimeException("Count of lines is 0");
      }
      return count/linesPer;
   }

   //Method for Open Input File Scanner version
   public static File openInputFile(final Scanner kb){
      if(kb == null)
         throw new IllegalArgumentException("Scanner object is null");
         
      String fileName = "";
      File inf = null;
      do{
         System.out.print("Enter a file name: ");
         fileName = kb.nextLine();
         inf = new File(fileName);
      }while(inf.exists() == false && inf.canRead() == false);
   
      return inf;
   }
   
   //Method for Open Input File for String
   public static File openInputFile(final String fileName){
      if(fileName == null || fileName == "")
         throw new IllegalArgumentException("Scanner object is bad");
         
      File inf = null;
      inf = new File(fileName);
      if(inf.canRead() == false){
      }
      
      return inf;
   }

}