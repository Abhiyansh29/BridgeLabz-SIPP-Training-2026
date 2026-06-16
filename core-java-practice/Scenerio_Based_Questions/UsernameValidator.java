import java.util.Scanner;

public class UsernameValidator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        boolean hasSpace = username.contains(" ");

        int length = username.length();

        String upperCase = username.toUpperCase();

        String reversed = new StringBuilder(username).reverse().toString();

        boolean isPalindrome =
                username.equalsIgnoreCase(reversed);

        System.out.println("\n----- Username Report -----");
        System.out.println("Username: " + username);
        System.out.println("Contains Space: " + hasSpace);
        System.out.println("Total Characters: " + length);
        System.out.println("Uppercase: " + upperCase);
        System.out.println("Palindrome: " + isPalindrome);

        sc.close();
    }
}