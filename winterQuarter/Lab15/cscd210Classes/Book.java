package cscd210Classes;

public class Book implements Comparable <Book>{

   private String title;
   private String isbn;
   private int pages;
   private String[] authors;
   
   //EVC
   public Book(final String title, final String isbn, final int pages, final String[] authors){
      if(title == null || title.isEmpty() || isbn == null || isbn.isEmpty() || pages < 1 || authors == null || authors.length < 0)
         throw new IllegalArgumentException("Error in multiple fields");
         
      this.title = title;
      this.isbn = isbn;
      this.pages = pages;
      this.authors = new String[authors.length];
      
      for(int x = 0; x < this.authors.length; x++){
         this.authors[x] = authors[x];
      }
   }
   
   //Method for Get ISBN
   public String getISBN(){
      return this.isbn;
   }
   
   //Method for toString
   @Override
   public String toString(){
      String str = "Title: " + this.title + " CR Authors: " + this.authors[0];
      for(int x = 1; x < this.authors.length; x++){
         str += ", " + this.authors[x];
      }
      str += " CR ISBN: " + this.isbn;
      return str;
   }
   
   //Method for Equals
   @Override
   public boolean equals(final Object obj){
      Book another = (Book)obj;
      if(obj == null){
         return false;
      }
      if(obj == this){
         return true;
      }
      if(!(obj instanceof Book)){
         return false;
      }
      if(this.authors == another.authors && this.title == another.title && this.isbn == another.isbn && this.pages == another.pages){
         return true;
      }
      return false;
   }
   
   //Method for hashCode
   @Override
   public int hashCode(){
      String s = this.isbn;
      String s1 = this.title;
      int res = s.hashCode() + s1.hashCode() + pages;
      return res;
   }
   
   //Method for compareTo
   @Override
   public int compareTo(final Book another){
      if(another == null)
         throw new IllegalArgumentException("Error in Another");
         
      int res = this.title.compareTo(another.title);
      if(res != 0){
         return res;
      }
      res = this.pages - another.pages;
      if(res != 0){
         return res;
      }
      return this.isbn.compareTo(another.isbn);
   }
}