import java.util.*;
public class RNG {

   public static void main(String[] args) {
   number1();
   }
   
   public static void number1() {
   
   for (int i = 1; i <=2; i++) {
   
      double x = Math.random();
      double t = Math.random();
      double w = Math.round(t * 10); 
      double y = Math.round(x * 10);
      double z = 10 * y;  // Some terms will be slightly over 100. 
      if (z + w >=100) { // Use the conditonal sequence to adjust. 
         double m = z + w - 10;
         System.out.print(m + " ");
      }
      else if (z + w < 10) {
         double p = z + w + 10;
         System.out.print(p + " ");
      }
      else {
         
         System.out.print(z + w + " ");
      }
   }  
  }
}