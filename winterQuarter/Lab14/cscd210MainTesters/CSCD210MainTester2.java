package cscd210MainTesters;

import java.util.Scanner;
import cscd210Utils.SortUtils;
import cscd210Classes.Rational;

public class CSCD210MainTester2{

   public static void main(String [] args){
   //This main checks all the preconditions
      Rational test = new Rational();
      
      //EVC Precondition den == 0
      Rational test2 = new Rational(1,0);
      
      //Precondition for Add
      Rational test3 = test.add(null);
      
      //Precondition for compareTo
      int res = test.compareTo(null);
   
   }
}