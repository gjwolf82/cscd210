package cscd210Enums;

public enum Month 
{

   APR("april",30),AUG("august",31),DEC("december",31),FEB("february",28),JAN("january",31),JUL("july",31),JUN("june",30),MAR("march",31),MAY("may",31),NOV("november",30),OCT("october",31),SEP("september",30);
   
   private int days;
   private String month;
   
   private Month(final String month, final int days){
      if(month == null || month.isEmpty() || days < 28)
         throw new IllegalArgumentException("Error in parameters");
      
      this.days = days;
      this.month = month;
   }
   
   //Method for Get Days
   public int getDays(){
      return this.days;
   }
   
   //Method for toString
   @Override
   public String toString(){
      String str = this.month.substring(0,1).toUpperCase() + this.month.substring(1);
      return str;
   }
   
}