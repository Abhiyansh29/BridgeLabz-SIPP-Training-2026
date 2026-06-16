import java.util.Scanner;

public class RestaurantBillingSystem {

    // Calculate Food Cost
    public static double calculateFoodCost(double price, int quantity) {
        return price * quantity;
    }

    // Calculate GST (5%)
    public static double calculateGST(double foodCost) {
        return foodCost * 0.05;
    }

    // Calculate Discount (10% if bill > 1000)
    public static double calculateDiscount(double amount) {
        if (amount > 1000) {
            return amount * 0.10;
        }
        return 0;
    }

    // Generate Final Bill
    public static double generateFinalBill(double foodCost,
                                           double gst,
                                           double discount) {
        return foodCost + gst - discount;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter food item name: ");
        String itemName = sc.nextLine();

        System.out.print("Enter price per item: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double foodCost = calculateFoodCost(price, quantity);
        double gst = calculateGST(foodCost);
        double discount = calculateDiscount(foodCost);
        double finalBill = generateFinalBill(foodCost, gst, discount);

        System.out.println("\n===== RESTAURANT BILL =====");
        System.out.println("Item Name      : " + itemName);
        System.out.println("Price          : ₹" + price);
        System.out.println("Quantity       : " + quantity);
        System.out.println("Food Cost      : ₹" + foodCost);
        System.out.println("GST (5%)       : ₹" + gst);
        System.out.println("Discount       : ₹" + discount);
        System.out.println("---------------------------");
        System.out.println("Final Amount   : ₹" + finalBill);
    }
}