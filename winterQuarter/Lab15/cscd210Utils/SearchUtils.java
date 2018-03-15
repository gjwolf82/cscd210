package cscd210Utils;

import cscd210Classes.Book;

public class SearchUtils{

   //Method for Linear Search
   public static int linearSearch(final Comparable[] array, final Comparable target){
      if(array == null || array.length < 1 || target == null)
         throw new IllegalArgumentException("Error in array or target");
      
      for(int x = 0; x < array.length; x++){
         if(array[x].equals(target)){
            return x;
         }
      }
      return -1;
   }
   
   //Method for Binary Search
   public static int binarySearch(final Comparable[] array, final Comparable target){
      if(array == null || array.length < 1 || target == null)
         throw new IllegalArgumentException("Error in array or target");
      
      int min = 0;
      int max = array.length;
      int mid;
      do{
         mid = (min + max)/2;
         if(array[mid].compareTo(target) < 0){
            max = mid-1;
         }else if(array[mid].compareTo(target) > 0){
            min = mid + 1;
         }else{
            return mid;
         }
      }while(min <= max);
      return -1;
   }
}