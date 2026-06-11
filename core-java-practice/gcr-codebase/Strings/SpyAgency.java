import java.util.Arrays;
import java.util.Scanner;

public class SpyAgency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== Reverse Message & Palindrome Check =====
        System.out.print("Enter Secret Message: ");
        String message = sc.nextLine();

        String reversed = "";

        for (int i = message.length() - 1; i >= 0; i--) {
            reversed += message.charAt(i);
        }

        System.out.println("Reversed Message: " + reversed);

        if (message.equalsIgnoreCase(reversed)) {
            System.out.println("Message is a Palindrome");
        } else {
            System.out.println("Message is NOT a Palindrome");
        }

        // ===== Count Vowels and Consonants =====
        int vowels = 0;
        int consonants = 0;

        String lower = message.toLowerCase();

        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);

            if (Character.isLetter(ch)) {

                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        // ===== Anagram Check =====
        System.out.print("\nEnter First Intercept: ");
        String msg1 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        System.out.print("Enter Second Intercept: ");
        String msg2 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        char[] arr1 = msg1.toCharArray();
        char[] arr2 = msg2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Intercepts are Anagrams");
        } else {
            System.out.println("Intercepts are NOT Anagrams");
        }

        // ===== First Non-Repeating Character =====
        System.out.print("\nEnter Surveillance Log: ");
        String log = sc.nextLine();

        char firstNonRepeating = '\0';

        for (int i = 0; i < log.length(); i++) {

            char current = log.charAt(i);
            int count = 0;

            for (int j = 0; j < log.length(); j++) {
                if (current == log.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                firstNonRepeating = current;
                break;
            }
        }

        if (firstNonRepeating != '\0') {
            System.out.println(
                    "First Non-Repeating Character: "
                            + firstNonRepeating);
        } else {
            System.out.println(
                    "No Non-Repeating Character Found");
        }

        sc.close();
    }
}