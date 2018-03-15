public class TriangleList {

   private Triangle[] list;
   private int length;
   
   //DVC 
   TriangleList() {
      this.list = new Triangle[5];
      this.length = 5;
   }
   
   //EVC1
   TriangleList(int lng) {
      this.length = lng;
      this.list = new Triangle[lng];
   }
   
   //EVC2
   TriangleList(Triangle strt) {
      this.length = 1;
      this.list = new Triangle[1];
      this.list[0] = strt;
   }
   
   //GETS
   public int getLength() {
      return this.length;
   }
   
   public Triangle[] getList() {
      return this.list;
   }
   
}