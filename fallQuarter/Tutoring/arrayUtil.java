import java.util.Scanner;

public class arrayUtil {

   public static void main (String[] args) {

      int[] array = new int[10];
      boolean runtime = true;
      Scanner kb = new Scanner(System.in);
      int choice = -1;
      
      while (runtime) {
         System.out.println("1. Fill the array");
         System.out.println("2. Increase array size by one");
         System.out.println("3. Decrease the array by one");
         System.out.println("4. Search the array for a given value");
         System.out.println("5. Find max value");
         System.out.println("6. Find min value");
         System.out.println("7. View the array");
         System.out.println("8. Quit");
         System.out.print("Enter a choice: ");
         choice = kb.nextInt(); 
         if (choice == 1) {
            fillArray(array, kb);
         }else if (choice == 7) {
            printArray(array);
         }
      }
     
   }
   private static void fillArray(int[] array, Scanner kb) {
      for (int ix = 0; ix < array.length; ix++) {
         System.out.print("Enter a integer for position " + ix + ":");
         int temp = kb.nextInt();
         array[ix] = temp;
      }
   }
   private static void printArray(int[] array) {
      for (int ix = 0; ix< array.length; ix++) {
         System.out.print(array[ix] + ", ");
      }
      System.out.println();
   }
   
}