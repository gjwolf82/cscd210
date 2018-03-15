
public class Question3 {

   public static void main(String[] args){
   
      int nums[][] = new int[5][5];
      for (int i = 0; i < nums.length; i++) {
         int sum = 0;
         for (int j = 0; j < nums[i].length; j++) {
            nums[i][j] = ((int) (Math.random() *1000));
            System.out.print(nums[i][j] + " ");
         }
         System.out.println();            
      }
      
      double rowSum = 0;
      double totalSum = 0;
      for (int i = 0; i < nums.length; i++) {
         rowSum = 0;
         for (int t = 0; t < nums[i].length; t++) {
            rowSum+=nums[i][t];
            totalSum+=nums[i][t];
         }
         System.out.println(rowSum/nums[i].length);
      }
      System.out.println(totalSum/(nums.length * nums[0].length));
   }
}