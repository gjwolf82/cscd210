//Gabrielle Wolf
//CSCD 210
//This program will ask the user to input their name and age. If their age is over 40 it will print out "You are very old" with their name.

import java.util.*;

public class Selections1Wolf {
   
   public static void main (String[] args) {
      
      Scanner kb = new Scanner(System.in);
      String name;
      int age;
      
      System.out.print("Enter your name: ");
      name = kb.nextLine();//nextLine for String
      
      System.out.print("Enter your age: ");
      age = kb.nextInt();//nextInt for Integers
      
      if (age>40) {//age is greater than 40
         System.out.println(name+ " you are very old!");
      }  
   }
}