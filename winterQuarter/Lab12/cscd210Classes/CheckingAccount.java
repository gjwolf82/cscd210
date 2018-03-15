package cscd210Classes;

public class CheckingAccount {

   private int acctNum;
   private double bal;
   
   //EVC1
   public CheckingAccount(final int acctNum){
      this.acctNum = acctNum;
      this.bal = 100;
   }
   
   //EVC2
   public CheckingAccount(final int acctNum, final double bal){
      if(acctNum <= 0 || bal < 100)
         throw new IllegalArgumentException("Error in one of the parameters");
         
      this.acctNum = acctNum;
      this.bal = bal;
   }
   
   //Getter for Account Number
   public int getAcctNumber(){
      return this.acctNum;
   }
   
   //Getter for Balance
   public double getBalance(){
      return this.bal;
   }
   
   //Setter for Account Number
   public void setAccountNumber(final int acctNum){
      if(acctNum <= 0)
         throw new IllegalArgumentException("Error in Account Number");
         
      this.acctNum = acctNum;
   }
   
   //Setter for Set Balance
   private void setBalance(final double bal){
      if(bal < 0)
         throw new IllegalArgumentException("Error in Balance");
         
      this.bal = bal;
   }
   
   //Method for deposit
   public void deposit(final double amt){
      if (amt <= 0)
         throw new IllegalArgumentException("Error in amount");
         
      this.setBalance(bal + amt);
   }
   
   //Method for withdrawal
   public void withdrawal(final double amt){
      if(amt <= 0)
         throw new IllegalArgumentException("Error in amount");
         
      if(amt <= bal){
         this.setBalance(bal - amt);
      }
   }
   
   //toString
   @Override
   public String toString(){
      String str = "Account Number: " + this.acctNum + "\nAccount Number: $" + this.bal + "\n";
      
      return str;
   }
   
   //Method for equals
   @Override
   public boolean equals(final Object obj){
      Integer acctNum = this.acctNum;
      Double bal = this.bal;
      
      if(obj == this){
         return true;
      }
      
      if(obj == null){
         return false;
      }
      
      if(!(obj instanceof CheckingAccount)){
         return false;
      }
      
      if(acctNum == obj && bal == obj){
         return true;
      }
      
      return false;
   }
   
   //Method for hashCode
   @Override
   public int hashCode(){
      String hash = this.acctNum + "";
      
      return hash.hashCode();
   }
}