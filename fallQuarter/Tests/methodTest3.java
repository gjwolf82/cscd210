import java.util.Random;

public class methodTest3 {

   public static void main(String[] args) {
      
      double[] nums = new double[100];
      populateNums(nums);
      displayArray(nums);
      System.out.println(meanArray(nums));
      double[] newNums = cloneArray(nums);
      newNums[0] = 668;
      System.out.println(nums[0]);
      System.out.println(newNums[0]);
   }
   
   private static double[] cloneArray(double[] n) {
      double[] n2 = new double[n.length];
      for (int ix = 0; ix < n.length; ix++) {
         n2[ix] = n[ix];
      }
      return n2;
   }
   
   private static void populateNums(double[] n) {
       Random rng = new Random();
      for (int ix=0; ix < n.length; ix++) {
         (n[ix]) = rng.nextDouble();
      }
   }
   
   private static void displayArray(double[] n) {
      for (double cell: n) {
         System.out.print(cell + ", ");
      }
      System.out.println();
   }
   
   private static double meanArray(double[] n) {
      double sum = 0;
      for (double cell: n) {
         sum += cell;
      }
      return sum / n.length;
   }
   
}