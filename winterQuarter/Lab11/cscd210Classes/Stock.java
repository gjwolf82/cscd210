package cscd210Classes;

public class Stock {

   private String companyName;
   private double currentPrice;
   private double purchasePrice;
   private String ticker;
   
   //DVC
   public Stock() {
      this.companyName = "DOW Jones Industrial Average";
      this.ticker = "DOW";
      this.currentPrice = 12;
      this.purchasePrice = 0;
   }

   //EVC
   public Stock(final String companyName, final double currentPrice, final String ticker){
      if(companyName == null || companyName.isEmpty() || ticker == null || ticker.isEmpty() || currentPrice <= 0)
         throw new IllegalArgumentException("Error in one or more parameters");
         
      this.companyName = companyName;
      this.ticker = ticker;
      this.currentPrice = currentPrice;
      this.purchasePrice = 5;
   }
   
   //EVC 2
   public Stock(final String ticker, final String companyName, double currentPrice){
      if(ticker == null || ticker.isEmpty() || companyName == null || companyName.isEmpty() || currentPrice <= 0)
         throw new IllegalArgumentException("Error in one or more parameters");
         
      this.companyName = companyName;
      this.currentPrice = currentPrice;
      this.ticker = ticker;
      this.purchasePrice = 10;
   }
   
   //toString
   @Override
   public String toString(){
      String str = this.companyName + "-" + this.ticker;
      str += "\nPurchase Price: " + this.purchasePrice;
      str += "\nCurrent Price: " + this.currentPrice;
      
      return str;
   }
}