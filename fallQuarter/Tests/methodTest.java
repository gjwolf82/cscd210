public class methodTest {

   public static void main(String[] args) {

      int num1 = 3;
      int num2 = 1;
      int num3 = 5;
            
      System.out.println(max(num1, num2, num3));
            
      System.out.println(max(11, 7, 13, 17));
      
      double dnum1 = 8.3;
      double dnum2 = 2.7;
      double dnum3 = 5.9;
            
      System.out.println(max(dnum1, dnum2, dnum3));

   }
   
   private static int max(int a, int b, int c) {   
      return Math.max(Math.max(a, b), c);
   }
   private static int max(int a, int b, int c, int d) {   
      return Math.max(Math.max(Math.max(a, b), c), d);
   }
   private static double max(double a, double b, double c) {
      return Math.max(Math.max(a, b), c);
   }

   
}