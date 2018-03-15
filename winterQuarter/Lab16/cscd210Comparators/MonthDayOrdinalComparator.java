package cscd210Comparators;

import java.util.Comparator;
import cscd210Enums.*;

public class MonthDayOrdinalComparator implements Comparator<Month>{

   public int compare(final Month m1, final Month m2){
      if(m1 == null || m2 == null)
         throw new IllegalArgumentException("Error in Month");
         
      int res = m1.getDays() - m2.getDays();
      if(res != 0){
         return res;
      }
      
      return m1.ordinal() - m2.ordinal();
   }

}