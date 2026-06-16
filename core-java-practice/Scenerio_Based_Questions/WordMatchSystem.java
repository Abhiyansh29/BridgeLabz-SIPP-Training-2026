import java.util.Arrays;
import java.util.Scanner;

public class WordMatchSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Skill: ");
        String str1 = sc.nextLine();

        System.out.print("Enter Second Skill: ");
        String str2 = sc.nextLine();

        String s1 = str1.replaceAll("\\s", "")
                        .toLowerCase();

        String s2 = str2.replaceAll("\\s", "")
                        .toLowerCase();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean isAnagram =
                Arrays.equals(arr1, arr2);

        System.out.println("\n----- Skill Report -----");
        System.out.println("Skill 1 Uppercase: "
                + str1.toUpperCase());

        System.out.println("Skill 2 Uppercase: "
                + str2.toUpperCase());

        System.out.println("Length of Skill 1: "
                + str1.length());

        System.out.println("Length of Skill 2: "
                + str2.length());

        if(isAnagram) {
            System.out.println(
                "Result: Both skills are Anagrams.");
        }
        else {
            System.out.println(
                "Result: Skills are NOT Anagrams.");
        }

        sc.close();
    }
}