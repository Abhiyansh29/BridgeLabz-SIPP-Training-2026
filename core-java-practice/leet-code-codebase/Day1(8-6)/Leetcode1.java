import java.util.Scanner;

public class Leetcode1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        int x=n;
        int z=0;
        while(n!=0){
             z =(z*10)+(n%10);
             n=n/10;

        }
        if(x<0){
            z=-z;
        }
        if(x==z){
            System.out.print(true);
        }
        else{
            System.out.print(false);
        }
    }
}
