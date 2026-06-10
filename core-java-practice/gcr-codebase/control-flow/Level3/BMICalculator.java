import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight (kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter height (cm): ");
        double heightCm = sc.nextDouble();

        // Convert cm to meters
        double heightM = heightCm / 100.0;

        // Calculate BMI
        double bmi = weight / (heightM * heightM);

        String status;

        if (bmi <= 18.4) {
            status = "Underweight";
        }
        else if (bmi <= 24.9) {
            status = "Normal";
        }
        else if (bmi <= 39.9) {
            status = "Overweight";
        }
        else {
            status = "Obese";
        }

        System.out.println("\n===== BMI REPORT =====");
        System.out.printf("BMI = %.2f\n", bmi);
        System.out.println("Status = " + status);

        sc.close();
    }
}