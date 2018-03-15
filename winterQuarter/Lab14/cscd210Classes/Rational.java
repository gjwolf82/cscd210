package cscd210Classes;

import java.util.Scanner;
import java.math.BigInteger;

public class Rational implements Comparable <Rational>{
   
   private int den;
   private int num;
   
   //DVC
   public Rational(){
      this.den = 1;
      this.num = 1;
   }

   //EVC
   public Rational(final int num, final int den){
      if(den == 0)
         throw new IllegalArgumentException("Error in Denominator");
         
      this.num = num;
      this.den = den;
      
      sign();
      reduce();
   }
   
   //Method for Reduce
   private void reduce(){
      BigInteger res1 = BigInteger.valueOf(this.num);
      BigInteger res2 = BigInteger.valueOf(this.den);
      
      BigInteger gcd = res1.gcd(res2);
      
      this.num = this.num/gcd.intValue();
      this.den = this.den/gcd.intValue();
   }
   
   //Method for Sign
   private void sign(){
      if(this.den < 0){
         this.den = Math.abs(this.den);
         this.num = (this.num * -1);
      }else if(this.den < 0 && this.num < 0){
         this.den = Math.abs(this.den);
         this.num = Math.abs(this.num);
      }
   }

   //Method for Add
   public Rational add(final Rational another){
      if(another == null)
         throw new IllegalArgumentException("Error in another");
         
      int num = (this.num * another.den) + (another.num * this.den);
      int den = (this.den * another.den);
      
      Rational res = new Rational(num, den);
      
      return res;
   }
   
   //Method for Reciprocal
   public Rational reciprocal(){
      Rational res = new Rational(this.num, this.den);
      return res;
   }
   
   //Method for toString
   @Override
   public String toString(){
      String res = this.num + "/" + this.den;
      return res;
   }
   
   //Method for equals 
   @Override
   public boolean equals(final Object obj){
      Rational another = (Rational)obj;
    
      if(obj == null){
         return false;
      }
      if(this == obj){
         return true;
      }
      if(!(obj instanceof Rational)){
         return false;
      }
      if(this.num == another.num && this.den == another.den){
         return true;
      }
      return false;
   }
   
   //Method for HashCode
   @Override
   public int hashCode(){
      Integer num = this.num;
      Integer den = this.den;
   
      int res = num.hashCode() + den.hashCode();
      return res;
   }
   
   //Method for CompareTo
   @Override
   public int compareTo(final Rational another){
      if(another == null)
         throw new IllegalArgumentException("Error in Another");
      
      Double frac1 = (double)(this.num)/(this.den);
      Double frac2 = (double)(another.num)/(another.den);
      
      int res = frac1.compareTo(frac2);
      
      return res;
   }
}