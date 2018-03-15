//Gabrielle Wolf
//CSCD 210
//This program will have refrences to the Java Util

public class ArrayUtils {
   
   
   
   public static int[] push(int[] arr, int item) {//Push Integer
      int[] temp = new int[arr.length+1];
      
      for (int ix = 0; ix < arr.length; ix++) {
         temp[ix] = arr[ix];
      }
      temp[arr.length] = item;
      return temp;
   }
   
   
   
   public static double[] push(double[] arr, double item) {//Push Double
      double[] temp = new double[arr.length+1];
      
      for (int ix = 0; ix < arr.length; ix++) {
         temp[ix] = arr[ix];
      }
      temp[arr.length] = item;
      return temp;
   }



   public static int[] pop(int[] arr) {//Pop Integer
      int[] temp = new int[arr.length-1];
      
      for (int ix = 0; ix < arr.length-1; ix++) {
         temp[ix] = arr[ix];
      }
      return temp;
   }
   
   
   
   public static double[] pop(double[] arr) {//Pop Double
      double[] temp = new double[arr.length-1];
      
      for (int ix = 0; ix < arr.length-1; ix++) {
         temp[ix] = arr[ix];
      }
      return temp;
   }
   
   
   
   public static int[] remove(int[] arr, int loc) {//Remove Integer
      int[] temp = new int[arr.length-1];
      int curser = 0;
      
      for(int ix = 0; ix < temp.length; ix++) {
         if(ix == loc) {
            curser = 1;
         }
         temp[ix] = arr[ix + curser];
      }
      return temp;
   }
   
   
   
   public static double[] remove(double[] arr, double loc) {//Remove Double
      double[] temp = new double[arr.length-1];
      int curser = 0;
      
      for(int ix = 0; ix < temp.length; ix++) {
         if(ix == loc) {
            curser = 1;
         }
         temp[ix] = arr[ix + curser];
      }
      return temp;
   }
   
   
   
   public static int linearSearch(int[] arr, int num) {//LinearSearch Integer
      for (int ix = 0; ix < arr.length; ix++) {
         if (arr[ix] == num) {
            return ix;
         }
      }
      return -1;
   }
   
   
   
   public static double linearSearch(double[] arr, double num) {//LinearSearch Double
      for (int ix = 0; ix < arr.length; ix++) {
         if (arr[ix] == num) {
            return ix;
         }
      }
      return -1;
   }
   
   
   
   public static void selectionSort(int[] arr) {//Selection Sort Integer
      int temp;
      int smallest;
      
      for (int ix = 0; ix < arr.length; ix++) {
         smallest = ix;
         for (int cursor = ix; cursor < arr.length; cursor++) {
            if (arr[cursor] < arr[smallest]) {
               smallest = cursor;
            }
         }
         temp = arr[smallest];
         arr[smallest] = arr[ix];
         arr[ix] = temp;
      }
   }
   
   
   
   public static void selectionSort(double[] arr) {//Selection Sort double
      double temp;
      int smallest;
      
      for (int ix = 0; ix < arr.length; ix++) {
         smallest = ix;
         for (int cursor = ix; cursor < arr.length; cursor++) {
            if (arr[cursor] < arr[smallest]) {
               smallest = cursor;
            }
         }
         temp = arr[smallest];
         arr[smallest] = arr[ix];
         arr[ix] = temp;
      }
   }
   
   
   
   public static int[] insert(int[] arr, int item, int loc) {//Insert Integer
      boolean insert = false;
      int[] temp = new int[arr.length + 1];
      
      for (int ix = 0; ix <temp.length; ix++) {
         if(ix!= loc) {
            if (insert) {
               temp[ix] = arr[ix-1];
            }else {
               temp[ix] = arr[ix];
         }
         }else {
            temp[ix] = item;
            insert = true;
         }
      }
      return temp;
    }
   
   
   
   public static double[] insert(double[] arr, double item, int loc) {//Insert Double
      boolean insert = false;
      double[] temp = new double[arr.length + 1];
      
      for (int ix = 0; ix <temp.length; ix++) {
         if(ix!= loc) {
            if (insert) {
               temp[ix] = arr[ix-1];
            }else {
               temp[ix] = arr[ix];
         }
         }else {
            temp[ix] = item;
            insert = true;
         }
      }
      return temp;
    }
   
   
   
   public static int[] removeByValue(int[] arr, int item) {//Remove by Value Integer
      int count = 0;
      
      for (int ix = 0; ix < arr.length; ix++) {
         if (arr[ix] == item) {
            count++;
         }
      }
      int[] temp = new int[arr.length-count];
      count = 0;
      
      for (int ix = 0; ix < arr.length; ix++) {
         if (arr[ix] == item) {
            count++;
         }else {
            temp[ix - count] = arr[ix];
         }
      }
      return temp;
   }
   
   
   
   public static double[] removeByValue(double[] arr, double item) {//Remove by Value Integer
      int count = 0;
      
      for (int ix = 0; ix < arr.length; ix++) {
         if (arr[ix] == item) {
            count++;
         }
      }
      double[] temp = new double[arr.length-count];
      count = 0;
      
      for (int ix = 0; ix < arr.length; ix++) {
         if (arr[ix] == item) {
            count++;
         }else {
            temp[ix - count] = arr[ix];
         }
      }
      return temp;
   }

}