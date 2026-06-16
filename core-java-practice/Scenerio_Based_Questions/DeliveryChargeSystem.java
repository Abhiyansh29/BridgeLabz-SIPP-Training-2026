import java.util.Scanner;

public class DeliveryChargeSystem {

    // Method 1: Only distance
    public static double calculateCharge(int distance) {
        return distance * 5.0;
    }

    // Method 2: Distance and weight
    public static double calculateCharge(int distance, int weight) {
        return (distance * 5.0) + (weight * 10.0);
    }

    // Method 3: Distance, weight, and express delivery
    public static double calculateCharge(int distance,
                                         int weight,
                                         boolean expressDelivery) {

        double charge = (distance * 5.0) + (weight * 10.0);

        if (expressDelivery) {
            charge += 100; // Express delivery charge
        }

        return charge;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Delivery Type:");
        System.out.println("1. Distance Only");
        System.out.println("2. Distance + Weight");
        System.out.println("3. Distance + Weight + Express");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        double charge = 0;

        switch (choice) {

            case 1:
                System.out.print("Enter distance (km): ");
                int distance1 = sc.nextInt();

                charge = calculateCharge(distance1);
                break;

            case 2:
                System.out.print("Enter distance (km): ");
                int distance2 = sc.nextInt();

                System.out.print("Enter weight (kg): ");
                int weight2 = sc.nextInt();

                charge = calculateCharge(distance2, weight2);
                break;

            case 3:
                System.out.print("Enter distance (km): ");
                int distance3 = sc.nextInt();

                System.out.print("Enter weight (kg): ");
                int weight3 = sc.nextInt();

                System.out.print("Express Delivery (true/false): ");
                boolean express = sc.nextBoolean();

                charge = calculateCharge(distance3, weight3, express);
                break;

            default:
                System.out.println("Invalid Choice");
                return;
        }

        System.out.println("\nFinal Delivery Charge = ₹" + charge);

        sc.close();
    }
}