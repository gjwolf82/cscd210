//Gabrielle Wolf
//CSCD 210
import java.util.Comparator;

public class PerimeterSort implements Comparator<RegularPolygon> {

   public int compare(RegularPolygon rp1, RegularPolygon rp2) {
      Double p1 = rp1.getPerimeter();
      Double p2 = rp2.getPerimeter();
      return p1.compareTo(p2); 
   }
}