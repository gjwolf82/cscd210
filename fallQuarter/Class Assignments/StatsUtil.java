public class StatsUtil {

   public static double mean(int[] a) throws Exception{
      if (a.length == 0) {
         throw new Exception();
      }
      double total = 0.0;
      for (int ix = 0; ix < a.length; ix++) {
         total+= a[ix];
      }
      return total / a.length;
   }
}