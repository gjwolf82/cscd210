//Gabrielle Wolf
//CSCD 210
//This program makes the user input their name and their weight and through a if statement it tells them a prompt.
import java.util.*;

public class Selections2Wolf {

   public static void main(String[] args) {
   
      Scanner kb = new Scanner(System.in);
      String name;
      int weight;
      
      System.out.print("Enter your name: ");
      name = kb.nextLine();
      
      System.out.print("Enter your weight: ");
      weight = kb.nextInt();
      
      if (weight > 200) {//If weight is over 200
         System.out.println(name + " time to think about a diet.");
      }else if (weight < 100) {//If weight is under 100
         System.out.println(name + " time to hit the buffet.");
      }else {//if neither then it runs this
         System.out.println(name + " nothing to see here, carry on.");
      }  
   }
}