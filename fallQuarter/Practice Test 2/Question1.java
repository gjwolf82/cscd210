public class Question1 {

   public static void main(String[] args){
   
      double[] nums = new double[]{2.9,4.5,7.2,1.9,9.2};
      boolean[] list = new boolean[]{true,false,true,false,true,false,true};
      
      System.out.println(getSmallest(nums));
      System.out.println(getLargest(nums));
      System.out.println(getSum(nums));
      System.out.println(getTrues(list));
   }


   public static double getSmallest(double[] arr) {
      double smallest = arr[0];
      for (int ix = 0; ix < arr.length; ix++) {
         if (arr[ix] < smallest) {
            smallest = arr[ix];
         }
      }
      return smallest;
   }
   
   public static double getLargest(double[] arr) {
      double largest = arr[0];
      for (int ix = 0; ix < arr.length; ix++) {
         if (arr[ix] > largest) {
            largest = arr[ix];
         }
      }
      return largest;
   }
   
   public static double getSum(double[] arr) {
      double total = 0.0;
      for (int ix = 0; ix < arr.length; ix++) {
         total+= arr[ix];
      }
      return total;
   }
   
   public static int getTrues(boolean[] arr) {
      int trueCount = 0;
      for(int ix = 0; ix < arr.length; ix++) {
         if (arr[ix] == true) {
            trueCount++;
         }
      }
      return trueCount;
   }

}