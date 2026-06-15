import java.util.Scanner;

public class MetroSmartCardFare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 500.0; // Initial card balance

        while (balance > 0) {

            System.out.println("\nCurrent Balance: ₹" + balance);
            System.out.print("Enter distance in km (or -1 to quit): ");

            double distance = sc.nextDouble();

            if (distance == -1) {
                System.out.println("Thank you for using Delhi Metro!");
                break;
            }

            // Fare calculation using ternary operator
            double fare = (distance <= 5) ? 10 :
                          (distance <= 15) ? 20 :
                          (distance <= 30) ? 35 : 50;

            if (fare > balance) {
                System.out.println("Insufficient Balance!");
                break;
            }

            balance -= fare;

            System.out.println("Fare Deducted: ₹" + fare);
            System.out.println("Remaining Balance: ₹" + balance);
        }

        System.out.println("Card Balance Exhausted or User Exited.");
        sc.close();
    }
}