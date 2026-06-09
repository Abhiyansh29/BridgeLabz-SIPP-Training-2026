package Practice;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int Principal=sc.nextInt();
        int Rate=sc.nextInt();
        int Time=sc.nextInt();
        System.out.print("Simple Interest--:");
        System.out.print(Principal*Rate*Time/100);
    }
}
