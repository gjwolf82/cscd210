
package cscd210Utils;

import cscd210Utils.SortUtils;

public class IntStatisticsUtils {
   
   //Method to compute the Mean
   public static double computeMean(final int[] myArray){
      if(myArray == null || myArray.length <= 0)
         throw new IllegalArgumentException("Array error");
      
      double sum = 0;
      for(int x = 0; x < myArray.length; x++){
         sum+=myArray[x];
      }
      
      return sum/myArray.length;
   }
   
   //Method to print the results
   public static void printResults(final String type, final double result){
      if(type == null || type.isEmpty())
         throw new IllegalArgumentException("Type error");
      
      System.out.println(type + " " + result);
   }
   
   //Method to compute the Median
   public static double computeMedian(final int[] myArray){
      if(myArray == null || myArray.length <= 0)
         throw new IllegalArgumentException("Array error");
      
      SortUtils.selectionSort(myArray);
      int middle = myArray.length/2;
      if(myArray.length%2 == 1){
         return myArray[middle];
      }else{
         return (myArray[middle-1] + myArray[middle]) / 2;
      }
   }
   
   //Method to compute the Midpoint
   public static double computeMidpoint(final int[] myArray){
      if(myArray == null || myArray.length <= 0)
         throw new IllegalArgumentException("Array error");
         
      double results = 0;
      for (int x = 0; x < myArray.length; x++) {
         SortUtils.selectionSort(myArray);
         results = myArray[0] + myArray[myArray.length-1] / 2;
      }
      return results;   }
   
   //Method to compute the Standard Deviation
   public static double computeStdDev(final int[] myArray){
      if(myArray == null || myArray.length <= 0)
         throw new IllegalArgumentException("Array error");
      
      double sd = 0;
      for(int x = 0; x < myArray.length; x++){
        sd = sd + Math.pow(myArray[x] - IntStatisticsUtils.computeMean(myArray), 2);
      }
      double standardDev = Math.sqrt(sd/(myArray.length-1));
      return standardDev;
   }


}