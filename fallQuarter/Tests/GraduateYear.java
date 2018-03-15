import java.util.Scanner;

public class GraduateYear {

   public static void main(String[] args) { 
      
      Scanner kb = new Scanner(System.in);
      
      String name;
      int age;
      int schoolYear;
      
      System.out.print("Enter your name: ");
      name = kb.nextLine();
      
      System.out.print("Enter your age: ");
      age = kb.nextInt();
      
      System.out.print("What year in school are you? ");
      schoolYear = kb.nextInt();
      
      System.out.println();
      
      int value = 12-schoolYear;
      System.out.println("Your results");
      
      System.out.println("Name: " + name);
      System.out.println("Years until Graduation: " + (value) +" years");
      System.out.print("Age when you graduate: " + (value + age) + " years old");
   
   }
}