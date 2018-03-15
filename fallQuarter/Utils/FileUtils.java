import java.util.Scanner;
import java.io.File;
import java.io.PrintStream;
import java.util.Random;

public class FileUtils {

   
   public static void arrayToFile(double[] a, java.lang.String fname) {
      Random rng = new Random();
      File fn = new File("nums.txt");
      PrintStream fout = new PrintStream(fn);      
      fout.close();
   }
   
   
   
   public static void arrayToFile(int[] a, java.lang.String fname) {
      Random rng = new Random();
      File fn = new File("nums.txt");
      PrintStream fout = new PrintStream(fn);      
      fout.close();
   }
   
   
   
   public static void arrayToFile(String[] a, java.lang.String fname) {
      Random rng = new Random();
      File fn = new File("nums.txt");
      PrintStream fout = new PrintStream(fn);      
      fout.close();
   }
   
   
   
   public static int countRecords(java.util.Scanner fin) {
      int counter = 0;
      while (fin.hasNextLine()) {
         fin.nextLine();
         counter++;
      }
      fin.close();
      return counter;
   }
   
   
   
   public static java.io.File fileFactory(java.lang.String filename) {
      File fn = new File();
      return fn;
      
   }
   
   
   
   public static java.lang.String[] fileToArray(java.lang.String fname) {
      Scanner scan = new Scanner(new File(filename));
      List<String> lines = new ArrayList<String>();
      while (scan.hasNextLine()) {
         lines.add(scan.nextLine());
      }
      String[] arr = lines.toArray(new String[0]);
   }
   
   
   
   public static java.io.PrintStream printStreamFactory(java.io.File file) {
      Random rng = new Random();
      File fn = new File("nums.txt");
      PrintStream fout = new PrintStream(fn);      
      fout.close();
   }
   
   
   
   public static java.io.PrintStream printStreamFactory(java.io.String fname) {
      Random rng = new Random();
      File fn = new File("nums.txt");
      PrintStream fout = new PrintStream(fn);      
      fout.close();
   }
   
   
   
   public static java.util.Scanner scannerFactory(java.io.File file) {
      Scanner scan = new Scanner(new File(filename));
      return scan;
   }
   
   
   
   public static java.util.Scanner scannerFactory(java.lang.String fname) {
      Scanner scan = new Scanner(new File(filename));
      return scan;
   }
   
   
   
   public static java.util.Scanner scannerFactoryUserInput() {
      Scanner kb = new Scanner(System.in);
      System.out.println("Enter file name here: ");
      File input = new File (kb.nextLine());
      
      return Scanner(input);
   }
}