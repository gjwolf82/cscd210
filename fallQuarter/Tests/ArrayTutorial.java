public class ArrayTutorial {

   public static void main(String[] args) {
   
      int[] nums = {2, 4, 6 ,8, 10};
      
      int x = nums[2];
   
      for (int ix = 0; ix < nums.length; ix++) {
         System.out.print(nums[ix] + ", ");
      }
      int y = 13;
      
      nums[2] = y;
      
      int count = 2;
      
      for (int ix = 0; ix < nums.length; ix++) {
         nums[ix] = nums[ix] * count;
         count = count * count;
      }
      for (int ix = 0; ix < nums.length; ix++) {
         System.out.print(nums[ix] + ", ");
      }
      
      int[] sortMe = {5, 0, 13, -3, 9, 1};
      
      int ix, cursor, lowest, temp;
      
      for (ix = 0; ix < sortMe.length; ix++) {
         lowest = ix;
         for (cursor = ix; cursor < sortMe.length; cursor++) {
            if (sortMe[cursor] < sortMe[lowest]) {
               lowest = cursor;
            }
         }
         temp = sortMe[lowest];
         sortMe[lowest] = sortMe[ix];
         sortMe[ix] = temp;
      }
      System.out.println();
      for (ix = 0; ix < sortMe.length; ix++) {
         System.out.print(sortMe[ix] + ", ");
      }
   }
}