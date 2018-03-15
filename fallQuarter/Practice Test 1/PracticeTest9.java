public class PracticeTest9 {

   public static void main(String[] args) {

      int num = 1;
      
      while (!(num%3 == 0 && num%5 == 0 && num%7 == 0)) {
         System.out.println(num);
         num++;
      }

   }
}