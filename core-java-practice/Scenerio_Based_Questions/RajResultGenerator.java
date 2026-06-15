import java.util.Scanner;

public class RajResultGenerator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;

        System.out.println("Enter marks of 5 subjects:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = sc.nextInt();
            total += marks;
        }

        double average = total / 5.0;

        int gradeCode;

        if (average >= 80)
            gradeCode = 1;
        else if (average >= 70)
            gradeCode = 2;
        else if (average >= 60)
            gradeCode = 3;
        else if (average >= 50)
            gradeCode = 4;
        else
            gradeCode = 5;

        System.out.println("\nAverage Marks: " + average);

        switch (gradeCode) {
            case 1:
                System.out.println("Grade A");
                break;

            case 2:
                System.out.println("Grade B");
                break;

            case 3:
                System.out.println("Grade C");
                break;

            case 4:
                System.out.println("Grade D");
                break;

            default:
                System.out.println("Grade F");
        }

        sc.close();
    }
}