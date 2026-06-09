package Level1;

import java.util.Scanner;

public class UniversityFeesDiscounter2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fee=sc.nextInt();
        int discountPercent=sc.nextInt();

        double discount=(fee*discountPercent)/100;
        System.out.print("The discount amount is INR "+discount+" and final discounted fee is INR "+(fee-discount));
    }
}
