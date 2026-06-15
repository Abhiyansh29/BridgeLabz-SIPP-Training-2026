import java.util.Scanner;

public class Factors {
    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static long productFactors(int[] factors) {
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    public static int sumSquareFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += Math.pow(f, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int[] factors = findFactors(n);

        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();

        System.out.println("Sum = " + sumFactors(factors));
        System.out.println("Product = " + productFactors(factors));
        System.out.println("Sum of Squares = " + sumSquareFactors(factors));

        sc.close();
    }
}
