package cscd210Methods.gameMethods;

import java.util.Scanner;

public class GuessTheWordGameMethods{

   public static final int TOTAL = 7;
   
   //Method for Read Guess
   public static char readGuess(final Scanner kb,final String player){
      if(kb == null || player == null || player.isEmpty())
         throw new IllegalArgumentException("Error in Scanner ot Player");
         
      char letter;
      do{
         System.out.print(player + " enter a letter to guess: ");
         letter = kb.next().charAt(0);
         kb.nextLine();
         System.out.println();
      }while(letter < 'a' || letter > 'z');
      
      return letter;
   }
   
   //Method for Check Guess
   public static int checkGuess(final char guess,final char[] wordToGuess,final int incorrectGuesses){
      if(guess < 'a' || guess > 'z' || wordToGuess == null || wordToGuess.length < 1 || incorrectGuesses < 0 || incorrectGuesses > 7)
         throw new IllegalArgumentException("Error in one or mulitple fields");
      
      for(int x = 0; x < wordToGuess.length; x++){
         if(guess == wordToGuess[x]){
            return incorrectGuesses;
         }
      }
      
      return incorrectGuesses + 1;
   }
   
   //Method for Display
   public static boolean display(final char guess,final char[] wordToGuess,final char[] guessedLetters,final char[] displayGuessedLettersWordToGuess,final int incorrectGuesses){
      if(guess < 'a' || guess > 'z' || wordToGuess == null || wordToGuess.length < 1 || guessedLetters == null || guessedLetters.length < 1 || displayGuessedLettersWordToGuess == null || displayGuessedLettersWordToGuess.length < 1 || incorrectGuesses < 0 || incorrectGuesses > 7)
         throw new IllegalArgumentException("Error in one or multiple fields");
      
      int index;
      if(incorrectGuesses < TOTAL){
         for(int x = 0; x < wordToGuess.length; x++){
            if(guess == wordToGuess[x]){
               displayGuessedLettersWordToGuess[x] = guess;
            }
         }        
      }
      
      index = (int)(guess - 'a');
      guessedLetters[index] = guess;
         
      System.out.print("Your word so far: ");
      System.out.println(displayGuessedLettersWordToGuess);
      System.out.println("Your letters so far: ");
      System.out.println(guessedLetters);
      System.out.println("You have " + (TOTAL - incorrectGuesses) + " guesses so far!");
      System.out.println();
      
      for(int x = 0; x < displayGuessedLettersWordToGuess.length; x++){
         if(displayGuessedLettersWordToGuess[x] == '-'){
            return false;
         }
      }
      System.out.println("Congrats you won!Yay!");
      return true;
   }
   
   
   //Method for Initialize Display for Char[]
   public static char[] initializeDisplay(final char[] wordToGuess){
      if(wordToGuess == null || wordToGuess.length < 1)
         throw new IllegalArgumentException("Error in Word to Guess");
      
      char[] temp = new char[wordToGuess.length];
      for(int x = 0; x < temp.length; x++){
         temp[x] = '-';
      }
      
      return temp;
   }
   
   //Method for Initialize Display with Int
   public static char[] initializeDisplay(final int total){
      if(total < 1)
         throw new IllegalArgumentException("Error in total");
         
      char[] temp = new char[total];
      for(int x = 0; x < temp.length; x ++){
         temp[x] = '-';
      }
         
      return temp;
   }
}