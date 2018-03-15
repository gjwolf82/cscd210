public class twoDArrays {

   public static void main(String[] args) {

      int[] nums1 = {5,1,5,0,9};
      int[] nums2 = {8,1,4};
      int[] nums3 = {9};
      
      int[][] nums = {nums1, nums2, nums3};
      
      displayArray(nums);
      System.out.println(sumArray(nums));
   }
   
   private static int sumArray(int[][] a) {
      int total = 0;
      for (int rix = 0; rix < a.length; rix++) {
        for (int cix = 0; cix < a[rix].length; cix++) {
            System.out.print(a[rix][cix] + " ");
            total += a[rix][cix];
         } 
        System.out.println();
      }
      return total;
   }
   
   private static void displayArray(int[][] a) {
      for (int rix = 0; rix < a.length; rix++) {
         for (int cix = 0; cix < a[rix].length; cix++) {
             System.out.print(a[rix][cix] + " ");
         } 
         System.out.println();
      }
   }
}