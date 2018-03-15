package cscd210Comparators;

import java.util.Comparator;
import cscd210Classes.Book;

public class BookISBNComparator implements Comparator<Book>{
   
   public int compare(final Book o1, final Book o2){
      return o1.getISBN().compareTo(o2.getISBN());
   }
}