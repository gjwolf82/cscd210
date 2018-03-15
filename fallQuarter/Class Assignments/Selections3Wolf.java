//Gabrielle Wolf
//CSCD 210
//This program asks for a user to input a color and it goes through an if statement to see what type of it is.
import java.util.*;

public class Selections3Wolf {
   
   public static void main(String[] args) {
   
      Scanner kb = new Scanner(System.in);
      
      System.out.print("Enter a color: ");
      String color = kb.nextLine();
      
      if (color.equals("Red") || color.equals("Blue") || color.equals("Yellow")) {//.equals is for Strings
         System.out.println();
         System.out.println(color + " is a primary color.");//Prints out for Red, Blue or Yelllow
      } else if (color.equals("Purple") || color.equals("Green") || color.equals("Orange")) {
         System.out.println();
         System.out.println(color + " is a seconday color.");//Prints out for Purple, Green, or Orange
      } else if (color.equals("Brown")) {
         System.out.println();
         System.out.println(color + " is tertiary color.");//Prints for Brown
      }else {
         System.out.println();
         System.out.println(color +" I'm not sure how to make this");//Prints if none of them match
         System.out.println("but its a lovely color.");
      }   
   }
}