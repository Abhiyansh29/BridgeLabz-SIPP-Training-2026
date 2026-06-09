package Level1;

import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int height=sc.nextInt();
        System.out.print("Your Height in cm is "+height+ " while in feet is "+height*12 +" and inches is "+height*12*2.54);
        
    }
}
