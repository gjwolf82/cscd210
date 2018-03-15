//Gabrielle Wolf
//CSCD 210
//This program sorts polygons
public class RegularPolygon implements Comparable<RegularPolygon>{

   private int sides;
   private double length;
   
   //DVC
   RegularPolygon() {
      sides = 3;
      length = 1.0;
   }
   
   //EVC 1
   RegularPolygon(double pSideLength) {
      this.length = pSideLength;
      this.sides = 3;
   }
   
   //EVC 2
   RegularPolygon(int pSides) {
      this.sides = pSides;
      this.length = 1.0;
   }
   
   //EVC 3
   RegularPolygon (int pSides, double pSideLength) {
      this.sides = pSides;
      this.length = pSideLength;
   }
   
   //Setters and Getters for sides
   public int getSides() {
      return this.sides;
   }
   
   public void setSides(int pSides) {
      this.sides = pSides;
   }
   
   //Setters and Getters for length
   public double getLength() {
      return this.length;
   }
   
   public void setLength(double pSideLength) {
      this.length = pSideLength;
   }
   
   //getPerimeter method
   public double getPerimeter() {
      return this.length * this.sides;
   }
   
   //getApothem method
   public double getApothem() {
      return (this.length/(2.0*(3.14/this.sides)));
   }
   
   //getArea method
   public double getArea() {
      return ((this.length/(2.0*(3.14/this.sides)))*(this.length * this.sides))/2;
   }
   
   //Comparable Interface
   public int compareTo(RegularPolygon that) {
      Integer sides = this.sides;
      Integer sides2 = that.sides;
      Double length = this.length;
      Double length2 = that.length;
      if (sides.compareTo(sides2) != 0) {
         return sides.compareTo(sides2);
      }
      else if(length.compareTo (length2) != 0) {
         return length.compareTo(length2);
      }
      return sides.compareTo(sides2);
   } 
   
   //Override toString
   @Override
   public String toString() {
      return "Sides: " + sides + " Side Length: " + length + " Perimeter: " + getPerimeter() + " Area: " + getArea(); 
   }
}