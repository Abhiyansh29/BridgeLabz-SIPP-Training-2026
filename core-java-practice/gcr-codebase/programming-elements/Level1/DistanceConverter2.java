package Level1;

import java.util.Scanner;

public class DistanceConverter2 {
   
   public static void main(String[] var0) {
    Scanner sc=new Scanner(System.in);
    
      double km = sc.nextInt();
      double mile = 1.6*km;
      System.out.print("The total miles is "+mile+" mile for the given "+km+" km");
   }
}
