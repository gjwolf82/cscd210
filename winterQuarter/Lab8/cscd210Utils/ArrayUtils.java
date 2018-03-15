
package cscd210Utils;

import java.util.Scanner;

public class ArrayUtils {
   
   //Method to create and fill the Array
   public static int[] createAndFillArray(final int num,final Scanner kb){
      if(num <= 0 || kb == null)
         throw new IllegalArgumentException("Error in num");
      
      int[] arr = new int[num];
      
      for(int x =0; x < arr.length; x++){
         System.out.print("Enter a number to fill the Array: ");
         arr[x] = kb.nextInt();
      }
      
      return arr;
   }
   
   //Method for adding a number to a array
   public static int[] addNum(final int[] myArray,final Scanner kb){
      if(kb == null || myArray == null || myArray.length <= 0)
         throw new IllegalArgumentException("Error in Scanner or Array");
      
      int[] temp = new int[myArray.length+1];
      int num;
      
      for (int x = 0; x < myArray.length; x++) {
         temp[x] = myArray[x];
      }
      System.out.print("Enter a number: ");
      num = kb.nextInt();
      
      temp[myArray.length] = num;
      return temp;
   }
   
   //Method for deleting a value from the array
   public static int[] deleteValue(final int[] myArray,final Scanner kb){
      if(kb == null || myArray == null || myArray.length <= 0)
         throw new IllegalArgumentException("Error in Scanner or Array");
         
      System.out.print("Enter a value you want deleted: ");
      int num = kb.nextInt();
      kb.nextLine();
      
      int count = 0;
      
      for (int x = 0; x < myArray.length; x++) {
         if (myArray[x] == num) {
            count++;
         }
      }
      int[] temp = new int[myArray.length-count];
      count = 0;
      
      for (int x = 0; x < myArray.length; x++) {
         if (myArray[x] == num) {
            count++;
         }else{
            temp[x - count] = myArray[x];
         }
      }
      return temp;
      
   }
   
   //Method for deleting a value from the array by Index Value
   public static int[] deleteValueByIndex(final int[] myArray,final Scanner kb){
      if(kb == null || myArray == null || myArray.length <= 0)
         throw new IllegalArgumentException("Error in Scanner or Array");
      
      int index;
      do{
         System.out.print("Enter a index value: ");
         index = kb.nextInt();
      }while(index < 0 || index > myArray.length-1);
      
      int[] temp = new int[myArray.length-1];
      int curser = 0;
      
      for(int x = 0; x < temp.length; x++) {
         if(x == index) {
            curser = 1;
         }
         temp[x] = myArray[x + curser];
      }
      return temp;
   }
   
   //Method to print out the Array
   public static void printArray(final int[] myArray){
      if(myArray == null || myArray.length <= 0)
         throw new IllegalArgumentException("Error in Array");
      
      for(int x: myArray){
         System.out.println(x);
      }
   }
}