import java.io.File;
import java.util.Scanner;

public class Question2 {

   public static String[] readFileToArray(String fileName) throws Exception {
      File file = new File(fileName);
      int count = 0;
      if (file.exists() && file.canRead()) {
         Scanner fin = new Scanner(file);
         while (fin.hasNextLine()) {
            count++;
            fin.nextLine();
         }
         String[] whatever = new String[count];
         fin.close();
         fin = new Scanner(file);
         count = 0;
         while (fin.hasNextLine()) {
            whatever[count] = fin.nextLine();
            count++;
         }
         
         fin.close();
      }else {
         throw new Exception();
      }
      return whatever;
   }
   
   public static void writeArrayToFile(String fileName, String[] contents) throws Exception {
      File file = new File(fileName);
      if (file.canWrite()) {
         PrintWriter writer = new PrintWriter(file);
         for (int ix = 0; ix < contents.length; ix++) {
            writer.println(contents[ix]);
         }
      }else {
         throw new Exception();
      }
   }
}