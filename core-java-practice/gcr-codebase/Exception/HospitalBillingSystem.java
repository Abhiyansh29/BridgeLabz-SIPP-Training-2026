import java.util.Scanner;

// Custom Exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    static void processPayment(double billAmount, double amountPaid)
            throws InsufficientFundsException {

        if (amountPaid < billAmount) {
            throw new InsufficientFundsException(
                    "Payment failed! Insufficient funds. Need ₹"
                            + (billAmount - amountPaid) + " more.");
        }

        System.out.println("Payment Successful!");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // ArithmeticException
            System.out.print("Enter total bill amount: ");
            double totalBill = Double.parseDouble(sc.nextLine());

            System.out.print("Enter number of bill items: ");
            int items = Integer.parseInt(sc.nextLine());

            double averageCost = totalBill / items;
            System.out.println("Average Cost Per Item = ₹" + averageCost);

            // ArrayIndexOutOfBoundsException
            String[] patients = {
                    "Rahul",
                    "Priya",
                    "Amit",
                    "Neha"
            };

            System.out.print("Enter patient index (0-3): ");
            int index = Integer.parseInt(sc.nextLine());

            System.out.println("Patient Name: " + patients[index]);

            // Custom Exception
            System.out.print("Enter amount paid: ");
            double paid = Double.parseDouble(sc.nextLine());

            processPayment(totalBill, paid);

        } catch (ArithmeticException e) {

            System.out.println(
                    "Billing Error: Number of bill items cannot be zero.");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(
                    "Patient Error: Invalid patient index selected.");

        } catch (NumberFormatException e) {

            System.out.println(
                    "Input Error: Please enter valid numeric values.");

        } catch (InsufficientFundsException e) {

            System.out.println(e.getMessage());

        } catch (Exception e) {

            System.out.println(
                    "Unexpected Error: " + e.getMessage());

        } finally {

            System.out.println("Hospital billing process completed.");
            sc.close();
        }
    }
}