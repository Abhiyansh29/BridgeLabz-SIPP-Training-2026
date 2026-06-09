import java.util.Scanner;

public class Leetcode3 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int y=n;
        int p=n;
        int mul=1;
        int sum=0;
        while(y!=0){
            int o=y%10;
            mul*=o;
            y=y/10;
        }
        while(p!=0){
            int o=p%10;
            sum+=o;
            p=p/10;
        }
        System.out.print(mul-sum);
    }
}
