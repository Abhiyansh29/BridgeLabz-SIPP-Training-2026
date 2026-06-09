package Level1;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int height=sc.nextInt();
        double area=(1*base*height)/2;
        System.out.print("Your Area in cm is "+area+ " while in feet is "+area*12 +" and inches is "+area*12*2.54);
       

        

    }
    
}
