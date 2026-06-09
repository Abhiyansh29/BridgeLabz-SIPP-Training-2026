package Level1;

import java.util.Scanner;

public class MaxHandshakeFinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Number of possible maximum handshake is "+(n*(n-1))/2);
    }
    
}
