import java.util.Scanner;
import java.io.File;
import java.utils.Arrays;

public class FileTest2 {

   public static void main(String[] args) throws Exception {
   
      File fn = new File ("LoremIpsum.txt");
      Scanner fin = new Scanner(fn);
      
      int counter = 0;
      while (fin.hasNextLine()) {
         fin.nextLine();
         counter++;
      }
      fin.close();
      
      //System.out.println(counter);
      String[] lines = new String[counter];
      
      fin = new Scanner(fn);
      counter = 0;
      while (fin.hasNextLine()) {
         lines[counter] = fin.nextLine();
         counter++;
      }
      fin.close();
      
      for (int ix = 0; ix < lines.length; ix++) {
         Systme.out.println(countWords(lines[ix]));
      }
      
   }
   
   private static int countWords(String line) { //count and return number of words in line
      Scanner sin = new Scanner(line);
      int counter = 0;
      while (sin.hasNext()) {
         sin.next();
         counter++;
      }
      return counter;
   }
   ?
   /* String test = "1345";
      String test2 = "6789";
      int test
      */
}