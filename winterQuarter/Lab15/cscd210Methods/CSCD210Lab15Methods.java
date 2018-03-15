package cscd210Methods;

import java.io.PrintStream;
import java.util.Scanner;
import cscd210Classes.Book;

public class CSCD210Lab15Methods{
   
   //Method for Fill Array
   public static Book[] fillArray(final Scanner fin, final int total){
      if(fin == null || total < 1)
         throw new IllegalArgumentException("Error in Scanner or total");
         
      Book[] array = new Book[total];
      for(int x = 0; x < array.length; x++){
         String str = fin.nextLine();
         String[] temp = str.split(",");
         
         if(temp.length < 4){
            throw new RuntimeException("");
         }
         String[] authors = new String[temp.length-3];
         for(int y = 0; y < authors.length; y++){
            authors[y] = temp[y+3];
         }
         for(int y = 0; y < array.length; y++){
            array[y] = new Book(temp[0].trim(), temp[1].trim(), Integer.parseInt(temp[2].trim()), authors);
            authors = new String[temp.length-3]; 
         }
         
      }
      return array;
   }
   
   //Method for Print Books
   public static void printBooks(final Book[] array, final PrintStream output){
      if(array == null || array.length < 1 || output == null)
         throw new IllegalArgumentException("Error in array or PrintStream");
         
      for(int x = 0; x < array.length; x++){
         output.println(array[x].toString());
      }
   }
   
   //Method for Menu
   public static int menu(final Scanner kb){
      if(kb == null)
         throw new IllegalArgumentException("Error in Scanner");
         
      int choice;
      do{
         System.out.println("1)Print the books to screen");
         System.out.println("2)Print the books to a file");
         System.out.println("3)Sort the books based on natural order");
         System.out.println("4)Sort the books based on total order");
         System.out.println("5)Add a new book to the bookshelf");
         System.out.println("6)Search the bookshelf for a book");
         System.out.println("7)Quit");
         System.out.print("Enter a choice: ");
         choice = kb.nextInt();
         kb.nextLine();
      }while(choice < 1 || choice > 7);
      return choice;
   }
   
   //Method for add book
   public static Book[] addBook(final Book[] array, final Book aBook){
      if(array == null || array.length < 1 || aBook == null)
         throw new IllegalArgumentException("Error in array or Book");
         
      Book[] temp = new Book[array.length+1];
      for(int x = 0; x < temp.length; x++){
         temp[x] = array[x];
      }
      temp[temp.length-1] = aBook;
      return temp;
   }
   
   //Method for Create Book
   public static Book createBook(final Scanner kb){
      if(kb == null)
         throw new IllegalArgumentException("Error in Scanner");
      
      String title;
      String isbn;
      int pages;
      String[] authors = null; 
      String again = "";  
      
      System.out.println("Enter a title: ");
      title = kb.nextLine();
      System.out.println("Enter a isbn: ");
      isbn = kb.nextLine();
      do{
         System.out.println("Enter the number of pages: ");
         pages = kb.nextInt();
         kb.nextLine();
      }while(pages < 0);
      do{
         do{
            for(int x = 0; x < authors.length; x++){
               System.out.println("Enter a author name: ");
               authors[x] = kb.nextLine();
               System.out.println();
            }
            System.out.println("Enter to enter again?");
            again = kb.nextLine();
            }while(!(again.equalsIgnoreCase("yes")) && !(again.equalsIgnoreCase("no")));

      }while(authors.length < 0);
      
      Book res = new Book(title, isbn, pages, authors);
      return res;
   }
   
   //Method for Read Output File Name
   public static String readOutputFilename(final Scanner kb){
      if(kb == null)
         throw new IllegalArgumentException("Error in Scanner");
      
      String name;
      do{
         System.out.print("Enter a filename: ");
         name = kb.nextLine();
      }while(name.isEmpty());
      
      return name;
   }
   
   //Method for Read String
   private static String readString(final String type, final Scanner kb){
      if(kb == null)
         throw new IllegalArgumentException("Error in Scanner");
         
      String string;
      do{
         System.out.print("Please enter the " + type + ": ");
         string = kb.nextLine();
      }while(string == null && string.isEmpty());
      
      return string;
   }
}