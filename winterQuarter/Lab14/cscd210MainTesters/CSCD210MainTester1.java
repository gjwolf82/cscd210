package cscd210MainTesters;

import java.util.Scanner;
import cscd210Utils.SortUtils;
import cscd210Classes.Rational;

public class CSCD210MainTester1{

   public static void main(String [] args){
      //This main will test the code extensively
      
      Rational [] array = {new Rational(), new Rational(1997, 9281997), new Rational(-5, 2), new Rational(12, 24), new Rational(-983,-5), new Rational(985,55)};
                           
      for(Rational r: array)
         System.out.println("The Rational Number is " + r);
         
      System.out.println();
      System.out.println("Add Method:");
      
      for(int x = 0; x < array.length; x++){
         for(int y = 1; y < array.length; y++){
            Rational addRational = array[x].add(array[y]);
            System.out.print("Adding " + array[x] + " to " + array[y] + " is ");
            System.out.println(addRational);
         }
      }
      
      System.out.println();
      System.out.println("Reciprocal Method: ");
      
      for(int x = 0; x < array.length; x++){
         Rational recRational = array[x].reciprocal();
         System.out.print("The reciprocal of " + array[3] + " is ");
         System.out.println(recRational);
      }
      
      System.out.println();
      System.out.println("toString Method:");
      
      for(int x = 0; x < array.length; x++){
         System.out.println(array[x].toString()); 
      }
      
      System.out.println();
      System.out.println("Equals Method: ");
      
      for(int x = 0; x < array.length; x++){
         for(int y = 1; y < array.length; y++){
            if(array[x].equals(array[y]))
               System.out.println("Rational " + array[x] + " is equal to Rational " + array[y]); 
            else
               System.out.println("Rational " + array[x] + " is NOT equal to Rational " + array[y]); 
          }
      }
      
      System.out.println();
      System.out.println("hashCode Method:");
      
      for(int x = 0; x < array.length; x++){
         System.out.println(array[x].hashCode());
      }
      
      System.out.println();
      System.out.println("compareTo Method:");
      
      for(int x = 0; x < array.length; x++){
         for(int y = 1; y < array.length; y++){
            int res = array[x].compareTo(array[y]);
            if(res < 0){
               System.out.println(array[x] + " is less than " + array[y]);
            }else if(res > 0){
               System.out.println(array[x] + " is greater than "+ array[y]);
            }else{
               System.out.println("They are equal");
            }
         }
         System.out.println();
      }
   }
}