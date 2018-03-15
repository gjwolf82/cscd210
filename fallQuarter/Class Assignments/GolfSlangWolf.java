//Gabrielle Wolf
//CSCD 210
//This program lets the user input the hole number, par, and strokes and it returns the hole number, the par, the par relation, and the slang for number of strokes
import java.util.*;

public class GolfSlangWolf {

   public static void main(String[] args) {
   
   
   
      Scanner kb = new Scanner(System.in);//This is where we declared all the variables
      int holeNum;
      int parVal;
      int strokes;
      String relation = "";
      String strokesNum = "";//Declared empty Strings
      String beagle = "";
      
      
      
      
      
      System.out.print("Enter a hole number: ");//This is where the user inputs their info
      holeNum = kb.nextInt();
      
      System.out.print("Enter the par for the hole: ");
      parVal = kb.nextInt();
      
      System.out.print("Enter the number of strokes: ");
      strokes = kb.nextInt();
      
      
      
      
      if (strokes == 1) {//This if block uses the strokes and outputs another variable with a String
         strokesNum = ", with a Hole in One";
      } else if (strokes == 4) {
         strokesNum = ", with a Sailboat";
      }else if (strokes == 8) {
         strokesNum = ", with a Snowman";
      }else if (strokes == 10) {
         strokesNum = ", with a Bo Derek";
      }
      
      
      
      if(strokes - parVal == 0) {//This if statement takes the strokes minus the par and takes that number and assigns a slang word
         relation = "Even Par";
      }else if(strokes - parVal == 1) {
         relation = "Bogey";
      }else if(strokes - parVal == 2) {
         relation = "Double Bogey";
      }else if(strokes - parVal == 3) {
         relation = "Triple Bogey";
      }else if(strokes - parVal >= 4) {
         relation = (strokes - parVal) + " over par";
      }else if(strokes - parVal == -1) {
         relation = "Birdie";
      }else if(strokes - parVal == -2) {
         relation = "Eagle";
      }else if(strokes - parVal == -3) {
         relation = "Albatross";
      }else if(strokes - parVal == -4) {
         relation = "Condor";
      }else if(strokes - parVal == -5) {
         relation = "Ostrich";
      }
      
      
       
      
      if (strokes == parVal*2) {//This if statment is for if the strokes is twice the par
         beagle = ", and a Beagle";
      }
      
      
      
      
      System.out.println();//This prints it all out in one line.
      System.out.print("On hole #" + holeNum + " a par " + parVal + " you shot a " + relation + strokesNum + beagle + ".");
      
   }
}