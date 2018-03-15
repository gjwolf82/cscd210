//Gabrielle Wolf
//CSCD 210
//This program will also be used as tools for future use

package Utils;
public class StatsUtil {

   public static double mean(int[] arr) throws Exception{//Mean Integer
      if (arr.length == 0) {
         throw new Exception();
      }
      double total = 0.0;
      for (int ix = 0; ix < arr.length; ix++) {
         total+= arr[ix];
      }
      return total / arr.length;
   }
   
   
   public static double mean(double[] arr) throws Exception{//Mean Double
      if (arr.length == 0) {
         throw new Exception();
      }
      double total = 0.0;
      for (int ix = 0; ix < arr.length; ix++) {
         total+= arr[ix];
      }
      return total / arr.length;
   }
   
   
   public static double median(double[] arr) throws Exception{//Median Double
      if (arr.length == 0) {
         throw new Exception();
      }
      double results = 0;
      for (int ix = 0; ix < arr.length; ix++) {
         ArrayUtils.selectionSort(arr[ix]);
         if (arr.length%2 == 0) {
            results = arr[arr.length/2] + arr[arr.length/2 -1];
         }else {
            results = arr[arr.length/2];
         }
      }
      return results;
   }
   
   
   public static double median(int[] arr) throws Exception{//Median Integer
      if (arr.length == 0) {
         throw new Exception();
      }
      double results = 0;
      for (int ix = 0; ix < arr.length; ix++) {
         ArrayUtils.selectionSort(arr[ix]);
         if (arr.length%2 == 0) {
            results = arr[arr.length/2] + arr[arr.length/2 -1];
         }else {
            results = arr[arr.length/2];
         }
      }
      return results;
   }
   
   public static double midpoint(int[] arr) throws Exception{//Midpoint Int
      if (arr.length == 0) {
         throw new Exception();
      }
      double results = 0;
      for (int ix = 0; ix < arr.length; ix++) {
         ArrayUtils.selectionSort(arr[ix]);
         results = arr[0] + arr[arr.length-1] / 2;
      }
      return results;  
   }
   
   
   
   public static double midpoint(double[] arr) throws Exception{//Midpoint Double
      if (arr.length == 0) {
         throw new Exception();
      }
      double results = 0;
      for (int ix = 0; ix < arr.length; ix++) {
         ArrayUtils.selectionSort(arr[ix]);
         results = arr[0] + arr[arr.length-1] / 2;
      }
      return results;  
   }
   
   
   public static int[] mode(int[] arr) throws Exception{//Mode Int
      if (arr.length == 0) {
         throw new Exception();
      }
      int[] vals = new int[arr.length];
      int[] count = new int[arr.length];
      int[] results = new int[0];
      int valsix = -1;
      
      for (int ix = 0; ix< arr.length; ix++) {
         int foundix = -1;
         for (int check = 0; check <= valsix; check++) {
            if (vals[check] == arr[ix] ) {
               foundix = check;
            }
         }
         if (foundix != -1) {
            count[foundix]++;
         }else {
            valsix++;
            vals[valsix] = arr[ix];
            count[valsix]++;
         }
      }
      int largest = 0;
      for (int ix = 0; ix <= valsix; ix++) {
         if (largest < count[ix]) {
            largest = count[ix];
         }
      }
      for (int ix = 0; ix <= valsix; ix++) {
         if ( largest == count[ix]) {
            //ArrayUtils.push(results, vals[ix]);
         }
      }
      return results;
   }
   
   
    public static double[] mode(double[] arr) throws Exception{//Mode Double
      if (arr.length == 0) {
         throw new Exception();
      }
      double[] vals = new int[arr.length];
      double[] count = new int[arr.length];
      double[] results = new int[0];
      int valsix = -1;
      
      for (int ix = 0; ix< arr.length; ix++) {
         int foundix = -1;
         for (int check = 0; check <= valsix; check++) {
            if (vals[check] == arr[ix] ) {
               foundix = check;
            }
         }
         if (foundix != -1) {
            count[foundix]++;
         }else {
            valsix++;
            vals[valsix] = arr[ix];
            count[valsix]++;
         }
      }
      int largest = 0;
      for (int ix = 0; ix <= valsix; ix++) {
         if (largest < count[ix]) {
            largest = count[ix];
         }
      }
      for (int ix = 0; ix <= valsix; ix++) {
         if ( largest == count[ix]) {
            //ArrayUtils.push(results, vals[ix]);
         }
      }
      return results;
   }
   
   
   public static double standardDeviation(int[] arr) {//Standard Deviation Integer
      if (arr.length == 0) {
         //throw new Exception();
      }
      double total = 0.0;
      double sum = 0;
      double standDev = 0;
      for (int ix = 0; ix < arr.length; ix++) {
         total+= arr[ix];
         double mean = total / arr.length;
         for (ix = 0; ix < arr.length; ix++) {
            arr[ix] =(arr[ix -= mean])*(arr[ix -= mean]);
            if (ix <= arr.length) {
               sum += arr[ix];
               ix++;
            }
            double nums = sum / arr.length -1;
            standDev = Math.sqrt(nums);   
         }
      }
      return standDev;
   }
   
    public static double standardDeviation(double[] arr) {//Standard Deviation Double
      if (arr.length == 0) {
         //throw new Exception();
      }
      double total = 0.0;
      double sum = 0;
      double standDev = 0;
      for (int ix = 0; ix < arr.length; ix++) {
         total+= arr[ix];
         double mean = total / arr.length;
         for (ix = 0; ix < arr.length; ix++) {
            arr[ix] =(arr[ix -= mean])*(arr[ix -= mean]);
            if (ix <= arr.length) {
               sum += arr[ix];
               ix++;
            }
            double nums = sum / arr.length -1;
            standDev = Math.sqrt(nums);   
         }
      }
      return standDev;
   }
}