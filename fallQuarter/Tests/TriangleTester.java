public class TriangleTester {

   public static void main(String[] args) {
   
      Triangle shape = new Triangle(11.8, 2.3);
      System.out.println(shape.getHeight());
      System.out.println(shape.getBase());
      
      System.out.println(shape.getArea());
      
      shape.setHeight(9.8);
      shape.setBase(11.1);
      
      
      System.out.println(shape.toString());
   }

}