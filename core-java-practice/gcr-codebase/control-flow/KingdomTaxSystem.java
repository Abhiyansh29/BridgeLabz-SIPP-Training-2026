import java.util.Scanner;

public class KingdomTaxSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] incomes = new double[10];
        double totalTax = 0;

        System.out.println("Enter income of 10 citizens:");

        for (int i = 0; i < incomes.length; i++) {
            System.out.print("Citizen " + (i + 1) + " Income: ");
            incomes[i] = sc.nextDouble();
        }

        System.out.println("\nTax Details:");

        for (int i = 0; i < incomes.length; i++) {
            double income = incomes[i];
            double tax;
            String bracket;

            if (income < 10000) {
                tax = income * 0.05;
                bracket = "5% Tax Bracket";
            } else if (income <= 50000) {
                tax = income * 0.15;
                bracket = "15% Tax Bracket";
            } else {
                tax = income * 0.30;
                bracket = "30% Tax Bracket";
            }

            totalTax += tax;

            System.out.println(
                "Citizen " + (i + 1) +
                " | Income = " + income +
                " | Bracket = " + bracket +
                " | Tax = " + tax
            );
        }

        System.out.println("\nTotal Tax Collected = " + totalTax);

        sc.close();
    }
}