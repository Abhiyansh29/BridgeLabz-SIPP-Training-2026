import java.util.Scanner;

public class NumberChecker2 {

    static int[] getDigits(int number) {

        String str = String.valueOf(number);

        int[] digits = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }

        return digits;
    }

    static int sumDigits(int[] digits) {

        int sum = 0;

        for (int digit : digits)
            sum += digit;

        return sum;
    }

    static int sumSquareDigits(int[] digits) {

        int sum = 0;

        for (int digit : digits)
            sum += Math.pow(digit, 2);

        return sum;
    }

    static boolean isHarshad(int number, int[] digits) {

        return number % sumDigits(digits) == 0;
    }

    static void frequency(int[] digits) {

        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++)
            freq[i][0] = i;

        for (int digit : digits)
            freq[digit][1]++;

        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0)
                System.out.println(freq[i][0] + " -> " + freq[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int[] digits = getDigits(number);

        System.out.println("Sum Digits = " + sumDigits(digits));
        System.out.println("Sum Squares = " + sumSquareDigits(digits));
        System.out.println("Harshad = " + isHarshad(number, digits));

        frequency(digits);

        sc.close();
    }
}