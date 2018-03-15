package cscd210Methods;

import java.util.Scanner;

public class CSCD210Lab6Methods {

   //Method for finding Light or Heavy
   public static void lightOrHeavy(final int theNum, final Scanner kb) {
      
      if(theNum <1 || kb == null)
         throw new IllegalArgumentException("Invalid number or scanner");
         int num2;
				do{
					System.out.println();
					System.out.print("Enter a second integer to see if your original number is light or heavy: ");
					num2 = kb.nextInt();
					
					if(num2 >= 0) {
						int numWeight = ((num2 + theNum)/2);
						
						if(numWeight < theNum) {
							System.out.println(theNum + " is a heavy number compared to " + num2);
						}else {
							System.out.println(theNum + " is a light number compared to " + num2);
						}
					}
					if(num2 < 0) {
						System.out.println("Not a valid integer. Please enter again.");
					}
				}while(num2 <= 0);
				System.out.println();
   }
   
   //Method for Menu
   public static int	menu(final Scanner kb) {
      if (kb == null)
         throw new IllegalArgumentException("Bad Bad Scanner");
         
      int choice;
      do {
      System.out.println("1) Enter a new number");
      System.out.println("2) Print the number of even/odd/zeros");
      System.out.println("3) Print if the number is light or heavy");
      System.out.println("4) Print the primes from 2 to the entered number");
      System.out.println("5) Quit");
      System.out.println("Enter a choice: ");
      choice = kb.nextInt();
      
      }while(choice < 1 || choice > 5);
      
      return choice;
   }
   
   //Method for finding the odd even zeros
   public static void oddEvenZero(final int theNum){
      int x = theNum;
      if(x < 1)
         throw new IllegalArgumentException("Invalid number!");
      
      int zerocount = 0;
		int evencount = 0;
		int oddcount = 0;
				
		do {
		   if((x%10)==0) {
			   zerocount++;
		   }else if(x%2 == 0) {
				evencount++;
			}else {
				oddcount++;
			}
			x /= 10;
		}while(x > 0);
				
		System.out.println();
		System.out.println("Odds: " + oddcount + ", Evens: " + evencount + ", Zeros: " + zerocount);
		System.out.println();
   }
   
   //Method for finding the primes
   public static void printPrimes(final int theNum) {
      if(theNum < 1)
         throw new IllegalArgumentException("Invalid number!");
         
     int count = 0;
	  for (int i =2; i < theNum; i++) {
         boolean prime = true;
			for(int j = 2; j < i; j++) {
			   if(i%j == 0) {
				   prime = false;
					break;
				}
			}
			if(prime) {
			   if(count == 0){
				   System.out.print("The prime numbers from 2 to " + theNum + " are: ");
				}
				count++;
				System.out.print(i + ", ");
			} 
		} System.out.println();
		  System.out.println();
   }
   
   //Method for reading the positive number
   public static int	readPosNum(final Scanner kb) {
      if (kb == null)
         throw new IllegalArgumentException("Bad Bad Scanner");
      
      int num;
      do {
					System.out.println();
					System.out.print("Enter a new positive integer: ");
					num = kb.nextInt();
					System.out.println();
					
					if(num <= 0) {
						System.out.println("Not a valid option. Enter a new number.");
						System.out.println();
					}
					
				}while(num<=0);
      return num;
   }
}