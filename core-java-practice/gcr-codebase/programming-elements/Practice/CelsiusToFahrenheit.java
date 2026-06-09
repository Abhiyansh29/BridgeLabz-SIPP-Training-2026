package Practice;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cel=sc.nextInt();
        float faren=(cel * 9/5) + 32;

        System.out.print(faren);
    }
    

}
