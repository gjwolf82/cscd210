//Gabrielle Wolf
//CSCD 210
import java.util.Comparator;

public class AreaSort implements Comparator<RegularPolygon> {

   public int compare(RegularPolygon as1, RegularPolygon as2) {
      Double a1 = as1.getArea();
      Double a2 = as2.getArea();
      return a1.compareTo(a2);
   }
}