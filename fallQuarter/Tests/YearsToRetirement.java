import java.util.Scanner;

public class YearsToRetirement {
   
   public static void main(String[] args) {
      
      String name;
      int age;
      Scanner kb = new Scanner(System.in);
      
      System.out.print("Enter your name:");
      name = kb.nextLine();
      
      System.out.print("Enter your age:");
      age = kb.nextInt();
      
      System.out.println();
      
      System.out.println(name + " (age:" + age + ")");
      System.out.println("Years until retirement:" + (65-age));
  
   }
}