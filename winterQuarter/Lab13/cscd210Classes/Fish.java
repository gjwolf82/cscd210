package cscd210Classes;

public class Fish implements Comparable <Fish> {
   
   private String type;
   private double weight;
   
   //EVC
   public Fish(final String type, final double weight){
      if(type == null || type.isEmpty() || weight <= 0 )
         throw new IllegalArgumentException("Error in one of the parameters");
         
      this.type = type;
      this.weight = weight;
   }
   
   //Method for Get Weight
   public double getWeight(){
      return this.weight;
   }
   
   //Method for Get Type
   public String getType(){
      return this.type;
   }
   
   //Method for Set Weight
   public void setWeight(final double weight){
      if(weight <= 0)
         throw new IllegalArgumentException("Error in weight");
         
      this.weight = weight;
   }
   
   //Method for Set Type
   public void setType(final String type){
      if(type == null || type.isEmpty())
         throw new IllegalArgumentException("Error in type");
         
      this.type = type;
   }
   
   //Method for Equals
   @Override
   public boolean equals(final Object obj){
      String type = this.type;
      Double weight = this.weight;
      
      if(this == obj){
         return true;
      }
      if(obj == null){
         return false;
      }
      if(!(obj instanceof Fish)){
         return false;
      }
      if(type == obj && weight == obj){
         return true;
      }
      
      return false;
   }
   
   //Method for hash code
   @Override
   public int hashCode(){
      String s = this.type;
      Double d = this.weight;
      int res = s.hashCode() + d.hashCode();
      return res;
   }
   
   //Method for Compare To
   @Override
   public int compareTo(final Fish another){
      if(another == null)
         throw new IllegalArgumentException("Error in Fish");
         
      int res = this.type.compareTo(another.type);
      if(res != 0){
         return res;
      }
      res = (int)(this.weight*100)-(int)(another.weight*100);
      if(res != 0){
         return res;
      }
      
      return res;
   }
   
   //Method for toString
   @Override
   public String toString(){
      String str = this.type + " - " + this.weight;
      return str;
   }


}