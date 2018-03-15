import java.util.*;

public class MenuTestTutor {
   
   public static void main(String[] args) {
   
   Scanner kb = new Scanner(System.in);
   int choice = -1;
   double num1 = 0;
   double num2 = 0;
   boolean runtime = true;
   
   System.out.println("Welcome to the menu! Please choose an option.");
   
   while (runtime) {
      displayMenu();
      choice = (int) getInput(kb);
      
      if (0>choice || choice>4) {
         System.out.println("Not a valid choice, please enter again.");  
      } else if (choice==0) {
            System.out.println("See ya later alligator");
            runtime = false;
      } else {
          
         num1 = getInput(kb);
                    
         num2 = getInput(kb);
         
         switch (choice) {
            case 1:
               //displayMenu();
               System.out.print("Answer: " + (add(num1, num2)));
               break;
            case 2:
               System.out.print("Answer: " + (minus(num1, num2)));
               break;
            case 3:
               System.out.print("Answer: " + (multiply(num1, num2)));
               break;
            case 4:
                System.out.print("Answer: " + (divide(num1, num2)));
                break;
         }
         System.out.println();    
      }    

      /*if (choice == 1) {
         System.out.print("Answer: " + (num1+num2));
      } else if (choice == 2) {
         System.out.print("Answer: " + (num1-num2));
      
      } else if (choice == 3) {
         System.out.print("Answer: " + (num1*num2));
      
      } else{
         System.out.print("Answer: " + (num1/num2));  
      }*/
   }   
   }
   
   private static void displayMenu() {
      System.out.println("1. Add");
      System.out.println("2. Subtract");
      System.out.println("3. Multiply");
      System.out.println("4. Divide");
      System.out.println("0. Quit");
      //System.out.print("Enter your choice: ");
   }
   
   private static double getInput(Scanner kb) {
      System.out.print("Enter a number: ");
      return kb.nextDouble();

   }
   
   private static double add(double num1, double num2) {
      return num1 + num2;
   }
   
   private static double minus(double num1, double num2) {
      return num1 - num2;
   }
   
   private static double multiply(double num1, double num2) {
      return num1 * num2;
   }
   
   private static double divide(double num1, double num2) {
      return num1 / num2;
   }


}