package cscd210Methods;

import java.util.Scanner;

public class CSCD210Lab7Methods {

   //Calculate BMI
   public static double calcBMI(final double height, final double weight){
      if(height <= 0 || weight <= 0)
         throw new IllegalArgumentException("Error in weight or height");
      
      return weight/(height*height)*703;
   }
   
   
   //Displays the results
   public static void displayResults(final String name, final double height, final double weight, final double bmi){
      if(name == null || name.isEmpty() || height <= 0 || weight <= 0 || bmi <= 0)
         throw new IllegalArgumentException("Error in one of these fields");
         
      if(bmi < 18.5) {
         System.out.println(name + " with a weight of " + weight + " and a height of " + height + ", your BMI is " + bmi + " you are underweight");
      }else if(bmi < 25){
         System.out.println(name + " with a weight of " + weight + " and a height of " + height + ", your BMI is " + bmi + " you are normal");
      }else if(bmi < 30){
         System.out.println(name + " with a weight of " + weight + " and a height of " + height + ", your BMI is " + bmi + " you are overweight");
      }else{
         System.out.println(name + " with a weight of " + weight + " and a height of " + height + ", your BMI is " + bmi + " you are obese");
      }
   }
   
   
   //Go Again
   public static boolean goAgain(final Scanner kb){
      if(kb == null) 
         throw new IllegalArgumentException("Scanner object is bad");
      
      String again = "";
      do{
         System.out.print("Want to run the program again? ");
         again = kb.nextLine();
      }while(!(again.equalsIgnoreCase("yes")) && !(again.equalsIgnoreCase("no")));
      
      return again.equalsIgnoreCase("yes");
   }
   
   
   //Reads info
   public static double	readInfo(final Scanner kb, final String type){
      if(kb == null || type == null || type.isEmpty())
         throw new IllegalArgumentException("readInfo has bad parameters");
      
      double num;
      do{
         System.out.print("Please enter your " + type + " ");
         num = kb.nextDouble();
      }while(num < 0);
      
      kb.nextLine();
      return num;
   }
   
   
   //Reads info part 2
   public static double	readInfo(final String type, final Scanner kb){
      return CSCD210Lab7Methods.readInfo(kb, type);
   }
   
   
   //Reads name
   public static String	readName(final Scanner kb){
      if(kb == null)
         throw new IllegalArgumentException("Scanner object error");
      
      String name;
      do{
         System.out.print("Enter your name: ");
         name = kb.nextLine();
      }while(name.isEmpty());
      
      return name;
   }
}