import java.io.File;
import java.util.Scanner;

public class FileTest {

   public static void main(String[] args) throws Exception{
   
      File file = new File("LoremIpsum.txt");
      if (file.exists() && file.canRead()) {
         Scanner fin = new Scanner(file);
         
         while (fin.hasNext()) {
            String st = fin.nextLine();
            out(st);
         }
         
         fin.close();
      }
   }
   
   public static void out(String st) {
      System.out.println(st);
   }
}