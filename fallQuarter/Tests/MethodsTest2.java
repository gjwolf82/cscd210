public class MethodsTest2 { 
   
   public static void main(String[] args) {

      System.out.println(isPrime(1));
      System.out.println(isPrime(2));
      System.out.println(isPrime(3));
      System.out.println(isPrime(6));
      System.out.println(isPrime(12));



   }
   
   public static boolean isPrime(int num) {
      boolean prime = true;
      if (num ==1) {
         prime = false;
         return prime;
      }
      
      for (int factor = 2; factor < Math.sqrt(num); factor++) {
         if (num % factor == 0) {
            return false;
         }
         
      }
      return true;
   } 
}