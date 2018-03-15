package cscd210Lab6;

import java.util.Scanner;
import cscd210Methods.CSCD210Lab6Methods;

public class CSCD210Lab6
{
   /**
    * Ignore this constructor
    */
   public CSCD210Lab6()
   {}
   
   /**
    * The main method.  You can't change the code in this method
    * or this class in any fashion
    *
    * @param args Representing any command line arguments passed into main
    */
   public static void main(String [] args)
   {
      int theNum, choice;
      Scanner kb = new Scanner(System.in);
      
      theNum = CSCD210Lab6Methods.readPosNum(kb);
      
      do
      {
         choice = CSCD210Lab6Methods.menu(kb);
         
         switch(choice)
         {
            case 1:  theNum = CSCD210Lab6Methods.readPosNum(kb);
                     break;
                    
            case 2:  CSCD210Lab6Methods.oddEvenZero(theNum);
                     break;  
            
            case 3:  CSCD210Lab6Methods.lightOrHeavy(theNum, kb);
                     break;
                     
            case 4:  CSCD210Lab6Methods.printPrimes(theNum);
                     break;
                     
            default: System.out.println("Good Bye");         
         
         }// end switch
            
      }while(choice != 5);
  
   }// end main

}// end class