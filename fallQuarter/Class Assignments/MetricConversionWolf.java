//Gabrielle Wolf
//CSCD 210
//Converts the weight and height from the users input (pounds and inches) to some other unit (meters and kilograms)

import java.util.Scanner;//Import the scanner before anything else

public class MetricConversionWolf {

   public static void main(String[] args) {
  
   String name;//Declaring different variables (int and String)
   int height;
   int weight;
   Scanner kb = new Scanner(System.in);//declaring the scanner as kb and making a new one
   
   System.out.print("Enter your name: ");
   name = kb.nextLine();//Allows the user to enter a input with the scanner (kb)
   
   System.out.print("Enter your height in inches: ");
   height = kb.nextInt();
   
   System.out.print("Enter your weight in pounds: ");//Prints the line in the quotes
   weight = kb.nextInt();
   
   System.out.println();//Creates a empty line
   
   System.out.println("Metric Calculation");
   
   System.out.println("Name: " + name);//Prints the words and the data (name)
   System.out.println("Height: " + (height*0.0254) + " meters");//Converts the data inputed and prints it out
   System.out.println("Weight: " + (weight*0.453592) + " kilograms");
      
   }
}